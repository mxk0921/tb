package com.taobao.android.order.core.weex2;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.factory.TradeHybridDataFactory;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.factory.TradeHybridInstanceFactory;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.management.custom.TradeHybridCustomAnnotation;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.android.preload.core.task.PreloadTaskEntity;
import com.taobao.android.weex_framework.common.MUSEventTarget;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import tb.ckf;
import tb.dbv;
import tb.hav;
import tb.lbv;
import tb.m8v;
import tb.mbv;
import tb.p9b;
import tb.pav;
import tb.pbv;
import tb.qbv;
import tb.t2o;
import tb.v4s;
import tb.v9v;
import tb.wsq;
import tb.yxr;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0010\u0010\n\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0012H\u0007¢\u0006\u0004\b \u0010!J#\u0010\"\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\"\u0010\u0016J-\u0010#\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/taobao/android/order/core/weex2/LogisticsDetailHybridManager;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "", v4s.PARAM_UPLOAD_STAGE, "sceneName", "", "params", "Ltb/xhv;", "hybridOpt", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Landroid/content/Intent;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "prefetchZCache", "(Landroid/content/Intent;)V", "", "enableNavPreOpt", "(Landroid/content/Intent;)Z", "navPreOpt", "(Landroid/app/Activity;Landroid/content/Intent;)V", "navUrl", "preRequestByNative", "(Ljava/lang/String;)V", "url", "generateExtParamsStr", "(Ljava/lang/String;)Ljava/lang/String;", "uniqueKey", "preRenderByNative", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V", "enableMtopPrefetch", "()Z", "mtopPrefetch", "mtopPrefetchByFront", "(Landroid/app/Activity;Landroid/content/Intent;Ljava/lang/String;)V", RPCDataItems.SWITCH_TAG_LOG, "Ljava/lang/String;", "order-core_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class LogisticsDetailHybridManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final LogisticsDetailHybridManager INSTANCE = new LogisticsDetailHybridManager();
    private static final String TAG = "LogisticsDetailHybridManager";

    static {
        t2o.a(614465798);
    }

    private LogisticsDetailHybridManager() {
    }

    public static final /* synthetic */ String access$generateExtParamsStr(LogisticsDetailHybridManager logisticsDetailHybridManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1fadd748", new Object[]{logisticsDetailHybridManager, str});
        }
        return logisticsDetailHybridManager.generateExtParamsStr(str);
    }

    @JvmStatic
    public static final boolean enableMtopPrefetch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61e26c8d", new Object[0])).booleanValue();
        }
        return v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_LOGISTICS_DETAIL, "enableNavMtopPrefetch", true);
    }

    private final boolean enableNavPreOpt(Intent intent) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ccd9918", new Object[]{this, intent})).booleanValue();
        }
        Uri data = intent.getData();
        if (data == null || (str = data.toString()) == null) {
            str = "";
        }
        if (!TradeHybridDataFactory.z(str) && str.length() > 0 && TradeHybridDataFactory.u(str)) {
            return true;
        }
        return false;
    }

    private final String generateExtParamsStr(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("47428190", new Object[]{this, str});
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("inner", (Object) "1");
            jSONObject.put("isLogisticDetail", (Object) "true");
            jSONObject.put("isWeex", (Object) "true");
            JSONObject jSONObject2 = new JSONObject();
            String e = lbv.e(str, CoreConstants.IN_PARAMS_ORDER_CODE);
            if (e == null) {
                e = "";
            }
            if (e.length() > 0) {
                jSONObject2.put((JSONObject) CoreConstants.IN_PARAMS_ORDER_CODE, e);
            }
            String e2 = lbv.e(str, "cpCode");
            if (e2 == null) {
                e2 = "";
            }
            if (e2.length() > 0) {
                jSONObject2.put((JSONObject) "cpCode", e2);
            }
            String e3 = lbv.e(str, "mailNo");
            if (e3 == null) {
                e3 = "";
            }
            if (e3.length() > 0) {
                jSONObject2.put((JSONObject) "mailNo", e3);
            }
            String e4 = lbv.e(str, PreloadTaskEntity.SOURCE_FROM);
            if (e4 == null) {
                e4 = "";
            }
            if (e4.length() > 0) {
                jSONObject2.put((JSONObject) PreloadTaskEntity.SOURCE_FROM, e4);
            }
            if (!jSONObject2.isEmpty()) {
                jSONObject.put((JSONObject) "logistic", (String) jSONObject2);
            }
            String e5 = lbv.e(str, "exParams");
            if (e5 == null) {
                e5 = "";
            }
            if (e5.length() > 0) {
                jSONObject.putAll(JSON.parseObject(e5));
            }
            str2 = jSONObject.toJSONString();
        } catch (Exception e6) {
            e6.printStackTrace();
            m8v.a(e6);
            str2 = "";
        }
        return str2 != null ? str2 : "";
    }

    @TradeHybridCustomAnnotation
    @JvmStatic
    public static final void hybridOpt(Activity activity, String str, String str2, Map<?, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4537c501", new Object[]{activity, str, str2, map});
        } else if (TextUtils.equals(str, UltronTradeHybridStage.ON_NAV_PROCESS) && map != null && (map.get("nav_process_param_intent") instanceof Intent)) {
            Object obj = map.get("nav_process_param_intent");
            if (obj != null) {
                Intent intent = (Intent) obj;
                LogisticsDetailHybridManager logisticsDetailHybridManager = INSTANCE;
                logisticsDetailHybridManager.prefetchZCache(intent);
                if (logisticsDetailHybridManager.enableNavPreOpt(intent)) {
                    logisticsDetailHybridManager.navPreOpt(activity, intent);
                } else if (enableMtopPrefetch()) {
                    logisticsDetailHybridManager.mtopPrefetch(activity, intent);
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.content.Intent");
            }
        }
    }

    private final void mtopPrefetch(Activity activity, Intent intent) {
        String str;
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef5e6f75", new Object[]{this, activity, intent});
            return;
        }
        if (intent == null || (data = intent.getData()) == null || (str = data.toString()) == null) {
            str = "";
        }
        mtopPrefetchByFront(activity, intent, str);
    }

    @JvmStatic
    public static final void mtopPrefetchByFront(Activity activity, Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99099353", new Object[]{activity, intent, str});
        } else if (str != null && str.length() != 0 && enableMtopPrefetch()) {
            Object f = qbv.j().f(str);
            if (f instanceof com.taobao.android.weex_framework.a) {
                com.taobao.android.weex_framework.a aVar = (com.taobao.android.weex_framework.a) f;
                if (!aVar.isDestroyed() && !aVar.isInvalid()) {
                    if (!pav.b()) {
                        hav.g(TAG, "mtopPrefetchByFront:", "not in main thread");
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put((JSONObject) "mtopPrefetchUrl", str);
                        jSONObject.put((JSONObject) "mtopPrefetch", "true");
                        ((com.taobao.android.weex_framework.a) f).dispatchEvent(MUSEventTarget.MUS_DOCUMENT_TARGET, "trade.data.preload", jSONObject);
                        return;
                    } catch (Throwable th) {
                        th.printStackTrace();
                        return;
                    }
                }
            }
            hav.g(TAG, "mtopPrefetchByFront:", "instance is invalid!");
            if (TradeHybridDataFactory.z(str)) {
                INSTANCE.navPreOpt(activity, intent);
                hav.g(TAG, "mtopPrefetchByFront:", "supplementByQuery: " + str);
            }
        }
    }

    private final void navPreOpt(Activity activity, Intent intent) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7402daa9", new Object[]{this, activity, intent});
        } else if (activity != null && intent != null) {
            Uri data = intent.getData();
            if (data == null || (str = data.toString()) == null) {
                str = "";
            }
            if (str.length() != 0) {
                try {
                    boolean m = TradeHybridInstanceFactory.INSTANCE.m(str);
                    boolean s = TradeHybridDataFactory.INSTANCE.s(str);
                    if (m || s) {
                        String a2 = p9b.Companion.a();
                        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
                        if (m) {
                            buildUpon.appendQueryParameter("navAsyncPrerender", "true");
                        }
                        if (s) {
                            buildUpon.appendQueryParameter("navAsyncPrerequest", "true");
                            buildUpon.appendQueryParameter("preRequestUniqueKey", a2);
                        }
                        Uri build = buildUpon.build();
                        intent.setData(build);
                        String uri = build.toString();
                        ckf.f(uri, "navUri.toString()");
                        if (uri.length() != 0) {
                            if (s) {
                                INSTANCE.preRequestByNative(uri);
                            }
                            if (m) {
                                INSTANCE.preRenderByNative(activity, a2, uri);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    hav.g(TAG, "navPreOpt:", "not hit preRender and not hit preRequest");
                } catch (Exception e) {
                    e.printStackTrace();
                    m8v.a(e);
                }
            }
        }
    }

    private final void preRequestByNative(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee64c8eb", new Object[]{this, str});
        } else {
            pav.k(new a(str));
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f9161a;

        public a(String str) {
            this.f9161a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String e = lbv.e(this.f9161a, "bizOrderId");
            if (e == null || e.length() == 0) {
                hav.g(LogisticsDetailHybridManager.TAG, "startRequestOnNavIntercept:", "bizOrderId is empty");
                return;
            }
            String access$generateExtParamsStr = LogisticsDetailHybridManager.access$generateExtParamsStr(LogisticsDetailHybridManager.INSTANCE, this.f9161a);
            if (access$generateExtParamsStr == null || access$generateExtParamsStr.length() == 0) {
                hav.g(LogisticsDetailHybridManager.TAG, "startRequestOnNavIntercept:", "extParams is empty");
                return;
            }
            pbv.b h = new pbv.b().c("mtop.taobao.order.query.detailv2").d("1.0").i(false).j(false).f(true).g(true).h("UNIT_TRADE");
            pbv a2 = h.e(JSON.parseObject("{'appVersion':'3.0', 'appName':'tborder', 'OrderType':'OrderDetail', 'archive':'false', 'templateConfigVersion':'0', 'page':'1', 'bizOrderId':'" + e + "', 'extParams':'" + access$generateExtParamsStr + "'}")).a();
            ckf.f(a2, "UltronTradeHybridMTopMod…\n                .build()");
            TradeHybridDataFactory.y(this.f9161a, "newLogisticsDetail", a2);
        }
    }

    private final void preRenderByNative(Activity activity, String str, String str2) {
        int f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6de3e774", new Object[]{this, activity, str, str2});
            return;
        }
        mbv a2 = new mbv.b().c(dbv.BIZ_LOGISTICS).i(str2).g(1).d("destroy").j("none").a();
        ckf.f(a2, "UltronTradeHybridInstanc…ONE)\n            .build()");
        Resources resources = activity.getResources();
        ckf.f(resources, "activity.resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        if (v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_HYBRID_CONTAINER, "useRealDisplayHeight", true) && (f = lbv.f(activity)) > i2) {
            i2 = f;
        }
        TradeHybridInstanceFactory.g(str, activity, i, i2, a2);
    }

    private final void prefetchZCache(Intent intent) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b4896c3", new Object[]{this, intent});
        } else if (v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_LOGISTICS_DETAIL, "enablePrefetchZCacheOnNav", false)) {
            Uri data = intent.getData();
            if (data == null || (str = data.toString()) == null) {
                str = "";
            }
            if (str.length() != 0 && wsq.O(str, "sourceFrom=notification", false, 2, null)) {
                yxr.b(17);
            }
        }
    }
}
