package tb;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class fsw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_METHOD = "method";
    public static final String KEY_NAME = "name";
    public static final Map<String, kpw> b = new ConcurrentHashMap();
    public static final Map<String, b> c = new ConcurrentHashMap();
    public static final Map<IWVWebView, Map<String, b>> d = new ConcurrentHashMap();
    public static final Map<String, String> e = new ConcurrentHashMap();
    public static ihc f = null;
    public static fsw g;

    /* renamed from: a  reason: collision with root package name */
    public final String f19515a = "WVDynamic";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class a implements ihc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.ihc
        public Class<? extends kpw> getBridgeClass(String str) {
            String str2;
            ServiceInfo serviceInfo;
            if (yaa.n != null && !TextUtils.isEmpty(str)) {
                if (str.contains(fsw.b().f19515a)) {
                    str2 = fsw.b().f19515a;
                } else {
                    str2 = str;
                }
                Intent intent = new Intent(str2);
                intent.setPackage(yaa.n.getPackageName());
                List<ResolveInfo> queryIntentServices = yaa.n.getPackageManager().queryIntentServices(intent, 4);
                if (!(queryIntentServices == null || queryIntentServices.size() <= 0 || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null || serviceInfo.name == null)) {
                    try {
                        return ((ihc) yaa.n.getClassLoader().loadClass(serviceInfo.name).newInstance()).getBridgeClass(str);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f19516a;
        public final ClassLoader b;

        static {
            t2o.a(989856237);
        }

        public b(String str, ClassLoader classLoader) {
            this.f19516a = str;
            this.b = classLoader;
        }

        public static /* synthetic */ Object a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("a44a230b", new Object[]{bVar});
            }
            bVar.getClass();
            return null;
        }

        public ClassLoader b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ClassLoader) ipChange.ipc$dispatch("8d8cecd6", new Object[]{this});
            }
            return this.b;
        }

        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("68ef37ac", new Object[]{this});
            }
            return this.f19516a;
        }
    }

    static {
        t2o.a(989856235);
    }

    public static fsw b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fsw) ipChange.ipc$dispatch("d3a42251", new Object[0]);
        }
        if (g == null) {
            synchronized (fsw.class) {
                try {
                    if (g == null) {
                        g = new fsw();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return g;
    }

    public static b d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("3a6663b7", new Object[]{str});
        }
        Map<String, b> map = c;
        if (map == null) {
            return null;
        }
        return (b) ((ConcurrentHashMap) map).get(str);
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("613e83fa", new Object[0]);
        } else {
            n(new a());
        }
    }

    public static void f(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0d6479c", new Object[]{str, str2, str3, str4});
        } else if (!((ConcurrentHashMap) c).containsKey(str3) || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            v7t.n("WVPluginManager", "registerAlias quit, this is no original plugin or alias is invalid.");
        } else if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            String str5 = str + "::" + str2;
            ((ConcurrentHashMap) e).put(str5, str3 + "::" + str4);
        }
    }

    public static void h(String str, Class<? extends kpw> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14fc8c56", new Object[]{str, cls});
        } else {
            i(str, cls, true);
        }
    }

    public static void i(String str, Class<? extends kpw> cls, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a95b13e", new Object[]{str, cls, new Boolean(z)});
        } else {
            j(str, cls, z, c);
        }
    }

    public static void j(String str, Class<? extends kpw> cls, boolean z, Map<String, b> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd7c687", new Object[]{str, cls, new Boolean(z), map});
        } else if (!TextUtils.isEmpty(str) && cls != null) {
            map.put(str, new b(cls.getName(), z ? cls.getClassLoader() : null));
            v7t.d("WVPluginManager", "HY_REGISTERPLUGIN:" + str + "::" + cls.getName());
            if (trw.getJsBridgeMonitor() != null) {
                erw jsBridgeMonitor = trw.getJsBridgeMonitor();
                jsBridgeMonitor.onJsBridgeReturn("HY_REGISTERPLUGIN", "WVPluginManager", "HY_REGISTERPLUGIN", str + "::" + cls.getName(), "");
            }
        }
    }

    @Deprecated
    public static void l(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fec97d1", new Object[]{str, str2});
        } else {
            m(str, str2, null);
        }
    }

    @Deprecated
    public static void m(String str, String str2, ClassLoader classLoader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67062b79", new Object[]{str, str2, classLoader});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            ((ConcurrentHashMap) c).put(str, new b(str2, classLoader));
            if (trw.getJsBridgeMonitor() != null) {
                erw jsBridgeMonitor = trw.getJsBridgeMonitor();
                jsBridgeMonitor.onJsBridgeReturn("HY_REGISTERPLUGIN", "", "HY_REGISTERPLUGIN", str + "::" + str2, "");
            }
        }
    }

    public static void n(ihc ihcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d056b6e6", new Object[]{ihcVar});
        } else {
            f = ihcVar;
        }
    }

    public static void o(IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("159c4fbc", new Object[]{iWVWebView});
            return;
        }
        Map<IWVWebView, Map<String, b>> map = d;
        if (((Map) ((ConcurrentHashMap) map).get(iWVWebView)) != null) {
            ((ConcurrentHashMap) map).remove(iWVWebView);
        }
    }

    public static void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56be27e0", new Object[]{str});
            return;
        }
        Map<String, b> map = c;
        if (((ConcurrentHashMap) map).containsKey(str)) {
            ((ConcurrentHashMap) map).remove(str);
            return;
        }
        Map<String, kpw> map2 = b;
        if (((ConcurrentHashMap) map2).containsKey(str)) {
            ((ConcurrentHashMap) map2).remove(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a1, code lost:
        if (android.text.TextUtils.isEmpty(r6) != false) goto L_0x00a3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static tb.kpw a(java.lang.String r12, android.content.Context r13, android.taobao.windvane.webview.IWVWebView r14, android.taobao.windvane.extra.performance2.IPerformance r15) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.fsw.a(java.lang.String, android.content.Context, android.taobao.windvane.webview.IWVWebView, android.taobao.windvane.extra.performance2.IPerformance):tb.kpw");
    }

    public static void g(IWVWebView iWVWebView, String str, Class<? extends kpw> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fd0c56d", new Object[]{iWVWebView, str, cls});
        } else if (iWVWebView != null) {
            Map<IWVWebView, Map<String, b>> map = d;
            Map map2 = (Map) ((ConcurrentHashMap) map).get(iWVWebView);
            if (map2 == null) {
                map2 = new ConcurrentHashMap();
                ((ConcurrentHashMap) map).put(iWVWebView, map2);
            }
            j(str, cls, true, map2);
            v7t.i("WVPluginManager", "注册到局部API，使用范围=[" + iWVWebView.getClass().getSimpleName() + "],API=[" + str + "::" + cls.getSimpleName() + "]");
        } else {
            h(str, cls);
        }
    }

    public static void k(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("326b5de3", new Object[]{str, obj});
            return;
        }
        try {
            if (obj instanceof kpw) {
                ((ConcurrentHashMap) b).put(str, (kpw) obj);
            }
        } catch (Throwable th) {
            v7t.e("WVPluginManager", "registerPlugin by Object error ", th, new Object[0]);
        }
    }

    public static Map<String, String> c(String str, String str2) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4a4392ea", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            v7t.n("WVPluginManager", "getOriginalPlugin failed, alias is empty.");
            return null;
        }
        Map<String, String> map = e;
        String str3 = (String) ((ConcurrentHashMap) map).get(str + "::" + str2);
        if (TextUtils.isEmpty(str3) || (indexOf = str3.indexOf("::")) <= 0) {
            return null;
        }
        String substring = str3.substring(0, indexOf);
        String substring2 = str3.substring(indexOf + 2);
        HashMap hashMap = new HashMap();
        hashMap.put("name", substring);
        hashMap.put("method", substring2);
        return hashMap;
    }
}
