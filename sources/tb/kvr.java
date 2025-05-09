package tb;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.TBShopPageType;
import com.taobao.tao.shop.common.ShopConstants;
import com.taobao.tao.shop.fetcher.TBSRUrlProcessFetcher;
import com.taobao.tao.shop.rule.mtop.MtopTaobaoWirelessShopRouteProcessResponseData;
import com.taobao.utils.Global;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class kvr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SHOP_RULE_PROCESSED = "com.taobao.tao.shop.rule.processed";
    public static volatile kvr c;
    public static qvr d;
    public static TBSRUrlProcessFetcher e;

    /* renamed from: a  reason: collision with root package name */
    public ovd f22952a;
    public Boolean b = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b extends AsyncTask<Void, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22954a;
        public final /* synthetic */ String b;

        public b(String str, String str2) {
            this.f22954a = str;
            this.b = str2;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/shop/TBSREngine$2");
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("6194eca6", new Object[]{this, voidArr});
            }
            kvr.e(kvr.this, this.f22954a, this.b);
            return null;
        }
    }

    static {
        t2o.a(668991497);
    }

    public kvr(Context context) {
        d = new qvr();
        e = new TBSRUrlProcessFetcher(context);
    }

    public static /* synthetic */ void a(kvr kvrVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af200648", new Object[]{kvrVar, str});
        } else {
            kvrVar.v(str);
        }
    }

    public static /* synthetic */ void b(kvr kvrVar, TBShopPageType tBShopPageType, String str, String str2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bf164d8", new Object[]{kvrVar, tBShopPageType, str, str2, bundle});
        } else {
            kvrVar.g(tBShopPageType, str, str2, bundle);
        }
    }

    public static /* synthetic */ void c(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("727619e7", new Object[]{str, str2, new Boolean(z)});
        } else {
            q(str, str2, z);
        }
    }

    public static /* synthetic */ qvr d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qvr) ipChange.ipc$dispatch("d80b8872", new Object[0]);
        }
        return d;
    }

    public static /* synthetic */ void e(kvr kvrVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ed3d916", new Object[]{kvrVar, str, str2});
        } else {
            kvrVar.h(str, str2);
        }
    }

    public static Uri i(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("c3b8779f", new Object[]{uri});
        }
        int i = lvr.c;
        if (i == 1) {
            String host = uri.getHost();
            if (host == null || !host.contains(".wapa.")) {
                return uri;
            }
            String[] split = host.split("\\.");
            split[1] = "m";
            StringBuilder sb = new StringBuilder();
            for (String str : split) {
                sb.append(str);
                sb.append(".");
            }
            String sb2 = sb.toString();
            return Uri.parse(uri.toString().replace(uri.getHost(), sb2.substring(0, sb2.length() - 1)));
        } else if (i != 2) {
            return uri;
        } else {
            String host2 = uri.getHost();
            if (host2 == null || !host2.contains(".waptest.")) {
                return uri;
            }
            String[] split2 = host2.split("\\.");
            split2[1] = "m";
            StringBuilder sb3 = new StringBuilder();
            for (String str2 : split2) {
                sb3.append(str2);
                sb3.append(".");
            }
            String sb4 = sb3.toString();
            return Uri.parse(uri.toString().replace(uri.getHost(), sb4.substring(0, sb4.length() - 1)));
        }
    }

    public static kvr j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kvr) ipChange.ipc$dispatch("7247b7a7", new Object[]{context});
        }
        if (c == null) {
            synchronized (kvr.class) {
                try {
                    if (c == null) {
                        c = new kvr(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public static boolean m(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4cc9f4e0", new Object[]{uri})).booleanValue();
        }
        Map<String, String> g = iio.g(uri);
        if (g == null || !g.containsKey(SHOP_RULE_PROCESSED)) {
            return false;
        }
        return true;
    }

    public static String p(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("703f426b", new Object[]{uri});
        }
        if (uri == null) {
            return null;
        }
        Uri i = i(uri);
        if (z(i)) {
            mvr.d("matchedUrl url should ignore   ->   return false");
            return null;
        } else if (m(i)) {
            mvr.d("matchedUrl url isProcessed   ->   return false");
            return null;
        } else {
            TBSRUrlProcessFetcher tBSRUrlProcessFetcher = e;
            if (tBSRUrlProcessFetcher == null) {
                return null;
            }
            MtopTaobaoWirelessShopRouteProcessResponseData f = tBSRUrlProcessFetcher.f(i.toString());
            if (f != null && jvr.p().y() && f.isMiniAppRenderStyle()) {
                f = null;
            }
            if (f == null || TextUtils.isEmpty(f.getShopTargetUrl())) {
                i.toString();
                Log.e("TBSREngine main-cost", "shortcut url NOT matched");
                AppMonitor.Alarm.commitFail("Shop", ShopConstants.POINT_SHOP_SHORTCUT, ShopConstants.ARG_SHOP_NAV_ONCE, "-1", ShopConstants.ALL_WEEX_MONITOR_ERROR_MSG);
                return null;
            }
            String a2 = jyr.a(f.getShopTargetUrl());
            i.toString();
            Log.e("TBSREngine main-cost", "shortcut matched");
            AppMonitor.Alarm.commitSuccess("Shop", ShopConstants.POINT_SHOP_SHORTCUT, ShopConstants.ARG_SHOP_NAV_ONCE);
            d.a(f, ShopConstants.V_SHOP_RULESET_SHOP);
            return a2;
        }
    }

    public static void q(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1559bae0", new Object[]{str, str2, new Boolean(z)});
            return;
        }
        try {
            boolean equals = "true".equals(Uri.parse(str).getQueryParameter("matchAbsolutelyShopRule"));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("match3Rules", (Object) Boolean.valueOf(equals));
            jSONObject.put("goToShopFrame", (Object) Boolean.valueOf(z));
            jSONObject.put("routeUrl", (Object) str);
            jSONObject.put("industryShop", (Object) str2);
            jSONObject.put("isNativeFrameWork", (Object) Boolean.FALSE);
            qpp.a("Shop", "route", jSONObject, new JSONObject());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void f(StringBuilder sb, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2f3e824", new Object[]{this, sb, new Boolean(z)});
        } else if (z) {
            sb.append("&");
            sb.append(SHOP_RULE_PROCESSED);
            sb.append("=true");
        } else {
            sb.append("?");
            sb.append(SHOP_RULE_PROCESSED);
            sb.append("=true");
        }
    }

    public final boolean l() {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a59fb54", new Object[]{this})).booleanValue();
        }
        Boolean bool = this.b;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            if ((Global.getApplication().getApplicationInfo().flags & 2) == 0) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            this.b = valueOf;
            return valueOf.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0130, code lost:
        if (r8.equals("NEED_PROCESS") == false) goto L_0x0112;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean o(java.lang.String r13, java.lang.String r14, android.content.Context r15) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.kvr.o(java.lang.String, java.lang.String, android.content.Context):boolean");
    }

    public final void r(Uri uri, String str, TBShopPageType tBShopPageType, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4ebd681", new Object[]{this, uri, str, tBShopPageType, str2});
            return;
        }
        String k = k(uri, str);
        if (TextUtils.isEmpty(k)) {
            mvr.c("performAssembleUrl()   ->  TextUtils.isEmpty(targetUrl)");
        } else {
            g(tBShopPageType, k, str2, null);
        }
    }

    public final void s(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7c4c8c4", new Object[]{this, str, str2, new Long(j)});
            return;
        }
        mvr.a("perform mtop url : " + str);
        Log.e("tbsr", "perform mtop url : " + str);
        if (ShopConstants.V_SHOP_RULESET_SHOP.equals(str2)) {
            Uri parse = Uri.parse(str);
            boolean equals = "true".equals(iio.k(iio.g(parse), ShopConstants.K_JUMP_LOFT));
            String queryParameter = parse.getQueryParameter("shopDirectType");
            if ("new".equals(queryParameter)) {
                if (equals) {
                    String e2 = iio.e(str);
                    if (TextUtils.isEmpty(e2)) {
                        v(str);
                    } else {
                        g(TBShopPageType.SHOP_PAGE_NEW_LOFT, e2, str, null);
                    }
                } else {
                    v(str);
                }
            } else if (!"old".equals(queryParameter)) {
                t(str, str2, j, false);
            } else if (jvr.p().b()) {
                t(str, str2, j, false);
            } else {
                String k = k(parse, "http://shop.m.taobao.com/shophomepage/index.htm");
                if (TextUtils.isEmpty(k)) {
                    v(str);
                } else if (equals) {
                    g(TBShopPageType.SHOP_PAGE_OLD_LOFT, k, str, null);
                } else {
                    g(TBShopPageType.SHOP_PAGE_OLD_HOME, k, str, null);
                }
            }
        } else {
            t(str, str2, j, false);
        }
    }

    public final void u(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a98cf1e2", new Object[]{this, str, str2, new Long(j)});
        } else {
            t(str, str2, j, true);
        }
    }

    public final Map<String, String> w(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c455507a", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap();
        if (str == null || !str.contains("?")) {
            return hashMap;
        }
        int indexOf = str.indexOf("?") + 1;
        do {
            int indexOf2 = str.indexOf(38, indexOf);
            if (indexOf2 == -1) {
                indexOf2 = str.length();
            }
            int indexOf3 = str.indexOf(61, indexOf);
            if (indexOf3 > indexOf2 || indexOf3 == -1) {
                indexOf3 = indexOf2;
            }
            if (indexOf3 > indexOf) {
                String substring = str.substring(indexOf, indexOf3);
                int i = indexOf3 + 1;
                if (i <= indexOf2) {
                    str2 = str.substring(i, indexOf2);
                } else {
                    str2 = "";
                }
                hashMap.put(Uri.decode(substring), Uri.decode(str2));
            }
            indexOf = indexOf2 + 1;
        } while (indexOf < str.length());
        return hashMap;
    }

    public void x(nvd nvdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96d07180", new Object[]{this, nvdVar});
        } else {
            d.b(nvdVar);
        }
    }

    public void y(ovd ovdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f0df19c", new Object[]{this, ovdVar});
        } else {
            this.f22952a = ovdVar;
        }
    }

    public final void g(TBShopPageType tBShopPageType, String str, String str2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a5df14", new Object[]{this, tBShopPageType, str, str2, bundle});
            return;
        }
        mvr.c("router callback   type=" + tBShopPageType + ",  targetUrl=" + str + ",  originUrl=" + str2);
        if (this.f22952a != null) {
            if (TextUtils.isEmpty(str)) {
                this.f22952a.a(TBShopPageType.SHOP_PAGE_PROCESSED_ERROR, str2, bundle);
                return;
            }
            this.f22952a.a(tBShopPageType, str, bundle);
            this.f22952a = null;
            if (l() || kh4.b("shop_render", "compare_actual_url", false)) {
                new b(str2, str).execute(new Void[0]);
            }
        }
    }

    public final void v(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("349392aa", new Object[]{this, str});
            return;
        }
        StringBuilder sb = new StringBuilder();
        boolean contains = str.contains("?");
        if (str.contains("#")) {
            int indexOf = str.indexOf("#");
            if (!contains || indexOf > str.indexOf("?")) {
                str2 = str.substring(indexOf);
                str = str.substring(0, indexOf);
                sb.append(str);
                f(sb, contains);
                sb.append(str2);
                mvr.c("procPersonalShop： " + sb.toString());
                g(TBShopPageType.SHOP_PAGE_PROCESSED_ERROR, sb.toString(), str, null);
            }
        }
        str2 = "";
        sb.append(str);
        f(sb, contains);
        sb.append(str2);
        mvr.c("procPersonalShop： " + sb.toString());
        g(TBShopPageType.SHOP_PAGE_PROCESSED_ERROR, sb.toString(), str, null);
    }

    public static boolean z(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b883e35f", new Object[]{uri})).booleanValue();
        }
        Map<String, String> g = iio.g(uri);
        return g != null && g.containsKey("shop_router_ignore") && Boolean.TRUE.toString().equals(g.get("shop_router_ignore"));
    }

    public final String k(Uri uri, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f0da3de", new Object[]{this, uri, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String trim = str.trim();
        Map<String, String> g = iio.g(uri);
        StringBuilder sb = new StringBuilder();
        String uri2 = uri.toString();
        boolean contains = uri2.contains("?");
        boolean contains2 = uri2.contains("#");
        int indexOf = uri2.indexOf("#");
        int indexOf2 = uri2.indexOf("?");
        if (!contains2 || (contains && indexOf <= indexOf2)) {
            str2 = "";
        } else {
            str2 = uri2.substring(indexOf);
            uri2 = uri2.substring(0, indexOf);
        }
        sb.append(uri2);
        f(sb, contains);
        if (g != null && !TextUtils.isEmpty(g.get("shop_id"))) {
            sb.append("&shop_id=");
            sb.append(g.get("shop_id"));
        }
        sb.append(str2);
        String sb2 = sb.toString();
        boolean contains3 = sb2.contains("?");
        int indexOf3 = sb2.indexOf("?");
        boolean contains4 = sb2.contains("#");
        int indexOf4 = sb2.indexOf("#");
        sb.setLength(0);
        if (contains4 && contains3) {
            indexOf3 = Math.min(indexOf3, indexOf4);
        } else if (contains4) {
            indexOf3 = indexOf4;
        } else if (!contains3) {
            indexOf3 = sb2.length();
        }
        if (trim.contains("?")) {
            sb.append(trim);
            sb.append("&");
            sb.append(sb2.substring(indexOf3 + 1));
        } else {
            sb.append(trim);
            sb.append(sb2.substring(indexOf3));
        }
        return sb.toString();
    }

    public final boolean n(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63cc036a", new Object[]{this, str, str2})).booleanValue();
        }
        Map<String, String> w = w(str);
        Map<String, String> w2 = w(str2);
        for (String str3 : w.keySet()) {
            if (!"pre_item_id".equals(str3) && !"currentClickTime".equals(str3)) {
                String str4 = w.get(str3);
                String str5 = w2.get(str3);
                if (!(str4 == null || str4.equals(str5))) {
                    return false;
                }
                if (str4 == null && str5 != null) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(java.lang.String r16, java.lang.String r17, long r18, boolean r20) {
        /*
            r15 = this;
            r11 = r17
            r12 = r20
            com.android.alibaba.ip.runtime.IpChange r0 = tb.kvr.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x002e
            java.lang.Long r1 = new java.lang.Long
            r4 = r18
            r1.<init>(r4)
            java.lang.Boolean r2 = new java.lang.Boolean
            r2.<init>(r12)
            r3 = 5
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r15
            r4 = 1
            r3[r4] = r16
            r4 = 2
            r3[r4] = r11
            r4 = 3
            r3[r4] = r1
            r1 = 4
            r3[r1] = r2
            java.lang.String r1 = "8483b0c3"
            r0.ipc$dispatch(r1, r3)
            return
        L_0x002e:
            r4 = r18
            boolean r0 = tb.pvr.a(r17)
            if (r0 == 0) goto L_0x003a
            r15.v(r16)
            return
        L_0x003a:
            tb.jvr r0 = tb.jvr.p()
            boolean r9 = r0.k()
            android.net.Uri r0 = android.net.Uri.parse(r16)
            java.lang.String r1 = "shopUtParamUrl"
            java.lang.String r8 = r0.getQueryParameter(r1)
            if (r9 == 0) goto L_0x0092
            if (r8 == 0) goto L_0x008e
            android.net.Uri$Builder r2 = r0.buildUpon()     // Catch: all -> 0x007b
            r2.clearQuery()     // Catch: all -> 0x007b
            java.util.Set r3 = r0.getQueryParameterNames()     // Catch: all -> 0x007b
            java.util.Iterator r3 = r3.iterator()     // Catch: all -> 0x007b
        L_0x0060:
            boolean r6 = r3.hasNext()     // Catch: all -> 0x007b
            if (r6 == 0) goto L_0x007d
            java.lang.Object r6 = r3.next()     // Catch: all -> 0x007b
            java.lang.String r6 = (java.lang.String) r6     // Catch: all -> 0x007b
            boolean r7 = r1.equals(r6)     // Catch: all -> 0x007b
            if (r7 == 0) goto L_0x0073
            goto L_0x0060
        L_0x0073:
            java.lang.String r7 = r0.getQueryParameter(r6)     // Catch: all -> 0x007b
            r2.appendQueryParameter(r6, r7)     // Catch: all -> 0x007b
            goto L_0x0060
        L_0x007b:
            r0 = move-exception
            goto L_0x0086
        L_0x007d:
            android.net.Uri r0 = r2.build()     // Catch: all -> 0x007b
            java.lang.String r0 = r0.toString()     // Catch: all -> 0x007b
            goto L_0x0090
        L_0x0086:
            java.lang.String r0 = r0.getMessage()
            tb.mvr.a(r0)
            goto L_0x0092
        L_0x008e:
            r0 = r16
        L_0x0090:
            r13 = r0
            goto L_0x0094
        L_0x0092:
            r13 = r16
        L_0x0094:
            if (r12 != 0) goto L_0x00b1
            android.app.Application r0 = com.taobao.utils.Global.getApplication()     // Catch: all -> 0x00a9
            androidx.localbroadcastmanager.content.LocalBroadcastManager r0 = androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(r0)     // Catch: all -> 0x00a9
            android.content.Intent r1 = new android.content.Intent     // Catch: all -> 0x00a9
            java.lang.String r2 = "SHOP_ROUTE_HIT"
            r1.<init>(r2)     // Catch: all -> 0x00a9
            r0.sendBroadcastSync(r1)     // Catch: all -> 0x00a9
            goto L_0x00b1
        L_0x00a9:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            tb.mvr.a(r0)
        L_0x00b1:
            long r6 = java.lang.System.currentTimeMillis()
            com.taobao.tao.shop.fetcher.TBSRUrlProcessFetcher r0 = tb.kvr.e
            tb.kvr$a r14 = new tb.kvr$a
            r1 = r14
            r2 = r15
            r3 = r17
            r4 = r18
            r10 = r20
            r1.<init>(r3, r4, r6, r8, r9, r10)
            r0.j(r13, r11, r14, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.kvr.t(java.lang.String, java.lang.String, long, boolean):void");
    }

    public final void h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70be9bb7", new Object[]{this, str, str2});
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (!(str == null || str2 == null)) {
                Uri parse = Uri.parse(str);
                String queryParameter = parse.getQueryParameter("user_id");
                String queryParameter2 = parse.getQueryParameter("item_id");
                String queryParameter3 = parse.getQueryParameter("currentClickTime");
                StringBuilder sb = new StringBuilder("https://market.m.taobao.com/apps/market/shop/weex.html?wh_weex=true&wx_navbar_transparent=true&sellerId=");
                sb.append(queryParameter);
                sb.append("&data_prefetch=true&item_id=");
                sb.append(queryParameter2);
                sb.append("&wx_navbar_hidden=true&isShopToPopLayerSDK=true");
                if (!TextUtils.isEmpty(queryParameter3)) {
                    sb.append("&currentClickTime=");
                    sb.append(queryParameter3);
                }
                sb.append("&pre_item_id=");
                sb.append(queryParameter2);
                String sb2 = sb.toString();
                String queryParameter4 = Uri.parse(str2).getQueryParameter("shopId");
                HashMap hashMap = new HashMap();
                hashMap.put("sellerId", queryParameter);
                hashMap.put("shopId", queryParameter4);
                hashMap.put("localUrl", sb2);
                hashMap.put("originalUrl", str);
                hashMap.put("actualUrl", str2);
                hashMap.put("uuid", UUID.randomUUID().toString());
                int indexOf = str2.indexOf("&shopId=");
                int indexOf2 = str2.indexOf("&", 1 + indexOf);
                if (indexOf <= 0 || indexOf2 <= 0) {
                    hashMap.put("cost", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    pdv.a(fdv.F_DATA_PROCESS, queryParameter, hashMap, "-23229", "route_local_compare_not_contains_shopId");
                    return;
                }
                String str3 = str2.substring(0, indexOf) + str2.substring(indexOf2);
                hashMap.put("actualUrl2", str3);
                String valueOf = String.valueOf(System.currentTimeMillis() - currentTimeMillis);
                hashMap.put("cost", valueOf);
                if (str3.equals(sb2)) {
                    pdv.b(fdv.F_DATA_PROCESS, queryParameter, hashMap);
                    mvr.c("route_local_compare matched. cost " + valueOf + " ms.");
                } else if (n(str3, sb2)) {
                    pdv.a(fdv.F_DATA_PROCESS, queryParameter, hashMap, "-23002", "route_local_compare_not_match");
                    mvr.c("route_local_compare NOT matched but similar. cost " + valueOf + " ms. remote: " + str3 + " local:" + sb2);
                } else {
                    pdv.a(fdv.F_DATA_PROCESS, queryParameter, hashMap, "-23001", "route_local_compare_not_match");
                    mvr.c("route_local_compare NOT matched. cost " + valueOf + " ms. remote: " + str3 + " local:" + sb2);
                }
            }
        } catch (Throwable unused) {
            pdv.a(fdv.F_DATA_PROCESS, "", null, "-23228", "route_local_compare_exception");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements svr<MtopTaobaoWirelessShopRouteProcessResponseData> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22953a;
        public final /* synthetic */ long b;
        public final /* synthetic */ long c;
        public final /* synthetic */ String d;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ boolean f;

        public a(String str, long j, long j2, String str2, boolean z, boolean z2) {
            this.f22953a = str;
            this.b = j;
            this.c = j2;
            this.d = str2;
            this.e = z;
            this.f = z2;
        }

        public void a(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fa5cc758", new Object[]{this, str, new Boolean(z)});
            } else {
                kvr.a(kvr.this, str);
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
            if (r9.equals(com.taobao.tao.shop.common.ShopConstants.V_SHOP_RULESET_PERSONAL) == false) goto L_0x0038;
         */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void c(java.lang.String r17, com.taobao.tao.shop.rule.mtop.MtopTaobaoWirelessShopRouteProcessResponseData r18) {
            /*
                Method dump skipped, instructions count: 476
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.kvr.a.c(java.lang.String, com.taobao.tao.shop.rule.mtop.MtopTaobaoWirelessShopRouteProcessResponseData):void");
        }
    }
}
