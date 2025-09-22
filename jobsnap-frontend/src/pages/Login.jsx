import "../styles/login.css";
const Login = () => {
  return (
    <>
      <div id="main-container">
        <img
          id="jobsnap-logo"
          src="/images/JobSnap_logo.png"
          alt="jobsnap_logo"
        ></img>
        <div className="Login-Container">
          <div>
            <h1>Log in</h1>
            <h2 className="fira-sans-condensed-regular">
              Log into your account
            </h2>
          </div>
          <div id="input-container">
            <labe name="email">Email</labe>
            <input name="Email" placeholder="Your email"></input>
          </div>
          <div id="input-container">
            <label name="Password">Password</label>
            <input name="Password" placeholder="Your Password"></input>
          </div>
          <div>
            <p>Forgot password?</p>
          </div>
          <button>Log In</button>
          <p id="or">Or</p>
          <div className="kantumruy-pro-semibold" id="continue">
            <img src="/images/Google.png" alt="google_logo"></img>
            <p>Continue with Google</p>
          </div>
          <div className="kantumruy-pro-semibold" id="continue">
            <img src="/images/Facebook.png" alt="facebook_logo"></img>
            <p>Continue with Facebook</p>
          </div>
          <div className="host-grotesk-regular">
            <p>
              Don't have an account?
              <a id="sign-up" href="">
                {" "}
                Sign up
              </a>
            </p>
          </div>
        </div>
      </div>
    </>
  );
};

export default Login;
