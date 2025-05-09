package tb;

import com.squareup.wire.WireType;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import okio.BufferedSource;
import okio.ByteString;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class iix {
    public static final int RECURSION_LIMIT = 64;
    public static final Charset f = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    public final BufferedSource f21335a;
    public int b = 0;
    public int c = Integer.MAX_VALUE;
    public int d;
    public int e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21336a;

        static {
            int[] iArr = new int[WireType.values().length];
            f21336a = iArr;
            try {
                iArr[WireType.VARINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21336a[WireType.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21336a[WireType.FIXED64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21336a[WireType.LENGTH_DELIMITED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21336a[WireType.START_GROUP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21336a[WireType.END_GROUP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public iix(BufferedSource bufferedSource) {
        this.f21335a = bufferedSource;
    }

    public static int b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static iix f(byte[] bArr) {
        okio.a aVar = new okio.a();
        aVar.B0(bArr);
        return new iix(aVar);
    }

    public void a(int i) throws IOException {
        if (this.e != i) {
            throw new IOException("Protocol message end-group tag did not match expected tag.");
        }
    }

    public long d() {
        return this.b;
    }

    public final boolean e() throws IOException {
        if (d() == this.c) {
            return true;
        }
        return this.f21335a.exhausted();
    }

    public void g(int i) {
        this.c = i;
    }

    public int h(int i) throws IOException {
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

    public ByteString i() throws IOException {
        return j(o());
    }

    public ByteString j(int i) throws IOException {
        this.b += i;
        long j = i;
        BufferedSource bufferedSource = this.f21335a;
        bufferedSource.require(j);
        return bufferedSource.readByteString(j);
    }

    public int k() throws IOException {
        this.b += 4;
        return this.f21335a.readIntLe();
    }

    public long l() throws IOException {
        this.b += 8;
        return this.f21335a.readLongLe();
    }

    public String m() throws IOException {
        int o = o();
        this.b += o;
        return this.f21335a.readString(o, f);
    }

    public int n() throws IOException {
        if (e()) {
            this.e = 0;
            return 0;
        }
        int o = o();
        this.e = o;
        if (o != 0) {
            return o;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    public int o() throws IOException {
        int i;
        this.b++;
        BufferedSource bufferedSource = this.f21335a;
        byte readByte = bufferedSource.readByte();
        if (readByte >= 0) {
            return readByte;
        }
        int i2 = readByte & Byte.MAX_VALUE;
        this.b++;
        byte readByte2 = bufferedSource.readByte();
        if (readByte2 >= 0) {
            i = readByte2 << 7;
        } else {
            i2 |= (readByte2 & Byte.MAX_VALUE) << 7;
            this.b++;
            byte readByte3 = bufferedSource.readByte();
            if (readByte3 >= 0) {
                i = readByte3 << 14;
            } else {
                i2 |= (readByte3 & Byte.MAX_VALUE) << 14;
                this.b++;
                byte readByte4 = bufferedSource.readByte();
                if (readByte4 >= 0) {
                    i = readByte4 << 21;
                } else {
                    int i3 = i2 | ((readByte4 & Byte.MAX_VALUE) << 21);
                    this.b++;
                    byte readByte5 = bufferedSource.readByte();
                    int i4 = i3 | (readByte5 << 28);
                    if (readByte5 >= 0) {
                        return i4;
                    }
                    for (int i5 = 0; i5 < 5; i5++) {
                        this.b++;
                        if (bufferedSource.readByte() >= 0) {
                            return i4;
                        }
                    }
                    throw new IOException("WireInput encountered a malformed varint.");
                }
            }
        }
        return i | i2;
    }

    public long p() throws IOException {
        byte readByte;
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            this.b++;
            j |= (readByte & Byte.MAX_VALUE) << i;
            if ((this.f21335a.readByte() & c0z.STATE) == 0) {
                return j;
            }
        }
        throw new IOException("WireInput encountered a malformed varint.");
    }

    public final void q(long j) throws IOException {
        this.b = (int) (this.b + j);
        this.f21335a.skip(j);
    }

    public final boolean r(int i) throws IOException {
        switch (a.f21336a[WireType.valueOf(i).ordinal()]) {
            case 1:
                p();
                return false;
            case 2:
                k();
                return false;
            case 3:
                l();
                return false;
            case 4:
                q(o());
                return false;
            case 5:
                s();
                a((i & (-8)) | WireType.END_GROUP.value());
                return false;
            case 6:
                return true;
            default:
                throw new AssertionError();
        }
    }

    public void s() throws IOException {
        int n;
        do {
            n = n();
            if (n == 0) {
                return;
            }
        } while (!r(n));
    }
}
