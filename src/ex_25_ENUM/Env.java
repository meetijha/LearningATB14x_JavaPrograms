package ex_25_ENUM;

// All environment variables of LAB200_Congrats are present here
 enum Env {
    DEV("https://dev.myapp.com"),
    STAGING("https://staging.myapp.com"),
    PROD("https://myapp.com");

    private final String baseURL;

    Env(String baseURL) {
        this.baseURL=baseURL;
    }

    public String getBaseURL(){
        return this.baseURL;
    }
}
