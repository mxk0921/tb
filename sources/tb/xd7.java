package tb;

import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.common.request.CommonMtopRequest;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class xd7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DESKTOP_LINK_API = "mtop.alibaba.mobile.desktop.link.get";
    public static final String DESKTOP_LINK_API_VERSION = "1.0";
    public static final String DESKTOP_LINK_UNSIGN_API = "mtop.alibaba.mobile.desktop.link.weakget";
    public static final String DESKTOP_ROUTER_LINK_API = "mtop.taobao.afc.delayDp.get";
    public static final String WIDGET_TOP_API = "mtop.taobao.growth.starlink.config.get";

    public static void a(String str, String str2, Map<String, String> map, nwc nwcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cee1ab0", new Object[]{str, str2, map, nwcVar});
            return;
        }
        ggh.d("requestData api" + str + "apiVersion" + str2 + "paramsMap" + map);
        new CommonMtopRequest().a(str, str2, map, false, nwcVar, null);
    }

    public static void b(Map<String, String> map, boolean z, nwc nwcVar, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("885a5a9e", new Object[]{map, new Boolean(z), nwcVar, handler});
            return;
        }
        ggh.d("requestData paramsMap：" + map.toString() + ", unSign: " + z);
        if (z) {
            new CommonMtopRequest().a(DESKTOP_LINK_UNSIGN_API, "1.0", map, true, nwcVar, handler);
        } else {
            new CommonMtopRequest().a("mtop.alibaba.mobile.desktop.link.get", "1.0", map, false, nwcVar, handler);
        }
    }
}
