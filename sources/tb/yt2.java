package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class yt2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093344);
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c63f97d", new Object[]{context});
        }
        try {
            return qg9.e(context.getCacheDir().getPath(), "template_list.json");
        } catch (Exception unused) {
            return null;
        }
    }

    public static void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f95f399", new Object[]{context, str});
            return;
        }
        try {
            qg9.g(context.getCacheDir().getPath(), "template_list.json", str);
        } catch (Exception unused) {
        }
    }
}
