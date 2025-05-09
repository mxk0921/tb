package com.alibaba.triver.triver_shop;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.alibaba.ariver.app.api.App;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.adapter.DefaultMtopListenerImp;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.BizExtKt;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.ITBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import com.ut.share.business.ShareContent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopParamType;
import tb.aqp;
import tb.brf;
import tb.brp;
import tb.ckf;
import tb.d1a;
import tb.g1a;
import tb.i04;
import tb.jjx;
import tb.jpu;
import tb.k75;
import tb.khu;
import tb.npp;
import tb.oop;
import tb.qks;
import tb.r54;
import tb.rb;
import tb.spp;
import tb.sqp;
import tb.t2o;
import tb.uj3;
import tb.upx;
import tb.vwt;
import tb.wsq;
import tb.xgu;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopMoreUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ShopMoreUtils INSTANCE = new ShopMoreUtils();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements TBPublicMenu.TBOnPublicMenuClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f2964a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ ShopDataParser f;
        public final /* synthetic */ String g;
        public final /* synthetic */ App h;
        public final /* synthetic */ Boolean i;

        public a(Activity activity, String str, String str2, String str3, String str4, ShopDataParser shopDataParser, String str5, App app, Boolean bool) {
            this.f2964a = activity;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = shopDataParser;
            this.g = str5;
            this.h = app;
            this.i = bool;
        }

        @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnPublicMenuClickListener
        public final void onPublicMenuItemClicked(TBPublicMenuItem tBPublicMenuItem) {
            ShopDataParser.b w0;
            d1a<xhv> a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("478e7772", new Object[]{this, tBPublicMenuItem});
                return;
            }
            switch (tBPublicMenuItem.getId()) {
                case 101:
                    ShopMoreUtils shopMoreUtils = ShopMoreUtils.INSTANCE;
                    Activity activity = this.f2964a;
                    String str = this.b;
                    ckf.d(str);
                    String str2 = this.c;
                    ckf.d(str2);
                    String str3 = this.d;
                    ckf.d(str3);
                    String str4 = this.e;
                    ckf.d(str4);
                    ShopMoreUtils.b(shopMoreUtils, activity, str, str2, str3, str4);
                    brp.j(this.f);
                    return;
                case 102:
                    ShopMoreUtils.c(ShopMoreUtils.INSTANCE, this.f2964a, this.c, this.g);
                    return;
                case 103:
                    ShopMoreUtils.a(ShopMoreUtils.INSTANCE, new xgu(this.h));
                    return;
                case 104:
                    Boolean bool = this.i;
                    if (bool != null) {
                        Activity activity2 = this.f2964a;
                        String str5 = this.c;
                        ShopDataParser shopDataParser = this.f;
                        ShopMoreUtils shopMoreUtils2 = ShopMoreUtils.INSTANCE;
                        boolean booleanValue = bool.booleanValue();
                        ckf.d(shopDataParser);
                        shopMoreUtils2.j(activity2, str5, booleanValue, shopDataParser);
                        return;
                    }
                    return;
                case 105:
                    ShopDataParser shopDataParser2 = this.f;
                    if (shopDataParser2 != null && (w0 = shopDataParser2.w0()) != null && (a2 = w0.a()) != null) {
                        a2.invoke();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements ITBPublicMenu {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShopDataParser f2965a;

        public b(ShopDataParser shopDataParser) {
            this.f2965a = shopDataParser;
        }

        @Override // com.taobao.uikit.actionbar.ITBPublicMenu
        public TBPublicMenu getPublicMenu() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBPublicMenu) ipChange.ipc$dispatch("1f3d234e", new Object[]{this});
            }
            return null;
        }

        @Override // com.taobao.uikit.actionbar.ITBPublicMenu
        public Bundle pageUserInfo() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bundle) ipChange.ipc$dispatch("65615653", new Object[]{this});
            }
            Bundle bundle = new Bundle();
            Bundle bundle2 = new Bundle();
            bundle2.putString("from", "shopDetail");
            ShopDataParser shopDataParser = this.f2965a;
            bundle2.putString("subjectId", shopDataParser == null ? null : shopDataParser.W0());
            bundle2.putString("subjectType", "SHOP");
            bundle.putBundle(jjx.ZZB_BUNDLE_KEY, bundle2);
            return bundle;
        }
    }

    static {
        t2o.a(766509064);
    }

    public static final /* synthetic */ void a(ShopMoreUtils shopMoreUtils, vwt vwtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c29363a", new Object[]{shopMoreUtils, vwtVar});
        } else {
            shopMoreUtils.h(vwtVar);
        }
    }

    public static final /* synthetic */ void b(ShopMoreUtils shopMoreUtils, Context context, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d36c7a4", new Object[]{shopMoreUtils, context, str, str2, str3, str4});
        } else {
            shopMoreUtils.i(context, str, str2, str3, str4);
        }
    }

    public static final /* synthetic */ void c(ShopMoreUtils shopMoreUtils, Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ea3a00", new Object[]{shopMoreUtils, context, str, str2});
        } else {
            shopMoreUtils.k(context, str, str2);
        }
    }

    public static final /* synthetic */ ShareContent d(ShopMoreUtils shopMoreUtils, JSONObject jSONObject, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("57bce1be", new Object[]{shopMoreUtils, jSONObject, str, str2, str3, str4});
        }
        return shopMoreUtils.l(jSONObject, str, str2, str3, str4);
    }

    public final void g(Context context, String str, String str2, String str3, String str4, String str5, boolean z, String str6, Uri uri, JSONObject jSONObject, final g1a<? super JSONObject, xhv> g1aVar) {
        Set<String> queryParameterNames;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ef1978b", new Object[]{this, context, str, str2, str3, str4, str5, new Boolean(z), str6, uri, jSONObject, g1aVar});
        } else if (!r54.f(context, str, str4, str5)) {
            JSONObject a2 = brf.a(jpu.a("firstMediaId", str2), jpu.a("firstMediaScene", str3), jpu.a("pvUuid", str6));
            if (jSONObject != null) {
                Map<String, Object> innerMap = jSONObject.getInnerMap();
                ckf.f(innerMap, "it.innerMap");
                a2.putAll(kotlin.collections.a.r(innerMap));
            }
            if (!(uri == null || (queryParameterNames = uri.getQueryParameterNames()) == null)) {
                for (String str7 : queryParameterNames) {
                    if (!ckf.b(str7, "loftData")) {
                        a2.put((JSONObject) str7, uri.getQueryParameter(str7));
                    }
                }
            }
            MtopRequest d = BizExtKt.d(z ? "mtop.taobao.minishop.material.feeds.list" : "mtop.taobao.ppp.shop.media.feeds.list", "1.0", kotlin.collections.a.i(jpu.a("seller_id", str), jpu.a("page_no", str4), jpu.a("page_size", str5), jpu.a("first_media_id", str2), jpu.a("first_media_scene", str3), jpu.a("sceneName", "shopSecondFloorFlow"), jpu.a("sellerId", str), jpu.a(upx.PAGE_NUMBER, str4), jpu.a("pageSize", str5), jpu.a("bizParams", a2.toJSONString())), false, false, 24, null);
            ckf.d(context);
            MtopBusiness a3 = BizExtKt.a(context, d, "POST");
            a3.addHttpQueryParameter("type", "originaljson");
            a3.registerListener((IRemoteListener) new DefaultMtopListenerImp() { // from class: com.alibaba.triver.triver_shop.ShopMoreUtils$contentListFeedsRequest$3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(ShopMoreUtils$contentListFeedsRequest$3 shopMoreUtils$contentListFeedsRequest$3, String str8, Object... objArr) {
                    int hashCode = str8.hashCode();
                    if (hashCode == -743105213) {
                        super.onSystemError(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], objArr[2]);
                        return null;
                    } else if (hashCode == -662674828) {
                        super.onError(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], objArr[2]);
                        return null;
                    } else if (hashCode == 2057952281) {
                        super.onSuccess(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], (BaseOutDo) objArr[2], objArr[3]);
                        return null;
                    } else {
                        int hashCode2 = str8.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str8 + "' with hashcode " + hashCode2 + " in com/alibaba/triver/triver_shop/ShopMoreUtils$contentListFeedsRequest$3");
                    }
                }

                @Override // com.alibaba.triver.triver_shop.adapter.DefaultMtopListenerImp, com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    super.onError(i, mtopResponse, obj);
                    g1a<JSONObject, xhv> g1aVar2 = g1aVar;
                    if (g1aVar2 != null) {
                        g1aVar2.invoke(null);
                    }
                }

                @Override // com.alibaba.triver.triver_shop.adapter.DefaultMtopListenerImp, com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    byte[] bArr;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    super.onSuccess(i, mtopResponse, baseOutDo, obj);
                    if (mtopResponse == null) {
                        bArr = null;
                    } else {
                        bArr = mtopResponse.getBytedata();
                    }
                    JSONObject l = brf.l(bArr);
                    g1a<JSONObject, xhv> g1aVar2 = g1aVar;
                    if (g1aVar2 != null) {
                        g1aVar2.invoke(l);
                    }
                }

                @Override // com.alibaba.triver.triver_shop.adapter.DefaultMtopListenerImp, com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    super.onSystemError(i, mtopResponse, obj);
                    g1a<JSONObject, xhv> g1aVar2 = g1aVar;
                    if (g1aVar2 != null) {
                        g1aVar2.invoke(null);
                    }
                }
            });
            a3.startRequest();
        } else if (g1aVar != null) {
            g1aVar.invoke(null);
        }
    }

    public final void h(vwt vwtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e65e409", new Object[]{this, vwtVar});
        } else if (vwtVar != null) {
            vwtVar.a(Uri.parse(qks.r()).buildUpon().appendQueryParameter("appId", vwtVar.getAppId()).appendQueryParameter("frameTempType", "pubArea").build().toString(), (Bundle) null);
            HashMap hashMap = new HashMap();
            String appId = vwtVar.getAppId();
            ckf.f(appId, "homePageApp.getAppId()");
            hashMap.put("miniapp_id", appId);
        }
    }

    public final void i(final Context context, final String str, final String str2, final String str3, final String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fbf3eb5", new Object[]{this, context, str, str2, str3, str4});
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        HashMap hashMap = new HashMap();
        mtopRequest.setApiName("mtop.taobao.wireless.shop.share.get");
        mtopRequest.setVersion("1.0");
        hashMap.put("sellerId", str2);
        hashMap.put("shopId", str);
        mtopRequest.dataParams = hashMap;
        mtopRequest.setData(JSON.toJSONString(hashMap));
        MtopBusiness reqMethod = MtopBusiness.build(mtopRequest, Mtop.instance(Mtop.Id.INNER, context).getMtopConfig().ttid).reqMethod(MethodEnum.GET);
        reqMethod.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.alibaba.triver.triver_shop.ShopMoreUtils$doShare$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    npp.Companion.e(ckf.p("share mtop error : ", Integer.valueOf(i)));
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                JSONObject jSONObject;
                JSONObject jSONObject2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                } else if (mtopResponse != null && mtopResponse.getBytedata() != null && mtopResponse.isApiSuccess()) {
                    try {
                        byte[] bytedata = mtopResponse.getBytedata();
                        ckf.f(bytedata, "response.bytedata");
                        String str5 = new String(bytedata, uj3.UTF_8);
                        npp.Companion.e(str5);
                        JSONObject k = brf.k(str5);
                        if (k != null && (jSONObject = k.getJSONObject("data")) != null && (jSONObject2 = jSONObject.getJSONObject("result")) != null) {
                            sqp.a(context, ShopMoreUtils.d(ShopMoreUtils.INSTANCE, jSONObject2, str, str2, str3, str4), "");
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        npp.Companion.b(ckf.p("share mtop system error : ", e.getMessage()));
                    }
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    npp.Companion.e(ckf.p("share mtop system error : ", Integer.valueOf(i)));
                }
            }
        });
        reqMethod.asyncRequest();
    }

    public final void n(ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("387e22", new Object[]{this, shopDataParser});
            return;
        }
        ckf.g(shopDataParser, "shopData");
        r54.P("request2022FrameworkSwipeBigCardListData", new ShopMoreUtils$request2022FrameworkSwipeBigCardListData$1(shopDataParser));
    }

    public final void j(Context context, String str, boolean z, ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ccafb9e", new Object[]{this, context, str, new Boolean(z), shopDataParser});
            return;
        }
        ckf.g(context, "context");
        ckf.g(shopDataParser, "shopData");
        Intent intent = new Intent();
        intent.setAction("SHOP_ACTION_SHOP_REQUEST");
        Bundle bundle = new Bundle();
        bundle.putBoolean("star", !z);
        bundle.putString("sellerId", str);
        bundle.putBoolean("changeToFollow", shopDataParser.l());
        intent.putExtras(bundle);
        intent.setComponent(new ComponentName(context, "com.alibaba.triver.triver_shop.receiver.ShopRequestReceiver"));
        context.sendBroadcast(intent);
    }

    public final void k(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c19f8991", new Object[]{this, context, str, str2});
        } else if (!r54.f(context, str, str2)) {
            Uri.Builder buildUpon = Uri.parse("poplayer://SmsAuthorization").buildUpon();
            buildUpon.appendQueryParameter("seller_id", str);
            buildUpon.appendQueryParameter("shop_name", str2);
            if (context != null) {
                khu.h(context, buildUpon.toString());
            }
        }
    }

    public final ShareContent l(JSONObject jSONObject, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("df79630d", new Object[]{this, jSONObject, str, str2, str3, str4});
        }
        String string = jSONObject.getString("shopName");
        String string2 = jSONObject.getString("shopLogo");
        JSONArray jSONArray = new JSONArray();
        jSONArray.add(new Object[]{jSONObject.get("fansCountStr"), jSONObject.get("buyerCouponBonus"), jSONObject.get("sellerGoodPercent")});
        JSONObject jSONObject2 = jSONObject.getJSONObject("rankImage");
        String string3 = jSONObject2 == null ? null : jSONObject2.getString("url");
        Object obj = jSONObject.get("hotSoldPicUrls");
        HashMap hashMap = new HashMap();
        hashMap.put("title", string);
        hashMap.put("brandIcon", string2);
        hashMap.put("tags", jSONArray);
        hashMap.put("levelIcon", string3);
        hashMap.put("images", obj);
        ShareContent shareContent = new ShareContent();
        shareContent.title = string;
        shareContent.imageUrl = string2;
        shareContent.businessId = "shop";
        shareContent.templateId = "shop";
        shareContent.templateParams = hashMap;
        shareContent.extendParams = kotlin.collections.a.j(jpu.a("sellerId", str2), jpu.a("targetId", str));
        if (aqp.Companion.X0()) {
            shareContent.url = "https://shop" + str + ".taobao.com?shop_navi=" + str4 + "&shopFrameworkType=native";
        } else {
            shareContent.url = "https://shop" + str + ".m.taobao.com?shop_navi=" + str4 + "&shopFrameworkType=native";
        }
        return shareContent;
    }

    public final void q(Context context, String str, g1a<? super JSONObject, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6875c6c", new Object[]{this, context, str, g1aVar});
        } else if (!r54.f(context, str, g1aVar)) {
            BizExtKt.h(context, "mtop.regera.feed.follow.manage", "1.0", kotlin.collections.a.i(jpu.a("accountType", "ACCOUNT"), jpu.a("source", "shopMore"), jpu.a("relation", "STAR"), jpu.a("operation", MtopParamType.QUERY), jpu.a("accountId", str)), new ShopMoreUtils$requestShopStarInfo$1(g1aVar), new ShopMoreUtils$requestShopStarInfo$2(g1aVar), false, false, false, null, false, null, null, 8128, null);
        }
    }

    public final void w(Activity activity, ShopDataParser shopDataParser, String str, String str2, Boolean bool, Boolean bool2, App app) {
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a211bf", new Object[]{this, activity, shopDataParser, str, str2, bool, bool2, app});
            return;
        }
        ckf.g(activity, "context");
        String str5 = null;
        String W0 = shopDataParser == null ? null : shopDataParser.W0();
        String N0 = shopDataParser == null ? null : shopDataParser.N0();
        if (shopDataParser != null) {
            str5 = shopDataParser.e1();
        }
        if (!r54.f(shopDataParser, W0, N0, str, str2)) {
            TBPublicMenu tBPublicMenu = new TBPublicMenu(activity, new b(shopDataParser));
            ArrayList<TBPublicMenuItem> arrayList = new ArrayList<>();
            tBPublicMenu.needNewMenu(true);
            tBPublicMenu.showMenuItem(R.id.uik_menu_report);
            TBPublicMenuItem tBPublicMenuItem = new TBPublicMenuItem();
            tBPublicMenuItem.setTitle(ckf.p("ꄪ:", activity.getResources().getString(R.string.app_share)));
            tBPublicMenuItem.setId(101);
            tBPublicMenuItem.setIsI18nSupported(true);
            arrayList.add(tBPublicMenuItem);
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                TBPublicMenuItem tBPublicMenuItem2 = new TBPublicMenuItem();
                if (booleanValue) {
                    str4 = "똽:取消短信";
                } else {
                    str4 = "똼:活动短信";
                }
                tBPublicMenuItem2.setTitle(str4);
                tBPublicMenuItem2.setId(102);
                arrayList.add(tBPublicMenuItem2);
            }
            if (app != null) {
                TBPublicMenuItem tBPublicMenuItem3 = new TBPublicMenuItem();
                tBPublicMenuItem3.setTitle("ꄚ:授权管理");
                tBPublicMenuItem3.setId(103);
                arrayList.add(tBPublicMenuItem3);
            }
            if (!(shopDataParser == null || shopDataParser.l() || bool2 == null)) {
                TBPublicMenuItem tBPublicMenuItem4 = new TBPublicMenuItem();
                if (bool2.booleanValue()) {
                    str3 = "뀜:取消星标";
                } else {
                    str3 = "뀚:星标";
                }
                tBPublicMenuItem4.setTitle(str3);
                tBPublicMenuItem4.setId(104);
                arrayList.add(tBPublicMenuItem4);
            }
            if (spp.c(str2) && ((shopDataParser != null && shopDataParser.w1()) || (shopDataParser != null && shopDataParser.H1()))) {
                TBPublicMenuItem tBPublicMenuItem5 = new TBPublicMenuItem();
                tBPublicMenuItem5.setTitle("킊:直播举报");
                tBPublicMenuItem5.setId(105);
                arrayList.add(tBPublicMenuItem5);
                tBPublicMenu.removeCustomMenuItemsByType("report");
            }
            tBPublicMenu.addCustomMenus(arrayList, new a(activity, W0, N0, str, str2, shopDataParser, str5, app, bool2));
            tBPublicMenu.show();
        }
    }

    public final void e(final Context context, String str, final oop.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc9715a", new Object[]{this, context, str, aVar});
            return;
        }
        npp.a aVar2 = npp.Companion;
        StringBuilder sb = new StringBuilder("addFollowWithSellerId sellerId ");
        sb.append((Object) str);
        sb.append(", context is null : ");
        sb.append(context == null);
        sb.append(" , callback is null : ");
        sb.append(aVar == null);
        aVar2.b(sb.toString());
        if (context != null && str != null && aVar != null) {
            MtopBusiness b2 = BizExtKt.b(context, BizExtKt.d("mtop.taobao.social.follow.weitao.add", "3.2", kotlin.collections.a.k(jpu.a("followedId", str), jpu.a("type", "1"), jpu.a("originBiz", "shop"), jpu.a("originFlag", "Page_newShop")), false, false, 24, null), null, 4, null);
            b2.registerListener((IRemoteListener) new DefaultMtopListenerImp() { // from class: com.alibaba.triver.triver_shop.ShopMoreUtils$addFollowWithSellerId$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(ShopMoreUtils$addFollowWithSellerId$1 shopMoreUtils$addFollowWithSellerId$1, String str2, Object... objArr) {
                    int hashCode = str2.hashCode();
                    if (hashCode == -662674828) {
                        super.onError(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], objArr[2]);
                        return null;
                    } else if (hashCode == 2057952281) {
                        super.onSuccess(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], (BaseOutDo) objArr[2], objArr[3]);
                        return null;
                    } else {
                        int hashCode2 = str2.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode2 + " in com/alibaba/triver/triver_shop/ShopMoreUtils$addFollowWithSellerId$1");
                    }
                }

                @Override // com.alibaba.triver.triver_shop.adapter.DefaultMtopListenerImp, com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    super.onError(i, mtopResponse, obj);
                    Pair<String, String> parseMTopError = parseMTopError(mtopResponse);
                    if (parseMTopError != null) {
                        r54.S(context, parseMTopError.getSecond());
                    }
                }

                @Override // com.alibaba.triver.triver_shop.adapter.DefaultMtopListenerImp, com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    super.onSuccess(i, mtopResponse, baseOutDo, obj);
                    Pair<String, String> parseMTopError = parseMTopError(mtopResponse);
                    if (parseMTopError != null) {
                        r54.S(context, parseMTopError.getSecond());
                    } else {
                        aVar.a(true);
                    }
                }

                private final Pair<String, String> parseMTopError(MtopResponse mtopResponse) {
                    JSONArray jSONArray;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Pair) ipChange2.ipc$dispatch("3c2b9402", new Object[]{this, mtopResponse});
                    }
                    JSONObject l = brf.l(mtopResponse == null ? null : mtopResponse.getBytedata());
                    if (!(l == null || (jSONArray = l.getJSONArray(rb.RESULT_KEY)) == null)) {
                        Object d0 = i04.d0(jSONArray, 0);
                        String obj = d0 == null ? null : d0.toString();
                        List z0 = obj == null ? null : wsq.z0(obj, new String[]{"::"}, false, 0, 6, null);
                        String str2 = z0 == null ? null : (String) i04.d0(z0, 0);
                        String str3 = z0 == null ? null : (String) i04.d0(z0, 1);
                        if (!(ckf.b(str2, "SUCCESS") || str2 == null || str3 == null)) {
                            return new Pair<>(str2, str3);
                        }
                    }
                    return null;
                }
            });
            b2.startRequest();
        }
    }

    public final void f(Context context, String str, final oop.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4be241", new Object[]{this, context, str, aVar});
            return;
        }
        npp.a aVar2 = npp.Companion;
        StringBuilder sb = new StringBuilder("checkFollowWithSellerId sellerId ");
        sb.append((Object) str);
        sb.append(", context is null : ");
        sb.append(context == null);
        sb.append(" , callback is null : ");
        sb.append(aVar == null);
        aVar2.b(sb.toString());
        if (context != null && str != null && aVar != null) {
            MtopBusiness b2 = BizExtKt.b(context, BizExtKt.d("mtop.cybertron.follow.detail", k75.VIDEOCONFIG_API_VERSION_3, kotlin.collections.a.k(jpu.a("followedId", str), jpu.a("type", "1"), jpu.a("originBiz", "shop"), jpu.a("originFlag", "Page_newShop")), false, false, 24, null), null, 4, null);
            b2.registerListener((IRemoteListener) new DefaultMtopListenerImp() { // from class: com.alibaba.triver.triver_shop.ShopMoreUtils$checkFollowWithSellerId$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(ShopMoreUtils$checkFollowWithSellerId$1 shopMoreUtils$checkFollowWithSellerId$1, String str2, Object... objArr) {
                    if (str2.hashCode() == 2057952281) {
                        super.onSuccess(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], (BaseOutDo) objArr[2], objArr[3]);
                        return null;
                    }
                    int hashCode = str2.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/ShopMoreUtils$checkFollowWithSellerId$1");
                }

                @Override // com.alibaba.triver.triver_shop.adapter.DefaultMtopListenerImp, com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    JSONObject jSONObject;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    super.onSuccess(i, mtopResponse, baseOutDo, obj);
                    oop.a aVar3 = oop.a.this;
                    String str2 = null;
                    JSONObject l = brf.l(mtopResponse == null ? null : mtopResponse.getBytedata());
                    if (!(l == null || (jSONObject = l.getJSONObject("data")) == null)) {
                        str2 = jSONObject.getString("follow");
                    }
                    aVar3.a(ckf.b(str2, "true"));
                }
            });
            b2.startRequest();
        }
    }

    public final void m(Context context, String str, final oop.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c53117bd", new Object[]{this, context, str, aVar});
            return;
        }
        npp.a aVar2 = npp.Companion;
        StringBuilder sb = new StringBuilder("removeFollowWithSellerId sellerId ");
        sb.append((Object) str);
        sb.append(", context is null : ");
        sb.append(context == null);
        sb.append(" , callback is null : ");
        sb.append(aVar == null);
        aVar2.b(sb.toString());
        if (context != null && str != null && aVar != null) {
            MtopBusiness b2 = BizExtKt.b(context, BizExtKt.d("mtop.taobao.weitao.follow.remove", "3.2", kotlin.collections.a.k(jpu.a("followedId", str), jpu.a("type", "1"), jpu.a("originBiz", "shop"), jpu.a("originFlag", "Page_newShop")), false, false, 24, null), null, 4, null);
            b2.registerListener((IRemoteListener) new DefaultMtopListenerImp() { // from class: com.alibaba.triver.triver_shop.ShopMoreUtils$removeFollowWithSellerId$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(ShopMoreUtils$removeFollowWithSellerId$1 shopMoreUtils$removeFollowWithSellerId$1, String str2, Object... objArr) {
                    if (str2.hashCode() == 2057952281) {
                        super.onSuccess(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], (BaseOutDo) objArr[2], objArr[3]);
                        return null;
                    }
                    int hashCode = str2.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/ShopMoreUtils$removeFollowWithSellerId$1");
                }

                @Override // com.alibaba.triver.triver_shop.adapter.DefaultMtopListenerImp, com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    super.onSuccess(i, mtopResponse, baseOutDo, obj);
                    oop.a.this.a(false);
                }
            });
            b2.startRequest();
        }
    }

    public final void r(Context context, String str, final g1a<? super JSONObject, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48b81759", new Object[]{this, context, str, g1aVar});
        } else if (context != null && str != null) {
            MtopBusiness b2 = BizExtKt.b(context, BizExtKt.d("mtop.taobao.saipan.auths.get", "1.0", kotlin.collections.a.i(jpu.a("source", "shop"), jpu.a("sellerId", str), jpu.a("flagShip", "0")), false, false, 24, null), null, 4, null);
            b2.registerListener((IRemoteListener) new DefaultMtopListenerImp() { // from class: com.alibaba.triver.triver_shop.ShopMoreUtils$requestSmsInfo$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(ShopMoreUtils$requestSmsInfo$1 shopMoreUtils$requestSmsInfo$1, String str2, Object... objArr) {
                    int hashCode = str2.hashCode();
                    if (hashCode == -743105213) {
                        super.onSystemError(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], objArr[2]);
                        return null;
                    } else if (hashCode == -662674828) {
                        super.onError(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], objArr[2]);
                        return null;
                    } else if (hashCode == 2057952281) {
                        super.onSuccess(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], (BaseOutDo) objArr[2], objArr[3]);
                        return null;
                    } else {
                        int hashCode2 = str2.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode2 + " in com/alibaba/triver/triver_shop/ShopMoreUtils$requestSmsInfo$1");
                    }
                }

                @Override // com.alibaba.triver.triver_shop.adapter.DefaultMtopListenerImp, com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    super.onError(i, mtopResponse, obj);
                    g1a<JSONObject, xhv> g1aVar2 = g1aVar;
                    if (g1aVar2 != null) {
                        g1aVar2.invoke(null);
                    }
                }

                @Override // com.alibaba.triver.triver_shop.adapter.DefaultMtopListenerImp, com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    byte[] bArr;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    super.onSuccess(i, mtopResponse, baseOutDo, obj);
                    if (mtopResponse == null) {
                        bArr = null;
                    } else {
                        bArr = mtopResponse.getBytedata();
                    }
                    JSONObject l = brf.l(bArr);
                    g1a<JSONObject, xhv> g1aVar2 = g1aVar;
                    if (g1aVar2 != null) {
                        g1aVar2.invoke(l);
                    }
                }

                @Override // com.alibaba.triver.triver_shop.adapter.DefaultMtopListenerImp, com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    super.onSystemError(i, mtopResponse, obj);
                    g1a<JSONObject, xhv> g1aVar2 = g1aVar;
                    if (g1aVar2 != null) {
                        g1aVar2.invoke(null);
                    }
                }
            });
            b2.startRequest();
        }
    }

    public final void s(Context context, String str, String str2, g1a<? super String, xhv> g1aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88ba313a", new Object[]{this, context, str, str2, g1aVar, jSONObject});
            return;
        }
        ckf.g(context, "context");
        ckf.g(str, "targetId");
        BizExtKt.h(context, "mtop.minishop.collection.collection", "1.0", kotlin.collections.a.k(jpu.a("targetId", str), jpu.a("feature", str2), jpu.a("extraParam", jSONObject == null ? null : jSONObject.toJSONString())), new ShopMoreUtils$shopLoftCollection$1(g1aVar), null, true, false, false, null, false, null, null, 8064, null);
    }

    public final void t(Context context, String str, String str2, g1a<? super String, xhv> g1aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e260933", new Object[]{this, context, str, str2, g1aVar, jSONObject});
            return;
        }
        ckf.g(context, "context");
        ckf.g(str, "targetId");
        BizExtKt.h(context, "mtop.minishop.like.like", "1.0", kotlin.collections.a.k(jpu.a("targetId", str), jpu.a("feature", str2), jpu.a("extraParam", jSONObject == null ? null : jSONObject.toJSONString())), new ShopMoreUtils$shopLoftLike$1(g1aVar), null, true, false, false, null, false, null, null, 8064, null);
    }

    public final void u(Context context, String str, String str2, g1a<? super String, xhv> g1aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3293c69e", new Object[]{this, context, str, str2, g1aVar, jSONObject});
            return;
        }
        ckf.g(context, "context");
        ckf.g(str, "targetId");
        BizExtKt.h(context, "mtop.minishop.collection.removeCollection", "1.0", kotlin.collections.a.k(jpu.a("targetId", str), jpu.a("feature", str2), jpu.a("extraParam", jSONObject == null ? null : jSONObject.toJSONString())), new ShopMoreUtils$shopLoftRemoveCollection$1(g1aVar), null, true, false, false, null, false, null, null, 8064, null);
    }

    public final void v(Context context, String str, String str2, g1a<? super String, xhv> g1aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baa47997", new Object[]{this, context, str, str2, g1aVar, jSONObject});
            return;
        }
        ckf.g(context, "context");
        ckf.g(str, "targetId");
        BizExtKt.h(context, "mtop.minishop.like.removeLike", "1.0", kotlin.collections.a.k(jpu.a("targetId", str), jpu.a("feature", str2), jpu.a("extraParam", jSONObject == null ? null : jSONObject.toJSONString())), new ShopMoreUtils$shopLoftRemoveLike$1(g1aVar), null, true, false, false, null, false, null, null, 8064, null);
    }

    public final void o(Context context, String str, String str2, final g1a<? super JSONObject, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f9b0a3f", new Object[]{this, context, str, str2, g1aVar});
        } else if (!r54.f(context, str, str2, g1aVar)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "sellerId", str2);
            jSONObject.put((JSONObject) "shopId", str);
            MtopRequest d = BizExtKt.d("mtop.taobao.regera.recall.shop", "1.0", kotlin.collections.a.i(jpu.a("recallType", "SHOP_DYNAMIC"), jpu.a("params", jSONObject.toJSONString())), false, false, 24, null);
            ckf.d(context);
            MtopBusiness b2 = BizExtKt.b(context, d, null, 4, null);
            b2.registerListener((IRemoteListener) new DefaultMtopListenerImp() { // from class: com.alibaba.triver.triver_shop.ShopMoreUtils$requestShopDynamicRedDotData$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(ShopMoreUtils$requestShopDynamicRedDotData$1 shopMoreUtils$requestShopDynamicRedDotData$1, String str3, Object... objArr) {
                    if (str3.hashCode() == 2057952281) {
                        super.onSuccess(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], (BaseOutDo) objArr[2], objArr[3]);
                        return null;
                    }
                    int hashCode = str3.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str3 + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/ShopMoreUtils$requestShopDynamicRedDotData$1");
                }

                @Override // com.alibaba.triver.triver_shop.adapter.DefaultMtopListenerImp, com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    byte[] bArr;
                    JSONObject jSONObject2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    super.onSuccess(i, mtopResponse, baseOutDo, obj);
                    JSONObject jSONObject3 = null;
                    if (mtopResponse == null) {
                        bArr = null;
                    } else {
                        bArr = mtopResponse.getBytedata();
                    }
                    JSONObject l = brf.l(bArr);
                    if (!(l == null || (jSONObject2 = l.getJSONObject("data")) == null)) {
                        jSONObject3 = jSONObject2.getJSONObject("data");
                    }
                    g1a<JSONObject, xhv> g1aVar2 = g1aVar;
                    if (g1aVar2 != null) {
                        g1aVar2.invoke(jSONObject3);
                    }
                }
            });
            b2.startRequest();
        }
    }

    public final void p(Context context, String str, String str2, final g1a<? super JSONObject, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9c1ba1", new Object[]{this, context, str, str2, g1aVar});
        } else if (!r54.f(context, str, str2, g1aVar)) {
            MtopRequest d = BizExtKt.d("mtop.taobao.wireless.shop.search.word.get", "1.0", kotlin.collections.a.i(jpu.a("seller_id", str2), jpu.a("shop_id", str)), false, false, 24, null);
            ckf.d(context);
            MtopBusiness b2 = BizExtKt.b(context, d, null, 4, null);
            b2.registerListener((IRemoteListener) new DefaultMtopListenerImp() { // from class: com.alibaba.triver.triver_shop.ShopMoreUtils$requestShopSearchBarHintText$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(ShopMoreUtils$requestShopSearchBarHintText$1 shopMoreUtils$requestShopSearchBarHintText$1, String str3, Object... objArr) {
                    int hashCode = str3.hashCode();
                    if (hashCode == -743105213) {
                        super.onSystemError(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], objArr[2]);
                        return null;
                    } else if (hashCode == -662674828) {
                        super.onError(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], objArr[2]);
                        return null;
                    } else if (hashCode == 2057952281) {
                        super.onSuccess(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], (BaseOutDo) objArr[2], objArr[3]);
                        return null;
                    } else {
                        int hashCode2 = str3.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str3 + "' with hashcode " + hashCode2 + " in com/alibaba/triver/triver_shop/ShopMoreUtils$requestShopSearchBarHintText$1");
                    }
                }

                @Override // com.alibaba.triver.triver_shop.adapter.DefaultMtopListenerImp, com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    super.onError(i, mtopResponse, obj);
                    g1a<JSONObject, xhv> g1aVar2 = g1aVar;
                    if (g1aVar2 != null) {
                        g1aVar2.invoke(null);
                    }
                }

                @Override // com.alibaba.triver.triver_shop.adapter.DefaultMtopListenerImp, com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    byte[] bArr;
                    JSONObject jSONObject;
                    g1a<JSONObject, xhv> g1aVar2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    super.onSuccess(i, mtopResponse, baseOutDo, obj);
                    if (mtopResponse == null) {
                        bArr = null;
                    } else {
                        bArr = mtopResponse.getBytedata();
                    }
                    JSONObject l = brf.l(bArr);
                    if (l != null && (jSONObject = l.getJSONObject("data")) != null && (g1aVar2 = g1aVar) != null) {
                        g1aVar2.invoke(jSONObject);
                    }
                }

                @Override // com.alibaba.triver.triver_shop.adapter.DefaultMtopListenerImp, com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    super.onSystemError(i, mtopResponse, obj);
                    g1a<JSONObject, xhv> g1aVar2 = g1aVar;
                    if (g1aVar2 != null) {
                        g1aVar2.invoke(null);
                    }
                }
            });
            b2.startRequest();
        }
    }

    public final void x(Context context, String str, boolean z, final g1a<? super JSONObject, xhv> g1aVar) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6a48c46", new Object[]{this, context, str, new Boolean(z), g1aVar});
        } else if (!r54.f(context, str)) {
            Pair a2 = jpu.a("relation", "STAR");
            if (z) {
                str2 = "BIND";
            } else {
                str2 = "UNBIND";
            }
            MtopRequest d = BizExtKt.d("mtop.regera.feed.follow.manage", "1.0", kotlin.collections.a.i(a2, jpu.a("operation", str2), jpu.a("accountId", str), jpu.a("accountType", "ACCOUNT"), jpu.a("source", "shopMore")), false, false, 24, null);
            ckf.d(context);
            MtopBusiness b2 = BizExtKt.b(context, d, null, 4, null);
            b2.registerListener((IRemoteListener) new DefaultMtopListenerImp() { // from class: com.alibaba.triver.triver_shop.ShopMoreUtils$startShopRequest$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(ShopMoreUtils$startShopRequest$1 shopMoreUtils$startShopRequest$1, String str3, Object... objArr) {
                    int hashCode = str3.hashCode();
                    if (hashCode == -743105213) {
                        super.onSystemError(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], objArr[2]);
                        return null;
                    } else if (hashCode == -662674828) {
                        super.onError(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], objArr[2]);
                        return null;
                    } else if (hashCode == 2057952281) {
                        super.onSuccess(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], (BaseOutDo) objArr[2], objArr[3]);
                        return null;
                    } else {
                        int hashCode2 = str3.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str3 + "' with hashcode " + hashCode2 + " in com/alibaba/triver/triver_shop/ShopMoreUtils$startShopRequest$1");
                    }
                }

                @Override // com.alibaba.triver.triver_shop.adapter.DefaultMtopListenerImp, com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    super.onError(i, mtopResponse, obj);
                    g1a<JSONObject, xhv> g1aVar2 = g1aVar;
                    if (g1aVar2 != null) {
                        g1aVar2.invoke(null);
                    }
                }

                @Override // com.alibaba.triver.triver_shop.adapter.DefaultMtopListenerImp, com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    byte[] bArr;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    super.onSuccess(i, mtopResponse, baseOutDo, obj);
                    if (mtopResponse == null) {
                        bArr = null;
                    } else {
                        bArr = mtopResponse.getBytedata();
                    }
                    JSONObject l = brf.l(bArr);
                    g1a<JSONObject, xhv> g1aVar2 = g1aVar;
                    if (g1aVar2 != null) {
                        g1aVar2.invoke(l);
                    }
                }

                @Override // com.alibaba.triver.triver_shop.adapter.DefaultMtopListenerImp, com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    super.onSystemError(i, mtopResponse, obj);
                    g1a<JSONObject, xhv> g1aVar2 = g1aVar;
                    if (g1aVar2 != null) {
                        g1aVar2.invoke(null);
                    }
                }
            });
            b2.startRequest();
        } else if (g1aVar != null) {
            g1aVar.invoke(null);
        }
    }
}
