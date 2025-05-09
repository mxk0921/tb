package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.view.container.BasePopContainer;
import com.taobao.homepage.pop.viewmodel.PopDataViewModel;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class sfm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final PopDataViewModel f28014a;
    public final tfm b;
    public final e3b c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pad f28015a;
        public final /* synthetic */ BasePopContainer b;

        public a(pad padVar, BasePopContainer basePopContainer) {
            this.f28015a = padVar;
            this.b = basePopContainer;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                sfm.a(sfm.this, this.f28015a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pad f28016a;

        public b(pad padVar) {
            this.f28016a = padVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                sfm.b(sfm.this, (bbd) this.f28016a);
            }
        }
    }

    public sfm(e3b e3bVar, PopDataViewModel popDataViewModel, tfm tfmVar) {
        this.c = e3bVar;
        this.f28014a = popDataViewModel;
        this.b = tfmVar;
    }

    public static /* synthetic */ boolean a(sfm sfmVar, pad padVar, BasePopContainer basePopContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e9afa1f", new Object[]{sfmVar, padVar, basePopContainer})).booleanValue();
        }
        return sfmVar.c(padVar, basePopContainer);
    }

    public static /* synthetic */ void b(sfm sfmVar, bbd bbdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5de81204", new Object[]{sfmVar, bbdVar});
        } else {
            sfmVar.i(bbdVar);
        }
    }

    public final boolean c(pad padVar, BasePopContainer basePopContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("111615fb", new Object[]{this, padVar, basePopContainer})).booleanValue();
        }
        int hierarchy = basePopContainer.getHierarchy();
        if (!padVar.l(basePopContainer)) {
            vfm.f("HomePopEngine ", "attachContainer failed, hierarchy=" + hierarchy);
            return false;
        }
        vfm.f("HomePopEngine ", "attachContainer success, hierarchy=" + hierarchy + ", container:" + basePopContainer.hashCode());
        basePopContainer.refreshData(this.c, this.f28014a);
        basePopContainer.setPopListenerRegister(this.b);
        if (padVar instanceof bbd) {
            fet.a().f(new b(padVar), 0L);
        }
        return true;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74790120", new Object[]{this});
            return;
        }
        vfm.c("HomePopEngine ", "destroyPopEngine");
        this.f28014a.destroy();
        this.c.f().b();
        this.c.g().d();
    }

    public final pad e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pad) ipChange.ipc$dispatch("26b3ad1d", new Object[]{this, new Integer(i)});
        }
        if (i == 0) {
            return this.c.m();
        }
        if (i == 1) {
            return this.c.h();
        }
        if (i != 3) {
            return this.c.k();
        }
        return this.c.d();
    }

    public final void f(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa540f93", new Object[]{this, context, new Integer(i)});
        } else if (context != null) {
            BasePopContainer a2 = this.c.f().a(context, i);
            pad e = e(i);
            if (!c(e, a2)) {
                fet.a().f(new a(e, a2), 0L);
            }
        }
    }

    public void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26ca533e", new Object[]{this, context});
            return;
        }
        f(context, 3);
        f(context, 2);
        f(context, 1);
        f(context, 0);
    }

    public boolean h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c34ab62e", new Object[]{this, str})).booleanValue();
        }
        IPopData popDataByBusinessId = this.f28014a.getPopDataByBusinessId(str);
        if (popDataByBusinessId == null) {
            return false;
        }
        return this.c.f().j(popDataByBusinessId);
    }

    public final void i(bbd bbdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c014da", new Object[]{this, bbdVar});
            return;
        }
        int[] visiblePositionRange = bbdVar.getVisiblePositionRange();
        if (visiblePositionRange != null && visiblePositionRange.length >= 2 && visiblePositionRange[0] <= visiblePositionRange[1]) {
            if (!this.c.n()) {
                e3b.u();
            }
            for (int i = visiblePositionRange[0]; i <= visiblePositionRange[1]; i++) {
                View findItemViewByPosition = bbdVar.findItemViewByPosition(i);
                String g = bbdVar.g(i);
                if (findItemViewByPosition != null && !TextUtils.isEmpty(g)) {
                    this.c.j().h(i, findItemViewByPosition, g);
                }
            }
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43f73c23", new Object[]{this});
            return;
        }
        e3b.u();
        this.c.f().k();
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("938dadf2", new Object[]{this});
        } else {
            this.c.o();
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0c238d3", new Object[]{this});
        } else {
            this.c.p();
        }
    }

    public boolean n(boolean z, String str, List<JSONObject> list) {
        Map<String, IPopData> allPopData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f8f924f", new Object[]{this, new Boolean(z), str, list})).booleanValue();
        }
        boolean updateViewModel = this.f28014a.updateViewModel(this.c, list, z, str);
        vfm.f("HomePopEngine ", "refreshPops, update=" + updateViewModel + ", size=" + this.f28014a.getPopSize() + ", requestType=" + str);
        if (!updateViewModel || (allPopData = this.f28014a.getAllPopData()) == null) {
            return updateViewModel;
        }
        Collection<IPopData> a2 = osu.a(allPopData.values());
        if (a2 != null && !a2.isEmpty() && z && !TextUtils.equals(str, "coldStart")) {
            this.c.g().j("request", str);
        }
        this.c.f().z(this.c, this.f28014a);
        return updateViewModel;
    }

    public void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbf4c8e9", new Object[]{this, str});
            return;
        }
        IPopData popDataByBusinessId = this.f28014a.getPopDataByBusinessId(str);
        if (popDataByBusinessId != null) {
            this.c.f().B(popDataByBusinessId);
        }
    }

    public void p(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eafe012", new Object[]{this, str, jSONObject});
        } else {
            this.c.g().i();
        }
    }

    public void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1ac4d7", new Object[]{this, str});
            return;
        }
        Map<String, IPopData> allPopData = this.f28014a.getAllPopData();
        if (allPopData == null) {
            osu.e(osu.b(this.c), "Error", 3, esu.ERROR_MSG_NO_POP_DATA);
            vfm.f("HomePopEngine ", "reTriggerByUCP, popDataMap is null");
            return;
        }
        IPopData<?> iPopData = allPopData.get(str);
        if (!osu.c(iPopData)) {
            vfm.f("HomePopEngine ", "reTriggerByUCP, popDataMap is null, or not ucp pop " + str);
            osu.e(this.c.g().f(), "Error", 3, esu.ERROR_MSG_NO_POP_DATA);
            return;
        }
        vhm.g("UcpInfoMatchPop", "1", true, str);
        this.c.f().x(iPopData);
        vfm.f("HomePopEngine ", "reTriggerByUCP");
    }
}
