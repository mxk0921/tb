package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.utils.newutils.TLiveAccessibilityUtils;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class s60 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699948);
    }

    public static void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb5de279", new Object[]{view});
        } else {
            TLiveAccessibilityUtils.a(view);
        }
    }
}
