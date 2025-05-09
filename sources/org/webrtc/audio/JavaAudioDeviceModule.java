package org.webrtc.audio;

import android.content.Context;
import android.media.AudioManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.webrtc.JniCommon;
import org.webrtc.Logging;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class JavaAudioDeviceModule implements AudioDeviceModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "JavaAudioDeviceModule";
    private final WebRtcAudioRecord audioInput;
    private final AudioManager audioManager;
    private final WebRtcAudioTrack audioOutput;
    private final Context context;
    private long nativeAudioDeviceModule;
    private final Object nativeLock;
    private final int sampleRate;
    private final boolean useStereoInput;
    private final boolean useStereoOutput;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface AudioRecordErrorCallback {
        void onWebRtcAudioRecordError(String str);

        void onWebRtcAudioRecordInitError(String str);

        void onWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public enum AudioRecordStartErrorCode {
        AUDIO_RECORD_START_EXCEPTION,
        AUDIO_RECORD_START_STATE_MISMATCH;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AudioRecordStartErrorCode audioRecordStartErrorCode, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in org/webrtc/audio/JavaAudioDeviceModule$AudioRecordStartErrorCode");
        }

        public static AudioRecordStartErrorCode valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AudioRecordStartErrorCode) ipChange.ipc$dispatch("9ccde170", new Object[]{str});
            }
            return (AudioRecordStartErrorCode) Enum.valueOf(AudioRecordStartErrorCode.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class AudioSamples {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final int audioFormat;
        private final int channelCount;
        private final byte[] data;
        private final int sampleRate;

        static {
            t2o.a(395313864);
        }

        public AudioSamples(int i, int i2, int i3, byte[] bArr) {
            this.audioFormat = i;
            this.channelCount = i2;
            this.sampleRate = i3;
            this.data = bArr;
        }

        public int getAudioFormat() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("97239f31", new Object[]{this})).intValue();
            }
            return this.audioFormat;
        }

        public int getChannelCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5937b3bc", new Object[]{this})).intValue();
            }
            return this.channelCount;
        }

        public byte[] getData() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("e6eec916", new Object[]{this});
            }
            return this.data;
        }

        public int getSampleRate() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("da7fbe1a", new Object[]{this})).intValue();
            }
            return this.sampleRate;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface AudioTrackErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public enum AudioTrackStartErrorCode {
        AUDIO_TRACK_START_EXCEPTION,
        AUDIO_TRACK_START_STATE_MISMATCH;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AudioTrackStartErrorCode audioTrackStartErrorCode, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in org/webrtc/audio/JavaAudioDeviceModule$AudioTrackStartErrorCode");
        }

        public static AudioTrackStartErrorCode valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AudioTrackStartErrorCode) ipChange.ipc$dispatch("622ffba4", new Object[]{str});
            }
            return (AudioTrackStartErrorCode) Enum.valueOf(AudioTrackStartErrorCode.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final AudioManager audioManager;
        private AudioRecordErrorCallback audioRecordErrorCallback;
        private int audioSource;
        private AudioTrackErrorCallback audioTrackErrorCallback;
        private final Context context;
        private int sampleRate;
        private SamplesReadyCallback samplesReadyCallback;
        private boolean useHardwareAcousticEchoCanceler;
        private boolean useHardwareNoiseSuppressor;
        private boolean useStereoInput;
        private boolean useStereoOutput;

        static {
            t2o.a(395313867);
        }

        public AudioDeviceModule createAudioDeviceModule() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AudioDeviceModule) ipChange.ipc$dispatch("9a773a1a", new Object[]{this});
            }
            Logging.d(JavaAudioDeviceModule.TAG, "createAudioDeviceModule");
            if (this.useHardwareNoiseSuppressor) {
                Logging.d(JavaAudioDeviceModule.TAG, "HW NS will be used.");
            } else {
                if (JavaAudioDeviceModule.isBuiltInNoiseSuppressorSupported()) {
                    Logging.d(JavaAudioDeviceModule.TAG, "Overriding default behavior; now using WebRTC NS!");
                }
                Logging.d(JavaAudioDeviceModule.TAG, "HW NS will not be used.");
            }
            if (this.useHardwareAcousticEchoCanceler) {
                Logging.d(JavaAudioDeviceModule.TAG, "HW AEC will be used.");
            } else {
                if (JavaAudioDeviceModule.isBuiltInAcousticEchoCancelerSupported()) {
                    Logging.d(JavaAudioDeviceModule.TAG, "Overriding default behavior; now using WebRTC AEC!");
                }
                Logging.d(JavaAudioDeviceModule.TAG, "HW AEC will not be used.");
            }
            return new JavaAudioDeviceModule(this.context, this.audioManager, new WebRtcAudioRecord(this.context, this.audioManager, this.audioSource, this.audioRecordErrorCallback, this.samplesReadyCallback, this.useHardwareAcousticEchoCanceler, this.useHardwareNoiseSuppressor), new WebRtcAudioTrack(this.context, this.audioManager, this.audioTrackErrorCallback), this.sampleRate, this.useStereoInput, this.useStereoOutput);
        }

        public Builder setAudioRecordErrorCallback(AudioRecordErrorCallback audioRecordErrorCallback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("603b50ba", new Object[]{this, audioRecordErrorCallback});
            }
            this.audioRecordErrorCallback = audioRecordErrorCallback;
            return this;
        }

        public Builder setAudioSource(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("1761d77b", new Object[]{this, new Integer(i)});
            }
            this.audioSource = i;
            return this;
        }

        public Builder setAudioTrackErrorCallback(AudioTrackErrorCallback audioTrackErrorCallback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("2f0e1416", new Object[]{this, audioTrackErrorCallback});
            }
            this.audioTrackErrorCallback = audioTrackErrorCallback;
            return this;
        }

        public Builder setSampleRate(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("29acf8d8", new Object[]{this, new Integer(i)});
            }
            Logging.d(JavaAudioDeviceModule.TAG, "Sample rate overridden to: " + i);
            this.sampleRate = i;
            return this;
        }

        public Builder setSamplesReadyCallback(SamplesReadyCallback samplesReadyCallback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("30043cac", new Object[]{this, samplesReadyCallback});
            }
            this.samplesReadyCallback = samplesReadyCallback;
            return this;
        }

        public Builder setUseHardwareAcousticEchoCanceler(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("2e6aa1f7", new Object[]{this, new Boolean(z)});
            }
            if (z && !JavaAudioDeviceModule.isBuiltInAcousticEchoCancelerSupported()) {
                Logging.e(JavaAudioDeviceModule.TAG, "HW AEC not supported");
                z = false;
            }
            this.useHardwareAcousticEchoCanceler = z;
            return this;
        }

        public Builder setUseHardwareNoiseSuppressor(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("47ceb640", new Object[]{this, new Boolean(z)});
            }
            if (z && !JavaAudioDeviceModule.isBuiltInNoiseSuppressorSupported()) {
                Logging.e(JavaAudioDeviceModule.TAG, "HW NS not supported");
                z = false;
            }
            this.useHardwareNoiseSuppressor = z;
            return this;
        }

        public Builder setUseStereoInput(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("aa179268", new Object[]{this, new Boolean(z)});
            }
            this.useStereoInput = z;
            return this;
        }

        public Builder setUseStereoOutput(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("4685f9b9", new Object[]{this, new Boolean(z)});
            }
            this.useStereoOutput = z;
            return this;
        }

        private Builder(Context context) {
            this.audioSource = 7;
            this.useHardwareAcousticEchoCanceler = JavaAudioDeviceModule.isBuiltInAcousticEchoCancelerSupported();
            this.useHardwareNoiseSuppressor = JavaAudioDeviceModule.isBuiltInNoiseSuppressorSupported();
            this.context = context;
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            this.audioManager = audioManager;
            this.sampleRate = WebRtcAudioManager.getSampleRate(audioManager);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface SamplesReadyCallback {
        void onWebRtcAudioRecordSamplesReady(AudioSamples audioSamples);
    }

    static {
        t2o.a(395313860);
        t2o.a(395313859);
    }

    public static Builder builder(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Builder) ipChange.ipc$dispatch("2d7af9e2", new Object[]{context});
        }
        return new Builder(context);
    }

    public static boolean isBuiltInAcousticEchoCancelerSupported() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("476371", new Object[0])).booleanValue();
        }
        return WebRtcAudioEffects.isAcousticEchoCancelerSupported();
    }

    public static boolean isBuiltInNoiseSuppressorSupported() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7f54da0", new Object[0])).booleanValue();
        }
        return WebRtcAudioEffects.isNoiseSuppressorSupported();
    }

    private static native long nativeCreateAudioDeviceModule(Context context, AudioManager audioManager, WebRtcAudioRecord webRtcAudioRecord, WebRtcAudioTrack webRtcAudioTrack, int i, boolean z, boolean z2);

    @Override // org.webrtc.audio.AudioDeviceModule
    public long getNativeAudioDeviceModulePointer() {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6d43276d", new Object[]{this})).longValue();
        }
        synchronized (this.nativeLock) {
            try {
                if (this.nativeAudioDeviceModule == 0) {
                    this.nativeAudioDeviceModule = nativeCreateAudioDeviceModule(this.context, this.audioManager, this.audioInput, this.audioOutput, this.sampleRate, this.useStereoInput, this.useStereoOutput);
                }
                j = this.nativeAudioDeviceModule;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j;
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        synchronized (this.nativeLock) {
            try {
                long j = this.nativeAudioDeviceModule;
                if (j != 0) {
                    JniCommon.nativeReleaseRef(j);
                    this.nativeAudioDeviceModule = 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public void setMicrophoneMute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93eda6e8", new Object[]{this, new Boolean(z)});
            return;
        }
        Logging.d(TAG, "setMicrophoneMute: " + z);
        this.audioInput.setMicrophoneMute(z);
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public void setSpeakerMute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4761ff7", new Object[]{this, new Boolean(z)});
            return;
        }
        Logging.d(TAG, "setSpeakerMute: " + z);
        this.audioOutput.setSpeakerMute(z);
    }

    private JavaAudioDeviceModule(Context context, AudioManager audioManager, WebRtcAudioRecord webRtcAudioRecord, WebRtcAudioTrack webRtcAudioTrack, int i, boolean z, boolean z2) {
        this.nativeLock = new Object();
        this.context = context;
        this.audioManager = audioManager;
        this.audioInput = webRtcAudioRecord;
        this.audioOutput = webRtcAudioTrack;
        this.sampleRate = i;
        this.useStereoInput = z;
        this.useStereoOutput = z2;
    }
}
