package tb;

import android.content.Context;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.shake.remote.IShakeRemoteApi;
import com.taobao.android.task.Coordinator;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.b02;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ahp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f15742a = new AtomicBoolean(false);
    public final d b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f15743a;

        public a(Context context) {
            this.f15743a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            xgp.a("ShakeSdkLoader", "executeLoad start");
            vcq.a(this.f15743a).c(xcq.c().m(xdp.l(this.f15743a, IShakeRemoteApi.class).f(ahp.a(ahp.this)).a()).n()).b(ahp.b(ahp.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
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
            ahp.c(ahp.this).set(false);
            ahp.d(ahp.this).a(exc.getMessage());
            xgp.a("ShakeSdkLoader", "摇一摇bundle开始安装失败");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
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
            ahp.c(ahp.this).set(false);
            ahp.d(ahp.this).a(str);
            xgp.a("ShakeSdkLoader", "摇一摇bundle加载失败");
        }

        @Override // tb.b02.b
        public void b(Object obj, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("425b1026", new Object[]{this, obj, bundle});
                return;
            }
            xgp.a("ShakeSdkLoader", "onInstantiate ：" + obj);
            if (!(obj instanceof IShakeRemoteApi)) {
                xgp.a("ShakeSdkLoader", "!(o instanceof IHomeSubTabController)");
                d d = ahp.d(ahp.this);
                d.a("加载返回的对象类型不匹配, Object : " + obj);
                return;
            }
            xgp.a("ShakeSdkLoader", "摇一摇bundle加载成功");
            ahp.c(ahp.this).set(true);
            ahp.d(ahp.this).b((IShakeRemoteApi) obj);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface d {
        void a(String str);

        void b(IShakeRemoteApi iShakeRemoteApi);
    }

    static {
        t2o.a(763363338);
    }

    public ahp(d dVar) {
        this.b = dVar;
    }

    public static /* synthetic */ b02.b a(ahp ahpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b02.b) ipChange.ipc$dispatch("e1db089e", new Object[]{ahpVar});
        }
        return ahpVar.f();
    }

    public static /* synthetic */ rqk b(ahp ahpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rqk) ipChange.ipc$dispatch("36965f1f", new Object[]{ahpVar});
        }
        return ahpVar.g();
    }

    public static /* synthetic */ AtomicBoolean c(ahp ahpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("49d55a41", new Object[]{ahpVar});
        }
        return ahpVar.f15742a;
    }

    public static /* synthetic */ d d(ahp ahpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("4369868f", new Object[]{ahpVar});
        }
        return ahpVar.b;
    }

    public void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c379a5d3", new Object[]{this, context});
        } else if (!this.f15742a.get()) {
            xgp.a("ShakeSdkLoader", "checkLoad 开始下载摇一摇bundle");
            this.f15742a.set(true);
            h(context);
        }
    }

    public final b02.b<Object> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b02.b) ipChange.ipc$dispatch("73f8ab58", new Object[]{this});
        }
        return new c();
    }

    public final rqk g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rqk) ipChange.ipc$dispatch("d1253851", new Object[]{this});
        }
        return new b();
    }

    public final void h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64b55506", new Object[]{this, context});
        } else {
            Coordinator.execute(new a(context));
        }
    }
}
