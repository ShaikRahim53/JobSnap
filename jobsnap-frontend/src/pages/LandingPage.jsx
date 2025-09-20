// src/pages/LandingPage.jsx
import React from "react";
import HomePage from "./HomePage";
import WhatItDoes from "./WhatItDoes";
import RegisterPage from "./SignUp";
import ContactPage from "./ContactPage";

const LandingPage = () => {
  return (
    <div>
      <section id="home">
        <HomePage />
      </section>
      <section id="what-it-does">
        <WhatItDoes />
      </section>
      <section id="register">
        <RegisterPage />
      </section>
      <section id="contact">
        <ContactPage />
      </section>
    </div>
  );
};

export default LandingPage;
