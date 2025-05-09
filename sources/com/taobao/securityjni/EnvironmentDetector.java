package com.taobao.securityjni;

import android.content.ContextWrapper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.wireless.security.sdk.SecurityGuardManager;
import com.taobao.wireless.security.sdk.rootdetect.IRootDetectComponent;
import com.taobao.wireless.security.sdk.simulatordetect.ISimulatorDetectComponent;
import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class EnvironmentDetector {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ContextWrapper context;

    static {
        t2o.a(421527564);
    }

    public EnvironmentDetector(ContextWrapper contextWrapper) {
        this.context = contextWrapper;
    }

    public boolean isRoot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6b36bb7", new Object[]{this})).booleanValue();
        }
        IRootDetectComponent rootDetectComp = SecurityGuardManager.getInstance(this.context).getRootDetectComp();
        if (rootDetectComp != null) {
            return rootDetectComp.isRoot();
        }
        return false;
    }

    public boolean isSimulator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e327d85", new Object[]{this})).booleanValue();
        }
        ISimulatorDetectComponent simulatorDetectComp = SecurityGuardManager.getInstance(this.context).getSimulatorDetectComp();
        if (simulatorDetectComp != null) {
            return simulatorDetectComp.isSimulator();
        }
        return false;
    }
}
