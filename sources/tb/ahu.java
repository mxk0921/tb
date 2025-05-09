package tb;

import android.content.Context;
import android.net.Uri;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ahu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e81ecbf4", new Object[]{context, str})).booleanValue();
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse != null && parse.isHierarchical()) {
                if (!nks.e(parse) && !nks.g(parse)) {
                    return false;
                }
                Nav.from(context).allowEscape().toUri(parse);
                return true;
            }
            return false;
        } catch (Throwable th) {
            RVLogger.e("TriverBrowserHook", "not hierarchical uri", th);
            return false;
        }
    }
}
