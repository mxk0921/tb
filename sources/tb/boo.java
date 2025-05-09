package tb;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.TBSdkLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class boo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f16513a = {"id: ", "event: ", "data: ", ": ", "retry: "};

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f16514a = -1;
        public b b = null;
        public boolean c = false;
        public int d = 0;
        public final Map<String, b> e = new LinkedHashMap();

        static {
            t2o.a(589300067);
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("788e6256", new Object[]{this});
                return;
            }
            this.f16514a = -1;
            this.b = null;
            this.d = 0;
            ((LinkedHashMap) this.e).clear();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f16515a;
        public final int b;
        public int c;

        static {
            t2o.a(589300068);
        }

        public b(String str, int i) {
            this.f16515a = str;
            this.b = i;
        }
    }

    static {
        t2o.a(589300066);
    }

    public static boolean a(byte[] bArr, byte[] bArr2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a36e58f8", new Object[]{bArr, bArr2, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (bArr == null && bArr2 == null) {
            return true;
        }
        if (bArr == null || bArr2 == null || bArr.length != i2) {
            return false;
        }
        for (int i3 = 0; i3 < bArr.length; i3++) {
            if (bArr[i3] != bArr2[i3 + i]) {
                return false;
            }
        }
        return true;
    }

    public static int b(byte[] bArr, int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d65cc958", new Object[]{bArr, new Integer(i), new Integer(i2)})).intValue();
        }
        if (bArr != null && bArr.length != 0 && i <= i2 && i2 <= bArr.length) {
            for (int max = Math.max(i, 0); max < i2; max++) {
                if (bArr[max] == 10 && (i3 = max + 1) < i2 && bArr[i3] == 10) {
                    return max;
                }
            }
        }
        return -1;
    }

    public static Pair<String, Pair<Integer, Integer>> c(byte[] bArr, Pair<Integer, Integer> pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("af1fbde5", new Object[]{bArr, pair});
        }
        Pair<String, Pair<Integer, Integer>> e = e(bArr, pair);
        if (e == null || e.second == null) {
            return null;
        }
        return e;
    }

    public static int d(byte[] bArr, int i, int i2, int i3, char c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9ee4dc4", new Object[]{bArr, new Integer(i), new Integer(i2), new Integer(i3), new Character(c)})).intValue();
        }
        for (int i4 = i3 + i; i4 < i + i2; i4++) {
            if (bArr[i4] == c) {
                TBSdkLog.e("mtopsdk.SSEProtocolParser", "[------indexOf] index = " + i4);
                return i4;
            }
        }
        return -1;
    }

    public static Pair<String, Pair<Integer, Integer>> e(byte[] bArr, Pair<Integer, Integer> pair) {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("acc9a48c", new Object[]{bArr, pair});
        }
        for (String str : f16513a) {
            byte[] bytes = str.getBytes();
            if (((Integer) pair.second).intValue() >= bytes.length) {
                int i = 0;
                for (int i2 = 0; i2 < bytes.length && bArr[((Integer) pair.first).intValue() + i2] == bytes[i2]; i2++) {
                    i++;
                }
                if (i == str.length()) {
                    return new Pair<>(str, new Pair(Integer.valueOf(((Integer) pair.first).intValue() + bytes.length), Integer.valueOf(((Integer) pair.second).intValue() - bytes.length)));
                }
            }
        }
        return null;
    }

    public static List<Pair<Integer, Integer>> f(byte[] bArr, int i, int i2) {
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4782a674", new Object[]{bArr, new Integer(i), new Integer(i2)});
        }
        ArrayList arrayList = new ArrayList();
        if (!(bArr == null || bArr.length == 0)) {
            while (i3 < i2) {
                int d = d(bArr, i, i2, i3, '\n');
                if (d == -1) {
                    d = i2;
                }
                arrayList.add(new Pair(Integer.valueOf(i3), Integer.valueOf(d - i3)));
                i3 = d + 1;
            }
        }
        return arrayList;
    }

    public static void g(byte[] bArr, int i, int i2, a aVar) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i;
        boolean z = false;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cfbc788", new Object[]{bArr, new Integer(i9), new Integer(i2), aVar});
        } else if (bArr != null && bArr.length != 0 && i2 > 0 && (i3 = i2 + i9) <= bArr.length) {
            int i10 = i3 - 1;
            int i11 = aVar.d;
            while (i9 <= i10) {
                byte b2 = bArr[i9];
                if (b2 != 10) {
                    if (i9 == i10) {
                        aVar.c = z;
                    }
                    if (i9 != i11) {
                        int i12 = z2 ? 1 : 0;
                        int i13 = z2 ? 1 : 0;
                        int i14 = z2 ? 1 : 0;
                        int i15 = z2 ? 1 : 0;
                        i9 += i12;
                    } else {
                        aVar.d = i9;
                        if (b2 == 105 && (i8 = i9 + 3) <= i10 && bArr[i9 + 1] == 100 && bArr[i9 + 2] == 58 && bArr[i8] == 32) {
                            i9 += 4;
                            b bVar = new b("id: ", i9);
                            aVar.b = bVar;
                            aVar.e.put("id: ", bVar);
                        } else {
                            if (b2 == 101 && (i7 = i9 + 6) <= i10 && bArr[i9 + 1] == 118 && bArr[i9 + 2] == 101 && bArr[i9 + 3] == 110 && bArr[i9 + 4] == 116 && bArr[i9 + 5] == 58 && bArr[i7] == 32) {
                                i9 += 7;
                                b bVar2 = new b("event: ", i9);
                                aVar.b = bVar2;
                                aVar.e.put("event: ", bVar2);
                            } else if (b2 == 100 && (i6 = i9 + 5) <= i10 && bArr[i9 + 1] == 97 && bArr[i9 + 2] == 116 && bArr[i9 + 3] == 97 && bArr[i9 + 4] == 58 && bArr[i6] == 32) {
                                i9 += 6;
                                b bVar3 = new b("data: ", i9);
                                aVar.b = bVar3;
                                aVar.e.put("data: ", bVar3);
                            } else if (b2 == 114 && (i5 = i9 + 5) <= i10 && bArr[i9 + 1] == 101 && bArr[i9 + 2] == 116 && bArr[i9 + 3] == 114 && bArr[i9 + 4] == 121 && bArr[i5] == 32) {
                                i9 += 6;
                                b bVar4 = new b("retry: ", i9);
                                aVar.b = bVar4;
                                aVar.e.put("retry: ", bVar4);
                            } else if (b2 == 58 && (i4 = i9 + 1) <= i10 && bArr[i4] == 32) {
                                i9 += 2;
                                b bVar5 = new b(": ", i9);
                                aVar.b = bVar5;
                                aVar.e.put(": ", bVar5);
                            } else {
                                i9++;
                            }
                            z = false;
                            z2 = true;
                        }
                    }
                } else if (i9 == i10) {
                    aVar.c = z2;
                    return;
                } else {
                    i11 = i9 + 1;
                    if (bArr[i11] == 10) {
                        aVar.f16514a = i9;
                        b bVar6 = aVar.b;
                        bVar6.c = i9 - bVar6.b;
                        aVar.e.put(bVar6.f16515a, bVar6);
                        return;
                    }
                    b bVar7 = aVar.b;
                    bVar7.c = i9 - bVar7.b;
                    aVar.e.put(bVar7.f16515a, bVar7);
                    i9 = i11;
                }
            }
            aVar.f16514a = -1;
        }
    }
}
