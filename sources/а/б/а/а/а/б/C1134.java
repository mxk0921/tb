package а.б.а.а.а.б;

import com.alibaba.wireless.security.mainplugin.SecurityGuardMainPlugin;
import com.taobao.wireless.security.adapter.datacollection.C0811;
import com.taobao.wireless.security.sdk.datacollection.IDataCollectionComponent;

/* renamed from: а.б.а.а.а.б.а  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C1134 implements IDataCollectionComponent {

    /* renamed from: а  reason: contains not printable characters */
    private C0811 f1737;

    public C1134(SecurityGuardMainPlugin securityGuardMainPlugin) {
        this.f1737 = C0811.m365(securityGuardMainPlugin);
    }

    @Override // com.taobao.wireless.security.sdk.datacollection.IDataCollectionComponent
    public String getEncryptedDevAndEnvInfo(int i, String str) {
        return null;
    }

    @Override // com.taobao.wireless.security.sdk.datacollection.IDataCollectionComponent
    public String getNick() {
        try {
            return this.f1737.m369();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.taobao.wireless.security.sdk.datacollection.IDataCollectionComponent
    public String getNickEx(int i) {
        try {
            return this.f1737.m370(i);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.taobao.wireless.security.sdk.datacollection.IDataCollectionComponent
    public boolean setNick(String str) {
        try {
            return this.f1737.m371(str);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.taobao.wireless.security.sdk.datacollection.IDataCollectionComponent
    public boolean setNickEx(int i, String str) {
        try {
            return this.f1737.m372(i, str);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
