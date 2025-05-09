package tb;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolivecontainer.TBLiveH5Container;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class mnr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String d = mnr.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public int f24170a;
    public String b;
    public ComponentCallbacks c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements ComponentCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public TBLiveH5Container f24171a;

        static {
            t2o.a(1027604500);
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6532022", new Object[]{this});
                return;
            }
            TBLiveH5Container tBLiveH5Container = this.f24171a;
            if (tBLiveH5Container != null) {
                tBLiveH5Container.destroy();
                this.f24171a = null;
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            Context context;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            } else if (!this.f24171a.isDestroied() && !this.f24171a.isAttachedToWindow() && (context = this.f24171a.getContext()) != null) {
                TBLiveH5Container tBLiveH5Container = this.f24171a;
                int i = R.id.taolive_container_prerender_status;
                if ((tBLiveH5Container.getTag(i) instanceof Boolean) && ((Boolean) this.f24171a.getTag(i)).booleanValue()) {
                    this.f24171a.destroy();
                    context.unregisterComponentCallbacks(this);
                    v7t.d(mnr.a(), "系统资源紧张，释放没有上屏的WebView");
                }
            }
        }

        public b(TBLiveH5Container tBLiveH5Container) {
            this.f24171a = tBLiveH5Container;
        }
    }

    static {
        t2o.a(1027604498);
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]);
        }
        return d;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bcd8bcc", new Object[]{this});
            return;
        }
        this.f24170a = 0;
        this.b = null;
    }

    public void c(xud xudVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65e24ff6", new Object[]{this, xudVar});
            return;
        }
        ComponentCallbacks componentCallbacks = this.c;
        if (componentCallbacks != null) {
            ((b) componentCallbacks).a();
        }
        if (xudVar != null && xudVar.getContext() != null) {
            xudVar.getContext().unregisterComponentCallbacks(this.c);
        }
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbb26827", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.f24170a = 2;
        } else {
            this.f24170a = 3;
        }
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("851d207e", new Object[]{this})).booleanValue();
        }
        if (1 == this.f24170a) {
            return true;
        }
        return false;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d9c11b8", new Object[]{this})).booleanValue();
        }
        if (3 == this.f24170a) {
            return true;
        }
        return false;
    }

    public boolean h(String str, nkr nkrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15b614b0", new Object[]{this, str, nkrVar})).booleanValue();
        }
        float c = qp0.c();
        if (c < 0.0f || c > 20.0f) {
            TBLiveH5Container f = nkrVar.f();
            if (f == null) {
                v7t.d(d, "预渲染失败，没有预创建WebView!");
                return false;
            }
            f.setTag(R.id.taolive_container_prerender_status, Boolean.TRUE);
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            buildUpon.appendQueryParameter("tl-x-prerender-enabled", "true");
            String uri = buildUpon.build().toString();
            this.b = uri;
            f.loadUrl(uri);
            this.c = new b(f);
            f.getContext().registerComponentCallbacks(this.c);
            this.f24170a = 1;
            this.b = uri;
            return true;
        }
        String str2 = d;
        v7t.d(str2, "score: " + c + ",低端机取消预渲染!");
        return false;
    }

    public boolean i(String str, nkr nkrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5a25b16", new Object[]{this, str, nkrVar})).booleanValue();
        }
        float c = qp0.c();
        if (c < 0.0f || c > 20.0f) {
            zmr g = nkrVar.g();
            if (g == null) {
                v7t.d(d, "预渲染失败，没有预创建WebView!");
                return false;
            }
            g.j(R.id.taolive_container_prerender_status, true);
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            buildUpon.appendQueryParameter("tl-x-prerender-enabled", "true");
            String uri = buildUpon.build().toString();
            this.b = uri;
            g.d(uri);
            this.f24170a = 1;
            this.b = uri;
            return true;
        }
        String str2 = d;
        v7t.d(str2, "score: " + c + ",低端机取消预渲染!");
        return false;
    }

    public boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a742e0a9", new Object[]{this, str})).booleanValue();
        }
        if (this.f24170a != 2 || TextUtils.isEmpty(str) || TextUtils.isEmpty(this.b)) {
            return false;
        }
        Uri parse = Uri.parse(this.b);
        Uri parse2 = Uri.parse(str);
        String str2 = "";
        String host = parse.getHost() != null ? parse.getHost() : str2;
        String host2 = parse2.getHost() != null ? parse2.getHost() : str2;
        String scheme = parse.getScheme() != null ? parse.getScheme() : str2;
        String scheme2 = parse2.getScheme() != null ? parse2.getScheme() : str2;
        String path = parse.getPath() != null ? parse.getPath() : str2;
        String path2 = parse2.getPath() != null ? parse2.getPath() : str2;
        String queryParameter = parse.getQueryParameter("wh_pid") != null ? parse.getQueryParameter("wh_pid") : str2;
        if (parse2.getQueryParameter("wh_pid") != null) {
            str2 = parse2.getQueryParameter("wh_pid");
        }
        return host.equals(host2) && scheme.equals(scheme2) && path.equals(path2) && queryParameter.equals(str2);
    }
}
