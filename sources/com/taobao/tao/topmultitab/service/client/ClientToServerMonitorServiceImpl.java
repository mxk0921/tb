package com.taobao.tao.topmultitab.service.client;

import com.android.alibaba.ip.runtime.IpChange;
import tb.cfc;
import tb.f4b;
import tb.fve;
import tb.p28;
import tb.q28;
import tb.s2b;
import tb.t2o;
import tb.uzi;
import tb.wcc;
import tb.xcc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ClientToServerMonitorServiceImpl implements IClientToServiceMonitorService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ClientToServerMonitorManager";
    private p28.a mDxItemClickListener;

    static {
        t2o.a(729810162);
        t2o.a(729810163);
    }

    private void registerDxItemClickListener(uzi uziVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af871deb", new Object[]{this, uziVar});
        } else if (this.mDxItemClickListener == null) {
            this.mDxItemClickListener = new q28(uziVar);
            s2b.c().b().a(this.mDxItemClickListener);
            fve.e(TAG, "registerDxItemClickListener");
        }
    }

    private void unRegisterDxItemClickListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b38a9e0", new Object[]{this});
        } else if (this.mDxItemClickListener != null) {
            s2b.c().b().c(this.mDxItemClickListener);
            this.mDxItemClickListener = null;
            fve.e(TAG, "unRegisterDxItemClickListener");
        }
    }

    @Override // com.taobao.tao.topmultitab.service.base.IHomePageService, com.taobao.infoflow.protocol.subservice.ISubService
    public /* synthetic */ void onCreateService(cfc cfcVar) {
        xcc.a(this, cfcVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            unRegisterDxItemClickListener();
        }
    }

    @Override // com.taobao.tao.topmultitab.service.base.IHomePageService
    public void onCreateService(wcc wccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("312ad712", new Object[]{this, wccVar});
        } else if (!f4b.b("enableOpenStabilityMonitor", true)) {
            fve.e(TAG, "orange开关关闭");
        } else {
            registerDxItemClickListener(new uzi());
        }
    }
}
