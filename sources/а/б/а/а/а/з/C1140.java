package а.б.а.а.а.з;

import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin;
import com.taobao.wireless.security.sdk.staticdatastore.IStaticDataStoreComponent;

/* renamed from: а.б.а.а.а.з.а  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C1140 implements IStaticDataStoreComponent {

    /* renamed from: а  reason: contains not printable characters */
    private com.alibaba.wireless.security.open.staticdatastore.IStaticDataStoreComponent f1745;

    public C1140(ISecurityGuardPlugin iSecurityGuardPlugin) {
        this.f1745 = (com.alibaba.wireless.security.open.staticdatastore.IStaticDataStoreComponent) iSecurityGuardPlugin.getInterface(com.alibaba.wireless.security.open.staticdatastore.IStaticDataStoreComponent.class);
    }

    @Override // com.taobao.wireless.security.sdk.staticdatastore.IStaticDataStoreComponent
    public String getAppKeyByIndex(int i) {
        try {
            return this.f1745.getAppKeyByIndex(i, "");
        } catch (SecException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.taobao.wireless.security.sdk.staticdatastore.IStaticDataStoreComponent
    public String getExtraData(String str) {
        try {
            return this.f1745.getExtraData(str, "");
        } catch (SecException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.taobao.wireless.security.sdk.staticdatastore.IStaticDataStoreComponent
    public int getKeyType(String str) {
        try {
            return this.f1745.getKeyType(str, "");
        } catch (SecException e) {
            e.printStackTrace();
            return 4;
        }
    }
}
