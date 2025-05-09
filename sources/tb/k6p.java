package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.weex.module.XSearchEventModule;
import com.taobao.search.weex.module.SearchEventModule;
import com.taobao.search.weex.module.SearchFestivalModule;
import com.taobao.search.weex.module.SearchTimeModule;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class k6p {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final k6p b = new k6p();

    /* renamed from: a  reason: collision with root package name */
    public boolean f22435a = false;

    static {
        t2o.a(815793811);
    }

    public static k6p a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k6p) ipChange.ipc$dispatch("778f8b89", new Object[0]);
        }
        return b;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (!this.f22435a) {
            this.f22435a = true;
            c();
        }
    }

    public final void c() {
        String str;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63964caa", new Object[]{this});
            return;
        }
        try {
            WXSDKEngine.registerModule(SearchEventModule.MODULE_NAME, SearchEventModule.class);
            WXSDKEngine.registerModule(SearchFestivalModule.MODULE_NAME, SearchFestivalModule.class);
            WXSDKEngine.registerModule(SearchTimeModule.MODULE_NAME, SearchTimeModule.class);
            WXSDKEngine.registerModule("xsearchEvent", XSearchEventModule.class);
            str = null;
            z = true;
        } catch (WXException e) {
            b4p.b("SearchWeexManager", "注册搜索weex模块异常");
            str = e.getMessage();
        }
        if (z) {
            n6p.c(n6p.REGISTER_MODULES);
            return;
        }
        if (str == null) {
            str = "";
        }
        n6p.a(n6p.REGISTER_MODULES, "fail", str);
    }
}
