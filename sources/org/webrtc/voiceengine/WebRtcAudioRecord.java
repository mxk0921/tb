package org.webrtc.voiceengine;

import android.media.AudioRecord;
import android.os.Process;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.utils.ArtcDeviceInfo;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.webrtc.Logging;
import org.webrtc.ThreadUtils;
import tb.f7l;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class WebRtcAudioRecord {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int BUFFER_SIZE_FACTOR = 2;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final boolean DEBUG = false;
    public static final int DEFAULT_AUDIO_SOURCE;
    private static final String TAG = "WebRtcAudioRecord";
    private static int audioSource;
    private AudioRecord audioRecord = null;
    private AudioRecordThread audioThread = null;
    private ByteBuffer byteBuffer;
    private WebRtcAudioEffects effects;
    private byte[] emptyBytes;
    private final long nativeAudioRecord;
    private static volatile boolean microphoneMute = false;
    private static WebRtcAudioRecordErrorCallback errorCallback = null;
    private static WebRtcAudioRecordSamplesReadyCallback audioSamplesReadyCallback = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public enum AudioRecordStartErrorCode {
        AUDIO_RECORD_START_EXCEPTION,
        AUDIO_RECORD_START_STATE_MISMATCH;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AudioRecordStartErrorCode audioRecordStartErrorCode, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in org/webrtc/voiceengine/WebRtcAudioRecord$AudioRecordStartErrorCode");
        }

        public static AudioRecordStartErrorCode valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AudioRecordStartErrorCode) ipChange.ipc$dispatch("4cbcde4e", new Object[]{str});
            }
            return (AudioRecordStartErrorCode) Enum.valueOf(AudioRecordStartErrorCode.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class AudioRecordThread extends Thread {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private volatile boolean keepAlive = true;

        static {
            t2o.a(395313887);
        }

        public AudioRecordThread(String str) {
            super(str);
        }

        public static /* synthetic */ Object ipc$super(AudioRecordThread audioRecordThread, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in org/webrtc/voiceengine/WebRtcAudioRecord$AudioRecordThread");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Process.setThreadPriority(-19);
            Logging.d(WebRtcAudioRecord.TAG, "AudioRecordThread" + WebRtcAudioUtils.getThreadInfo());
            if (WebRtcAudioRecord.access$000(WebRtcAudioRecord.this).getRecordingState() != 3) {
                z = false;
            }
            WebRtcAudioRecord.access$100(z);
            System.nanoTime();
            while (this.keepAlive) {
                int read = WebRtcAudioRecord.access$000(WebRtcAudioRecord.this).read(WebRtcAudioRecord.access$200(WebRtcAudioRecord.this), WebRtcAudioRecord.access$200(WebRtcAudioRecord.this).capacity());
                if (read == WebRtcAudioRecord.access$200(WebRtcAudioRecord.this).capacity()) {
                    if (WebRtcAudioRecord.access$300()) {
                        WebRtcAudioRecord.access$200(WebRtcAudioRecord.this).clear();
                        WebRtcAudioRecord.access$200(WebRtcAudioRecord.this).put(WebRtcAudioRecord.access$400(WebRtcAudioRecord.this));
                    }
                    if (this.keepAlive) {
                        try {
                            WebRtcAudioRecord webRtcAudioRecord = WebRtcAudioRecord.this;
                            WebRtcAudioRecord.access$600(webRtcAudioRecord, read, WebRtcAudioRecord.access$500(webRtcAudioRecord));
                        } catch (Throwable unused) {
                            Logging.e(WebRtcAudioRecord.TAG, "error for call nativeDataIsRecorded");
                        }
                    }
                    if (WebRtcAudioRecord.access$700() != null) {
                        WebRtcAudioRecord.access$700().onWebRtcAudioRecordSamplesReady(new AudioSamples(WebRtcAudioRecord.access$000(WebRtcAudioRecord.this), Arrays.copyOf(WebRtcAudioRecord.access$200(WebRtcAudioRecord.this).array(), WebRtcAudioRecord.access$200(WebRtcAudioRecord.this).capacity())));
                    }
                } else {
                    String str = "AudioRecord.read failed: " + read;
                    Logging.e(WebRtcAudioRecord.TAG, str);
                    if (read == -3) {
                        this.keepAlive = false;
                        WebRtcAudioRecord.access$900(WebRtcAudioRecord.this, str);
                    }
                }
            }
            try {
                if (WebRtcAudioRecord.access$000(WebRtcAudioRecord.this) != null) {
                    WebRtcAudioRecord.access$000(WebRtcAudioRecord.this).stop();
                }
            } catch (IllegalStateException e) {
                Logging.e(WebRtcAudioRecord.TAG, "AudioRecord.stop failed: " + e.getMessage());
            }
        }

        public void stopThread() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3433c733", new Object[]{this});
                return;
            }
            Logging.d(WebRtcAudioRecord.TAG, "stopThread");
            this.keepAlive = false;
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
            t2o.a(395313888);
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

        private AudioSamples(AudioRecord audioRecord, byte[] bArr) {
            this.audioFormat = audioRecord.getAudioFormat();
            this.channelCount = audioRecord.getChannelCount();
            this.sampleRate = audioRecord.getSampleRate();
            this.data = bArr;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface WebRtcAudioRecordErrorCallback {
        void onWebRtcAudioRecordError(String str);

        void onWebRtcAudioRecordInitError(String str);

        void onWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface WebRtcAudioRecordSamplesReadyCallback {
        void onWebRtcAudioRecordSamplesReady(AudioSamples audioSamples);
    }

    static {
        t2o.a(395313884);
        int defaultAudioSource = getDefaultAudioSource();
        DEFAULT_AUDIO_SOURCE = defaultAudioSource;
        audioSource = defaultAudioSource;
    }

    public WebRtcAudioRecord(long j) {
        this.effects = null;
        Logging.d(TAG, "ctor" + WebRtcAudioUtils.getThreadInfo());
        this.nativeAudioRecord = j;
        this.effects = WebRtcAudioEffects.create();
    }

    public static /* synthetic */ AudioRecord access$000(WebRtcAudioRecord webRtcAudioRecord) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AudioRecord) ipChange.ipc$dispatch("4ec19813", new Object[]{webRtcAudioRecord});
        }
        return webRtcAudioRecord.audioRecord;
    }

    public static /* synthetic */ void access$100(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45ccc71c", new Object[]{new Boolean(z)});
        } else {
            assertTrue(z);
        }
    }

    public static /* synthetic */ ByteBuffer access$200(WebRtcAudioRecord webRtcAudioRecord) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("abd1d01", new Object[]{webRtcAudioRecord});
        }
        return webRtcAudioRecord.byteBuffer;
    }

    public static /* synthetic */ boolean access$300() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b88b93e", new Object[0])).booleanValue();
        }
        return microphoneMute;
    }

    public static /* synthetic */ byte[] access$400(WebRtcAudioRecord webRtcAudioRecord) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("fc9fb55b", new Object[]{webRtcAudioRecord});
        }
        return webRtcAudioRecord.emptyBytes;
    }

    public static /* synthetic */ long access$500(WebRtcAudioRecord webRtcAudioRecord) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("52025db7", new Object[]{webRtcAudioRecord})).longValue();
        }
        return webRtcAudioRecord.nativeAudioRecord;
    }

    public static /* synthetic */ void access$600(WebRtcAudioRecord webRtcAudioRecord, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e7b7ae5", new Object[]{webRtcAudioRecord, new Integer(i), new Long(j)});
        } else {
            webRtcAudioRecord.nativeDataIsRecorded(i, j);
        }
    }

    public static /* synthetic */ WebRtcAudioRecordSamplesReadyCallback access$700() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebRtcAudioRecordSamplesReadyCallback) ipChange.ipc$dispatch("48894f4a", new Object[0]);
        }
        return audioSamplesReadyCallback;
    }

    public static /* synthetic */ void access$900(WebRtcAudioRecord webRtcAudioRecord, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1598abd1", new Object[]{webRtcAudioRecord, str});
        } else {
            webRtcAudioRecord.reportWebRtcAudioRecordError(str);
        }
    }

    private static void assertTrue(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74be8db9", new Object[]{new Boolean(z)});
        } else if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private int channelCountToConfiguration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1b2fd9e0", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i == 1) {
            return 16;
        }
        return 12;
    }

    private boolean enableBuiltInAEC(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18437f32", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        Logging.d(TAG, "enableBuiltInAEC(" + z + ')');
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            return webRtcAudioEffects.setAEC(z);
        }
        Logging.e(TAG, "Built-in AEC is not supported on this platform");
        return false;
    }

    private boolean enableBuiltInNS(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ad02f4c", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        Logging.d(TAG, "enableBuiltInNS(" + z + ')');
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            return webRtcAudioEffects.setNS(z);
        }
        Logging.e(TAG, "Built-in NS is not supported on this platform");
        return false;
    }

    private static int getDefaultAudioSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5ca57a00", new Object[0])).intValue();
        }
        return 7;
    }

    private int initRecording(int i, int i2, int i3) {
        int i4;
        int i5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("189d22ce", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        Logging.d(TAG, "initRecording(sampleRate=" + i + ", channels=" + i2 + ", source:" + i3 + f7l.BRACKET_END_STR);
        if (this.audioRecord != null) {
            reportWebRtcAudioRecordInitError("InitRecording called twice without StopRecording.");
            return -1;
        }
        int i6 = i / 100;
        this.byteBuffer = ByteBuffer.allocateDirect(i2 * 2 * i6);
        Logging.d(TAG, "byteBuffer.capacity: " + this.byteBuffer.capacity());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        try {
            nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioRecord);
            int channelCountToConfiguration = channelCountToConfiguration(i2);
            if (ArtcDeviceInfo.is_tmall_cc()) {
                i4 = 60;
            } else {
                i4 = channelCountToConfiguration;
            }
            int minBufferSize = AudioRecord.getMinBufferSize(i, i4, 2);
            if (minBufferSize == -1 || minBufferSize == -2) {
                reportWebRtcAudioRecordInitError("AudioRecord.getMinBufferSize failed: " + minBufferSize);
                return -1;
            }
            Logging.d(TAG, "AudioRecord.getMinBufferSize: " + minBufferSize);
            int max = Math.max(minBufferSize * 2, this.byteBuffer.capacity());
            Logging.d(TAG, "bufferSizeInBytes: " + max);
            if (i3 == 0) {
                i5 = 7;
            } else {
                i5 = 1;
            }
            audioSource = i5;
            if (ArtcDeviceInfo.is_tmall_cc()) {
                audioSource = 6;
            }
            try {
                AudioRecord audioRecord = new AudioRecord(audioSource, i, i4, 2, max);
                this.audioRecord = audioRecord;
                if (audioRecord.getState() != 1) {
                    reportWebRtcAudioRecordInitError("Failed to create a new AudioRecord instance");
                    releaseAudioResources();
                    return -1;
                }
                WebRtcAudioEffects webRtcAudioEffects = this.effects;
                if (webRtcAudioEffects != null) {
                    webRtcAudioEffects.enable(this.audioRecord.getAudioSessionId());
                }
                logMainParameters();
                logMainParametersExtended();
                return i6;
            } catch (IllegalArgumentException e) {
                reportWebRtcAudioRecordInitError("AudioRecord ctor error: " + e.getMessage());
                releaseAudioResources();
                return -1;
            }
        } catch (Throwable unused) {
            Logging.e(TAG, "initRecording error for call nativeCacheDirectBufferAddress");
            return -1;
        }
    }

    private void logMainParameters() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5967b1ee", new Object[]{this});
            return;
        }
        Logging.d(TAG, "AudioRecord: session ID: " + this.audioRecord.getAudioSessionId() + ", channels: " + this.audioRecord.getChannelCount() + ", sample rate: " + this.audioRecord.getSampleRate());
    }

    private void logMainParametersExtended() {
        int bufferSizeInFrames;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35ad7c7", new Object[]{this});
        } else if (WebRtcAudioUtils.runningOnMarshmallowOrHigher()) {
            StringBuilder sb = new StringBuilder("AudioRecord: buffer size in frames: ");
            bufferSizeInFrames = this.audioRecord.getBufferSizeInFrames();
            sb.append(bufferSizeInFrames);
            Logging.d(TAG, sb.toString());
        }
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer, long j);

    private native void nativeDataIsRecorded(int i, long j);

    private void releaseAudioResources() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba7c385d", new Object[]{this});
            return;
        }
        Logging.d(TAG, "releaseAudioResources");
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null) {
            audioRecord.release();
            this.audioRecord = null;
        }
    }

    private void reportWebRtcAudioRecordError(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abd0273", new Object[]{this, str});
            return;
        }
        Logging.e(TAG, "Run-time recording error: " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordError(str);
        }
    }

    private void reportWebRtcAudioRecordInitError(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aff55e43", new Object[]{this, str});
            return;
        }
        Logging.e(TAG, "Init recording error: " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordInitError(str);
        }
    }

    private void reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3094c84e", new Object[]{this, audioRecordStartErrorCode, str});
            return;
        }
        Logging.e(TAG, "Start recording error: " + audioRecordStartErrorCode + ". " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordStartError(audioRecordStartErrorCode, str);
        }
    }

    public static synchronized void setAudioSource(int i) {
        synchronized (WebRtcAudioRecord.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("955156ed", new Object[]{new Integer(i)});
                return;
            }
            Logging.w(TAG, "Audio source is changed from: " + audioSource + " to " + i);
            audioSource = i;
        }
    }

    public static void setErrorCallback(WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa768ea0", new Object[]{webRtcAudioRecordErrorCallback});
            return;
        }
        Logging.d(TAG, "Set error callback");
        errorCallback = webRtcAudioRecordErrorCallback;
    }

    public static void setMicrophoneMute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93eda6e8", new Object[]{new Boolean(z)});
            return;
        }
        Logging.w(TAG, "setMicrophoneMute(" + z + f7l.BRACKET_END_STR);
        microphoneMute = z;
    }

    public static void setOnAudioSamplesReady(WebRtcAudioRecordSamplesReadyCallback webRtcAudioRecordSamplesReadyCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4faf26e8", new Object[]{webRtcAudioRecordSamplesReadyCallback});
        } else {
            audioSamplesReadyCallback = webRtcAudioRecordSamplesReadyCallback;
        }
    }

    private boolean startRecording() {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aca5bcba", new Object[]{this})).booleanValue();
        }
        Logging.d(TAG, "startRecording");
        if (this.audioRecord != null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
        if (this.audioThread == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        assertTrue(z2);
        try {
            this.audioRecord.startRecording();
            if (this.audioRecord.getRecordingState() != 3) {
                AudioRecordStartErrorCode audioRecordStartErrorCode = AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH;
                reportWebRtcAudioRecordStartError(audioRecordStartErrorCode, "AudioRecord.startRecording failed - incorrect state :" + this.audioRecord.getRecordingState());
                return false;
            }
            AudioRecordThread audioRecordThread = new AudioRecordThread("AudioRecordJavaThread");
            this.audioThread = audioRecordThread;
            audioRecordThread.start();
            return true;
        } catch (IllegalStateException e) {
            AudioRecordStartErrorCode audioRecordStartErrorCode2 = AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION;
            reportWebRtcAudioRecordStartError(audioRecordStartErrorCode2, "AudioRecord.startRecording failed: " + e.getMessage());
            return false;
        }
    }

    private boolean stopRecording() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("373d5d1a", new Object[]{this})).booleanValue();
        }
        Logging.d(TAG, "stopRecording");
        if (this.audioThread != null) {
            z = true;
        }
        assertTrue(z);
        this.audioThread.stopThread();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, 2000L)) {
            Logging.e(TAG, "Join of AudioRecordJavaThread timed out");
            WebRtcAudioUtils.logAudioState(TAG);
        }
        this.audioThread = null;
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            webRtcAudioEffects.release();
        }
        releaseAudioResources();
        return true;
    }
}
