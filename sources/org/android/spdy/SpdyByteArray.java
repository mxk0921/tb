package org.android.spdy;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SpdyByteArray implements Comparable<SpdyByteArray> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private byte[] byteArray;
    public int dataLength;
    private boolean isDirectBuffer;
    public int length;
    private ByteBuffer mByteBuffer;

    public SpdyByteArray() {
        this.mByteBuffer = null;
        this.isDirectBuffer = false;
        this.byteArray = null;
        this.length = 0;
        this.dataLength = 0;
    }

    public byte[] getByteArray() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("87dd8a9b", new Object[]{this});
        }
        return this.byteArray;
    }

    public ByteBuffer getByteBuffer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("2139e1a6", new Object[]{this});
        }
        return this.mByteBuffer;
    }

    public int getDataLength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2bf868a0", new Object[]{this})).intValue();
        }
        return this.dataLength;
    }

    public boolean isUseDirectBuffer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("707543b1", new Object[]{this})).booleanValue();
        }
        return this.isDirectBuffer;
    }

    public void recycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51af759a", new Object[]{this});
            return;
        }
        Arrays.fill(this.byteArray, (byte) 0);
        this.dataLength = 0;
        this.mByteBuffer = null;
        SpdyBytePool.getInstance().recycle(this);
    }

    public void setByteArrayDataLength(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a757923d", new Object[]{this, new Integer(i)});
        } else {
            this.dataLength = i;
        }
    }

    public void setDirectBufferMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("550c989f", new Object[]{this, new Boolean(z)});
        } else {
            this.isDirectBuffer = z;
        }
    }

    public void setDirectByteBuffer(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfd009d7", new Object[]{this, byteBuffer});
        } else {
            this.mByteBuffer = byteBuffer;
        }
    }

    public int compareTo(SpdyByteArray spdyByteArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4733a5bc", new Object[]{this, spdyByteArray})).intValue();
        }
        int i = this.length;
        int i2 = spdyByteArray.length;
        if (i != i2) {
            return i - i2;
        }
        if (this.byteArray == null) {
            return -1;
        }
        if (spdyByteArray.byteArray == null) {
            return 1;
        }
        return hashCode() - spdyByteArray.hashCode();
    }

    public SpdyByteArray(int i) {
        this.mByteBuffer = null;
        this.isDirectBuffer = false;
        this.byteArray = new byte[i];
        this.length = i;
        this.dataLength = 0;
    }
}
