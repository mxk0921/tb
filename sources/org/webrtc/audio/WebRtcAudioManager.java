package org.webrtc.audio;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import org.webrtc.Logging;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class WebRtcAudioManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int DEFAULT_FRAME_PER_BUFFER = 256;
    private static final int DEFAULT_SAMPLE_RATE_HZ = 16000;
    private static final String TAG = "WebRtcAudioManagerExternal";

    static {
        t2o.a(395313872);
    }

    public static AudioManager getAudioManager(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AudioManager) ipChange.ipc$dispatch("c32b7c6f", new Object[]{context});
        }
        return (AudioManager) context.getSystemService("audio");
    }

    public static int getInputBufferSize(Context context, AudioManager audioManager, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a91523ac", new Object[]{context, audioManager, new Integer(i), new Integer(i2)})).intValue();
        }
        if (isLowLatencyInputSupported(context)) {
            return getLowLatencyFramesPerBuffer(audioManager);
        }
        return getMinInputFrameSize(i, i2);
    }

    private static int getLowLatencyFramesPerBuffer(AudioManager audioManager) {
        String property;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2452827e", new Object[]{audioManager})).intValue();
        }
        if (WebRtcAudioUtils.runningOnJellyBeanMR1OrHigher() && (property = audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER")) != null) {
            return Integer.parseInt(property);
        }
        return 256;
    }

    private static int getMinInputFrameSize(int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bdbcd3ba", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        int i4 = i2 * 2;
        if (i2 == 1) {
            i3 = 16;
        } else {
            i3 = 12;
        }
        return AudioRecord.getMinBufferSize(i, i3, 2) / i4;
    }

    private static int getMinOutputFrameSize(int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fd927aab", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        int i4 = i2 * 2;
        if (i2 == 1) {
            i3 = 4;
        } else {
            i3 = 12;
        }
        return AudioTrack.getMinBufferSize(i, i3, 2) / i4;
    }

    public static int getOutputBufferSize(Context context, AudioManager audioManager, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53e1b3a9", new Object[]{context, audioManager, new Integer(i), new Integer(i2)})).intValue();
        }
        if (isLowLatencyOutputSupported(context)) {
            return getLowLatencyFramesPerBuffer(audioManager);
        }
        return getMinOutputFrameSize(i, i2);
    }

    public static int getSampleRate(AudioManager audioManager) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5fe68587", new Object[]{audioManager})).intValue();
        }
        if (WebRtcAudioUtils.runningOnEmulator()) {
            Logging.d(TAG, "Running emulator, overriding sample rate to 8 kHz.");
            return JosStatusCodes.RTN_CODE_COMMON_ERROR;
        }
        if (WebRtcAudioUtils.runningOnJellyBeanMR1OrHigher()) {
            i = getSampleRateOnJellyBeanMR10OrHigher(audioManager);
        } else {
            i = 16000;
        }
        Logging.d(TAG, "Sample rate is set to " + i + " Hz");
        return i;
    }

    private static int getSampleRateOnJellyBeanMR10OrHigher(AudioManager audioManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("746e596c", new Object[]{audioManager})).intValue();
        }
        String property = audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        if (property == null) {
            return 16000;
        }
        return Integer.parseInt(property);
    }

    private static boolean isLowLatencyInputSupported(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18bdbf2d", new Object[]{context})).booleanValue();
        }
        if (!WebRtcAudioUtils.runningOnLollipopOrHigher() || !isLowLatencyOutputSupported(context)) {
            return false;
        }
        return true;
    }

    private static boolean isLowLatencyOutputSupported(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("139d698c", new Object[]{context})).booleanValue();
        }
        return context.getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    }
}
