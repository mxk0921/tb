package tb;

import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class eex {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BRIDGE_EVENT_UPDATE = "AURARaxBridge.updateData";

    static {
        t2o.a(81788999);
    }

    public static void a(WVUCWebView wVUCWebView, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14217313", new Object[]{wVUCWebView, str, str2});
        } else if (wVUCWebView != null) {
            WVStandardEventCenter.postNotificationToJS(wVUCWebView, str, str2);
        } else {
            WVStandardEventCenter.postNotificationToJS(str, str2);
        }
    }
}
