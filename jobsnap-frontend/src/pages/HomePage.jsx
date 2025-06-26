// src/pages/HomePage.jsx
import React from "react";

const HomePage = () => {
  return (
    <div
      id="home"
      className="flex flex-col justify-center items-center min-h-screen bg-gradient-to-r from-blue-600 via-indigo-700 to-purple-700 text-white px-6"
    >
      <div className="max-w-4xl text-center">
        <h1 className="text-6xl font-extrabold mb-6 drop-shadow-lg">
          Track Smarter. Apply Better. Land Faster.
        </h1>
        <p className="text-xl md:text-2xl mb-10 max-w-3xl mx-auto drop-shadow-md">
          We help you stay on top of your job applications with intelligent
          tracking and insightful analysis. In the future, we’ll go further —
          suggesting improvements, tailoring your resume, and empowering every
          step of your career journey with AI.
        </p>
        <button className="bg-white text-blue-700 font-semibold px-8 py-3 rounded-full shadow-lg hover:bg-gray-100 transition duration-300">
          Get Started
        </button>
      </div>
    </div>
  );
};

export default HomePage;
