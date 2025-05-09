package tb;

import android.app.Application;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.media.MediaSystemUtils;
import com.taobao.taobaoavsdk.CodeUsageCounter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class m75 implements usb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ADD_CART_BROADCAST_ACTION = "com.taobao.avplayer.DWEventAdapter.addCart";

    static {
        t2o.a(451936259);
        t2o.a(452985030);
    }

    @Override // tb.usb
    public void openUrl(String str) {
        Application application;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edf7b396", new Object[]{this, str});
            return;
        }
        CodeUsageCounter.c().a(CodeUsageCounter.componentName.dw_adapter_DWEventAdapter);
        if (!TextUtils.isEmpty(str) && (application = MediaSystemUtils.sApplication) != null) {
            Nav.from(application).toUri(str.trim());
        }
    }
}
