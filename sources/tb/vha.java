package tb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class vha {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699258);
    }

    public static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eafd5b07", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        try {
            return v2s.o().f().getApplication().getSharedPreferences(vrp.BIZ_GOODS_LIST, 0).getBoolean(str, z);
        } catch (Exception unused) {
            return z;
        }
    }

    public static List<String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7fe4c29c", new Object[0]);
        }
        long c = c("clientDefaultCategoryIds", -1L);
        ArrayList arrayList = new ArrayList();
        if (!yga.r0()) {
            return arrayList;
        }
        long u0 = yga.u0(604800000L);
        if (c == -1 || (c > 0 && f4s.a() - c > u0)) {
            arrayList.add("9999");
        }
        return arrayList;
    }

    public static long c(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7efaf15", new Object[]{str, new Long(j)})).longValue();
        }
        try {
            return v2s.o().f().getApplication().getSharedPreferences(vrp.BIZ_GOODS_LIST, 0).getLong(str, j);
        } catch (Exception unused) {
            return j;
        }
    }

    public static void d(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3156677", new Object[]{str, new Boolean(z)});
            return;
        }
        try {
            SharedPreferences.Editor edit = v2s.o().f().getApplication().getSharedPreferences(vrp.BIZ_GOODS_LIST, 0).edit();
            edit.putBoolean(str, z);
            edit.apply();
        } catch (Exception unused) {
        }
    }

    public static void e(List<String> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0298012", new Object[]{list, str});
        } else if (TextUtils.equals(str, "9999") && list != null && !list.isEmpty() && list.contains("9999")) {
            f("clientDefaultCategoryIds", f4s.a());
        }
    }

    public static void f(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c007ba95", new Object[]{str, new Long(j)});
            return;
        }
        try {
            SharedPreferences.Editor edit = v2s.o().f().getApplication().getSharedPreferences(vrp.BIZ_GOODS_LIST, 0).edit();
            edit.putLong(str, j);
            edit.apply();
        } catch (Exception unused) {
        }
    }
}
