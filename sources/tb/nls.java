package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.parser.expr.location.LocationInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class nls extends als {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f24813a;

    static {
        t2o.a(329252926);
    }

    public nls(String str) {
        this.f24813a = c(str);
    }

    public static nls d(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nls) ipChange.ipc$dispatch("5b5338f5", new Object[]{str, objArr});
        }
        if (!TextUtils.isEmpty(str) && str.startsWith("@location.")) {
            return new nls(str);
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(nls nlsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tschedule/parser/expr/location/TSLocationExpression");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f2, code lost:
        if (r17.equals("@location.address") == false) goto L_0x003e;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int c(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.nls.c(java.lang.String):int");
    }

    /* renamed from: e */
    public String b(wp8 wp8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3ba2ea4", new Object[]{this, wp8Var});
        }
        LocationInfo g = wp8Var.g();
        int i = this.f24813a;
        if (i <= 0 || g == null) {
            return null;
        }
        switch (i) {
            case 1:
                return g.getProvinceCode();
            case 2:
                return g.getProvinceName();
            case 3:
                return g.getCityCode();
            case 4:
                return g.getCityName();
            case 5:
                return g.getAreaCode();
            case 6:
                return g.getAreaName();
            case 7:
                return g.getLongitude();
            case 8:
                return g.getLatitude();
            case 9:
                return g.getAltitude();
            case 10:
                return g.getAddress();
            case 11:
                return g.getTimeStamp();
            case 12:
                return g.getAccuracy();
            case 13:
                return g.getCountryCode();
            case 14:
                return g.getCountryName();
            case 15:
                return g.getGeohash();
            default:
                return null;
        }
    }
}
