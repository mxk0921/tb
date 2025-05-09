package tb;

import com.alibaba.ariver.remoterpc.EncodingUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class tp1 {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CRLF = 4;
    public static final int DEFAULT = 0;
    public static final int NO_CLOSE = 16;
    public static final int NO_PADDING = 1;
    public static final int NO_WRAP = 2;
    public static final int URL_SAFE = 8;

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentLinkedQueue<b> f28854a = new ConcurrentLinkedQueue<>();
    public static final Set<Integer> b = new HashSet();
    public static final ConcurrentLinkedQueue<c> c = new ConcurrentLinkedQueue<>();
    public static final Set<Integer> d = new HashSet();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static abstract class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public byte[] f28855a;
        public int b;

        static {
            t2o.a(962592973);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b extends a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final int[] f = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        public static final int[] g = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        public int c;
        public int d;
        public final int[] e;

        static {
            t2o.a(962592974);
        }

        public b(int i, byte[] bArr) {
            int[] iArr;
            this.f28855a = bArr;
            if ((i & 8) == 0) {
                iArr = f;
            } else {
                iArr = g;
            }
            this.e = iArr;
            this.c = 0;
            this.d = 0;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/analytics/utils/Base64$Decoder");
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
                return;
            }
            this.f28855a = null;
            this.c = 0;
            this.d = 0;
        }

        public boolean b(byte[] bArr, int i, int i2, boolean z) {
            int i3 = i;
            int i4 = 4;
            int i5 = 1;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("aa45c69b", new Object[]{this, bArr, new Integer(i3), new Integer(i2), new Boolean(z)})).booleanValue();
            }
            int i6 = this.c;
            if (i6 == 6) {
                return false;
            }
            int i7 = i2 + i3;
            int i8 = this.d;
            byte[] bArr2 = this.f28855a;
            int[] iArr = this.e;
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
                            this.c = 6;
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
                                    this.c = 6;
                                    return false;
                                }
                            } else if (i12 == -2) {
                                i6++;
                            } else if (i12 != -1) {
                                this.c = 6;
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
                            this.c = 6;
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
                        this.c = 6;
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
                    this.c = 6;
                    return false;
                } else {
                    i3 = i11;
                    i4 = 4;
                    i5 = 1;
                }
            }
            if (!z) {
                this.c = i6;
                this.d = i8;
                this.b = i9;
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
                    this.c = 6;
                    return false;
                }
                this.c = i6;
                this.b = i9;
                return true;
            } else {
                this.c = 6;
                return false;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class c extends a {
        public static final /* synthetic */ boolean $assertionsDisabled = false;
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int LINE_GROUPS = 19;
        public static final byte[] j = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, c0z.MAP32, 57, 43, 47};
        public static final byte[] k = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, c0z.MAP32, 57, 45, 95};
        public final byte[] c;
        public int d;
        public int e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final byte[] i;

        static {
            t2o.a(962592975);
        }

        public c(int i, byte[] bArr) {
            boolean z;
            boolean z2;
            byte[] bArr2;
            int i2;
            this.f28855a = bArr;
            boolean z3 = true;
            if ((i & 1) == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f = z;
            if ((i & 2) == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.g = z2;
            this.h = (i & 4) == 0 ? false : z3;
            if ((i & 8) == 0) {
                bArr2 = j;
            } else {
                bArr2 = k;
            }
            this.i = bArr2;
            this.c = new byte[2];
            this.d = 0;
            if (z2) {
                i2 = 19;
            } else {
                i2 = -1;
            }
            this.e = i2;
        }

        public static /* synthetic */ void a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3bd64297", new Object[]{cVar});
            } else {
                cVar.b();
            }
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/analytics/utils/Base64$Encoder");
        }

        public final void b() {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
                return;
            }
            this.f28855a = null;
            this.d = 0;
            if (this.g) {
                i = 19;
            } else {
                i = -1;
            }
            this.e = i;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0123  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x01f6  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x0121 A[EDGE_INSN: B:91:0x0121->B:38:0x0121 ?: BREAK  , SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean c(byte[] r21, int r22, int r23, boolean r24) {
            /*
                Method dump skipped, instructions count: 547
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.tp1.c.c(byte[], int, int, boolean):boolean");
        }
    }

    static {
        t2o.a(962592972);
    }

    public static byte[] a(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("565cfa36", new Object[]{bArr, new Integer(i)});
        }
        return b(bArr, 0, bArr.length, i);
    }

    public static byte[] b(byte[] bArr, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("34c1b396", new Object[]{bArr, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        b bVar = new b(i3, new byte[(i2 * 3) / 4]);
        if (bVar.b(bArr, i, i2, true)) {
            int i4 = bVar.b;
            byte[] bArr2 = bVar.f28855a;
            if (i4 == bArr2.length) {
                return bArr2;
            }
            byte[] bArr3 = new byte[i4];
            System.arraycopy(bArr2, 0, bArr3, 0, i4);
            return bArr3;
        }
        throw new IllegalArgumentException("bad base-64");
    }

    public static byte[] c(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("5bc8d9a6", new Object[]{bArr});
        }
        int length = bArr.length;
        int i = (length * 3) / 4;
        byte[] bArr2 = new byte[i];
        b j = j(bArr2);
        if (j.b(bArr, 0, length, true)) {
            int i2 = j.b;
            if (i2 == i) {
                h(j);
                return bArr2;
            }
            byte[] bArr3 = new byte[i2];
            System.arraycopy(bArr2, 0, bArr3, 0, i2);
            h(j);
            return bArr3;
        }
        h(j);
        throw new IllegalArgumentException("bad base-64");
    }

    public static byte[] d(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("9ad5fe5e", new Object[]{bArr, new Integer(i)});
        }
        return e(bArr, 0, bArr.length, i);
    }

    public static byte[] e(byte[] bArr, int i, int i2, int i3) {
        int i4 = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("3f0a4dbe", new Object[]{bArr, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        c cVar = new c(i3, null);
        int i5 = (i2 / 3) * 4;
        if (!cVar.f) {
            int i6 = i2 % 3;
            if (i6 == 1) {
                i5 += 2;
            } else if (i6 == 2) {
                i5 += 3;
            }
        } else if (i2 % 3 > 0) {
            i5 += 4;
        }
        if (cVar.g && i2 > 0) {
            int i7 = ((i2 - 1) / 57) + 1;
            if (!cVar.h) {
                i4 = 1;
            }
            i5 += i7 * i4;
        }
        cVar.f28855a = new byte[i5];
        cVar.c(bArr, i, i2, true);
        return cVar.f28855a;
    }

    public static byte[] f(byte[] bArr) {
        int i = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("12942e7e", new Object[]{bArr});
        }
        if (bArr == null) {
            return null;
        }
        c k = k();
        int length = bArr.length;
        int i2 = (length / 3) * 4;
        if (!k.f) {
            int i3 = length % 3;
            if (i3 == 1) {
                i2 += 2;
            } else if (i3 == 2) {
                i2 += 3;
            }
        } else if (length % 3 > 0) {
            i2 += 4;
        }
        if (k.g && length > 0) {
            int i4 = ((length - 1) / 57) + 1;
            if (!k.h) {
                i = 1;
            }
            i2 += i4 * i;
        }
        byte[] bArr2 = new byte[i2];
        k.f28855a = bArr2;
        k.c(bArr, 0, length, true);
        i(k);
        return bArr2;
    }

    public static String g(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("966d2cad", new Object[]{bArr, new Integer(i)});
        }
        try {
            return new String(d(bArr, i), EncodingUtils.US_ASCII);
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public static void h(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee7769c7", new Object[]{bVar});
        } else if (bVar != null) {
            int i = bVar.b;
            bVar.a();
            if (i <= 65536) {
                Set<Integer> set = b;
                if (((HashSet) set).size() < 2) {
                    synchronized (tp1.class) {
                        try {
                            int identityHashCode = System.identityHashCode(bVar);
                            if (!((HashSet) set).contains(Integer.valueOf(identityHashCode))) {
                                ((HashSet) set).add(Integer.valueOf(identityHashCode));
                                f28854a.offer(bVar);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }
    }

    public static void i(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d748ac7", new Object[]{cVar});
        } else if (cVar != null) {
            int i = cVar.b;
            c.a(cVar);
            if (i <= 65536) {
                Set<Integer> set = d;
                if (((HashSet) set).size() < 2) {
                    synchronized (tp1.class) {
                        try {
                            int identityHashCode = System.identityHashCode(cVar);
                            if (!((HashSet) set).contains(Integer.valueOf(identityHashCode))) {
                                ((HashSet) set).add(Integer.valueOf(identityHashCode));
                                c.offer(cVar);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }
    }

    public static b j(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("bb3a38db", new Object[]{bArr});
        }
        b poll = f28854a.poll();
        if (poll == null) {
            return new b(2, bArr);
        }
        poll.f28855a = bArr;
        ((HashSet) b).remove(Integer.valueOf(System.identityHashCode(poll)));
        return poll;
    }

    public static c k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("d5542f52", new Object[0]);
        }
        c poll = c.poll();
        if (poll == null) {
            return new c(2, null);
        }
        ((HashSet) d).remove(Integer.valueOf(System.identityHashCode(poll)));
        return poll;
    }
}
