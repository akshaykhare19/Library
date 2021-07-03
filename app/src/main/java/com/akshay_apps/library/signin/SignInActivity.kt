package com.akshay_apps.library.signin

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.akshay_apps.library.R
import com.akshay_apps.library.databinding.ActivitySignInBinding
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.GoogleAuthProvider
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class SignInActivity : AppCompatActivity() {

//    private val RC_SIGN_IN: Int = 123

    //Used for binding the views
//    private lateinit var binding: ActivitySignInBinding
//    private val TAG = "SignInActivity Tag"
//    private lateinit var googleSignInClient: GoogleSignInClient
//    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding = ActivitySignInBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        // Configure Google Sign In
//        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
//            .requestIdToken(getString(R.string.default_web_client_id))
//            .requestEmail()
//            .build()
//        googleSignInClient = GoogleSignIn.getClient(this, gso)
//
//        binding.signInButton.setOnClickListener {
//            signIn()
//        }
    }
//
//    private fun signIn() {
//        val signInIntent = googleSignInClient.signInIntent
//        startActivityForResult(signInIntent, RC_SIGN_IN)
//    }

//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//
//        // Result returned from launching the Intent from GoogleSignInApi.getSignInIntent(...);
//        if (requestCode == RC_SIGN_IN) {
//            val task = GoogleSignIn.getSignedInAccountFromIntent(data)
//            handleSignInResult(task)
//
//        }
//    }
//
//    private fun handleSignInResult(completedTask: Task<GoogleSignInAccount>) {
//    try {
//            val account =
//                completedTask.getResult(ApiException::class.java)!!
//            Log.d(TAG, "firebaseAuthwithgoogle:" + account.id)
//            firebaseAuthWithGoogle(account.idToken!!)
//        } catch (e: ApiException) {
//            Log.w(TAG, "signInResult:failed code=" + e.statusCode)
//        }
//    }
//
//    private fun firebaseAuthWithGoogle(idToken: String) {
//        val credential = GoogleAuthProvider.getCredential(idToken, null)
//
//        GlobalScope.launch(Dispatchers.IO) {
//            val auth = auth.signInWithCredential(credential).await()
//            val firebaseUser = auth.user
//            withContext(Dispatchers.Main) {
//                updatedUI(firebaseUser)
//            }
//        }

//    }

//    private fun updatedUI(firebaseUser: FirebaseUser?) {
//
//    }
}