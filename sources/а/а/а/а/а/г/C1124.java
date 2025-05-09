package а.а.а.а.а.г;

import com.alibaba.wireless.security.open.datacollection.IDataCollectionComponent;
import com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin;
import com.taobao.wireless.security.adapter.datacollection.C0811;

/* renamed from: а.а.а.а.а.г.а  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C1124 implements IDataCollectionComponent {

    /* renamed from: а  reason: contains not printable characters */
    private C0811 f1683;

    public C1124(ISecurityGuardPlugin iSecurityGuardPlugin) {
        init(iSecurityGuardPlugin, new Object[0]);
    }

    @Override // com.alibaba.wireless.security.open.datacollection.IDataCollectionComponent
    public String getNick() {
        return this.f1683.m369();
    }

    @Override // com.alibaba.wireless.security.open.IComponent
    public int init(ISecurityGuardPlugin iSecurityGuardPlugin, Object... objArr) {
        this.f1683 = C0811.m365(iSecurityGuardPlugin);
        return 0;
    }

    @Override // com.alibaba.wireless.security.open.datacollection.IDataCollectionComponent
    public boolean setNick(String str) {
        return this.f1683.m371(str);
    }
}
