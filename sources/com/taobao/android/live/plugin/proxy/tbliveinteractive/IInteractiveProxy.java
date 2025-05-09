package com.taobao.android.live.plugin.proxy.tbliveinteractive;

import android.content.Context;
import android.taobao.windvane.webview.IWVWebView;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.live.plugin.proxy.IProxy;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;
import java.util.Map;
import tb.a2e;
import tb.aeb;
import tb.bce;
import tb.cgc;
import tb.dgc;
import tb.f7a;
import tb.f9z;
import tb.jnr;
import tb.kpw;
import tb.nkr;
import tb.olc;
import tb.ub5;
import tb.ux9;
import tb.wbc;
import tb.zff;
import tb.zlc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IInteractiveProxy extends IProxy {
    public static final String KEY = "IInteractiveProxy";
    public static final String KEY_TB_LIVE_WV_PLUGIN = "TBLiveWVPlugin";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
        void b();

        View getView();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface c {
        void setPenetrateAlpha(int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface d {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface e {
        String getFedName();

        String getIconViewStyle();

        String getId();

        String getLabel();

        String getName();

        String getPanelTitle();

        String getPriority();

        int getShowOrder();

        String getType();

        JSON getViewParams();

        boolean isInitComponentComplete();

        boolean isInteractivePanelDisplayOnly();

        boolean isMigrationFlag();

        boolean isNeedShowEntrance();

        boolean isRightShowFlag();

        JSONObject parseJsonTBLiveInteractiveComponent();

        void setRightAnimated(boolean z);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface f {
        void a(String str, Map<String, Object> map);

        void b(String str, Map<String, String> map);

        e c(String str);

        boolean d(String str, boolean z, boolean z2, String str2, float f, float f2, float f3);

        void e(String str, Map<String, String> map);

        void f(String str, Map<String, String> map);

        String g(String str, Map<String, String> map);

        void h(String str, Map<String, String> map);

        void i(String str, Map<String, String> map);

        void j();

        void k(String str, Map<String, String> map);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface g {
        void f(cgc cgcVar);

        void h(cgc cgcVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface h {
        void A(aeb aebVar);

        f9z a(VideoInfo videoInfo, boolean z);

        void a(ub5 ub5Var);

        boolean b(ViewGroup viewGroup, String str, Map<String, String> map);

        void c();

        f d();

        void destroy();

        void e(a2e a2eVar);

        boolean f(ViewGroup viewGroup, String str, Map<String, String> map);

        void g(String str);

        aeb getActionAdapter();

        Context getContext();

        void h(olc olcVar);

        void i(int i);

        void j(bce bceVar);

        void k(int i);

        void l(VideoInfo videoInfo, String str, String str2, HashMap<String, String> hashMap, f7a f7aVar);

        zff m(ViewGroup viewGroup, View view, boolean z, VideoInfo videoInfo);

        boolean n();

        void o(String str, String str2);

        i p(ViewGroup viewGroup, boolean z);

        g q();

        void r(zlc zlcVar);

        d s(ViewGroup viewGroup);

        void t(String str);

        dgc u(VideoInfo videoInfo, boolean z);

        void v(String str, Map<String, Object> map);

        void w(boolean z);

        j x(ViewGroup viewGroup, VideoInfo videoInfo, boolean z);

        void y();

        void z();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface i {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface j {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface k {
        k a(Context context);

        k b(float f);

        BottomSheetDialogFragment build();

        k c(nkr nkrVar);

        k d(boolean z);
    }

    wbc createGoodsH5TabFrameAdapter();

    BaseFrame createH5DynamicSDKFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var);

    h createInteractiveManager(Context context, ux9 ux9Var, long j2);

    k createTaoLiveWebBottomFragment();

    Class<? extends BaseFrame> getFrameClassMap(String str);

    boolean getTradeSign(IWVWebView iWVWebView, jnr jnrVar);

    Class<? extends kpw> getWvApiClassMap(String str);

    void registerEventHandlerAndWidget(DinamicXEngine dinamicXEngine);
}
