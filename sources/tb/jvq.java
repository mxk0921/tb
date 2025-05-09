package tb;

import android.content.Context;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.b02;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class jvq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f22243a = new AtomicBoolean(false);
    public final fdc b;
    public final d c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f22244a;

        public a(Context context) {
            this.f22244a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            sfh.d("SubscribeBundleLoader", "executeLoad start");
            vcq.a(this.f22244a).c(xcq.c().m(xdp.l(this.f22244a, IHomeSubTabController.class).i(fdc.class).h(jvq.b(jvq.this)).f(jvq.a(jvq.this)).a()).n()).b(jvq.c(jvq.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
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
            jvq.d(jvq.this).set(false);
            jvq.e(jvq.this).a(exc.getMessage());
            sfh.d("SubscribeBundleLoader", "订阅bundle 开始安装失败 set isDownLoad false");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
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
            jvq.d(jvq.this).set(false);
            jvq.e(jvq.this).a(str);
            sfh.d("SubscribeBundleLoader", "订阅bundle 加载失败 set isDownLoad false");
        }

        @Override // tb.b02.b
        public void b(Object obj, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("425b1026", new Object[]{this, obj, bundle});
                return;
            }
            sfh.d("SubscribeBundleLoader", "onInstantiate set isDownLoad false" + obj);
            if (!(obj instanceof IHomeSubTabController)) {
                sfh.d("SubscribeBundleLoader", "!(o instanceof IHomeSubTabController)");
                d e = jvq.e(jvq.this);
                e.a("加载返回的对象类型不匹配, Object : " + obj);
                return;
            }
            jvq.d(jvq.this).set(true);
            jvq.e(jvq.this).b((IHomeSubTabController) obj);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface d {
        void a(String str);

        void b(IHomeSubTabController iHomeSubTabController);
    }

    static {
        t2o.a(729810105);
    }

    public jvq(fdc fdcVar, d dVar) {
        this.b = fdcVar;
        this.c = dVar;
    }

    public static /* synthetic */ b02.b a(jvq jvqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b02.b) ipChange.ipc$dispatch("ee15342d", new Object[]{jvqVar});
        }
        return jvqVar.g();
    }

    public static /* synthetic */ fdc b(jvq jvqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fdc) ipChange.ipc$dispatch("435c80a4", new Object[]{jvqVar});
        }
        return jvqVar.b;
    }

    public static /* synthetic */ rqk c(jvq jvqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rqk) ipChange.ipc$dispatch("b9dcd86d", new Object[]{jvqVar});
        }
        return jvqVar.h();
    }

    public static /* synthetic */ AtomicBoolean d(jvq jvqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("83e35d95", new Object[]{jvqVar});
        }
        return jvqVar.f22243a;
    }

    public static /* synthetic */ d e(jvq jvqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("135efc7e", new Object[]{jvqVar});
        }
        return jvqVar.c;
    }

    public void f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c379a5d3", new Object[]{this, context});
            return;
        }
        sfh.d("SubscribeBundleLoader", "checkLoad isDownLoad：" + this.f22243a.get());
        if (!this.f22243a.get()) {
            sfh.d("SubscribeBundleLoader", "checkLoad 开始下载订阅bundle：set isDownLoad true");
            this.f22243a.set(true);
            i(context);
        }
    }

    public final b02.b<Object> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b02.b) ipChange.ipc$dispatch("73f8ab58", new Object[]{this});
        }
        return new c();
    }

    public final rqk h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rqk) ipChange.ipc$dispatch("d1253851", new Object[]{this});
        }
        return new b();
    }

    public final void i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64b55506", new Object[]{this, context});
        } else {
            Coordinator.execute(new a(context));
        }
    }
}
