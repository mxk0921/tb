package com.alibaba.ut.abtest.internal.util.hash;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.nio.charset.Charset;
import tb.bpm;
import tb.eua;
import tb.f7l;
import tb.hkf;
import tb.hua;
import tb.iua;
import tb.s10;
import tb.siv;
import tb.t10;
import tb.t2o;
import tb.tiv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class Murmur3_32HashFunction extends s10 implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int C1 = -862048943;
    private static final int C2 = 461845907;
    private static final int CHUNK_SIZE = 4;
    public static final eua GOOD_FAST_HASH_32 = new Murmur3_32HashFunction(iua.GOOD_FAST_HASH_SEED);
    public static final Charset UTF_8 = Charset.forName("UTF-8");
    private static final long serialVersionUID = 0;
    private final int seed;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a extends t10 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f3379a;
        public long b;
        public int c;
        public int d = 0;
        public boolean e = false;

        static {
            t2o.a(961544398);
        }

        public a(int i) {
            this.f3379a = i;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -1216682858) {
                return super.b((CharSequence) objArr[0], (Charset) objArr[1]);
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ut/abtest/internal/util/hash/Murmur3_32HashFunction$Murmur3_32Hasher");
        }

        @Override // tb.hua
        public hua a(byte[] bArr, int i, int i2) {
            int i3 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (hua) ipChange.ipc$dispatch("5a83fee7", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
            }
            bpm.f(i, i + i2, bArr.length);
            while (true) {
                int i4 = i3 + 4;
                if (i4 <= i2) {
                    e(4, Murmur3_32HashFunction.access$200(bArr, i3 + i));
                    i3 = i4;
                }
            }
            while (i3 < i2) {
                d(bArr[i + i3]);
                i3++;
            }
            return this;
        }

        @Override // tb.t10, tb.hua
        public hua b(CharSequence charSequence, Charset charset) {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (hua) ipChange.ipc$dispatch("b77ae496", new Object[]{this, charSequence, charset});
            }
            if (!Murmur3_32HashFunction.UTF_8.equals(charset)) {
                return super.b(charSequence, charset);
            }
            int length = charSequence.length();
            while (true) {
                int i2 = i + 4;
                if (i2 > length) {
                    break;
                }
                char charAt = charSequence.charAt(i);
                char charAt2 = charSequence.charAt(i + 1);
                char charAt3 = charSequence.charAt(i + 2);
                char charAt4 = charSequence.charAt(i + 3);
                if (charAt >= 128 || charAt2 >= 128 || charAt3 >= 128 || charAt4 >= 128) {
                    break;
                }
                e(4, (charAt2 << '\b') | charAt | (charAt3 << 16) | (charAt4 << 24));
                i = i2;
            }
            while (i < length) {
                char charAt5 = charSequence.charAt(i);
                if (charAt5 < 128) {
                    e(1, charAt5);
                } else if (charAt5 < 2048) {
                    e(2, Murmur3_32HashFunction.access$300(charAt5));
                } else if (charAt5 < 55296 || charAt5 > 57343) {
                    e(3, Murmur3_32HashFunction.access$400(charAt5));
                } else {
                    int codePointAt = Character.codePointAt(charSequence, i);
                    if (codePointAt == charAt5) {
                        c(charSequence.subSequence(i, length).toString().getBytes(charset));
                        return this;
                    }
                    i++;
                    e(4, Murmur3_32HashFunction.access$500(codePointAt));
                }
                i++;
            }
            return this;
        }

        public hua d(byte b) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (hua) ipChange.ipc$dispatch("46b6229b", new Object[]{this, new Byte(b)});
            }
            e(1, b & 255);
            return this;
        }

        public final void e(int i, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("848fa0f1", new Object[]{this, new Integer(i), new Long(j)});
                return;
            }
            long j2 = this.b;
            long j3 = j & tiv.INT_MASK;
            int i2 = this.c;
            long j4 = (j3 << i2) | j2;
            this.b = j4;
            int i3 = i2 + (i * 8);
            this.c = i3;
            this.d += i;
            if (i3 >= 32) {
                this.f3379a = Murmur3_32HashFunction.access$100(this.f3379a, Murmur3_32HashFunction.access$000((int) j4));
                this.b >>>= 32;
                this.c -= 32;
            }
        }

        @Override // tb.hua
        public HashCode hash() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HashCode) ipChange.ipc$dispatch("e1358612", new Object[]{this});
            }
            bpm.g(!this.e);
            this.e = true;
            int access$000 = this.f3379a ^ Murmur3_32HashFunction.access$000((int) this.b);
            this.f3379a = access$000;
            return Murmur3_32HashFunction.access$600(access$000, this.d);
        }
    }

    static {
        t2o.a(961544397);
    }

    public Murmur3_32HashFunction(int i) {
        this.seed = i;
    }

    public static /* synthetic */ int access$000(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ddeb5a5f", new Object[]{new Integer(i)})).intValue();
        }
        return mixK1(i);
    }

    public static /* synthetic */ int access$100(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("73c4d50b", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        return mixH1(i, i2);
    }

    public static /* synthetic */ int access$200(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fa1a2a76", new Object[]{bArr, new Integer(i)})).intValue();
        }
        return getIntLittleEndian(bArr, i);
    }

    public static /* synthetic */ long access$300(char c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("158eca77", new Object[]{new Character(c)})).longValue();
        }
        return charToTwoUtf8Bytes(c);
    }

    public static /* synthetic */ long access$400(char c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7d6ff756", new Object[]{new Character(c)})).longValue();
        }
        return charToThreeUtf8Bytes(c);
    }

    public static /* synthetic */ long access$500(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e5513abb", new Object[]{new Integer(i)})).longValue();
        }
        return codePointToFourUtf8Bytes(i);
    }

    public static /* synthetic */ HashCode access$600(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashCode) ipChange.ipc$dispatch("26b7059a", new Object[]{new Integer(i), new Integer(i2)});
        }
        return fmix(i, i2);
    }

    private static long charToThreeUtf8Bytes(char c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("45c2b29d", new Object[]{new Character(c)})).longValue();
        }
        return (((c & f7l.CONDITION_IF) | 128) << 16) | (((c >>> '\f') | 480) & 255) | ((((c >>> 6) & 63) | 128) << 8);
    }

    private static long charToTwoUtf8Bytes(char c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf2fae8b", new Object[]{new Character(c)})).longValue();
        }
        return (((c & f7l.CONDITION_IF) | 128) << 8) | (((c >>> 6) | 960) & 255);
    }

    private static long codePointToFourUtf8Bytes(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8687c4fa", new Object[]{new Integer(i)})).longValue();
        }
        return (((i >>> 18) | 240) & 255) | ((((i >>> 12) & 63) | 128) << 8) | ((((i >>> 6) & 63) | 128) << 16) | (((i & 63) | 128) << 24);
    }

    private static HashCode fmix(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashCode) ipChange.ipc$dispatch("9e18385a", new Object[]{new Integer(i), new Integer(i2)});
        }
        int i3 = i ^ i2;
        int i4 = (i3 ^ (i3 >>> 16)) * (-2048144789);
        int i5 = (i4 ^ (i4 >>> 13)) * (-1028477387);
        return HashCode.fromInt(i5 ^ (i5 >>> 16));
    }

    public static /* synthetic */ Object ipc$super(Murmur3_32HashFunction murmur3_32HashFunction, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ut/abtest/internal/util/hash/Murmur3_32HashFunction");
    }

    private static int mixH1(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bfce5f9f", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        return (Integer.rotateLeft(i ^ i2, 13) * 5) - 430675100;
    }

    private static int mixK1(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a900bed", new Object[]{new Integer(i)})).intValue();
        }
        return Integer.rotateLeft(i * (-862048943), 15) * C2;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (!(obj instanceof Murmur3_32HashFunction) || this.seed != ((Murmur3_32HashFunction) obj).seed) {
            return false;
        }
        return true;
    }

    @Override // tb.s10
    public HashCode hashBytes(byte[] bArr, int i, int i2) {
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashCode) ipChange.ipc$dispatch("4d663968", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
        }
        bpm.f(i, i + i2, bArr.length);
        int i4 = this.seed;
        int i5 = 0;
        while (true) {
            int i6 = i5 + 4;
            if (i6 > i2) {
                break;
            }
            i4 = mixH1(i4, mixK1(getIntLittleEndian(bArr, i5 + i)));
            i5 = i6;
        }
        int i7 = 0;
        while (i5 < i2) {
            i3 ^= siv.a(bArr[i + i5]) << i7;
            i5++;
            i7 += 8;
        }
        return fmix(mixK1(i3) ^ i4, i2);
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return Murmur3_32HashFunction.class.hashCode() ^ this.seed;
    }

    @Override // tb.s10, tb.eua
    public HashCode hashString(CharSequence charSequence, Charset charset) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashCode) ipChange.ipc$dispatch("ac2330f5", new Object[]{this, charSequence, charset});
        }
        if (!UTF_8.equals(charset)) {
            return hashBytes(charSequence.toString().getBytes(charset));
        }
        int length = charSequence.length();
        int i = this.seed;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i2 + 4;
            if (i4 > length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            char charAt2 = charSequence.charAt(i2 + 1);
            char charAt3 = charSequence.charAt(i2 + 2);
            char charAt4 = charSequence.charAt(i2 + 3);
            if (charAt >= 128 || charAt2 >= 128 || charAt3 >= 128 || charAt4 >= 128) {
                break;
            }
            i = mixH1(i, mixK1((charAt4 << 24) | (charAt2 << '\b') | charAt | (charAt3 << 16)));
            i3 += 4;
            i2 = i4;
        }
        long j2 = 0;
        int i5 = 0;
        while (i2 < length) {
            char charAt5 = charSequence.charAt(i2);
            if (charAt5 < 128) {
                j = (charAt5 << i5) | j2;
                i5 += 8;
                i3++;
            } else if (charAt5 < 2048) {
                j = (charToTwoUtf8Bytes(charAt5) << i5) | j2;
                i5 += 16;
                i3 += 2;
            } else if (charAt5 < 55296 || charAt5 > 57343) {
                j = (charToThreeUtf8Bytes(charAt5) << i5) | j2;
                i5 += 24;
                i3 += 3;
            } else {
                int codePointAt = Character.codePointAt(charSequence, i2);
                if (codePointAt == charAt5) {
                    return hashBytes(charSequence.toString().getBytes(charset));
                }
                i2++;
                j = (codePointToFourUtf8Bytes(codePointAt) << i5) | j2;
                i3 += 4;
            }
            if (i5 >= 32) {
                i = mixH1(i, mixK1((int) j));
                j >>>= 32;
                i5 -= 32;
            }
            j2 = j;
            i2++;
        }
        return fmix(mixK1((int) j2) ^ i, i3);
    }

    @Override // tb.eua
    public hua newHasher() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hua) ipChange.ipc$dispatch("5bffe2df", new Object[]{this});
        }
        return new a(this.seed);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Hashing.murmur3_32(" + this.seed + f7l.BRACKET_END_STR;
    }

    private static int getIntLittleEndian(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fad0385e", new Object[]{bArr, new Integer(i)})).intValue();
        }
        return hkf.a(bArr[i + 3], bArr[2 + i], bArr[1 + i], bArr[i]);
    }
}
