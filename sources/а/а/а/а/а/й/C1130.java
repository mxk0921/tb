package а.а.а.а.а.й;

import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin;
import com.alibaba.wireless.security.open.staticdatastore.IStaticDataStoreComponent;

/* renamed from: а.а.а.а.а.й.а  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C1130 implements IStaticDataStoreComponent {

    /* renamed from: а  reason: contains not printable characters */
    private ISecurityGuardPlugin f1725 = null;

    public C1130(ISecurityGuardPlugin iSecurityGuardPlugin) {
        init(iSecurityGuardPlugin, new Object[0]);
    }

    @Override // com.alibaba.wireless.security.open.staticdatastore.IStaticDataStoreComponent
    public String getAppKeyByIndex(int i, String str) throws SecException {
        return (String) this.f1725.getRouter().doCommand(10602, Integer.valueOf(i), str);
    }

    @Override // com.alibaba.wireless.security.open.staticdatastore.IStaticDataStoreComponent
    public String getExtraData(String str, String str2) throws SecException {
        return (String) this.f1725.getRouter().doCommand(10603, str, str2);
    }

    @Override // com.alibaba.wireless.security.open.staticdatastore.IStaticDataStoreComponent
    public int getKeyType(String str, String str2) throws SecException {
        return ((Integer) this.f1725.getRouter().doCommand(10604, str, str2)).intValue();
    }

    @Override // com.alibaba.wireless.security.open.IComponent
    public int init(ISecurityGuardPlugin iSecurityGuardPlugin, Object... objArr) {
        this.f1725 = iSecurityGuardPlugin;
        return 0;
    }
}
