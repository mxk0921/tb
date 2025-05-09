package tb;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.tao.Globals;
import com.taobao.tao.topmultitab.service.data.IHomeDataService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class saj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FrameLayout f27905a;
    public bx b;
    public hqk c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements hqk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.saj$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class RunnableC1051a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ IContainerDataModel f27907a;

            public RunnableC1051a(IContainerDataModel iContainerDataModel) {
                this.f27907a = iContainerDataModel;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (vaj.l(this.f27907a) == null) {
                    saj.b(saj.this).setVisibility(8);
                    fve.e("MultiTabContainerObserver", "没有对应的数据设置分类tab容器隐藏");
                } else {
                    saj.b(saj.this).setVisibility(0);
                }
            }
        }

        public a() {
        }

        @Override // tb.hqk
        public void a(JSONObject jSONObject, IContainerDataModel<?> iContainerDataModel, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a114a6e", new Object[]{this, jSONObject, iContainerDataModel, str});
            } else if (saj.a(saj.this)) {
                fve.e("MultiTabContainerObserver", "数据回来了，当前没有添加过分类tab");
            } else {
                m5a.a().i(new RunnableC1051a(iContainerDataModel));
            }
        }

        @Override // tb.hqk
        public void b(JSONObject jSONObject, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c0a53b0", new Object[]{this, jSONObject, str});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b extends bx {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/topmultitab/service/searchbar/impl/MultiTabContainerController$2");
        }

        @Override // tb.bx
        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aa37bc9d", new Object[]{this});
            } else if (saj.a(saj.this)) {
                fve.e("MultiTabContainerObserver", "没有分类tab");
            } else if (kbq.e(Globals.getApplication())) {
                saj.b(saj.this).setVisibility(8);
                fve.e("MultiTabContainerObserver", "切到海外设置分类tab容器隐藏");
            } else {
                saj.b(saj.this).setVisibility(0);
            }
        }
    }

    static {
        t2o.a(729810325);
    }

    public saj(FrameLayout frameLayout) {
        this.f27905a = frameLayout;
        i();
        h();
    }

    public static /* synthetic */ boolean a(saj sajVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebcb52c0", new Object[]{sajVar})).booleanValue();
        }
        return sajVar.g();
    }

    public static /* synthetic */ FrameLayout b(saj sajVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("da23f29e", new Object[]{sajVar});
        }
        return sajVar.f27905a;
    }

    public final bx d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bx) ipChange.ipc$dispatch("36e5e101", new Object[]{this});
        }
        return new b();
    }

    public final hqk e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hqk) ipChange.ipc$dispatch("656f8d08", new Object[]{this});
        }
        return new a();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        l();
        k();
        j();
        fve.e("MultiTabContainerObserver", "destroy");
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a705e10", new Object[]{this})).booleanValue();
        }
        FrameLayout frameLayout = this.f27905a;
        if (frameLayout == null || frameLayout.getChildCount() == 0) {
            return true;
        }
        return false;
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d81fc91d", new Object[]{this});
            return;
        }
        this.c = e();
        IHomeDataService iHomeDataService = (IHomeDataService) c4b.i().h(IHomeDataService.class);
        if (iHomeDataService != null) {
            iHomeDataService.addDataProcessListener(this.c);
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6529898a", new Object[]{this});
            return;
        }
        this.b = d();
        s2b.c().r(this.b);
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2704443d", new Object[]{this});
            return;
        }
        this.f27905a.removeAllViews();
        this.f27905a.setVisibility(8);
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("435b1f44", new Object[]{this});
            return;
        }
        IHomeDataService iHomeDataService = (IHomeDataService) c4b.i().h(IHomeDataService.class);
        hqk hqkVar = this.c;
        if (hqkVar != null && iHomeDataService != null) {
            iHomeDataService.removeDataProcessListener(hqkVar);
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eee7f1f1", new Object[]{this});
        } else {
            s2b.c().u(this.b);
        }
    }

    public void c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b6caa27", new Object[]{this, view});
            return;
        }
        this.f27905a.removeAllViews();
        if (!(view == null || view.getParent() == null)) {
            ((ViewGroup) view.getParent()).removeView(view);
            this.f27905a.addView(view);
            fve.e("MultiTabContainerObserver", "添加分类tab视图到容器中");
        }
        if (this.f27905a.getVisibility() == 8) {
            this.f27905a.setVisibility(0);
            fve.e("MultiTabContainerObserver", "设置分类tab容器可见");
        }
    }
}
