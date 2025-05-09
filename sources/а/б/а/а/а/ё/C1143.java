package а.б.а.а.а.ё;

import com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin;
import com.taobao.wireless.security.sdk.simulatordetect.ISimulatorDetectComponent;

/* renamed from: а.б.а.а.а.ё.в  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C1143 implements ISimulatorDetectComponent {

    /* renamed from: а  reason: contains not printable characters */
    private com.alibaba.wireless.security.open.simulatordetect.ISimulatorDetectComponent f1749;

    public C1143(ISecurityGuardPlugin iSecurityGuardPlugin) {
        this.f1749 = (com.alibaba.wireless.security.open.simulatordetect.ISimulatorDetectComponent) iSecurityGuardPlugin.getInterface(com.alibaba.wireless.security.open.simulatordetect.ISimulatorDetectComponent.class);
    }

    @Override // com.taobao.wireless.security.sdk.simulatordetect.ISimulatorDetectComponent
    public boolean isSimulator() {
        return this.f1749.isSimulator();
    }
}
