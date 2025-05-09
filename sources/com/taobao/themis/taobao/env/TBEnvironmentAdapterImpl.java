package com.taobao.themis.taobao.env;

import android.app.Application;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBEnvironmentAdapterImpl implements IEnvironmentService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(847249442);
        t2o.a(839909467);
    }

    @Override // com.taobao.themis.kernel.adapter.IEnvironmentService
    public String getAppName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("92150ca3", new Object[]{this});
        }
        return RVEnvironmentService.PLATFORM_TB;
    }

    @Override // com.taobao.themis.kernel.adapter.IEnvironmentService
    public String getAppVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65f009ac", new Object[]{this});
        }
        return Globals.getVersionName();
    }

    @Override // com.taobao.themis.kernel.adapter.IEnvironmentService
    public Application getApplicationContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("4955420b", new Object[]{this});
        }
        return Globals.getApplication();
    }
}
