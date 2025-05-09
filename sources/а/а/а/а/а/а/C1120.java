package а.а.а.а.а.а;

import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.atlasencrypt.IAtlasEncryptComponent;
import com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin;
import java.io.UnsupportedEncodingException;

/* renamed from: а.а.а.а.а.а.а  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C1120 implements IAtlasEncryptComponent {

    /* renamed from: а  reason: contains not printable characters */
    private ISecurityGuardPlugin f1672;

    public C1120(ISecurityGuardPlugin iSecurityGuardPlugin) {
        init(iSecurityGuardPlugin, new Object[0]);
    }

    /* renamed from: а  reason: contains not printable characters */
    private byte[] m1124(String str, String str2, String str3) {
        return (byte[]) this.f1672.getRouter().doCommand(11901, str, str2, str3);
    }

    @Override // com.alibaba.wireless.security.open.atlasencrypt.IAtlasEncryptComponent
    public String atlasSafeEncrypt(String str, String str2) throws SecException {
        if (str == null || str.length() <= 0) {
            throw new SecException("", 1001);
        }
        byte[] bArr = m1124("a", str, str2);
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    @Override // com.alibaba.wireless.security.open.IComponent
    public int init(ISecurityGuardPlugin iSecurityGuardPlugin, Object... objArr) {
        this.f1672 = iSecurityGuardPlugin;
        return 0;
    }
}
