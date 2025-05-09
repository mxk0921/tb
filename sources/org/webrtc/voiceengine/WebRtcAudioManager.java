package org.webrtc.voiceengine;

import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.os.Build;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.taobao.artc.utils.ArtcDeviceInfo;
import java.util.Timer;
import java.util.TimerTask;
import org.webrtc.ContextUtils;
import org.webrtc.Logging;
import tb.f7l;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class WebRtcAudioManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int BITS_PER_SAMPLE = 16;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_FRAME_PER_BUFFER = 256;
    private static final String TAG = "WebRtcAudioManager";
    private static final boolean blacklistDeviceForAAudioUsage = true;
    private boolean aAudio;
    private final AudioManager audioManager;
    private boolean hardwareAEC;
    private boolean hardwareAGC;
    private boolean hardwareNS;
    private boolean initialized = false;
    private int inputBufferSize;
    private int inputChannels;
    private boolean lowLatencyInput;
    private boolean lowLatencyOutput;
    private final long nativeAudioManager;
    private int nativeChannels;
    private int nativeSampleRate;
    private int outputBufferSize;
    private int outputChannels;
    private boolean proAudio;
    private int sampleRate;
    private final VolumeLogger volumeLogger;
    private static boolean useStereoOutput = true;
    private static boolean useStereoInput = false;
    private static boolean blacklistDeviceForOpenSLESUsage = false;
    private static boolean blacklistDeviceForOpenSLESUsageIsOverridden = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class VolumeLogger {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
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
                t2o.a(395313883);
            }

            public LogVolumeTask(int i, int i2) {
                this.maxRingVolume = i;
                this.maxVoiceCallVolume = i2;
            }

            public static /* synthetic */ Object ipc$super(LogVolumeTask logVolumeTask, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in org/webrtc/voiceengine/WebRtcAudioManager$VolumeLogger$LogVolumeTask");
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
                    Logging.d(WebRtcAudioManager.TAG, "STREAM_RING stream volume: " + VolumeLogger.access$000(VolumeLogger.this).getStreamVolume(2) + " (max=" + this.maxRingVolume + f7l.BRACKET_END_STR);
                } else if (mode == 3) {
                    Logging.d(WebRtcAudioManager.TAG, "VOICE_CALL stream volume: " + VolumeLogger.access$000(VolumeLogger.this).getStreamVolume(0) + " (max=" + this.maxVoiceCallVolume + f7l.BRACKET_END_STR);
                }
            }
        }

        static {
            t2o.a(395313882);
        }

        public VolumeLogger(AudioManager audioManager) {
            this.audioManager = audioManager;
        }

        public static /* synthetic */ AudioManager access$000(VolumeLogger volumeLogger) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AudioManager) ipChange.ipc$dispatch("b7b1235", new Object[]{volumeLogger});
            }
            return volumeLogger.audioManager;
        }

        public static /* synthetic */ void access$100(VolumeLogger volumeLogger) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("13a6510f", new Object[]{volumeLogger});
            } else {
                volumeLogger.stop();
            }
        }

        private void stop() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6623bb89", new Object[]{this});
                return;
            }
            Timer timer = this.timer;
            if (timer != null) {
                timer.cancel();
                this.timer = null;
            }
        }

        public void start() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("810347e9", new Object[]{this});
                return;
            }
            Timer timer = new Timer(THREAD_NAME);
            this.timer = timer;
            timer.schedule(new LogVolumeTask(this.audioManager.getStreamMaxVolume(2), this.audioManager.getStreamMaxVolume(0)), 0L, 30000L);
        }
    }

    static {
        t2o.a(395313881);
    }

    public WebRtcAudioManager(long j) {
        Logging.d(TAG, "ctor" + WebRtcAudioUtils.getThreadInfo());
        this.nativeAudioManager = j;
        AudioManager audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio");
        this.audioManager = audioManager;
        if (!ArtcDeviceInfo.is_tmall_cc()) {
            this.volumeLogger = new VolumeLogger(audioManager);
        } else {
            this.volumeLogger = null;
        }
        storeAudioParameters();
        nativeCacheAudioParameters(this.sampleRate, this.outputChannels, this.inputChannels, this.hardwareAEC, this.hardwareAGC, this.hardwareNS, this.lowLatencyOutput, this.lowLatencyInput, this.proAudio, this.aAudio, this.outputBufferSize, this.inputBufferSize, j);
        WebRtcAudioUtils.logAudioState(TAG);
    }

    private static void assertTrue(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74be8db9", new Object[]{new Boolean(z)});
        } else if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private void dispose() {
        VolumeLogger volumeLogger;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        Logging.d(TAG, ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX + WebRtcAudioUtils.getThreadInfo());
        if (this.initialized && (volumeLogger = this.volumeLogger) != null) {
            VolumeLogger.access$100(volumeLogger);
        }
    }

    private int getLowLatencyInputFramesPerBuffer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("caf51da7", new Object[]{this})).intValue();
        }
        assertTrue(isLowLatencyInputSupported());
        return getLowLatencyOutputFramesPerBuffer();
    }

    private int getLowLatencyOutputFramesPerBuffer() {
        String property;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d2fac0d0", new Object[]{this})).intValue();
        }
        assertTrue(isLowLatencyOutputSupported());
        if (WebRtcAudioUtils.runningOnJellyBeanMR1OrHigher() && (property = this.audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER")) != null) {
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

    private int getNativeOutputSampleRate() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2f671f32", new Object[]{this})).intValue();
        }
        if (WebRtcAudioUtils.runningOnEmulator()) {
            Logging.d(TAG, "Running emulator, overriding sample rate to 8 kHz.");
            return JosStatusCodes.RTN_CODE_COMMON_ERROR;
        } else if (WebRtcAudioUtils.isDefaultSampleRateOverridden()) {
            Logging.d(TAG, "Default sample rate is overriden to " + WebRtcAudioUtils.getDefaultSampleRateHz() + " Hz");
            return WebRtcAudioUtils.getDefaultSampleRateHz();
        } else {
            if (WebRtcAudioUtils.runningOnJellyBeanMR1OrHigher()) {
                i = getSampleRateOnJellyBeanMR10OrHigher();
            } else {
                i = WebRtcAudioUtils.getDefaultSampleRateHz();
            }
            Logging.d(TAG, "Sample rate is set to " + i + " Hz");
            return i;
        }
    }

    private int getSampleRateOnJellyBeanMR10OrHigher() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cb57eb7f", new Object[]{this})).intValue();
        }
        String property = this.audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        if (property == null) {
            return WebRtcAudioUtils.getDefaultSampleRateHz();
        }
        return Integer.parseInt(property);
    }

    public static synchronized boolean getStereoInput() {
        synchronized (WebRtcAudioManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a86fb807", new Object[0])).booleanValue();
            }
            return useStereoInput;
        }
    }

    public static synchronized boolean getStereoOutput() {
        synchronized (WebRtcAudioManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c9b67a9a", new Object[0])).booleanValue();
            }
            return useStereoOutput;
        }
    }

    private boolean hasEarpiece() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87fc119d", new Object[]{this})).booleanValue();
        }
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    private boolean init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fede19b", new Object[]{this})).booleanValue();
        }
        Logging.d(TAG, "init" + WebRtcAudioUtils.getThreadInfo());
        if (this.initialized) {
            return true;
        }
        Logging.d(TAG, "audio mode is: " + WebRtcAudioUtils.modeToString(this.audioManager.getMode()));
        this.initialized = true;
        VolumeLogger volumeLogger = this.volumeLogger;
        if (volumeLogger != null) {
            volumeLogger.start();
        }
        return true;
    }

    private boolean isAAudioSupported() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3193deba", new Object[]{this})).booleanValue();
        }
        Logging.w(TAG, "AAudio support is currently disabled on all devices!");
        return false;
    }

    private static boolean isAcousticEchoCancelerSupported() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a309f820", new Object[0])).booleanValue();
        }
        return WebRtcAudioEffects.canUseAcousticEchoCanceler();
    }

    private boolean isCommunicationModeEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9735413d", new Object[]{this})).booleanValue();
        }
        if (this.audioManager.getMode() == 3) {
            return true;
        }
        return false;
    }

    private boolean isDeviceBlacklistedForOpenSLESUsage() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12d77d2e", new Object[]{this})).booleanValue();
        }
        if (blacklistDeviceForOpenSLESUsageIsOverridden) {
            z = blacklistDeviceForOpenSLESUsage;
        } else {
            z = WebRtcAudioUtils.deviceIsBlacklistedForOpenSLESUsage();
        }
        if (z) {
            Logging.d(TAG, Build.MODEL + " is blacklisted for OpenSL ES usage!");
        }
        return z;
    }

    private boolean isLowLatencyOutputSupported() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d292a44", new Object[]{this})).booleanValue();
        }
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    }

    private static boolean isNoiseSuppressorSupported() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55264791", new Object[0])).booleanValue();
        }
        return WebRtcAudioEffects.canUseNoiseSuppressor();
    }

    private boolean isProAudioSupported() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e00a5086", new Object[]{this})).booleanValue();
        }
        if (!WebRtcAudioUtils.runningOnMarshmallowOrHigher() || !ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.audio.pro")) {
            return false;
        }
        return true;
    }

    private native void nativeCacheAudioParameters(int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i4, int i5, long j);

    public static synchronized void setBlacklistDeviceForOpenSLESUsage(boolean z) {
        synchronized (WebRtcAudioManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f119f335", new Object[]{new Boolean(z)});
                return;
            }
            blacklistDeviceForOpenSLESUsageIsOverridden = true;
            blacklistDeviceForOpenSLESUsage = z;
        }
    }

    private void setMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e06b0557", new Object[]{this, new Integer(i)});
            return;
        }
        Logging.d(TAG, "artc_audioManager.setMode = " + i);
        this.audioManager.setMode(i);
    }

    public static synchronized void setStereoInput(boolean z) {
        synchronized (WebRtcAudioManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("984903d", new Object[]{new Boolean(z)});
                return;
            }
            Logging.w(TAG, "Overriding default input behavior: setStereoInput(" + z + ')');
            useStereoInput = z;
        }
    }

    public static synchronized void setStereoOutput(boolean z) {
        synchronized (WebRtcAudioManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48af9772", new Object[]{new Boolean(z)});
                return;
            }
            Logging.w(TAG, "setStereoOutput: " + z);
            useStereoOutput = z;
        }
    }

    private void storeAudioParameters() {
        int i;
        int i2;
        int i3;
        int i4 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b2d7446", new Object[]{this});
            return;
        }
        if (getStereoOutput()) {
            i = 2;
        } else {
            i = 1;
        }
        this.outputChannels = i;
        if (getStereoInput()) {
            i4 = 2;
        }
        this.inputChannels = i4;
        this.sampleRate = getNativeOutputSampleRate();
        this.hardwareAEC = isAcousticEchoCancelerSupported();
        this.hardwareAGC = false;
        this.hardwareNS = isNoiseSuppressorSupported();
        this.lowLatencyOutput = isLowLatencyOutputSupported();
        this.lowLatencyInput = isLowLatencyInputSupported();
        this.proAudio = isProAudioSupported();
        this.aAudio = isAAudioSupported();
        if (this.lowLatencyOutput) {
            i2 = getLowLatencyOutputFramesPerBuffer();
        } else {
            i2 = getMinOutputFrameSize(this.sampleRate, this.outputChannels);
        }
        this.outputBufferSize = i2;
        if (this.lowLatencyInput) {
            i3 = getLowLatencyInputFramesPerBuffer();
        } else {
            i3 = getMinInputFrameSize(this.sampleRate, this.inputChannels);
        }
        this.inputBufferSize = i3;
    }

    public boolean isLowLatencyInputSupported() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c312983", new Object[]{this})).booleanValue();
        }
        if (!WebRtcAudioUtils.runningOnLollipopOrHigher() || !isLowLatencyOutputSupported()) {
            return false;
        }
        return true;
    }
}
