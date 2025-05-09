package org.webrtc;

import android.graphics.Matrix;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class VideoFrame implements RefCounted {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Buffer buffer;
    private boolean hasPreviewBuffer;
    private Buffer previewBuffer;
    private int previewType;
    private final int rotation;
    private long timestampNs;
    private final int type;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface Buffer extends RefCounted {
        Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6);

        int describe(long j);

        int getHeight();

        int getWidth();

        @Override // org.webrtc.RefCounted
        void release();

        @Override // org.webrtc.RefCounted
        void retain();

        I420Buffer toI420();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface I420Buffer extends Buffer {
        ByteBuffer getDataU();

        ByteBuffer getDataV();

        ByteBuffer getDataY();

        int getStrideU();

        int getStrideV();

        int getStrideY();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface TextureBuffer extends Buffer {

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
        public enum Type {
            OES(36197),
            RGB(3553);
            
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private final int glTarget;

            Type(int i) {
                this.glTarget = i;
            }

            public static /* synthetic */ Object ipc$super(Type type, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in org/webrtc/VideoFrame$TextureBuffer$Type");
            }

            public static Type valueOf(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Type) ipChange.ipc$dispatch("23eddb8e", new Object[]{str});
                }
                return (Type) Enum.valueOf(Type.class, str);
            }

            public int getGlTarget() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("dda826c6", new Object[]{this})).intValue();
                }
                return this.glTarget;
            }
        }

        int getTextureId();

        Matrix getTransformMatrix();

        Type getType();
    }

    static {
        t2o.a(395313842);
        t2o.a(395313798);
    }

    public VideoFrame(Buffer buffer, int i, long j) {
        this.hasPreviewBuffer = false;
        if (buffer == null) {
            throw new IllegalArgumentException("buffer not allowed to be null");
        } else if (i % 90 == 0) {
            this.buffer = buffer;
            this.rotation = i;
            this.timestampNs = j;
            this.type = !(buffer instanceof TextureBuffer) ? 1 : 0;
        } else {
            throw new IllegalArgumentException("rotation must be a multiple of 90");
        }
    }

    public static Buffer cropAndScaleI420(final I420Buffer i420Buffer, int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Buffer) ipChange.ipc$dispatch("d471c62c", new Object[]{i420Buffer, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
        }
        if (i3 == i5 && i4 == i6) {
            ByteBuffer dataY = i420Buffer.getDataY();
            ByteBuffer dataU = i420Buffer.getDataU();
            ByteBuffer dataV = i420Buffer.getDataV();
            dataY.position((i420Buffer.getStrideY() * i2) + i);
            int i7 = i / 2;
            int i8 = i2 / 2;
            dataU.position((i420Buffer.getStrideU() * i8) + i7);
            dataV.position(i7 + (i8 * i420Buffer.getStrideV()));
            i420Buffer.retain();
            return JavaI420Buffer.wrap(i5, i6, dataY.slice(), i420Buffer.getStrideY(), dataU.slice(), i420Buffer.getStrideU(), dataV.slice(), i420Buffer.getStrideV(), new Runnable() { // from class: org.webrtc.VideoFrame.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        I420Buffer.this.release();
                    }
                }
            });
        }
        JavaI420Buffer allocate = JavaI420Buffer.allocate(i5, i6);
        nativeCropAndScaleI420(i420Buffer.getDataY(), i420Buffer.getStrideY(), i420Buffer.getDataU(), i420Buffer.getStrideU(), i420Buffer.getDataV(), i420Buffer.getStrideV(), i, i2, i3, i4, allocate.getDataY(), allocate.getStrideY(), allocate.getDataU(), allocate.getStrideU(), allocate.getDataV(), allocate.getStrideV(), i5, i6);
        return allocate;
    }

    private static native void nativeCropAndScaleI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, ByteBuffer byteBuffer4, int i8, ByteBuffer byteBuffer5, int i9, ByteBuffer byteBuffer6, int i10, int i11, int i12);

    public Buffer getBuffer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Buffer) ipChange.ipc$dispatch("a0cbb28d", new Object[]{this});
        }
        return this.buffer;
    }

    public Buffer getPreviewBuffer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Buffer) ipChange.ipc$dispatch("f1f996d1", new Object[]{this});
        }
        return this.previewBuffer;
    }

    public int getPreviewType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8c6b866", new Object[]{this})).intValue();
        }
        return this.previewType;
    }

    public int getRotatedHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6eee2cb4", new Object[]{this})).intValue();
        }
        if (this.rotation % 180 == 0) {
            return this.buffer.getHeight();
        }
        return this.buffer.getWidth();
    }

    public int getRotatedWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e4cc3e4d", new Object[]{this})).intValue();
        }
        if (this.rotation % 180 == 0) {
            return this.buffer.getWidth();
        }
        return this.buffer.getHeight();
    }

    public int getRotation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c471376e", new Object[]{this})).intValue();
        }
        return this.rotation;
    }

    public long getTimestampNs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("83b56640", new Object[]{this})).longValue();
        }
        return this.timestampNs;
    }

    public int getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
        }
        return this.type;
    }

    public boolean hasPreviewBuffer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("882e9339", new Object[]{this})).booleanValue();
        }
        return this.hasPreviewBuffer;
    }

    @Override // org.webrtc.RefCounted
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else {
            this.buffer.release();
        }
    }

    @Override // org.webrtc.RefCounted
    public void retain() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e496b0c", new Object[]{this});
        } else {
            this.buffer.retain();
        }
    }

    public void setTimestampNs(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96f46f04", new Object[]{this, new Long(j)});
        } else {
            this.timestampNs = j;
        }
    }

    public VideoFrame(Buffer buffer, Buffer buffer2, int i, long j) {
        this.hasPreviewBuffer = false;
        if (buffer == null) {
            throw new IllegalArgumentException("buffer not allowed to be null");
        } else if (buffer2 == null) {
            throw new IllegalArgumentException("preview buffer not allowed to be null");
        } else if (i % 90 == 0) {
            this.buffer = buffer;
            this.previewBuffer = buffer2;
            this.rotation = i;
            this.timestampNs = j;
            this.type = !(buffer instanceof TextureBuffer) ? 1 : 0;
            this.previewType = !(buffer2 instanceof TextureBuffer) ? 1 : 0;
            this.hasPreviewBuffer = true;
        } else {
            throw new IllegalArgumentException("rotation must be a multiple of 90");
        }
    }
}
