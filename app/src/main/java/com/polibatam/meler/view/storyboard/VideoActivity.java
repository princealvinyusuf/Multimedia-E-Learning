package com.polibatam.meler.view.storyboard;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.polibatam.meler.R;

public class VideoActivity extends Activity {


    /*

    For full screen video view
    *Remove extends Appcompact and use extends activity
    * Add this line in android manifest
     android:theme="@android:style/Theme.NoTitleBar.Fullscreen"

     */

    VideoView videoView;
    MediaController controller;//for control video

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        videoView=findViewById(R.id.videoView);

        controller=new MediaController(this);
        //set controller to videoView
        videoView.setMediaController(controller);

        //provide url of the video which have extention
        videoView.setVideoPath("https://res.cloudinary.com/polibatam/video/upload/v1589985213/big_buck_bunny_epyyip.mp4");
        videoView.start();


    }
}
