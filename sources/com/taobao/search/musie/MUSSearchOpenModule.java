package com.taobao.search.musie;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.android.xsearchplugin.muise.SFMuiseSDK;
import tb.a07;
import tb.c64;
import tb.ckf;
import tb.cnx;
import tb.n84;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class MUSSearchOpenModule extends MUSModule {
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
            t2o.a(815792637);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792636);
    }

    public MUSSearchOpenModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    private final cnx getActionPerformer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cnx) ipChange.ipc$dispatch("27af6153", new Object[]{this});
        }
        Object tag = getInstance().getTag(SFMuiseSDK.MUISE_EVENT_LISTENER);
        if (!(tag instanceof cnx)) {
            return null;
        }
        return (cnx) tag;
    }

    public static /* synthetic */ Object ipc$super(MUSSearchOpenModule mUSSearchOpenModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/MUSSearchOpenModule");
    }

    private final void performAction(com.taobao.android.weex_framework.a aVar, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54a71a67", new Object[]{this, aVar, str, jSONObject});
            return;
        }
        cnx actionPerformer = getActionPerformer();
        if (actionPerformer != null) {
            actionPerformer.K(str, jSONObject, null, null);
        }
    }

    @MUSMethod
    public final void closeDropLayer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fc35c11", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.a instance = getInstance();
        ckf.f(instance, "getInstance(...)");
        performAction(instance, "closeDropLayer", null);
    }

    @MUSMethod
    public final void closeFilter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1707817", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.a instance = getInstance();
        ckf.f(instance, "getInstance(...)");
        performAction(instance, "closeFilter", null);
    }

    @MUSMethod(uiThread = false)
    public final boolean isDropLayerOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b61eb78d", new Object[]{this})).booleanValue();
        }
        if (c64.y || n84.p) {
            return true;
        }
        return false;
    }

    @MUSMethod
    public final void openDropLayer(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ad2edd1", new Object[]{this, jSONObject});
            return;
        }
        ckf.g(jSONObject, "options");
        com.taobao.android.weex_framework.a instance = getInstance();
        ckf.f(instance, "getInstance(...)");
        performAction(instance, "openDropLayer", jSONObject);
    }

    @MUSMethod
    public final void openFilter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("660601e9", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.a instance = getInstance();
        ckf.f(instance, "getInstance(...)");
        performAction(instance, "openFilter", null);
    }
}
