package com.alibaba.poplayer.layermanager;

import android.app.Activity;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Window;
import android.widget.LinearLayout;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.exception.PoplayerException;
import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.layermanager.config.BizConfig;
import com.alibaba.poplayer.layermanager.config.ConfigItem;
import com.alibaba.poplayer.layermanager.d;
import com.alibaba.poplayer.layermanager.view.PopLayerViewContainer;
import com.alibaba.poplayer.trigger.InternalTriggerController;
import com.alibaba.poplayer.trigger.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.dua;
import tb.eig;
import tb.hst;
import tb.ill;
import tb.lig;
import tb.lyv;
import tb.pjc;
import tb.pkb;
import tb.t2o;
import tb.wdm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String f = d.class.getSimpleName();
    public static d g;

    /* renamed from: a  reason: collision with root package name */
    public final eig f2532a;
    public final pjc b;
    public BizConfig c;
    public final ArrayList<PopRequest> d = new ArrayList<>();
    public final Map<String, Map<String, pkb>> e = new ConcurrentHashMap();

    static {
        t2o.a(625999950);
    }

    public d(pjc pjcVar) {
        this.b = pjcVar;
        this.f2532a = new eig(pjcVar);
    }

    public static d t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("5a28b28", new Object[0]);
        }
        return g;
    }

    public void A(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0b17d7", new Object[]{this, popRequest});
        } else if (popRequest != null) {
            ArrayList<? extends PopRequest> arrayList = new ArrayList<>();
            arrayList.add(popRequest);
            B(arrayList);
        }
    }

    public void B(final ArrayList<? extends PopRequest> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7e1e37f", new Object[]{this, arrayList});
        } else {
            hst.c(new Runnable() { // from class: tb.jig
                @Override // java.lang.Runnable
                public final void run() {
                    d.this.w(arrayList);
                }
            });
        }
    }

    public final dua<pkb, PopRequest> C(ArrayList<? extends PopRequest> arrayList) throws PoplayerException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dua) ipChange.ipc$dispatch("6f159324", new Object[]{this, arrayList});
        }
        dua<pkb, PopRequest> duaVar = new dua<>();
        Iterator<? extends PopRequest> it = arrayList.iterator();
        while (it.hasNext()) {
            PopRequest popRequest = (PopRequest) it.next();
            if (!this.d.isEmpty() && this.d.contains(popRequest)) {
                this.d.remove(popRequest);
            } else if (popRequest.z()) {
                wdm.d("LayerManager.removeAdjustRequests=> but status = remove.uuid=%s", a.P(popRequest));
            } else if (popRequest.m() == null || !(popRequest.m() instanceof b)) {
                wdm.d("LayerManager.removeAdjustRequests=> but popParam is empty or but InnerPopParam.uuid=%s", a.P(popRequest));
            } else {
                pkb i = i(popRequest);
                if (i == null) {
                    wdm.d("LayerManager.removeAdjustRequests=> find canvas view model fail.uuid=%s", a.P(popRequest));
                } else {
                    duaVar.c(i, popRequest);
                }
            }
        }
        return duaVar;
    }

    public final pkb D(Activity activity, String str) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pkb) ipChange.ipc$dispatch("dfef5bd", new Object[]{this, activity, str});
        }
        String activityKeyCode = InternalTriggerController.getActivityKeyCode(activity);
        ill m = m(activityKeyCode, str);
        if (m != null) {
            z = true;
        } else {
            z = false;
        }
        wdm.d("%s.resetActivityViewModels: find pageVM : %s.", f, Boolean.valueOf(z));
        if (m == null) {
            m = new ill(activity);
            f(activityKeyCode, m, o(str));
        }
        m.g(activity);
        return m;
    }

    public void E(Activity activity, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7732806d", new Object[]{this, activity, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        } else if (!z3 || !z) {
            try {
                z(D(activity, InternalTriggerController.getCurKeyCode()));
                wdm.d("%s.currentActivity is: %s. curUri is %s", f, InternalTriggerController.getCurUri(), InternalTriggerController.getCurUri());
                if (!z3 || !z2) {
                    I();
                }
            } catch (Throwable th) {
                wdm.h("LayerManager.touchActivity.error.", th);
            }
        } else {
            wdm.d("%s.touchActivity.is same page.", f);
        }
    }

    public final dua<pkb, PopRequest> F(ArrayList<? extends PopRequest> arrayList, String str, String str2) throws PoplayerException {
        ConfigItem configItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dua) ipChange.ipc$dispatch("f6920325", new Object[]{this, arrayList, str, str2});
        }
        dua<pkb, PopRequest> duaVar = new dua<>();
        Iterator<? extends PopRequest> it = arrayList.iterator();
        while (it.hasNext()) {
            PopRequest popRequest = (PopRequest) it.next();
            if (popRequest.o() != PopRequest.Status.SHOWING) {
                wdm.d("%s.tryAdjustRequests=> saveEmbed but status not in showing", f);
            } else {
                BizConfig bizConfig = this.c;
                if (bizConfig == null || (configItem = bizConfig.findConfig(popRequest.j())) == null) {
                    wdm.d("%s.tryAdjustRequests.not find ConfigRule,use default.", f);
                    configItem = new ConfigItem();
                }
                pkb j = j(str, str2);
                if (j == null) {
                    wdm.d("%s.tryAdjustRequests=> find canvas view model fail.", f);
                } else {
                    if (!(popRequest.m() instanceof b)) {
                        popRequest.G(new b(popRequest.m(), configItem));
                    }
                    duaVar.c(j, popRequest);
                }
            }
        }
        return duaVar;
    }

    public final dua<pkb, PopRequest> G(List<? extends PopRequest> list) throws PoplayerException {
        ConfigItem configItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dua) ipChange.ipc$dispatch("37b0145e", new Object[]{this, list});
        }
        dua<pkb, PopRequest> duaVar = new dua<>();
        for (PopRequest popRequest : list) {
            popRequest.k().n0 = SystemClock.elapsedRealtime();
            if (popRequest.o() == PopRequest.Status.WAITING || popRequest.o() == PopRequest.Status.SHOWING) {
                BizConfig bizConfig = this.c;
                if (bizConfig == null || (configItem = bizConfig.findConfig(popRequest.j())) == null) {
                    wdm.d("%s.tryAdjustRequests.not find ConfigRule,use default.", f);
                    configItem = new ConfigItem();
                }
                pkb i = i(popRequest);
                if (i == null) {
                    wdm.d("%s.tryAdjustRequests=> find canvas view model fail.", f);
                } else {
                    if (!(popRequest.m() instanceof b)) {
                        popRequest.G(new b(popRequest.m(), configItem));
                    }
                    duaVar.c(i, popRequest);
                }
            } else {
                wdm.d("%s.tryAdjustRequests=> add but status not in (waiting or showing)", f);
            }
        }
        return duaVar;
    }

    public void H(final List<? extends PopRequest> list) throws PoplayerException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe11659d", new Object[]{this, list});
        } else if (this.f2532a.c()) {
            for (PopRequest popRequest : list) {
                wdm.g(wdm.CATEGORY_TRIGGER_EVENT, a.P(popRequest), "LayerManager.tryOpen,but LayerMgr`configs not ready.Saving");
            }
            this.d.addAll(list);
        } else {
            hst.c(new Runnable() { // from class: tb.gig
                @Override // java.lang.Runnable
                public final void run() {
                    d.this.x(list);
                }
            });
        }
    }

    public void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1914c5", new Object[]{this});
            return;
        }
        String curUri = InternalTriggerController.getCurUri();
        if (!TextUtils.isEmpty(curUri)) {
            this.c = this.f2532a.b(curUri);
        }
        if (!this.d.isEmpty()) {
            H(this.d);
            this.d.clear();
        }
    }

    public void e(final PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfe3f6b4", new Object[]{this, popRequest});
        } else if (popRequest.o() != PopRequest.Status.READY) {
            wdm.d("LayerManager.viewReadyNotify=> add but status != READY.", new Object[0]);
        } else if (!(popRequest.m() instanceof b)) {
            wdm.d("LayerManager.viewReadyNotify=> add but popParam not InnerPopParam", new Object[0]);
        } else if (popRequest.i() == null) {
            wdm.d("LayerManager.viewReadyNotify=>layer is empty.", new Object[0]);
        } else {
            hst.c(new Runnable() { // from class: tb.iig
                @Override // java.lang.Runnable
                public final void run() {
                    d.this.u(popRequest);
                }
            });
        }
    }

    public void f(String str, pkb pkbVar, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54187dcf", new Object[]{this, str, pkbVar, str2});
            return;
        }
        Map<String, pkb> h = h(str);
        if (h != null) {
            h.put(str2, pkbVar);
        }
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ba74c4f", new Object[]{this, str});
        } else {
            ((ConcurrentHashMap) this.e).remove(str);
        }
    }

    public Map<String, pkb> h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3daec541", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (((ConcurrentHashMap) this.e).containsKey(str)) {
            return (Map) ((ConcurrentHashMap) this.e).get(str);
        }
        HashMap hashMap = new HashMap();
        ((ConcurrentHashMap) this.e).put(str, hashMap);
        return hashMap;
    }

    public pkb i(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pkb) ipChange.ipc$dispatch("4cf3fa87", new Object[]{this, popRequest});
        }
        Activity c = popRequest.c();
        if (c == null) {
            return null;
        }
        return m(InternalTriggerController.getActivityKeyCode(c), popRequest.h());
    }

    public pkb j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pkb) ipChange.ipc$dispatch("41277b59", new Object[]{this, str, str2});
        }
        return m(str, str2);
    }

    public PopLayerViewContainer k(Activity activity) {
        Window window;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopLayerViewContainer) ipChange.ipc$dispatch("d3cf990d", new Object[]{this, activity});
        }
        PopLayerViewContainer l = l(activity);
        if (l != null) {
            return l;
        }
        if (lyv.k(activity)) {
            activity = activity.getParent();
        }
        PopLayerViewContainer popLayerViewContainer = new PopLayerViewContainer(activity);
        popLayerViewContainer.setId(R.id.layermanager_penetrate_webview_container_id);
        popLayerViewContainer.setVisibility(0);
        popLayerViewContainer.setImportantForAccessibility(2);
        if (lyv.k(activity)) {
            window = activity.getParent().getWindow();
        } else {
            window = activity.getWindow();
        }
        window.addContentView(popLayerViewContainer, new LinearLayout.LayoutParams(-1, -1));
        popLayerViewContainer.bringToFront();
        return popLayerViewContainer;
    }

    public PopLayerViewContainer l(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopLayerViewContainer) ipChange.ipc$dispatch("ad69e8a3", new Object[]{this, activity});
        }
        if (lyv.k(activity)) {
            activity = activity.getParent();
        }
        return (PopLayerViewContainer) activity.getWindow().findViewById(R.id.layermanager_penetrate_webview_container_id);
    }

    public ill m(String str, String str2) {
        Map<String, pkb> h;
        pkb pkbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ill) ipChange.ipc$dispatch("5b072882", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str2) || (h = h(str)) == null || (pkbVar = h.get(o(str2))) == null) {
            return null;
        }
        return (ill) pkbVar;
    }

    public eig n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eig) ipChange.ipc$dispatch("8aba85eb", new Object[]{this});
        }
        return this.f2532a;
    }

    public String o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7cb9284a", new Object[]{this, str});
        }
        return str + "_pagecvm";
    }

    public PopLayerViewContainer p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopLayerViewContainer) ipChange.ipc$dispatch("5cbeec3c", new Object[]{this});
        }
        return l(PopLayer.getReference().internalGetCurrentActivity());
    }

    public void q(final ArrayList<? extends PopRequest> arrayList, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("899ce3e5", new Object[]{this, arrayList, str, str2});
        } else {
            hst.c(new Runnable() { // from class: tb.hig
                @Override // java.lang.Runnable
                public final void run() {
                    d.this.v(arrayList, str, str2);
                }
            });
        }
    }

    public boolean r(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a5436d1", new Object[]{this, activity, str})).booleanValue();
        }
        ill m = m(InternalTriggerController.getActivityKeyCode(activity), str);
        if (m == null || !m.i()) {
            return false;
        }
        return true;
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        if (g == null) {
            g = this;
        }
        ((lig) this.b).f(this);
        ((lig) this.b).b(this);
    }

    public final /* synthetic */ void u(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88b5222f", new Object[]{this, popRequest});
            return;
        }
        pkb i = i(popRequest);
        if (i == null) {
            wdm.d("LayerManager.viewReadyNotify=>findCanvasViewModel cvm is null.", new Object[0]);
        } else {
            i.e(popRequest);
        }
    }

    public final /* synthetic */ void v(ArrayList arrayList, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8fcbc45", new Object[]{this, arrayList, str, str2});
            return;
        }
        dua<pkb, PopRequest> F = F(arrayList, str, str2);
        for (pkb pkbVar : F.b().keySet()) {
            pkbVar.d(F.a(pkbVar));
        }
    }

    public final /* synthetic */ void w(ArrayList arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef700ca2", new Object[]{this, arrayList});
            return;
        }
        dua<pkb, PopRequest> C = C(arrayList);
        for (pkb pkbVar : C.b().keySet()) {
            pkbVar.a(C.a(pkbVar));
        }
    }

    public final /* synthetic */ void x(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baaaf43a", new Object[]{this, list});
            return;
        }
        dua<pkb, PopRequest> G = G(list);
        for (pkb pkbVar : G.b().keySet()) {
            pkbVar.c(G.a(pkbVar));
        }
    }

    public int y(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("91e52d3f", new Object[]{this, popRequest})).intValue();
        }
        pkb i = i(popRequest);
        if (i != null) {
            return i.f(popRequest);
        }
        wdm.d("LayerManager.notifyDisplay=>findCanvasViewModel cvm is null.", new Object[0]);
        return -1;
    }

    public final void z(pkb pkbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe3ff1de", new Object[]{this, pkbVar});
        } else {
            pkbVar.b();
        }
    }
}
