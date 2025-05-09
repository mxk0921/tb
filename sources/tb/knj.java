package tb;

import android.app.Activity;
import android.net.Uri;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.BrowserActivity;
import com.taobao.browser.utils.BrowserUtil;
import com.taobao.linkmanager.AfcLifeCycleCenter;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class knj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static ConcurrentHashMap<String, WeakReference<BrowserActivity>> f22781a = null;

    static {
        t2o.a(619708652);
    }

    public static boolean b(String str, WeakReference<BrowserActivity> weakReference) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f590ab12", new Object[]{str, weakReference})).booleanValue();
        }
        if (str != null) {
            str2 = str;
        } else {
            str2 = null;
        }
        BrowserUtil.b(RPCDataItems.SWITCH_TAG_LOG, "addUniqueH5", null, str2, null);
        if (f22781a == null) {
            f22781a = new ConcurrentHashMap<>();
        }
        y7t.a("NavHelper", "UniqueH5 add : " + str);
        f22781a.put(str, weakReference);
        return true;
    }

    public static boolean c(String str, WeakReference<BrowserActivity> weakReference) {
        String str2;
        BrowserActivity browserActivity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61461b0e", new Object[]{str, weakReference})).booleanValue();
        }
        ConcurrentHashMap<String, WeakReference<BrowserActivity>> concurrentHashMap = f22781a;
        if (!(concurrentHashMap == null || weakReference == null || !concurrentHashMap.containsKey(str))) {
            if (str != null) {
                str2 = str;
            } else {
                str2 = null;
            }
            BrowserUtil.b(RPCDataItems.SWITCH_TAG_LOG, "checkClearUniqueH5", null, str2, null);
            WeakReference<BrowserActivity> weakReference2 = f22781a.get(str);
            if (!(weakReference2 == null || (browserActivity = weakReference2.get()) == null || browserActivity == weakReference.get())) {
                y7t.a("NavHelper", "UniqueH5 clear : " + str);
                browserActivity.finish(AfcLifeCycleCenter.isLauncherStart ^ true);
                f22781a.remove(str);
                return true;
            }
        }
        return false;
    }

    public static void d(Activity activity, Uri uri, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea52a74e", new Object[]{activity, uri, new Boolean(z)});
            return;
        }
        try {
            activity.setRequestedOrientation(0);
            boolean z2 = activity instanceof BrowserActivity;
        } catch (Exception e) {
            y7t.a("NavHelper", "fail to call toLandscapeBrowser: " + e.getMessage());
        }
    }

    public static boolean a(Activity activity, Uri uri) {
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3d36b9b", new Object[]{activity, uri})).booleanValue();
        }
        String uri2 = uri != null ? uri.toString() : null;
        BrowserUtil.b(RPCDataItems.SWITCH_TAG_LOG, "NavtoExBrowser", "exbrowser_all", uri2, null);
        if (uri.isHierarchical() && (("http".equals(uri.getScheme()) || "https".equals(uri.getScheme())) && (queryParameter = uri.getQueryParameter("landscape")) != null && "true".equals(queryParameter.trim()))) {
            BrowserUtil.b(RPCDataItems.SWITCH_TAG_LOG, "NavtoExBrowser", "exbrowser_landscape", uri2, null);
            activity.setRequestedOrientation(0);
        }
        return false;
    }
}
