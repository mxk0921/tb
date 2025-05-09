package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.parser.expr.edition.EditionInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class zks extends als {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f32842a;

    static {
        t2o.a(329252922);
    }

    public zks(String str) {
        this.f32842a = c(str);
    }

    public static zks d(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zks) ipChange.ipc$dispatch("feabebb5", new Object[]{str, objArr});
        }
        if (!TextUtils.isEmpty(str) && str.startsWith("@edition.")) {
            return new zks(str);
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(zks zksVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tschedule/parser/expr/edition/TSEditionExpression");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c7, code lost:
        if (r17.equals("@edition.actualLanguageCode") == false) goto L_0x003d;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int c(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.zks.c(java.lang.String):int");
    }

    /* renamed from: e */
    public String b(wp8 wp8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3ba2ea4", new Object[]{this, wp8Var});
        }
        EditionInfo b = wp8Var.b();
        int i = this.f32842a;
        if (i <= 0 || b == null) {
            return null;
        }
        switch (i) {
            case 1:
                return b.getCountryCode();
            case 2:
                return b.getCountryName();
            case 3:
                return b.getCountryNumCode();
            case 4:
                return b.getLanguageCode();
            case 5:
                return b.getActualLanguageCode();
            case 6:
                return b.getCurrencyCode();
            case 7:
                return b.getHngCookie();
            case 8:
                return b.getCityName();
            case 9:
                return b.getCityId();
            case 10:
                return b.getArea();
            case 11:
                return b.getEditionCode();
            case 12:
                return b.getIsVillageUser();
            default:
                return null;
        }
    }
}
