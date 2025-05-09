package com.alibaba.android.ultron.vfw.storage;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.a;
import tb.ckf;
import tb.i04;
import tb.iji;
import tb.is2;
import tb.njg;
import tb.t2o;
import tb.tao;
import tb.toh;
import tb.wsq;
import tb.xii;
import tb.yz3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class TradeCache {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TradeCache INSTANCE = new TradeCache();

    /* renamed from: a  reason: collision with root package name */
    public static final njg f2348a = a.b(TradeCache$memoryCache$2.INSTANCE);
    public static final njg b = a.b(TradeCache$localCache$2.INSTANCE);
    public static final njg c = a.b(TradeCache$keysList$2.INSTANCE);

    static {
        t2o.a(157286710);
        t2o.a(157286709);
    }

    public static final /* synthetic */ List a(TradeCache tradeCache) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4ac26469", new Object[]{tradeCache});
        }
        return tradeCache.h();
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c33f6c4", new Object[]{this, str});
        } else if (!d().contains(str)) {
            d().add(str);
            l();
        }
    }

    public boolean c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("983a89df", new Object[]{this, str, str2})).booleanValue();
        }
        ckf.g(str, "key");
        ckf.g(str2, "bizCode");
        return d().contains(is2.Companion.a(str2, str));
    }

    public final CopyOnWriteArrayList<String> d() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("6d777f1c", new Object[]{this});
        } else {
            value = c.getValue();
        }
        return (CopyOnWriteArrayList) value;
    }

    public final iji e() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("c6152055", new Object[]{this});
        } else {
            value = b.getValue();
        }
        return (iji) value;
    }

    public final xii f() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("d0e8e583", new Object[]{this});
        } else {
            value = f2348a.getValue();
        }
        return (xii) value;
    }

    public String g(String str, String str2) {
        tao<String, ErrorResult> b2;
        tao<String, ErrorResult> b3;
        String c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c375b585", new Object[]{this, str, str2});
        }
        ckf.g(str, "key");
        ckf.g(str2, "bizCode");
        if (!c(str, str2)) {
            return null;
        }
        xii f = f();
        if (f != null && (b3 = f.b(str)) != null && (c2 = b3.c()) != null) {
            return c2;
        }
        iji e = e();
        if (e == null || (b2 = e.b(str2, str)) == null) {
            return null;
        }
        return b2.c();
    }

    public final List<String> h() {
        tao<String, ErrorResult> b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f17ce578", new Object[]{this});
        }
        iji e = e();
        String c2 = (e == null || (b2 = e.b("TradeCache", "tradeKeysList")) == null) ? null : b2.c();
        if (c2 != null) {
            return wsq.z0(c2, new String[]{","}, false, 0, 6, null);
        }
        return yz3.i();
    }

    public final void i(String str, String str2) {
        String str3;
        iji e;
        tao<String, ErrorResult> b2;
        String c2;
        toh a2;
        tao<String, ErrorResult> b3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb9ed1c3", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "key");
        ckf.g(str2, "bizCode");
        if (c(str, str2)) {
            xii f = f();
            if (f == null || (b3 = f.b(str)) == null) {
                str3 = null;
            } else {
                str3 = b3.c();
            }
            if (str3 == null && (e = e()) != null && (b2 = e.b(str2, str)) != null && (c2 = b2.c()) != null && (a2 = toh.Companion.a(str, c2)) != null) {
                a2.f28843a = 3600000L;
                a2.d = false;
                xii f2 = INSTANCE.f();
                if (f2 != null) {
                    f2.d(a2, null);
                }
            }
        }
    }

    public void j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5045d669", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "key");
        ckf.g(str2, "bizCode");
        if (c(str, str2)) {
            String a2 = is2.Companion.a(str2, str);
            xii f = f();
            if (f != null) {
                f.c(str, null);
            }
            iji e = e();
            if (e != null) {
                e.c(str2, str);
            }
            d().remove(a2);
            l();
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa7a6168", new Object[]{this});
            return;
        }
        iji e = e();
        if (e != null) {
            e.d("TradeCache", "tradeKeysList", i04.j0(d(), ",", null, null, 0, null, null, 62, null));
        }
    }

    public void k(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4b8032c", new Object[]{this, str, str2, str3});
            return;
        }
        ckf.g(str, "key");
        ckf.g(str2, "value");
        ckf.g(str3, "bizCode");
        toh a2 = toh.Companion.a(str, str2);
        if (a2 != null) {
            a2.f28843a = 3600000L;
            a2.d = false;
            xii f = INSTANCE.f();
            if (f != null) {
                f.d(a2, null);
            }
        }
        iji e = e();
        if (e != null) {
            e.d(str3, str, str2);
        }
        b(is2.Companion.a(str3, str));
    }
}
