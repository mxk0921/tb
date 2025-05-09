package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class als {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SPLIT = ".";
    public static final String TAG = "TS.expression";

    static {
        t2o.a(329252918);
    }

    public static als a(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (als) ipChange.ipc$dispatch("6471b754", new Object[]{str, objArr});
        }
        if (str == null || str == "") {
            return null;
        }
        als d = nls.d(str, objArr);
        if (d == null) {
            d = ols.d(str, objArr);
        }
        if (d == null) {
            d = tks.d(str, objArr);
        }
        if (d == null) {
            d = wls.d(str, objArr);
        }
        if (d == null) {
            d = zks.d(str, objArr);
        }
        if (d == null) {
            d = ims.c(str, objArr);
        }
        if (d == null) {
            d = ems.c(str, objArr);
        }
        if (d == null) {
            d = gls.c(str, objArr);
        }
        if (d == null) {
            d = els.c(str, objArr);
        }
        if (d == null) {
            d = fls.c(str, objArr);
        }
        if (d == null) {
            d = kls.c(str, objArr);
        }
        if (d == null) {
            d = hls.c(str, objArr);
        }
        if (d == null) {
            d = hms.d(str, objArr);
        }
        if (d == null) {
            d = gms.d(str, objArr);
        }
        if (d == null) {
            d = yks.c(str, objArr);
        }
        if (d == null) {
            d = xls.c(str, objArr);
        }
        if (d == null) {
            d = dls.c(str, objArr);
        }
        if (d == null) {
            d = fms.c(str, objArr);
        }
        if (d == null) {
            d = pls.d(str, objArr);
        }
        if (d == null) {
            d = uks.f(str, objArr);
        }
        if (d == null) {
            d = cms.c(str, objArr);
        }
        if (d == null) {
            d = bls.c(str, objArr);
        }
        if (d == null) {
            return cls.c(str, objArr);
        }
        return d;
    }

    public abstract Object b(wp8 wp8Var);
}
