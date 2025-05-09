package com.alibaba.android.ultron.vfw.weex2.highPerformance.factory;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.JvmStatic;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ckf;
import tb.hav;
import tb.lbv;
import tb.m8v;
import tb.nbv;
import tb.njg;
import tb.p9b;
import tb.pbv;
import tb.s5e;
import tb.t2o;
import tb.v9v;
import tb.wsq;
import tb.xhv;
import tb.yz3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class TradeHybridDataFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TradeHybridDataFactory INSTANCE = new TradeHybridDataFactory();

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<String, MtopResponse> f2368a = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, com.taobao.android.weex_framework.a> b = new ConcurrentHashMap<>();
    public static final njg c = kotlin.a.b(TradeHybridDataFactory$hitRequestPathList$2.INSTANCE);
    public static final njg d = kotlin.a.b(TradeHybridDataFactory$hitRequestQueryMap$2.INSTANCE);
    public static final njg e = kotlin.a.b(TradeHybridDataFactory$supplementRequestQueryMap$2.INSTANCE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a implements s5e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.s5e
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb8b0117", new Object[]{this, str, str2});
                return;
            }
            ckf.g(str, "errorCode");
            ckf.g(str2, "errorMsg");
        }

        @Override // tb.s5e
        public void b(boolean z, JSONObject jSONObject, MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c0c15975", new Object[]{this, new Boolean(z), jSONObject, mtopResponse});
            } else {
                TradeHybridDataFactory.d(TradeHybridDataFactory.INSTANCE, z, jSONObject, mtopResponse);
            }
        }

        @Override // tb.s5e
        public void onSuccess(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("980108a5", new Object[]{this, jSONObject});
            } else {
                ckf.g(jSONObject, "data");
            }
        }
    }

    static {
        t2o.a(157286812);
    }

    public static final /* synthetic */ List a(TradeHybridDataFactory tradeHybridDataFactory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5f92459a", new Object[]{tradeHybridDataFactory});
        }
        return tradeHybridDataFactory.n();
    }

    public static final /* synthetic */ JSONObject b(TradeHybridDataFactory tradeHybridDataFactory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bc2c883c", new Object[]{tradeHybridDataFactory});
        }
        return tradeHybridDataFactory.o();
    }

    public static final /* synthetic */ JSONObject c(TradeHybridDataFactory tradeHybridDataFactory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1cb10135", new Object[]{tradeHybridDataFactory});
        }
        return tradeHybridDataFactory.p();
    }

    public static final /* synthetic */ void d(TradeHybridDataFactory tradeHybridDataFactory, boolean z, JSONObject jSONObject, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe96e172", new Object[]{tradeHybridDataFactory, new Boolean(z), jSONObject, mtopResponse});
        } else {
            tradeHybridDataFactory.w(z, jSONObject, mtopResponse);
        }
    }

    @JvmStatic
    public static final boolean e(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c03db7", new Object[]{str, jSONObject})).booleanValue();
        }
        if (str != null) {
            try {
                if (!(str.length() == 0 || jSONObject == null || jSONObject.isEmpty())) {
                    Uri parse = Uri.parse(str);
                    ckf.f(parse, "Uri.parse(url)");
                    String path = parse.getPath();
                    if (!(path == null || path.length() == 0 || !jSONObject.containsKey(path))) {
                        Object obj = jSONObject.get(path);
                        if ((obj instanceof JSONArray) && !((JSONArray) obj).isEmpty()) {
                            Iterator<Object> it = ((JSONArray) obj).iterator();
                            while (it.hasNext()) {
                                Object next = it.next();
                                if ((next instanceof String) && ((CharSequence) next).length() != 0 && wsq.O(str, (CharSequence) next, false, 2, null)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @JvmStatic
    public static final void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be0071da", new Object[]{str});
            return;
        }
        String r = r(str);
        if (r == null || r.length() == 0) {
            f2368a.clear();
            b.clear();
            return;
        }
        f2368a.remove(r);
        b.remove(r);
    }

    @JvmStatic
    public static final String r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2539e962", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        return lbv.e(str, "preRequestUniqueKey");
    }

    @JvmStatic
    public static final boolean u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dc3769a", new Object[]{str})).booleanValue();
        }
        return e(str, INSTANCE.m());
    }

    @JvmStatic
    public static final void y(String str, String str2, pbv pbvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa42201f", new Object[]{str, str2, pbvVar});
            return;
        }
        ckf.g(str, "url");
        ckf.g(pbvVar, "mtopModel");
        try {
            TradeHybridDataFactory tradeHybridDataFactory = INSTANCE;
            if (tradeHybridDataFactory.v(str)) {
                String r = r(str);
                if (!(r == null || r.length() == 0)) {
                    f2368a.remove(r);
                    b.remove(r);
                    p9b.a aVar = p9b.Companion;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("preRequestUniqueKey", (Object) r);
                    xhv xhvVar = xhv.INSTANCE;
                    aVar.p(pbvVar, jSONObject, str2, false, new a());
                    return;
                }
                tradeHybridDataFactory.x(str.concat(", uniqueKey is empty"));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            m8v.a(e2);
        }
    }

    @JvmStatic
    public static final boolean z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12d2884d", new Object[]{str})).booleanValue();
        }
        return e(str, INSTANCE.q());
    }

    public final void i(boolean z, com.taobao.android.weex_framework.a aVar, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe33d363", new Object[]{this, new Boolean(z), aVar, mtopResponse});
        } else {
            g(z, aVar, mtopResponse);
        }
    }

    public final List<String> l() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("6dde44cb", new Object[]{this});
        } else {
            value = c.getValue();
        }
        return (List) value;
    }

    public final JSONObject m() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("60e7adad", new Object[]{this});
        } else {
            value = d.getValue();
        }
        return (JSONObject) value;
    }

    public final List<String> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b15f0fd9", new Object[]{this});
        }
        try {
            String g = v9v.g(UltronTradeHybridSwitcherHelper.ORANGE_KEY_NAV_OPT, "navOptRequestPathList", j());
            if (!(g == null || g.length() == 0)) {
                List<String> parseArray = JSON.parseArray(g, String.class);
                ckf.f(parseArray, "JSON.parseArray(pathListStr, String::class.java)");
                return parseArray;
            }
            return yz3.i();
        } catch (Throwable th) {
            x("getHitRequestPathList: " + th);
            return yz3.i();
        }
    }

    public final JSONObject o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fbb0a05f", new Object[]{this});
        }
        try {
            String g = v9v.g(UltronTradeHybridSwitcherHelper.ORANGE_KEY_NAV_OPT, "navOptRequestQueryMap", k());
            if (!(g == null || g.length() == 0)) {
                JSONObject parseObject = JSON.parseObject(g);
                if (parseObject != null && !parseObject.isEmpty()) {
                    return parseObject;
                }
                return new JSONObject();
            }
            return new JSONObject();
        } catch (Throwable th) {
            x("getHitRequestPathList: " + th);
            return new JSONObject();
        }
    }

    public final JSONObject p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7b2ebf46", new Object[]{this});
        }
        try {
            String g = v9v.g(UltronTradeHybridSwitcherHelper.ORANGE_KEY_NAV_OPT, "navOptSupplementRequestQueryMap", "");
            if (!(g == null || g.length() == 0)) {
                JSONObject parseObject = JSON.parseObject(g);
                if (parseObject != null && !parseObject.isEmpty()) {
                    return parseObject;
                }
                return new JSONObject();
            }
            return new JSONObject();
        } catch (Throwable th) {
            x("getSupplementRequestQueryMap: " + th);
            return new JSONObject();
        }
    }

    public final JSONObject q() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("fad5541b", new Object[]{this});
        } else {
            value = e.getValue();
        }
        return (JSONObject) value;
    }

    public final boolean t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1bd33b3", new Object[]{this, str})).booleanValue();
        }
        ckf.g(str, "url");
        return TextUtils.equals(lbv.e(str, "navAsyncPrerequest"), "true");
    }

    public final boolean v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36f417b4", new Object[]{this, str})).booleanValue();
        }
        if (str == null || str.length() == 0 || !s(str)) {
            return false;
        }
        return t(str);
    }

    public final void x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dd48c5", new Object[]{this, str});
        } else {
            nbv.a(nbv.a.a("TradeHybridDataError").success(false).message(str).sampling(0.01f));
        }
    }

    @JvmStatic
    public static final void h(com.taobao.android.weex_framework.a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7157fe9", new Object[]{aVar, str});
            return;
        }
        ckf.g(aVar, "instance");
        ckf.g(str, "uniqueKey");
        try {
            MtopResponse remove = f2368a.remove(str);
            if (!(remove instanceof MtopResponse)) {
                b.put(str, aVar);
                hav.g("TradeHybridDataFactory", "dispatchEventToWeexInRender:", "mtopResponse not return, cache instance");
                return;
            }
            INSTANCE.g(true, aVar, remove);
        } catch (Exception e2) {
            e2.printStackTrace();
            m8v.a(e2);
            hav.g("TradeHybridDataFactory", "dispatchEventToWeex:", "exception: " + e2);
        }
    }

    public final String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a7fced16", new Object[]{this});
        }
        if (!v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_NAV_OPT, "enableRequestDefaultList", true)) {
            return "";
        }
        return "[\"/app/mtb/logisticsV2/detail\"]";
    }

    public final String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43351b27", new Object[]{this});
        }
        if (!v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_NAV_OPT, "enableRequestDefaultList", true)) {
            return "";
        }
        return "{\"/app/mtb/logisticsV2/detail\": [\"sourceFrom=MY_EXPRESS\"]}";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(boolean r8, com.taobao.android.weex_framework.a r9, mtopsdk.mtop.domain.MtopResponse r10) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.alibaba.android.ultron.vfw.weex2.highPerformance.factory.TradeHybridDataFactory.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0020
            java.lang.Boolean r3 = new java.lang.Boolean
            r3.<init>(r8)
            r8 = 4
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r1] = r7
            r8[r0] = r3
            r0 = 2
            r8[r0] = r9
            r9 = 3
            r8[r9] = r10
            java.lang.String r9 = "749cca95"
            r2.ipc$dispatch(r9, r8)
            return
        L_0x0020:
            r2 = 0
            byte[] r3 = r10.getBytedata()     // Catch: Exception -> 0x0036
            if (r3 == 0) goto L_0x0038
            java.nio.charset.Charset r4 = java.nio.charset.Charset.defaultCharset()     // Catch: Exception -> 0x0036
            java.lang.String r5 = "Charset.defaultCharset()"
            tb.ckf.f(r4, r5)     // Catch: Exception -> 0x0036
            java.lang.String r5 = new java.lang.String     // Catch: Exception -> 0x0036
            r5.<init>(r3, r4)     // Catch: Exception -> 0x0036
            goto L_0x0039
        L_0x0036:
            r0 = move-exception
            goto L_0x004b
        L_0x0038:
            r5 = r2
        L_0x0039:
            com.alibaba.fastjson.JSONObject r3 = com.alibaba.fastjson.JSON.parseObject(r5)     // Catch: Exception -> 0x0036
            if (r3 == 0) goto L_0x0045
            java.lang.String r4 = "data"
            com.alibaba.fastjson.JSONObject r2 = r3.getJSONObject(r4)     // Catch: Exception -> 0x0036
        L_0x0045:
            if (r2 == 0) goto L_0x0048
            goto L_0x0049
        L_0x0048:
            r0 = 0
        L_0x0049:
            r1 = r0
            goto L_0x0051
        L_0x004b:
            r0.printStackTrace()     // Catch: Exception -> 0x0072
            tb.m8v.a(r0)     // Catch: Exception -> 0x0072
        L_0x0051:
            com.taobao.android.weex_framework.common.MUSEventTarget r0 = com.taobao.android.weex_framework.common.MUSEventTarget.MUS_DOCUMENT_TARGET     // Catch: Exception -> 0x0072
            java.lang.String r3 = "preload.background"
            com.alibaba.fastjson.JSONObject r4 = new com.alibaba.fastjson.JSONObject     // Catch: Exception -> 0x0072
            r4.<init>()     // Catch: Exception -> 0x0072
            java.lang.String r5 = "responseData"
            java.lang.String r6 = ""
            if (r1 == 0) goto L_0x0063
            goto L_0x0064
        L_0x0063:
            r2 = r6
        L_0x0064:
            r4.put(r5, r2)     // Catch: Exception -> 0x0072
            java.lang.String r2 = "result"
            if (r8 == 0) goto L_0x0074
            if (r1 == 0) goto L_0x0074
            java.lang.String r8 = "success"
            goto L_0x0076
        L_0x0072:
            r8 = move-exception
            goto L_0x00a2
        L_0x0074:
            java.lang.String r8 = "fail"
        L_0x0076:
            r4.put(r2, r8)     // Catch: Exception -> 0x0072
            java.lang.String r8 = "ret"
            java.lang.String[] r10 = r10.getRet()     // Catch: Exception -> 0x0072
            if (r10 == 0) goto L_0x0083
            r6 = r10
        L_0x0083:
            r4.put(r8, r6)     // Catch: Exception -> 0x0072
            java.lang.String r8 = "dataType"
            java.lang.String r10 = "navAsyncPrerequest"
            r4.put(r8, r10)     // Catch: Exception -> 0x0072
            tb.xhv r8 = tb.xhv.INSTANCE     // Catch: Exception -> 0x0072
            r9.dispatchEvent(r0, r3, r4)     // Catch: Exception -> 0x0072
            java.lang.String r8 = "TradeHybridDataFactory"
            java.lang.String r9 = "dispatchEvent:"
            java.lang.String r10 = "msg send success"
            java.lang.String[] r9 = new java.lang.String[]{r9, r10}     // Catch: Exception -> 0x0072
            tb.hav.g(r8, r9)     // Catch: Exception -> 0x0072
            goto L_0x00bb
        L_0x00a2:
            r8.printStackTrace()
            tb.m8v.a(r8)
            com.alibaba.android.ultron.vfw.weex2.highPerformance.factory.TradeHybridDataFactory r9 = com.alibaba.android.ultron.vfw.weex2.highPerformance.factory.TradeHybridDataFactory.INSTANCE
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "exception: "
            r10.<init>(r0)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.x(r8)
        L_0x00bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.ultron.vfw.weex2.highPerformance.factory.TradeHybridDataFactory.g(boolean, com.taobao.android.weex_framework.a, mtopsdk.mtop.domain.MtopResponse):void");
    }

    public final boolean s(String str) {
        String str2 = "";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fff20ead", new Object[]{this, str})).booleanValue();
        }
        ckf.g(str, "url");
        try {
            Uri parse = Uri.parse(str);
            ckf.f(parse, "Uri.parse(url)");
            String path = parse.getPath();
            if (path != null) {
                str2 = path;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            m8v.a(e2);
        }
        return !l().isEmpty() && l().contains(str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w(boolean z, JSONObject jSONObject, MtopResponse mtopResponse) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("842e170b", new Object[]{this, new Boolean(z), jSONObject, mtopResponse});
        } else if (jSONObject == null || mtopResponse == null) {
            StringBuilder sb = new StringBuilder("mtopConfig is null? ");
            sb.append(jSONObject == null);
            sb.append(", mtopResponse is null? ");
            if (mtopResponse != null) {
                z2 = false;
            }
            sb.append(z2);
            x(sb.toString());
        } else {
            Object remove = jSONObject.remove("preRequestUniqueKey");
            if (!(remove instanceof String) || ((CharSequence) remove).length() == 0) {
                x("uniqueKey is invalid");
                return;
            }
            com.taobao.android.weex_framework.a aVar = b.get(remove);
            if (aVar == null || aVar.isDestroyed()) {
                f2368a.put(remove, mtopResponse);
            } else {
                i(z, aVar, mtopResponse);
            }
        }
    }
}
