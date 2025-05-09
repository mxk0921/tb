package com.taobao.android.detail.alittdetail.supermarket;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.android.icart.core.QueryParamsManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.alittdetail.supermarket.a;
import com.taobao.android.detail.ttdetail.data.meta.Feature;
import com.taobao.android.detail.ttdetail.data.meta.Seller;
import com.taobao.android.detail.ttdetail.data.meta.SkuCore;
import com.taobao.android.detail.ttdetail.data.meta.Trade;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.utils.DataUtils;
import com.taobao.android.detail.ttdetail.utils.UtUtils;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.HashMap;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bwr;
import tb.g4l;
import tb.ir;
import tb.jov;
import tb.mr7;
import tb.nj7;
import tb.q2q;
import tb.slo;
import tb.t2o;
import tb.tgh;
import tb.wcu;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class SuperMarketAddCartHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
    }

    static {
        t2o.a(354418789);
    }

    public static /* synthetic */ void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd32a15", new Object[]{str, str2, str3});
        } else {
            c(str, str2, str3);
        }
    }

    public static /* synthetic */ String b(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a9054dc3", new Object[]{mtopResponse});
        }
        return e(mtopResponse);
    }

    public static void c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fbba471", new Object[]{str, str2, str3});
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setData(new JSONObject(str, str2, str3) { // from class: com.taobao.android.detail.alittdetail.supermarket.SuperMarketAddCartHandler.3
            public final /* synthetic */ String val$asac;
            public final /* synthetic */ String val$itemApplyParams;
            public final /* synthetic */ String val$sellerId;

            {
                this.val$asac = str;
                this.val$itemApplyParams = str2;
                this.val$sellerId = str3;
                put("detail_v", "3.3.2");
                put("asac", (Object) str);
                put("itemApplyParams", (Object) str2);
                put("sellerId", (Object) str3);
            }
        }.toJSONString());
        mtopRequest.setApiName("mtop.taobao.detail.multiApplyCoupon");
        mtopRequest.setVersion("1.0");
        mtopRequest.setNeedEcode(false);
        mtopRequest.setNeedSession(false);
        RemoteBusiness build = RemoteBusiness.build(mtopRequest, nj7.c());
        build.registeListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.android.detail.alittdetail.supermarket.SuperMarketAddCartHandler.4
            public static volatile transient /* synthetic */ IpChange $ipChange = null;
            private static final String DEFAULT_TIP = "很遗憾，领券失败。请到商品页面领券处试试～";
            private Handler mHandler = new Handler(Looper.getMainLooper());

            /* compiled from: Taobao */
            /* renamed from: com.taobao.android.detail.alittdetail.supermarket.SuperMarketAddCartHandler$4$a */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
            public class a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ String f6571a;

                public a(String str) {
                    this.f6571a = str;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        Toast.makeText(mr7.d(), this.f6571a, 0).show();
                    }
                }
            }

            /* compiled from: Taobao */
            /* renamed from: com.taobao.android.detail.alittdetail.supermarket.SuperMarketAddCartHandler$4$b */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
            public class b implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ MtopResponse f6572a;

                public b(MtopResponse mtopResponse) {
                    this.f6572a = mtopResponse;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        Toast.makeText(mr7.d(), this.f6572a.getRetMsg(), 0).show();
                    }
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    this.mHandler.postDelayed(new b(mtopResponse), 5000L);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    onError(i, mtopResponse, obj);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                org.json.JSONObject dataJsonObject = mtopResponse != null ? mtopResponse.getDataJsonObject() : null;
                String str4 = DEFAULT_TIP;
                if (dataJsonObject != null) {
                    str4 = dataJsonObject.optString("tip", str4);
                }
                if (dataJsonObject == null || !dataJsonObject.optBoolean("isSuccess", false)) {
                    this.mHandler.postDelayed(new a(str4), 5000L);
                }
            }
        });
        build.reqMethod(MethodEnum.GET);
        build.startRequest();
    }

    public static boolean d(final ze7 ze7Var, wcu wcuVar, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ce31e74", new Object[]{ze7Var, wcuVar, aVar})).booleanValue();
        }
        final String c = wcuVar.c();
        if (TextUtils.isEmpty(c)) {
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("itemId", (Object) c);
        jSONObject.put("codePath", (Object) "SuperMarketAddCartHandler_executeAddCart");
        UtUtils.f(19999, "Sku_Code_Track", jSONObject);
        HashMap hashMap = new HashMap();
        hashMap.put("addSource", "nativeDetail");
        if (wcuVar.b() != null) {
            hashMap.putAll(wcuVar.b());
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setData(new JSONObject(c, wcuVar, hashMap) { // from class: com.taobao.android.detail.alittdetail.supermarket.SuperMarketAddCartHandler.1
            public final /* synthetic */ HashMap val$exParams;
            public final /* synthetic */ String val$itemId;
            public final /* synthetic */ wcu val$tradeParams;

            {
                this.val$itemId = c;
                this.val$tradeParams = wcuVar;
                this.val$exParams = hashMap;
                put("detail_v", "3.3.2");
                put("itemId", (Object) c);
                put(q2q.KEY_SKU_ID, (Object) wcuVar.d());
                put("quantity", (Object) String.valueOf(wcuVar.a()));
                put("cartFrom", QueryParamsManager.DEFAULT_CART_FROM);
                put("exParams", (Object) JSON.toJSONString(hashMap));
            }
        }.toJSONString());
        mtopRequest.setApiName("mtop.trade.addBag");
        mtopRequest.setVersion("3.1");
        mtopRequest.setNeedEcode(true);
        mtopRequest.setNeedSession(true);
        RemoteBusiness build = RemoteBusiness.build(mtopRequest, nj7.c());
        build.registeListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.android.detail.alittdetail.supermarket.SuperMarketAddCartHandler.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            private void broadcastCartDataUpdate(Context context, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c299eeb7", new Object[]{this, context, str});
                    return;
                }
                Intent intent = new Intent();
                intent.setAction("cartRefreshData");
                if (TextUtils.isEmpty(str)) {
                    str = "";
                }
                intent.putExtra("stringifyAddCartResult", str);
                intent.addCategory("android.intent.category.DEFAULT");
                LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
            }

            private void handleSmAchieveCoupon() {
                SkuCore skuCore;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8c08585c", new Object[]{this});
                    return;
                }
                Feature feature = (Feature) ze7.this.e().f(Feature.class);
                if (feature != null && feature.isSmAcitonAfterPurchase() && (skuCore = (SkuCore) ze7.this.e().f(SkuCore.class)) != null && skuCore.isNoSkuId()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("itemId", ze7.this.i().c("requestItemId"));
                    jSONObject2.put("codePath", (Object) "handleSmAchieveCoupon");
                    UtUtils.f(19999, "Sku_Code_Track", jSONObject2);
                    SkuCore.b bVar = skuCore.getZeroSku2info().get("0");
                    String b = bVar.b();
                    String c2 = bVar.c();
                    String E = DataUtils.E((Seller) ze7.this.e().f(Seller.class), "");
                    if (!TextUtils.isEmpty(c2) && !TextUtils.isEmpty(E)) {
                        SuperMarketAddCartHandler.a(b, c2, E);
                    }
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    handleAddCartError(mtopResponse);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    onError(i, mtopResponse, obj);
                }
            }

            private void handleAddCartError(MtopResponse mtopResponse) {
                org.json.JSONObject dataJsonObject;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fb4c80bb", new Object[]{this, mtopResponse});
                    return;
                }
                if (mtopResponse != null) {
                    try {
                        dataJsonObject = mtopResponse.getDataJsonObject();
                    } catch (Throwable unused) {
                    }
                } else {
                    dataJsonObject = null;
                }
                if (dataJsonObject != null && dataJsonObject.getBoolean(slo.KEY_IS_FULL)) {
                    final String string = dataJsonObject.getString("popLayerUrl");
                    if (!TextUtils.isEmpty(string)) {
                        ze7.this.b().h(new ir(new JSONObject() { // from class: com.taobao.android.detail.alittdetail.supermarket.SuperMarketAddCartHandler.2.1
                            {
                                put("type", g4l.EVENT_TYPE_ALTERNATIVE);
                                put("fields", (Object) new JSONObject() { // from class: com.taobao.android.detail.alittdetail.supermarket.SuperMarketAddCartHandler.2.1.1
                                    {
                                        put("url", (Object) string);
                                    }
                                });
                            }
                        }), new RuntimeAbilityParam[0]);
                        return;
                    }
                    return;
                }
                String str = "小二很忙，系统很累，请稍后重试";
                if (mtopResponse == null || mtopResponse.is41XResult()) {
                    str = str;
                } else {
                    str = mtopResponse.getRetMsg();
                    if (TextUtils.isEmpty(str)) {
                        str = "加入购物车出错";
                    }
                }
                if (mtopResponse == null || !mtopResponse.isSessionInvalid()) {
                    if (mtopResponse == null || mtopResponse.isMtopServerError() || mtopResponse.isMtopSdkError() || mtopResponse.isNetworkError() || mtopResponse.isSystemError() || mtopResponse.isExpiredRequest() || mtopResponse.is41XResult() || !mtopResponse.isApiLockedResult()) {
                    }
                    Toast.makeText(mr7.d(), str, 0).show();
                }
                a aVar2 = aVar;
                if (aVar2 != null) {
                    ((a.C0348a) aVar2).a();
                }
                if ((mtopResponse == null || (!mtopResponse.isSessionInvalid() && !"ANDROID_SYS_LOGIN_CANCEL".equals(mtopResponse.getRetCode()))) && !TextUtils.isEmpty(c)) {
                    String str2 = c;
                    jov.k(ze7.this.c(), bwr.NAV_URL_DETAIL_BASE + str2 + ".htm");
                }
            }

            private void handleAddCartSuccess(MtopResponse mtopResponse) {
                JSONObject afterAddToCartAction;
                JSONObject jSONObject2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("98f8acb6", new Object[]{this, mtopResponse});
                    return;
                }
                Trade trade = (Trade) ze7.this.e().f(Trade.class);
                if (trade != null && (afterAddToCartAction = trade.getAfterAddToCartAction()) != null && (jSONObject2 = afterAddToCartAction.getJSONObject("fields")) != null) {
                    String string = afterAddToCartAction.getString("type");
                    if (!TextUtils.isEmpty(jSONObject2.getString("url")) && !TextUtils.isEmpty(string)) {
                        ze7.this.b().h(new ir(afterAddToCartAction), new RuntimeAbilityParam[0]);
                    }
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                } else if (mtopResponse == null || !mtopResponse.isApiSuccess()) {
                    handleAddCartError(mtopResponse);
                } else {
                    handleAddCartSuccess(mtopResponse);
                    Toast.makeText(ze7.this.c(), "添加成功，在购物车等亲～", 0).show();
                    broadcastCartDataUpdate(ze7.this.c(), SuperMarketAddCartHandler.b(mtopResponse));
                    a aVar2 = aVar;
                    if (aVar2 != null) {
                        ((a.C0348a) aVar2).b();
                    }
                    handleSmAchieveCoupon();
                }
            }
        });
        build.setUnitStrategy("UNIT_TRADE");
        build.reqMethod(MethodEnum.POST);
        build.startRequest();
        return true;
    }

    public static String e(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7cebab8c", new Object[]{mtopResponse});
        }
        if (mtopResponse == null) {
            return null;
        }
        try {
            return JSON.parseObject(new String(mtopResponse.getBytedata())).getString("data");
        } catch (Throwable th) {
            tgh.c("SuperMarketAddCartHandler", "getMtopData error", th);
            return null;
        }
    }
}
