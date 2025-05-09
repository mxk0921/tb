package tb;

import com.alibaba.ability.localization.Localization;
import com.alibaba.ability.localization.constants.Location;
import com.android.alibaba.ip.runtime.IpChange;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.a;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class iu6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FLAG_DATE = 7;
    public static final int FLAG_DATE_TIME = 31;
    public static final int FLAG_DAY = 4;
    public static final int FLAG_HOUR = 8;
    public static final int FLAG_MINUTE = 16;
    public static final int FLAG_MONTH = 2;
    public static final int FLAG_SECOND = 32;
    public static final int FLAG_TIME = 24;
    public static final int FLAG_YEAR = 1;
    public static final iu6 INSTANCE = new iu6();

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f21587a;
    public static final int[] b;
    public static final Map<String, int[]> c;

    static {
        t2o.a(82837506);
        int[] iArr = {1, 2, 4, 8};
        f21587a = iArr;
        int[] iArr2 = {2, 4, 1, 8};
        int[] iArr3 = {4, 2, 1, 8};
        b = iArr2;
        c = a.j(jpu.a(Location.GLOBAL.getCode(), iArr2), jpu.a(Location.CN.getCode(), iArr), jpu.a(Location.HK.getCode(), iArr3), jpu.a(Location.MO.getCode(), iArr3), jpu.a(Location.TW.getCode(), iArr), jpu.a(Location.SG.getCode(), iArr3), jpu.a(Location.MY.getCode(), iArr3), jpu.a(Location.AU.getCode(), iArr3), jpu.a(Location.NZ.getCode(), iArr3), jpu.a(Location.CA.getCode(), iArr3), jpu.a(Location.JP.getCode(), iArr), jpu.a(Location.KR.getCode(), iArr), jpu.a(Location.TH.getCode(), iArr3), jpu.a(Location.VN.getCode(), iArr3), jpu.a(Location.PH.getCode(), iArr2), jpu.a(Location.KH.getCode(), iArr3));
    }

    @JvmStatic
    public static final String a(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c4cc6003", new Object[]{new Long(j), new Integer(i)});
        }
        return b(j, i, Localization.j());
    }

    @JvmStatic
    public static final String b(long j, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc39d0b9", new Object[]{new Long(j), new Integer(i), str});
        }
        ckf.g(str, "location");
        if (i <= 0) {
            return "";
        }
        String format = new SimpleDateFormat(INSTANCE.f(i, str), new Locale(Localization.h().getLanguage())).format(new Date(j));
        ckf.f(format, "dataFormat.format(date)");
        return format;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("924135d4", new Object[]{this});
        }
        if (Localization.p()) {
            return " ";
        }
        return ", ";
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5e8a78", new Object[]{this});
        }
        if (Localization.p()) {
            return "";
        }
        return " ";
    }

    public final String e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6a54b3c2", new Object[]{this, new Integer(i)});
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i == 8) {
                        return "HH";
                    }
                    if (i == 16) {
                        return ":mm";
                    }
                    if (i != 32) {
                        return "";
                    }
                    return ":ss";
                } else if (Localization.p()) {
                    return "d日";
                } else {
                    return "d";
                }
            } else if (Localization.p()) {
                return "M月";
            } else {
                return "MMM";
            }
        } else if (Localization.p()) {
            return "yyyy年";
        } else {
            return "yyyy";
        }
    }

    public final String f(int i, String str) {
        int[] iArr;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eba7697f", new Object[]{this, new Integer(i), str});
        }
        if (Localization.p()) {
            iArr = f21587a;
        } else {
            iArr = c.get(str);
            if (iArr == null) {
                iArr = b;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 : iArr) {
            if (i2 == (i2 & i)) {
                if (sb.length() > 0) {
                    if (i2 == 8) {
                        str2 = c();
                    } else {
                        str2 = d();
                    }
                    sb.append(str2);
                }
                sb.append(e(i2));
                if (i2 == 8 && 16 == (i & 16)) {
                    sb.append(e(16));
                    if (32 == (i & 32)) {
                        sb.append(e(32));
                    }
                }
            }
        }
        String sb2 = sb.toString();
        ckf.f(sb2, "sb.toString()");
        return sb2;
    }
}
