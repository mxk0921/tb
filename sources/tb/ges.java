package tb;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LruCache;
import androidx.core.app.NotificationCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifest;
import com.taobao.themis.kernel.metaInfo.manifest.QueryPass;
import com.taobao.themis.kernel.utils.CommonExtKt;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.JvmStatic;
import kotlin.text.Regex;
import tb.h6i;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ges {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SOURCE_URL = "pages-fast.m.taobao.com/wow/z/uniapp/";
    public static final ges INSTANCE = new ges();

    /* renamed from: a  reason: collision with root package name */
    public static final Regex f19935a = new Regex("^(https?://[^/]+/wow/z/uniapp/)([0-9]+)/?([^?]+)?");
    public static final LruCache<String, a> b = new LruCache<>(5);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f19936a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public boolean g;
        public boolean h;
        public boolean i;
        public String j;
        public boolean k;
        public String l;
        public boolean m;

        static {
            t2o.a(839909982);
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5d966351", new Object[]{this});
            }
            return this.f19936a;
        }

        public final boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("10ad1d58", new Object[]{this})).booleanValue();
            }
            return this.m;
        }

        public final String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1c44a5af", new Object[]{this});
            }
            return this.e;
        }

        public final String d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3bbd726", new Object[]{this});
            }
            return this.d;
        }

        public final String e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("551c67f9", new Object[]{this});
            }
            return this.c;
        }

        public final String f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5d62ef27", new Object[]{this});
            }
            return this.f;
        }

        public final boolean g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("fdc8da14", new Object[]{this})).booleanValue();
            }
            return this.k;
        }

        public final String h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3570fe60", new Object[]{this});
            }
            return this.l;
        }

        public final String i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c43b57c5", new Object[]{this});
            }
            return this.j;
        }

        public final String j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6c176b7", new Object[]{this});
            }
            return this.b;
        }

        public final boolean k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7ff0fd20", new Object[]{this})).booleanValue();
            }
            return this.g;
        }

        public final boolean l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("44a94f2e", new Object[]{this})).booleanValue();
            }
            return this.h;
        }

        public final boolean m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ca587524", new Object[]{this})).booleanValue();
            }
            return this.i;
        }

        public final void n(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c398fad", new Object[]{this, str});
            } else {
                this.f19936a = str;
            }
        }

        public final void o(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4d262500", new Object[]{this, new Boolean(z)});
            } else {
                this.g = z;
            }
        }

        public final void p(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3bcdd974", new Object[]{this, new Boolean(z)});
            } else {
                this.m = z;
            }
        }

        public final void q(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84073f0f", new Object[]{this, str});
            } else {
                this.e = str;
            }
        }

        public final void r(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec1cf0b2", new Object[]{this, new Boolean(z)});
            } else {
                this.h = z;
            }
        }

        public final void s(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f5fcc978", new Object[]{this, str});
            } else {
                this.d = str;
            }
        }

        public final void t(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee1a849d", new Object[]{this, str});
            } else {
                this.c = str;
            }
        }

        public final void u(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2691d8ec", new Object[]{this, new Boolean(z)});
            } else {
                this.i = z;
            }
        }

        public final void v(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fbd38b97", new Object[]{this, str});
            } else {
                this.f = str;
            }
        }

        public final void w(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("834982d0", new Object[]{this, new Boolean(z)});
            } else {
                this.k = z;
            }
        }

        public final void x(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38c2816", new Object[]{this, str});
            } else {
                this.l = str;
            }
        }

        public final void y(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("456d5cb9", new Object[]{this, str});
            } else {
                this.j = str;
            }
        }

        public final void z(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c4aba9f", new Object[]{this, str});
            } else {
                this.b = str;
            }
        }
    }

    static {
        t2o.a(839909981);
    }

    public static /* synthetic */ String c(String str, String str2, List list, List list2, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e441cf68", new Object[]{str, str2, list, list2, new Integer(i), obj});
        }
        if ((i & 4) != 0) {
            list = null;
        }
        if ((i & 8) != 0) {
            list2 = null;
        }
        return b(str, str2, list, list2);
    }

    public static /* synthetic */ String g(ges gesVar, String str, boolean z, boolean z2, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ddaba7c", new Object[]{gesVar, str, new Boolean(z), new Boolean(z2), new Integer(i), obj});
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return gesVar.f(str, z, z2);
    }

    public final boolean a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6316102", new Object[]{this, aVar})).booleanValue();
        }
        ckf.g(aVar, "baseInfo");
        if (!aVar.b() && aVar.m()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
        if (r20 != null) goto L_0x0090;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0094, code lost:
        if (r20.contains(r10) != true) goto L_0x0097;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String d(java.lang.String r17, java.lang.String r18, java.util.List<java.lang.String> r19, java.util.List<java.lang.String> r20) {
        /*
            r16 = this;
            r1 = r19
            r2 = r20
            r3 = 1
            r4 = 0
            com.android.alibaba.ip.runtime.IpChange r0 = tb.ges.$ipChange
            boolean r5 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0025
            java.lang.String r5 = "f303a689"
            r6 = 5
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r4] = r16
            r6[r3] = r17
            r3 = 2
            r6[r3] = r18
            r3 = 3
            r6[r3] = r1
            r1 = 4
            r6[r1] = r2
            java.lang.Object r0 = r0.ipc$dispatch(r5, r6)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0025:
            if (r17 != 0) goto L_0x0029
            r0 = 0
            return r0
        L_0x0029:
            if (r18 != 0) goto L_0x002c
            return r17
        L_0x002c:
            android.net.Uri r5 = android.net.Uri.parse(r17)
            android.net.Uri$Builder r0 = r5.buildUpon()
            android.net.Uri$Builder r6 = r0.clearQuery()
            java.lang.String r0 = "&"
            java.lang.String[] r8 = new java.lang.String[]{r0}
            r11 = 6
            r12 = 0
            r9 = 0
            r10 = 0
            r7 = r18
            java.util.List r0 = tb.wsq.z0(r7, r8, r9, r10, r11, r12)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            if (r1 == 0) goto L_0x0051
            r8 = 1
            goto L_0x0052
        L_0x0051:
            r8 = 0
        L_0x0052:
            java.util.Iterator r9 = r0.iterator()
        L_0x0056:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00ab
            java.lang.Object r0 = r9.next()
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r0 = "="
            java.lang.String[] r11 = new java.lang.String[]{r0}     // Catch: all -> 0x0089
            r14 = 6
            r15 = 0
            r12 = 0
            r13 = 0
            java.util.List r0 = tb.wsq.z0(r10, r11, r12, r13, r14, r15)     // Catch: all -> 0x0089
            java.lang.Object r10 = r0.get(r4)     // Catch: all -> 0x0089
            java.lang.String r10 = (java.lang.String) r10     // Catch: all -> 0x0089
            java.lang.Object r0 = r0.get(r3)     // Catch: all -> 0x0089
            java.lang.String r0 = (java.lang.String) r0     // Catch: all -> 0x0089
            if (r8 == 0) goto L_0x008b
            if (r1 != 0) goto L_0x0082
            goto L_0x008b
        L_0x0082:
            boolean r11 = r1.contains(r10)     // Catch: all -> 0x0089
            if (r11 != r3) goto L_0x008b
            goto L_0x0097
        L_0x0089:
            r0 = move-exception
            goto L_0x00a3
        L_0x008b:
            if (r8 != 0) goto L_0x009d
            if (r2 != 0) goto L_0x0090
            goto L_0x0097
        L_0x0090:
            boolean r11 = r2.contains(r10)     // Catch: all -> 0x0089
            if (r11 != r3) goto L_0x0097
            goto L_0x009d
        L_0x0097:
            r7.add(r10)     // Catch: all -> 0x0089
            r6.appendQueryParameter(r10, r0)     // Catch: all -> 0x0089
        L_0x009d:
            tb.xhv r0 = tb.xhv.INSTANCE     // Catch: all -> 0x0089
            kotlin.Result.m1108constructorimpl(r0)     // Catch: all -> 0x0089
            goto L_0x0056
        L_0x00a3:
            java.lang.Object r0 = kotlin.b.a(r0)
            kotlin.Result.m1108constructorimpl(r0)
            goto L_0x0056
        L_0x00ab:
            java.util.Set r0 = r5.getQueryParameterNames()
            java.util.Iterator r0 = r0.iterator()
        L_0x00b3:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00cd
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = r7.contains(r1)
            if (r2 != 0) goto L_0x00b3
            java.lang.String r2 = r5.getQueryParameter(r1)
            r6.appendQueryParameter(r1, r2)
            goto L_0x00b3
        L_0x00cd:
            android.net.Uri r0 = r6.build()
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ges.d(java.lang.String, java.lang.String, java.util.List, java.util.List):java.lang.String");
    }

    public final String f(String str, boolean z, boolean z2) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("141fe903", new Object[]{this, str, new Boolean(z), new Boolean(z2)});
        }
        ckf.g(str, "id");
        if (z) {
            str2 = q9s.INSTANCE.x3();
        } else if (z2) {
            str2 = j();
        } else {
            str2 = i();
        }
        return str2 + str + "?wh_showError=false&x-ssr=true";
    }

    public final AppManifest.Page h(a aVar, TMSMetaInfoWrapper tMSMetaInfoWrapper) {
        String e;
        AppManifest.Page page;
        AppManifest.Page page2;
        String str;
        List<AppManifest.Page> s;
        List<AppManifest.Page> s2;
        Object obj;
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppManifest.Page) ipChange.ipc$dispatch("4c7e48e8", new Object[]{this, aVar, tMSMetaInfoWrapper});
        }
        ckf.g(tMSMetaInfoWrapper, "metaInfo");
        Object obj3 = null;
        if (aVar == null || (e = aVar.e()) == null) {
            return null;
        }
        List<AppManifest.Page> s3 = tMSMetaInfoWrapper.s();
        if (s3 == null) {
            page = null;
        } else {
            Iterator<T> it = s3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (ckf.b(((AppManifest.Page) obj2).getId(), e)) {
                    break;
                }
            }
            page = (AppManifest.Page) obj2;
        }
        if (!q9s.p0() || page == null || !rml.b(page)) {
            return page;
        }
        String i = aVar.i();
        if (i == null || (s2 = tMSMetaInfoWrapper.s()) == null) {
            page2 = null;
        } else {
            Iterator<T> it2 = s2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (ckf.b(((AppManifest.Page) obj).getId(), i)) {
                    break;
                }
            }
            page2 = (AppManifest.Page) obj;
        }
        if (page2 != null) {
            return page2;
        }
        List<String> children = page.getChildren();
        if (children == null || (str = children.get(rml.a(page))) == null || (s = tMSMetaInfoWrapper.s()) == null) {
            return null;
        }
        Iterator<T> it3 = s.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            if (ckf.b(((AppManifest.Page) next).getId(), str)) {
                obj3 = next;
                break;
            }
        }
        return (AppManifest.Page) obj3;
    }

    public final String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("baec0f62", new Object[]{this});
        }
        if (q9s.INSTANCE.q1()) {
            return "https://app-manifest.m.taobao.com/wow/z/uniapp/";
        }
        return "https://pages-fast.m.taobao.com/wow/z/uniapp/";
    }

    public final String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4c6afc8", new Object[]{this});
        }
        return "https://pre-pages-fast.m.taobao.com/wow/z/uniapp/";
    }

    public final String k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a960a839", new Object[]{this, str});
        }
        ckf.g(str, "url");
        String c = ies.c(str, "uniapp_renderer");
        if (c == null) {
            return "web";
        }
        int hashCode = c.hashCode();
        if (hashCode != 0) {
            if (hashCode != 117588) {
                if (hashCode == 3645441 && c.equals("weex")) {
                    return "weex";
                }
            } else if (c.equals("web")) {
                return "web";
            }
        } else if (c.equals("")) {
            return "web";
        }
        return null;
    }

    public final String l(String str, QueryPass queryPass, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3afa5564", new Object[]{this, str, queryPass, str2});
        }
        ckf.g(str, "url");
        if (str2 == null || wsq.a0(str2) || queryPass == null) {
            return str;
        }
        List<String> allow = queryPass.getAllow();
        if (allow == null || allow.isEmpty()) {
            List<String> ignore = queryPass.getIgnore();
            if (ignore == null || ignore.isEmpty()) {
                return str;
            }
            List<String> ignore2 = queryPass.getIgnore();
            ckf.d(ignore2);
            if (ignore2.contains("*")) {
                return str;
            }
            String c = c(str, str2, null, queryPass.getIgnore(), 4, null);
            ckf.d(c);
            return c;
        }
        List<String> allow2 = queryPass.getAllow();
        ckf.d(allow2);
        if (allow2.contains("*")) {
            String c2 = c(str, str2, null, null, 12, null);
            ckf.d(c2);
            return c2;
        }
        String c3 = c(str, str2, queryPass.getAllow(), null, 8, null);
        ckf.d(c3);
        return c3;
    }

    public final String p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ef1651e9", new Object[]{this, str});
        }
        ckf.g(str, "id");
        String i = i();
        return i + str + wh6.DIR;
    }

    @JvmStatic
    public static final boolean m(Uri uri) {
        a o;
        String path;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3057ada9", new Object[]{uri})).booleanValue();
        }
        if (!q9s.t2() || (o = INSTANCE.o(String.valueOf(uri))) == null || wsq.O(q9s.e4(), String.valueOf(o.j()), false, 2, null)) {
            return false;
        }
        if (ckf.b(uri == null ? null : uri.getQueryParameter("tms_force_h5"), "true")) {
            return false;
        }
        if (ckf.b(uri == null ? null : uri.getQueryParameter("tms_force_weex"), "true") || uri == null || ckf.b(uri.getQueryParameter("isUniApp"), "false")) {
            return false;
        }
        String queryParameter = uri.getQueryParameter("uniapp_id");
        return (queryParameter != null && (wsq.a0(queryParameter) ^ true)) || (path = uri.getPath()) == null || wsq.O(path, "wow/z/uniapp", false, 2, null);
    }

    @JvmStatic
    public static final boolean n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e7ef95", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!parse.isHierarchical()) {
            return false;
        }
        String queryParameter = parse.getQueryParameter(h8x.KEY_WEEX_MODE);
        if (q9s.A1()) {
            String queryParameter2 = parse.getQueryParameter("afc_tms_weex");
            String queryParameter3 = parse.getQueryParameter("afc_weex_min_appver");
            String appVersion = ((IEnvironmentService) p8s.g(IEnvironmentService.class)).getAppVersion();
            if (ckf.b(queryParameter2, "true") && o9s.b(appVersion, queryParameter3) == 1) {
                return true;
            }
        }
        if (ckf.b("dom", queryParameter) || ckf.b(h8x.KEY_MUS, queryParameter)) {
            return ckf.b("true", parse.getQueryParameter("wh_weex")) || !TextUtils.isEmpty(parse.getQueryParameter(uyv.WX_TPL)) || !TextUtils.isEmpty(parse.getQueryParameter("_mus_tpl"));
        }
        return false;
    }

    public final boolean e(Uri uri, Uri uri2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("782559df", new Object[]{this, uri, uri2})).booleanValue();
        }
        ckf.g(uri, "<this>");
        ckf.g(uri2, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        return tsq.x(uri.getHost(), uri2.getHost(), true) && uri.getPort() == uri2.getPort() && tsq.y(uri.getPath(), uri2.getPath(), false, 2, null);
    }

    public final a o(String str) {
        String str2;
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("7ecaff95", new Object[]{this, str});
        }
        ckf.g(str, "url");
        LruCache<String, a> lruCache = b;
        a aVar = lruCache.get(str);
        if (aVar != null) {
            return aVar;
        }
        Uri parse = Uri.parse(str);
        a aVar2 = new a();
        String str3 = "/";
        String str4 = "";
        if (!TextUtils.isEmpty(parse.getQueryParameter("uniapp_id"))) {
            aVar2.n(str);
            aVar2.z(parse.getQueryParameter("uniapp_id"));
            String queryParameter = parse.getQueryParameter("uniapp_page");
            if (queryParameter != null) {
                str3 = queryParameter;
            }
            aVar2.t(str3);
            aVar2.u(ckf.b(parse.getQueryParameter("uniapp_env"), "pre"));
            String j = aVar2.j();
            if (j != null) {
                str4 = j;
            }
            aVar2.q(f(str4, false, aVar2.m()));
            aVar2.o(true);
        } else {
            g6i find$default = Regex.find$default(f19935a, str, 0, 2, null);
            if (find$default == null) {
                return null;
            }
            d6i e = ((h6i.b) find$default.a()).e(1);
            aVar2.n(e == null ? null : e.a());
            d6i e2 = ((h6i.b) find$default.a()).e(2);
            if (e2 == null || (str2 = e2.a()) == null) {
                str2 = str4;
            }
            aVar2.z(str2);
            d6i e3 = ((h6i.b) find$default.a()).e(3);
            if (!(e3 == null || (a2 = e3.a()) == null)) {
                str3 = a2;
            }
            aVar2.t(str3);
            String host = parse.getHost();
            aVar2.u(host != null && tsq.I(host, "pre-", false, 2, null));
            String j2 = aVar2.j();
            if (j2 != null) {
                str4 = j2;
            }
            aVar2.q(f(str4, false, aVar2.m()));
        }
        if (q9s.g2() && wsq.O(str, "uniapp_sub_page", false, 2, null)) {
            aVar2.y(parse.getQueryParameter("uniapp_sub_page"));
        }
        aVar2.s(str);
        aVar2.v(parse.getEncodedQuery());
        if (CommonExtKt.j()) {
            TMSLogger.b("TMSUniAppUtils", "hit debugMode");
            String queryParameter2 = parse.getQueryParameter("_manifest");
            if (queryParameter2 != null) {
                TMSLogger.b("TMSUniAppUtils", "mock manifest");
                aVar2.q(queryParameter2);
                if (!ckf.b(ies.c(str, "tms_auto_reload"), "true")) {
                    aVar2.r(true);
                }
            }
        }
        aVar2.w(ckf.b(parse.getQueryParameter("uniapp_mode"), rwl.DIMEN_RAPID));
        aVar2.x(parse.getQueryParameter("uniapp_renderer"));
        aVar2.p(parse.getBooleanQueryParameter("_forceCache", false));
        lruCache.put(str, aVar2);
        return aVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x009d, code lost:
        if (r23 != null) goto L_0x00a0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a4, code lost:
        if (r23.contains(r3) != true) goto L_0x00a7;
     */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String b(java.lang.String r20, java.lang.String r21, java.util.List<java.lang.String> r22, java.util.List<java.lang.String> r23) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ges.b(java.lang.String, java.lang.String, java.util.List, java.util.List):java.lang.String");
    }
}
