package com.taobao.android.icart.weex.call.callback;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import tb.a07;
import tb.ckf;
import tb.g1a;
import tb.t2o;
import tb.wsq;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class CartCallbackManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final AtomicInteger c = new AtomicInteger();

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, g1a<Map<String, ? extends Object>, xhv>> f8042a = new ConcurrentHashMap<>();
    public final String b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(478150933);
        }

        public a() {
        }

        public final String a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("326ec32", new Object[]{this, str});
            }
            ckf.g(str, "callbackID");
            return wsq.M0(str, "|", "");
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(478150932);
    }

    public CartCallbackManager(String str) {
        ckf.g(str, "instanceID");
        this.b = str;
    }

    public final g1a<Map<String, ? extends Object>, xhv> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("f6a892d0", new Object[]{this, str});
        }
        ckf.g(str, "id");
        return this.f8042a.get(str);
    }

    public final String b(g1a<? super Map<String, ? extends Object>, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa86e9ff", new Object[]{this, g1aVar});
        }
        ckf.g(g1aVar, "callback");
        String str = this.b + "|callbackID_" + c.getAndIncrement();
        this.f8042a.put(str, new CartCallbackManager$putCallback$1(this, g1aVar, str));
        return str;
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9586eba", new Object[]{this, str});
            return;
        }
        ckf.g(str, "id");
        this.f8042a.remove(str);
    }
}
