package com.google.firebase.quickstart.database;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.facebook.CallbackManager;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.quickstart.database.models.User;

public class SelectSignInActivity extends BaseActivity implements View.OnClickListener {

    private static final String TAG = "SignInActivity";

    private DatabaseReference mDatabase;
    private FirebaseAuth mAuth;

    private EditText mEmailField;
    private EditText mPasswordField;
    private Button btn_crase;
    private Button btn_db,admob;


    private CallbackManager mFacebookCallbackManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        mDatabase = FirebaseDatabase.getInstance().getReference();
        mAuth = FirebaseAuth.getInstance();


        btn_crase = (Button) findViewById(R.id.btn_crase);
        btn_db = (Button) findViewById(R.id.btn_db);
        admob = (Button) findViewById(R.id.admob);

        // Click listeners
        btn_crase.setOnClickListener(this);
        btn_db.setOnClickListener(this);
        admob.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.btn_crase) {
            startActivity(new Intent(SelectSignInActivity.this, MainActivityCrash.class));
            finish();
        } else if (i == R.id.btn_db) {
            startActivity(new Intent(SelectSignInActivity.this, SingInActivity.class));
            finish();
        }else if(i == R.id.admob){
            startActivity(new Intent(SelectSignInActivity.this, NativeExpressActivity.class));
            finish();
        }
    }
}
