package а.б.а.а.а.ё;

import com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin;
import com.taobao.wireless.security.sdk.rootdetect.IRootDetectComponent;

/* renamed from: а.б.а.а.а.ё.а  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C1141 implements IRootDetectComponent {

    /* renamed from: а  reason: contains not printable characters */
    ISecurityGuardPlugin f1746;

    public C1141(ISecurityGuardPlugin iSecurityGuardPlugin) {
        this.f1746 = iSecurityGuardPlugin;
    }

    @Override // com.taobao.wireless.security.sdk.rootdetect.IRootDetectComponent
    public boolean isRoot() {
        return ((Boolean) this.f1746.getRouter().doCommand(10701, new Object[0])).booleanValue();
    }
}
