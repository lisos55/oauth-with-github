package com.example.oauthwithgithub.api.github;

import com.example.oauthwithgithub.api.ApiBinding;

public class Github extends ApiBinding {

    private static final String BASE_URL = "https://api.github.com";

    public Github(String accessToken) {
        super(accessToken);
    }
    public String getProfile() {
        return restTemplate.getForObject(BASE_URL + "/user", String.class);
    }
}
