package а.б.а.а.а.д;

import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin;
import com.taobao.wireless.security.sdk.safetoken.ISafeTokenComponent;

/* renamed from: а.б.а.а.а.д.а  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C1137 implements ISafeTokenComponent {

    /* renamed from: а  reason: contains not printable characters */
    private com.alibaba.wireless.security.open.safetoken.ISafeTokenComponent f1740;

    /* renamed from: б  reason: contains not printable characters */
    private ISecurityGuardPlugin f1741;

    public C1137(ISecurityGuardPlugin iSecurityGuardPlugin) {
        this.f1741 = iSecurityGuardPlugin;
        this.f1740 = (com.alibaba.wireless.security.open.safetoken.ISafeTokenComponent) iSecurityGuardPlugin.getInterface(com.alibaba.wireless.security.open.safetoken.ISafeTokenComponent.class);
    }

    @Override // com.taobao.wireless.security.sdk.safetoken.ISafeTokenComponent
    public byte[] decryptWithToken(String str, byte[] bArr, int i) {
        try {
            return this.f1740.decryptWithToken(str, bArr, i);
        } catch (SecException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.taobao.wireless.security.sdk.safetoken.ISafeTokenComponent
    public byte[] encryptWithToken(String str, byte[] bArr, int i) {
        try {
            return this.f1740.encryptWithToken(str, bArr, i);
        } catch (SecException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.taobao.wireless.security.sdk.safetoken.ISafeTokenComponent
    public byte[] getOtp(String str, int i, String[] strArr, byte[][] bArr) {
        try {
            return this.f1740.getOtp(str, i, strArr, bArr);
        } catch (SecException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.taobao.wireless.security.sdk.safetoken.ISafeTokenComponent
    public boolean isTokenExisted(String str) {
        try {
            return this.f1740.isTokenExisted(str);
        } catch (SecException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.taobao.wireless.security.sdk.safetoken.ISafeTokenComponent
    public void removeToken(String str) {
        try {
            this.f1740.removeToken(str);
        } catch (SecException e) {
            e.printStackTrace();
        }
    }

    @Override // com.taobao.wireless.security.sdk.safetoken.ISafeTokenComponent
    public boolean saveToken(String str, String str2, String str3, int i) {
        try {
            return this.f1740.saveToken(str, str2, str3, i);
        } catch (SecException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.taobao.wireless.security.sdk.safetoken.ISafeTokenComponent
    public String signWithToken(String str, byte[] bArr, int i) {
        try {
            return this.f1740.signWithToken(str, bArr, i);
        } catch (SecException e) {
            e.printStackTrace();
            return null;
        }
    }
}
