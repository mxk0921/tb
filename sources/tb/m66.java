package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class m66 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_ADD = 1;
    public static final int TYPE_DIV = 4;
    public static final int TYPE_MOD = 5;
    public static final int TYPE_MUL = 3;
    public static final int TYPE_SUB = 2;

    static {
        t2o.a(444596866);
    }

    public static Object a(Object[] objArr, int i) {
        double d;
        long j;
        double d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("31511eba", new Object[]{objArr, new Integer(i)});
        }
        if (objArr != null) {
            try {
                if (objArr.length != 0) {
                    int length = objArr.length;
                    long j2 = 0;
                    boolean z = false;
                    double d3 = vu3.b.GEO_NOT_SUPPORT;
                    for (int i2 = 0; i2 < length; i2++) {
                        Object obj = objArr[i2];
                        if (obj instanceof String) {
                            String str = (String) obj;
                            if (!z && !o66.b(str)) {
                                j = o66.g(str);
                                d = vu3.b.GEO_NOT_SUPPORT;
                            }
                            d2 = o66.e(str);
                            d = d2;
                            z = true;
                            j = 0;
                        } else {
                            if (!z && !o66.c(obj)) {
                                if (!(obj instanceof Integer) && !(obj instanceof Long)) {
                                    j = 0;
                                    d = vu3.b.GEO_NOT_SUPPORT;
                                }
                                j = ((Number) obj).longValue();
                                d = vu3.b.GEO_NOT_SUPPORT;
                            }
                            d2 = ((Number) obj).doubleValue();
                            d = d2;
                            z = true;
                            j = 0;
                        }
                        if (z) {
                            if (j2 != 0) {
                                d3 = j2;
                                j2 = 0;
                            }
                            if (i2 == 0) {
                                d3 = d;
                            } else if (i == 1) {
                                d3 += d;
                            } else if (i == 2) {
                                d3 -= d;
                            } else if (i == 3) {
                                d3 *= d;
                            } else if (i != 4) {
                                if (i == 5) {
                                    if (d == vu3.b.GEO_NOT_SUPPORT) {
                                        return 0L;
                                    }
                                    d3 %= d;
                                }
                            } else if (d == vu3.b.GEO_NOT_SUPPORT) {
                                return 0L;
                            } else {
                                d3 /= d;
                            }
                        } else if (i2 == 0) {
                            j2 = j;
                        } else if (i == 1) {
                            j2 += j;
                        } else if (i == 2) {
                            j2 -= j;
                        } else if (i == 3) {
                            j2 *= j;
                        } else if (i != 4) {
                            if (i == 5) {
                                if (j == 0) {
                                    return 0L;
                                }
                                j2 %= j;
                            }
                        } else if (j == 0) {
                            return 0L;
                        } else {
                            j2 /= j;
                        }
                        if (z && (d3 == Double.POSITIVE_INFINITY || d3 == Double.NEGATIVE_INFINITY || Double.NaN == d3)) {
                            return Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT);
                        }
                    }
                    if (z) {
                        return Double.valueOf(d3);
                    }
                    return Long.valueOf(j2);
                }
            } catch (Throwable unused) {
                return 0L;
            }
        }
        return 0L;
    }
}
