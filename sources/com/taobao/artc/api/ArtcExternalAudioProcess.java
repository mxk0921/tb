package com.taobao.artc.api;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.internal.IArtcExternalAudioProcessCallback;
import java.nio.ByteBuffer;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ArtcExternalAudioProcess {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BYTE_PER_SAMPLE = 2;
    private static final int MAX_AUDIO_DATA_SIZE = 1024;
    private int targetSampleRate = 48000;
    private IArtcExternalAudioProcessCallback observerCallback = null;
    private IArtcExternalAudioProcessCallback processCallback = null;
    private IArtcExternalAudioProcessCallback playoutCallback = null;
    private boolean localAED = false;
    private boolean observerPlayout = false;
    private byte[] audioData = new byte[1024];
    private ByteBuffer audioDataBuffer = ByteBuffer.allocateDirect(1024);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum ArtcExtProcessAudioFrameType {
        E_OBSERVER,
        E_PROCESSOR,
        E_PLAYER;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ArtcExtProcessAudioFrameType artcExtProcessAudioFrameType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/artc/api/ArtcExternalAudioProcess$ArtcExtProcessAudioFrameType");
        }

        public static ArtcExtProcessAudioFrameType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArtcExtProcessAudioFrameType) ipChange.ipc$dispatch("db70f5dc", new Object[]{str});
            }
            return (ArtcExtProcessAudioFrameType) Enum.valueOf(ArtcExtProcessAudioFrameType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class AudioFrame {
        public byte[] audio_data;
        public int audio_data_len;
        public int audio_level;
        public int channels;
        public boolean is_speech;
        public int sample_per_channel;
        public int sample_rate;

        static {
            t2o.a(395313181);
        }
    }

    static {
        t2o.a(395313179);
    }

    public ByteBuffer getAudioDataBuffer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("81e12912", new Object[]{this});
        }
        return this.audioDataBuffer;
    }

    public int getTargetSampleRate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f426598b", new Object[]{this})).intValue();
        }
        return this.targetSampleRate;
    }

    public boolean isObserverPlayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d3828e5", new Object[]{this})).booleanValue();
        }
        return this.observerPlayout;
    }

    public boolean localAEDEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ecd87c3", new Object[]{this})).booleanValue();
        }
        return this.localAED;
    }

    public void onAudioData(int i, int i2, boolean z, int i3, boolean z2, boolean z3) {
        IArtcExternalAudioProcessCallback iArtcExternalAudioProcessCallback;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b256ad57", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z), new Integer(i3), new Boolean(z2), new Boolean(z3)});
            return;
        }
        AudioFrame audioFrame = new AudioFrame();
        int i4 = i * i2 * 2;
        audioFrame.audio_data_len = i4;
        this.audioDataBuffer.get(this.audioData, 0, i4);
        this.audioDataBuffer.rewind();
        audioFrame.audio_data = this.audioData;
        audioFrame.channels = i2;
        audioFrame.sample_per_channel = i;
        if (!z3) {
            audioFrame.audio_level = i3;
            audioFrame.is_speech = z2;
            if (!z || (iArtcExternalAudioProcessCallback = this.observerCallback) == null) {
                int i5 = i * 100;
                audioFrame.sample_rate = i5;
                IArtcExternalAudioProcessCallback iArtcExternalAudioProcessCallback2 = this.observerCallback;
                if (iArtcExternalAudioProcessCallback2 != null && this.targetSampleRate == i5) {
                    iArtcExternalAudioProcessCallback2.onProcessAudioFrame(audioFrame);
                }
                IArtcExternalAudioProcessCallback iArtcExternalAudioProcessCallback3 = this.processCallback;
                if (iArtcExternalAudioProcessCallback3 != null) {
                    iArtcExternalAudioProcessCallback3.onProcessAudioFrame(audioFrame);
                    this.audioDataBuffer.put(audioFrame.audio_data);
                    this.audioDataBuffer.rewind();
                    return;
                }
                return;
            }
            audioFrame.sample_rate = this.targetSampleRate;
            iArtcExternalAudioProcessCallback.onProcessAudioFrame(audioFrame);
            return;
        }
        IArtcExternalAudioProcessCallback iArtcExternalAudioProcessCallback4 = this.playoutCallback;
        if (iArtcExternalAudioProcessCallback4 != null) {
            iArtcExternalAudioProcessCallback4.onProcessAudioFrame(audioFrame);
            this.audioDataBuffer.put(audioFrame.audio_data);
            this.audioDataBuffer.rewind();
        }
    }

    public void onTrtcAudioFrame(AudioFrame audioFrame, ArtcExtProcessAudioFrameType artcExtProcessAudioFrameType) {
        IArtcExternalAudioProcessCallback iArtcExternalAudioProcessCallback;
        IArtcExternalAudioProcessCallback iArtcExternalAudioProcessCallback2;
        IArtcExternalAudioProcessCallback iArtcExternalAudioProcessCallback3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffb630e2", new Object[]{this, audioFrame, artcExtProcessAudioFrameType});
        } else if (artcExtProcessAudioFrameType == ArtcExtProcessAudioFrameType.E_OBSERVER && (iArtcExternalAudioProcessCallback3 = this.observerCallback) != null) {
            iArtcExternalAudioProcessCallback3.onProcessAudioFrame(audioFrame);
        } else if (artcExtProcessAudioFrameType == ArtcExtProcessAudioFrameType.E_PROCESSOR && (iArtcExternalAudioProcessCallback2 = this.processCallback) != null) {
            iArtcExternalAudioProcessCallback2.onProcessAudioFrame(audioFrame);
        } else if (artcExtProcessAudioFrameType == ArtcExtProcessAudioFrameType.E_PLAYER && (iArtcExternalAudioProcessCallback = this.playoutCallback) != null) {
            iArtcExternalAudioProcessCallback.onProcessAudioFrame(audioFrame);
        }
    }

    public void setLocalAEDEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f158bf33", new Object[]{this, new Boolean(z)});
        } else {
            this.localAED = z;
        }
    }

    public void setObserverCallback(IArtcExternalAudioProcessCallback iArtcExternalAudioProcessCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("292d5057", new Object[]{this, iArtcExternalAudioProcessCallback});
        } else {
            this.observerCallback = iArtcExternalAudioProcessCallback;
        }
    }

    public void setPlayoutCallback(IArtcExternalAudioProcessCallback iArtcExternalAudioProcessCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce334fd7", new Object[]{this, iArtcExternalAudioProcessCallback});
            return;
        }
        this.playoutCallback = iArtcExternalAudioProcessCallback;
        this.observerPlayout = true;
    }

    public void setProcessCallback(IArtcExternalAudioProcessCallback iArtcExternalAudioProcessCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0ccb9ac", new Object[]{this, iArtcExternalAudioProcessCallback});
        } else {
            this.processCallback = iArtcExternalAudioProcessCallback;
        }
    }

    public boolean setTargetSampleRate(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60b7fee3", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i != 48000 && i != 32000 && i != 16000 && i != 8000) {
            return false;
        }
        this.targetSampleRate = i;
        return true;
    }
}
