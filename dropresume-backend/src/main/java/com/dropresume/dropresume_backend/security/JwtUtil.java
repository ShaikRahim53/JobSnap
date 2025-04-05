package com.dropresume.dropresume_backend.security;

import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtil {
    private static final String SECRET_KEY = "PPg8fQrDcBkPcHIxa9cANOCrMfRms78E9ROaTiPRigs="; // Base64-encoded key
    private static final long EXPIRATION_TIME = 86400000; // 1 day in milliseconds

    private SecretKey getSigningKey() {
        byte[] keyBytes = Decoders.BASE64.decode(SECRET_KEY);
        return Keys.hmacShaKeyFor(keyBytes);
    }

    public String generateToken(String username) {
        return Jwts.builder()
                .subject(username)
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(getSigningKey(), Jwts.SIG.HS256) // ✅ FIX: Use Jwts.SIG.HS256
                .compact();
    }

    public String extractUsername(String token) {
        return extractClaims(token).getSubject();
    }

    public boolean validateToken(String token, String username) {
        return username.equals(extractUsername(token)) && !isTokenExpired(token);
    }

    private boolean isTokenExpired(String token) {
        return extractClaims(token).getExpiration().before(new Date());
    }

    private Claims extractClaims(String token) {
        return Jwts.parser()
                .verifyWith(getSigningKey()) // ✅ FIX: Uses correct SecretKey
                .build()
                .parseSignedClaims(token)
                .getPayload();
    }
}
