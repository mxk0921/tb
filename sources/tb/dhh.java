package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class dhh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Throwable f17824a;

    public static void a(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a05cf23b", new Object[]{str, objArr});
            return;
        }
        String b = b(objArr);
        Log.e("TBreakPad", str + ":" + b);
    }

    public static String b(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bac6f5a2", new Object[]{objArr});
        }
        if (objArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            if (obj != null) {
                sb.append("->");
                sb.append(obj);
            }
        }
        return sb.toString();
    }

    public static void c(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21aa2c1b", new Object[]{th});
            return;
        }
        f17824a = th;
        a("exception", th.getClass().getSimpleName(), th.getMessage());
    }
}
