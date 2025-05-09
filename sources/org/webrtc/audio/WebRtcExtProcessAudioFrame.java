package org.webrtc.audio;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import org.webrtc.RefCounted;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class WebRtcExtProcessAudioFrame implements RefCounted {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_OBSERVER = 0;
    public static final int TYPE_PLAYER = 2;
    public static final int TYPE_PROCESSOR = 1;
    private final ByteBuffer audioData;
    private final int audioLevel;
    private final int channels;
    private final boolean isSpeech;
    private final int rms_db;
    private final int samplePerChannel;
    private final int sampleRate;
    private final int type;

    static {
        t2o.a(395313878);
        t2o.a(395313798);
    }

    public WebRtcExtProcessAudioFrame(int i, int i2, int i3, int i4, boolean z, ByteBuffer byteBuffer, int i5, int i6) {
        this.sampleRate = i;
        this.channels = i2;
        this.samplePerChannel = i3;
        this.audioLevel = i4;
        this.isSpeech = z;
        this.audioData = byteBuffer;
        this.type = i5;
        this.rms_db = i6;
        retain();
    }

    public ByteBuffer getAudioData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("5366e032", new Object[]{this});
        }
        return this.audioData.slice();
    }

    public int getAudioDb() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d97d3838", new Object[]{this})).intValue();
        }
        return this.rms_db;
    }

    public int getAudioLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9934ffbe", new Object[]{this})).intValue();
        }
        return this.audioLevel;
    }

    public int getChannels() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5d15d2c0", new Object[]{this})).intValue();
        }
        return this.channels;
    }

    public int getSamplePerChannel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d261a760", new Object[]{this})).intValue();
        }
        return this.samplePerChannel;
    }

    public int getSampleRate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("da7fbe1a", new Object[]{this})).intValue();
        }
        return this.sampleRate;
    }

    public int getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
        }
        return this.type;
    }

    public boolean isSpeech() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5c44937", new Object[]{this})).booleanValue();
        }
        return this.isSpeech;
    }

    @Override // org.webrtc.RefCounted
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        }
    }

    @Override // org.webrtc.RefCounted
    public void retain() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e496b0c", new Object[]{this});
        }
    }
}
