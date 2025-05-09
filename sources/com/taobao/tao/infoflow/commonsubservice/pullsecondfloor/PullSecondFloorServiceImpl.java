package com.taobao.tao.infoflow.commonsubservice.pullsecondfloor;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IPullSecondFloorService;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.cfc;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class PullSecondFloorServiceImpl implements IPullSecondFloorService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isOnPullSecondFloor;
    private final List<IPullSecondFloorService.a> mPullSecondFloorLifeCycles = new CopyOnWriteArrayList();

    static {
        t2o.a(729809404);
        t2o.a(488636595);
    }

    private void notifyPullSecondFloorState(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("573716c6", new Object[]{this, new Boolean(z)});
            return;
        }
        for (IPullSecondFloorService.a aVar : this.mPullSecondFloorLifeCycles) {
            if (z) {
                aVar.onEnterPullSecondFloor();
            } else {
                aVar.onExitPullSecondFloor();
            }
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPullSecondFloorService
    public void addLifeCycleListener(IPullSecondFloorService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43d5e3fd", new Object[]{this, aVar});
        } else {
            this.mPullSecondFloorLifeCycles.add(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPullSecondFloorService
    public boolean isOnPullSecondFloor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dde0d015", new Object[]{this})).booleanValue();
        }
        return this.isOnPullSecondFloor;
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            this.mPullSecondFloorLifeCycles.clear();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPullSecondFloorService
    public void onEnterPullSecondFloor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11729e81", new Object[]{this});
            return;
        }
        this.isOnPullSecondFloor = true;
        notifyPullSecondFloorState(true);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPullSecondFloorService
    public void onExitPullSecondFloor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e74a49d", new Object[]{this});
            return;
        }
        this.isOnPullSecondFloor = false;
        notifyPullSecondFloorState(false);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPullSecondFloorService
    public void removeLifeCycleListener(IPullSecondFloorService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f99a7f3a", new Object[]{this, aVar});
        } else {
            this.mPullSecondFloorLifeCycles.remove(aVar);
        }
    }
}
