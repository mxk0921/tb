package com.alibaba.wireless.security.securitybody.open;

import com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin;
import com.alibaba.wireless.security.open.simulatordetect.ISimulatorDetectComponent;

/* renamed from: com.alibaba.wireless.security.securitybody.open.г  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0182 implements ISimulatorDetectComponent {

    /* renamed from: а  reason: contains not printable characters */
    private ISecurityGuardPlugin f449;

    public C0182(ISecurityGuardPlugin iSecurityGuardPlugin) {
        init(iSecurityGuardPlugin, new Object[0]);
    }

    @Override // com.alibaba.wireless.security.open.IComponent
    public int init(ISecurityGuardPlugin iSecurityGuardPlugin, Object... objArr) {
        this.f449 = iSecurityGuardPlugin;
        return 0;
    }

    @Override // com.alibaba.wireless.security.open.simulatordetect.ISimulatorDetectComponent
    public boolean isSimulator() {
        return ((Boolean) this.f449.getRouter().doCommand(11001, new Object[0])).booleanValue();
    }
}
