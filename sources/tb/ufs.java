package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.container.PageRenderIntercept;
import com.taobao.android.nav.Nav;
import com.taobao.android.preload.core.task.PreloadTaskEntity;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.message.sp.framework.model.SimpleMessageListData;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo;
import com.taobao.tao.flexbox.layoutmanager.container.SheetContainer;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.flexbox.layoutmanager.view.tabbar.PreloadDelegate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.lgs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ufs {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String H5_CONTENT_DETAIL_PATH = "/app/mtb-guang/guang-detail/home";
    public static final String NATIVE_CONTAINER_HOST = "h5.m.taobao.com";
    public static final String SHORT_VIDEO_PATH = "/app/tb-source-app/video-fullpage/pages/index2";
    public static final String SHORT_VIDEO_TRANSPARENT_PATH = "/video-fullpage/transparent-videolist.html";
    public static final String UGC_URL_REDIRECT = "ugc_url_redirect";

    /* renamed from: a  reason: collision with root package name */
    public static final List<mnj> f29347a;
    public static final List<String> b = Arrays.asList("page_profile", PreloadTaskEntity.PAGE_DETAIL);

    public static void A(Context context, Uri uri) {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d58fba45", new Object[]{context, uri});
            return;
        }
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = c21.i();
        }
        if (activity != null && !activity.isFinishing()) {
            new SheetContainer(activity, uri.toString()).show(activity);
        }
    }

    public static void B(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5d074f7", new Object[]{intent});
        } else if (akt.V1()) {
            intent.removeCategory("com.taobao.intent.category.HYBRID_UI");
            intent.addCategory("android.intent.category.DEFAULT");
        }
    }

    public static Uri C(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("bc705f9d", new Object[]{uri});
        }
        return (!t(uri) || !TextUtils.isEmpty(uri.getQueryParameter("tnodeTime")) || TextUtils.isEmpty(uri.getQueryParameter("tnode"))) ? uri : nwv.a(uri, "tnodeTime", String.valueOf(System.nanoTime()));
    }

    public static Uri D(Uri uri, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("6d6b40fd", new Object[]{uri, new Boolean(z)});
        }
        String path = uri.getPath();
        if (TextUtils.equals(path, H5_CONTENT_DETAIL_PATH) && akt.x()) {
            String queryParameter = uri.getQueryParameter(SimpleMessageListData.SOURCE_NAME_MESSAGE);
            String queryParameter2 = uri.getQueryParameter("from");
            String queryParameter3 = uri.getQueryParameter("source");
            String queryParameter4 = uri.getQueryParameter("type");
            if (TextUtils.isEmpty(queryParameter3)) {
                if (TextUtils.equals(queryParameter, "favList")) {
                    queryParameter3 = "footprint_guangguang";
                } else if (TextUtils.equals(queryParameter2, "mytao")) {
                    queryParameter3 = "member_assistance";
                } else {
                    queryParameter3 = "guangguang";
                }
            }
            if (TextUtils.isEmpty(queryParameter4)) {
                if (TextUtils.equals(queryParameter, "favList")) {
                    queryParameter4 = "guang_std_b";
                } else if (TextUtils.equals(queryParameter2, "mytao")) {
                    queryParameter4 = "member_assistance";
                } else {
                    queryParameter4 = "guangguang";
                }
            }
            String queryParameter5 = uri.getQueryParameter("contentId");
            Uri parse = Uri.parse("https://market.m.taobao.com/app/tb-source-app/video-fullpage/pages/index2");
            HashMap q0 = nwv.q0(uri);
            q0.remove("contentId");
            q0.put("source", queryParameter3);
            q0.put("type", queryParameter4);
            q0.put("id", queryParameter5);
            uri = nwv.i0(parse, q0);
            path = uri.getPath();
        }
        if ("/app/tb-source-app/video-fullpage/pages/index2".equals(uri.getPath())) {
            String encodedQuery = uri.getEncodedQuery();
            String queryParameter6 = uri.getQueryParameter("source");
            String queryParameter7 = uri.getQueryParameter("fullpagevideofromshare");
            String config = OrangeConfig.getInstance().getConfig("ShortVideo", "enableTransparentVideo", "true");
            if (o(queryParameter6) && !"true".equals(queryParameter7) && "true".equals(config) && f()) {
                uri = Uri.parse("https://h5.m.taobao.com/video-fullpage/transparent-videolist.html?" + encodedQuery);
                path = uri.getPath();
            }
        }
        if (!"/app/tb-source-app/video-fullpage/pages/index2".equals(path) && !"/video-fullpage/transparent-videolist.html".equals(path)) {
            return uri;
        }
        if (z && akt.h2(g(), uri, null)) {
            String encodedQuery2 = uri.getEncodedQuery();
            uri = Uri.parse("https://h5.m.taobao.com" + h(uri.getPath().contains("transparent")) + "?" + encodedQuery2);
        }
        return nwv.a(uri, "tnodefullpage", "true");
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a83f5c57", new Object[0])).booleanValue();
        }
        return OrangeConfig.getInstance().getConfig("weitao_switch", "enableTNodeProfile", "true").equals("true");
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6cf8a9f4", new Object[0])).booleanValue();
        }
        return OrangeConfig.getInstance().getConfig("weitao_switch", "enableNewProfileForLive", "true").equals("true");
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bab234eb", new Object[0])).booleanValue();
        }
        return OrangeConfig.getInstance().getConfig("weitao_switch", "enableNewProfileForSecondPage", "true").equals("true") && b();
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("482f68a9", new Object[0])).booleanValue();
        }
        return OrangeConfig.getInstance().getConfig("weitao_switch", "enableNewProfileForVideo", "true").equals("true") && b();
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c0706c5", new Object[0])).booleanValue();
        }
        return akt.e2();
    }

    public static Context g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[0]);
        }
        Context J = o.J();
        if (od0.D().f().a() != null) {
            return od0.D().f().a();
        }
        return J;
    }

    public static String h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6abe5d9", new Object[]{new Boolean(z)});
        }
        if (z) {
            return "/tnode/multipagetransparency/index.htm";
        }
        return "/tnode/multipage/index.htm";
    }

    public static Pair<Uri, Boolean> i(Context context, Uri uri, boolean z, boolean z2, boolean z3) {
        Uri uri2;
        boolean z4 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("ed46c0dd", new Object[]{context, uri, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        }
        Pair<Uri, Boolean> a2 = a(context, uri, z);
        if (a2 == null) {
            return null;
        }
        if (((Boolean) a2.second).booleanValue()) {
            return a2;
        }
        Uri uri3 = (Uri) a2.first;
        if (q(uri3)) {
            uri2 = x(uri3, true, false);
            A(context, uri2);
        } else {
            uri2 = x(uri3, z2, z3);
            z4 = false;
        }
        return new Pair<>(uri2, Boolean.valueOf(z4));
    }

    public static void k(Intent intent) {
        Uri data;
        Uri uri;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3b3dac4", new Object[]{intent});
        } else if (intent != null && (data = intent.getData()) != null) {
            String uri2 = data.toString();
            if (uri2.startsWith("https://web.wapa.taobao.com/app/tnode/web/index") || uri2.startsWith("https://web.m.taobao.com/app/tnode/web/index")) {
                tfs.g("TNodeNavProcessor", "handleTNodeH5Path :".concat(uri2));
                String queryParameter = data.getQueryParameter("tnode");
                if (!TextUtils.isEmpty(queryParameter)) {
                    Uri parse = Uri.parse(queryParameter);
                    if (parse == null || !"page_guangguanghome".equals(parse.getPath())) {
                        uri = nwv.x0(data, "https://h5.m.taobao.com/tnode/index.htm");
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add("tnode");
                        uri = nwv.x0(nwv.v0(data, arrayList), "https://h5.m.taobao.com/guangguang/index.htm");
                    }
                    tfs.g("TNodeNavProcessor", "handleTNodeH5Path, newUrl:" + uri);
                    intent.setData(uri);
                }
            }
        }
    }

    public static boolean o(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d319325d", new Object[]{str})).booleanValue();
        }
        if (akt.p2("ShortVideo.enableAllVideoSource", true)) {
            return true;
        }
        HashSet hashSet = new HashSet();
        for (String str2 : OrangeConfig.getInstance().getConfig("ShortVideo", "enableTransparentVideoSource", "guangguang,guangguang_follow").split(",")) {
            if (!TextUtils.isEmpty(str2)) {
                hashSet.add(str2);
            }
        }
        return hashSet.contains(str);
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e95548c2", new Object[0])).booleanValue();
        }
        return !TBRevisionSwitchManager.c().p() && TBRevisionSwitchManager.c().d(bud.KEY_NEW_CONTENT_ENABLE);
    }

    public static boolean r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("259e93aa", new Object[]{str})).booleanValue();
        }
        if (TextUtils.equals(str, "/tnode/index.htm") || TextUtils.equals(str, "/tnode/index.html") || TextUtils.equals(str, "/tnode/multipage/index.htm")) {
            return true;
        }
        return false;
    }

    public static boolean s(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c3ec49", new Object[]{uri})).booleanValue();
        }
        if (uri == null) {
            return false;
        }
        String host = uri.getHost();
        String path = uri.getPath();
        if (!"h5.m.taobao.com".equals(host)) {
            return false;
        }
        if ("/tnode/index.htm".equals(path) || "/tnode/index.html".equals(path) || "/tnode/transparency/index.htm".equals(path) || "/tnode/multipage/index.htm".equals(path) || "/tnode/multipagetransparency/index.htm".equals(path)) {
            return true;
        }
        return false;
    }

    public static boolean t(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61d9e473", new Object[]{uri})).booleanValue();
        }
        if (uri == null) {
            return false;
        }
        String host = uri.getHost();
        String path = uri.getPath();
        if (!"h5.m.taobao.com".equals(host)) {
            return false;
        }
        if ("/tnode/index.htm".equals(path) || "/tnode/index.html".equals(path)) {
            return true;
        }
        return false;
    }

    public static boolean v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41efc09", new Object[]{str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        if (str.contains("/tnode/multipagetransparency/index.htm") || str.contains("/tnode/transparency/index.htm")) {
            return true;
        }
        return false;
    }

    public static Uri x(Uri uri, boolean z, boolean z2) {
        Uri uri2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("2d74944", new Object[]{uri, new Boolean(z), new Boolean(z2)});
        }
        if (uri == null || !u(uri) || !s(uri)) {
            return uri;
        }
        if (z) {
            Pair<Uri, lgs.b> b2 = lgs.b(uri, false);
            lgs.b bVar = (lgs.b) b2.second;
            uri = uqm.b((Uri) b2.first, bVar.a(), nov.d(bVar.d));
        }
        IDeviceInfo i = od0.D().i();
        if (!z2 || !akt.F1()) {
            return uri;
        }
        if (akt.j2() && (i == null || i.i())) {
            return uri;
        }
        String e = nov.e(uri);
        if (TextUtils.isEmpty(e) || !b.contains(e)) {
            return uri;
        }
        PreloadDelegate preloadDelegate = new PreloadDelegate(Globals.getApplication(), null, uri.toString(), String.valueOf(System.currentTimeMillis()), null, false, 1, null);
        preloadDelegate.l();
        String i2 = preloadDelegate.i();
        if (!TextUtils.isEmpty(i2)) {
            uri2 = Uri.parse(i2);
        } else {
            uri2 = null;
        }
        if (uri2 != null) {
            return uri2;
        }
        return uri;
    }

    public static Uri z(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("426b97ad", new Object[]{uri});
        }
        if (w(uri)) {
            return nwv.a(uri, nj7.LARGE_SCREEN_STYLE_KEY, "fullscreen");
        }
        return uri;
    }

    public static void n(Context context, Intent intent) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8caf8625", new Object[]{context, intent});
            return;
        }
        Uri data = intent.getData();
        if (data != null && data.isHierarchical()) {
            JSONObject jSONObject = new JSONObject();
            try {
                for (String str2 : data.getQueryParameterNames()) {
                    jSONObject.put(str2, (Object) data.getQueryParameter(str2));
                }
            } catch (Throwable unused) {
            }
            String string = jSONObject.getString("target_page");
            if (!TextUtils.isEmpty(string)) {
                Object a2 = ggs.a(UGC_URL_REDIRECT);
                if (a2 instanceof String) {
                    str = (String) a2;
                } else {
                    str = "";
                }
                String customConfig = OrangeConfig.getInstance().getCustomConfig(UGC_URL_REDIRECT, TextUtils.isEmpty(str) ? "{\n  \"rate_detail\": {\n    \"url\": \"https://h5.m.taobao.com/tnode/index.htm?tnode=page_ratedetail%40ugc%3fpangesture%3dpullrightexit%26navbarHide%3dtrue%26immersive%3dtrue\",\n  },\n  \"ask_answerinvite\": {\n    \"url\": \"https://h5.m.taobao.com/ask-everyone/publish.htm?type=answer\"\n  }\n}" : str);
                if (!TextUtils.equals(str, customConfig)) {
                    ggs.e(UGC_URL_REDIRECT, customConfig);
                }
                JSONObject jSONObject2 = JSON.parseObject(customConfig).getJSONObject(string);
                if (!(jSONObject2 == null || TextUtils.isEmpty(jSONObject2.getString("url")))) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("conditions");
                    if (jSONObject3 != null) {
                        String string2 = jSONObject3.getString("minAppVersion");
                        try {
                            String str3 = context.getPackageManager().getPackageInfo(Globals.getApplication().getPackageName(), 16384).versionName;
                            if (!TextUtils.isEmpty(string2)) {
                                if (!nwv.b(str3, string2)) {
                                    return;
                                }
                            }
                        } catch (Throwable unused2) {
                        }
                        if (jSONObject3.getJSONArray("blackDeviceModels").contains(Build.MODEL)) {
                            return;
                        }
                    }
                    String string3 = jSONObject2.getString("url");
                    Uri parse = Uri.parse(string3);
                    try {
                        for (String str4 : parse.getQueryParameterNames()) {
                            if (!jSONObject.containsKey(str4)) {
                                jSONObject.put(str4, (Object) parse.getQueryParameter(str4));
                            }
                        }
                    } catch (Throwable unused3) {
                    }
                    StringBuilder sb = new StringBuilder(parse.toString());
                    if (string3.contains("?")) {
                        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                            sb.append("&");
                            sb.append(entry.getKey());
                            sb.append("=");
                            sb.append(entry.getValue().toString());
                        }
                    } else {
                        sb.append("?");
                        for (Map.Entry<String, Object> entry2 : jSONObject.entrySet()) {
                            sb.append(entry2.getKey());
                            sb.append("=");
                            sb.append(entry2.getValue().toString());
                            sb.append("&");
                        }
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    Uri parse2 = Uri.parse(sb.toString());
                    if (s(parse2)) {
                        B(intent);
                    }
                    intent.setData(parse2);
                }
            }
        }
    }

    public static Pair<Uri, Boolean> a(Context context, Uri uri, boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("34d366e2", new Object[]{context, uri, new Boolean(z)});
        }
        if (uri == null) {
            return null;
        }
        if (bps.v(uri) && TextUtils.equals(uri.getQueryParameter("tabid"), "home") && akt.I0()) {
            uri = nwv.w0(uri, "tabid", "video");
        }
        if (!m(context, uri)) {
            if (!t(uri)) {
                String host = uri.getHost();
                String path = uri.getPath();
                if ((("market.m.taobao.com".equals(host) || "market.wapa.taobao.com".equals(host)) && "/app/mtb/personal-homepage/pages/index/index.html".equals(path)) || ("tesi.m.taobao.com".equals(host) && "/app/mtb/daren-page-esr/pages/index/index.html".equals(path) && p() && c())) {
                    uri = a0n.c(uri);
                    Nav.from(context).toUri(uri);
                } else if ("market.m.taobao.com".equals(host) || "market.wapa.taobao.com".equals(host)) {
                    uri = D(uri, z);
                }
            } else if (!q(uri)) {
                uri = y(uri, true, z);
            }
            z2 = false;
        }
        if (!z2) {
            if (t(uri)) {
                uri = (Uri) lgs.b(uri, false).first;
            }
            uri = C(z(uri));
        }
        return new Pair<>(uri, Boolean.valueOf(z2));
    }

    public static boolean j(zmj zmjVar, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("214377bc", new Object[]{zmjVar, intent})).booleanValue();
        }
        Context d = zmjVar == null ? null : zmjVar.d();
        Iterator it = ((ArrayList) f29347a).iterator();
        while (it.hasNext()) {
            if (((mnj) it.next()).a(zmjVar, intent)) {
                return true;
            }
        }
        try {
            o.o0(Globals.getApplication());
            if (l(d, intent)) {
                return true;
            }
            k(intent);
            if (akt.H0() && intent.getData() != null && "/app/mtb-guang/showcase/transfer".equals(intent.getData().getPath())) {
                try {
                    n(d, intent);
                    return true;
                } catch (Throwable unused) {
                }
            }
            boolean booleanExtra = intent.getBooleanExtra("tnode_has_parsed", false);
            tfs.d("handleGuangGuangNavUrl:" + booleanExtra + "," + intent.getData());
            PageRenderIntercept.h(d, intent.getData());
            if (booleanExtra) {
                return true;
            }
            Pair<Uri, Boolean> i = i(d, intent.getData(), true, true, true);
            Uri uri = (Uri) i.first;
            boolean booleanValue = ((Boolean) i.second).booleanValue();
            if (!booleanValue) {
                if (s(uri)) {
                    B(intent);
                }
                tfs.g("TNodeNavProcessor", "setData to " + uri.toString());
                intent.setData(uri);
            }
            return !booleanValue;
        } catch (Exception unused2) {
            return true;
        }
    }

    public static boolean l(Context context, Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6cca75a", new Object[]{context, intent})).booleanValue();
        }
        if (!(intent == null || (data = intent.getData()) == null)) {
            String queryParameter = data.getQueryParameter("tnodepush");
            if (!TextUtils.isEmpty(queryParameter)) {
                tfs.g("TNodeNavProcessor", "handleTNodePush:" + queryParameter);
                od0.D().s().e(context, queryParameter, null);
                intent.setData(nwv.v0(data, Arrays.asList("tnodepush")));
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m(android.content.Context r6, android.net.Uri r7) {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.ufs.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001c
            java.lang.String r3 = "7b4f8bcf"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r6
            r4[r0] = r7
            java.lang.Object r6 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x001c:
            if (r7 == 0) goto L_0x010f
            java.lang.String r2 = "tnode"
            java.lang.String r3 = r7.getQueryParameter(r2)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x010f
            android.net.Uri r4 = android.net.Uri.parse(r3)
            if (r4 == 0) goto L_0x010f
            java.lang.String r5 = "page_search"
            java.lang.String r4 = r4.getPath()
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x010f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "handleTNodeSearchPage:"
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "TNodeNavProcessor"
            tb.tfs.g(r4, r3)
            java.lang.String r3 = "guangguang.androidweexsearch.enableWeexSearch"
            java.lang.String r4 = "false"
            java.lang.String r3 = tb.akt.G2(r3, r4)
            boolean r3 = tb.nwv.o(r3, r1)
            if (r3 == 0) goto L_0x010f
            java.lang.String r3 = "extParams"
            java.lang.String r3 = r7.getQueryParameter(r3)
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 != 0) goto L_0x0078
            com.alibaba.fastjson.JSONObject r3 = com.alibaba.fastjson.JSON.parseObject(r3)     // Catch: all -> 0x0077
            java.lang.String r5 = "query"
            boolean r3 = r3.containsKey(r5)     // Catch: all -> 0x0077
            goto L_0x0079
        L_0x0077:
        L_0x0078:
            r3 = 0
        L_0x0079:
            java.lang.String[] r2 = new java.lang.String[]{r2}
            java.util.List r2 = java.util.Arrays.asList(r2)
            android.net.Uri r7 = tb.nwv.v0(r7, r2)
            int r2 = android.taobao.mulitenv.EnvironmentSwitcher.a()
            android.taobao.mulitenv.EnvironmentSwitcher$EnvType r5 = android.taobao.mulitenv.EnvironmentSwitcher.EnvType.OnLINE
            int r5 = r5.getValue()
            if (r2 != r5) goto L_0x0092
            r1 = 1
        L_0x0092:
            if (r3 == 0) goto L_0x00a0
            if (r1 == 0) goto L_0x0099
            java.lang.String r1 = "https://web.m.taobao.com/app/mtb-guang/tab2-search/result"
            goto L_0x009b
        L_0x0099:
            java.lang.String r1 = "https://web.wapa.taobao.com/app/mtb-guang/tab2-search/result"
        L_0x009b:
            android.net.Uri r7 = tb.nwv.x0(r7, r1)
            goto L_0x00ab
        L_0x00a0:
            if (r1 == 0) goto L_0x00a5
            java.lang.String r1 = "https://web.m.taobao.com/app/mtb-guang/tab2-search/home"
            goto L_0x00a7
        L_0x00a5:
            java.lang.String r1 = "https://web.wapa.taobao.com/app/mtb-guang/tab2-search/home"
        L_0x00a7:
            android.net.Uri r7 = tb.nwv.x0(r7, r1)
        L_0x00ab:
            java.lang.String r1 = "wh_weex"
            java.lang.String r2 = "true"
            android.net.Uri r7 = tb.nwv.a(r7, r1, r2)
            java.lang.String r1 = "weex_mode"
            java.lang.String r3 = "dom"
            android.net.Uri r7 = tb.nwv.a(r7, r1, r3)
            java.lang.String r1 = "weex_cache_disabled"
            android.net.Uri r7 = tb.nwv.a(r7, r1, r4)
            java.lang.String r1 = "disableNav"
            java.lang.String r3 = "YES"
            android.net.Uri r7 = tb.nwv.a(r7, r1, r3)
            java.lang.String r1 = "wx_navbar_transparent"
            android.net.Uri r7 = tb.nwv.a(r7, r1, r2)
            java.lang.String r1 = "wx_navbar_hidden"
            android.net.Uri r7 = tb.nwv.a(r7, r1, r2)
            java.lang.String r1 = "_wx_statusbar_hidden"
            android.net.Uri r7 = tb.nwv.a(r7, r1, r2)
            java.lang.String r1 = "weitao_switch.searchExtraParams"
            java.lang.String r2 = ""
            java.lang.String r1 = tb.akt.H2(r1, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x00fe
            com.alibaba.fastjson.JSONObject r1 = com.alibaba.fastjson.JSON.parseObject(r1)     // Catch: Exception -> 0x00fe
            if (r1 == 0) goto L_0x00fe
            java.util.HashMap r1 = tb.nwv.c(r1)     // Catch: Exception -> 0x00fe
            android.net.Uri r7 = tb.nwv.i0(r7, r1)     // Catch: Exception -> 0x00fe
        L_0x00fe:
            tb.od0 r1 = tb.od0.D()
            tb.hzc r1 = r1.s()
            java.lang.String r7 = r7.toString()
            r2 = 0
            r1.e(r6, r7, r2)
            return r0
        L_0x010f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ufs.m(android.content.Context, android.net.Uri):boolean");
    }

    public static boolean q(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d921a3dc", new Object[]{uri})).booleanValue();
        }
        return uri != null && t(uri) && uri.toString().contains("type%3Dsheet");
    }

    public static boolean u(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39237e88", new Object[]{uri})).booleanValue();
        }
        if (uri == null) {
            return false;
        }
        return !TextUtils.isEmpty(uri.getQueryParameter("tnode"));
    }

    public static boolean w(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("998c65f2", new Object[]{uri})).booleanValue();
        }
        return bps.v(uri) || bps.w(uri) || od0.D().r().d(uri) || TextUtils.equals(uri.getQueryParameter("tnodefullpage"), "true");
    }

    public static Uri y(Uri uri, boolean z, boolean z2) {
        String str;
        boolean z3 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("5a3dfc01", new Object[]{uri, new Boolean(z), new Boolean(z2)});
        }
        if (uri == null) {
            return uri;
        }
        String encodedQuery = uri.getEncodedQuery();
        String queryParameter = uri.getQueryParameter("tnode");
        String queryParameter2 = uri.getQueryParameter("transition");
        String path = uri.getPath();
        if (TextUtils.isEmpty(queryParameter)) {
            return uri;
        }
        Uri parse = Uri.parse(queryParameter);
        int indexOf = queryParameter.indexOf("?");
        if (!TextUtils.equals(indexOf > 0 ? queryParameter.substring(0, indexOf) : null, "page_content") || !akt.x()) {
            boolean z4 = z2 && akt.h2(g(), uri, null);
            if (z && f()) {
                boolean equals = TextUtils.equals(parse.getQueryParameter(gl4.CONFIG_PAN_GESTURE), gl4.GESTURE_PULLRIGHTEXIT);
                boolean o = nwv.o(parse.getQueryParameter(gl4.CONFIG_FULLTRANSPARENT), false);
                if (equals || o || (z4 && !TextUtils.isEmpty(queryParameter2))) {
                    StringBuilder sb = new StringBuilder("https://h5.m.taobao.com");
                    if (z4) {
                        str = h(true);
                    } else {
                        str = "/tnode/transparency/index.htm";
                    }
                    sb.append(str);
                    sb.append("?");
                    sb.append(encodedQuery);
                    uri = Uri.parse(sb.toString());
                    if (z4 && !z3) {
                        uri = Uri.parse("https://h5.m.taobao.com" + h(path.contains("transparency")) + "?" + encodedQuery);
                    }
                    return nwv.a(uri, "tnodeTime", String.valueOf(System.nanoTime()));
                }
            }
            z3 = false;
            if (z4) {
                uri = Uri.parse("https://h5.m.taobao.com" + h(path.contains("transparency")) + "?" + encodedQuery);
            }
            return nwv.a(uri, "tnodeTime", String.valueOf(System.nanoTime()));
        }
        String queryParameter3 = uri.getQueryParameter("contentId");
        Uri parse2 = Uri.parse("https://market.m.taobao.com/app/tb-source-app/video-fullpage/pages/index2");
        HashMap q0 = nwv.q0(uri);
        q0.remove("tnode");
        q0.remove("contentId");
        if (!q0.containsKey("source")) {
            q0.put("source", "guangguang");
        }
        if (!q0.containsKey("type")) {
            q0.put("type", "guangguang");
        }
        q0.put("id", queryParameter3);
        return D(nwv.i0(parse2, q0), z2);
    }

    static {
        t2o.a(502267910);
        ArrayList arrayList = new ArrayList();
        f29347a = arrayList;
        arrayList.add(new tz7());
    }
}
