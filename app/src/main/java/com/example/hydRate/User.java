package com.example.hydRate;

import com.google.firebase.auth.FirebaseUser;

public class User {
    private FirebaseUser firebaseUser;

    public FirebaseUser getFirebaseUser() {
        return firebaseUser;
    }

    public void setFirebaseUser(FirebaseUser firebaseUser) {
        this.firebaseUser = firebaseUser;
    }
}
