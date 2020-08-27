package co.zisky.android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import co.zisky.ussd.sdk.ZiSky;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ZiSky.init(this);
	}
}
