package tb;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbhudong.TBHuDongServiceImp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class djn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static long a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6c11910b", new Object[]{str, new Long(j)})).longValue();
        }
        try {
            SharedPreferences b = b();
            if (b == null) {
                return j;
            }
            return b.getLong(str, j);
        } catch (Throwable th) {
            aqa.c("ReachFlowInfoSharePreference getLongData error.", th);
            return j;
        }
    }

    public static SharedPreferences b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("75ba1678", new Object[0]);
        }
        if (TBHuDongServiceImp.getApplication() == null) {
            return null;
        }
        return TBHuDongServiceImp.getApplication().getSharedPreferences("sp_rf_info", 0);
    }

    public static String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e8e71b4", new Object[]{str, str2});
        }
        try {
            SharedPreferences b = b();
            if (b == null) {
                return str2;
            }
            return b.getString(str, str2);
        } catch (Throwable th) {
            aqa.c("ReachFlowInfoSharePreference getStringgData error.", th);
            return str2;
        }
    }

    public static void d(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("662a7944", new Object[]{str, new Long(j)});
            return;
        }
        try {
            SharedPreferences b = b();
            if (b != null) {
                b.edit().putLong(str, j).apply();
            }
        } catch (Throwable th) {
            aqa.c("ReachFlowInfoSharePreference updateLongData error.", th);
        }
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9424af1f", new Object[]{str, str2});
            return;
        }
        try {
            SharedPreferences b = b();
            if (b != null) {
                b.edit().putString(str, str2).apply();
            }
        } catch (Throwable th) {
            aqa.c("ReachFlowInfoSharePreference updateStringData error.", th);
        }
    }
}
