package org.webrtc.audio;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.webrtc.Logging;
import org.webrtc.audio.JavaAudioDeviceModule;
import tb.f7l;
import tb.nf;
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
    public static final int DEFAULT_AUDIO_SOURCE = 7;
    private static final String TAG = "WebRtcAudioRecordExternal";
    private final AudioManager audioManager;
    private AudioRecord audioRecord;
    private final JavaAudioDeviceModule.SamplesReadyCallback audioSamplesReadyCallback;
    private final int audioSource;
    private nf.a audioThread;
    private ByteBuffer byteBuffer;
    private final Context context;
    private final WebRtcAudioEffects effects;
    private byte[] emptyBytes;
    private final JavaAudioDeviceModule.AudioRecordErrorCallback errorCallback;
    private final boolean isAcousticEchoCancelerSupported;
    private final boolean isNoiseSuppressorSupported;
    private volatile boolean keepAlive;
    private volatile boolean microphoneMute;
    private long nativeAudioRecord;

    static {
        t2o.a(395313873);
    }

    public WebRtcAudioRecord(Context context, AudioManager audioManager) {
        this(context, audioManager, 7, null, null, WebRtcAudioEffects.isAcousticEchoCancelerSupported(), WebRtcAudioEffects.isNoiseSuppressorSupported());
    }

    public static /* synthetic */ AudioRecord access$000(WebRtcAudioRecord webRtcAudioRecord) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AudioRecord) ipChange.ipc$dispatch("ff2dddb1", new Object[]{webRtcAudioRecord});
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

    public static /* synthetic */ boolean access$200(WebRtcAudioRecord webRtcAudioRecord) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23064862", new Object[]{webRtcAudioRecord})).booleanValue();
        }
        return webRtcAudioRecord.keepAlive;
    }

    public static /* synthetic */ boolean access$202(WebRtcAudioRecord webRtcAudioRecord, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c8de078", new Object[]{webRtcAudioRecord, new Boolean(z)})).booleanValue();
        }
        webRtcAudioRecord.keepAlive = z;
        return z;
    }

    public static /* synthetic */ ByteBuffer access$300(WebRtcAudioRecord webRtcAudioRecord) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("74c8dee0", new Object[]{webRtcAudioRecord});
        }
        return webRtcAudioRecord.byteBuffer;
    }

    public static /* synthetic */ boolean access$400(WebRtcAudioRecord webRtcAudioRecord) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed8925e4", new Object[]{webRtcAudioRecord})).booleanValue();
        }
        return webRtcAudioRecord.microphoneMute;
    }

    public static /* synthetic */ byte[] access$500(WebRtcAudioRecord webRtcAudioRecord) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("8688005c", new Object[]{webRtcAudioRecord});
        }
        return webRtcAudioRecord.emptyBytes;
    }

    public static /* synthetic */ long access$600(WebRtcAudioRecord webRtcAudioRecord) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b80c0356", new Object[]{webRtcAudioRecord})).longValue();
        }
        return webRtcAudioRecord.nativeAudioRecord;
    }

    public static /* synthetic */ void access$700(WebRtcAudioRecord webRtcAudioRecord, long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fc84a22", new Object[]{webRtcAudioRecord, new Long(j), new Integer(i)});
        } else {
            webRtcAudioRecord.nativeDataIsRecorded(j, i);
        }
    }

    public static /* synthetic */ JavaAudioDeviceModule.SamplesReadyCallback access$800(WebRtcAudioRecord webRtcAudioRecord) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JavaAudioDeviceModule.SamplesReadyCallback) ipChange.ipc$dispatch("c16f078", new Object[]{webRtcAudioRecord});
        }
        return webRtcAudioRecord.audioSamplesReadyCallback;
    }

    public static /* synthetic */ void access$900(WebRtcAudioRecord webRtcAudioRecord, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b990ba2f", new Object[]{webRtcAudioRecord, str});
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
        Logging.d(TAG, "enableBuiltInAEC(" + z + f7l.BRACKET_END_STR);
        return this.effects.setAEC(z);
    }

    private boolean enableBuiltInNS(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ad02f4c", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        Logging.d(TAG, "enableBuiltInNS(" + z + f7l.BRACKET_END_STR);
        return this.effects.setNS(z);
    }

    private int initRecording(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5ba1f51b", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        Logging.d(TAG, "initRecording(sampleRate=" + i + ", channels=" + i2 + f7l.BRACKET_END_STR);
        if (this.audioRecord != null) {
            reportWebRtcAudioRecordInitError("InitRecording called twice without StopRecording.");
            return -1;
        }
        int i3 = i / 100;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i2 * 2 * i3);
        this.byteBuffer = allocateDirect;
        if (!allocateDirect.hasArray()) {
            reportWebRtcAudioRecordInitError("ByteBuffer does not have backing array.");
            return -1;
        }
        Logging.d(TAG, "byteBuffer.capacity: " + this.byteBuffer.capacity());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.nativeAudioRecord, this.byteBuffer);
        int channelCountToConfiguration = channelCountToConfiguration(i2);
        int minBufferSize = AudioRecord.getMinBufferSize(i, channelCountToConfiguration, 2);
        if (minBufferSize == -1 || minBufferSize == -2) {
            reportWebRtcAudioRecordInitError("AudioRecord.getMinBufferSize failed: " + minBufferSize);
            return -1;
        }
        Logging.d(TAG, "AudioRecord.getMinBufferSize: " + minBufferSize);
        int max = Math.max(minBufferSize * 2, this.byteBuffer.capacity());
        Logging.d(TAG, "bufferSizeInBytes: " + max);
        try {
            AudioRecord audioRecord = new AudioRecord(this.audioSource, i, channelCountToConfiguration, 2, max);
            this.audioRecord = audioRecord;
            if (audioRecord.getState() != 1) {
                reportWebRtcAudioRecordInitError("Failed to create a new AudioRecord instance");
                releaseAudioResources();
                return -1;
            }
            this.effects.enable(this.audioRecord.getAudioSessionId());
            logMainParameters();
            logMainParametersExtended();
            return i3;
        } catch (IllegalArgumentException e) {
            reportWebRtcAudioRecordInitError("AudioRecord ctor error: " + e.getMessage());
            releaseAudioResources();
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

    private native void nativeCacheDirectBufferAddress(long j, ByteBuffer byteBuffer);

    private native void nativeDataIsRecorded(long j, int i);

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
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback = this.errorCallback;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.onWebRtcAudioRecordError(str);
        }
    }

    private void reportWebRtcAudioRecordInitError(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aff55e43", new Object[]{this, str});
            return;
        }
        Logging.e(TAG, "Init recording error: " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback = this.errorCallback;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.onWebRtcAudioRecordInitError(str);
        }
    }

    private void reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98809cb0", new Object[]{this, audioRecordStartErrorCode, str});
            return;
        }
        Logging.e(TAG, "Start recording error: " + audioRecordStartErrorCode + ". " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback = this.errorCallback;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.onWebRtcAudioRecordStartError(audioRecordStartErrorCode, str);
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
                JavaAudioDeviceModule.AudioRecordStartErrorCode audioRecordStartErrorCode = JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH;
                reportWebRtcAudioRecordStartError(audioRecordStartErrorCode, "AudioRecord.startRecording failed - incorrect state :" + this.audioRecord.getRecordingState());
                return false;
            }
            nf.a aVar = new nf.a("AudioRecordJavaThread");
            this.audioThread = aVar;
            aVar.c(new Runnable() { // from class: org.webrtc.audio.WebRtcAudioRecord.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    boolean z3 = true;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Process.setThreadPriority(-19);
                    Logging.d(WebRtcAudioRecord.TAG, "AudioRecordThread" + WebRtcAudioUtils.getThreadInfo());
                    if (WebRtcAudioRecord.access$000(WebRtcAudioRecord.this).getRecordingState() != 3) {
                        z3 = false;
                    }
                    WebRtcAudioRecord.access$100(z3);
                    System.nanoTime();
                    while (WebRtcAudioRecord.access$200(WebRtcAudioRecord.this)) {
                        int read = WebRtcAudioRecord.access$000(WebRtcAudioRecord.this).read(WebRtcAudioRecord.access$300(WebRtcAudioRecord.this), WebRtcAudioRecord.access$300(WebRtcAudioRecord.this).capacity());
                        if (read == WebRtcAudioRecord.access$300(WebRtcAudioRecord.this).capacity()) {
                            if (WebRtcAudioRecord.access$400(WebRtcAudioRecord.this)) {
                                WebRtcAudioRecord.access$300(WebRtcAudioRecord.this).clear();
                                WebRtcAudioRecord.access$300(WebRtcAudioRecord.this).put(WebRtcAudioRecord.access$500(WebRtcAudioRecord.this));
                            }
                            if (WebRtcAudioRecord.access$200(WebRtcAudioRecord.this)) {
                                WebRtcAudioRecord webRtcAudioRecord = WebRtcAudioRecord.this;
                                WebRtcAudioRecord.access$700(webRtcAudioRecord, WebRtcAudioRecord.access$600(webRtcAudioRecord), read);
                            }
                            if (WebRtcAudioRecord.access$800(WebRtcAudioRecord.this) != null) {
                                WebRtcAudioRecord.access$800(WebRtcAudioRecord.this).onWebRtcAudioRecordSamplesReady(new JavaAudioDeviceModule.AudioSamples(WebRtcAudioRecord.access$000(WebRtcAudioRecord.this).getAudioFormat(), WebRtcAudioRecord.access$000(WebRtcAudioRecord.this).getChannelCount(), WebRtcAudioRecord.access$000(WebRtcAudioRecord.this).getSampleRate(), Arrays.copyOfRange(WebRtcAudioRecord.access$300(WebRtcAudioRecord.this).array(), WebRtcAudioRecord.access$300(WebRtcAudioRecord.this).arrayOffset(), WebRtcAudioRecord.access$300(WebRtcAudioRecord.this).capacity() + WebRtcAudioRecord.access$300(WebRtcAudioRecord.this).arrayOffset())));
                            }
                        } else {
                            String str = "AudioRecord.read failed: " + read;
                            Logging.e(WebRtcAudioRecord.TAG, str);
                            if (read == -3) {
                                WebRtcAudioRecord.access$202(WebRtcAudioRecord.this, false);
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
            });
            return true;
        } catch (IllegalStateException e) {
            JavaAudioDeviceModule.AudioRecordStartErrorCode audioRecordStartErrorCode2 = JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION;
            reportWebRtcAudioRecordStartError(audioRecordStartErrorCode2, "AudioRecord.startRecording failed: " + e.getMessage());
            return false;
        }
    }

    private boolean stopRecording() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("373d5d1a", new Object[]{this})).booleanValue();
        }
        Logging.d(TAG, "stopRecording");
        if (this.audioThread != null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
        this.keepAlive = false;
        if (!this.audioThread.d(2000L)) {
            Logging.e(TAG, "Join of AudioRecordJavaThread timed out");
            WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        }
        this.audioThread = null;
        this.effects.release();
        releaseAudioResources();
        return true;
    }

    public boolean isAcousticEchoCancelerSupported() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a309f820", new Object[]{this})).booleanValue();
        }
        return this.isAcousticEchoCancelerSupported;
    }

    public boolean isNoiseSuppressorSupported() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55264791", new Object[]{this})).booleanValue();
        }
        return this.isNoiseSuppressorSupported;
    }

    public void setMicrophoneMute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93eda6e8", new Object[]{this, new Boolean(z)});
            return;
        }
        Logging.w(TAG, "setMicrophoneMute(" + z + f7l.BRACKET_END_STR);
        this.microphoneMute = z;
    }

    public void setNativeAudioRecord(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58ca24ef", new Object[]{this, new Long(j)});
        } else {
            this.nativeAudioRecord = j;
        }
    }

    public WebRtcAudioRecord(Context context, AudioManager audioManager, int i, JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback, JavaAudioDeviceModule.SamplesReadyCallback samplesReadyCallback, boolean z, boolean z2) {
        this.effects = new WebRtcAudioEffects();
        this.audioRecord = null;
        this.audioThread = null;
        this.keepAlive = true;
        this.microphoneMute = false;
        if (z && !WebRtcAudioEffects.isAcousticEchoCancelerSupported()) {
            throw new IllegalArgumentException("HW AEC not supported");
        } else if (!z2 || WebRtcAudioEffects.isNoiseSuppressorSupported()) {
            this.context = context;
            this.audioManager = audioManager;
            this.audioSource = i;
            this.errorCallback = audioRecordErrorCallback;
            this.audioSamplesReadyCallback = samplesReadyCallback;
            this.isAcousticEchoCancelerSupported = z;
            this.isNoiseSuppressorSupported = z2;
        } else {
            throw new IllegalArgumentException("HW NS not supported");
        }
    }
}
