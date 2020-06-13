package com.polibatam.meler.view.intro;

import android.os.Bundle;

import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;
import com.polibatam.meler.R;

public class SplashIntroActivity extends IntroActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setButtonBackVisible(false);
        setButtonNextVisible(false);
        setButtonCtaVisible(true);
        setButtonCtaTintMode(BUTTON_CTA_TINT_MODE_TEXT);

        addSlide(new SimpleSlide.Builder()
                .title("Get Your Course in Anytime")
                .description("Your Material Always with You")
                .image(R.drawable.intro1)
                .background(R.color.colorBlue2)
                .backgroundDark(R.color.colorBlue2)
                .build());

        addSlide(new SimpleSlide.Builder()
                .title("Easy to Use")
                .description("Begin Your Journey")
                .image(R.drawable.intro2)
                .background(R.color.colorBlue2)
                .backgroundDark(R.color.colorBlue2)
                .build());

        addSlide(new SimpleSlide.Builder()
                .title("Take your time")
                .description("Achieve For The Goals Beyond Horizon")
                .image(R.drawable.intro3)
                .background(R.color.colorBlue2)
                .backgroundDark(R.color.colorBlue2)
                .build());
    }

}
