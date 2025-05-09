package а.б.а.а.а.а;

import com.alibaba.wireless.security.mainplugin.SecurityGuardMainPlugin;
import com.alibaba.wireless.security.open.SecException;
import com.taobao.wireless.security.sdk.atlasencrypt.IAtlasEncryptComponent;

/* renamed from: а.б.а.а.а.а.а  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C1133 implements IAtlasEncryptComponent {

    /* renamed from: а  reason: contains not printable characters */
    private com.alibaba.wireless.security.open.atlasencrypt.IAtlasEncryptComponent f1736;

    public C1133(SecurityGuardMainPlugin securityGuardMainPlugin) {
        this.f1736 = (com.alibaba.wireless.security.open.atlasencrypt.IAtlasEncryptComponent) securityGuardMainPlugin.getInterface(com.alibaba.wireless.security.open.atlasencrypt.IAtlasEncryptComponent.class);
    }

    @Override // com.taobao.wireless.security.sdk.atlasencrypt.IAtlasEncryptComponent
    public String atlasSafeEncrypt(String str) {
        try {
            return this.f1736.atlasSafeEncrypt(str, "");
        } catch (SecException e) {
            e.printStackTrace();
            return null;
        }
    }
}
