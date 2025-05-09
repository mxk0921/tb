package com.heytap.msp.push.encrypt;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import tb.t2o;
import tb.xrq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class BaseNCodec {
    private static final int DEFAULT_BUFFER_RESIZE_FACTOR = 2;
    private static final int DEFAULT_BUFFER_SIZE = 8192;
    protected static final int MASK_8BITS = 255;
    public static final int MIME_CHUNK_SIZE = 76;
    protected static final byte PAD_DEFAULT = 61;
    public static final int PEM_CHUNK_SIZE = 64;
    protected final byte PAD = 61;
    protected byte[] buffer;
    private final int chunkSeparatorLength;
    protected int currentLinePos;
    private final int encodedBlockSize;
    protected boolean eof;
    protected final int lineLength;
    protected int modulus;
    protected int pos;
    private int readPos;
    private final int unencodedBlockSize;

    static {
        t2o.a(612368446);
    }

    public BaseNCodec(int i, int i2, int i3, int i4) {
        int i5;
        this.unencodedBlockSize = i;
        this.encodedBlockSize = i2;
        if (i3 <= 0 || i4 <= 0) {
            i5 = 0;
        } else {
            i5 = (i3 / i2) * i2;
        }
        this.lineLength = i5;
        this.chunkSeparatorLength = i4;
    }

    public static boolean isWhiteSpace(byte b) {
        if (b == 9 || b == 10 || b == 13 || b == 32) {
            return true;
        }
        return false;
    }

    private void reset() {
        this.buffer = null;
        this.pos = 0;
        this.readPos = 0;
        this.currentLinePos = 0;
        this.modulus = 0;
        this.eof = false;
    }

    private void resizeBuffer() {
        byte[] bArr = this.buffer;
        if (bArr == null) {
            this.buffer = new byte[getDefaultBufferSize()];
            this.pos = 0;
            this.readPos = 0;
            return;
        }
        byte[] bArr2 = new byte[bArr.length * 2];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        this.buffer = bArr2;
    }

    public int available() {
        if (this.buffer != null) {
            return this.pos - this.readPos;
        }
        return 0;
    }

    public boolean containsAlphabetOrPad(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b : bArr) {
            if (61 == b || isInAlphabet(b)) {
                return true;
            }
        }
        return false;
    }

    public Object decode(Object obj) throws DecoderException {
        if (obj instanceof byte[]) {
            return decode((byte[]) obj);
        }
        if (obj instanceof String) {
            return decode((String) obj);
        }
        throw new DecoderException("Parameter supplied to Base-N decode is not a byte[] or a String");
    }

    public abstract void decode(byte[] bArr, int i, int i2);

    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof byte[]) {
            return encode((byte[]) obj);
        }
        throw new EncoderException("Parameter supplied to Base-N encode is not a byte[]");
    }

    public abstract void encode(byte[] bArr, int i, int i2);

    public String encodeAsString(byte[] bArr) {
        return xrq.e(encode(bArr));
    }

    public String encodeToString(byte[] bArr) {
        return xrq.e(encode(bArr));
    }

    public void ensureBufferSize(int i) {
        byte[] bArr = this.buffer;
        if (bArr == null || bArr.length < this.pos + i) {
            resizeBuffer();
        }
    }

    public int getDefaultBufferSize() {
        return 8192;
    }

    public long getEncodedLength(byte[] bArr) {
        int length = bArr.length;
        int i = this.unencodedBlockSize;
        long j = (((length + i) - 1) / i) * this.encodedBlockSize;
        int i2 = this.lineLength;
        if (i2 > 0) {
            return j + ((((i2 + j) - 1) / i2) * this.chunkSeparatorLength);
        }
        return j;
    }

    public boolean hasData() {
        if (this.buffer != null) {
            return true;
        }
        return false;
    }

    public abstract boolean isInAlphabet(byte b);

    public boolean isInAlphabet(byte[] bArr, boolean z) {
        byte b;
        for (int i = 0; i < bArr.length; i++) {
            if (!(isInAlphabet(bArr[i]) || (z && ((b = bArr[i]) == 61 || isWhiteSpace(b))))) {
                return false;
            }
        }
        return true;
    }

    public int readResults(byte[] bArr, int i, int i2) {
        if (this.buffer != null) {
            int min = Math.min(available(), i2);
            System.arraycopy(this.buffer, this.readPos, bArr, i, min);
            int i3 = this.readPos + min;
            this.readPos = i3;
            if (i3 >= this.pos) {
                this.buffer = null;
            }
            return min;
        } else if (this.eof) {
            return -1;
        } else {
            return 0;
        }
    }

    public byte[] encode(byte[] bArr) {
        reset();
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        encode(bArr, 0, bArr.length);
        encode(bArr, 0, -1);
        int i = this.pos - this.readPos;
        byte[] bArr2 = new byte[i];
        readResults(bArr2, 0, i);
        return bArr2;
    }

    public boolean isInAlphabet(String str) {
        return isInAlphabet(xrq.b(str), true);
    }

    public byte[] decode(String str) {
        return decode(xrq.b(str));
    }

    public byte[] decode(byte[] bArr) {
        reset();
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        decode(bArr, 0, bArr.length);
        decode(bArr, 0, -1);
        int i = this.pos;
        byte[] bArr2 = new byte[i];
        readResults(bArr2, 0, i);
        return bArr2;
    }
}
