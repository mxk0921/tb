package com.android.taobao.zstd;

import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.zstd.dict.ZstdDecompressDict;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ZstdStreamInflater {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ZstdStreamInflater";
    private byte[] buf = new byte[0];
    private int len = 0;
    private int off = 0;
    private int pos = 0;
    private boolean frameFinished = false;
    private long totalDecompressed = 0;
    private long totalRaw = 0;
    private long streamPtr = createDStream();

    static {
        Zstd.e();
        initIDs();
    }

    public ZstdStreamInflater() {
        Zstd.a();
    }

    private native long createDStream();

    private native int decompressStream(long j, byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4);

    private native int destroyDStream(long j);

    private void ensureOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4788582f", new Object[]{this});
        } else if (this.streamPtr == 0) {
            throw new IllegalStateException("ZstdStreamInflater has been closed");
        }
    }

    private static native void initIDs();

    private void resetStream(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4ed56ce", new Object[]{this, new Long(j)});
        } else {
            Zstd.g(j, 1);
        }
    }

    public boolean allInputDecompressed() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb14b716", new Object[]{this})).booleanValue();
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
                    destroyDStream(j);
                    this.streamPtr = 0L;
                    this.buf = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int decompress(byte[] bArr) throws IllegalArgumentException, IllegalStateException, ZstdException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c4f6e424", new Object[]{this, bArr})).intValue() : decompress(bArr, 0, bArr.length);
    }

    public void finalize() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
        } else {
            close();
        }
    }

    public boolean frameFinished() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b586fe0a", new Object[]{this})).booleanValue();
        }
        synchronized (this) {
            z = this.frameFinished;
        }
        return z;
    }

    public long getTotalDecompressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d81a03eb", new Object[]{this})).longValue();
        }
        return this.totalDecompressed;
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
            ZstdDecompressDict.b(this.streamPtr, bArr);
        }
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
            this.frameFinished = false;
            this.totalDecompressed = 0L;
            this.totalRaw = 0L;
        }
    }

    public void setDict(ZstdDecompressDict zstdDecompressDict) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c87d7d5a", new Object[]{this, zstdDecompressDict});
            return;
        }
        synchronized (this) {
            ensureOpen();
            ZstdDecompressDict.c(this.streamPtr, zstdDecompressDict);
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

    public int decompress(byte[] bArr, int i, int i2) throws IllegalArgumentException, IllegalStateException, ZstdException {
        int decompressStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("62dcfc44", new Object[]{this, bArr, new Integer(i), new Integer(i2)})).intValue();
        }
        if (bArr == null || i < 0 || i2 < 0 || i > bArr.length - i2) {
            throw new IllegalArgumentException();
        }
        synchronized (this) {
            ensureOpen();
            decompressStream = decompressStream(this.streamPtr, bArr, i, i2, this.buf, this.off, this.len);
            long j = decompressStream;
            Zstd.j(j);
            this.totalDecompressed += j;
        }
        return decompressStream;
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
