package com.imageupload.awsimageupload.datastore;

import com.imageupload.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("d6af1f7b-4ae8-4357-97a6-9eab40a5c021"), "leandroCantero", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("30a75d7b-9bd9-44fb-aa2f-8daa869bce06"), "federicoCantero", null));
    }

    public List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }
}
