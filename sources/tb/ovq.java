package tb;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import tb.jvq;
import tb.pvq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ovq extends nv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String HOME_TAB_ID_SUBSCRIBE = "subscribe";

    /* renamed from: a  reason: collision with root package name */
    public final pvq f25695a = new pvq(i());
    public final jvq b;
    public WeakReference<Context> c;
    public final Map<String, String> d;
    public final fdc e;
    public Intent f;
    public String g;
    public View h;
    public final c i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements pvq.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.pvq.c
        public void onRetry() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2145010", new Object[]{this});
                return;
            }
            sfh.d("SubscribeDefaultSubTabController", "重试校验下载订阅bundle 触发下载");
            ovq.a(ovq.this);
            muq.d();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements jvq.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.jvq.d
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef4d4afc", new Object[]{this, str});
                return;
            }
            sfh.d("SubscribeDefaultSubTabController", "LoadListener onFailure: " + str);
            ovq.c(ovq.this).onFail();
            ovq.e(ovq.this);
            muq.a(str);
        }

        @Override // tb.jvq.d
        public void b(IHomeSubTabController iHomeSubTabController) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dbefd956", new Object[]{this, iHomeSubTabController});
                return;
            }
            ovq.b(ovq.this);
            sfh.d("SubscribeDefaultSubTabController", "远程化成功 LoadListener onSuccess");
            ovq.c(ovq.this).b(iHomeSubTabController);
            ovq.d(ovq.this, iHomeSubTabController);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface c {
        void b(IHomeSubTabController iHomeSubTabController);

        void onFail();
    }

    static {
        t2o.a(729810101);
    }

    public ovq(fdc fdcVar, c cVar) {
        super(fdcVar);
        HashMap hashMap = new HashMap(3);
        this.d = hashMap;
        this.e = fdcVar;
        this.i = cVar;
        this.b = new jvq(fdcVar, h());
        hashMap.put("spm-cnt", "a21acg.b41183928");
        hashMap.put("isLowDevice", String.valueOf(vxl.i()));
    }

    public static /* synthetic */ void a(ovq ovqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e183b97c", new Object[]{ovqVar});
        } else {
            ovqVar.j();
        }
    }

    public static /* synthetic */ void b(ovq ovqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca8b7e7d", new Object[]{ovqVar});
        } else {
            ovqVar.k();
        }
    }

    public static /* synthetic */ c c(ovq ovqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("5a4ae21a", new Object[]{ovqVar});
        }
        return ovqVar.i;
    }

    public static /* synthetic */ void d(ovq ovqVar, IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45245002", new Object[]{ovqVar, iHomeSubTabController});
        } else {
            ovqVar.g(iHomeSubTabController);
        }
    }

    public static /* synthetic */ void e(ovq ovqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85a2cd80", new Object[]{ovqVar});
        } else {
            ovqVar.l();
        }
    }

    public static /* synthetic */ Object ipc$super(ovq ovqVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/topmultitab/defaulttab/subscribe/SubscribeDefaultSubTabController");
    }

    @Override // com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public View createView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        sfh.d("SubscribeDefaultSubTabController", "创建预置订阅视图 触发下载");
        this.c = new WeakReference<>(context);
        j();
        View c2 = this.f25695a.c(context);
        this.h = c2;
        return c2;
    }

    public void f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93347b63", new Object[]{this, context});
            return;
        }
        this.c = new WeakReference<>(context);
        this.b.f(context);
    }

    public final void g(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10fa2c03", new Object[]{this, iHomeSubTabController});
            return;
        }
        Intent intent = this.f;
        if (!(intent == null && this.g == null)) {
            iHomeSubTabController.notifyOutLinkParams(intent, this.g);
        }
        this.f = null;
        this.g = null;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public String getUpdatePageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("111ff600", new Object[]{this});
        }
        return "Page_DingYueIndexAll";
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public Map<String, String> getUpdatePageProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("30e122fd", new Object[]{this});
        }
        return this.d;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public String getUpdatePageUtParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4393099", new Object[]{this});
        }
        return "";
    }

    public final jvq.d h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jvq.d) ipChange.ipc$dispatch("27537045", new Object[]{this});
        }
        return new b();
    }

    public final pvq.c i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pvq.c) ipChange.ipc$dispatch("20268ce0", new Object[]{this});
        }
        return new a();
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isEnablePullReFresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b20c9b34", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdb43d62", new Object[]{this});
            return;
        }
        WeakReference<Context> weakReference = this.c;
        if (weakReference == null) {
            sfh.d("SubscribeDefaultSubTabController", "context 未赋值，checkLoadSubscribeBundle 未执行");
            return;
        }
        Context context = weakReference.get();
        if (context == null) {
            sfh.d("SubscribeDefaultSubTabController", "context 被回收，checkLoadSubscribeBundle 未执行");
        } else {
            f(context);
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b7c74e9", new Object[]{this});
            return;
        }
        sfh.d("SubscribeDefaultSubTabController", "removeDefaultView mDefaultSubscribeView: ");
        View view = this.h;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                sfh.d("SubscribeDefaultSubTabController", "removeDefaultView mDefaultSubscribeView success: ");
                ((ViewGroup) parent).removeView(this.h);
            }
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b15684c", new Object[]{this});
        } else {
            this.f25695a.e(false);
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void notifyOutLinkParams(Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac20293", new Object[]{this, intent, str});
            return;
        }
        this.f = intent;
        this.g = str;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onColdStartResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45e9b853", new Object[]{this});
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPageSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90abdd0", new Object[]{this});
            return;
        }
        muq.e();
        if (this.f25695a.d()) {
            muq.f();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPageUnSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dadaf89", new Object[]{this});
        } else if (this.f25695a.d()) {
            muq.c();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPullRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24224e7e", new Object[]{this});
            return;
        }
        sfh.d("SubscribeDefaultSubTabController", "onPullRefresh 触发下载");
        j();
        muq.d();
        this.e.u(this);
    }
}
