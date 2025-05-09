package com.alibaba.triver.triver_shop.newShop.ext;

import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.ability.localization.Localization;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ariver.app.api.App;
import com.alibaba.evo.EVO;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.container.ShopLoftActivity;
import com.alibaba.triver.triver_shop.container.shopLoft.MiniVideoLoftView;
import com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftViewManager;
import com.alibaba.triver.triver_shop.container.shopLoft.TBLoftDWShopVideoView;
import com.alibaba.triver.triver_shop.container.shopLoft.TBMarketShopVideoView;
import com.alibaba.triver.triver_shop.container.shopLoft.TBMiniShopVideoView;
import com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftNewVideoViewWithDW;
import com.alibaba.triver.triver_shop.newShop.NativeShopActivity;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.data.ShopStartActivityData;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.ShopBroadcastController;
import com.alibaba.triver.triver_shop.newShop.view.MiniAppShopContentRender;
import com.alibaba.triver.triver_shop.newShop.view.ShopStandardFragment;
import com.alibaba.triver.triver_shop.newShop.view.ShopView;
import com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BaseTemplateComponent;
import com.alibaba.triver.triver_shop.newShop.view.provider.DefaultFragmentViewProvider;
import com.alibaba.triver.triver_shop.newShop.view.provider.HomePageTabFragmentViewProvider;
import com.alibaba.triver.triver_shop.preload.ShopIndexWebViewPreload;
import com.alibaba.triver.triver_shop.shop2023.data.ShopComponentModel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.mobile.auth.gatewayauth.ResultCode;
import com.taobao.alimama.AlimamaAdvertising;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.android.behavix.service.BUFS;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.android.layoutmanager.module.MtopModule;
import com.taobao.android.nav.Nav;
import com.taobao.android.shop.activity.ShopRenderActivity;
import com.taobao.message.message_open_api.ICallService;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.Globals;
import com.taobao.tao.shop.common.ShopConstants;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.TBErrorView;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.utils.Global;
import com.taobao.wangxin.utils.WXConstantsOut;
import com.tmall.android.dai.DAI;
import com.tmall.android.dai.DAICallback;
import com.tmall.android.dai.DAIError;
import com.uc.crashsdk.export.LogType;
import com.ut.mini.UTAnalytics;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.b;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Regex;
import mtopsdk.mtop.util.ErrorConstant;
import tb.a1v;
import tb.ah0;
import tb.aqp;
import tb.brf;
import tb.c21;
import tb.c8c;
import tb.ckf;
import tb.cqp;
import tb.d1a;
import tb.dii;
import tb.dqp;
import tb.g1a;
import tb.gt9;
import tb.i04;
import tb.io9;
import tb.j9t;
import tb.jop;
import tb.jpu;
import tb.jvr;
import tb.jwk;
import tb.kew;
import tb.khu;
import tb.ll2;
import tb.ltt;
import tb.mmr;
import tb.mop;
import tb.msc;
import tb.mw5;
import tb.npp;
import tb.nt0;
import tb.olo;
import tb.pl4;
import tb.qu3;
import tb.r0k;
import tb.r4p;
import tb.r54;
import tb.rnp;
import tb.rpp;
import tb.so9;
import tb.ssq;
import tb.t2o;
import tb.ups;
import tb.vxm;
import tb.wmc;
import tb.wpd;
import tb.wsq;
import tb.wxi;
import tb.x4i;
import tb.xhv;
import tb.yh6;
import tb.yz3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopExtKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f3098a;

        public a(e eVar) {
            this.f3098a = eVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                this.f3098a.dismiss();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f3099a;

        public b(e eVar) {
            this.f3099a = eVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                this.f3099a.dismiss();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d1a<xhv> f3100a;
        public final /* synthetic */ e b;

        public c(d1a<xhv> d1aVar, e eVar) {
            this.f3100a = d1aVar;
            this.b = eVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            d1a<xhv> d1aVar = this.f3100a;
            if (d1aVar != null) {
                d1aVar.invoke();
            }
            this.b.dismiss();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d1a<xhv> f3101a;
        public final /* synthetic */ e b;

        public d(d1a<xhv> d1aVar, e eVar) {
            this.f3101a = d1aVar;
            this.b = eVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            d1a<xhv> d1aVar = this.f3101a;
            if (d1aVar != null) {
                d1aVar.invoke();
            }
            this.b.dismiss();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class e extends Dialog {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e(Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            if (str.hashCode() == -641568046) {
                super.onCreate((Bundle) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/ext/ShopExtKt$showCancelSubscribeDialog$dialog$1");
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            WindowManager.LayoutParams attributes;
            View decorView;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
                return;
            }
            super.onCreate(bundle);
            Window window = getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            Window window2 = getWindow();
            if (!(window2 == null || (decorView = window2.getDecorView()) == null)) {
                decorView.setPadding(0, 0, 0, 0);
            }
            Window window3 = getWindow();
            if (window3 != null && (attributes = window3.getAttributes()) != null) {
                attributes.gravity = 81;
                attributes.height = kew.p(300);
                attributes.width = -1;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class f implements io9 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShopDataParser f3102a;

        public f(ShopDataParser shopDataParser) {
            this.f3102a = shopDataParser;
        }

        @Override // tb.io9
        public final void a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8655d253", new Object[]{this, map});
            } else {
                a1v.c(this.f3102a, "Page_Shop_Live_FloatWindow_Close", null, null, 8, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class g implements so9 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShopDataParser f3103a;

        public g(ShopDataParser shopDataParser) {
            this.f3103a = shopDataParser;
        }

        @Override // tb.so9
        public final void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4921b3d7", new Object[]{this, new Boolean(z)});
            } else {
                this.f3103a.Q0().c(z);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class h implements so9 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShopDataParser f3104a;

        public h(ShopDataParser shopDataParser) {
            this.f3104a = shopDataParser;
        }

        @Override // tb.so9
        public final void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4921b3d7", new Object[]{this, new Boolean(z)});
            } else {
                this.f3104a.Q0().c(z);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class i implements DAICallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.tmall.android.dai.DAICallback
        public void onError(DAIError dAIError) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("326e086b", new Object[]{this, dAIError});
            } else {
                npp.Companion.f(ckf.p("startMnnTask onError ", dAIError));
            }
        }

        @Override // com.tmall.android.dai.DAICallback
        public void onSuccess(Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f85dc9a6", new Object[]{this, objArr});
                return;
            }
            ckf.g(objArr, "p0");
            npp.Companion.f("startMnnTask onSuccess ");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class j implements DAICallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.tmall.android.dai.DAICallback
        public void onError(DAIError dAIError) {
            Integer num;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("326e086b", new Object[]{this, dAIError});
                return;
            }
            npp.a aVar = npp.Companion;
            if (dAIError == null) {
                num = null;
            } else {
                num = Integer.valueOf(dAIError.errorCode);
            }
            aVar.b(ckf.p("dai error : ", num));
        }

        @Override // com.tmall.android.dai.DAICallback
        public void onSuccess(Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f85dc9a6", new Object[]{this, objArr});
                return;
            }
            ckf.g(objArr, "p0");
            npp.Companion.b(ckf.p("dai success : ", objArr));
        }
    }

    static {
        t2o.a(766509509);
    }

    public static final String A(ShopDataParser shopDataParser, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("691df02e", new Object[]{shopDataParser, new Boolean(z)});
        }
        ckf.g(shopDataParser, "shopDataParser");
        Uri.Builder appendQueryParameter = Uri.parse("https://shop" + ((Object) shopDataParser.W0()) + ".m.taobao.com").buildUpon().appendQueryParameter("disableShopOpenAnimation", "true");
        if (z) {
            str = "open";
        } else {
            str = "close";
        }
        String builder = appendQueryParameter.appendQueryParameter("foldDeviceStyle", str).appendQueryParameter(ShopRenderActivity.SHOP_NAVI, shopDataParser.R()).toString();
        ckf.f(builder, "parse(baseUrl).buildUpon()\n        .appendQueryParameter(ShopConstants.SHOP_DISABLE_ACTIVITY_ANIMATION_URL_KEY, \"true\")\n        .appendQueryParameter(ShopConstants.SHOP_DEVICE_FOLD_STYLE_URL_KEY, if (isFoldDeviceOpen) \"open\" else \"close\")\n        .appendQueryParameter(\"shop_navi\", shopDataParser.getCurrentPageName())\n        .toString()");
        return builder;
    }

    public static final int B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd3144b", new Object[0])).intValue();
        }
        try {
            int i2 = c21.g().getInt("deviceLevel", -1);
            if (i2 == 0) {
                return 3;
            }
            if (i2 == 1) {
                return 2;
            }
            if (i2 != 2) {
                return 0;
            }
            return 1;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public static final ShopZuoPinTabData C(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopZuoPinTabData) ipChange.ipc$dispatch("5630b1d0", new Object[]{context, str});
        }
        return (ShopZuoPinTabData) JSON.parseObject(r54.q(context, "shop_works_tab_red_dot_info", ckf.p("worksTabRedDotInfo_", str)), ShopZuoPinTabData.class);
    }

    public static final ShopStandardFragment D(Fragment fragment, int i2) {
        c8c v2;
        Fragment j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopStandardFragment) ipChange.ipc$dispatch("65bba9e0", new Object[]{fragment, new Integer(i2)});
        }
        if ((fragment instanceof ShopStandardFragment) && (v2 = ((ShopStandardFragment) fragment).v2()) != null && (v2 instanceof HomePageTabFragmentViewProvider) && (j2 = ((HomePageTabFragmentViewProvider) v2).j(i2)) != null && (j2 instanceof ShopStandardFragment)) {
            return (ShopStandardFragment) j2;
        }
        return null;
    }

    public static final Uri E(JSONObject jSONObject, ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("2505d654", new Object[]{jSONObject, shopDataParser});
        }
        ckf.g(jSONObject, AdvanceSetting.NETWORK_TYPE);
        ckf.g(shopDataParser, "shopDataParser");
        Uri build = Uri.parse("poplayer://ShopIndexToFeedToast").buildUpon().appendQueryParameter("text", jSONObject.getString("text")).appendQueryParameter(wxi.KEY_PIC_URL, jSONObject.getString("leftIcon")).appendQueryParameter(WXConstantsOut.SHOPID, shopDataParser.W0()).appendQueryParameter("sellerid", shopDataParser.N0()).build();
        ckf.f(build, "parse(\"poplayer://ShopIndexToFeedToast\").buildUpon()\n        .appendQueryParameter(\"text\", text)\n        .appendQueryParameter(\"picurl\", leftIcon)\n        .appendQueryParameter(\"shopid\", shopDataParser.getShopId())\n        .appendQueryParameter(\"sellerid\", shopDataParser.getSellerId())\n        .build()");
        return build;
    }

    public static final void F(ShopDataParser shopDataParser) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f19e0688", new Object[]{shopDataParser});
        } else if (shopDataParser != null && shopDataParser.g1().b()) {
            try {
                mmr.p().s();
                obj = Result.m1108constructorimpl(xhv.INSTANCE);
            } catch (Throwable th) {
                obj = Result.m1108constructorimpl(kotlin.b.a(th));
            }
            Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
            if (th2 != null) {
                npp.Companion.c("catching block has error", th2);
            }
        }
    }

    public static final void G(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c26871f", new Object[]{context, str});
            return;
        }
        String uri = Uri.parse(str).buildUpon().appendQueryParameter("shopNavIgnore", "true").build().toString();
        ckf.f(uri, "parse(shopUrl)\n        .buildUpon()\n        .appendQueryParameter(ShopConstants.SHOP_NAV_IGNORE, \"true\")\n        .build().toString()");
        Nav.from(context).toUri(uri);
    }

    public static final boolean H(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc7bcead", new Object[]{context})).booleanValue();
        }
        if (context != null && (context instanceof NativeShopActivity)) {
            return ((NativeShopActivity) context).k5();
        }
        return false;
    }

    public static final boolean I(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c330f5", new Object[]{uri})).booleanValue();
        }
        ckf.g(uri, "<this>");
        return ckf.b(uri.getQueryParameter("isShop"), "1");
    }

    public static final boolean K(String str) {
        Uri N;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be0f5488", new Object[]{str})).booleanValue();
        }
        if (aqp.Companion.d0() && (N = r54.N(str)) != null) {
            String x = x(N);
            String z = z(N);
            mop.b bVar = mop.b.INSTANCE;
            if (i04.R(bVar.a(), x) || i04.R(bVar.b(), z)) {
                return true;
            }
        }
        return false;
    }

    public static final void L(String str, String str2, boolean z, boolean z2, String str3, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4603e1d6", new Object[]{str, str2, new Boolean(z), new Boolean(z2), str3, new Boolean(z3)});
        } else {
            r54.P("monitorRouteData", new ShopExtKt$monitorRouteData$1(z3, z, str, str2, z2, str3));
        }
    }

    public static final void M(ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("591f8d31", new Object[]{shopDataParser});
            return;
        }
        ckf.g(shopDataParser, "shopData");
        if (aqp.Companion.u()) {
            r54.P("monitorShopKillBySystemData", new ShopExtKt$monitorShopKillBySystemData$1(shopDataParser));
        }
    }

    public static final void N(ShopDataParser shopDataParser, d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b9847e5", new Object[]{shopDataParser, d1aVar});
            return;
        }
        ckf.g(shopDataParser, "shopDataParser");
        ckf.g(d1aVar, "showRedDotCallback");
        Context Q = shopDataParser.Q();
        if (Q != null && aqp.Companion.j()) {
            r54.P("checkNeedShowRedDot", new ShopExtKt$needShowRedDot$1(shopDataParser, Q, d1aVar));
        }
    }

    public static final void O(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bc4f91", new Object[]{intent});
        } else if (aqp.Companion.y()) {
            r54.H(new ShopExtKt$notifyPrePushManagerRouteResult$1(intent));
        } else {
            cqp.c(cqp.INSTANCE, intent, false, 2, null);
        }
    }

    public static final void P(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92f09f0", new Object[]{str, str2, new Boolean(z)});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                ckf.d(str2);
                long parseLong = Long.parseLong(str2);
                String globalProperty = UTAnalytics.getInstance().getDefaultTracker().getGlobalProperty("_afc_id");
                HashMap hashMap = new HashMap();
                hashMap.put(ah0.AFC_ID, globalProperty);
                if (jvr.p().f()) {
                    AlimamaAdvertising.instance().commitTaokeInfo(str, parseLong, 0L, z, hashMap);
                } else {
                    AlimamaAdvertising.instance().commitTaokeInfo(str, parseLong, 0L, z);
                }
            } catch (Exception unused) {
            }
        }
    }

    public static final Pair<Integer, Integer> R(String str, String str2, ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("47d8c08", new Object[]{str, str2, shopDataParser});
        }
        ckf.g(str, "weexShopTab");
        ckf.g(str2, "weexSubShopTab");
        ckf.g(shopDataParser, "shopDataParser");
        JSONArray u1 = shopDataParser.u1();
        int intValue = new ShopExtKt$parseBarIndexFromWeexTab$fountMainIndexBlock$1(shopDataParser.A(), str).invoke().intValue();
        return new Pair<>(Integer.valueOf(intValue), Integer.valueOf(new ShopExtKt$parseBarIndexFromWeexTab$foundSubIndexBlock$1(intValue, u1, str2).invoke().intValue()));
    }

    public static final void T(DXRootView dXRootView, JSONObject jSONObject) {
        String string;
        Object obj;
        DXWidgetNode expandWidgetNode;
        DXWidgetNode queryWidgetNodeByUserId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("569bba7e", new Object[]{dXRootView, jSONObject});
            return;
        }
        if (jSONObject == null) {
            string = null;
        } else {
            try {
                string = jSONObject.getString("widgetNodeId");
            } catch (Throwable th) {
                obj = Result.m1108constructorimpl(kotlin.b.a(th));
            }
        }
        if (!(dXRootView == null || (expandWidgetNode = dXRootView.getExpandWidgetNode()) == null || (queryWidgetNodeByUserId = expandWidgetNode.queryWidgetNodeByUserId(string)) == null)) {
            DXEvent dXEvent = new DXEvent(18903999933159L);
            HashMap hashMap = new HashMap();
            hashMap.put("data", mw5.N(jSONObject));
            xhv xhvVar = xhv.INSTANCE;
            dXEvent.setArgs(hashMap);
            queryWidgetNodeByUserId.postEvent(dXEvent);
        }
        obj = Result.m1108constructorimpl(xhv.INSTANCE);
        Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
        if (th2 != null) {
            npp.Companion.c("catching block has error", th2);
        }
    }

    public static final void Y(ShopComponentModel shopComponentModel, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f73cd04a", new Object[]{shopComponentModel, context});
            return;
        }
        ckf.g(shopComponentModel, "<this>");
        ckf.g(context, "context");
        if (shopComponentModel.needPrefetchRequest()) {
            a0(shopComponentModel.getMtopInfo(), context);
        }
    }

    public static final void Z(ups upsVar) {
        Object obj;
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4796e809", new Object[]{upsVar});
            return;
        }
        ckf.g(upsVar, "<this>");
        if (aqp.Companion.u0()) {
            try {
                JSONArray m = upsVar.m();
                if (m != null) {
                    Iterator<Object> it = m.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next instanceof JSONObject) {
                            JSONObject jSONObject = (JSONObject) next;
                            ShopDataParser o = upsVar.o();
                            if (o == null) {
                                context = null;
                            } else {
                                context = o.Q();
                            }
                            a0(jSONObject, context);
                        }
                    }
                }
                upsVar.E(null);
                obj = Result.m1108constructorimpl(xhv.INSTANCE);
            } catch (Throwable th) {
                obj = Result.m1108constructorimpl(kotlin.b.a(th));
            }
            Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
            if (th2 != null) {
                npp.Companion.c("catching block has error", th2);
            }
        }
    }

    public static final /* synthetic */ void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6b3b7df", new Object[]{context, str});
        } else {
            G(context, str);
        }
    }

    public static final /* synthetic */ void b(String str, String str2, boolean z, boolean z2, String str3, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("610ab296", new Object[]{str, str2, new Boolean(z), new Boolean(z2), str3, new Boolean(z3)});
        } else {
            L(str, str2, z, z2, str3, z3);
        }
    }

    public static final /* synthetic */ void c(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f59d051", new Object[]{intent});
        } else {
            O(intent);
        }
    }

    public static final /* synthetic */ void d(Context context, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2194ca6e", new Object[]{context, jSONObject, str});
        } else {
            W(context, jSONObject, str);
        }
    }

    public static final void e(ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16906202", new Object[]{shopDataParser});
            return;
        }
        ckf.g(shopDataParser, "shopDataParser");
        Context Q = shopDataParser.Q();
        if (Q != null) {
            r54.P("allItemRedDotClickedRefreshSpStatus", new ShopExtKt$allItemRedDotClickedRefreshSpStatus$1(shopDataParser, Q));
        }
    }

    public static final void e0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29030c56", new Object[]{new Boolean(z)});
        } else {
            j9t.e(Globals.getApplication(), "shop").c().a("shop", "mute", Boolean.valueOf(z), null);
        }
    }

    public static final String f(String str, Intent intent) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("221838f2", new Object[]{str, intent});
        }
        if (str == null) {
            return null;
        }
        if (intent == null) {
            return str;
        }
        try {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            Uri data = intent.getData();
            if (data != null) {
                for (String str2 : data.getQueryParameterNames()) {
                    buildUpon.appendQueryParameter(str2, data.getQueryParameter(str2));
                }
                str = buildUpon.toString();
            }
            obj = Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(kotlin.b.a(th));
        }
        Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
        if (th2 != null) {
            npp.Companion.c("catching block has error", th2);
        }
        return str;
    }

    public static final String g(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7ae77e29", new Object[]{str});
        }
        if (!aqp.Companion.Y0() || !TBDeviceUtils.p(Global.getApplication())) {
            return str;
        }
        if (!TBAutoSizeConfig.x().T(Global.getApplication())) {
            str2 = "open";
        } else {
            str2 = "close";
        }
        String builder = Uri.parse(str).buildUpon().appendQueryParameter("foldDeviceStyle", str2).toString();
        ckf.f(builder, "{\n        val isOpen = !TBAutoSizeConfig.getInstance().isPortraitLayout(Global.getApplication())\n        var foldDevicesStyle = \"close\"\n        if (isOpen) {\n            foldDevicesStyle = \"open\"\n        }\n        Uri.parse(originalUrl).buildUpon()\n            .appendQueryParameter(\"foldDeviceStyle\", foldDevicesStyle)\n            .toString()\n    }");
        return builder;
    }

    public static final boolean j(DXRootView dXRootView, String str, Object obj) {
        JSONObject data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("393a3177", new Object[]{dXRootView, str, obj})).booleanValue();
        }
        if (!(obj instanceof JSONObject) && (data = dXRootView.getData()) != null && ckf.b(data.get(str), obj)) {
            return false;
        }
        return true;
    }

    public static final void k(Context context, Map<String, String> map, ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7733307e", new Object[]{context, map, shopDataParser});
            return;
        }
        ckf.g(context, "context");
        ckf.g(shopDataParser, "shopDataParser");
        Uri.Builder buildUpon = Uri.parse("poplayer://ShopSubscriptionGuideToast?type=shopSubscriptionGuide").buildUpon();
        ckf.f(buildUpon, "uriBuilder");
        r54.b(buildUpon, map);
        if (shopDataParser.l()) {
            buildUpon.appendQueryParameter("changeToFollow", "1");
        }
        khu.h(context, buildUpon.build().toString());
    }

    public static /* synthetic */ void k0(ShopDataParser shopDataParser, Boolean bool, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f975252", new Object[]{shopDataParser, bool, new Integer(i2), obj});
            return;
        }
        if ((i2 & 2) != 0) {
            bool = null;
        }
        j0(shopDataParser, bool);
    }

    public static final void l0(String str, JSONObject jSONObject, Context context) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b389dfc6", new Object[]{str, jSONObject, context});
            return;
        }
        try {
            Intent intent = new Intent("com.alibaba.poplayer.PopLayer.action.POP");
            intent.putExtra("event", str);
            intent.putExtra("param", jSONObject.toString());
            LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
            obj = Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(kotlin.b.a(th));
        }
        Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
        if (th2 != null) {
            npp.Companion.c("catching block has error", th2);
        }
    }

    public static final String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4549d972", new Object[0]);
        }
        try {
            return BUFS.getFeature(new BUFS.QueryArgs(), "shop.request.fetch", "PageShop", ShopConstants.PAGE_SHOP);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static final void n0(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("475af6e4", new Object[]{context, uri});
            return;
        }
        ckf.g(context, "context");
        if (uri != null && ckf.b(uri.getQueryParameter("benefitPop"), "true")) {
            Uri.Builder buildUpon = Uri.parse("poplayer://shop2Floorcardpopforalimama").buildUpon();
            for (String str : uri.getQueryParameterNames()) {
                buildUpon.appendQueryParameter(str, uri.getQueryParameter(str));
            }
            khu.h(context, buildUpon.toString());
        }
    }

    public static final jwk o(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jwk) ipChange.ipc$dispatch("bb5ee256", new Object[]{context, str});
        }
        if (context != null && (context instanceof NativeShopActivity)) {
            return ((NativeShopActivity) context).O4(str);
        }
        return null;
    }

    public static final JSONObject p(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e97624d8", new Object[]{jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        String str = null;
        jSONObject2.put((JSONObject) "name", jSONObject == null ? null : jSONObject.getString(yh6.CONFIG_KEY_TEMPLATE_NAME));
        jSONObject2.put((JSONObject) "version", jSONObject == null ? null : jSONObject.getString("templateVersion"));
        jSONObject2.put((JSONObject) "url", jSONObject == null ? null : jSONObject.getString("sourceUrl"));
        if (jSONObject != null) {
            str = jSONObject.getString("renderHeight");
        }
        jSONObject2.put((JSONObject) "renderHeight", str);
        return jSONObject2;
    }

    public static final JSONObject q(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a458492c", new Object[]{view});
        }
        if (!(view instanceof DXRootView)) {
            return new JSONObject();
        }
        DXRootView dXRootView = (DXRootView) view;
        if (dXRootView.getData() == null) {
            return new JSONObject();
        }
        return (JSONObject) dXRootView.getData().clone();
    }

    public static final boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9f7712c", new Object[0])).booleanValue();
        }
        Object b2 = j9t.e(Globals.getApplication(), "shop").b().b("shop", r0k.KEY_LIVE_MUTE, Boolean.TRUE, null);
        ckf.f(b2, "getInstance(Globals.getApplication(), \"shop\")\n        .appSettingProvider\n        .getLifeCycleSettingCurrentState(\"shop\", \"liveMute\", true, null)");
        return ((Boolean) b2).booleanValue();
    }

    public static final void r0(Map<String, String> map, Uri uri, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4efe3c2d", new Object[]{map, uri, new Long(j2)});
            return;
        }
        String x = x(uri);
        if (x != null) {
            HashMap i2 = r54.i(map);
            i2.put("preFetch", "true");
            i2.put("sellerId", x);
            String str = (String) i2.get("shopURL");
            i2.put("shopURL", Uri.encode(str));
            i2.put("nativeAllItemContainer", "true");
            i2.put(r4p.KEY_IS_WEEX_SHOP, "true");
            i2.put("bxConfigInvokeId", "shop.request.allitem");
            i2.put("bxConfigBizId", "PageShop");
            i2.put("bxConfigCurScene", ShopConstants.PAGE_SHOP);
            i2.put("isNewStyle", "true");
            i2.put("tb2021", "true");
            nt0.INSTANCE.b(String.valueOf(j2), olo.Companion.a(i2));
            npp.Companion.b(ckf.p("allItems prefetch , use url : ", str));
        }
    }

    public static final App s(Fragment fragment) {
        c8c v2;
        wpd i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (App) ipChange.ipc$dispatch("c83fb3a7", new Object[]{fragment});
        }
        ShopStandardFragment D = D(fragment, 0);
        if (D == null || (v2 = D.v2()) == null || !(v2 instanceof DefaultFragmentViewProvider) || (i2 = ((DefaultFragmentViewProvider) v2).i()) == null || !(i2 instanceof MiniAppShopContentRender)) {
            return null;
        }
        return ((MiniAppShopContentRender) i2).L();
    }

    public static final void s0(ShopDataParser shopDataParser) {
        String string;
        Context Q;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("471fb12", new Object[]{shopDataParser});
            return;
        }
        ckf.g(shopDataParser, "shopData");
        JSONObject jSONObject = shopDataParser.T0().getJSONObject("shopToastData");
        if (jSONObject != null && (string = jSONObject.getString("text")) != null && (Q = shopDataParser.Q()) != null) {
            r54.R(Q, string);
        }
    }

    public static final View u(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2cd40e12", new Object[]{context});
        }
        ckf.g(context, "context");
        TBErrorView tBErrorView = new TBErrorView(context);
        tBErrorView.setTitle(ErrorConstant.MappingMsg.SERVICE_MAPPING_MSG);
        tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_LEFT, 8);
        tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_RIGHT, 8);
        return tBErrorView;
    }

    public static final void u0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc11755", new Object[]{jSONObject});
            return;
        }
        ckf.g(jSONObject, "performanceData");
        rpp.a("ShopLoft", "renderPerformance", jSONObject, new JSONObject(), null);
        r54.P("shopLoftMonitor", new ShopExtKt$updateShopLoftMonitorData$1(jSONObject));
    }

    public static final Uri v(ShopDataParser shopDataParser, String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("14f36c2b", new Object[]{shopDataParser, str, jSONObject});
        }
        ckf.g(shopDataParser, "shopData");
        if (shopDataParser.H1()) {
            jSONObject2 = shopDataParser.O0().d();
        } else {
            jSONObject2 = shopDataParser.c1();
        }
        Uri.Builder buildUpon = Uri.parse(ShopLoftActivity.KEY_SHARE_URL_BASE).buildUpon();
        buildUpon.appendQueryParameter("seller_id", shopDataParser.N0());
        buildUpon.appendQueryParameter("shop_id", shopDataParser.W0());
        String str2 = null;
        buildUpon.appendQueryParameter("first_media_scene", jSONObject2 == null ? null : jSONObject2.getString("sceneId"));
        if (jSONObject2 != null) {
            str2 = jSONObject2.getString("id");
        }
        buildUpon.appendQueryParameter("first_media_id", str2);
        buildUpon.appendQueryParameter("title", shopDataParser.e1());
        buildUpon.appendQueryParameter("source", "shop");
        buildUpon.appendQueryParameter("spm", "a2141.b36769811.0.0");
        if (jSONObject2 != null) {
            jSONObject2.put("playerViewToken", (Object) str);
        }
        if (jSONObject2 != null) {
            jSONObject2.put("liveTransParams", (Object) jSONObject);
        }
        if (jSONObject2 != null) {
            jSONObject2.put("livesource", "shop2F_bigcard_open");
        }
        if (!shopDataParser.a3() && jSONObject2 != null) {
            buildUpon.appendQueryParameter("loftData", jSONObject2.toJSONString());
        }
        Uri build = buildUpon.build();
        ckf.f(build, "builder.build()");
        return build;
    }

    public static final void v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1622a0fe", new Object[0]);
        } else if (aqp.Companion.a1()) {
            ShopLoftViewManager.registerShopLoftView(ShopLoftViewManager.TYPE_MINI_CARD_VIDEO, TBMiniShopVideoView.class);
            ShopLoftViewManager.registerShopLoftView(ShopLoftViewManager.TYPE_MARKET_VIDEO, TBMarketShopVideoView.class);
            ShopLoftViewManager.registerShopLoftView(ShopLoftViewManager.TYPE_NEW_VIDEO, TBLoftDWShopVideoView.class);
        } else {
            ShopLoftViewManager.registerShopLoftView(ShopLoftViewManager.TYPE_MINI_CARD_VIDEO, MiniVideoLoftView.class);
            ShopLoftViewManager.registerShopLoftView(ShopLoftViewManager.TYPE_MARKET_VIDEO, x4i.class);
            ShopLoftViewManager.registerShopLoftView(ShopLoftViewManager.TYPE_NEW_VIDEO, ShopLoftNewVideoViewWithDW.class);
        }
    }

    public static /* synthetic */ Uri w(ShopDataParser shopDataParser, String str, JSONObject jSONObject, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("c55406bf", new Object[]{shopDataParser, str, jSONObject, new Integer(i2), obj});
        }
        if ((i2 & 4) != 0) {
            jSONObject = null;
        }
        return v(shopDataParser, str, jSONObject);
    }

    public static final void w0(DinamicXEngine dinamicXEngine, View view, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b5c45e8", new Object[]{dinamicXEngine, view, str, obj});
            return;
        }
        ckf.g(dinamicXEngine, "<this>");
        ckf.g(view, "dxView");
        if (view instanceof DXRootView) {
            DXRootView dXRootView = (DXRootView) view;
            if (j(dXRootView, str, obj)) {
                JSONObject q = q(view);
                q.put((JSONObject) str, (String) obj);
                dinamicXEngine.j1(dXRootView, q);
            }
        }
    }

    public static final void x0(DinamicXEngine dinamicXEngine, View view, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a60d473c", new Object[]{dinamicXEngine, view, jSONObject});
            return;
        }
        ckf.g(dinamicXEngine, "<this>");
        ckf.g(view, "dxView");
        if ((view instanceof DXRootView) && jSONObject != null) {
            JSONObject q = q(view);
            q.putAll(jSONObject);
            dinamicXEngine.j1((DXRootView) view, q);
        }
    }

    public static final boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74acb836", new Object[0])).booleanValue();
        }
        Object b2 = j9t.e(Globals.getApplication(), "shop").b().b("shop", "mute", Boolean.TRUE, null);
        ckf.f(b2, "getInstance(Globals.getApplication(), \"shop\")\n        .appSettingProvider\n        .getLifeCycleSettingCurrentState(\"shop\", \"mute\", true, null)");
        return ((Boolean) b2).booleanValue();
    }

    public static final boolean f0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a747582", new Object[]{str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        return ckf.b("store", Uri.parse(str).getQueryParameter("shopBizType"));
    }

    public static final void h(ShopDataParser shopDataParser, Intent intent, Bundle bundle) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("750947c2", new Object[]{shopDataParser, intent, bundle});
            return;
        }
        ckf.g(shopDataParser, "<this>");
        if (bundle == null) {
            bundle = intent == null ? null : intent.getExtras();
        }
        if (bundle != null) {
            if (bundle.containsKey(mop.KEY_APP_START)) {
                try {
                    shopDataParser.Y2(mop.KEY_APP_START, Long.valueOf(bundle.getLong(mop.KEY_APP_START)));
                    Result.m1108constructorimpl(xhv.INSTANCE);
                } catch (Throwable th) {
                    Result.m1108constructorimpl(kotlin.b.a(th));
                }
            }
            if (bundle.containsKey(mop.KEY_ROUTER_START_TIME)) {
                try {
                    shopDataParser.Y2(mop.KEY_ROUTER_START_TIME, Long.valueOf(bundle.getLong(mop.KEY_ROUTER_START_TIME)));
                    Result.m1108constructorimpl(xhv.INSTANCE);
                } catch (Throwable th2) {
                    Result.m1108constructorimpl(kotlin.b.a(th2));
                }
            }
            if (bundle.containsKey(mop.KEY_ROUTER_END_TIME)) {
                try {
                    shopDataParser.Y2(mop.KEY_ROUTER_END_TIME, Long.valueOf(bundle.getLong(mop.KEY_ROUTER_END_TIME)));
                    Result.m1108constructorimpl(xhv.INSTANCE);
                } catch (Throwable th3) {
                    Result.m1108constructorimpl(kotlin.b.a(th3));
                }
            }
            try {
                shopDataParser.Y2(mop.KEY_SHOP_LAUNCH_OPT, Boolean.valueOf(bundle.getBoolean(mop.KEY_SHOP_LAUNCH_OPT, false)));
                obj = Result.m1108constructorimpl(xhv.INSTANCE);
            } catch (Throwable th4) {
                obj = Result.m1108constructorimpl(kotlin.b.a(th4));
            }
            Result.m1107boximpl(obj);
        }
    }

    public static final void h0(Context context, boolean z, d1a<xhv> d1aVar, ShopDataParser shopDataParser, d1a<xhv> d1aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faadd28", new Object[]{context, new Boolean(z), d1aVar, shopDataParser, d1aVar2});
            return;
        }
        ckf.g(context, "context");
        ckf.g(shopDataParser, "shopData");
        View K = kew.K(context, R.layout.dialog_shop_subscribe_manager);
        if (K != null) {
            e eVar = new e(context);
            eVar.setContentView(K);
            View findViewById = K.findViewById(R.id.dialog_shop_subscribe_cancel_button);
            TUrlImageView tUrlImageView = (TUrlImageView) K.findViewById(R.id.dialog_shop_subscribe_title_close_button);
            View findViewById2 = K.findViewById(R.id.dialog_shop_subscribe_star);
            View findViewById3 = K.findViewById(R.id.dialog_shop_subscribe_subscribe);
            ImageView imageView = (ImageView) K.findViewById(R.id.dialog_shop_subscribe_star_img);
            TextView textView = (TextView) K.findViewById(R.id.dialog_shop_subscribe_star_title);
            TextView textView2 = (TextView) K.findViewById(R.id.dialog_shop_subscribe_star_detail_text);
            TextView textView3 = (TextView) K.findViewById(R.id.dialog_shop_subscribe_subscribe_title);
            TextView textView4 = (TextView) K.findViewById(R.id.dialog_shop_subscribe_title_text);
            if (shopDataParser.l()) {
                textView4.setText("关注管理");
                textView3.setText("取消关注");
                textView.setText("特别关注");
                textView2.setText("关注频道优先展示TA的动态");
            }
            if (z) {
                imageView.setImageResource(R.drawable.shop_star_cancel_icon);
                if (shopDataParser.l()) {
                    textView.setText("取消特别关注");
                } else {
                    textView.setText("取消星标");
                }
                ckf.f(textView2, "starDetailText");
                kew.B(textView2);
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                    ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                    ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = 0;
                    layoutParams2.bottomToBottom = 0;
                    textView.setLayoutParams(layoutParams);
                }
            }
            tUrlImageView.setImageUrl(mop.KEY_CLOSE_BUTTON_URL);
            ViewProxy.setOnClickListener(findViewById, new a(eVar));
            tUrlImageView.setOnClickListener(new b(eVar));
            ViewProxy.setOnClickListener(findViewById2, new c(d1aVar, eVar));
            ViewProxy.setOnClickListener(findViewById3, new d(d1aVar2, eVar));
            eVar.show();
        }
    }

    public static final void i0(ShopDataParser shopDataParser, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f54dd1a1", new Object[]{shopDataParser, new Boolean(z)});
            return;
        }
        ckf.g(shopDataParser, "shopDataParser");
        if (shopDataParser.l()) {
            str = gt9.TEXT_UNFOLLOW_DEFAULT;
        } else {
            str = "订阅";
        }
        if (!z) {
            Context Q = shopDataParser.Q();
            Toast.makeText(Q, wmc.CANCEL + str + ResultCode.MSG_SUCCESS, 0).show();
        } else if (shopDataParser.Z1()) {
            Uri.Builder buildUpon = Uri.parse(mop.KEY_SUBSCRIBE_SUCCESS_URL).buildUpon();
            buildUpon.appendQueryParameter("followedId", shopDataParser.N0());
            buildUpon.appendQueryParameter("sourcePage", "0.0");
            if (shopDataParser.l()) {
                buildUpon.appendQueryParameter("changeToFollow", "1");
            }
            Nav.from(shopDataParser.Q()).toUri(buildUpon.build());
        }
    }

    public static final void m0(Context context, String str, ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("290fd9cf", new Object[]{context, str, shopDataParser});
            return;
        }
        ckf.g(context, "context");
        ckf.g(shopDataParser, "shopData");
        if (!shopDataParser.U0() && !r54.r(context) && str != null) {
            shopDataParser.I2(true);
            JSONObject jSONObject = new JSONObject();
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            buildUpon.appendQueryParameter("identityCode", shopDataParser.s0());
            StringBuilder sb = new StringBuilder();
            sb.append(kew.O(Integer.valueOf(shopDataParser.m0())));
            sb.append(',');
            sb.append(kew.O(Integer.valueOf(shopDataParser.l0())));
            buildUpon.appendQueryParameter("paddingTopAndBottom", sb.toString());
            jSONObject.put((JSONObject) mop.KEY_APM_SHOP_URL, buildUpon.build().toString());
            jSONObject.put((JSONObject) "isFollowed", String.valueOf(shopDataParser.U1()));
            jSONObject.put((JSONObject) "shopName", shopDataParser.e1());
            jSONObject.put((JSONObject) "shopLogo", shopDataParser.d1());
            jSONObject.put((JSONObject) "shopInfo", (String) shopDataParser.Z0());
            if (aqp.Companion.B()) {
                jSONObject.put((JSONObject) "headerData", (String) shopDataParser.o0());
            }
            l0(mop.KEY_FLOAT_POP_URL, jSONObject, context);
            npp.Companion.b("show shop pop layer");
        }
    }

    public static final void o0(ShopDataParser shopDataParser) {
        JSONObject z0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44801c43", new Object[]{shopDataParser});
            return;
        }
        ckf.g(shopDataParser, "shopData");
        if (shopDataParser.k2() && (z0 = shopDataParser.z0()) != null) {
            shopDataParser.Y2("useMnn", Boolean.TRUE);
            npp.Companion.f(" startMnnTask ");
            HashMap hashMap = new HashMap();
            hashMap.putAll(z0);
            DAI.runCompute("private_user_intention_centralctrl_scene", hashMap, new i());
            final BroadcastReceiver shopExtKt$startMnnTask$receiver$1 = new BroadcastReceiver() { // from class: com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt$startMnnTask$receiver$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* compiled from: Taobao */
                /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
                public static final class a implements msc {
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.jdb
                    public void O(ErrorResult errorResult) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("14182866", new Object[]{this, errorResult});
                            return;
                        }
                        ckf.g(errorResult, "result");
                        npp.Companion.f(ckf.p(" onError ", errorResult));
                    }
                }

                public static /* synthetic */ Object ipc$super(ShopExtKt$startMnnTask$receiver$1 shopExtKt$startMnnTask$receiver$12, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/ext/ShopExtKt$startMnnTask$receiver$1");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                        return;
                    }
                    ckf.g(context, "context");
                    ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
                    boolean booleanExtra = intent.getBooleanExtra("com.tmall.android.dai.intent.extra.RESULT", false);
                    String stringExtra = intent.getStringExtra("com.tmall.android.dai.intent.extra.MODEL_NAME");
                    if (!ckf.b("private_user_intention_centralctrl_scene", stringExtra)) {
                        npp.a aVar = npp.Companion;
                        aVar.b("dai broadcast modelName = " + ((Object) stringExtra) + " , not matched");
                        return;
                    }
                    Serializable serializableExtra = intent.getSerializableExtra("com.tmall.android.dai.intent.extra.OUTPUT_DATA");
                    if (serializableExtra != null) {
                        HashMap hashMap2 = (HashMap) serializableExtra;
                        npp.a aVar2 = npp.Companion;
                        aVar2.f("startMnnTask onReceive " + booleanExtra + ' ' + ((Object) stringExtra) + ' ' + hashMap2);
                        dii c2 = dii.c();
                        ckf.f(c2, "createInstance()");
                        c2.d(new ll2(kotlin.collections.a.j(jpu.a("bizId", qu3.MNN), jpu.a("eventName", "TBShopContainerBroadcast"), jpu.a("detail", hashMap2))), new a());
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.util.HashMap<*, *>{ kotlin.collections.TypeAliasesKt.HashMap<*, *> }");
                }
            };
            IntentFilter intentFilter = new IntentFilter(DAI.ACTION_COMPUTE_COMPLETE);
            intentFilter.addDataScheme("DAI_private_user_intention_centralctrl_scene");
            intentFilter.addDataSchemeSpecificPart("com.tmall.android.dai", 0);
            final Context Q = shopDataParser.Q();
            if (Q instanceof FragmentActivity) {
                FragmentActivity fragmentActivity = (FragmentActivity) Q;
                fragmentActivity.registerReceiver(shopExtKt$startMnnTask$receiver$1, intentFilter);
                fragmentActivity.getLifecycle().addObserver(new LifecycleObserver() { // from class: com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt$startMnnTask$2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                    public final void onDestroyed() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("bf354a81", new Object[]{this});
                            return;
                        }
                        ((FragmentActivity) Q).getLifecycle().removeObserver(this);
                        ((FragmentActivity) Q).unregisterReceiver(shopExtKt$startMnnTask$receiver$1);
                    }
                });
            }
        }
    }

    public static final void p0(ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b997bae0", new Object[]{shopDataParser});
        } else if (shopDataParser != null) {
            JSONArray f2 = brf.f(shopDataParser.u1(), 0);
            JSONObject g2 = f2 == null ? null : brf.g(f2, 0);
            if (g2 != null) {
                ups upsVar = new ups(g2, shopDataParser, 0, 0);
                Uri parse = Uri.parse(upsVar.n());
                ckf.f(parse, "parse(tabBarItemDataModel.getRenderUrl())");
                Map<String, String> o = r54.o(parse);
                Bundle W = r54.W(o);
                if (W == null) {
                    W = new Bundle();
                }
                W.putString("ori_url", upsVar.n());
                dqp.a(shopDataParser, shopDataParser.T0(), o, W, new jop(shopDataParser), true);
            }
        }
    }

    public static final void t0(ShopDataParser shopDataParser) {
        Object obj;
        Context Q;
        String stringExtra;
        Uri K0;
        String W0;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d19dc8e", new Object[]{shopDataParser});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (!(shopDataParser == null || (W0 = shopDataParser.W0()) == null)) {
            jSONObject.put((JSONObject) "appId", ckf.p("N_", W0));
        }
        jSONObject.put((JSONObject) "hitAllItemPrefetch", (String) Boolean.valueOf(shopDataParser == null ? false : shopDataParser.q0()));
        if (shopDataParser != null) {
            shopDataParser.Y2("hitAllItemPrefetch", Boolean.valueOf(shopDataParser.q0()));
        }
        jSONObject.put((JSONObject) "templateId", mop.TB_NATIVE_SHOP_COMMON_TEMPLATE_ID);
        String str = null;
        jSONObject.put((JSONObject) "url", (shopDataParser == null || (K0 = shopDataParser.K0()) == null) ? null : K0.toString());
        jSONObject.put((JSONObject) "industryShop", shopDataParser == null ? null : shopDataParser.u0());
        jSONObject.put((JSONObject) "is2022Style", (String) Boolean.valueOf(shopDataParser == null ? false : shopDataParser.G1()));
        if (shopDataParser != null) {
            z = shopDataParser.H1();
        }
        jSONObject.put((JSONObject) "is2023Style", (String) Boolean.valueOf(z));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put((JSONObject) "newStage", (String) (shopDataParser == null ? null : shopDataParser.n1()));
        jSONObject.put((JSONObject) "errorTemplate", (String) (shopDataParser == null ? null : shopDataParser.X()));
        if (!(shopDataParser == null || (Q = shopDataParser.Q()) == null || !(Q instanceof Activity) || (stringExtra = ((Activity) Q).getIntent().getStringExtra("originalRouteUrl")) == null)) {
            jSONObject.put((JSONObject) "originalRouteUrl", stringExtra);
        }
        rpp.a("Triver", "Launch", jSONObject, jSONObject2, shopDataParser);
        if (shopDataParser != null) {
            try {
                JSONObject n1 = shopDataParser.n1();
                if (n1 != null) {
                    str = n1.toJSONString();
                }
            } catch (Throwable th) {
                obj = Result.m1108constructorimpl(kotlin.b.a(th));
            }
        }
        npp.Companion.b(str);
        if (str == null) {
            str = "";
        }
        Log.e(ShopView.SP_NAMESPACE, str);
        obj = Result.m1108constructorimpl(xhv.INSTANCE);
        Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
        if (th2 != null) {
            npp.Companion.c("catching block has error", th2);
        }
    }

    public static final rnp J(String str) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rnp) ipChange.ipc$dispatch("bf9d8df9", new Object[]{str});
        }
        ckf.g(str, "routeUrl");
        if (!wsq.O(str, "shop.m.taobao.com/shop/shop_index.htm", false, 2, null)) {
            String host = Uri.parse(str).getHost();
            if (host != null && !wsq.O(host, "shop", false, 2, null)) {
                return rnp.Companion.c();
            }
            Regex[] a2 = mop.Companion.a();
            int length = a2.length;
            while (i2 < length) {
                Regex regex = a2[i2];
                i2++;
                if (host != null && regex.matches(host)) {
                    return rnp.Companion.a();
                }
            }
            return rnp.Companion.c();
        } else if (K(str)) {
            return rnp.Companion.b();
        } else {
            return rnp.Companion.a();
        }
    }

    public static final Pair<Integer, Integer> Q(String str, JSONArray jSONArray) {
        int size;
        JSONArray jSONArray2;
        int size2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("f516ac1a", new Object[]{str, jSONArray});
        }
        ckf.g(str, "shpoNavi");
        ckf.g(jSONArray, "tabBarViewModelArray");
        Pair<Integer, Integer> pair = new Pair<>(0, 0);
        if (!TextUtils.isEmpty(str) && jSONArray.size() > 0 && (size = jSONArray.size() - 1) >= 0) {
            while (true) {
                int i2 = size - 1;
                Object obj = jSONArray.get(size);
                if ((obj instanceof JSONArray) && (size2 = (jSONArray2 = (JSONArray) obj).size()) > 0) {
                    int i3 = 0;
                    while (true) {
                        int i4 = i3 + 1;
                        Object obj2 = jSONArray2.get(i3);
                        if ((obj2 instanceof JSONObject) && ckf.b(str, ((JSONObject) obj2).get("name"))) {
                            return new Pair<>(Integer.valueOf(size), Integer.valueOf(i3));
                        }
                        if (i4 >= size2) {
                            break;
                        }
                        i3 = i4;
                    }
                }
                if (i2 < 0) {
                    break;
                }
                size = i2;
            }
        }
        return pair;
    }

    public static final void U(ShopDataParser shopDataParser) {
        Object obj;
        vxm vxmVar;
        Context Q;
        Long l;
        String obj2;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c43113da", new Object[]{shopDataParser});
            return;
        }
        ckf.g(shopDataParser, "shopData");
        try {
            String[] strArr = {mop.KEY_ROUTER_START_TIME, mop.KEY_ROUTER_END_TIME, mop.KEY_APP_START, mop.KEY_CONTAINER_START, mop.KEY_CONTAINER_FINISH};
            while (i2 < 5) {
                String str = strArr[i2];
                i2++;
                Object obj3 = shopDataParser.n1().get(str);
                if (obj3 instanceof Long) {
                    l = (Long) obj3;
                } else {
                    l = null;
                    if (!(obj3 == null || (obj2 = obj3.toString()) == null)) {
                        l = ssq.o(obj2);
                    }
                }
                if (l != null) {
                    long longValue = l.longValue();
                    vxm vxmVar2 = vxm.b;
                    vxmVar2.e().j(ckf.p("shop_", str), r54.j(longValue));
                    Context Q2 = shopDataParser.Q();
                    if (Q2 != null) {
                        vxmVar2.a((Activity) Q2).j(ckf.p("shop_", str), r54.j(longValue));
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
                    }
                }
            }
            vxmVar = vxm.b;
            Q = shopDataParser.Q();
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(kotlin.b.a(th));
        }
        if (Q != null) {
            vxmVar.a((Activity) Q).a(ShopRenderActivity.SHOP_NAVI, shopDataParser.n1().get(mop.KEY_TAB_KEY_NAME));
            vxmVar.e().a(ShopRenderActivity.SHOP_NAVI, shopDataParser.n1().get(mop.KEY_TAB_KEY_NAME));
            obj = Result.m1108constructorimpl(xhv.INSTANCE);
            Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
            if (th2 != null) {
                npp.Companion.c("catching block has error", th2);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
    }

    public static final void V(BaseTemplateComponent... baseTemplateComponentArr) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b4e1e5", new Object[]{baseTemplateComponentArr});
            return;
        }
        ckf.g(baseTemplateComponentArr, mop.KEY_TEMPLATE_LIST);
        int length = baseTemplateComponentArr.length;
        while (i2 < length) {
            BaseTemplateComponent baseTemplateComponent = baseTemplateComponentArr[i2];
            i2++;
            if (baseTemplateComponent != null) {
                baseTemplateComponent.p();
            }
        }
    }

    public static final void a0(JSONObject jSONObject, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("688956a5", new Object[]{jSONObject, context});
        } else if (context != null && jSONObject != null) {
            String string = jSONObject.getString("api");
            String string2 = jSONObject.getString("version");
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            BizExtKt.h(context, string, string2, jSONObject2 == null ? null : r54.V(jSONObject2), null, null, ckf.b(jSONObject.getString(ICallService.KEY_NEED_LOGIN), "true"), ckf.b(jSONObject.getString("needEncode"), "true"), true, null, false, null, null, 7680, null);
        }
    }

    public static final void g0(ShopDataParser shopDataParser) {
        String W0;
        Context Q;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fa2251f", new Object[]{shopDataParser});
            return;
        }
        ckf.g(shopDataParser, "shopData");
        if (aqp.Companion.A0() && (W0 = shopDataParser.W0()) != null) {
            Context Q2 = shopDataParser.Q();
            String c2 = Q2 == null ? null : khu.c(Q2);
            if (c2 != null && (Q = shopDataParser.Q()) != null) {
                ShopZuoPinTabData C = C(Q, c2);
                if (C == null) {
                    C = new ShopZuoPinTabData();
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - C.getLastUpdateTime() >= 86400000) {
                    C.setLastUpdateTime(currentTimeMillis);
                    C.setADayCount(0);
                    C.getADayShopListCounts().clear();
                }
                C.setADayCount(C.getADayCount() + 1);
                C.getADayShopListCounts().put(W0, 1);
                r54.O(Q, "shop_works_tab_red_dot_info", ckf.p("worksTabRedDotInfo_", c2), JSON.toJSONString(C));
            }
        }
    }

    public static final boolean i(Context context, Intent intent) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a24fe3d", new Object[]{context, intent})).booleanValue();
        }
        ckf.g(context, "context");
        ckf.g(intent, "sourceIntent");
        if (!aqp.Companion.v() || !intent.getBooleanExtra("needDowngradeTo21", false)) {
            return false;
        }
        Intent intent2 = new Intent();
        intent2.setData(intent.getData());
        Uri data = intent2.getData();
        if (data != null) {
            i2 = data.hashCode();
        }
        long currentTimeMillis = i2 + System.currentTimeMillis();
        intent2.putExtra("shopBundleId", currentTimeMillis);
        Bundle extras = intent.getExtras();
        if (extras != null) {
            ShopStartActivityData.INSTANCE.e(currentTimeMillis, extras);
        }
        intent2.putExtra(mop.KEY_ENABLE_NEW_START_AC_LOGIC, true);
        intent2.setClass(context, NativeShopActivity.class);
        intent2.addFlags(65536);
        context.startActivity(intent2);
        return true;
    }

    public static final void l(ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afc30664", new Object[]{shopDataParser});
            return;
        }
        ckf.g(shopDataParser, "shopData");
        a1v.c(shopDataParser, "Page_Shop_New_livecard", kotlin.collections.a.k(jpu.a("feed_id", shopDataParser.O0().f()), jpu.a("identityCode", shopDataParser.s0()), jpu.a("clicktype", "Sliding")), null, 8, null);
    }

    public static final void m(Intent intent, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43419d16", new Object[]{intent, context});
            return;
        }
        ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        ckf.g(context, "context");
        String stringExtra = intent.getStringExtra("spm");
        if (stringExtra == null) {
            Uri data = intent.getData();
            String str = null;
            boolean z = (data == null ? null : data.getQueryParameter("item_id")) != null;
            Uri data2 = intent.getData();
            if (data2 != null) {
                str = data2.getQueryParameter("from");
            }
            boolean b2 = ckf.b(str, "shopsearch");
            if (z) {
                a1v.k(context, kotlin.collections.a.k(jpu.a("spm-url", "a2141.7631564.shop-fix.0")));
            } else if (b2) {
                a1v.k(context, kotlin.collections.a.k(jpu.a("spm-url", "a2141.8187980.shop-fix.0")));
            }
        } else {
            a1v.k(context, kotlin.collections.a.k(jpu.a("spm-url", stringExtra)));
        }
    }

    public static final String x(Uri uri) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca72a0f4", new Object[]{uri});
        }
        String[] strArr = {"sellerId", "userId", "user_id", "userid", "seller_id", "sellerid"};
        while (i2 < 6) {
            String str = strArr[i2];
            i2++;
            String queryParameter = uri.getQueryParameter(str);
            if (queryParameter != null) {
                return queryParameter;
            }
        }
        return null;
    }

    public static final String z(Uri uri) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6e2cfc5d", new Object[]{uri});
        }
        String[] strArr = {"shopId", WXConstantsOut.SHOPID, "shop_id"};
        while (i2 < 3) {
            String str = strArr[i2];
            i2++;
            String queryParameter = uri.getQueryParameter(str);
            if (queryParameter != null) {
                return queryParameter;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.alibaba.triver.triver_shop.newShop.data.ShopDataParser S(android.content.Context r12, android.content.Intent r13, tb.u1a<? super java.lang.String, ? super java.lang.Integer, tb.xhv> r14) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt.S(android.content.Context, android.content.Intent, tb.u1a):com.alibaba.triver.triver_shop.newShop.data.ShopDataParser");
    }

    public static final void X(ShopDataParser shopDataParser, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("473f198c", new Object[]{shopDataParser, jSONObject});
            return;
        }
        ckf.g(shopDataParser, "shopData");
        JSONObject a2 = brf.a(jpu.a("_msg_name", com.alibaba.triver.triver_shop.newShop.event.broadcast.a.UCP_TO_SHOP), jpu.a("_msg_type", com.alibaba.triver.triver_shop.newShop.event.broadcast.a.UCP_TO_SHOP), jpu.a("_msg_token", shopDataParser.W0()), jpu.a("_msg_source", com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT), jpu.a("_msg_target", "*"), jpu.a("data", jSONObject));
        ShopBroadcastController f2 = ShopBroadcastController.f(shopDataParser.Q());
        if (f2 != null) {
            f2.i(a2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void j0(com.alibaba.triver.triver_shop.newShop.data.ShopDataParser r13, java.lang.Boolean r14) {
        /*
            r0 = 0
            r1 = 2
            r2 = 1
            com.android.alibaba.ip.runtime.IpChange r3 = com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0015
            java.lang.String r4 = "1405296a"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r13
            r1[r2] = r14
            r3.ipc$dispatch(r4, r1)
            return
        L_0x0015:
            java.lang.String r3 = "shopData"
            tb.ckf.g(r13, r3)
            com.alibaba.triver.triver_shop.newShop.data.ShopDataParser$h r3 = r13.g1()
            boolean r3 = r3.b()
            if (r3 != 0) goto L_0x0026
            return
        L_0x0026:
            boolean r3 = r13.V1()     // Catch: all -> 0x0043
            if (r3 != 0) goto L_0x002e
            goto L_0x00cb
        L_0x002e:
            if (r14 != 0) goto L_0x004b
            com.alibaba.triver.triver_shop.newShop.data.ShopDataParser$f r14 = r13.P0()     // Catch: all -> 0x0043
            boolean r14 = r14.c()     // Catch: all -> 0x0043
            if (r14 == 0) goto L_0x0046
            com.alibaba.triver.triver_shop.newShop.data.ShopDataParser$g r14 = r13.Q0()     // Catch: all -> 0x0043
            boolean r14 = r14.a()     // Catch: all -> 0x0043
            goto L_0x004f
        L_0x0043:
            r13 = move-exception
            goto L_0x00d2
        L_0x0046:
            boolean r14 = y()     // Catch: all -> 0x0043
            goto L_0x004f
        L_0x004b:
            boolean r14 = r14.booleanValue()     // Catch: all -> 0x0043
        L_0x004f:
            com.alibaba.triver.triver_shop.newShop.data.ShopDataParser$e r3 = r13.O0()     // Catch: all -> 0x0043
            com.alibaba.fastjson.JSONObject r3 = r3.d()     // Catch: all -> 0x0043
            java.lang.String r4 = "liveId"
            r5 = 0
            if (r3 != 0) goto L_0x005f
            r3 = r5
            goto L_0x0063
        L_0x005f:
            java.lang.String r3 = r3.getString(r4)     // Catch: all -> 0x0043
        L_0x0063:
            if (r3 != 0) goto L_0x0071
            com.alibaba.fastjson.JSONObject r3 = r13.Z0()     // Catch: all -> 0x0043
            if (r3 != 0) goto L_0x006d
            r8 = r5
            goto L_0x0072
        L_0x006d:
            java.lang.String r3 = r3.getString(r4)     // Catch: all -> 0x0043
        L_0x0071:
            r8 = r3
        L_0x0072:
            tb.mmr r6 = tb.mmr.p()     // Catch: all -> 0x0043
            android.content.Context r7 = r13.Q()     // Catch: all -> 0x0043
            kotlin.Pair r3 = tb.jpu.a(r4, r8)     // Catch: all -> 0x0043
            java.lang.String r4 = "bizCode"
            java.lang.String r9 = "shop"
            kotlin.Pair r4 = tb.jpu.a(r4, r9)     // Catch: all -> 0x0043
            java.lang.String r9 = "mute"
            if (r14 == 0) goto L_0x008f
            java.lang.String r14 = "MUTE"
            goto L_0x0091
        L_0x008f:
            java.lang.String r14 = "NONMUTE"
        L_0x0091:
            kotlin.Pair r14 = tb.jpu.a(r9, r14)     // Catch: all -> 0x0043
            r9 = 3
            kotlin.Pair[] r9 = new kotlin.Pair[r9]     // Catch: all -> 0x0043
            r9[r0] = r3     // Catch: all -> 0x0043
            r9[r2] = r4     // Catch: all -> 0x0043
            r9[r1] = r14     // Catch: all -> 0x0043
            java.util.Map r9 = kotlin.collections.a.k(r9)     // Catch: all -> 0x0043
            com.alibaba.triver.triver_shop.newShop.data.ShopDataParser$ShopViewContext r14 = r13.m1()     // Catch: all -> 0x0043
            android.view.View$OnClickListener r10 = r14.e()     // Catch: all -> 0x0043
            com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt$f r11 = new com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt$f     // Catch: all -> 0x0043
            r11.<init>(r13)     // Catch: all -> 0x0043
            com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt$g r12 = new com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt$g     // Catch: all -> 0x0043
            r12.<init>(r13)     // Catch: all -> 0x0043
            r6.M(r7, r8, r9, r10, r11, r12)     // Catch: all -> 0x0043
            tb.mmr r14 = tb.mmr.p()     // Catch: all -> 0x0043
            com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt$h r0 = new com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt$h     // Catch: all -> 0x0043
            r0.<init>(r13)     // Catch: all -> 0x0043
            r14.G(r0)     // Catch: all -> 0x0043
            r13.u2(r2)     // Catch: all -> 0x0043
            java.lang.String r14 = "Page_Shop_Live_FloatWindow"
            tb.a1v.d(r13, r14, r5)     // Catch: all -> 0x0043
        L_0x00cb:
            tb.xhv r13 = tb.xhv.INSTANCE     // Catch: all -> 0x0043
            java.lang.Object r13 = kotlin.Result.m1108constructorimpl(r13)     // Catch: all -> 0x0043
            goto L_0x00da
        L_0x00d2:
            java.lang.Object r13 = kotlin.b.a(r13)
            java.lang.Object r13 = kotlin.Result.m1108constructorimpl(r13)
        L_0x00da:
            java.lang.Throwable r13 = kotlin.Result.m1111exceptionOrNullimpl(r13)
            if (r13 != 0) goto L_0x00e1
            goto L_0x00e8
        L_0x00e1:
            tb.npp$a r14 = tb.npp.Companion
            java.lang.String r0 = "catching block has error"
            r14.c(r0, r13)
        L_0x00e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt.j0(com.alibaba.triver.triver_shop.newShop.data.ShopDataParser, java.lang.Boolean):void");
    }

    public static final void q0(final ShopDataParser shopDataParser, boolean z, final g1a<? super Map<String, String>, xhv> g1aVar) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57d478e8", new Object[]{shopDataParser, new Boolean(z), g1aVar});
            return;
        }
        ckf.g(shopDataParser, "shopData");
        if (shopDataParser.f2()) {
            try {
                String N0 = shopDataParser.N0();
                DAI.runCompute("inshop_subscribe_guide_cache", kotlin.collections.a.i(jpu.a("sellerId", N0 == null ? null : ssq.o(N0)), jpu.a("isSubscribe", Integer.valueOf(z ? 1 : 0))), new j());
                obj = Result.m1108constructorimpl(xhv.INSTANCE);
            } catch (Throwable th) {
                obj = Result.m1108constructorimpl(kotlin.b.a(th));
            }
            Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
            if (th2 != null) {
                npp.Companion.c("catching block has error", th2);
            }
            final Context Q = shopDataParser.Q();
            if (Q instanceof FragmentActivity) {
                final BroadcastReceiver shopExtKt$startShopSubScribeDAITask$receiver$1 = new BroadcastReceiver() { // from class: com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt$startShopSubScribeDAITask$receiver$1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(ShopExtKt$startShopSubScribeDAITask$receiver$1 shopExtKt$startShopSubScribeDAITask$receiver$12, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/ext/ShopExtKt$startShopSubScribeDAITask$receiver$1");
                    }

                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        Object obj2;
                        String obj3;
                        Long o;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                            return;
                        }
                        ckf.g(context, "context");
                        ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
                        npp.a aVar = npp.Companion;
                        aVar.b("dai broadcast received");
                        intent.getBooleanExtra("com.tmall.android.dai.intent.extra.RESULT", false);
                        String stringExtra = intent.getStringExtra("com.tmall.android.dai.intent.extra.MODEL_NAME");
                        Serializable serializableExtra = intent.getSerializableExtra("com.tmall.android.dai.intent.extra.OUTPUT_DATA");
                        if (!ckf.b("inshop_subscribe_guide", stringExtra)) {
                            aVar.b("dai broadcast modelName = " + ((Object) stringExtra) + " , not matched");
                            return;
                        }
                        ShopDataParser shopDataParser2 = ShopDataParser.this;
                        g1a<Map<String, String>, xhv> g1aVar2 = g1aVar;
                        try {
                            if (serializableExtra instanceof HashMap) {
                                Object obj4 = ((Map) serializableExtra).get("hasBubble");
                                if (ckf.b("true", obj4 == null ? null : obj4.toString())) {
                                    Object obj5 = ((Map) serializableExtra).get(HiAnalyticsConstant.HaKey.BI_KEY_WAITTIME);
                                    long j2 = 0;
                                    if (!(obj5 == null || (obj3 = obj5.toString()) == null || (o = ssq.o(obj3)) == null)) {
                                        j2 = o.longValue();
                                    }
                                    Map<String, String> k = r54.k((Map) serializableExtra);
                                    k.put("shopId", shopDataParser2.W0());
                                    r54.E(new ShopExtKt$startShopSubScribeDAITask$receiver$1$onReceive$1$1(context, g1aVar2, k), j2 * 1000);
                                }
                            }
                            obj2 = Result.m1108constructorimpl(xhv.INSTANCE);
                        } catch (Throwable th3) {
                            obj2 = Result.m1108constructorimpl(b.a(th3));
                        }
                        Throwable th4 = Result.m1111exceptionOrNullimpl(obj2);
                        if (th4 != null) {
                            npp.Companion.c("catching block has error", th4);
                        }
                    }
                };
                IntentFilter intentFilter = new IntentFilter(DAI.ACTION_COMPUTE_COMPLETE);
                intentFilter.addDataScheme("DAI_inshop_subscribe_guide");
                intentFilter.addDataSchemeSpecificPart("com.tmall.android.dai", 0);
                FragmentActivity fragmentActivity = (FragmentActivity) Q;
                fragmentActivity.registerReceiver(shopExtKt$startShopSubScribeDAITask$receiver$1, intentFilter);
                final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                fragmentActivity.getLifecycle().addObserver(new LifecycleObserver() { // from class: com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt$startShopSubScribeDAITask$2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                    public final void onDestroyed() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("bf354a81", new Object[]{this});
                            return;
                        }
                        ((FragmentActivity) Q).getLifecycle().removeObserver(this);
                        ((FragmentActivity) Q).unregisterReceiver(shopExtKt$startShopSubScribeDAITask$receiver$1);
                    }

                    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
                    public final void onPaused() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("c47335f4", new Object[]{this});
                        } else {
                            Ref$BooleanRef.this.element = true;
                        }
                    }
                });
                long j2 = 10000;
                try {
                    j2 = aqp.Companion.N0() * 1000;
                    Result.m1108constructorimpl(xhv.INSTANCE);
                } catch (Throwable th3) {
                    Result.m1108constructorimpl(kotlin.b.a(th3));
                }
                r54.E(new ShopExtKt$startShopSubScribeDAITask$4(ref$BooleanRef, Q, shopDataParser, z), j2);
            }
        }
    }

    public static final JSONObject t(ShopDataParser shopDataParser, boolean z) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9a71378f", new Object[]{shopDataParser, new Boolean(z)});
        }
        ckf.g(shopDataParser, "shopData");
        if (z) {
            str = com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_FOLLOWED;
        } else {
            str = "unFollowed";
        }
        Pair a2 = jpu.a("_msg_name", com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SHOP_FOLLOW_SETSTATUS);
        Pair a3 = jpu.a(com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_FOLLOW_ACTION, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_FOLLOW_ACTION_REFRESH);
        if (z) {
            str2 = "true";
        } else {
            str2 = "false";
        }
        return brf.a(a2, a3, jpu.a("isFollowed", str2), jpu.a("status", str), jpu.a("widgetNodeId", ckf.p("relationship_widget_root", shopDataParser.N0())));
    }

    public static final void b0(Context context, ShopComponentModel shopComponentModel, g1a<? super JSONObject, xhv> g1aVar, d1a<xhv> d1aVar) {
        Map<String, String> U;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6b58cb", new Object[]{context, shopComponentModel, g1aVar, d1aVar});
            return;
        }
        ckf.g(context, "context");
        ckf.g(shopComponentModel, "shopComponentModel");
        if (shopComponentModel.getSendMtop() && shopComponentModel.getMtopInfo() != null) {
            JSONObject mtopInfo = shopComponentModel.getMtopInfo();
            String string = mtopInfo.getString("method");
            String str = (ckf.b(string, "GET") || ckf.b(string, "POST")) ? string : "GET";
            String string2 = mtopInfo.getString("api");
            String string3 = mtopInfo.getString("version");
            JSONObject jSONObject = mtopInfo.getJSONObject("params");
            Map map = null;
            if (!(jSONObject == null || (U = r54.U(jSONObject)) == null)) {
                map = kotlin.collections.a.t(U);
            }
            BizExtKt.h(context, string2, string3, map, g1aVar, new ShopExtKt$sendShop2023ComponentAsyncRequest$1(d1aVar), false, false, false, str, false, null, null, 7616, null);
        }
    }

    public static final void W(Context context, JSONObject jSONObject, String str) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5c439ae", new Object[]{context, jSONObject, str});
        } else if (str != null && jSONObject != null) {
            Uri N = r54.N(str);
            String queryParameter = N == null ? null : N.getQueryParameter(ShopRenderActivity.SHOP_NAVI);
            if (ckf.b(mop.KEY_SHOP_INDEX, queryParameter) || queryParameter == null || queryParameter.length() == 0) {
                JSONObject jSONObject5 = jSONObject.getJSONObject("shopPrefetchData");
                if (jSONObject5 != null && (jSONObject2 = jSONObject5.getJSONObject("modulePrefetchParams")) != null && (jSONObject3 = jSONObject5.getJSONObject("pagePrefetchData")) != null && (jSONObject4 = jSONObject3.getJSONObject("pageData")) != null) {
                    String string = jSONObject3.getString("asyncModuleCount");
                    ckf.f(string, "pagePrefetchData.getString(\"asyncModuleCount\")");
                    Integer m = ssq.m(string);
                    if (m != null) {
                        int intValue = m.intValue();
                        JSONArray jSONArray = jSONObject4.getJSONArray("moduleList");
                        if (jSONArray != null) {
                            JSONArray jSONArray2 = new JSONArray();
                            JSONArray jSONArray3 = new JSONArray();
                            Iterator<Object> it = jSONArray.iterator();
                            int i2 = 0;
                            while (it.hasNext()) {
                                Object next = it.next();
                                int i3 = i2 + 1;
                                if (i2 >= 0) {
                                    if (next instanceof JSONObject) {
                                        JSONObject jSONObject6 = (JSONObject) next;
                                        if (ckf.b(jSONObject6.getString("isSecondDev"), "true")) {
                                            JSONObject jSONObject7 = jSONObject6.getJSONObject("features");
                                            boolean b2 = ckf.b(jSONObject7 == null ? null : jSONObject7.getString("ForceInsertModule"), "true");
                                            JSONObject jSONObject8 = jSONObject6.getJSONObject("moduleData");
                                            JSONObject jSONObject9 = jSONObject8 == null ? null : jSONObject8.getJSONObject("asyncParams");
                                            if (jSONObject9 == null) {
                                                jSONObject9 = new JSONObject();
                                            }
                                            it = it;
                                            i2 = i3;
                                            if (b2) {
                                                jSONArray3.add(brf.b(jpu.a("moduleId", jSONObject6.get("widgetId")), jpu.a("componentKey", jSONObject6.get(AliFestivalWVPlugin.PARAMS_MODULE_NAME)), jpu.a("asyncParams", jSONObject9), jpu.a("componentId", jSONObject6.get("componentId")), jpu.a("index", jSONObject6.get("position"))));
                                            } else if (jSONArray2.size() < intValue) {
                                                jSONArray2.add(brf.b(jpu.a("moduleId", jSONObject6.get("widgetId")), jpu.a("componentKey", jSONObject6.get(AliFestivalWVPlugin.PARAMS_MODULE_NAME)), jpu.a("componentId", jSONObject6.get("componentId")), jpu.a("asyncParams", jSONObject9), jpu.a("index", jSONObject6.get("position"))));
                                            }
                                        }
                                    }
                                    it = it;
                                    i2 = i3;
                                } else {
                                    yz3.p();
                                    throw null;
                                }
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            linkedHashMap.put("pagePath", jSONObject2.getString("pagePath"));
                            linkedHashMap.put("sellerId", jSONObject2.getString("sellerId"));
                            linkedHashMap.put("shopId", jSONObject2.getString("shopId"));
                            linkedHashMap.put("scene", "page_fetch");
                            linkedHashMap.put(pl4.KEY_PAGE_ID, jSONObject2.getString(pl4.KEY_PAGE_ID));
                            linkedHashMap.put("source", "tb_front");
                            linkedHashMap.put("staticModuleList", jSONArray2.toJSONString());
                            linkedHashMap.put("forceInsertModuleList", jSONArray3.toJSONString());
                            linkedHashMap.put("frameworkContext", jSONObject2.getJSONObject("frameworkContext").toJSONString());
                            BizExtKt.h(context, "mtop.taobao.wireless.module.asyncdata", "1.0", linkedHashMap, null, null, false, false, true, "POST", true, null, new ShopExtKt$sendAsyncDataPrefetch$3(context), 2240, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            npp.Companion.b(ckf.p("async data not prefetch , shop navi not match : ", queryParameter));
        }
    }

    public static final void c0(Context context, String str, boolean z) {
        long j2;
        npp.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa4ca54d", new Object[]{context, str, new Boolean(z)});
            return;
        }
        ckf.g(context, "context");
        ckf.g(str, mop.KEY_APM_SHOP_URL);
        npp.a aVar2 = npp.Companion;
        aVar2.b(ckf.p("first inShop url : ", str));
        long currentTimeMillis = System.currentTimeMillis();
        String g2 = g(str);
        Uri parse = Uri.parse(g2);
        boolean b2 = ckf.b("store", parse.getQueryParameter("shopBizType"));
        String queryParameter = parse.getQueryParameter(ShopRenderActivity.SHOP_NAVI);
        boolean b3 = ckf.b(queryParameter, "allitems");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        long currentTimeMillis2 = System.currentTimeMillis();
        cqp.INSTANCE.d(context, currentTimeMillis, g2);
        String queryParameter2 = parse.getQueryParameter("subBizInfo");
        Map k = kotlin.collections.a.k(jpu.a("shopURL", g2), jpu.a("extParams", brf.a(jpu.a("deviceLevel", Integer.valueOf(B())), jpu.a("bxContext", n()), jpu.a("newRoute", Boolean.TRUE)).toJSONString()), jpu.a("matchedRuleSetName", ShopConstants.V_SHOP_RULESET_SHOP));
        BizExtKt.h(context, "mtop.taobao.wireless.shop.route.process", "1.0", k, new ShopExtKt$sendShopRouteRequest$1(g2, ref$ObjectRef, z, b2, context, currentTimeMillis, currentTimeMillis2), new ShopExtKt$sendShopRouteRequest$2(b2, context, g2, currentTimeMillis), true, false, false, "POST", true, kotlin.collections.a.j(jpu.a(MtopModule.KEY_MTOP_HEADER_XBIZTYPE, "shop"), jpu.a(MtopModule.KEY_MTOP_HEADER_XBIZINFO, ckf.p("subBizInfo=", queryParameter2))), null, LogType.UNEXP_KILL_PROCESS, null);
        if (!b2) {
            if ((b3 || queryParameter == null) && aqp.Companion.l()) {
                boolean o = Localization.o();
                boolean isSwitchOpened = EVO.isSwitchOpened(context, "enableShopAllItemsPrefetch");
                if (!isSwitchOpened || o) {
                    j2 = currentTimeMillis;
                } else {
                    j2 = currentTimeMillis;
                    r0(k, parse, j2);
                }
                aVar = aVar2;
                aVar.b(ckf.p("enableShopAllItemsPrefetchAB : ", Boolean.valueOf(isSwitchOpened)));
            } else {
                j2 = currentTimeMillis;
                aVar = aVar2;
            }
            if (aqp.Companion.b0() && !b3) {
                ltt lttVar = new ltt();
                ShopIndexWebViewPreload.INSTANCE.e(context);
                aVar.b(ckf.p("route preload webview cost : ", Long.valueOf(lttVar.a())));
            }
        } else {
            j2 = currentTimeMillis;
        }
        if (b2) {
            d0(context, g2, j2);
        }
    }

    public static final void d0(Context context, String str, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b1f8c9", new Object[]{context, str, new Long(j2)});
            return;
        }
        ckf.g(context, "context");
        ckf.g(str, mop.KEY_APM_SHOP_URL);
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter("subBizInfo");
        String queryParameter2 = parse.getQueryParameter("sellerId");
        if (queryParameter2 == null) {
            queryParameter2 = parse.getQueryParameter("seller_id");
        }
        String queryParameter3 = parse.getQueryParameter(r4p.KEY_STORE_ID);
        if (queryParameter2 == null || queryParameter3 == null) {
            r54.C(new ShopExtKt$sendXSDCategoryRequest$1(j2));
        } else {
            BizExtKt.h(context, "mtop.taobao.minishop.xsd.store.category", "1.0", kotlin.collections.a.k(jpu.a("inShopUrl", str), jpu.a("sellerId", queryParameter2), jpu.a(r4p.KEY_STORE_ID, queryParameter3)), new ShopExtKt$sendXSDCategoryRequest$2(j2), new ShopExtKt$sendXSDCategoryRequest$3(j2), false, false, false, "POST", true, kotlin.collections.a.j(jpu.a(MtopModule.KEY_MTOP_HEADER_XBIZTYPE, "shop"), jpu.a(MtopModule.KEY_MTOP_HEADER_XBIZINFO, ckf.p("subBizInfo=", queryParameter))), null, 4544, null);
        }
    }
}
