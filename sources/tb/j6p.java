package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.jarvis.JarvisKitModule;
import com.taobao.search.jarvis.rcmd.SearchXslSdk;
import com.taobao.search.sf.weex.module.SearchOpenModule;
import com.taobao.search.weex.component.InShopSearchComponent;
import com.taobao.search.weex.module.SearchEventModule;
import com.taobao.search.weex.module.SearchHistoryModule;
import com.taobao.tao.Globals;
import com.taobao.weex.WXSDKEngine;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class j6p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793810);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[0]);
            return;
        }
        try {
            WXSDKEngine.registerModule(JarvisKitModule.MODULE_NAME, JarvisKitModule.class);
            WXSDKEngine.registerModule(SearchEventModule.MODULE_NAME, SearchEventModule.class);
            WXSDKEngine.registerModule("TBSearchHistory", SearchHistoryModule.class);
            WXSDKEngine.registerModule("SearchOpen", SearchOpenModule.class);
            WXSDKEngine.registerComponent("shopAuctionList", InShopSearchComponent.class);
            SearchXslSdk.install();
            gtf.i().j();
            k8j.a(Globals.getApplication());
            try {
                h8h.e().h(Globals.getApplication());
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            c4p.o("SearchWeexBundle", "register err", th);
        }
    }
}
