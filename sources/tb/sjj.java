package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.biz.ICardOverlayService;
import com.taobao.infoflow.taobao.subservice.biz.overlayservice.impl.feedback.nativeview.request.InfoFlowDeleteClient;
import com.taobao.infoflow.taobao.subservice.biz.overlayservice.impl.feedback.nativeview.request.InfoFlowDeleteParams;
import com.taobao.infoflow.taobao.subservice.biz.overlayservice.impl.feedback.nativeview.request.InfoFlowDeleteResult;
import com.taobao.login4android.api.Login;
import com.taobao.tao.Globals;
import com.taobao.tao.util.TaoHelper;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class sjj implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final BaseSectionModel f28087a;
    public final BaseSectionModel b;
    public final cfc c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements g6j<InfoFlowDeleteResult> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.g6j
        public void b(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8463ea48", new Object[]{this, mtopResponse});
                return;
            }
            fve.e("RItemDeleteListener", "deleteListener.onSystemFailure");
            a(mtopResponse);
        }

        /* renamed from: c */
        public void a(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb2ff8f7", new Object[]{this, mtopResponse});
                return;
            }
            sjj.b(sjj.this);
            sjj.c(sjj.this);
        }

        /* renamed from: d */
        public void onSuccess(InfoFlowDeleteResult infoFlowDeleteResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be8c15d3", new Object[]{this, infoFlowDeleteResult});
            } else {
                sjj.a(sjj.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f28089a;
        public final /* synthetic */ g6j b;

        public b(String str, g6j g6jVar) {
            this.f28089a = str;
            this.b = g6jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            JSONObject jSONObject = sjj.d(sjj.this).getJSONObject("template");
            JSONObject jSONObject2 = sjj.e(sjj.this).getJSONObject("ext");
            JSONObject jSONObject3 = sjj.d(sjj.this).getJSONObject("args");
            if (jSONObject2 != null && jSONObject3 != null) {
                new InfoFlowDeleteClient().execute(new InfoFlowDeleteParams.a().k(jSONObject2.getString("deleteId")).l(sjj.d(sjj.this).getString("index")).p(Login.getOldUserId()).m(jSONObject3.getString(yj4.PARAM_PVID)).n(this.f28089a).o(jSONObject == null ? null : jSONObject.getString("name")).j(), this.b, TaoHelper.getTTID());
            }
        }
    }

    static {
        t2o.a(491782499);
    }

    public sjj(cfc cfcVar, BaseSectionModel<?> baseSectionModel, BaseSectionModel<?> baseSectionModel2) {
        this.f28087a = baseSectionModel;
        this.b = baseSectionModel2;
        this.c = cfcVar;
    }

    public static /* synthetic */ void a(sjj sjjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2b5f42d", new Object[]{sjjVar});
        } else {
            sjjVar.f();
        }
    }

    public static /* synthetic */ void b(sjj sjjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68cc168c", new Object[]{sjjVar});
        } else {
            sjjVar.i();
        }
    }

    public static /* synthetic */ void c(sjj sjjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dee238eb", new Object[]{sjjVar});
        } else {
            sjjVar.j();
        }
    }

    public static /* synthetic */ BaseSectionModel d(sjj sjjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("4954a154", new Object[]{sjjVar});
        }
        return sjjVar.f28087a;
    }

    public static /* synthetic */ BaseSectionModel e(sjj sjjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("6bd3e695", new Object[]{sjjVar});
        }
        return sjjVar.b;
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53b6daaa", new Object[]{this});
            return;
        }
        ICardOverlayService iCardOverlayService = (ICardOverlayService) this.c.a(ICardOverlayService.class);
        if (iCardOverlayService != null) {
            iCardOverlayService.deleteOverlayHostCard(this.b);
        }
    }

    public final void g(g6j<InfoFlowDeleteResult> g6jVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eec36f2c", new Object[]{this, g6jVar, str});
        } else {
            Coordinator.execute(new b(str, g6jVar));
        }
    }

    public final g6j<InfoFlowDeleteResult> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g6j) ipChange.ipc$dispatch("ecefb3df", new Object[]{this});
        }
        return new a();
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4786e35", new Object[]{this});
            return;
        }
        ICardOverlayService iCardOverlayService = (ICardOverlayService) this.c.a(ICardOverlayService.class);
        if (iCardOverlayService != null) {
            iCardOverlayService.hideOverlay();
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ec58931", new Object[]{this});
        } else {
            TBToast.makeText(Globals.getApplication(), "网络不好，删除失败了\n/(ㄒoㄒ)/", 2000L).show();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        if (view.getTag() == null) {
            str = null;
        } else {
            str = view.getTag().toString();
        }
        g(h(), str);
    }
}
