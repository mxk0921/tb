package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.request.a;
import tb.swn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class zt1<OUT, NEXT_OUT extends swn> extends fs1<OUT, NEXT_OUT, a> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int WR_CACHE_UNAVAILABLE = 3;
    public static final int WR_CACHE_WRITE_FAILED = 4;
    public static final int WR_DATA_UNAVAILABLE = 1;
    public static final int WR_NOT_NEED_CACHE = 2;
    public static final int WR_SUCCEEDED = 0;
    public final eq7 j;

    static {
        t2o.a(620757033);
    }

    public zt1(int i, int i2, eq7 eq7Var) {
        super(i, i2);
        this.j = eq7Var;
    }

    public static /* synthetic */ Object ipc$super(zt1 zt1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/phenix/cache/disk/BaseDiskCacheProducer");
    }

    public int[] P(int[] iArr, int i) {
        int i2 = 0;
        int i3 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("8b5b5a02", new Object[]{this, iArr, new Integer(i)});
        }
        int e = q0q.e(i);
        int d = q0q.d(i);
        int length = iArr.length;
        int i4 = -1;
        int i5 = Integer.MAX_VALUE;
        int i6 = 2;
        while (true) {
            if (i2 >= length) {
                i3 = i6;
                break;
            }
            int i7 = iArr[i2];
            int e2 = q0q.e(i7) - e;
            int d2 = q0q.d(i7) - d;
            int abs = Math.abs(e2) + Math.abs(d2);
            if (abs == 0) {
                i4 = i7;
                break;
            }
            if (i6 == 2 && e2 > 0 && d2 > 0) {
                i4 = i7;
                i5 = abs;
                i6 = 4;
            } else if ((i6 != 4 || (e2 >= 0 && d2 >= 0)) && abs < i5) {
                i4 = i7;
                i5 = abs;
            }
            i2++;
        }
        return new int[]{i3, i4};
    }

    public long Q(int i, String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("61f2cb63", new Object[]{this, new Integer(i), str, new Integer(i2)})).longValue();
        }
        zp7 T = T(i);
        if (T.b(s0m.B().b())) {
            return T.e(str, i2);
        }
        return -1L;
    }

    public final t9o R(int i, String str, int i2, int[] iArr) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t9o) ipChange.ipc$dispatch("3ebcd09e", new Object[]{this, new Integer(i), str, new Integer(i2), iArr});
        }
        zp7 T = T(i);
        if (!T.b(s0m.B().b())) {
            fiv.k("DiskCache", "%s open failed in DiskCacheReader", T);
            return null;
        } else if (!T.d() || (i3 = iArr[0]) == 1) {
            return T.get(str, i2);
        } else {
            int[] f = T.f(str);
            if (f == null || f.length <= 0) {
                fiv.a("DiskCache", "find catalogs failed, key=%s", str);
                return null;
            }
            int[] P = P(f, i2);
            int i4 = P[0];
            if (!a.c0(i3, i4)) {
                return null;
            }
            iArr[0] = i4;
            fiv.a("DiskCache", "find best size level=%d, actual=%d, target=%d, key=%s", Integer.valueOf(i4), Integer.valueOf(q0q.e(P[1])), Integer.valueOf(q0q.e(i2)), str);
            return T.get(str, P[1]);
        }
    }

    public zp7 T(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zp7) ipChange.ipc$dispatch("71b91e88", new Object[]{this, new Integer(i)});
        }
        zp7 zp7Var = this.j.get(i);
        if (zp7Var == null) {
            return this.j.get(17);
        }
        return zp7Var;
    }

    public ud8 S(a aVar, String str, int i, int[] iArr) {
        byte[] bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ud8) ipChange.ipc$dispatch("d5385725", new Object[]{this, aVar, str, new Integer(i), iArr});
        }
        t9o R = R(aVar.E(), str, i, iArr);
        ud8 ud8Var = null;
        if (R != null) {
            try {
                return ud8.c(R, null);
            } catch (Exception e) {
                fiv.o("DiskCache", aVar, "transform data from response[type:%d] error=%s", Integer.valueOf(R.f28582a), e);
                return null;
            }
        } else if (!s0m.B().H0() || aVar.E() == aVar.H()) {
            return null;
        } else {
            for (String str2 : nd2.INDEPENDENT_STORAGE_BIZS) {
                if (TextUtils.equals(aVar.Y().t, str2)) {
                    t9o R2 = R(aVar.H(), str, i, iArr);
                    if (R2 == null) {
                        return null;
                    }
                    try {
                        ud8Var = ud8.c(R2, null);
                        if (ud8Var == null || (bArr = ud8Var.c) == null || bArr.length <= 0) {
                            return ud8Var;
                        }
                        zp7 T = T(aVar.E());
                        if (!T.b(s0m.B().b())) {
                            return ud8Var;
                        }
                        fiv.o("DiskCache", aVar, "reWrite stream cacheData to disk biz=%s", aVar.Y().t);
                        T.a(aVar.D(), aVar.C(), ud8Var.c, ud8Var.d, ud8Var.b);
                        return ud8Var;
                    } catch (Exception e2) {
                        fiv.o("DiskCache", aVar, "transform data from response[type:%d] error=%s", Integer.valueOf(R2.f28582a), e2);
                        return ud8Var;
                    }
                }
            }
            return null;
        }
    }

    public int U(a aVar, wd8 wd8Var, boolean z) {
        int i = 3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d51af925", new Object[]{this, aVar, wd8Var, new Boolean(z)})).intValue();
        }
        if (!wd8Var.a()) {
            fiv.m("DiskCache", aVar, "write skipped, because encode data not available, key=%s, catalog=%d", aVar.D(), Integer.valueOf(aVar.C()));
            i = 1;
        } else if (wd8Var.i()) {
            fiv.m("DiskCache", aVar, "write skipped, because encode data not need to be cached(fromDisk=%b, fromScale=%b), key=%s, catalog=%d", Boolean.valueOf(wd8Var.k), Boolean.valueOf(wd8Var.j), aVar.D(), Integer.valueOf(aVar.C()));
            i = 2;
        } else {
            zp7 T = T(aVar.E());
            if (T.b(s0m.B().b())) {
                boolean a2 = T.a(aVar.D(), aVar.C(), wd8Var.c, wd8Var.d, wd8Var.b);
                i = !a2 ? 4 : 0;
                fiv.m("DiskCache", aVar, "write result=%B，priority=%d, key=%s, catalog=%d", Boolean.valueOf(a2), Integer.valueOf(aVar.E()), aVar.D(), Integer.valueOf(aVar.C()));
            } else {
                fiv.k("DiskCache", "%s open failed in DiskCacheWriter", T);
            }
        }
        if (z) {
            wd8Var.release();
        }
        return i;
    }
}
