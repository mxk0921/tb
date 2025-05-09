package а.б.а.а.а.в;

import com.alibaba.wireless.security.mainplugin.SecurityGuardMainPlugin;
import com.alibaba.wireless.security.open.SecException;
import com.taobao.wireless.security.sdk.dynamicdataencrypt.IDynamicDataEncryptComponent;

/* renamed from: а.б.а.а.а.в.а  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C1135 implements IDynamicDataEncryptComponent {

    /* renamed from: а  reason: contains not printable characters */
    private com.alibaba.wireless.security.open.dynamicdataencrypt.IDynamicDataEncryptComponent f1738;

    public C1135(SecurityGuardMainPlugin securityGuardMainPlugin) {
        this.f1738 = (com.alibaba.wireless.security.open.dynamicdataencrypt.IDynamicDataEncryptComponent) securityGuardMainPlugin.getInterface(com.alibaba.wireless.security.open.dynamicdataencrypt.IDynamicDataEncryptComponent.class);
    }

    @Override // com.taobao.wireless.security.sdk.dynamicdataencrypt.IDynamicDataEncryptComponent
    public String dynamicDecrypt(String str) {
        try {
            return this.f1738.dynamicDecrypt(str);
        } catch (SecException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.taobao.wireless.security.sdk.dynamicdataencrypt.IDynamicDataEncryptComponent
    public String dynamicDecryptDDp(String str) {
        try {
            return this.f1738.dynamicDecryptDDp(str);
        } catch (SecException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.taobao.wireless.security.sdk.dynamicdataencrypt.IDynamicDataEncryptComponent
    public String dynamicEncrypt(String str) {
        try {
            return this.f1738.dynamicEncrypt(str);
        } catch (SecException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.taobao.wireless.security.sdk.dynamicdataencrypt.IDynamicDataEncryptComponent
    public String dynamicEncryptDDp(String str) {
        try {
            return this.f1738.dynamicEncryptDDp(str);
        } catch (SecException e) {
            e.printStackTrace();
            return null;
        }
    }
}
