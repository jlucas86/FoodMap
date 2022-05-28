package com.example.FoodMap.security;

public enum ApplicationUserPermission {
    POST_READ("post:read"),
    POST_WRITE("post:write"),
    RATING_READ("rating:read"),
    RATING_WRITE("rating:write"),
    REVIEW_READ("review:read"),
    REVIEW_WRITE("review:write");


    //POST_READ, POST_WRITE, RATING_READ, RATING_WRITE, REVIEW_READ, REVIEW_WRITE

    private final String permission;

    ApplicationUserPermission(String permission){
        this.permission = permission;
    }

    
    public String getPermission(){
        return permission;
    }
}
