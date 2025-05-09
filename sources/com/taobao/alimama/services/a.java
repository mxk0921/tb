package com.taobao.alimama.services;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.services.IBaseService;
import com.taobao.alimama.utils.EnvironmentUtils;
import java.util.HashMap;
import java.util.Map;
import tb.l0e;
import tb.n87;
import tb.o17;
import tb.p87;
import tb.p9t;
import tb.q27;
import tb.q77;
import tb.t2o;
import tb.xz6;
import tb.y7e;
import tb.yyd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, IBaseService> f6188a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f6189a = new a();

        static {
            t2o.a(1018167373);
        }
    }

    static {
        t2o.a(1018167371);
    }

    public static a e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("c9017c5", new Object[0]);
        }
        return b.f6189a;
    }

    public IBaseService a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBaseService) ipChange.ipc$dispatch("c02d6e65", new Object[]{this, str});
        }
        return (IBaseService) ((HashMap) this.f6188a).get(str);
    }

    public yyd b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yyd) ipChange.ipc$dispatch("b9a56104", new Object[]{this});
        }
        return (yyd) a(IBaseService.Names.SERVICE_TAOBAO_LOCATION.name());
    }

    public l0e c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l0e) ipChange.ipc$dispatch("6f31b6d8", new Object[]{this});
        }
        return (l0e) a(IBaseService.Names.SERVICE_TIME.name());
    }

    public y7e d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y7e) ipChange.ipc$dispatch("4c364e7a", new Object[]{this});
        }
        return (y7e) a(IBaseService.Names.SERVICE_USER_TRACK.name());
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3e6eddf", new Object[]{this});
            return;
        }
        g(new xz6());
        g(new o17());
        g(new q27());
        g(new p87());
        g(new q77());
        g(new n87());
        if (EnvironmentUtils.isInTaobao()) {
            g(new p9t());
        }
    }

    public void g(IBaseService iBaseService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f5703f8", new Object[]{this, iBaseService});
        } else {
            ((HashMap) this.f6188a).put(iBaseService.d(), iBaseService);
        }
    }

    public a() {
        this.f6188a = new HashMap();
        f();
    }
}
