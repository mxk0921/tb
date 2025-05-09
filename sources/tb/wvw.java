package tb;

import android.app.Activity;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.uc.webview.export.extension.UCExtension;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class wvw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Activity activity, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("195c4691", new Object[]{activity, intent});
        } else if (intent != null && activity != null) {
            if (intent.getFlags() == 33554432) {
                Nav.from(activity).withCategory("com.taobao.intent.category.HYBRID_UI").withFlags(UCExtension.EXTEND_INPUT_TYPE_IDCARD).skipPreprocess().disableTransition().disallowLoopback().toUri(intent.getData());
            } else {
                Nav.from(activity).withCategory("com.taobao.intent.category.HYBRID_UI").skipPreprocess().disableTransition().disallowLoopback().toUri(intent.getData());
            }
        }
    }
}
