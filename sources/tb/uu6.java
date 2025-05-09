package tb;

import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class uu6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final uu6 INSTANCE = new uu6();

    @JvmStatic
    public static final String c(String str, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5c05735", new Object[]{str, l});
        }
        if (l == null || l.longValue() <= 0) {
            return null;
        }
        if (Localization.o() || TextUtils.isEmpty(str)) {
            str = "yyyy-MM-dd HH:mm";
        }
        return new SimpleDateFormat(str, Locale.getDefault()).format(new Date(l.longValue() * 1000));
    }

    @JvmStatic
    public static final boolean e(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c9fd981", new Object[]{l})).booleanValue();
        }
        if (l == null || l.longValue() <= 0) {
            return false;
        }
        Calendar instance = Calendar.getInstance();
        int i = instance.get(1);
        int i2 = instance.get(2);
        int i3 = instance.get(5);
        instance.setTimeInMillis(l.longValue());
        int i4 = instance.get(1);
        int i5 = instance.get(2);
        int i6 = instance.get(5);
        if (i == i4 && i2 == i5 && i3 == i6) {
            return true;
        }
        return false;
    }

    public final String a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24ca573a", new Object[]{this, new Long(j)});
        }
        Date date = new Date();
        Date date2 = new Date(j);
        if (ckf.b(new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(date), new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(date2))) {
            String q = Localization.q(R.string.taobao_app_1007_1_18935);
            ckf.f(q, "{\n      Localization.loc…o_app_1007_1_18935)\n    }");
            return q;
        }
        String format = new SimpleDateFormat(d(), Locale.getDefault()).format(date2);
        ckf.f(format, "{\n      SimpleDateFormat….format(targetDate)\n    }");
        return format;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("26ac2322", new Object[]{this});
        }
        if (Localization.o()) {
            return "yyyy-MM-dd HH:mm";
        }
        String string = caa.c().getString(R.string.taobao_app_1007_1_19906);
        ckf.f(string, "{\n      GlobalAdapter.ge…o_app_1007_1_19906)\n    }");
        return string;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("661ed8bc", new Object[]{this});
        }
        if (Localization.o()) {
            return "MM-dd";
        }
        String q = Localization.q(R.string.taobao_app_1007_1_18962);
        ckf.f(q, "{\n      Localization.loc…o_app_1007_1_18962)\n    }");
        return q;
    }

    static {
        t2o.a(481297591);
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
    }
}
