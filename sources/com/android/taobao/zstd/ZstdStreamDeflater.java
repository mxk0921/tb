package com.android.taobao.zstd;

import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.zstd.dict.ZstdCompressDict;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ZstdStreamDeflater {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ZstdStreamDeflater";
    private byte[] buf;
    private int len;
    private int level;
    private int off;
    private int pos;
    private int remain;
    private long streamPtr;
    private long totalCompressed;
    private long totalRaw;

    static {
        Zstd.e();
        initIDs();
    }

    public ZstdStreamDeflater() {
        this(3);
    }

    public static native long compressBufferBound(long j);

    private native int compressStream(long j, byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4);

    private native long createStream();

    private native int destroyStream(long j);

    private void ensureOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4788582f", new Object[]{this});
        } else if (this.streamPtr == 0) {
            throw new IllegalStateException("ZstdStreamDeflater has been closed");
        }
    }

    private int flushEnd(byte[] bArr, int i, int i2, boolean z) throws IllegalArgumentException, IllegalStateException, ZstdException {
        int flushEndStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("564b7ec2", new Object[]{this, bArr, new Integer(i), new Integer(i2), new Boolean(z)})).intValue();
        }
        if (bArr == null || i < 0 || i2 < 0 || i > bArr.length - i2) {
            throw new IllegalArgumentException();
        }
        synchronized (this) {
            ensureOpen();
            flushEndStream = flushEndStream(this.streamPtr, bArr, i, i2, z);
            long j = flushEndStream;
            Zstd.j(j);
            this.totalCompressed += j;
        }
        return flushEndStream;
    }

    private native int flushEndStream(long j, byte[] bArr, int i, int i2, boolean z);

    private static native void initIDs();

    private void resetStream(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4ed56ce", new Object[]{this, new Long(j)});
        } else {
            Zstd.f(j, 1);
        }
    }

    public boolean allInputCompressed() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90ebbe95", new Object[]{this})).booleanValue();
        }
        synchronized (this) {
            try {
                int i = this.len;
                if (i != 0) {
                    if (this.pos == i) {
                    }
                }
                z = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        synchronized (this) {
            try {
                long j = this.streamPtr;
                if (j != 0) {
                    destroyStream(j);
                    this.streamPtr = 0L;
                    this.buf = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int compress(byte[] bArr) throws IllegalArgumentException, IllegalStateException, ZstdException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("346b4d63", new Object[]{this, bArr})).intValue() : compress(bArr, 0, bArr.length);
    }

    public void finalize() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
        } else {
            close();
        }
    }

    public int finish(byte[] bArr, int i, int i2) throws IllegalArgumentException, IllegalStateException, ZstdException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b885f1f4", new Object[]{this, bArr, new Integer(i), new Integer(i2)})).intValue() : flushEnd(bArr, i, i2, false);
    }

    public int flush(byte[] bArr, int i, int i2) throws IllegalArgumentException, IllegalStateException, ZstdException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d9f39f65", new Object[]{this, bArr, new Integer(i), new Integer(i2)})).intValue() : flushEnd(bArr, i, i2, true);
    }

    public long getTotalCompressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c3900aa", new Object[]{this})).longValue();
        }
        return this.totalCompressed;
    }

    public long getTotalRaw() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bcb6c335", new Object[]{this})).longValue();
        }
        return this.totalRaw;
    }

    public void loadDict(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0de184a", new Object[]{this, bArr});
            return;
        }
        synchronized (this) {
            ensureOpen();
            ZstdCompressDict.a(this.streamPtr, bArr);
        }
    }

    public boolean remainCompressedData() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72cdc562", new Object[]{this})).booleanValue();
        }
        synchronized (this) {
            if (this.remain > 0) {
                z = true;
            }
        }
        return z;
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        synchronized (this) {
            ensureOpen();
            resetStream(this.streamPtr);
            this.len = 0;
            this.off = 0;
            this.pos = 0;
            this.remain = 0;
            this.totalCompressed = 0L;
            this.totalRaw = 0L;
        }
    }

    public void setChecksum(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7044b788", new Object[]{this, new Boolean(z)});
            return;
        }
        synchronized (this) {
            ensureOpen();
            Zstd.h(this.streamPtr, z);
        }
    }

    public void setDict(ZstdCompressDict zstdCompressDict) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("518cdabb", new Object[]{this, zstdCompressDict});
            return;
        }
        synchronized (this) {
            ensureOpen();
            ZstdCompressDict.b(this.streamPtr, zstdCompressDict);
        }
    }

    public void setInput(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f866b8f6", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
        } else if (bArr == null || i < 0 || i2 < 0 || i > bArr.length - i2) {
            throw new IllegalArgumentException();
        } else {
            synchronized (this) {
                this.buf = bArr;
                this.off = i;
                this.len = i2;
                this.pos = 0;
                this.totalRaw += i2;
            }
        }
    }

    public void setLevel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25e77c5a", new Object[]{this, new Integer(i)});
            return;
        }
        synchronized (this) {
            try {
                if (this.level != i) {
                    this.level = i;
                    ensureOpen();
                    Zstd.i(this.streamPtr, i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ZstdStreamDeflater(int i) {
        Zstd.a();
        this.buf = new byte[0];
        this.len = 0;
        this.off = 0;
        this.pos = 0;
        this.remain = 0;
        this.totalCompressed = 0L;
        this.totalRaw = 0L;
        this.level = 3;
        this.streamPtr = createStream();
        setLevel(i);
    }

    public int compress(byte[] bArr, int i, int i2) throws IllegalArgumentException, IllegalStateException, ZstdException {
        int compressStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c6dc11c3", new Object[]{this, bArr, new Integer(i), new Integer(i2)})).intValue();
        }
        if (bArr == null || i < 0 || i2 < 0 || i > bArr.length - i2) {
            throw new IllegalArgumentException();
        }
        synchronized (this) {
            ensureOpen();
            compressStream = compressStream(this.streamPtr, bArr, i, i2, this.buf, this.off, this.len);
            long j = compressStream;
            Zstd.j(j);
            this.totalCompressed += j;
        }
        return compressStream;
    }

    public int finish(byte[] bArr) throws IllegalArgumentException, IllegalStateException, ZstdException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("62c185d4", new Object[]{this, bArr})).intValue() : finish(bArr, 0, bArr.length);
    }

    public int flush(byte[] bArr) throws IllegalArgumentException, IllegalStateException, ZstdException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9deddb85", new Object[]{this, bArr})).intValue() : flush(bArr, 0, bArr.length);
    }

    public void setInput(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1aa18616", new Object[]{this, bArr});
        } else {
            setInput(bArr, 0, bArr.length);
        }
    }
}
