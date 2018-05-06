package app.outlay.view.activity;

import android.os.Bundle;

import app.outlay.view.activity.base.ParentActivity;
import app.outlay.view.fragment.LoginFragment;

public class LoginActivity extends ParentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(app.outlay.R.layout.activity_single_fragment);
        this.initializeActivity();
    }

    private void initializeActivity() {
        LoginFragment loginFragment = new LoginFragment();
        loginFragment.setArguments(getIntent().getExtras());
        addFragment(app.outlay.R.id.fragment, loginFragment);
    }
}
