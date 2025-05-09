package org.webrtc.audio;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.utils.ArtcDeviceInfo;
import java.nio.ByteBuffer;
import org.webrtc.Logging;
import org.webrtc.ThreadUtils;
import org.webrtc.audio.JavaAudioDeviceModule;
import tb.f7l;
import tb.nf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class WebRtcAudioTrack {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final String TAG = "WebRtcAudioTrackExternal";
    private final AudioManager audioManager;
    private nf.a audioThread;
    private AudioTrack audioTrack;
    private ByteBuffer byteBuffer;
    private final Context context;
    private byte[] emptyBytes;
    private final JavaAudioDeviceModule.AudioTrackErrorCallback errorCallback;
    private volatile boolean keepAlive;
    private long nativeAudioTrack;
    private volatile boolean speakerMute;
    private final ThreadUtils.ThreadChecker threadChecker;
    private final VolumeLogger volumeLogger;
    private static final int DEFAULT_USAGE = getDefaultUsageAttribute();
    private static int streamType = 0;

    static {
        t2o.a(395313875);
    }

    public WebRtcAudioTrack(Context context, AudioManager audioManager) {
        this(context, audioManager, null);
    }

    public static /* synthetic */ AudioTrack access$000(WebRtcAudioTrack webRtcAudioTrack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AudioTrack) ipChange.ipc$dispatch("af57f72d", new Object[]{webRtcAudioTrack});
        }
        return webRtcAudioTrack.audioTrack;
    }

    public static /* synthetic */ void access$100(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45ccc71c", new Object[]{new Boolean(z)});
        } else {
            assertTrue(z);
        }
    }

    public static /* synthetic */ void access$1000(WebRtcAudioTrack webRtcAudioTrack, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da8bc0f3", new Object[]{webRtcAudioTrack, str});
        } else {
            webRtcAudioTrack.reportWebRtcAudioTrackError(str);
        }
    }

    public static /* synthetic */ ByteBuffer access$200(WebRtcAudioTrack webRtcAudioTrack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("ccd99377", new Object[]{webRtcAudioTrack});
        }
        return webRtcAudioTrack.byteBuffer;
    }

    public static /* synthetic */ boolean access$300(WebRtcAudioTrack webRtcAudioTrack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("314e9259", new Object[]{webRtcAudioTrack})).booleanValue();
        }
        return webRtcAudioTrack.keepAlive;
    }

    public static /* synthetic */ boolean access$302(WebRtcAudioTrack webRtcAudioTrack, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11c4c125", new Object[]{webRtcAudioTrack, new Boolean(z)})).booleanValue();
        }
        webRtcAudioTrack.keepAlive = z;
        return z;
    }

    public static /* synthetic */ long access$400(WebRtcAudioTrack webRtcAudioTrack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("38b3c768", new Object[]{webRtcAudioTrack})).longValue();
        }
        return webRtcAudioTrack.nativeAudioTrack;
    }

    public static /* synthetic */ void access$500(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4d7057b", new Object[]{new Long(j), new Integer(i)});
        } else {
            nativeGetPlayoutData(j, i);
        }
    }

    public static /* synthetic */ boolean access$600(WebRtcAudioTrack webRtcAudioTrack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("477e31b6", new Object[]{webRtcAudioTrack})).booleanValue();
        }
        return webRtcAudioTrack.speakerMute;
    }

    public static /* synthetic */ byte[] access$700(WebRtcAudioTrack webRtcAudioTrack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("8d89742c", new Object[]{webRtcAudioTrack});
        }
        return webRtcAudioTrack.emptyBytes;
    }

    public static /* synthetic */ int access$800(WebRtcAudioTrack webRtcAudioTrack, AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6e204c84", new Object[]{webRtcAudioTrack, audioTrack, byteBuffer, new Integer(i)})).intValue();
        }
        return webRtcAudioTrack.writeOnLollipop(audioTrack, byteBuffer, i);
    }

    public static /* synthetic */ int access$900(WebRtcAudioTrack webRtcAudioTrack, AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a61127a3", new Object[]{webRtcAudioTrack, audioTrack, byteBuffer, new Integer(i)})).intValue();
        }
        return webRtcAudioTrack.writePreLollipop(audioTrack, byteBuffer, i);
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
            return 4;
        }
        return 12;
    }

    private static AudioTrack createAudioTrackOnLollipopOrHigher(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AudioTrack) ipChange.ipc$dispatch("787f45b6", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)});
        }
        Logging.d(TAG, "createAudioTrackOnLollipopOrHigher");
        int nativeOutputSampleRate = AudioTrack.getNativeOutputSampleRate(0);
        Logging.d(TAG, "nativeOutputSampleRate: " + nativeOutputSampleRate);
        if (i != nativeOutputSampleRate) {
            Logging.w(TAG, "Unable to use fast mode since requested sample rate is not native");
        }
        return new AudioTrack(new AudioAttributes.Builder().setUsage(DEFAULT_USAGE).setContentType(1).build(), new AudioFormat.Builder().setEncoding(2).setSampleRate(i).setChannelMask(i2).build(), i3, 1, 0);
    }

    private static AudioTrack createAudioTrackOnLowerThanLollipop(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AudioTrack) ipChange.ipc$dispatch("a8909146", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)});
        }
        return new AudioTrack(streamType, i, i2, 2, i3, 1);
    }

    private static int getDefaultUsageAttribute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2acca260", new Object[0])).intValue();
        }
        if (WebRtcAudioUtils.runningOnLollipopOrHigher()) {
            return getDefaultUsageAttributeOnLollipopOrHigher();
        }
        return 0;
    }

    private static int getDefaultUsageAttributeOnLollipopOrHigher() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bdc627bc", new Object[0])).intValue();
        }
        return 2;
    }

    private int getStreamMaxVolume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7cb95042", new Object[]{this})).intValue();
        }
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "getStreamMaxVolume");
        return this.audioManager.getStreamMaxVolume(streamType);
    }

    private int getStreamVolume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc2581aa", new Object[]{this})).intValue();
        }
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "getStreamVolume");
        return this.audioManager.getStreamVolume(streamType);
    }

    private boolean initPlayout(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebd6b015", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "initPlayout(sampleRate=" + i + ", channels=" + i2 + f7l.BRACKET_END_STR);
        this.byteBuffer = ByteBuffer.allocateDirect(i2 * 2 * (i / 100));
        StringBuilder sb = new StringBuilder("byteBuffer.capacity: ");
        sb.append(this.byteBuffer.capacity());
        Logging.d(TAG, sb.toString());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.nativeAudioTrack, this.byteBuffer);
        int channelCountToConfiguration = channelCountToConfiguration(i2);
        int minBufferSize = AudioTrack.getMinBufferSize(i, channelCountToConfiguration, 2);
        Logging.d(TAG, "AudioTrack.getMinBufferSize: " + minBufferSize);
        if (minBufferSize < this.byteBuffer.capacity()) {
            reportWebRtcAudioTrackInitError("AudioTrack.getMinBufferSize returns an invalid value.");
            return false;
        } else if (this.audioTrack != null) {
            reportWebRtcAudioTrackInitError("Conflict with existing AudioTrack.");
            return false;
        } else {
            try {
                if (ArtcDeviceInfo.is_tmall_cc()) {
                    this.audioTrack = createAudioTrackOnLowerThanLollipop(i, channelCountToConfiguration, minBufferSize);
                } else if (WebRtcAudioUtils.runningOnLollipopOrHigher()) {
                    this.audioTrack = createAudioTrackOnLollipopOrHigher(i, channelCountToConfiguration, minBufferSize);
                } else {
                    this.audioTrack = createAudioTrackOnLowerThanLollipop(i, channelCountToConfiguration, minBufferSize);
                }
                AudioTrack audioTrack = this.audioTrack;
                if (audioTrack == null || audioTrack.getState() != 1) {
                    reportWebRtcAudioTrackInitError("Initialization of audio track failed.");
                    releaseAudioResources();
                    return false;
                }
                logMainParameters();
                logMainParametersExtended();
                return true;
            } catch (IllegalArgumentException e) {
                reportWebRtcAudioTrackInitError(e.getMessage());
                releaseAudioResources();
                return false;
            }
        }
    }

    private boolean isVolumeFixed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16d1997b", new Object[]{this})).booleanValue();
        }
        if (!WebRtcAudioUtils.runningOnLollipopOrHigher()) {
            return false;
        }
        return this.audioManager.isVolumeFixed();
    }

    private void logMainParameters() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5967b1ee", new Object[]{this});
            return;
        }
        Logging.d(TAG, "AudioTrack: session ID: " + this.audioTrack.getAudioSessionId() + ", channels: " + this.audioTrack.getChannelCount() + ", sample rate: " + this.audioTrack.getSampleRate() + ", max gain: " + AudioTrack.getMaxVolume());
    }

    private void logMainParametersExtended() {
        int bufferCapacityInFrames;
        int bufferSizeInFrames;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35ad7c7", new Object[]{this});
            return;
        }
        if (WebRtcAudioUtils.runningOnMarshmallowOrHigher()) {
            StringBuilder sb = new StringBuilder("AudioTrack: buffer size in frames: ");
            bufferSizeInFrames = this.audioTrack.getBufferSizeInFrames();
            sb.append(bufferSizeInFrames);
            Logging.d(TAG, sb.toString());
        }
        if (WebRtcAudioUtils.runningOnNougatOrHigher()) {
            StringBuilder sb2 = new StringBuilder("AudioTrack: buffer capacity in frames: ");
            bufferCapacityInFrames = this.audioTrack.getBufferCapacityInFrames();
            sb2.append(bufferCapacityInFrames);
            Logging.d(TAG, sb2.toString());
        }
    }

    private void logUnderrunCount() {
        int underrunCount;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("569d93bf", new Object[]{this});
        } else if (WebRtcAudioUtils.runningOnNougatOrHigher()) {
            StringBuilder sb = new StringBuilder("underrun count: ");
            underrunCount = this.audioTrack.getUnderrunCount();
            sb.append(underrunCount);
            Logging.d(TAG, sb.toString());
        }
    }

    private static native void nativeCacheDirectBufferAddress(long j, ByteBuffer byteBuffer);

    private static native void nativeGetPlayoutData(long j, int i);

    private void releaseAudioResources() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba7c385d", new Object[]{this});
            return;
        }
        Logging.d(TAG, "releaseAudioResources");
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            audioTrack.release();
            this.audioTrack = null;
        }
    }

    private void reportWebRtcAudioTrackError(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f858f203", new Object[]{this, str});
            return;
        }
        Logging.e(TAG, "Run-time playback error: " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback = this.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackError(str);
        }
    }

    private void reportWebRtcAudioTrackInitError(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87ef05d3", new Object[]{this, str});
            return;
        }
        Logging.e(TAG, "Init playout error: " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback = this.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackInitError(str);
        }
    }

    private void reportWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("723a4c82", new Object[]{this, audioTrackStartErrorCode, str});
            return;
        }
        Logging.e(TAG, "Start playout error: " + audioTrackStartErrorCode + ". " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback = this.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackStartError(audioTrackStartErrorCode, str);
        }
    }

    private boolean setStreamVolume(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("942134a4", new Object[]{this, new Integer(i)})).booleanValue();
        }
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "setStreamVolume(" + i + f7l.BRACKET_END_STR);
        if (isVolumeFixed()) {
            Logging.e(TAG, "The device implements a fixed volume policy.");
            return false;
        }
        this.audioManager.setStreamVolume(streamType, i, 0);
        return true;
    }

    private boolean startPlayout() {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef96c163", new Object[]{this})).booleanValue();
        }
        this.threadChecker.checkIsOnValidThread();
        this.volumeLogger.start();
        Logging.d(TAG, "startPlayout");
        if (this.audioTrack != null) {
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
            this.audioTrack.play();
            if (this.audioTrack.getPlayState() != 3) {
                JavaAudioDeviceModule.AudioTrackStartErrorCode audioTrackStartErrorCode = JavaAudioDeviceModule.AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH;
                reportWebRtcAudioTrackStartError(audioTrackStartErrorCode, "AudioTrack.play failed - incorrect state :" + this.audioTrack.getPlayState());
                releaseAudioResources();
                return false;
            }
            nf.a aVar = new nf.a("AudioTrackJavaThread");
            this.audioThread = aVar;
            aVar.c(new Runnable() { // from class: org.webrtc.audio.WebRtcAudioTrack.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    boolean z3;
                    boolean z4;
                    int i;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Process.setThreadPriority(-19);
                    Logging.d(WebRtcAudioTrack.TAG, "AudioTrackThread" + WebRtcAudioUtils.getThreadInfo());
                    if (WebRtcAudioTrack.access$000(WebRtcAudioTrack.this).getPlayState() == 3) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    WebRtcAudioTrack.access$100(z3);
                    int capacity = WebRtcAudioTrack.access$200(WebRtcAudioTrack.this).capacity();
                    while (WebRtcAudioTrack.access$300(WebRtcAudioTrack.this)) {
                        WebRtcAudioTrack.access$500(WebRtcAudioTrack.access$400(WebRtcAudioTrack.this), capacity);
                        if (capacity <= WebRtcAudioTrack.access$200(WebRtcAudioTrack.this).remaining()) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        WebRtcAudioTrack.access$100(z4);
                        if (WebRtcAudioTrack.access$600(WebRtcAudioTrack.this)) {
                            WebRtcAudioTrack.access$200(WebRtcAudioTrack.this).clear();
                            WebRtcAudioTrack.access$200(WebRtcAudioTrack.this).put(WebRtcAudioTrack.access$700(WebRtcAudioTrack.this));
                            WebRtcAudioTrack.access$200(WebRtcAudioTrack.this).position(0);
                        }
                        if (WebRtcAudioUtils.runningOnLollipopOrHigher()) {
                            WebRtcAudioTrack webRtcAudioTrack = WebRtcAudioTrack.this;
                            i = WebRtcAudioTrack.access$800(webRtcAudioTrack, WebRtcAudioTrack.access$000(webRtcAudioTrack), WebRtcAudioTrack.access$200(WebRtcAudioTrack.this), capacity);
                        } else {
                            WebRtcAudioTrack webRtcAudioTrack2 = WebRtcAudioTrack.this;
                            i = WebRtcAudioTrack.access$900(webRtcAudioTrack2, WebRtcAudioTrack.access$000(webRtcAudioTrack2), WebRtcAudioTrack.access$200(WebRtcAudioTrack.this), capacity);
                        }
                        if (i != capacity) {
                            Logging.e(WebRtcAudioTrack.TAG, "AudioTrack.write played invalid number of bytes: " + i);
                            if (i < 0) {
                                WebRtcAudioTrack.access$302(WebRtcAudioTrack.this, false);
                                WebRtcAudioTrack webRtcAudioTrack3 = WebRtcAudioTrack.this;
                                WebRtcAudioTrack.access$1000(webRtcAudioTrack3, "AudioTrack.write failed: " + i);
                            }
                        }
                        WebRtcAudioTrack.access$200(WebRtcAudioTrack.this).rewind();
                    }
                    if (WebRtcAudioTrack.access$000(WebRtcAudioTrack.this) != null) {
                        Logging.d(WebRtcAudioTrack.TAG, "Calling AudioTrack.stop...");
                        try {
                            WebRtcAudioTrack.access$000(WebRtcAudioTrack.this).stop();
                            Logging.d(WebRtcAudioTrack.TAG, "AudioTrack.stop is done.");
                        } catch (IllegalStateException e) {
                            Logging.e(WebRtcAudioTrack.TAG, "AudioTrack.stop failed: " + e.getMessage());
                        }
                    }
                }
            });
            return true;
        } catch (IllegalStateException e) {
            JavaAudioDeviceModule.AudioTrackStartErrorCode audioTrackStartErrorCode2 = JavaAudioDeviceModule.AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION;
            reportWebRtcAudioTrackStartError(audioTrackStartErrorCode2, "AudioTrack.play failed: " + e.getMessage());
            releaseAudioResources();
            return false;
        }
    }

    private boolean stopPlayout() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a5af9c3", new Object[]{this})).booleanValue();
        }
        this.threadChecker.checkIsOnValidThread();
        this.volumeLogger.stop();
        Logging.d(TAG, "stopPlayout");
        if (this.audioThread != null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
        logUnderrunCount();
        this.keepAlive = false;
        Logging.d(TAG, "Stopping the AudioTrackThread...");
        if (!this.audioThread.d(2000L)) {
            Logging.e(TAG, "Join of AudioTrackThread timed out.");
            WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        }
        Logging.d(TAG, "AudioTrackThread has now been stopped.");
        this.audioThread = null;
        releaseAudioResources();
        return true;
    }

    private int writeOnLollipop(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d0e34ee4", new Object[]{this, audioTrack, byteBuffer, new Integer(i)})).intValue();
        }
        return audioTrack.write(byteBuffer, i, 0);
    }

    private int writePreLollipop(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2cbc1e0a", new Object[]{this, audioTrack, byteBuffer, new Integer(i)})).intValue();
        }
        return audioTrack.write(byteBuffer.array(), byteBuffer.arrayOffset(), i);
    }

    public void setNativeAudioTrack(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae14a8cf", new Object[]{this, new Long(j)});
        } else {
            this.nativeAudioTrack = j;
        }
    }

    public void setSpeakerMute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4761ff7", new Object[]{this, new Boolean(z)});
            return;
        }
        Logging.w(TAG, "setSpeakerMute(" + z + f7l.BRACKET_END_STR);
        this.speakerMute = z;
    }

    public WebRtcAudioTrack(Context context, AudioManager audioManager, JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        this.audioTrack = null;
        this.audioThread = null;
        this.keepAlive = true;
        this.speakerMute = false;
        threadChecker.detachThread();
        this.context = context;
        this.audioManager = audioManager;
        this.errorCallback = audioTrackErrorCallback;
        this.volumeLogger = new VolumeLogger(audioManager);
        if (ArtcDeviceInfo.is_tmall_cc()) {
            streamType = 3;
        }
    }
}
