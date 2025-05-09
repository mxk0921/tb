package tb;

import android.app.Activity;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class vge {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4707b7d7", new Object[]{activity, str});
        } else if (!TextUtils.isEmpty(str)) {
            Nav.from(activity).toUri(str);
        }
    }
}
