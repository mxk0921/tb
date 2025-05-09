package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.ui.component.WXComponent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class zuw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static WXComponent a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXComponent) ipChange.ipc$dispatch("4f9cd0e8", new Object[]{str, str2});
        }
        return WXSDKManager.getInstance().getWXRenderManager().getWXComponent(str, str2);
    }

    public static View b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7125977b", new Object[]{str, str2});
        }
        WXComponent a2 = a(str, str2);
        if (a2 == null) {
            return null;
        }
        return a2.getHostView();
    }
}
