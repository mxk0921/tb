package com.taobao.detail.rate.vivid.utils;

import android.app.Application;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import androidx.fragment.app.Fragment;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridInstanceRenderMode;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import com.taobao.detail.rate.RateFeedsWeexFragment;
import com.taobao.detail.rate.model.RateInfo;
import com.taobao.detail.rate.model.RateInfoV2;
import com.taobao.detail.rate.preload.RateListPreRequestManager;
import com.taobao.login4android.api.Login;
import com.taobao.tao.Globals;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import tb.ahd;
import tb.ccv;
import tb.ckf;
import tb.dcp;
import tb.dx1;
import tb.i04;
import tb.lbv;
import tb.n9l;
import tb.orm;
import tb.pgn;
import tb.qbv;
import tb.qrf;
import tb.r4p;
import tb.srf;
import tb.t84;
import tb.u38;
import tb.uhn;
import tb.v4s;
import tb.wsq;
import tb.xgn;
import tb.ygn;
import tb.zgn;
import tb.zhn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class WeexUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final WeexUtils INSTANCE = new WeexUtils();

    /* renamed from: a  reason: collision with root package name */
    public static final String f10378a = n9l.INSTANCE.A();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a<T> implements Comparator<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, t, t2})).intValue();
            }
            Object key = ((Map.Entry) t).getKey();
            ckf.f(key, "it.key");
            String I0 = wsq.I0((String) key, "server_", null, 2, null);
            Object key2 = ((Map.Entry) t2).getKey();
            ckf.f(key2, "it.key");
            return t84.a(I0, wsq.I0((String) key2, "server_", null, 2, null));
        }
    }

    public static /* synthetic */ void d(WeexUtils weexUtils, JSONObject jSONObject, ahd ahdVar, boolean z, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a449220", new Object[]{weexUtils, jSONObject, ahdVar, new Boolean(z), new Integer(i), obj});
            return;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        weexUtils.b(jSONObject, ahdVar, z);
    }

    public final void c(RateInfo rateInfo, ahd ahdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd86ea9d", new Object[]{this, rateInfo, ahdVar});
        } else {
            d(this, new zgn().a(rateInfo), ahdVar, false, 4, null);
        }
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("766bf130", new Object[]{this})).booleanValue();
        }
        if (dx1.Companion.c() || !ygn.INSTANCE.a()) {
            return false;
        }
        return true;
    }

    public final String f(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f7b2066", new Object[]{this, jSONObject, jSONObject2});
        }
        ckf.g(jSONObject, "request");
        ckf.g(jSONObject2, "rateInfoJSON");
        StringBuilder sb = new StringBuilder("rateType-");
        String userId = Login.getUserId();
        String j = j((JSONObject) jSONObject2.get("exParams"));
        sb.append(jSONObject.get("rateType"));
        sb.append("-searchImpr-");
        sb.append(jSONObject.get("searchImpr"));
        sb.append("-expression-");
        sb.append(jSONObject.get(DXTraceUtil.TYPE_EXPRESSION_STRING));
        sb.append("-fromImpr-");
        sb.append(jSONObject.get("fromImpr"));
        sb.append("-rateSrc-");
        sb.append(jSONObject.get("rateSrc"));
        sb.append("-storeId-");
        sb.append(jSONObject.get(r4p.KEY_STORE_ID));
        sb.append("-invokeSource-");
        sb.append(jSONObject.get("invokeSource"));
        sb.append("-feedId-");
        sb.append(jSONObject.get("feedId"));
        sb.append("-skuVids-");
        sb.append(jSONObject.get("skuVids"));
        sb.append("-auctionNumId-");
        sb.append(jSONObject.get("auctionNumId"));
        sb.append("-feature-");
        sb.append(jSONObject.get("feature"));
        sb.append("-foldFlag-");
        sb.append(jSONObject.get("foldFlag"));
        sb.append("-userId-");
        sb.append(userId);
        if (TextUtils.isEmpty(j)) {
            str = "";
        } else {
            str = "-" + j;
        }
        sb.append(str);
        String sb2 = sb.toString();
        ckf.f(sb2, "result.toString()");
        return sb2;
    }

    public final void i(JSONObject jSONObject, String str, @UltronTradeHybridStage String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca31d6f1", new Object[]{this, jSONObject, str, str2});
            return;
        }
        ckf.g(jSONObject, "request");
        ckf.g(str, "pvId");
        ckf.g(str2, v4s.PARAM_UPLOAD_STAGE);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "enablePreRequest", "true");
        jSONObject2.put((JSONObject) "preRequestParams", (String) jSONObject);
        jSONObject2.put((JSONObject) "storageKey", str);
        jSONObject2.put((JSONObject) "bizName", "rateList");
        jSONObject2.put((JSONObject) "preRequestUniqueKey", str);
        qbv.j().a(str2, "detail", jSONObject2);
    }

    public final String j(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ac998d2f", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return "";
        }
        Set<Map.Entry<String, Object>> entrySet = jSONObject.entrySet();
        ckf.f(entrySet, "exParams.entries");
        return i04.j0(dcp.y(dcp.w(dcp.n(i04.Q(entrySet), WeexUtils$processServerParams$filteredList$1.INSTANCE), new a())), "-", null, null, 0, null, WeexUtils$processServerParams$1.INSTANCE, 30, null);
    }

    public final void a(RateFeedsWeexFragment rateFeedsWeexFragment, String str, com.taobao.android.weex_framework.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9d3be0d", new Object[]{this, rateFeedsWeexFragment, str, aVar, new Boolean(z)});
            return;
        }
        ckf.g(rateFeedsWeexFragment, "fragment");
        ckf.g(str, "url");
        rateFeedsWeexFragment.y3(aVar);
        Application application = Globals.getApplication();
        ckf.f(application, "Globals.getApplication()");
        Resources resources = application.getResources();
        ckf.f(resources, "Globals.getApplication().resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        ckf.f(displayMetrics, "Globals.getApplication().resources.displayMetrics");
        Bundle bundle = new Bundle();
        RateFeedsWeexFragment.a aVar2 = RateFeedsWeexFragment.Companion;
        bundle.putString(aVar2.a(), "UltronTradeHybridActivity");
        bundle.putString(aVar2.b(), "UltronTradeHybridActivity");
        bundle.putString(aVar2.h(), str);
        bundle.putBoolean(aVar2.g(), z);
        bundle.putBoolean(aVar2.f(), false);
        bundle.putInt(aVar2.c(), 0);
        bundle.putInt(aVar2.e(), displayMetrics.widthPixels);
        bundle.putInt(aVar2.d(), displayMetrics.heightPixels);
        rateFeedsWeexFragment.setArguments(bundle);
        rateFeedsWeexFragment.init();
    }

    public final void b(JSONObject jSONObject, ahd ahdVar, boolean z) {
        String str;
        String str2;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3d65cd0", new Object[]{this, jSONObject, ahdVar, new Boolean(z)});
            return;
        }
        u38.INSTANCE.c();
        com.taobao.android.weex_framework.a aVar = null;
        Fragment fragment = ahdVar != null ? ahdVar.getFragment() : null;
        if (jSONObject != null) {
            if (z) {
                str = String.valueOf(SystemClock.elapsedRealtime());
            } else {
                str = qrf.m(jSONObject.getJSONObject("exParams"), RateInfoV2.KEY_CLICK_TIME_MS, String.valueOf(SystemClock.elapsedRealtime()));
            }
            if (fragment instanceof RateFeedsWeexFragment) {
                JSONObject g = g(jSONObject);
                String f = f(g, jSONObject);
                qbv j = qbv.j();
                ckf.f(j, "UltronTradeHybridManager.getInstance()");
                String a2 = j.g().a(f, "rateList");
                if (!TextUtils.isEmpty(a2)) {
                    uhn.b("Page_DetailComments2", "Page_DetailComments2_Pre_Request_Cache_Success", RateListPreRequestManager.Companion.b());
                } else {
                    uhn.b("Page_DetailComments2", "Page_DetailComments2_Pre_Request_Cache_Failed", RateListPreRequestManager.Companion.b());
                }
                boolean b = pgn.INSTANCE.b();
                if (b) {
                    h(a2);
                }
                boolean i = UltronTradeHybridSwitcherHelper.i("detail", "");
                if (!n9l.INSTANCE.i() || !i) {
                    z2 = false;
                }
                boolean d = xgn.INSTANCE.d();
                if (z2) {
                    i(g, f, UltronTradeHybridStage.ON_NAV);
                }
                String str3 = f10378a;
                Object m = qbv.j().m(str3);
                if (m instanceof com.taobao.android.weex_framework.a) {
                    aVar = (com.taobao.android.weex_framework.a) m;
                }
                boolean g2 = lbv.g(aVar);
                if (g2) {
                    Uri.Builder buildUpon = Uri.parse(str3).buildUpon();
                    buildUpon.appendQueryParameter("jt_pt_navStartTime", str);
                    buildUpon.appendQueryParameter("skipTradeHybridContainerUt", "true");
                    for (String str4 : jSONObject.keySet()) {
                        buildUpon.appendQueryParameter(str4, jSONObject.getString(str4));
                    }
                    str2 = buildUpon.build().toString();
                    ckf.f(str2, "uriBuilder.build().toString()");
                } else {
                    String str5 = str3 + "&preRequestUniqueKey=" + f + "&enablePreRequest=" + z2 + "&enableDetailPreRequest=" + d + "&jt_pt_navStartTime=" + str + "&skipTradeHybridContainerUt=true&enableImagePreloadInNav=" + b;
                    aVar = com.alibaba.android.ultron.vfw.weex2.a.g().d(Globals.getApplication(), str5, UltronTradeHybridInstanceRenderMode.UNSPECIFIC);
                    ((RateFeedsWeexFragment) fragment).Q3(jSONObject);
                    str2 = str5;
                }
                a((RateFeedsWeexFragment) fragment, str2, aVar, g2);
            }
        }
    }

    public final void h(String str) {
        String h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("744e7774", new Object[]{this, str});
            return;
        }
        JSONObject parseObject = JSON.parseObject(str);
        if (parseObject != null) {
            JSONObject jSONObject = null;
            JSONArray f = srf.f("rateList", parseObject, null);
            if (f != null && !f.isEmpty()) {
                JSONObject g = srf.g("extraInfo", parseObject, null);
                String str2 = "0";
                if (g != null) {
                    if (!g.isEmpty()) {
                        jSONObject = g;
                    }
                    if (!(jSONObject == null || (h = srf.h("imageStyle", jSONObject, str2)) == null)) {
                        str2 = h;
                    }
                }
                JSONObject jSONObject2 = f.getJSONObject(0);
                if (jSONObject2 != null) {
                    Pair<JSONArray, Integer> a2 = orm.INSTANCE.a(jSONObject2);
                    Object obj = a2.first;
                    ckf.f(obj, "result.first");
                    JSONArray jSONArray = (JSONArray) obj;
                    int i = (((Integer) a2.second).intValue() > 2 || str2 != "2") ? 220 : 320;
                    if (!jSONArray.isEmpty()) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(ccv.PARAM_PREFETCH_IMG_LIST, (Object) jSONArray);
                        jSONObject3.put(ccv.PARAM_PREFETCH_IMG_SIZE, (Object) Integer.valueOf(zhn.E(i)));
                        jSONObject3.put(ccv.PARAM_PREFETCH_IGNORE_DISK, (Object) "true");
                        jSONObject3.put(ccv.PARAM_PREFETCH_IMG_QUALITY, (Object) "q75");
                        qbv.j().a(UltronTradeHybridStage.ON_TOUCH_DOWN, "detail", jSONObject3);
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.alibaba.fastjson.JSONObject g(com.alibaba.fastjson.JSONObject r27) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.detail.rate.vivid.utils.WeexUtils.g(com.alibaba.fastjson.JSONObject):com.alibaba.fastjson.JSONObject");
    }
}
