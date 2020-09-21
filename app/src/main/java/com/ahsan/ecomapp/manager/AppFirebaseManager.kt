package com.ahsan.ecomapp.manager

import android.app.Activity
import com.google.firebase.FirebaseException
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.PhoneAuthCredential
import com.google.firebase.auth.PhoneAuthProvider
import java.util.concurrent.TimeUnit

object AppFirebaseManager {

    init {
        FirebaseAuth.getInstance().setLanguageCode("en")
    }

    fun verifyPhoneNumber(activity: Activity, phoneNumber: String){
       PhoneAuthProvider.getInstance().verifyPhoneNumber(
           phoneNumber,
           300,
           TimeUnit.SECONDS,
           activity,
           object : PhoneAuthProvider.OnVerificationStateChangedCallbacks(){
               override fun onVerificationCompleted(credential: PhoneAuthCredential) {

               }

               override fun onVerificationFailed(e: FirebaseException) {

               }

               override fun onCodeSent(verificationId: String,
                                       token: PhoneAuthProvider.ForceResendingToken) {

               }

           }
       )
    }



}