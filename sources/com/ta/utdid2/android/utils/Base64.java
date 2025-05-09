package com.ta.utdid2.android.utils;

import com.alibaba.ariver.remoterpc.EncodingUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import tb.c0z;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class Base64 {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CRLF = 4;
    public static final int DEFAULT = 0;
    public static final int NO_CLOSE = 16;
    public static final int NO_PADDING = 1;
    public static final int NO_WRAP = 2;
    public static final int URL_SAFE = 8;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static abstract class Coder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int op;
        public byte[] output;

        static {
            t2o.a(966787102);
        }

        public abstract int maxOutputSize(int i);

        public abstract boolean process(byte[] bArr, int i, int i2, boolean z);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class Decoder extends Coder {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final int[] DECODE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private static final int[] DECODE_WEBSAFE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private static final int EQUALS = -2;
        private static final int SKIP = -1;
        private final int[] alphabet;
        private int state;
        private int value;

        static {
            t2o.a(966787103);
        }

        public Decoder(int i, byte[] bArr) {
            int[] iArr;
            this.output = bArr;
            if ((i & 8) == 0) {
                iArr = DECODE;
            } else {
                iArr = DECODE_WEBSAFE;
            }
            this.alphabet = iArr;
            this.state = 0;
            this.value = 0;
        }

        public static /* synthetic */ Object ipc$super(Decoder decoder, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ta/utdid2/android/utils/Base64$Decoder");
        }

        @Override // com.ta.utdid2.android.utils.Base64.Coder
        public int maxOutputSize(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b50a2de9", new Object[]{this, new Integer(i)})).intValue();
            }
            return ((i * 3) / 4) + 10;
        }

        @Override // com.ta.utdid2.android.utils.Base64.Coder
        public boolean process(byte[] bArr, int i, int i2, boolean z) {
            int i3 = i;
            int i4 = 4;
            int i5 = 1;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("aa45c69b", new Object[]{this, bArr, new Integer(i3), new Integer(i2), new Boolean(z)})).booleanValue();
            }
            int i6 = this.state;
            if (i6 == 6) {
                return false;
            }
            int i7 = i2 + i3;
            int i8 = this.value;
            byte[] bArr2 = this.output;
            int[] iArr = this.alphabet;
            int i9 = 0;
            while (i3 < i7) {
                if (i6 == 0) {
                    while (true) {
                        int i10 = i3 + 4;
                        if (i10 > i7 || (i8 = iArr[bArr[i3 + 3] & 255] | (iArr[bArr[i3 + 1] & 255] << 12) | (iArr[bArr[i3] & 255] << 18) | (iArr[bArr[i3 + 2] & 255] << 6)) < 0) {
                            break;
                        }
                        bArr2[i9 + 2] = (byte) i8;
                        bArr2[i9 + 1] = (byte) (i8 >> 8);
                        bArr2[i9] = (byte) (i8 >> 16);
                        i9 += 3;
                        i3 = i10;
                    }
                    if (i3 >= i7) {
                        break;
                    }
                }
                int i11 = i3 + 1;
                int i12 = iArr[bArr[i3] & 255];
                if (i6 == 0) {
                    if (i12 < 0) {
                        if (i12 != -1) {
                            this.state = 6;
                            return false;
                        }
                        i3 = i11;
                        i4 = 4;
                        i5 = 1;
                    }
                    i6++;
                    i8 = i12;
                    i3 = i11;
                    i4 = 4;
                    i5 = 1;
                } else if (i6 != i5) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 != i4) {
                                if (i6 == 5 && i12 != -1) {
                                    this.state = 6;
                                    return false;
                                }
                            } else if (i12 == -2) {
                                i6++;
                            } else if (i12 != -1) {
                                this.state = 6;
                                return false;
                            }
                        } else if (i12 >= 0) {
                            int i13 = i12 | (i8 << 6);
                            bArr2[i9 + 2] = (byte) i13;
                            bArr2[i9 + 1] = (byte) (i13 >> 8);
                            bArr2[i9] = (byte) (i13 >> 16);
                            i9 += 3;
                            i8 = i13;
                            i6 = 0;
                        } else if (i12 == -2) {
                            bArr2[i9 + 1] = (byte) (i8 >> 2);
                            bArr2[i9] = (byte) (i8 >> 10);
                            i9 += 2;
                            i6 = 5;
                        } else if (i12 != -1) {
                            this.state = 6;
                            return false;
                        }
                    } else if (i12 >= 0) {
                        i12 |= i8 << 6;
                        i6++;
                        i8 = i12;
                    } else if (i12 == -2) {
                        bArr2[i9] = (byte) (i8 >> 4);
                        i9++;
                        i6 = 4;
                    } else if (i12 != -1) {
                        this.state = 6;
                        return false;
                    }
                    i3 = i11;
                    i4 = 4;
                    i5 = 1;
                } else if (i12 >= 0) {
                    i12 |= i8 << 6;
                    i6++;
                    i8 = i12;
                    i3 = i11;
                    i4 = 4;
                    i5 = 1;
                } else if (i12 != -1) {
                    this.state = 6;
                    return false;
                } else {
                    i3 = i11;
                    i4 = 4;
                    i5 = 1;
                }
            }
            if (!z) {
                this.state = i6;
                this.value = i8;
                this.op = i9;
                return true;
            } else if (i6 != 1) {
                if (i6 == 2) {
                    bArr2[i9] = (byte) (i8 >> 4);
                    i9++;
                } else if (i6 == 3) {
                    int i14 = i9 + 1;
                    bArr2[i9] = (byte) (i8 >> 10);
                    i9 += 2;
                    bArr2[i14] = (byte) (i8 >> 2);
                } else if (i6 == 4) {
                    this.state = 6;
                    return false;
                }
                this.state = i6;
                this.op = i9;
                return true;
            } else {
                this.state = 6;
                return false;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class Encoder extends Coder {
        public static final /* synthetic */ boolean $assertionsDisabled = false;
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final byte[] ENCODE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, c0z.MAP32, 57, 43, 47};
        private static final byte[] ENCODE_WEBSAFE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, c0z.MAP32, 57, 45, 95};
        public static final int LINE_GROUPS = 19;
        private final byte[] alphabet;
        private int count;
        public final boolean do_cr;
        public final boolean do_newline;
        public final boolean do_padding;
        private final byte[] tail;
        public int tailLen;

        static {
            t2o.a(966787104);
        }

        public Encoder(int i, byte[] bArr) {
            boolean z;
            boolean z2;
            byte[] bArr2;
            int i2;
            this.output = bArr;
            boolean z3 = true;
            if ((i & 1) == 0) {
                z = true;
            } else {
                z = false;
            }
            this.do_padding = z;
            if ((i & 2) == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.do_newline = z2;
            this.do_cr = (i & 4) == 0 ? false : z3;
            if ((i & 8) == 0) {
                bArr2 = ENCODE;
            } else {
                bArr2 = ENCODE_WEBSAFE;
            }
            this.alphabet = bArr2;
            this.tail = new byte[2];
            this.tailLen = 0;
            if (z2) {
                i2 = 19;
            } else {
                i2 = -1;
            }
            this.count = i2;
        }

        public static /* synthetic */ Object ipc$super(Encoder encoder, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ta/utdid2/android/utils/Base64$Encoder");
        }

        @Override // com.ta.utdid2.android.utils.Base64.Coder
        public int maxOutputSize(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b50a2de9", new Object[]{this, new Integer(i)})).intValue();
            }
            return ((i * 8) / 5) + 10;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0123  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x01f6  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x0121 A[EDGE_INSN: B:91:0x0121->B:38:0x0121 ?: BREAK  , SYNTHETIC] */
        @Override // com.ta.utdid2.android.utils.Base64.Coder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean process(byte[] r21, int r22, int r23, boolean r24) {
            /*
                Method dump skipped, instructions count: 547
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ta.utdid2.android.utils.Base64.Encoder.process(byte[], int, int, boolean):boolean");
        }
    }

    static {
        t2o.a(966787101);
    }

    private Base64() {
    }

    public static byte[] decode(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("f7ebf079", new Object[]{str, new Integer(i)}) : decode(str.getBytes(), i);
    }

    public static byte[] encode(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("9ad5fe5e", new Object[]{bArr, new Integer(i)}) : encode(bArr, 0, bArr.length, i);
    }

    public static String encodeToString(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("966d2cad", new Object[]{bArr, new Integer(i)});
        }
        try {
            return new String(encode(bArr, i), EncodingUtils.US_ASCII);
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public static byte[] decode(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("565cfa36", new Object[]{bArr, new Integer(i)}) : decode(bArr, 0, bArr.length, i);
    }

    public static byte[] encode(byte[] bArr, int i, int i2, int i3) {
        int i4 = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("3f0a4dbe", new Object[]{bArr, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        Encoder encoder = new Encoder(i3, null);
        int i5 = (i2 / 3) * 4;
        if (!encoder.do_padding) {
            int i6 = i2 % 3;
            if (i6 == 1) {
                i5 += 2;
            } else if (i6 == 2) {
                i5 += 3;
            }
        } else if (i2 % 3 > 0) {
            i5 += 4;
        }
        if (encoder.do_newline && i2 > 0) {
            int i7 = ((i2 - 1) / 57) + 1;
            if (!encoder.do_cr) {
                i4 = 1;
            }
            i5 += i7 * i4;
        }
        encoder.output = new byte[i5];
        encoder.process(bArr, i, i2, true);
        return encoder.output;
    }

    public static byte[] decode(byte[] bArr, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("34c1b396", new Object[]{bArr, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        Decoder decoder = new Decoder(i3, new byte[(i2 * 3) / 4]);
        if (decoder.process(bArr, i, i2, true)) {
            int i4 = decoder.op;
            byte[] bArr2 = decoder.output;
            if (i4 == bArr2.length) {
                return bArr2;
            }
            byte[] bArr3 = new byte[i4];
            System.arraycopy(bArr2, 0, bArr3, 0, i4);
            return bArr3;
        }
        throw new IllegalArgumentException("bad base-64");
    }

    public static String encodeToString(byte[] bArr, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dfb1c90d", new Object[]{bArr, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        try {
            return new String(encode(bArr, i, i2, i3), EncodingUtils.US_ASCII);
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
