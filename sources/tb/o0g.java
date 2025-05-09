package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgCountMessage;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgJoinMessage;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgPowerMessage;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgTextMessage;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class o0g extends q0g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public g1a<? super KSPowerMsgTextMessage, xhv> b;
    public g1a<? super KSPowerMsgCountMessage, xhv> c;
    public g1a<? super KSPowerMsgJoinMessage, xhv> d;
    public g1a<? super KSPowerMsgPowerMessage, xhv> e;
    public g1a<? super y0g, xhv> f;
    public g1a<? super b1g, xhv> g;

    static {
        t2o.a(1002438906);
    }

    public static /* synthetic */ Object ipc$super(o0g o0gVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/kernel/serviceinterface/KSPowerMsgConstructClientExtParams");
    }

    public final g1a<KSPowerMsgCountMessage, xhv> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("590f89b5", new Object[]{this});
        }
        return this.c;
    }

    public final g1a<KSPowerMsgJoinMessage, xhv> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("9c18fbf0", new Object[]{this});
        }
        return this.d;
    }

    public final g1a<KSPowerMsgPowerMessage, xhv> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("ff33857a", new Object[]{this});
        }
        return this.e;
    }

    public final g1a<y0g, xhv> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("ddd31886", new Object[]{this});
        }
        return this.f;
    }

    public final g1a<KSPowerMsgTextMessage, xhv> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("f50e864d", new Object[]{this});
        }
        return this.b;
    }

    public final g1a<b1g, xhv> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("abc33fad", new Object[]{this});
        }
        return this.g;
    }

    public final void i(g1a<? super KSPowerMsgCountMessage, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c678d601", new Object[]{this, g1aVar});
        } else {
            this.c = g1aVar;
        }
    }

    public final void j(g1a<? super KSPowerMsgJoinMessage, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64f5bbbe", new Object[]{this, g1aVar});
        } else {
            this.d = g1aVar;
        }
    }

    public final void k(g1a<? super KSPowerMsgPowerMessage, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c9ac974", new Object[]{this, g1aVar});
        } else {
            this.e = g1aVar;
        }
    }

    public final void l(g1a<? super y0g, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc7efde8", new Object[]{this, g1aVar});
        } else {
            this.f = g1aVar;
        }
    }

    public final void m(g1a<? super KSPowerMsgTextMessage, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ab17d01", new Object[]{this, g1aVar});
        } else {
            this.b = g1aVar;
        }
    }

    public final void n(g1a<? super b1g, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20cea8a1", new Object[]{this, g1aVar});
        } else {
            this.g = g1aVar;
        }
    }
}
