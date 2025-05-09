package com.alibaba.poplayer.layermanager;

import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.alibaba.poplayer.trigger.a;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.d0j;
import tb.nig;
import tb.t2o;
import tb.tww;
import tb.wdm;
import tb.wgm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public PopRequest f2531a;
    public final int e;
    public int f = 0;
    public final tww b = new tww();
    public volatile boolean c = false;
    public volatile boolean d = false;

    static {
        t2o.a(625999949);
    }

    public c(int i) {
        this.e = i;
    }

    public static PopRequest e(List<PopRequest> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopRequest) ipChange.ipc$dispatch("534ef8ea", new Object[]{list});
        }
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int i4 = list.get(i3).m().f2528a;
            if (i4 > i2) {
                i = i3;
                i2 = i4;
            }
        }
        if (i >= 0) {
            return list.get(i);
        }
        return null;
    }

    public static PopRequest f(List<PopRequest> list, PopRequest popRequest) {
        PopRequest popRequest2;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopRequest) ipChange.ipc$dispatch("80331680", new Object[]{list, popRequest});
        }
        if (list == null) {
            return null;
        }
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (list.get(i4).m().c && (i = list.get(i4).m().f2528a) > i3) {
                i2 = i4;
                i3 = i;
            }
        }
        if (i2 >= 0) {
            popRequest2 = list.get(i2);
        } else {
            popRequest2 = null;
        }
        if (popRequest2 == null || popRequest2.m().f2528a > popRequest.m().f2528a) {
            return popRequest2;
        }
        return null;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        } else {
            this.c = false;
        }
    }

    public void c(List<PopRequest> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15a0c464", new Object[]{this, list});
        } else if (list != null) {
            Iterator<PopRequest> it = list.iterator();
            while (it.hasNext()) {
                PopRequest next = it.next();
                if (!nig.a(next)) {
                    it.remove();
                    wgm.a(next, PopRequest.Status.REMOVED);
                }
            }
        }
    }

    public PopRequest d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopRequest) ipChange.ipc$dispatch("6393253a", new Object[]{this});
        }
        return this.f2531a;
    }

    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ca32f48", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public void h(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce856563", new Object[]{this, popRequest});
        } else if (popRequest != this.f2531a) {
        } else {
            if (popRequest.w() || popRequest.y() || popRequest.t()) {
                this.d = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean i() {
        /*
            r5 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.alibaba.poplayer.layermanager.c.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "a7743a6d"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r5
            java.lang.Object r0 = r2.ipc$dispatch(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0019:
            tb.jd0 r2 = tb.jd0.c()
            com.alibaba.poplayer.norm.IModuleSwitchAdapter r2 = r2.a()
            com.alibaba.poplayer.layermanager.PopRequest r3 = r5.f2531a
            if (r3 == 0) goto L_0x0032
            if (r2 == 0) goto L_0x0031
            java.lang.String r3 = r3.q()
            boolean r3 = r2.ignoreViewType(r3)
            if (r3 != 0) goto L_0x0032
        L_0x0031:
            return r1
        L_0x0032:
            tb.tww r3 = r5.b
            java.util.List r3 = r3.b()
            java.util.Iterator r3 = r3.iterator()
        L_0x003c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0055
            java.lang.Object r4 = r3.next()
            com.alibaba.poplayer.layermanager.PopRequest r4 = (com.alibaba.poplayer.layermanager.PopRequest) r4
            if (r2 == 0) goto L_0x0054
            java.lang.String r4 = r4.q()
            boolean r4 = r2.ignoreViewType(r4)
            if (r4 != 0) goto L_0x003c
        L_0x0054:
            return r1
        L_0x0055:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.poplayer.layermanager.c.i():boolean");
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("278b3153", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad963331", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("47524533", new Object[]{this})).intValue();
        }
        int i = this.f + 1;
        this.f = i;
        return i;
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bff04c7", new Object[]{this});
        } else if (this.f2531a == null) {
            this.f = 0;
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42b3a6a2", new Object[]{this});
        } else {
            this.c = true;
        }
    }

    public void o(List<PopRequest> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5fcfb09", new Object[]{this, list});
            return;
        }
        PopRequest popRequest = null;
        if (list.contains(this.f2531a)) {
            this.c = true;
            wgm.a(this.f2531a, PopRequest.Status.REMOVED);
            list.remove(this.f2531a);
            this.f2531a = null;
            this.d = false;
        }
        for (PopRequest popRequest2 : list) {
            wgm.a(popRequest2, PopRequest.Status.REMOVED);
        }
        this.b.e(list);
        if (this.f2531a == null) {
            while (true) {
                PopRequest c = this.b.c();
                if (c == null) {
                    break;
                }
                if (nig.a(c) && nig.b(c)) {
                    popRequest = c;
                    break;
                }
                wgm.a(c, PopRequest.Status.REMOVED);
            }
            if (popRequest != null) {
                this.f2531a = popRequest;
                this.c = true;
                if (popRequest.i() == null) {
                    wgm.a(popRequest, PopRequest.Status.READY);
                    return;
                }
                return;
            }
            wdm.d("LayerInfo.removePopRequests.syncFirstShowPopProcessDone1.", new Object[0]);
        }
    }

    public void a(List<PopRequest> list) {
        PopRequest popRequest;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4edb74c", new Object[]{this, list});
            return;
        }
        c(list);
        if (list == null) {
            list = new ArrayList<>();
        }
        if (this.d && (popRequest = this.f2531a) != null && popRequest.z()) {
            this.f2531a = null;
        }
        PopRequest popRequest2 = this.f2531a;
        if (popRequest2 != null) {
            PopRequest f = f(list, popRequest2);
            if (f != null) {
                this.c = true;
                this.f2531a.k().c0 = OnePopModule.OnePopLoseReasonCode.LMLifeCycleForceDrop;
                wgm.a(this.f2531a, PopRequest.Status.FORCE_REMOVED);
                wdm.g("pageLifeCycle", a.P(this.f2531a), "onReady.forceDrop");
                this.f2531a = f;
                list.remove(f);
            } else {
                if (this.d) {
                    this.c = true;
                }
                list.remove(this.f2531a);
            }
            for (PopRequest popRequest3 : list) {
                if (popRequest3.m().b) {
                    this.b.a(popRequest3);
                    wgm.a(popRequest3, PopRequest.Status.ENQUEUED);
                } else {
                    popRequest3.k().c0 = OnePopModule.OnePopLoseReasonCode.LMLifeCycleDrop;
                    d0j.h((a) popRequest3);
                    wgm.a(popRequest3, PopRequest.Status.REMOVED);
                    wdm.g("pageLifeCycle", a.P(popRequest3), "onReady.drop");
                }
            }
            if (f != null && f.i() == null) {
                wdm.g("pageLifeCycle", a.P(f), "onReady.directlyShow");
                wgm.a(f, PopRequest.Status.READY);
            }
        } else if (list.isEmpty()) {
            this.d = false;
            return;
        } else {
            PopRequest e = e(list);
            this.f2531a = e;
            this.c = true;
            list.remove(e);
            for (PopRequest popRequest4 : list) {
                if (popRequest4.m().b) {
                    this.b.a(popRequest4);
                    wgm.a(popRequest4, PopRequest.Status.ENQUEUED);
                } else {
                    popRequest4.k().c0 = OnePopModule.OnePopLoseReasonCode.LMLifeCycleDrop;
                    d0j.h((a) popRequest4);
                    wgm.a(popRequest4, PopRequest.Status.REMOVED);
                    wdm.g("pageLifeCycle", a.P(popRequest4), "onReady.drop");
                }
            }
            PopRequest popRequest5 = this.f2531a;
            if (popRequest5 != null && popRequest5.i() == null) {
                wdm.g("pageLifeCycle", a.P(this.f2531a), "onReady.directlyShow");
                wgm.a(this.f2531a, PopRequest.Status.READY);
            }
        }
        this.d = false;
    }
}
