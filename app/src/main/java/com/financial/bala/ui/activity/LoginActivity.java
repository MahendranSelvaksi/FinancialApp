package com.financial.bala.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.financial.bala.R;
import com.financial.bala.utility.BaseActivity;
import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends BaseActivity implements View.OnClickListener {

    TextInputEditText edt_phone_number;
    TextInputEditText edt_password;

    TextView txt_signup;

    Button btn_login;

    CheckBox checkbox_remember;

    //  LoginViewModel loginViewModel;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //  loginViewModel = new ViewModelProvider(LoginActivity.this).get(LoginViewModel.class);

        edt_phone_number = findViewById(R.id.edt_phone_number);
        edt_password = findViewById(R.id.edt_password);
        checkbox_remember = findViewById(R.id.checkbox_remember);
        txt_signup = findViewById(R.id.txt_signup);

        btn_login = findViewById(R.id.btn_login);

        btn_login.setOnClickListener(this);
        txt_signup.setOnClickListener(this);

        /*if (SharedPreferenceUtils.getUserId(LoginActivity.this) != null) {

            if ((!SharedPreferenceUtils.getUserId(LoginActivity.this).equals(""))
                    && SharedPreferenceUtils.getLogInValue(LoginActivity.this) == 1) {

                startActivity(new Intent(LoginActivity.this, MainActivity.class));
                finish();
            }
        }

        if (SharedPreferenceUtils.getRemember(LoginActivity.this) == 1) {

            edt_phone_number.setText(SharedPreferenceUtils.getUserName(LoginActivity.this));
            edt_password.setText(SharedPreferenceUtils.getPassword(LoginActivity.this));
            checkbox_remember.setChecked(true);
        }

        if (getIntent().getStringExtra(Constants.USER_NAME) != null) {
            edt_phone_number.setText(getIntent().getStringExtra(Constants.USER_NAME));
        }

        if (getIntent().getStringExtra(Constants.PASSWORD) != null) {
            edt_password.setText(getIntent().getStringExtra(Constants.PASSWORD));
        }*/

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.btn_login) {
//            parseLogin();
            LoginActivity.this.startActivity(new Intent(LoginActivity.this, MainActivity.class));
            LoginActivity.this.finish();

        } else if (id == R.id.txt_signup) {
            //  startActivity(new Intent(LoginActivity.this, SignUpActivity.class));
        }
    }

    /*private void parseLogin() {

        if (Objects.requireNonNull(edt_phone_number.getText()).toString().equals("")) {
            edt_phone_number.setError("Please enter the phone number");
            edt_phone_number.requestFocus();
        } else if (Objects.requireNonNull(edt_password.getText()).toString().equals("")) {
            edt_password.setError("Please enter the password");
            edt_password.requestFocus();
        } else {

            ProgressDialog dialog = new ProgressDialog(this);
            dialog.setMessage("Logging in...");
            dialog.show();

            ProfileModel profileModel = new ProfileModel();
            profileModel.setUser_name(edt_phone_number.getText().toString());
            profileModel.setPassword(edt_password.getText().toString());

            loginViewModel.getLoginResponse(profileModel).observe(LoginActivity.this,
                    new Observer<LoginResponseModel>() {
                        @Override
                        public void onChanged(LoginResponseModel loginResponse) {

                            if (dialog.isShowing()) {
                                dialog.dismiss();
                            }

                            if (loginResponse.getResult().equals(Constants.SUCCESS)) {

                                SharedPreferenceUtils.setUserDetails(LoginActivity.this,
                                        edt_phone_number.getText().toString(),
                                        edt_password.getText().toString(), loginResponse.getProfileModel().getId(),
                                        loginResponse.getProfileModel().getUser_id());

                                SharedPreferenceUtils.setLogInValue(LoginActivity.this,
                                        1);

                                if (checkbox_remember.isChecked()) {

                                    SharedPreferenceUtils.setRemember(LoginActivity.this.getApplicationContext(), 1);
                                } else {
                                    SharedPreferenceUtils.setRemember(LoginActivity.this.getApplicationContext(), 0);
                                }

                                Utils.updateToken(SharedPreferenceUtils.getToken(LoginActivity.this), LoginActivity.this);

                                LoginActivity.this.startActivity(new Intent(LoginActivity.this, MainActivity.class));
                                LoginActivity.this.finish();

                            } else {
                                Utils.showToast(LoginActivity.this, loginResponse.getMessage());
                            }
                        }
                    });
        }
    }*/
}