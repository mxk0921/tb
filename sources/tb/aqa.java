package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class aqa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e833d92", new Object[]{str});
            return;
        }
        try {
            Log.e("TBHuDong", str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6780c4db", new Object[]{str, objArr});
            return;
        }
        try {
            if (objArr.length != 0) {
                String.format(str, objArr);
            }
        } catch (Throwable th) {
            a("log.error.e=" + th.toString() + th.getMessage());
        }
    }

    public static void c(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10fef4e1", new Object[]{str, th});
            return;
        }
        a(str + "\nstack:" + Log.getStackTraceString(th));
    }
}
