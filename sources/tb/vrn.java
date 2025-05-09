package tb;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.biz.ISmartRtService;
import tb.sgc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vrn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final h6c<RecyclerView> f30203a;
    public final sgc.b b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements sgc.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ q2k f30204a;
        public final /* synthetic */ cfc b;

        /* compiled from: Taobao */
        /* renamed from: tb.vrn$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class RunnableC1081a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f30205a;

            public RunnableC1081a(int i) {
                this.f30205a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                a aVar = a.this;
                vrn.a(vrn.this, aVar.b);
                a.this.f30204a.i(this.f30205a);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f30206a;

            public b(int i) {
                this.f30206a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (a.this.f30204a.a(this.f30206a)) {
                    a aVar = a.this;
                    vrn.a(vrn.this, aVar.b);
                    a.this.f30204a.i(this.f30206a);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class c implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f30207a;

            public c(int i) {
                this.f30207a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    a.this.f30204a.i(this.f30207a);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class d implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ BaseSectionModel f30208a;
            public final /* synthetic */ int b;

            public d(BaseSectionModel baseSectionModel, int i) {
                this.f30208a = baseSectionModel;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (this.f30208a != null) {
                    if (!vrn.b(vrn.this)) {
                        fve.e("RecycleViewNextPageHandler", "不允许loading出现时校验补偿触发翻页");
                    } else if (vrn.c(vrn.this, this.f30208a.getSectionBizCode()) && a.this.f30204a.h()) {
                        a.this.f30204a.i(this.b);
                    }
                }
            }
        }

        public a(q2k q2kVar, cfc cfcVar) {
            this.f30204a = q2kVar;
            this.b = cfcVar;
        }

        @Override // tb.sgc.b
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1414cfeb", new Object[]{this, view});
            }
        }

        @Override // tb.sgc.b
        public void h(int i, View view, BaseSectionModel baseSectionModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab94fc2e", new Object[]{this, new Integer(i), view, baseSectionModel});
            }
        }

        @Override // tb.sgc.b
        public void i(boolean z, int i, BaseSectionModel baseSectionModel, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe58018e", new Object[]{this, new Boolean(z), new Integer(i), baseSectionModel, view});
                return;
            }
            Boolean bool = (Boolean) mza.d().c("nextPageSyncCheck", Boolean.class);
            if (bool == null || !bool.booleanValue()) {
                get.a().e(new b(i));
            } else if (this.f30204a.a(i)) {
                get.a().e(new RunnableC1081a(i));
            }
        }

        @Override // tb.sgc.b
        public void o(int i, View view, BaseSectionModel baseSectionModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d4bbbcc6", new Object[]{this, new Integer(i), view, baseSectionModel});
                return;
            }
            Boolean bool = (Boolean) mza.d().c("nextPageSyncCheck", Boolean.class);
            if (bool == null || !bool.booleanValue()) {
                get.a().e(new d(baseSectionModel, i));
            } else if (baseSectionModel != null) {
                if (!vrn.b(vrn.this)) {
                    fve.e("RecycleViewNextPageHandler", "不允许loading出现时校验补偿触发翻页");
                } else if (vrn.c(vrn.this, baseSectionModel.getSectionBizCode()) && this.f30204a.h()) {
                    get.a().e(new c(i));
                }
            }
        }
    }

    static {
        t2o.a(486539621);
    }

    public vrn(cfc cfcVar, h6c<RecyclerView> h6cVar) {
        this.f30203a = h6cVar;
        sgc.b d = d(cfcVar);
        this.b = d;
        h6cVar.y(d);
    }

    public static /* synthetic */ void a(vrn vrnVar, cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("924e6d52", new Object[]{vrnVar, cfcVar});
        } else {
            vrnVar.h(cfcVar);
        }
    }

    public static /* synthetic */ boolean b(vrn vrnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25e2f9d1", new Object[]{vrnVar})).booleanValue();
        }
        return vrnVar.f();
    }

    public static /* synthetic */ boolean c(vrn vrnVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab20673a", new Object[]{vrnVar, str})).booleanValue();
        }
        return vrnVar.g(str);
    }

    public final sgc.b d(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sgc.b) ipChange.ipc$dispatch("faed3e8d", new Object[]{this, cfcVar});
        }
        return new a(new q2k(cfcVar), cfcVar);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.f30203a.q(this.b);
        }
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7aef6b", new Object[]{this})).booleanValue();
        }
        return mve.a("enableLoadAppearTriggerNextPage", true);
    }

    public final boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f13aaa2a", new Object[]{this, str})).booleanValue();
        }
        return "loading".equals(str);
    }

    public final void h(cfc cfcVar) {
        ISmartRtService iSmartRtService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75041426", new Object[]{this, cfcVar});
        } else if (cfcVar != null && (iSmartRtService = (ISmartRtService) cfcVar.a(ISmartRtService.class)) != null) {
            iSmartRtService.smartPreloadPredictStatistics();
        }
    }
}
