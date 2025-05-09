package com.alipay.android.msp.framework.wire;

import com.alipay.android.msp.framework.okio.Buffer;
import com.alipay.android.msp.framework.okio.BufferedSource;
import com.alipay.android.msp.framework.okio.ByteString;
import com.alipay.android.msp.framework.okio.Okio;
import com.alipay.android.msp.framework.okio.Source;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import tb.c0z;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class WireInput {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int RECURSION_LIMIT = 64;
    public static final Charset e = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    public final BufferedSource f3695a;
    public int b = 0;
    public int c = Integer.MAX_VALUE;
    public int d;
    public int recursionDepth;

    /* compiled from: Taobao */
    /* renamed from: com.alipay.android.msp.framework.wire.WireInput$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$alipay$android$msp$framework$wire$WireType;

        static {
            int[] iArr = new int[WireType.values().length];
            $SwitchMap$com$alipay$android$msp$framework$wire$WireType = iArr;
            try {
                iArr[WireType.VARINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$wire$WireType[WireType.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$wire$WireType[WireType.FIXED64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$wire$WireType[WireType.LENGTH_DELIMITED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$wire$WireType[WireType.START_GROUP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$wire$WireType[WireType.END_GROUP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public WireInput(BufferedSource bufferedSource) {
        this.f3695a = bufferedSource;
    }

    public static int decodeZigZag32(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c158081a", new Object[]{new Integer(i)})).intValue();
        }
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long decodeZigZag64(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63746edd", new Object[]{new Long(j)})).longValue();
        }
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static WireInput newInstance(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WireInput) ipChange.ipc$dispatch("14e9a06c", new Object[]{bArr}) : new WireInput(new Buffer().write(bArr));
    }

    public final void checkLastTagWas(int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d8ee52f", new Object[]{this, new Integer(i)});
        } else if (this.d != i) {
            throw new IOException("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final long getPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("62e7f39a", new Object[]{this})).longValue();
        }
        return this.b;
    }

    public final void popLimit(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df22edb2", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public final int pushLimit(int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d05b432e", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i >= 0) {
            int i2 = i + this.b;
            int i3 = this.c;
            if (i2 <= i3) {
                this.c = i2;
                return i3;
            }
            throw new EOFException("The input ended unexpectedly in the middle of a field");
        }
        throw new IOException("Encountered a negative size");
    }

    public final ByteString readBytes() throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ByteString) ipChange.ipc$dispatch("5fdeedd0", new Object[]{this}) : readBytes(readVarint32());
    }

    public final int readFixed32() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e99f5857", new Object[]{this})).intValue();
        }
        this.b += 4;
        return this.f3695a.readIntLe();
    }

    public final long readFixed64() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eeda1137", new Object[]{this})).longValue();
        }
        this.b += 8;
        return this.f3695a.readLongLe();
    }

    public final String readString() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ab067412", new Object[]{this});
        }
        int readVarint32 = readVarint32();
        this.b += readVarint32;
        return this.f3695a.readString(readVarint32, e);
    }

    public final int readTag() throws IOException {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7787509e", new Object[]{this})).intValue();
        }
        if (getPosition() != this.c) {
            z = this.f3695a.exhausted();
        }
        if (z) {
            this.d = 0;
            return 0;
        }
        int readVarint32 = readVarint32();
        this.d = readVarint32;
        if (readVarint32 != 0) {
            return readVarint32;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    public final int readVarint32() throws IOException {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("34ca3d77", new Object[]{this})).intValue();
        }
        this.b++;
        byte readByte = this.f3695a.readByte();
        if (readByte >= 0) {
            return readByte;
        }
        int i2 = readByte & Byte.MAX_VALUE;
        this.b++;
        byte readByte2 = this.f3695a.readByte();
        if (readByte2 >= 0) {
            i = readByte2 << 7;
        } else {
            i2 |= (readByte2 & Byte.MAX_VALUE) << 7;
            this.b++;
            byte readByte3 = this.f3695a.readByte();
            if (readByte3 >= 0) {
                i = readByte3 << 14;
            } else {
                i2 |= (readByte3 & Byte.MAX_VALUE) << 14;
                this.b++;
                byte readByte4 = this.f3695a.readByte();
                if (readByte4 >= 0) {
                    i = readByte4 << 21;
                } else {
                    int i3 = i2 | ((readByte4 & Byte.MAX_VALUE) << 21);
                    this.b++;
                    byte readByte5 = this.f3695a.readByte();
                    int i4 = i3 | (readByte5 << 28);
                    if (readByte5 >= 0) {
                        return i4;
                    }
                    for (int i5 = 0; i5 < 5; i5++) {
                        this.b++;
                        if (this.f3695a.readByte() >= 0) {
                            return i4;
                        }
                    }
                    throw new IOException("WireInput encountered a malformed varint.");
                }
            }
        }
        return i | i2;
    }

    public final long readVarint64() throws IOException {
        byte readByte;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a04f657", new Object[]{this})).longValue();
        }
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            this.b++;
            j |= (readByte & Byte.MAX_VALUE) << i;
            if ((this.f3695a.readByte() & c0z.STATE) == 0) {
                return j;
            }
        }
        throw new IOException("WireInput encountered a malformed varint.");
    }

    public final void skipGroup() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d061cc7", new Object[]{this});
            return;
        }
        while (true) {
            int readTag = readTag();
            if (readTag != 0) {
                switch (AnonymousClass1.$SwitchMap$com$alipay$android$msp$framework$wire$WireType[WireType.valueOf(readTag).ordinal()]) {
                    case 1:
                        readVarint64();
                        break;
                    case 2:
                        readFixed32();
                        break;
                    case 3:
                        readFixed64();
                        break;
                    case 4:
                        long readVarint32 = readVarint32();
                        this.b = (int) (this.b + readVarint32);
                        this.f3695a.skip(readVarint32);
                        break;
                    case 5:
                        skipGroup();
                        checkLastTagWas((readTag & (-8)) | WireType.END_GROUP.value());
                        break;
                    case 6:
                        return;
                    default:
                        throw new AssertionError();
                }
            } else {
                return;
            }
        }
    }

    public static WireInput newInstance(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WireInput) ipChange.ipc$dispatch("dd06440c", new Object[]{bArr, new Integer(i), new Integer(i2)}) : new WireInput(new Buffer().write(bArr, i, i2));
    }

    public static WireInput newInstance(InputStream inputStream) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WireInput) ipChange.ipc$dispatch("49348e00", new Object[]{inputStream}) : new WireInput(Okio.buffer(Okio.source(inputStream)));
    }

    public final ByteString readBytes(int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteString) ipChange.ipc$dispatch("8a480ba5", new Object[]{this, new Integer(i)});
        }
        this.b += i;
        long j = i;
        this.f3695a.require(j);
        return this.f3695a.readByteString(j);
    }

    public static WireInput newInstance(Source source) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WireInput) ipChange.ipc$dispatch("c858bdf9", new Object[]{source}) : new WireInput(Okio.buffer(source));
    }
}
