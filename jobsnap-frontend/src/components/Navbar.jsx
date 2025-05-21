import React from "react";
import JobSnapLogo from "../images/JobSnap_logo.png"; // adjust the path if needed

const Navbar = () => {
  const scrollToSection = (id) => {
    const section = document.getElementById(id);
    if (section) {
      section.scrollIntoView({ behavior: "smooth" });
    }
  };

  return (
    <nav className="fixed top-0 left-0 right-0 bg-white shadow-md z-50 px-6 py-4 flex items-center justify-between">
      {/* Logo */}
      <div
        className="flex items-center space-x-2 cursor-pointer"
        onClick={() => scrollToSection("home")}
      >
        <img src={JobSnapLogo} alt="JobSnap Logo" className="h-14 w-auto" />
      </div>

      {/* Navigation Buttons */}
      <div className="flex space-x-8">
        <button
          onClick={() => scrollToSection("home")}
          className="font-semibold hover:text-blue-600"
        >
          Home
        </button>
        <button
          onClick={() => scrollToSection("what-it-does")}
          className="font-semibold hover:text-blue-600"
        >
          What It Does
        </button>
        <button
          onClick={() => scrollToSection("register")}
          className="font-semibold hover:text-blue-600"
        >
          Register
        </button>
        <button
          onClick={() => scrollToSection("contact")}
          className="font-semibold hover:text-blue-600"
        >
          Contact
        </button>
      </div>
    </nav>
  );
};

export default Navbar;
