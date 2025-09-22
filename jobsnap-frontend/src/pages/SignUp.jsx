import "../styles/signup.css";
const SignUP = () => {
  return (
    <>
      <div id="main-container">
        <img
          id="jobsnap-logo"
          src="/images/JobSnap_logo.png"
          alt="JobSnap logo"
        ></img>
        <div className="signup-container">
          <div>
            <h1>Sign Up</h1>
            <h2 className="fira-sans-condensed-regular">
              Track your every job
            </h2>
          </div>
          <div className="kantumruy-pro-semibold" id="continue">
            <img src="/images/email.png"></img>
            <p>Continue with Email</p>
          </div>
          <div className="kantumruy-pro-semibold" id="continue">
            <img src="/images/google.png"></img>
            <p>Continue with Google</p>
          </div>
          <div className="kantumruy-pro-semibold" id="continue">
            <img src="/images/facebook.png"></img>
            <p>Continue with Facebook</p>
          </div>
          <div className="host-grotesk-regular">
            <p>
              Already have an account?
              <a id="login" href="">
                Log in
              </a>
              <p>
                <snap>By continuing, you agree to JobSnap's</snap>
                <a href="">Terms of Service</a> <snap>and</snap>
                <a href=""> Privacy Policy</a>
              </p>
            </p>
          </div>
        </div>
      </div>
    </>
  );
};
export default SignUP;
