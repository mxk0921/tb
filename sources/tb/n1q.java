package tb;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class n1q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Handler f24450a = new Handler(Looper.getMainLooper());

    static {
        t2o.a(464519249);
    }

    public static List<String> a(Map<String, Map<String, String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9480db8c", new Object[]{map});
        }
        ArrayList arrayList = new ArrayList();
        if (map != null && !map.isEmpty()) {
            for (Map<String, String> map2 : map.values()) {
                if (map2 != null && !map2.isEmpty()) {
                    for (String str : map2.values()) {
                        if (b(str)) {
                            arrayList.add(str);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d076258", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.endsWith(".png") || str.endsWith(".jpg")) {
            return true;
        }
        return false;
    }

    public static void c(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adc2234d", new Object[]{runnable});
        } else {
            f24450a.removeCallbacks(runnable);
        }
    }

    public static void d(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d874b96e", new Object[]{runnable});
        } else {
            f24450a.post(runnable);
        }
    }

    public static void e(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3622eb16", new Object[]{runnable, new Long(j)});
        } else {
            f24450a.postDelayed(runnable, j);
        }
    }
}
