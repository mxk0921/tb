package tb;

import android.content.Context;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class a2h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806355495);
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa1fe2fa", new Object[]{context, str});
        } else if (context != null && !arq.a(str)) {
            Nav.from(context).toUri(str.trim());
        }
    }

    public static void b(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f254603c", new Object[]{context, str, new Integer(i)});
        } else if (context != null && !arq.a(str)) {
            Nav from = Nav.from(context);
            if (i != -1) {
                from.forResult(i);
            }
            from.toUri(str.trim());
        }
    }

    public static void c(Context context, String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32bd0062", new Object[]{context, str, bundle});
        } else if (context != null && !arq.a(str)) {
            Nav.from(context).withExtras(bundle).toUri(str.trim());
        }
    }
}
