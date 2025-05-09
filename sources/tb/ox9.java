package tb;

import android.taobao.windvane.webview.IWVWebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.BrowserHybridWebView;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ox9 extends j1v {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ox9 b = new ox9();

    static {
        t2o.a(619708641);
    }

    public static /* synthetic */ Object ipc$super(ox9 ox9Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/ut/FragmentUTHybridHelper");
    }

    public static ox9 p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ox9) ipChange.ipc$dispatch("4f325924", new Object[0]);
        }
        return b;
    }

    public final void q(Map<String, String> map) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bccbef84", new Object[]{this, map});
        } else if (map != null && map.size() != 0) {
            try {
                i = Integer.parseInt(map.remove("funcId"));
            } catch (Throwable unused) {
                i = -1;
            }
            if (i != -1) {
                String remove = map.remove("url");
                if (remove == null || hsq.f(remove)) {
                    nhh.m("h5Ctrl", "pageName is null,return");
                    return;
                }
                String remove2 = map.remove("logkey");
                if (remove2 == null || hsq.f(remove2)) {
                    nhh.m("h5Ctrl", "logkey is null,return");
                    return;
                }
                UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder = new UTOriginalCustomHitBuilder(remove, i, remove2, null, null, map);
                UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
                if (defaultTracker != null) {
                    defaultTracker.send(uTOriginalCustomHitBuilder.build());
                } else {
                    nhh.i("h5Ctrl event error", "Fatal Error,must call setRequestAuthentication method first.");
                }
            }
        }
    }

    public final void r(Map<String, String> map, Object obj, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d13a3528", new Object[]{this, map, obj, iWVWebView});
            return;
        }
        nhh.d();
        if (map == null || map.size() == 0) {
            nhh.m("h5Page2", "dataMap is null or empty,return");
            return;
        }
        String remove = map.remove("url");
        v7t.d("FragmentUTHybridHelper", "h5Page2 pageName=" + remove);
        v7t.d("FragmentUTHybridHelper", "h5Page2 map=" + map);
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(obj, remove);
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(obj, map);
        if (iWVWebView instanceof BrowserHybridWebView) {
            ((BrowserHybridWebView) iWVWebView).setUTPageNameAndParamMap(remove, map);
        }
    }

    public void s(Map<String, String> map, Object obj, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b58fac58", new Object[]{this, map, obj, iWVWebView});
            return;
        }
        if (nhh.n()) {
            nhh.f("FragmentUTHybridHelper", "h5UT2 view", obj, "dataMap", map);
        }
        if (map == null || map.size() == 0) {
            nhh.i("h5UT", "dataMap is empty");
            return;
        }
        String remove = map.remove("functype");
        if (remove == null) {
            nhh.i("h5UT", "funcType is null");
        } else if (remove.equals("page")) {
            r(map, obj, iWVWebView);
        } else if (remove.equals("ctrl")) {
            q(map);
        }
    }
}
