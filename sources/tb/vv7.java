package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.nanocompose.megability.ability.DownloaderNetworkType;
import com.taobao.nanocompose.megability.ability.DownloaderRequestType;
import com.taobao.nanocompose.megability.annotation.MegabilityExtParams;
import java.util.Map;

/* compiled from: Taobao */
@MegabilityExtParams
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class vv7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f30276a;
    public Long d;
    public String e;
    public Map<String, ? extends Object> g;
    public Map<String, ? extends Object> h;
    public g1a<? super yv7, xhv> i;
    public g1a<? super uv7, xhv> j;
    public d1a<xhv> k;
    public g1a<? super bi8, xhv> l;
    public int b = 1000;
    public DownloaderRequestType c = DownloaderRequestType.GET;
    public DownloaderNetworkType f = DownloaderNetworkType.ANY;

    static {
        t2o.a(1022361663);
    }

    public final Map<String, Object> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c297ea94", new Object[]{this});
        }
        return this.h;
    }

    public final Map<String, Object> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cf4415cc", new Object[]{this});
        }
        return this.g;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91115b1", new Object[]{this});
        }
        return this.e;
    }

    public final DownloaderRequestType d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DownloaderRequestType) ipChange.ipc$dispatch("a22dc990", new Object[]{this});
        }
        return this.c;
    }

    public final int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f9a2a64", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.f30276a;
    }

    public final DownloaderNetworkType g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DownloaderNetworkType) ipChange.ipc$dispatch("6befa94c", new Object[]{this});
        }
        return this.f;
    }

    public final d1a<xhv> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d1a) ipChange.ipc$dispatch("d55a4fc7", new Object[]{this});
        }
        return this.k;
    }

    public final g1a<uv7, xhv> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("9de3de07", new Object[]{this});
        }
        return this.j;
    }

    public final g1a<bi8, xhv> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("aa60c0e2", new Object[]{this});
        }
        return this.l;
    }

    public final g1a<yv7, xhv> k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("5f6c0893", new Object[]{this});
        }
        return this.i;
    }

    public final Long l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("ba4453d7", new Object[]{this});
        }
        return this.d;
    }

    public final void m(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e56f47a", new Object[]{this, map});
        } else {
            this.h = map;
        }
    }

    public final void n(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf00da", new Object[]{this, map});
        } else {
            this.g = map;
        }
    }

    public final void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79e834d", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public final void p(DownloaderRequestType downloaderRequestType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d315658", new Object[]{this, downloaderRequestType});
            return;
        }
        ckf.g(downloaderRequestType, "<set-?>");
        this.c = downloaderRequestType;
    }

    public final void q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85ef32be", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public final void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b22cde", new Object[]{this, str});
        } else {
            this.f30276a = str;
        }
    }

    public final void s(DownloaderNetworkType downloaderNetworkType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e9872d6", new Object[]{this, downloaderNetworkType});
            return;
        }
        ckf.g(downloaderNetworkType, "<set-?>");
        this.f = downloaderNetworkType;
    }

    public final void t(d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d12a429", new Object[]{this, d1aVar});
        } else {
            this.k = d1aVar;
        }
    }

    public final void u(g1a<? super uv7, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce74bb87", new Object[]{this, g1aVar});
        } else {
            this.j = g1aVar;
        }
    }

    public final void v(g1a<? super bi8, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb9f74", new Object[]{this, g1aVar});
        } else {
            this.l = g1aVar;
        }
    }

    public final void w(g1a<? super yv7, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3df1e27b", new Object[]{this, g1aVar});
        } else {
            this.i = g1aVar;
        }
    }

    public final void x(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fd9fec9", new Object[]{this, l});
        } else {
            this.d = l;
        }
    }
}
