package com.alibaba.triver.triver_shop.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.container.ShopLoftActivity;
import com.alibaba.triver.triver_shop.newShop.NativeShopActivity;
import com.alibaba.triver.triver_shop.newShop.ShopActivity;
import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.common.ShopUrlFilter;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.JvmStatic;
import tb.a07;
import tb.aqp;
import tb.ckf;
import tb.eop;
import tb.i04;
import tb.mop;
import tb.npp;
import tb.r54;
import tb.rnp;
import tb.t2o;
import tb.xnj;
import tb.yz3;
import tb.zmj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopNavAdapter implements xnj, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean enableNewRouteLogic;
    private static JSONArray shopRouteSpmBlackList;
    private static JSONArray shopRouteSpmWhiteList;
    private final ShopUrlFilter shopUrlFilter = new ShopUrlFilter();
    public static final Companion Companion = new Companion(null);
    private static final ArrayList<String> shop2022IndustryShopList = yz3.g(eop.FLAG_SHIP_SHOP, eop.FLAG_SHIP_SHOP_V2, eop.C_BRAND_CLOTH_SHOP, eop.VIDEO_SHOP_2, eop.DEFAULT_SHOP, eop.DEFAULT_SHOP_V2, eop.TMALL_CAR_SHOP);
    private static final ArrayList<String> shop2023IndustryShopList = yz3.g(eop.DEFAULT_2023, eop.XSD_SHOP, eop.OVERSEA_SHOP, "farmshop_c", "farmshop_x", "farmshop_z", "farmShop2024", eop.FLAG_SHIP_V25);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class Companion {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(766509098);
        }

        public /* synthetic */ Companion(a07 a07Var) {
            this();
        }

        public static final /* synthetic */ void a(Companion companion) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("638436ba", new Object[]{companion});
            } else {
                companion.f();
            }
        }

        public final ArrayList<String> c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("dd7dba1d", new Object[]{this});
            }
            return ShopNavAdapter.access$getShop2022IndustryShopList$cp();
        }

        public final ArrayList<String> d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("6a1de51e", new Object[]{this});
            }
            return ShopNavAdapter.access$getShop2023IndustryShopList$cp();
        }

        public final void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9fe89ed5", new Object[]{this});
                return;
            }
            aqp.a aVar = aqp.Companion;
            ShopNavAdapter.access$setEnableNewRouteLogic$cp(aVar.L());
            ShopNavAdapter.access$setShopRouteSpmWhiteList$cp(aVar.W0());
            ShopNavAdapter.access$setShopRouteSpmBlackList$cp(aVar.V0());
        }

        public Companion() {
        }

        @JvmStatic
        public final boolean b(Context context, Uri uri, Intent intent) {
            Bundle extras;
            Bundle extras2;
            Bundle extras3;
            String string;
            Bundle extras4;
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6687974d", new Object[]{this, context, uri, intent})).booleanValue();
            }
            ckf.g(context, "context");
            if (uri == null || !ShopExtKt.I(uri) || !ckf.b("true", uri.getQueryParameter("isDX"))) {
                return false;
            }
            String queryParameter = uri.getQueryParameter("spm");
            if (queryParameter != null) {
                Uri.Builder buildUpon = uri.buildUpon();
                buildUpon.appendQueryParameter("containerFixSpm", "true");
                buildUpon.appendQueryParameter("containerSpm", queryParameter);
                r54.z(buildUpon, "spm");
                uri = buildUpon.build();
            }
            if (!(intent == null || (extras4 = intent.getExtras()) == null)) {
                z = extras4.getBoolean("targetUrlReplaced", false);
            }
            Intent intent2 = new Intent();
            intent2.setData(uri);
            if (!(!z || intent == null || (extras3 = intent.getExtras()) == null || (string = extras3.getString("originalTargetUrl")) == null)) {
                intent2.setData(Uri.parse(string));
            }
            String queryParameter2 = uri.getQueryParameter("industryShop");
            boolean b = ckf.b(uri.getQueryParameter("disableShopOpenAnimation"), "true");
            if (c().contains(queryParameter2) || i04.R(d(), queryParameter2)) {
                intent2.setClass(context, ShopActivity.class);
            } else {
                intent2.setClass(context, NativeShopActivity.class);
            }
            if (queryParameter != null) {
                intent2.putExtra("spm", queryParameter);
            }
            Serializable serializable = null;
            if (!(intent == null || (extras2 = intent.getExtras()) == null)) {
                serializable = extras2.getSerializable("routeConfig");
            }
            npp.Companion.b(ckf.p("shop route config : ", serializable));
            boolean b2 = serializable instanceof JSONObject ? ckf.b(((JSONObject) serializable).getString("shopPrefetchEnable"), "true") : true;
            intent2.putExtra(mop.KEY_ENABLE_NEW_START_AC_LOGIC, b2);
            if (b2) {
                long hashCode = uri.hashCode() + System.currentTimeMillis();
                intent2.putExtra("shopBundleId", hashCode);
                ShopNavAdapter$Companion$canJumpToNativeShop$startAction$1 shopNavAdapter$Companion$canJumpToNativeShop$startAction$1 = new ShopNavAdapter$Companion$canJumpToNativeShop$startAction$1(intent, context, intent2, b, hashCode);
                if (r54.g()) {
                    shopNavAdapter$Companion$canJumpToNativeShop$startAction$1.invoke();
                } else {
                    r54.C(shopNavAdapter$Companion$canJumpToNativeShop$startAction$1);
                }
            } else {
                if (!(intent == null || (extras = intent.getExtras()) == null)) {
                    intent2.putExtras(extras);
                }
                if (!(context instanceof Activity)) {
                    intent2.setFlags(268435456);
                }
                context.startActivity(intent2);
            }
            return true;
        }

        @JvmStatic
        public final boolean e(Context context, Uri uri, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7ca178f1", new Object[]{this, context, uri, intent})).booleanValue();
            }
            ckf.g(context, "context");
            ckf.g(intent, "oldIntent");
            if (uri == null || !ckf.b("m.taobao.com", uri.getHost())) {
                return false;
            }
            boolean b = ckf.b("/app/shop-conainer/videofullpage.html", uri.getPath());
            if (!ckf.b("/app/shop-conainer/contentlistpage.html", uri.getPath()) && !b) {
                return false;
            }
            Intent intent2 = new Intent();
            intent2.setData(uri);
            intent2.setFlags(65536);
            if (!(context instanceof Activity)) {
                intent2.setFlags(268435456);
            }
            Bundle extras = intent.getExtras();
            if (extras != null) {
                intent2.putExtras(extras);
            }
            intent2.setClass(context, ShopLoftActivity.class);
            context.startActivity(intent2);
            return true;
        }
    }

    public static final /* synthetic */ ArrayList access$getShop2022IndustryShopList$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("7cc3a1f6", new Object[0]);
        }
        return shop2022IndustryShopList;
    }

    public static final /* synthetic */ ArrayList access$getShop2023IndustryShopList$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("3fb00b55", new Object[0]);
        }
        return shop2023IndustryShopList;
    }

    public static final /* synthetic */ void access$setEnableNewRouteLogic$cp(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede9f94c", new Object[]{new Boolean(z)});
        } else {
            enableNewRouteLogic = z;
        }
    }

    public static final /* synthetic */ void access$setShopRouteSpmBlackList$cp(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e084d02", new Object[]{jSONArray});
        } else {
            shopRouteSpmBlackList = jSONArray;
        }
    }

    public static final /* synthetic */ void access$setShopRouteSpmWhiteList$cp(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c49dda98", new Object[]{jSONArray});
        } else {
            shopRouteSpmWhiteList = jSONArray;
        }
    }

    @JvmStatic
    public static final boolean canJumpToNativeShop(Context context, Uri uri, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6687974d", new Object[]{context, uri, intent})).booleanValue();
        }
        return Companion.b(context, uri, intent);
    }

    private final boolean checkSpmIsValid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1810ef5f", new Object[]{this, str})).booleanValue();
        }
        Companion.a(Companion);
        if (!enableNewRouteLogic || shopRouteSpmBlackList.contains(str)) {
            return false;
        }
        if (!shopRouteSpmWhiteList.contains("*") && !shopRouteSpmWhiteList.contains(str)) {
            return false;
        }
        return true;
    }

    private final boolean getOpen3RuleConfig(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3540b94", new Object[]{this, context})).booleanValue();
        }
        return true;
    }

    @JvmStatic
    public static final boolean isShopFullScreenPage(Context context, Uri uri, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ca178f1", new Object[]{context, uri, intent})).booleanValue();
        }
        return Companion.e(context, uri, intent);
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "ShopNavAdapter";
    }

    @Override // tb.xnj
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.xnj
    public boolean process(Intent intent, zmj zmjVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ebca67", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        if (!(intent == null || zmjVar == null)) {
            Uri data = intent.getData();
            String str = null;
            String uri = data == null ? null : data.toString();
            Uri data2 = intent.getData();
            if (ckf.b(data2 == null ? null : data2.getQueryParameter("shopNavIgnore"), "true")) {
                return true;
            }
            if (uri != null) {
                Uri data3 = intent.getData();
                boolean b = ckf.b(data3 == null ? null : data3.getQueryParameter("shopFrameworkType"), "native");
                rnp J = ShopExtKt.J(uri);
                aqp.a aVar = aqp.Companion;
                if (!aVar.k0() || !b) {
                    Uri data4 = intent.getData();
                    if (data4 != null) {
                        str = data4.getQueryParameter("spm");
                    }
                    boolean checkSpmIsValid = checkSpmIsValid(str);
                    if (J.b() && checkSpmIsValid) {
                        if (aVar.k0() && J.b() && !J.a()) {
                            Context d = zmjVar.d();
                            ckf.f(d, "navContext.context");
                            boolean open3RuleConfig = getOpen3RuleConfig(d);
                            npp.Companion.b(ckf.p("openShop3RulesOpt=", Boolean.valueOf(open3RuleConfig)));
                            if (open3RuleConfig) {
                                Context d2 = zmjVar.d();
                                ckf.f(d2, "navContext.context");
                                ShopExtKt.c0(d2, uri, true);
                                return false;
                            }
                        }
                        if (this.shopUrlFilter.b(Uri.parse(uri).buildUpon().appendQueryParameter("matchAbsolutelyShopRule", String.valueOf(J.b() && !J.a())).toString(), zmjVar.d())) {
                            npp.a aVar2 = npp.Companion;
                            aVar2.b("shop url : " + ((Object) uri) + " match absolutelyShopRule");
                            return false;
                        }
                    }
                } else {
                    npp.Companion.b("match shopFrameworkType=native");
                    Context d3 = zmjVar.d();
                    ckf.f(d3, "navContext.context");
                    if (!J.b() || J.a()) {
                        z = false;
                    }
                    ShopExtKt.c0(d3, uri, z);
                    return false;
                }
            }
            Companion companion = Companion;
            Context d4 = zmjVar.d();
            ckf.f(d4, "navContext.context");
            if (companion.e(d4, intent.getData(), intent)) {
                return false;
            }
            Context d5 = zmjVar.d();
            ckf.f(d5, "navContext.context");
            if (companion.b(d5, intent.getData(), intent)) {
                return false;
            }
        }
        return true;
    }

    static {
        t2o.a(766509097);
        t2o.a(578814049);
        aqp.a aVar = aqp.Companion;
        enableNewRouteLogic = aVar.L();
        shopRouteSpmWhiteList = aVar.W0();
        shopRouteSpmBlackList = aVar.V0();
    }
}
