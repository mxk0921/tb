package tb;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LruCache;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.gol;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class lgs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final LruCache<String, b> f23328a = new LruCache<>(10);

        static {
            t2o.a(503316969);
        }

        public static /* synthetic */ b a(Uri uri, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("a7f1b992", new Object[]{uri, new Boolean(z)});
            }
            return d(uri, z);
        }

        public static /* synthetic */ Uri b(Uri uri, boolean z, b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Uri) ipChange.ipc$dispatch("b819b6f0", new Object[]{uri, new Boolean(z), bVar});
            }
            return f(uri, z, bVar);
        }

        public static /* synthetic */ b c(Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("602fca5c", new Object[]{uri});
            }
            return g(uri);
        }

        public static b d(Uri uri, boolean z) {
            String queryParameter;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("ed036993", new Object[]{uri, new Boolean(z)});
            }
            if (uri == null || (queryParameter = uri.getQueryParameter(pl4.KEY_URL_CONFIG_CACHE_KEY)) == null || !queryParameter.startsWith(String.valueOf(z))) {
                return null;
            }
            return f23328a.get(queryParameter);
        }

        public static String e(Uri uri, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ae838a01", new Object[]{uri, new Boolean(z)});
            }
            return z + f7l.PLUS + String.valueOf(System.currentTimeMillis());
        }

        public static Uri f(Uri uri, boolean z, b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Uri) ipChange.ipc$dispatch("edbcd8e9", new Object[]{uri, new Boolean(z), bVar});
            }
            String e = e(uri, z);
            f23328a.put(e, bVar);
            return uri.buildUpon().appendQueryParameter(pl4.KEY_URL_CONFIG_CACHE_KEY, e).build();
        }

        public static b g(Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("be56d7ab", new Object[]{uri});
            }
            if (uri == null) {
                return null;
            }
            String queryParameter = uri.getQueryParameter(pl4.KEY_URL_CONFIG_CACHE_KEY);
            if (!TextUtils.isEmpty(queryParameter)) {
                return f23328a.remove(queryParameter);
            }
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f23329a;
        public final Uri b;
        public final String c;
        public final Uri d;
        public final Map<String, Object> e;
        public final String f;
        public final boolean g;
        public final String h;
        public final String i;

        static {
            t2o.a(503316970);
        }

        public b(String str, Uri uri, Uri uri2, Map<String, Object> map, String str2, boolean z, String str3, String str4) {
            this.f23329a = str;
            this.b = uri;
            this.d = uri2;
            if (uri2 != null) {
                this.c = uri2.toString();
            }
            this.e = map;
            this.f = str2;
            this.g = z;
            this.h = str3;
            this.i = str4;
        }

        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f05b6691", new Object[]{this});
            }
            Uri uri = this.b;
            if (uri != null) {
                return nwv.u0(uri.toString());
            }
            return null;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6df84dbd", new Object[]{this});
            }
            return nwv.I(this.e.get(gl4.CONFIG_ENTRY), null);
        }

        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5b3b83bf", new Object[]{this});
            }
            return nwv.I(this.e.get(gl4.CONFIG_LOCAL_PATH), null);
        }

        public String d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("fe0ab176", new Object[]{this});
            }
            return nwv.I(this.e.get(gl4.CONFIG_LOCAL_VERSION), null);
        }

        public String e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("85f88fd1", new Object[]{this});
            }
            return nwv.I(this.e.get(gl4.CONFIG_POLICY), null);
        }

        public boolean f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e9124cca", new Object[]{this})).booleanValue();
            }
            if (this.d == null || !akt.T0()) {
                return false;
            }
            return nwv.o(this.d.getQueryParameter("tnodeInterceptBack"), false);
        }
    }

    static {
        t2o.a(503316968);
    }

    public static String a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("126d0ed1", new Object[]{str, new Boolean(z)});
        }
        StringBuilder sb = new StringBuilder("https://h5.m.taobao.com/tnode/index.htm?tnode=");
        sb.append(Uri.encode(str));
        if (z) {
            String query = Uri.parse(str).getQuery();
            if (!TextUtils.isEmpty(query)) {
                sb.append("&");
                sb.append(query);
            }
        }
        return sb.toString();
    }

    public static Pair<Uri, b> b(Uri uri, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("890e4faa", new Object[]{uri, new Boolean(z)});
        }
        if (uri == null) {
            return null;
        }
        b a2 = a.a(uri, z);
        if (a2 == null && (a2 = e(uri, z)) != null) {
            uri = a.b(uri, z, a2);
        }
        return new Pair<>(uri, a2);
    }

    public static b c(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("ef51f5b5", new Object[]{uri});
        }
        return d(uri, false);
    }

    public static b d(Uri uri, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("83e1d7db", new Object[]{uri, new Boolean(z)});
        }
        return (b) b(uri, z).second;
    }

    public static b f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("b5140efb", new Object[]{str});
        }
        if (str != null) {
            return c(Uri.parse(str));
        }
        return null;
    }

    public static b g(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("7662e755", new Object[]{str, new Boolean(z)});
        }
        if (str != null) {
            return d(Uri.parse(str), z);
        }
        return null;
    }

    public static void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95b48fcd", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            a.c(Uri.parse(str));
        }
    }

    public static b e(Uri uri, boolean z) {
        String str;
        String str2;
        boolean z2 = true;
        z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("362ae738", new Object[]{uri, new Boolean(z)});
        }
        String str3 = null;
        if (uri == null) {
            return null;
        }
        String uri2 = uri.toString();
        String queryParameter = uri.getQueryParameter("tnode");
        if (TextUtils.isEmpty(queryParameter)) {
            uri = Uri.parse(a(uri2, false));
            queryParameter = uri.getQueryParameter("tnode");
        }
        if (queryParameter.startsWith(gl4.CONFIG_PAGE_PREFIX)) {
            gol.b h = gol.h(uri, queryParameter, z);
            str2 = h.b;
            str = h.f20134a;
            queryParameter = h.c;
            if (!h.e) {
                Uri parse = Uri.parse(queryParameter);
                HashMap hashMap = new HashMap();
                if (parse != null) {
                    str3 = parse.getQueryParameter(gl4.CONFIG_INIT_DATA_KEY);
                    for (String str4 : parse.getQueryParameterNames()) {
                        hashMap.put(str4, parse.getQueryParameter(str4));
                    }
                }
                return new b(uri2, parse, uri, hashMap, str3, false, str2, str);
            }
            z2 = true;
        } else {
            str2 = null;
            str = null;
        }
        String a2 = m9h.a(queryParameter);
        if (TextUtils.equals(a2, queryParameter)) {
        }
        Uri parse2 = Uri.parse(a2);
        if (z2) {
            uri = nwv.w0(uri, "tnode", parse2.toString());
        }
        HashMap hashMap2 = new HashMap();
        if (parse2 != null) {
            str3 = parse2.getQueryParameter(gl4.CONFIG_INIT_DATA_KEY);
            for (String str5 : parse2.getQueryParameterNames()) {
                hashMap2.put(str5, parse2.getQueryParameter(str5));
            }
        }
        return new b(uri2, parse2, uri, hashMap2, str3, true, str2, str);
    }
}
