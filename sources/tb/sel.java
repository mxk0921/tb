package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.widget.Toast;
import com.alibaba.android.ultron.vfw.weex2.UltronWeex2DataPrefetchCache;
import com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.alibaba.android.umbrella.trace.UmbrellaTracker;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliNavServiceInterface;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.android.order.constants.OrderBizCode;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.android.order.core.weex2.LogisticsDetailHybridManager;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.idl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class sel extends l6v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KET_OPEN_URL_H5_OLD_COMPONENT = "__oldComponent";
    public static final String KEY_H5_DATA_PREFIX = "data=";
    public static final String KEY_H5_POST_DATA = "postdata";
    public static final String KEY_H5_QUERY_DATA = "querydata";
    public static final String KEY_MAIN_BIZ_NAME = "ultronTrade";
    public static final String KEY_OPEN_URL_H5_IS_POST_URL = "isPostUrl";
    public static final String TYPE_OPEN_URL_H5 = "H5";
    public static final String TYPE_OPEN_URL_LOGISTICS_WEEX2_FRAGMENT = "logisticsWeex2Fragment";
    public static final String TYPE_OPEN_URL_METHOD_GET = "get";
    public static final String TYPE_OPEN_URL_METHOD_POST = "post";
    public static final String TYPE_OPEN_URL_NATIVE = "Native";
    public static final String TYPE_OPEN_URL_POPLAYER = "PopLayer";
    public static final String TYPE_OPEN_URL_WEEX = "Weex";
    public static final String TYPE_OPEN_URL_WEEX2_FRAGMENT = "weex2Fragment";
    public final OrderConfigs l;
    public int j = 100;
    public final int k = 204800;
    public final Handler m = new Handler(Looper.getMainLooper());

    static {
        t2o.a(614465551);
    }

    public sel(OrderConfigs orderConfigs) {
        e();
        this.l = orderConfigs;
    }

    public static /* synthetic */ Object ipc$super(sel selVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/event/ext/OrderOpenUrlSubscriber");
    }

    public static /* synthetic */ OrderConfigs x(sel selVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrderConfigs) ipChange.ipc$dispatch("20b9e078", new Object[]{selVar});
        }
        return selVar.l;
    }

    public static /* synthetic */ Handler y(sel selVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("21e93239", new Object[]{selVar});
        }
        return selVar.m;
    }

    public static /* synthetic */ void z(sel selVar, Activity activity, UltronWeex2DialogFragment ultronWeex2DialogFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("754e798", new Object[]{selVar, activity, ultronWeex2DialogFragment});
        } else {
            selVar.E(activity, ultronWeex2DialogFragment);
        }
    }

    public final void A(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d71617dc", new Object[]{this, str});
        } else if (str != null && str.length() >= this.k) {
            HashMap hashMap = new HashMap();
            hashMap.put("intent_size", String.valueOf(str.length()));
            UmbrellaTracker.commitFailureStability("umbrella.event.openurl", "ultron.trade.open.url", "1.0", "ultronTrade", "biz_unknow", hashMap, "FAIL_BINDER_TRANSATION", "intent has to many data in jump to native");
        }
    }

    public final String B(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f31b0b24", new Object[]{this, str, jSONObject});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            if (!(entry == null || TextUtils.isEmpty(entry.getKey()) || entry.getValue() == null)) {
                buildUpon.appendQueryParameter(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        return buildUpon.build().toString();
    }

    public final JSONObject C(b8v b8vVar, JSONObject jSONObject) {
        JSONObject fields;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fd4b6b8a", new Object[]{this, b8vVar, jSONObject});
        }
        if (b8vVar.d() == null || (fields = b8vVar.d().getFields()) == null || (jSONObject2 = fields.getJSONObject("queryParams")) == null) {
            return jSONObject;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("preloadParams", (Object) jSONObject2);
        return jSONObject;
    }

    public final void D(Activity activity, UltronWeex2DialogFragment ultronWeex2DialogFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10f2f2f0", new Object[]{this, activity, ultronWeex2DialogFragment});
        } else if (wbl.f()) {
            this.m.post(new a(ultronWeex2DialogFragment, activity));
            hav.g("OrderOpenUrlSubscriber", "displayOrderWeex2DialogFragment", "enter delayed transition");
        } else {
            E(activity, ultronWeex2DialogFragment);
        }
    }

    public final IDMComponent F(IDMComponent iDMComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("24bcf524", new Object[]{this, iDMComponent, str});
        }
        if (iDMComponent != null && !TextUtils.isEmpty(str)) {
            LinkedList linkedList = new LinkedList();
            linkedList.add(iDMComponent);
            while (!linkedList.isEmpty()) {
                IDMComponent iDMComponent2 = (IDMComponent) linkedList.poll();
                if (iDMComponent2 != null && !TextUtils.isEmpty(iDMComponent2.getTag())) {
                    if (TextUtils.equals(iDMComponent2.getTag(), str)) {
                        return iDMComponent2;
                    }
                    List<IDMComponent> children = iDMComponent2.getChildren();
                    if (children != null && !children.isEmpty()) {
                        linkedList.addAll(children);
                    }
                }
            }
        }
        return null;
    }

    public final IDMComponent G(IDMComponent iDMComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("b8110b5e", new Object[]{this, iDMComponent, str});
        }
        if (iDMComponent == null || TextUtils.isEmpty(str)) {
            return null;
        }
        if (TextUtils.equals(iDMComponent.getTag(), str)) {
            return iDMComponent;
        }
        return G(iDMComponent.getParent(), str);
    }

    public final Pair<JSONObject, String> H(b8v b8vVar, UltronWeex2DialogFragment ultronWeex2DialogFragment) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("8d78b62e", new Object[]{this, b8vVar, ultronWeex2DialogFragment});
        }
        if ((b8vVar.d() == null && b8vVar.d().getFields() == null) || (jSONObject = b8vVar.d().getFields().getJSONObject("basicInfo")) == null) {
            return null;
        }
        return afl.d(jSONObject.getString("orderId"), jSONObject.getString(CoreConstants.IN_PARAMS_FILTER_ORDERLINE_ID), ultronWeex2DialogFragment.R2());
    }

    public void L(String str, JSONObject jSONObject, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d677d53", new Object[]{this, str, jSONObject, str2});
        } else {
            M(str, jSONObject, str2, null);
        }
    }

    public void N(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("512971bf", new Object[]{this, str, jSONObject});
            return;
        }
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            for (String str2 : jSONObject.keySet()) {
                if (!TextUtils.isEmpty(str2)) {
                    Object obj = jSONObject.get(str2);
                    if (obj instanceof Boolean) {
                        bundle.putBoolean(str2, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Integer) {
                        bundle.putInt(str2, ((Integer) obj).intValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(str2, ((Double) obj).doubleValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(str2, ((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        bundle.putString(str2, (String) obj);
                    } else if (obj instanceof Serializable) {
                        bundle.putSerializable(str2, (Serializable) obj);
                    }
                }
            }
        }
        AliNavServiceInterface c = xq0.c();
        if (c != null) {
            c.a(this.b).b(this.j).d(bundle).c(str);
        } else if (yv6.b(this.b)) {
            Toast.makeText(this.b, "com.taobao.android:alinavimp:xx.xx.xx 没有引入，请实现接口适配导航库", 0).show();
        }
    }

    public void P(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea19e455", new Object[]{this, str, jSONObject});
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0144, code lost:
        if (r7.equals("H5") == false) goto L_0x011f;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    @Override // tb.l6v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void t(tb.b8v r15) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.sel.t(tb.b8v):void");
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f27993a = v9v.e(UltronTradeHybridSwitcherHelper.ORANGE_KEY_ORDER_DETAIL, "maxODetailDelayedTransitionCycleCount", 5);
        public int b = 0;
        public final /* synthetic */ UltronWeex2DialogFragment c;
        public final /* synthetic */ Activity d;

        public a(UltronWeex2DialogFragment ultronWeex2DialogFragment, Activity activity) {
            this.c = ultronWeex2DialogFragment;
            this.d = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.b >= this.f27993a || sel.x(sel.this).x()) {
                if (v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_ORDER_DETAIL, "modifyTransitionStartTime", true)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("transitionStartTime", (Object) String.valueOf(System.currentTimeMillis()));
                    this.c.q3(jSONObject);
                }
                hav.g("OrderOpenUrlSubscriber", "displayOrderWeex2DialogFragment", "cycleCount: " + this.b + ", isODetailStartTransition: " + sel.x(sel.this).x());
                sel.y(sel.this).removeCallbacks(this);
                sel.x(sel.this).M(false);
                sel.z(sel.this, this.d, this.c);
            } else {
                sel.y(sel.this).postDelayed(this, 10L);
                this.b++;
            }
        }
    }

    public void M(String str, JSONObject jSONObject, String str2, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58bb1edd", new Object[]{this, str, jSONObject, str2, jSONObject2});
            return;
        }
        String string = jSONObject != null ? jSONObject.getString("__oldComponent") : null;
        if (TextUtils.isEmpty(str2)) {
            str2 = "post";
        }
        if (string == null || jSONObject == null) {
            str2 = "get";
        }
        Bundle bundle = new Bundle();
        if (jSONObject2 != null) {
            try {
                bundle.putSerializable("initData", jSONObject2);
            } catch (Exception unused) {
                UnifyLog.e("OrderOpenUrlSubscriber.jumpToH5WithInitData", "put initData error");
            }
        }
        if (!"get".equals(str2)) {
            bundle.putBoolean("isPostUrl", true);
            if (string != null) {
                try {
                    String encode = Uri.encode(string);
                    bundle.putString("postdata", "data=" + encode);
                } catch (Exception e) {
                    UnifyLog.m(this.d.getBizName(), "OrderOpenUrlSubscriber", "oldComponent encode 失败", string);
                    lbq.c(this.d.getBizName(), "OrderOpenUrlSubscriber.jumpToH5", e);
                }
            }
            try {
                jSONObject3 = JSON.parseObject(string);
            } catch (Throwable unused2) {
                jSONObject3 = new JSONObject();
            }
            xq0.c().a(this.b).b(this.j).d(bundle).g(xq0.c().a(this.b).f(str, jSONObject3));
        } else if (jSONObject2 == null) {
            xq0.c().a(this.b).b(this.j).c(str);
        } else {
            xq0.c().a(this.b).b(this.j).d(bundle).c(str);
        }
    }

    public void O(String str, JSONObject jSONObject) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f421c56", new Object[]{this, str, jSONObject});
        } else if (!TextUtils.isEmpty(str)) {
            if (Uri.parse(str).getScheme() == null) {
                str = h1p.HTTPS_PREFIX + parse.getSchemeSpecificPart();
            }
            try {
                StringBuilder sb = new StringBuilder("poplayer://abcd?openType=directly&uuid=");
                sb.append(System.currentTimeMillis());
                sb.append("&params=");
                sb.append(URLEncoder.encode("{\"url\":\"" + str + "\"}", "UTF-8"));
                String sb2 = sb.toString();
                AliNavServiceInterface c = xq0.c();
                if (c != null) {
                    c.a(this.b).c(sb2);
                } else if (yv6.b(this.b)) {
                    Toast.makeText(this.b, "com.taobao.android:alinavimp:xx.xx.xx 没有引入，请实现接口适配导航库", 0).show();
                }
            } catch (Throwable th) {
                UnifyLog.m(this.d.getBizName(), "OrderOpenUrlSubscriber", "jumpToPoplayer error: " + Log.getStackTraceString(th), new String[0]);
                lbq.c(this.d.getBizName(), "OrderOpenUrlSubscriber.jumpToPoplayer", th);
            }
        }
    }

    public final void S(b8v b8vVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e420988b", new Object[]{this, b8vVar, jSONObject});
        } else if (v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_LOGISTICS_DETAIL, "enableTransmitQueryParams", false)) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                IDMComponent G = G(b8vVar.d(), "Main");
                if (!(G == null || G.getFields() == null)) {
                    JSONObject jSONObject3 = G.getFields().getJSONObject("packagePreview");
                    if (jSONObject3 == null || jSONObject3.isEmpty()) {
                        jSONObject3 = new JSONObject();
                    }
                    jSONObject2.put("packagePreview", (Object) jSONObject3);
                }
                IDMComponent F = F(G, "item");
                if (!(F == null || F.getFields() == null)) {
                    JSONObject jSONObject4 = F.getFields().getJSONObject("queryParams");
                    if (jSONObject4 == null || jSONObject4.isEmpty()) {
                        jSONObject4 = new JSONObject();
                    }
                    jSONObject2.put("queryParams", (Object) jSONObject4);
                }
                if (jSONObject2.isEmpty()) {
                    jSONObject2 = new JSONObject();
                }
                jSONObject.put("preloadParams", (Object) jSONObject2);
            } catch (Throwable unused) {
            }
        }
    }

    public final void E(Activity activity, UltronWeex2DialogFragment ultronWeex2DialogFragment) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f9c91fe", new Object[]{this, activity, ultronWeex2DialogFragment});
            return;
        }
        if (this.l.o() == null) {
            z = false;
        }
        if (z) {
            idl.c(idl.a.a(OrderBizCode.orderList, "orderListRebuild").sampling(1.0f).message("订单列表销毁重建").success(false));
        }
        if (!z || !v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_ORDER_DETAIL, "enableRemoveReconstructedODetail", false)) {
            ultronWeex2DialogFragment.K2(activity);
            return;
        }
        ultronWeex2DialogFragment.M2(activity, this.l.o());
        this.l.S(null);
    }

    public final boolean I(String str) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d83e2f37", new Object[]{this, str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null) {
            return (TextUtils.equals(parse.getHost(), "meta.m.taobao.com") || TextUtils.equals(parse.getHost(), "meta.wapa.taobao.com")) && TextUtils.equals(parse.getPath(), "/app/mtb/logisticsV2/detail");
        }
        return false;
    }

    public final boolean J(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c439a38b", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        return (TextUtils.equals(parse.getHost(), "meta.m.taobao.com") || TextUtils.equals(parse.getHost(), "meta.wapa.taobao.com")) && (TextUtils.equals(parse.getPath(), "/app/tb-trade/super-odetail/home") || TextUtils.equals(parse.getPath(), "/app/tb-trade/odetail/home"));
    }

    public final boolean K(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("309a9b99", new Object[]{this, jSONObject})).booleanValue();
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("global");
        return jSONObject2 != null && TextUtils.equals("true", jSONObject2.getString("taoTmDegrade"));
    }

    public final void Q(b8v b8vVar, String str, JSONObject jSONObject, String str2) {
        Uri parse;
        Set<String> queryParameterNames;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd252985", new Object[]{this, b8vVar, str, jSONObject, str2});
        } else if (!wbl.c()) {
            hav.g("OrderOpenUrlSubscriber", "openLogisticsWeex2Fragment", "OnError: switcher is off");
            L(str, jSONObject, str2);
        } else if (!wbl.b() || !zt3.a()) {
            Context e = b8vVar.e();
            if (!(e instanceof Activity)) {
                hav.g("OrderOpenUrlSubscriber", "openLogisticsWeex2Fragment", "OnError: context is not a Activity");
                return;
            }
            UltronWeex2DialogFragment i = this.l.i();
            if (i == null) {
                hav.g("OrderOpenUrlSubscriber", "openLogisticsWeex2Fragment", "OnError: openLogisticsWeex2Fragment is null, jump to H5");
                L(str, jSONObject, str2);
                return;
            }
            boolean b3 = i.b3();
            boolean W2 = i.W2();
            boolean a3 = i.a3();
            boolean z = i.c3() && v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_HYBRID_CONTAINER, "checkWeexInstanceDestroyed", true);
            if (!b3 || !W2 || a3 || z) {
                L(str, jSONObject, str2);
                obv.h(false, dbv.BIZ_LOGISTICS, "OnError: openLogisticsWeex2Fragment is not ready, renderReady: " + b3 + ", bizReady: " + W2 + ", renderException: " + a3 + ", hasWeexInstanceDestroyed: " + z);
                return;
            }
            LogisticsDetailHybridManager.mtopPrefetchByFront(null, null, str);
            if (v9v.i("orderMap", "registerPlatformViewOnNav", true)) {
                lbv.k();
            }
            JSONObject jSONObject2 = new JSONObject();
            if (!TextUtils.isEmpty(str) && (queryParameterNames = (parse = Uri.parse(str)).getQueryParameterNames()) != null) {
                for (String str3 : queryParameterNames) {
                    if (!TextUtils.isEmpty(str3)) {
                        String queryParameter = parse.getQueryParameter(str3);
                        if (!TextUtils.isEmpty(queryParameter)) {
                            jSONObject2.put(str3, (Object) queryParameter);
                        }
                    }
                }
            }
            if (jSONObject != null) {
                jSONObject2.putAll(jSONObject);
            }
            S(b8vVar, jSONObject2);
            i.s3(jSONObject2);
            i.B3(str);
            E((Activity) e, i);
        } else {
            hav.g("OrderOpenUrlSubscriber", "openLogisticsWeex2Fragment", "OnError: repeat click");
        }
    }

    public final void R(b8v b8vVar, String str, JSONObject jSONObject, String str2) {
        Context context;
        boolean z;
        String str3;
        String str4;
        JSONObject jSONObject2;
        Uri parse;
        Set<String> queryParameterNames;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("524e6959", new Object[]{this, b8vVar, str, jSONObject, str2});
            return;
        }
        Context e = b8vVar.e();
        if (!(e instanceof Activity)) {
            hav.g("OrderOpenUrlSubscriber", "openUltronWeex2DialogFragment", "OnError: context is not a Activity");
            return;
        }
        UltronWeex2DialogFragment j = this.l.j();
        if (j == null) {
            L(str, jSONObject, str2);
            hav.g("OrderOpenUrlSubscriber", "openUltronWeex2DialogFragment", "OnError: orderWeex2DialogFragment is null, jump to H5");
            obv.j(false, dbv.BIZ_ORDER_DETAIL, "OnError: orderWeex2DialogFragment is null, jump to H5");
            return;
        }
        Pair<JSONObject, String> H = H(b8vVar, j);
        JSONObject jSONObject3 = H != null ? (JSONObject) H.first : null;
        boolean b3 = j.b3();
        boolean W2 = j.W2();
        boolean a3 = j.a3();
        if (j.c3()) {
            context = e;
            if (v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_HYBRID_CONTAINER, "checkWeexInstanceDestroyed", true)) {
                z = true;
                if (b3 || !W2 || a3 || z) {
                    M(str, jSONObject, str2, C(b8vVar, jSONObject3));
                    String str5 = "OnError: orderWeex2DialogFragment is not ready, renderReady: " + b3 + ", bizReady: " + W2 + ", renderException: " + a3 + ", hasWeexInstanceDestroyed: " + z;
                    obv.h(false, dbv.BIZ_ORDER_DETAIL, str5);
                    obv.j(false, dbv.BIZ_ORDER_DETAIL, str5);
                }
                JSONObject jSONObject4 = new JSONObject();
                if (!TextUtils.isEmpty(str) && (queryParameterNames = (parse = Uri.parse(str)).getQueryParameterNames()) != null) {
                    for (String str6 : queryParameterNames) {
                        if (!TextUtils.isEmpty(str6)) {
                            String queryParameter = parse.getQueryParameter(str6);
                            if (!TextUtils.isEmpty(queryParameter)) {
                                jSONObject4.put(str6, (Object) queryParameter);
                            }
                        }
                    }
                }
                if (jSONObject != null) {
                    jSONObject4.putAll(jSONObject);
                }
                if (!(b8vVar.d() == null || b8vVar.d().getFields() == null)) {
                    JSONObject fields = b8vVar.d().getFields();
                    JSONObject jSONObject5 = fields.getJSONObject("basicInfo");
                    if (jSONObject5 != null) {
                        String str7 = "";
                        jSONObject4.put("orderId", (Object) (jSONObject5.getString("orderId") == null ? str7 : jSONObject5.getString("orderId")));
                        if (jSONObject5.getString(CoreConstants.IN_PARAMS_FILTER_ORDERLINE_ID) != null) {
                            str7 = jSONObject5.getString(CoreConstants.IN_PARAMS_FILTER_ORDERLINE_ID);
                        }
                        jSONObject4.put(CoreConstants.IN_PARAMS_FILTER_ORDERLINE_ID, (Object) str7);
                        if (jSONObject3 != null && !jSONObject3.isEmpty()) {
                            if (K(jSONObject3)) {
                                M(str, jSONObject, str2, jSONObject3);
                                hav.g("OrderOpenUrlSubscriber", "openUltronWeex2DialogFragment", "OnError: prefetch cacheData need downgrade");
                                obv.j(false, dbv.BIZ_ORDER_DETAIL, "OnError: prefetch cacheData need downgrade");
                                return;
                            } else if (j.O2().isEmpty()) {
                                jSONObject4.put("responseData", (Object) jSONObject3);
                            }
                        }
                    }
                    if (fields.getJSONObject("queryParams") == null) {
                        jSONObject2 = new JSONObject();
                    } else {
                        jSONObject2 = fields.getJSONObject("queryParams");
                    }
                    jSONObject4.put("preloadParams", (Object) jSONObject2);
                }
                if (H != null) {
                    str3 = (String) H.second;
                } else {
                    str3 = UltronWeex2DataPrefetchCache.CacheType.EXCEPTION.name();
                }
                jSONObject4.put("preRequestType", (Object) str3);
                boolean z2 = jSONObject4.containsKey("responseData") && jSONObject4.get("responseData") != null;
                if (z2) {
                    str4 = "OnSuccess!";
                } else {
                    str4 = "OnError: responseData is null";
                }
                obv.j(z2, dbv.BIZ_ORDER_DETAIL, str4);
                if (z2) {
                    idl.c(idl.a.a(OrderBizCode.orderList, "odetailPreRequestUsage").branch(1).message("预请求数据已使用").sampling(5.0E-4f));
                }
                j.s3(jSONObject4);
                j.B3(str);
                D((Activity) context, j);
                return;
            }
        } else {
            context = e;
        }
        z = false;
        if (b3) {
        }
        M(str, jSONObject, str2, C(b8vVar, jSONObject3));
        String str52 = "OnError: orderWeex2DialogFragment is not ready, renderReady: " + b3 + ", bizReady: " + W2 + ", renderException: " + a3 + ", hasWeexInstanceDestroyed: " + z;
        obv.h(false, dbv.BIZ_ORDER_DETAIL, str52);
        obv.j(false, dbv.BIZ_ORDER_DETAIL, str52);
    }
}
