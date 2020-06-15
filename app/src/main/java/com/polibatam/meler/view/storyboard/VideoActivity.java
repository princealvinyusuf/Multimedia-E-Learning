package com.polibatam.meler.view.storyboard;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import com.polibatam.meler.R;
import com.polibatam.meler.view.MotionLibraryActivity;

public class VideoActivity extends Activity {


    /*

    For full screen video view
    *Remove extends Appcompact and use extends activity
    * Add this line in android manifest
     android:theme="@android:style/Theme.NoTitleBar.Fullscreen"

     */

    public static String EXTRA_URL = "extra_url";

    VideoView videoView;
    MediaController controller;//for control video

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        String url = getIntent().getStringExtra(EXTRA_URL);

        videoView=findViewById(R.id.videoView);

        controller=new MediaController(this);
        //set controller to videoView
        videoView.setMediaController(controller);

        //provide url of the video which have extention
        videoView.setVideoPath(url);
        // https://res.cloudinary.com/polibatam/video/upload/v1589985213/big_buck_bunny_epyyip.mp4
        // https://res.cloudinary.com/polibatam/video/upload/v1592193241/Materi_1_Nirmana_gpawtw.mp4
        videoView.start();

        int orientation = getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_PORTRAIT) {
            Toast.makeText(VideoActivity.this, "Please Rotate Your Device To Enjoy Full Video Experience", Toast.LENGTH_LONG).show();
        } else {
            // In Landdscape
        }


    }
}
