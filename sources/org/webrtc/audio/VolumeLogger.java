package org.webrtc.audio;

import android.media.AudioManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Timer;
import java.util.TimerTask;
import org.webrtc.Logging;
import tb.f7l;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class VolumeLogger {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "VolumeLogger";
    private static final String THREAD_NAME = "WebRtcVolumeLevelLoggerThread";
    private static final int TIMER_PERIOD_IN_SECONDS = 30;
    private final AudioManager audioManager;
    private Timer timer;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class LogVolumeTask extends TimerTask {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final int maxRingVolume;
        private final int maxVoiceCallVolume;

        static {
            t2o.a(395313870);
        }

        public LogVolumeTask(int i, int i2) {
            this.maxRingVolume = i;
            this.maxVoiceCallVolume = i2;
        }

        public static /* synthetic */ Object ipc$super(LogVolumeTask logVolumeTask, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in org/webrtc/audio/VolumeLogger$LogVolumeTask");
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int mode = VolumeLogger.access$000(VolumeLogger.this).getMode();
            if (mode == 1) {
                Logging.d(VolumeLogger.TAG, "STREAM_RING stream volume: " + VolumeLogger.access$000(VolumeLogger.this).getStreamVolume(2) + " (max=" + this.maxRingVolume + f7l.BRACKET_END_STR);
            } else if (mode == 3) {
                Logging.d(VolumeLogger.TAG, "VOICE_CALL stream volume: " + VolumeLogger.access$000(VolumeLogger.this).getStreamVolume(0) + " (max=" + this.maxVoiceCallVolume + f7l.BRACKET_END_STR);
            }
        }
    }

    static {
        t2o.a(395313869);
    }

    public VolumeLogger(AudioManager audioManager) {
        this.audioManager = audioManager;
    }

    public static /* synthetic */ AudioManager access$000(VolumeLogger volumeLogger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AudioManager) ipChange.ipc$dispatch("b774b6b3", new Object[]{volumeLogger});
        }
        return volumeLogger.audioManager;
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        Logging.d(TAG, "start" + WebRtcAudioUtils.getThreadInfo());
        if (this.timer == null) {
            Logging.d(TAG, "audio mode is: " + WebRtcAudioUtils.modeToString(this.audioManager.getMode()));
            Timer timer = new Timer(THREAD_NAME);
            this.timer = timer;
            timer.schedule(new LogVolumeTask(this.audioManager.getStreamMaxVolume(2), this.audioManager.getStreamMaxVolume(0)), 0L, 30000L);
        }
    }

    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        Logging.d(TAG, "stop" + WebRtcAudioUtils.getThreadInfo());
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
            this.timer = null;
        }
    }
}
