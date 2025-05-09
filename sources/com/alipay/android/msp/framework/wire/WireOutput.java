package com.alipay.android.msp.framework.wire;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import tb.cq1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class WireOutput {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f3696a;
    public final int b;
    public int c;

    public WireOutput(byte[] bArr, int i, int i2) {
        this.f3696a = bArr;
        this.c = i;
        this.b = i + i2;
    }

    public static int int32Size(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ee3b900", new Object[]{new Integer(i)})).intValue();
        }
        if (i >= 0) {
            return varint32Size(i);
        }
        return 10;
    }

    public static int int64Size(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3624b742", new Object[]{new Long(j)})).intValue();
        }
        if (j >= 0) {
            return varint64Size(j);
        }
        return 10;
    }

    public static int makeTag(int i, WireType wireType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ef9378d6", new Object[]{new Integer(i), wireType})).intValue();
        }
        return (i << 3) | wireType.value();
    }

    public static int messageHeaderSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e82802ef", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        return tagSize(i, WireType.LENGTH_DELIMITED) + int32Size(i2);
    }

    public static int messageSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1646b9c2", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        return tagSize(i, WireType.LENGTH_DELIMITED) + int32Size(i2) + i2;
    }

    public static WireOutput newInstance(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WireOutput) ipChange.ipc$dispatch("d1d7dfff", new Object[]{bArr}) : newInstance(bArr, 0, bArr.length);
    }

    public static int tagSize(int i, WireType wireType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("300b2c47", new Object[]{new Integer(i), wireType})).intValue();
        }
        return int32Size(makeTag(i, wireType));
    }

    public static int varint32Size(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("392a6fe7", new Object[]{new Integer(i)})).intValue();
        }
        if ((i & cq1.SIGN) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        if ((i & (-268435456)) == 0) {
            return 4;
        }
        return 5;
    }

    public static int varint64Size(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e06b6e29", new Object[]{new Long(j)})).intValue();
        }
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        if ((j & Long.MIN_VALUE) == 0) {
            return 9;
        }
        return 10;
    }

    public static int varintTagSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("66f168fc", new Object[]{new Integer(i)})).intValue();
        }
        return varint32Size(makeTag(i, WireType.VARINT));
    }

    public static int writeMessageHeader(int i, byte[] bArr, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1e4e881", new Object[]{new Integer(i), bArr, new Integer(i2), new Integer(i3)})).intValue();
        }
        int writeTag = writeTag(i, WireType.LENGTH_DELIMITED, bArr, i2) + i2;
        return (writeTag + writeVarint(i3, bArr, writeTag)) - i2;
    }

    public static int writeTag(int i, WireType wireType, byte[] bArr, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6e35d2bb", new Object[]{new Integer(i), wireType, bArr, new Integer(i2)})).intValue() : writeVarint(makeTag(i, wireType), bArr, i2);
    }

    public static int writeVarint(long j, byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("39f817f9", new Object[]{new Long(j), bArr, new Integer(i)})).intValue();
        }
        int i2 = i;
        while (((-128) & j) != 0) {
            bArr[i2] = (byte) ((127 & j) | 128);
            j >>>= 7;
            i2++;
        }
        bArr[i2] = (byte) j;
        return (1 + i2) - i;
    }

    public static int zigZag32(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("77765768", new Object[]{new Integer(i)})).intValue();
        }
        return (i >> 31) ^ (i << 1);
    }

    public static long zigZag64(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1992be2b", new Object[]{new Long(j)})).longValue();
        }
        return (j >> 63) ^ (j << 1);
    }

    public final void writeFixed32(int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2a8ffe8", new Object[]{this, new Integer(i)});
            return;
        }
        writeRawByte(i & 255);
        writeRawByte((i >> 8) & 255);
        writeRawByte((i >> 16) & 255);
        writeRawByte((i >> 24) & 255);
    }

    public final void writeFixed64(long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84c566aa", new Object[]{this, new Long(j)});
            return;
        }
        writeRawByte(((int) j) & 255);
        writeRawByte(((int) (j >> 8)) & 255);
        writeRawByte(((int) (j >> 16)) & 255);
        writeRawByte(((int) (j >> 24)) & 255);
        writeRawByte(((int) (j >> 32)) & 255);
        writeRawByte(((int) (j >> 40)) & 255);
        writeRawByte(((int) (j >> 48)) & 255);
        writeRawByte(((int) (j >> 56)) & 255);
    }

    public final void writeRawByte(byte b) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9275344", new Object[]{this, new Byte(b)});
            return;
        }
        int i = this.c;
        if (i != this.b) {
            byte[] bArr = this.f3696a;
            this.c = 1 + i;
            bArr[i] = b;
            return;
        }
        throw new IOException("Out of space: position=" + this.c + ", limit=" + this.b);
    }

    public final void writeRawBytes(byte[] bArr) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4792b030", new Object[]{this, bArr});
        } else {
            writeRawBytes(bArr, 0, bArr.length);
        }
    }

    public final void writeSignedVarint32(int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a547da", new Object[]{this, new Integer(i)});
        } else if (i >= 0) {
            writeVarint32(i);
        } else {
            writeVarint64(i);
        }
    }

    public final void writeVarint32(int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7bc2656", new Object[]{this, new Integer(i)});
            return;
        }
        while ((i & cq1.SIGN) != 0) {
            writeRawByte((i & 127) | 128);
            i >>>= 7;
        }
        writeRawByte(i);
    }

    public final void writeVarint64(long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79d88d18", new Object[]{this, new Long(j)});
            return;
        }
        while (((-128) & j) != 0) {
            writeRawByte((((int) j) & 127) | 128);
            j >>>= 7;
        }
        writeRawByte((int) j);
    }

    public static WireOutput newInstance(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WireOutput) ipChange.ipc$dispatch("d4fb05f", new Object[]{bArr, new Integer(i), new Integer(i2)}) : new WireOutput(bArr, i, i2);
    }

    public final void writeRawBytes(byte[] bArr, int i, int i2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adb5c490", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
            return;
        }
        int i3 = this.b;
        int i4 = this.c;
        if (i3 - i4 >= i2) {
            System.arraycopy(bArr, i, this.f3696a, i4, i2);
            this.c += i2;
            return;
        }
        throw new IOException("Out of space: position=" + this.c + ", limit=" + this.b);
    }

    public final void writeTag(int i, WireType wireType) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("345843d4", new Object[]{this, new Integer(i), wireType});
        } else {
            writeVarint32(makeTag(i, wireType));
        }
    }

    public final void writeRawByte(int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9276d8b", new Object[]{this, new Integer(i)});
        } else {
            writeRawByte((byte) i);
        }
    }
}
