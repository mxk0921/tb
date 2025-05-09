package org.webrtc;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import org.webrtc.VideoFrame;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class WrappedNativeI420Buffer implements VideoFrame.I420Buffer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final ByteBuffer dataU;
    private final ByteBuffer dataV;
    private final ByteBuffer dataY;
    private final int height;
    private final long nativeBuffer;
    private final int strideU;
    private final int strideV;
    private final int strideY;
    private final int width;

    static {
        t2o.a(395313853);
        t2o.a(395313845);
    }

    public WrappedNativeI420Buffer(int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5, long j) {
        this.width = i;
        this.height = i2;
        this.dataY = byteBuffer;
        this.strideY = i3;
        this.dataU = byteBuffer2;
        this.strideU = i4;
        this.dataV = byteBuffer3;
        this.strideV = i5;
        this.nativeBuffer = j;
        retain();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoFrame.Buffer) ipChange.ipc$dispatch("35ed0960", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
        }
        return VideoFrame.cropAndScaleI420(this, i, i2, i3, i4, i5, i6);
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int describe(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20545325", new Object[]{this, new Long(j)})).intValue();
        }
        return -1;
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public ByteBuffer getDataU() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("40da857d", new Object[]{this});
        }
        return this.dataU.slice();
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public ByteBuffer getDataV() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("c50ad27e", new Object[]{this});
        }
        return this.dataV.slice();
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public ByteBuffer getDataY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("519bb981", new Object[]{this});
        }
        return this.dataY.slice();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        return this.height;
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public int getStrideU() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6aba99e0", new Object[]{this})).intValue();
        }
        return this.strideU;
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public int getStrideV() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ac8b161", new Object[]{this})).intValue();
        }
        return this.strideV;
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public int getStrideY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6af2f7e4", new Object[]{this})).intValue();
        }
        return this.strideY;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        return this.width;
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else {
            JniCommon.nativeReleaseRef(this.nativeBuffer);
        }
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void retain() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e496b0c", new Object[]{this});
        } else {
            JniCommon.nativeAddRef(this.nativeBuffer);
        }
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoFrame.I420Buffer) ipChange.ipc$dispatch("7a137356", new Object[]{this});
        }
        retain();
        return this;
    }
}
