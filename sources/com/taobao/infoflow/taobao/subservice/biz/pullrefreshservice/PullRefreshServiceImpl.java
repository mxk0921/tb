package com.taobao.infoflow.taobao.subservice.biz.pullrefreshservice;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IPullRefreshService;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.cfc;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PullRefreshServiceImpl implements IPullRefreshService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final List<IPullRefreshService.a> mPullRefreshListenerList = new CopyOnWriteArrayList();

    static {
        t2o.a(491782621);
        t2o.a(488636591);
    }

    private void notifyOnRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34ef31ba", new Object[]{this});
            return;
        }
        for (IPullRefreshService.a aVar : this.mPullRefreshListenerList) {
            aVar.onRefresh();
        }
    }

    private void notifyPullDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("510fc1f9", new Object[]{this, new Integer(i)});
            return;
        }
        for (IPullRefreshService.a aVar : this.mPullRefreshListenerList) {
            aVar.onPullDistance(i);
        }
    }

    private void notifyRefreshStateChanged(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19461270", new Object[]{this, str, str2});
            return;
        }
        for (IPullRefreshService.a aVar : this.mPullRefreshListenerList) {
            aVar.onRefreshStateChanged(str, str2);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPullRefreshService
    public void addPullRefreshListener(IPullRefreshService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("548aba43", new Object[]{this, aVar});
        } else {
            this.mPullRefreshListenerList.add(aVar);
        }
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
            this.mPullRefreshListenerList.clear();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPullRefreshService
    public void onPullDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dcc8a23", new Object[]{this, new Integer(i)});
        } else {
            notifyPullDistance(i);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPullRefreshService
    public void onRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9cbba83", new Object[]{this});
        } else {
            notifyOnRefresh();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPullRefreshService
    public void onRefreshStateChanged(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("645061a", new Object[]{this, str, str2});
        } else {
            notifyRefreshStateChanged(str, str2);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPullRefreshService
    public void removePullRefreshListener(IPullRefreshService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3bfc740", new Object[]{this, aVar});
        } else if (!this.mPullRefreshListenerList.isEmpty()) {
            this.mPullRefreshListenerList.remove(aVar);
        }
    }
}
