package tb;

import android.os.Handler;
import android.os.Looper;
import android.taobao.windvane.embed.BaseEmbedView;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.extension.EmbedViewConfig;
import com.uc.webview.export.extension.IEmbedViewContainer;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class fqw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, c> f19471a = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IWVWebView f19472a;
        public final /* synthetic */ String b;

        public a(IWVWebView iWVWebView, String str) {
            this.f19472a = iWVWebView;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                IWVWebView iWVWebView = this.f19472a;
                String url = iWVWebView != null ? iWVWebView.getUrl() : null;
                y71.commitSuccess(y71.MONITOR_POINT_EMBED_VIEW, this.b + "|" + url);
            } catch (Throwable th) {
                v7t.d("WVEVManager", "commit ev log fail" + th.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IWVWebView f19473a;
        public final /* synthetic */ int b;
        public final /* synthetic */ String c;

        public b(IWVWebView iWVWebView, int i, String str) {
            this.f19473a = iWVWebView;
            this.b = i;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                IWVWebView iWVWebView = this.f19473a;
                y71.commitFail(y71.MONITOR_POINT_EMBED_VIEW, this.b, this.c, iWVWebView != null ? iWVWebView.getUrl() : null);
            } catch (Throwable th) {
                v7t.d("WVEVManager", "commit ev log fail" + th.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f19474a;
        public final ClassLoader b;

        static {
            t2o.a(989855830);
        }

        public c(String str, ClassLoader classLoader) {
            this.f19474a = str;
            this.b = classLoader;
        }

        public ClassLoader a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ClassLoader) ipChange.ipc$dispatch("8d8cecd6", new Object[]{this});
            }
            return this.b;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("68ef37ac", new Object[]{this});
            }
            return this.f19474a;
        }
    }

    static {
        t2o.a(989855827);
    }

    public static void a(String str, IWVWebView iWVWebView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87ea7a30", new Object[]{str, iWVWebView, new Integer(i)});
            return;
        }
        b bVar = new b(iWVWebView, i, str);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            bVar.run();
        } else {
            new Handler(Looper.getMainLooper()).post(bVar);
        }
    }

    public static void b(String str, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cb370fe", new Object[]{str, iWVWebView});
            return;
        }
        a aVar = new a(iWVWebView, str);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            aVar.run();
        } else {
            new Handler(Looper.getMainLooper()).post(aVar);
        }
    }

    public static BaseEmbedView c(String str, String str2, IWVWebView iWVWebView, EmbedViewConfig embedViewConfig) {
        Class<?> cls;
        c f = f(str2);
        if (f == null) {
            a(str2, iWVWebView, -1);
            v7t.d("WVEVManager", "no register view with type:[" + str2 + "]");
            return null;
        }
        try {
            ClassLoader a2 = f.a();
            if (a2 == null) {
                cls = Class.forName(f.b());
            } else {
                cls = a2.loadClass(f.b());
            }
            if (cls == null || !BaseEmbedView.class.isAssignableFrom(cls)) {
                a(str2, iWVWebView, 2);
                v7t.d("WVEVManager", "no class found");
            } else {
                BaseEmbedView baseEmbedView = (BaseEmbedView) cls.newInstance();
                if (baseEmbedView.init(str, str2, iWVWebView, embedViewConfig)) {
                    b(str2, iWVWebView);
                    return baseEmbedView;
                }
                a(str2, iWVWebView, 1);
                v7t.d("WVEVManager", "type check error, required type:[" + baseEmbedView.getViewType() + "], real type:[" + str2 + "]");
            }
        } catch (Throwable th) {
            a(str2, iWVWebView, 3);
            v7t.d("WVEVManager", "create embed view error, type:" + str2 + " | msg:" + th.getMessage());
        }
        return null;
    }

    public static BaseEmbedView d(String str, String str2, IWVWebView iWVWebView, EmbedViewConfig embedViewConfig, IEmbedViewContainer iEmbedViewContainer) {
        Class<?> cls;
        c f = f(str2);
        if (f == null) {
            a(str2, iWVWebView, -1);
            v7t.d("WVEVManager", "no register view with type:[" + str2 + "]");
            return null;
        }
        try {
            ClassLoader a2 = f.a();
            if (a2 == null) {
                cls = Class.forName(f.b());
            } else {
                cls = a2.loadClass(f.b());
            }
            if (cls == null || !BaseEmbedView.class.isAssignableFrom(cls)) {
                a(str2, iWVWebView, 2);
                v7t.d("WVEVManager", "no class found");
            } else {
                BaseEmbedView baseEmbedView = (BaseEmbedView) cls.newInstance();
                if (baseEmbedView.init(str, str2, iWVWebView, embedViewConfig, iEmbedViewContainer)) {
                    b(str2, iWVWebView);
                    return baseEmbedView;
                }
                a(str2, iWVWebView, 1);
                v7t.d("WVEVManager", "type check error, required type:[" + baseEmbedView.getViewType() + "], real type:[" + str2 + "]");
            }
        } catch (Throwable th) {
            a(str2, iWVWebView, 3);
            v7t.d("WVEVManager", "create embed view error, type:" + str2 + " | msg:" + th.getMessage());
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList<String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("36286ca1", new Object[0]);
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (Object obj : ((ConcurrentHashMap) f19471a).keySet()) {
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static c f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("2e8b223d", new Object[]{str});
        }
        return (c) ((ConcurrentHashMap) f19471a).get(str);
    }

    public static void g(String str, Class<? extends BaseEmbedView> cls, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("766d6643", new Object[]{str, cls, new Boolean(z)});
        } else if (!TextUtils.isEmpty(str) && cls != null) {
            c cVar = new c(cls.getName(), z ? cls.getClassLoader() : null);
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f19471a;
            if (concurrentHashMap.containsKey(str)) {
                v7t.d("WVEVManager", "new view:[" + cls.getSimpleName() + "] will overlap the old view [" + ((c) concurrentHashMap.get(str)).b() + "]");
            }
            concurrentHashMap.put(str, cVar);
        }
    }
}
