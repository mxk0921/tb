package com.taobao.search.sf.weex.module;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.common.WXModule;
import tb.a07;
import tb.c64;
import tb.cbk;
import tb.ckf;
import tb.cnx;
import tb.n84;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class SearchOpenModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String EVENT_CLOSE_DROP_LAYER = "closeDropLayer";
    public static final String EVENT_CLOSE_FILTER = "closeFilter";
    public static final String EVENT_OPEN_DROP_LAYER = "openDropLayer";
    public static final String EVENT_OPEN_FILTER = "openFilter";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815793529);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815793528);
    }

    public static /* synthetic */ Object ipc$super(SearchOpenModule searchOpenModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/weex/module/SearchOpenModule");
    }

    private final void performAction(WXSDKInstance wXSDKInstance, String str, JSONObject jSONObject) {
        cnx D1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f98d036", new Object[]{this, wXSDKInstance, str, jSONObject});
        } else if ((wXSDKInstance instanceof cbk) && (D1 = ((cbk) wXSDKInstance).D1()) != null) {
            D1.K(str, jSONObject, null, null);
        }
    }

    @JSMethod
    public final void closeDropLayer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fc35c11", new Object[]{this});
            return;
        }
        WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
        ckf.f(wXSDKInstance, "mWXSDKInstance");
        performAction(wXSDKInstance, "closeDropLayer", null);
    }

    @JSMethod
    public final void closeFilter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1707817", new Object[]{this});
            return;
        }
        WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
        ckf.f(wXSDKInstance, "mWXSDKInstance");
        performAction(wXSDKInstance, "closeFilter", null);
    }

    @JSMethod(uiThread = false)
    public final boolean isDropLayerOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b61eb78d", new Object[]{this})).booleanValue();
        }
        if (n84.p || c64.y) {
            return true;
        }
        return false;
    }

    @JSMethod
    public final void openDropLayer(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ad2edd1", new Object[]{this, jSONObject});
            return;
        }
        ckf.g(jSONObject, "options");
        WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
        ckf.f(wXSDKInstance, "mWXSDKInstance");
        performAction(wXSDKInstance, "openDropLayer", jSONObject);
    }

    @JSMethod
    public final void openFilter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("660601e9", new Object[]{this});
            return;
        }
        WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
        ckf.f(wXSDKInstance, "mWXSDKInstance");
        performAction(wXSDKInstance, "openFilter", null);
    }
}
