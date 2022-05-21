package com.example.FoodMap.security;

import java.util.Set;

import static com.example.FoodMap.security.ApplicationUserPermission.*;

import com.google.common.collect.Sets;

public enum ApplicationUserRole {
    REVIEWER(Sets.newHashSet(POST_READ, POST_WRITE, RATING_READ, RATING_WRITE, REVIEW_READ, REVIEW_WRITE)),
    INFLUENCER(Sets.newHashSet(POST_READ, POST_WRITE, RATING_READ, RATING_WRITE, REVIEW_READ, REVIEW_WRITE)),
    RESTAURANT(Sets.newHashSet(POST_READ, POST_WRITE, RATING_READ,  REVIEW_READ)),
    MODERATOR(Sets.newHashSet(POST_READ, POST_WRITE, RATING_READ, RATING_WRITE, REVIEW_READ, REVIEW_WRITE)),
    ADMIN(Sets.newHashSet(POST_READ, POST_WRITE, RATING_READ, RATING_WRITE, REVIEW_READ, REVIEW_WRITE));

    private final Set<ApplicationUserPermission> permissions;

    ApplicationUserRole(Set<ApplicationUserPermission> permissions ){
        this.permissions = permissions;
    }

    public Set<ApplicationUserPermission> getPermissions(){
        return permissions;
    }
}
