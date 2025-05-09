package tb;

import android.content.Context;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ai.api.IAfterBuyAiApi;
import com.taobao.android.task.Coordinator;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.b02;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class eh0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f18570a = new AtomicBoolean(false);
    public final d b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f18571a;

        public a(Context context) {
            this.f18571a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            fve.e("AfterBuyAiDownloader", "executeLoad start");
            vcq.a(this.f18571a).c(xcq.c().m(xdp.l(this.f18571a, IAfterBuyAiApi.class).f(eh0.a(eh0.this)).a()).n()).b(eh0.b(eh0.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements rqk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.rqk
        public void onFailure(Exception exc) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebfde814", new Object[]{this, exc});
                return;
            }
            eh0.c(eh0.this).set(false);
            eh0.d(eh0.this).a(exc.getMessage());
            fve.e("AfterBuyAiDownloader", "bundle开始安装失败");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements b02.b<Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.b02.b
        public void a(String str, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("96fce058", new Object[]{this, str, bundle});
                return;
            }
            eh0.c(eh0.this).set(false);
            eh0.d(eh0.this).a(str);
            fve.e("AfterBuyAiDownloader", "bundle加载失败");
        }

        @Override // tb.b02.b
        public void b(Object obj, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("425b1026", new Object[]{this, obj, bundle});
                return;
            }
            fve.e("AfterBuyAiDownloader", "onInstantiate ：" + obj);
            if (!(obj instanceof IAfterBuyAiApi)) {
                fve.e("AfterBuyAiDownloader", "!(o instanceof IAfterBuyAiApi)");
                d d = eh0.d(eh0.this);
                d.a("加载返回的对象类型不匹配, Object : " + obj);
                return;
            }
            fve.e("AfterBuyAiDownloader", "bundle加载成功");
            eh0.c(eh0.this).set(true);
            eh0.d(eh0.this).b((IAfterBuyAiApi) obj);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface d {
        void a(String str);

        void b(IAfterBuyAiApi iAfterBuyAiApi);
    }

    static {
        t2o.a(727711746);
    }

    public eh0(d dVar) {
        this.b = dVar;
    }

    public static /* synthetic */ b02.b a(eh0 eh0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b02.b) ipChange.ipc$dispatch("ae826e20", new Object[]{eh0Var});
        }
        return eh0Var.e();
    }

    public static /* synthetic */ rqk b(eh0 eh0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rqk) ipChange.ipc$dispatch("ae6c2ebb", new Object[]{eh0Var});
        }
        return eh0Var.f();
    }

    public static /* synthetic */ AtomicBoolean c(eh0 eh0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("d88d1c07", new Object[]{eh0Var});
        }
        return eh0Var.f18570a;
    }

    public static /* synthetic */ d d(eh0 eh0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("6dfc475d", new Object[]{eh0Var});
        }
        return eh0Var.b;
    }

    public final b02.b<Object> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b02.b) ipChange.ipc$dispatch("73f8ab58", new Object[]{this});
        }
        return new c();
    }

    public final rqk f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rqk) ipChange.ipc$dispatch("d1253851", new Object[]{this});
        }
        return new b();
    }

    public void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7a5c199", new Object[]{this, context});
        } else if (this.f18570a.get()) {
            fve.e("AfterBuyAiDownloader", "ready download");
        } else {
            this.f18570a.set(true);
            Coordinator.execute(new a(context));
        }
    }
}
