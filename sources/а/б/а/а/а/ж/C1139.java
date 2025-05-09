package а.б.а.а.а.ж;

import android.content.ContextWrapper;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin;
import com.taobao.wireless.security.sdk.staticdataencrypt.IStaticDataEncryptComponent;

/* renamed from: а.б.а.а.а.ж.а  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C1139 implements IStaticDataEncryptComponent {

    /* renamed from: а  reason: contains not printable characters */
    ContextWrapper f1743;

    /* renamed from: б  reason: contains not printable characters */
    private com.alibaba.wireless.security.open.staticdataencrypt.IStaticDataEncryptComponent f1744;

    public C1139(ISecurityGuardPlugin iSecurityGuardPlugin) {
        this.f1744 = (com.alibaba.wireless.security.open.staticdataencrypt.IStaticDataEncryptComponent) iSecurityGuardPlugin.getInterface(com.alibaba.wireless.security.open.staticdataencrypt.IStaticDataEncryptComponent.class);
    }

    @Override // com.taobao.wireless.security.sdk.staticdataencrypt.IStaticDataEncryptComponent
    public byte[] staticBinarySafeDecrypt(int i, String str, byte[] bArr) {
        try {
            return this.f1744.staticBinarySafeDecrypt(i, str, bArr, "");
        } catch (SecException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.taobao.wireless.security.sdk.staticdataencrypt.IStaticDataEncryptComponent
    public byte[] staticBinarySafeDecryptNoB64(int i, String str, byte[] bArr) {
        try {
            return this.f1744.staticBinarySafeDecryptNoB64(i, str, bArr, "");
        } catch (SecException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.taobao.wireless.security.sdk.staticdataencrypt.IStaticDataEncryptComponent
    public byte[] staticBinarySafeEncrypt(int i, String str, byte[] bArr) {
        try {
            return this.f1744.staticBinarySafeEncrypt(i, str, bArr, "");
        } catch (SecException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.taobao.wireless.security.sdk.staticdataencrypt.IStaticDataEncryptComponent
    public byte[] staticBinarySafeEncryptNoB64(int i, String str, byte[] bArr) {
        try {
            return this.f1744.staticBinarySafeEncryptNoB64(i, str, bArr, "");
        } catch (SecException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.taobao.wireless.security.sdk.staticdataencrypt.IStaticDataEncryptComponent
    public String staticSafeDecrypt(int i, String str, String str2) {
        try {
            return this.f1744.staticSafeDecrypt(i, str, str2, "");
        } catch (SecException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.taobao.wireless.security.sdk.staticdataencrypt.IStaticDataEncryptComponent
    public String staticSafeEncrypt(int i, String str, String str2) {
        try {
            return this.f1744.staticSafeEncrypt(i, str, str2, "");
        } catch (SecException e) {
            e.printStackTrace();
            return null;
        }
    }
}
