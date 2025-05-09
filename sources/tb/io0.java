package tb;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.datamodel.linkage.UMFLinkageTrigger;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.internal.AliBuyPresenterImpl;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class io0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f21472a;
    public String b;
    public UMFLinkageTrigger c;
    public toq d;
    public final AURAGlobalData e;
    public final lo f;
    public final alq g;
    public Runnable i;
    public volatile boolean j;
    public final List<AURAEventIO> k = new ArrayList();
    public final Handler h = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ nbb f21473a;

        /* compiled from: Taobao */
        /* renamed from: tb.io0$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class C0948a extends pt {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0948a(a aVar) {
            }

            public static /* synthetic */ Object ipc$super(C0948a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/buy/extension/stream/AliBuyStreamResponseProcessor$1$1");
            }

            @Override // tb.pt, tb.hbb
            public void b(mi miVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
                } else {
                    jo0.d(miVar.e());
                }
            }
        }

        public a(nbb nbbVar) {
            this.f21473a = nbbVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!io0.a(io0.this).isEmpty() && !io0.b(io0.this)) {
                for (AURAEventIO aURAEventIO : io0.a(io0.this)) {
                    if (io0.c(io0.this, aURAEventIO)) {
                        io0.d(io0.this, aURAEventIO);
                    }
                    this.f21473a.c("aura.workflow.event", aURAEventIO, new C0948a(this));
                }
                io0.a(io0.this).clear();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            io0.e(io0.this, false);
            io0.f(io0.this);
            io0.this.j();
        }
    }

    static {
        t2o.a(301990010);
    }

    public io0(lo loVar, AURAGlobalData aURAGlobalData) {
        this.f = loVar;
        this.e = aURAGlobalData;
        this.g = (alq) loVar.g(wt.USERDATA_KEY_STATUS_MANAGER, alq.class);
    }

    public static /* synthetic */ List a(io0 io0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c7c27e83", new Object[]{io0Var});
        }
        return io0Var.k;
    }

    public static /* synthetic */ boolean b(io0 io0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6134e7", new Object[]{io0Var})).booleanValue();
        }
        return io0Var.j;
    }

    public static /* synthetic */ boolean c(io0 io0Var, AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fc74bf2", new Object[]{io0Var, aURAEventIO})).booleanValue();
        }
        return io0Var.q(aURAEventIO);
    }

    public static /* synthetic */ void d(io0 io0Var, AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e65c0d", new Object[]{io0Var, aURAEventIO});
        } else {
            io0Var.t(aURAEventIO);
        }
    }

    public static /* synthetic */ void e(io0 io0Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5740c114", new Object[]{io0Var, new Boolean(z)});
        } else {
            io0Var.y(z);
        }
    }

    public static /* synthetic */ void f(io0 io0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e667b5f", new Object[]{io0Var});
        } else {
            io0Var.k();
        }
    }

    public void A(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3548168f", new Object[]{this, new Boolean(z)});
        } else {
            this.f21472a = z;
        }
    }

    public void B(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d67948f1", new Object[]{this, aURAEventIO});
            return;
        }
        y(true);
        g(aURAEventIO);
        x(l0r.DEFAULT_TCP_CONNECT_TIMEOUT_MS);
    }

    public void g(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41890066", new Object[]{this, aURAEventIO});
        } else {
            ((ArrayList) this.k).add(aURAEventIO);
        }
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95c0bbde", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.b = null;
        this.c = null;
        ((ArrayList) this.k).clear();
        this.j = false;
        this.f21472a = false;
        Runnable runnable = this.i;
        if (runnable != null) {
            this.h.removeCallbacks(runnable);
        }
    }

    public final AURARenderComponent m(List<AURARenderComponent> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("f5b61047", new Object[]{this, list, str});
        }
        if (list != null && !TextUtils.isEmpty(str)) {
            for (AURARenderComponent aURARenderComponent : list) {
                if (str.equals(aURARenderComponent.key)) {
                    return aURARenderComponent;
                }
            }
        }
        return null;
    }

    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3bb648ae", new Object[]{this});
        }
        return this.b;
    }

    public toq o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (toq) ipChange.ipc$dispatch("caac3acb", new Object[]{this});
        }
        return this.d;
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d35894fb", new Object[]{this})).booleanValue();
        }
        toq toqVar = this.d;
        if (toqVar == null || !toqVar.b() || !this.d.c()) {
            return false;
        }
        return true;
    }

    public final boolean q(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("871336ff", new Object[]{this, aURAEventIO})).booleanValue();
        }
        return ml.EVENT_TYPE.equals(aURAEventIO.getEventType());
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("893bfe7", new Object[]{this})).booleanValue();
        }
        if (!p() || !this.f21472a) {
            return false;
        }
        return true;
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2185b711", new Object[]{this});
        } else {
            u();
        }
    }

    public final void t(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaf6daa7", new Object[]{this, aURAEventIO});
            return;
        }
        qi eventModel = aURAEventIO.getEventModel();
        AURARenderComponent j = eventModel.j();
        if (j != null) {
            eventModel.t(m((List) this.e.get("render_view_item_models", List.class), j.key));
        }
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6d8a2be", new Object[]{this});
            return;
        }
        Runnable runnable = this.i;
        if (runnable != null) {
            this.h.removeCallbacks(runnable);
        }
    }

    public void w(UMFLinkageTrigger uMFLinkageTrigger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69bc11af", new Object[]{this, uMFLinkageTrigger});
        } else {
            this.c = uMFLinkageTrigger;
        }
    }

    public final void x(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25f65737", new Object[]{this, new Long(j)});
            return;
        }
        b bVar = new b();
        this.i = bVar;
        this.h.postDelayed(bVar, j);
    }

    public void z(toq toqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8788649e", new Object[]{this, toqVar});
        } else {
            this.d = toqVar;
        }
    }

    public void l(nbb nbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("facda71d", new Object[]{this, nbbVar});
        } else if (((ArrayList) this.k).isEmpty()) {
            ck.g().e("stream", "AppendingEvents is null.");
        } else {
            y(false);
            ck.g().e("stream", "dispatchPendingEvent.");
            dn.e(new a(nbbVar));
        }
    }

    public final void y(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25b67fb3", new Object[]{this, new Boolean(z)});
        } else if (this.g != null) {
            rbb g = ck.g();
            g.e("stream", "showLoading :" + z);
            if (z) {
                this.g.k(2);
            } else {
                this.g.b();
            }
        }
    }

    public final JSONArray i(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("7f09ebed", new Object[]{this, strArr});
        }
        JSONArray jSONArray = new JSONArray();
        for (String str : strArr) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", (Object) str);
            jSONArray.add(jSONObject);
        }
        return jSONArray;
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2c28925", new Object[]{this});
            return;
        }
        AliBuyPresenterImpl aliBuyPresenterImpl = (AliBuyPresenterImpl) this.f.g(AliBuyPresenterImpl.class.getSimpleName(), AliBuyPresenterImpl.class);
        if (aliBuyPresenterImpl != null) {
            ck.g().e("stream", "show error popup.");
            jo0.d("STREAM_DATA_TIME_OUT_ERROR");
            this.j = true;
            this.f21472a = false;
            aliBuyPresenterImpl.e(new pm0().i(Localization.q(R.string.app_wait_a_minute)).g("STREAM_DATA_TIMEOUT").h(Localization.q(R.string.taobao_app_1029_1_17497)).a(Localization.q(R.string.app_back), i("pop")).b(Localization.q(R.string.taobao_app_1029_1_17514), i("refresh")).d());
        }
    }

    public boolean v(nbb nbbVar, AURAGlobalData aURAGlobalData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da18dc52", new Object[]{this, nbbVar, aURAGlobalData})).booleanValue();
        }
        if (this.c == null) {
            ck.g().e("stream", "UMFLinkageTrigger is null.");
            return false;
        } else if (TextUtils.isEmpty(this.b)) {
            ck.g().e("stream", "queryParams is null.");
            return false;
        } else {
            toq toqVar = this.d;
            if (toqVar != null) {
                toqVar.a();
            }
            ck.g().e("stream", "STREAM_QP_EXCEPTION");
            jo0.d("STREAM_QP_TAIR_EXCEPTION");
            nbbVar.c("aura.workflow.adjust", this.c, null);
            return true;
        }
    }
}
