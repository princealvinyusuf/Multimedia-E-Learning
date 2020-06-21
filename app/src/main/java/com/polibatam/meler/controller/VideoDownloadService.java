package com.polibatam.meler.controller;

import android.app.Notification;
import androidx.annotation.Nullable;

import com.google.android.exoplayer2.offline.DownloadManager;
import com.google.android.exoplayer2.offline.DownloadService;
import com.google.android.exoplayer2.scheduler.Scheduler;
import com.google.android.exoplayer2.ui.DownloadNotificationUtil;
import com.polibatam.meler.R;

import static com.polibatam.meler.controller.Constants.NOTIFICATION_CHANNEL_ID;
import static com.polibatam.meler.controller.Constants.NOTIFICATION_ID;

public class VideoDownloadService extends DownloadService {

    public VideoDownloadService(){
        super(NOTIFICATION_ID, DEFAULT_FOREGROUND_NOTIFICATION_UPDATE_INTERVAL, NOTIFICATION_CHANNEL_ID, R.string.download_channel_name);
    }

    @Override
    protected DownloadManager getDownloadManager() {
        return DownloadUtil.getDownloadManager(this);
    }

    @Nullable
    @Override
    protected Scheduler getScheduler() {
        return null;
    }

    @Override
    protected Notification getForegroundNotification(DownloadManager.TaskState[] taskStates) {
        return DownloadNotificationUtil.buildProgressNotification(this, R.drawable.exo_icon_play, NOTIFICATION_CHANNEL_ID, null, null, taskStates);
    }
}
