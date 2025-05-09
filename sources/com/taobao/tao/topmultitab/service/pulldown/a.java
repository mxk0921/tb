package com.taobao.tao.topmultitab.service.pulldown;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.service.controller.IHomeControllerService;
import com.taobao.tao.topmultitab.service.pulldown.IPullDownService;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.h8x;
import tb.t2o;
import tb.wcc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a implements IPullDownService.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<IPullDownService.a> f12836a = new CopyOnWriteArrayList();
    public final IHomeControllerService b;

    static {
        t2o.a(729810286);
        t2o.a(729810275);
    }

    public a(wcc wccVar) {
        this.b = (IHomeControllerService) wccVar.a(IHomeControllerService.class);
    }

    public void a(IPullDownService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11752584", new Object[]{this, aVar});
        } else {
            ((CopyOnWriteArrayList) this.f12836a).add(aVar);
        }
    }

    public final void b() {
        IHomeSubTabController currentSubTabController;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b876d370", new Object[]{this});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12836a).iterator();
        while (it.hasNext()) {
            ((IPullDownService.a) it.next()).onEnterPullSecondFloor();
        }
        IHomeControllerService iHomeControllerService = this.b;
        if (iHomeControllerService != null && (currentSubTabController = iHomeControllerService.getCurrentSubTabController()) != null) {
            currentSubTabController.onEnterPullSecondFloor();
        }
    }

    public final void c() {
        IHomeSubTabController currentSubTabController;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85de3178", new Object[]{this});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12836a).iterator();
        while (it.hasNext()) {
            ((IPullDownService.a) it.next()).onExitPullSecondFloor();
        }
        IHomeControllerService iHomeControllerService = this.b;
        if (iHomeControllerService != null && (currentSubTabController = iHomeControllerService.getCurrentSubTabController()) != null) {
            currentSubTabController.onExitPullSecondFloor();
        }
    }

    public void d(IPullDownService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58e1b827", new Object[]{this, aVar});
        } else if (!((CopyOnWriteArrayList) this.f12836a).isEmpty()) {
            ((CopyOnWriteArrayList) this.f12836a).remove(aVar);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.pulldown.IPullDownService.a
    public void onEnterPullSecondFloor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11729e81", new Object[]{this});
            return;
        }
        h8x.e(true);
        b();
    }

    @Override // com.taobao.tao.topmultitab.service.pulldown.IPullDownService.a
    public void onExitPullSecondFloor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e74a49d", new Object[]{this});
            return;
        }
        h8x.e(false);
        c();
    }
}
