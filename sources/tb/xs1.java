package tb;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.pop.IPopAnchorViewInfo;
import com.taobao.homepage.pop.protocol.model.pop.IPopConfig;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.protocol.model.pop.IPopPoint;
import com.taobao.homepage.pop.view.container.BasePopContainer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class xs1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f31573a = new Handler(Looper.getMainLooper());
    public final Map<Integer, Map<String, thm>> b = new ConcurrentHashMap(32);
    public final Map<String, thm> c = new ConcurrentHashMap();
    public final BasePopContainer d;
    public final pfw e;
    public xq1 f;
    public final e3b g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ thm f31574a;

        public a(thm thmVar) {
            this.f31574a = thmVar;
        }

        @Override // tb.xs1.d
        public void a(boolean z, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c46ae028", new Object[]{this, new Boolean(z), str});
            } else {
                xs1.a(xs1.this, this.f31574a, z, str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ thm f31575a;

        public b(thm thmVar) {
            this.f31575a = thmVar;
        }

        @Override // tb.xs1.d
        public void a(boolean z, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c46ae028", new Object[]{this, new Boolean(z), str});
                return;
            }
            vfm.f("BaseContainerTrigger ", "pop show success: " + z + " msg: " + str);
            xs1.a(xs1.this, this.f31575a, z, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ thm f31576a;
        public final /* synthetic */ d b;

        public c(thm thmVar, d dVar) {
            this.f31576a = thmVar;
            this.b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                xs1.this.i(this.f31576a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface d {
        void a(boolean z, String str);
    }

    public xs1(BasePopContainer basePopContainer, pfw pfwVar, e3b e3bVar) {
        this.d = basePopContainer;
        this.e = pfwVar;
        this.g = e3bVar;
    }

    public static /* synthetic */ void a(xs1 xs1Var, thm thmVar, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80dc2c9e", new Object[]{xs1Var, thmVar, new Boolean(z), str});
        } else {
            xs1Var.r(thmVar, z, str);
        }
    }

    public boolean b(thm thmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b958eeb4", new Object[]{this, thmVar})).booleanValue();
        }
        if (thmVar == null) {
            vfm.f("BaseContainerTrigger ", "checkReTriggerValid failed, triggerModel invalid");
            return false;
        } else if (this.g.n()) {
            return true;
        } else {
            vfm.f("BaseContainerTrigger ", "checkReTriggerValid failed, renderFinish false");
            return false;
        }
    }

    public boolean c(thm thmVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69d403e7", new Object[]{this, thmVar})).booleanValue();
        }
        if (thmVar == null) {
            vfm.f("BaseContainerTrigger ", "checkTriggerValid failed, triggerModel invalid");
            return false;
        } else if (!this.g.n()) {
            vfm.f("BaseContainerTrigger ", "checkTriggerValid failed, renderFinish false");
            return false;
        } else {
            BasePopContainer basePopContainer = this.d;
            if (basePopContainer == null) {
                vfm.f("BaseContainerTrigger ", "checkTriggerValid failed, container is null");
                return false;
            } else if (!n(basePopContainer) || s(this.d)) {
                int trigger = thmVar.a().getPopConfig().getTrigger();
                if (trigger != 0 && (trigger == 1 ? thmVar.c() == null : !(trigger == 3 || trigger == 5))) {
                    z = false;
                }
                vfm.c("BaseContainerTrigger ", "checkTriggerValid success, canDoTrigger=" + z);
                return z;
            } else {
                vfm.f("BaseContainerTrigger ", "checkTriggerValid failed, container is not attach");
                return false;
            }
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.f31573a.removeCallbacksAndMessages(null);
        ((ConcurrentHashMap) this.b).clear();
        ((ConcurrentHashMap) this.c).clear();
    }

    public void e(List<IPopData> list) {
        IPopConfig popConfig;
        IPopPoint point;
        e3b e3bVar;
        int a2;
        View findItemViewByPosition;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("901258b0", new Object[]{this, list});
            return;
        }
        if (list != null) {
            i = list.size();
        }
        vfm.c("BaseContainerTrigger ", "doDataRefreshTrigger, dataSize=" + i);
        if (i != 0) {
            for (IPopData iPopData : list) {
                if (!(iPopData == null || !iPopData.valid() || (popConfig = iPopData.getPopConfig()) == null || popConfig.getHierarchy() != 2 || (point = popConfig.getPoint()) == null || TextUtils.isEmpty(point.getSectionBizCode()) || (e3bVar = this.g) == null || (a2 = e3bVar.k().a(point.getSectionBizCode())) < 0 || (findItemViewByPosition = this.g.k().findItemViewByPosition(a2)) == null)) {
                    j(new thm(iPopData, a2, findItemViewByPosition));
                }
            }
        }
    }

    public void f(List<IPopData> list) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d3c8b0a", new Object[]{this, list});
            return;
        }
        if (list != null) {
            i = list.size();
        }
        vfm.c("BaseContainerTrigger ", "doDataRefreshTrigger, dataSize=" + i);
        if (i != 0) {
            for (IPopData iPopData : list) {
                if (iPopData != null) {
                    j(new thm(iPopData));
                }
            }
        }
    }

    public final void g(thm thmVar, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("945d164d", new Object[]{this, thmVar, dVar});
        } else {
            fet.a().g(new c(thmVar, dVar));
        }
    }

    public final void h(thm thmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3e4fab5", new Object[]{this, thmVar});
            return;
        }
        bgm.b("PopTargetCardReTrigger", thmVar.a());
        k(thmVar, true);
    }

    public abstract void i(thm thmVar, d dVar);

    public final void j(thm thmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29bc3662", new Object[]{this, thmVar});
            return;
        }
        bgm.b("PopTargetCardAttach", thmVar.a());
        k(thmVar, false);
    }

    public final void l(thm thmVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72ed0cd1", new Object[]{this, thmVar});
            return;
        }
        IPopData a2 = thmVar.a();
        x(thmVar);
        if (!osu.c(a2) || thmVar.d() == null || !thmVar.d().d(a2)) {
            osu.e(osu.b(this.g), "Error", 3, esu.ERROR_MSG_NO_POP_DATA);
            vfm.f("BaseContainerTrigger ", "doTriggerByUCP, ucp pop without a ucp signal or ucp signal not match");
        } else if (!this.g.n()) {
            vfm.f("BaseContainerTrigger ", "doTriggerByUCP, first frame not finish, save to pending");
            w(thmVar);
        } else {
            boolean c2 = c(thmVar);
            vfm.f("BaseContainerTrigger ", "doTrigger, canTrigger=" + c2 + ", bizId=" + thmVar.a().getBusinessID());
            if (!c2) {
                osu.e(thmVar.d(), "Error", 3, esu.ERROR_MSG_TARGET_VIEW_ERROR);
                return;
            }
            bgm.b("PopUCPShowPass", thmVar.a());
            if (thmVar.d() == null) {
                z = false;
            }
            vhm.g("UcpTriggerPopShow", "14", z, a2.getBusinessID());
            g(thmVar, new a(thmVar));
        }
    }

    public IPopAnchorViewInfo m(IPopData iPopData, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPopAnchorViewInfo) ipChange.ipc$dispatch("9e7ea61a", new Object[]{this, iPopData, new Integer(i)});
        }
        return this.f.d(iPopData, i);
    }

    public final boolean n(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f65d5a5", new Object[]{this, view})).booleanValue();
        }
        if (view.getParent() == null) {
            vfm.f("BaseContainerTrigger ", "========= isParentNotOnScreen=true, parent is null");
            return true;
        }
        boolean z = !((ViewGroup) view.getParent()).isShown();
        vfm.f("BaseContainerTrigger ", "=======isParentNotOnScreen=" + z);
        return z;
    }

    public boolean o(IPopData iPopData) {
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fe7d1e4", new Object[]{this, iPopData})).booleanValue();
        }
        String businessID = iPopData.getBusinessID();
        if (((ConcurrentHashMap) this.c).containsKey(businessID)) {
            return true;
        }
        IPopConfig popConfig = iPopData.getPopConfig();
        if (popConfig == null || (map = (Map) ((ConcurrentHashMap) this.b).get(Integer.valueOf(popConfig.getTrigger()))) == null) {
            return false;
        }
        return map.containsKey(businessID);
    }

    public void p(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26aa111d", new Object[]{this, dVar, new Boolean(z)});
        } else if (dVar != null) {
            vfm.f("BaseContainerTrigger ", "notifyTriggerResult, result=" + z);
            dVar.a(z, null);
        }
    }

    public void q(d dVar, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afba0da7", new Object[]{this, dVar, new Boolean(z), str});
        } else if (dVar != null) {
            vfm.f("BaseContainerTrigger ", "notifyTriggerResult, result=" + z);
            dVar.a(z, str);
        }
    }

    public final void r(thm thmVar, boolean z, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35d6e6a3", new Object[]{this, thmVar, new Boolean(z), str});
            return;
        }
        IPopData a2 = thmVar.a();
        if (osu.c(thmVar.a())) {
            if (z) {
                str2 = "12";
            } else {
                str2 = "13";
            }
            vhm.g("UcpTriggerPopShow", str2, true, a2.getBusinessID());
            if (z) {
                osu.e(thmVar.d(), "Expose", 0, str);
            } else {
                osu.e(thmVar.d(), "Error", 3, str);
            }
        }
    }

    public final boolean s(BasePopContainer basePopContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1585e08", new Object[]{this, basePopContainer})).booleanValue();
        }
        if (basePopContainer.getParent() != null) {
            ((ViewGroup) basePopContainer.getParent()).removeView(basePopContainer);
        }
        int hierarchy = basePopContainer.getHierarchy();
        vfm.f("BaseContainerTrigger ", "try to reAttach container, hierarchy=" + hierarchy);
        return this.g.e(hierarchy).l(basePopContainer);
    }

    public void t(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e8e36d0", new Object[]{this, new Integer(i)});
            return;
        }
        Map map = (Map) ((ConcurrentHashMap) this.b).get(Integer.valueOf(i));
        if (map != null && !map.isEmpty()) {
            ArrayList arrayList = new ArrayList(map.values());
            map.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                k((thm) it.next(), true);
            }
        }
    }

    public void u(IPopData iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5abc19da", new Object[]{this, iPopData});
            return;
        }
        thm thmVar = (thm) ((ConcurrentHashMap) this.c).remove(iPopData.getBusinessID());
        if (thmVar == null) {
            vfm.f("BaseContainerTrigger ", "reTriggerPopByUCP, pending is null");
            osu.e(osu.b(this.g), "Error", 3, esu.ERROR_OTHER_ERROR);
            return;
        }
        l(thmVar);
        vfm.f("BaseContainerTrigger ", "reTriggerPopByUCP");
    }

    public void v(IPopData iPopData) {
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d41f8ec1", new Object[]{this, iPopData});
            return;
        }
        String businessID = iPopData.getBusinessID();
        if (((ConcurrentHashMap) this.c).containsKey(businessID)) {
            ((ConcurrentHashMap) this.c).remove(businessID);
            return;
        }
        IPopConfig popConfig = iPopData.getPopConfig();
        if (popConfig != null && (map = (Map) ((ConcurrentHashMap) this.b).get(Integer.valueOf(popConfig.getTrigger()))) != null) {
            map.remove(businessID);
            vfm.f("BaseContainerTrigger ", "removeUcpPendingPop, key=" + businessID);
        }
    }

    public void w(thm thmVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed8eef30", new Object[]{this, thmVar});
            return;
        }
        IPopData a2 = thmVar == null ? null : thmVar.a();
        if (a2 == null || !a2.valid()) {
            StringBuilder sb = new StringBuilder("saveToPending faild, pop invalid, key=");
            if (a2 == null) {
                str = "null";
            } else {
                str = a2.getBusinessID();
            }
            sb.append(str);
            vfm.f("BaseContainerTrigger ", sb.toString());
            return;
        }
        int trigger = a2.getPopConfig().getTrigger();
        Map map = (Map) ((ConcurrentHashMap) this.b).get(Integer.valueOf(trigger));
        if (map == null) {
            map = new ConcurrentHashMap(16);
            ((ConcurrentHashMap) this.b).put(Integer.valueOf(trigger), map);
        }
        map.put(a2.getBusinessID(), thmVar);
        vfm.c("BaseContainerTrigger ", "saveToPending, key=" + a2.getBusinessID());
    }

    public final void x(thm thmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("642e43d", new Object[]{this, thmVar});
            return;
        }
        IPopData a2 = thmVar.a();
        esu b2 = osu.b(this.g);
        if (b2 == null) {
            thmVar.e(null);
        } else if (osu.c(a2) && b2.d(a2)) {
            thmVar.e(b2);
            vfm.f("BaseContainerTrigger ", "tryBindUCPSignal success.");
        }
    }

    public final void k(thm thmVar, boolean z) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcb48b2", new Object[]{this, thmVar, new Boolean(z)});
        } else if (thmVar == null) {
            vhm.g("UcpTriggerPopShow", "-1", false, "");
        } else {
            IPopData a2 = thmVar.a();
            if (!osu.c(a2)) {
                if (z) {
                    z2 = b(thmVar);
                } else {
                    z2 = c(thmVar);
                }
                vfm.f("BaseContainerTrigger ", "doTrigger, canTrigger=" + z2 + ", bizId=" + thmVar.a().getBusinessID());
                if (!z2) {
                    w(thmVar);
                } else {
                    g(thmVar, new b(thmVar));
                }
            } else if (z) {
                l(thmVar);
            } else {
                ((ConcurrentHashMap) this.c).put(a2.getBusinessID(), thmVar);
                vfm.f("BaseContainerTrigger ", "ucp pop pending to trigger, key=" + a2.getBusinessID());
            }
        }
    }
}
