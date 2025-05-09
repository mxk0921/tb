package а.а.а.а.а.д;

import com.alibaba.wireless.security.mainplugin.C0111;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.dynamicdataencrypt.IDynamicDataEncryptComponent;
import com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin;
import а.а.а.а.а.б.C1122;

/* renamed from: а.а.а.а.а.д.а  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C1125 implements IDynamicDataEncryptComponent {

    /* renamed from: б  reason: contains not printable characters */
    private static final int f1684 = 1;

    /* renamed from: в  reason: contains not printable characters */
    private static final int f1685 = 2;

    /* renamed from: г  reason: contains not printable characters */
    private static final int f1686 = 3;

    /* renamed from: д  reason: contains not printable characters */
    private static final int f1687 = 4;

    /* renamed from: а  reason: contains not printable characters */
    private ISecurityGuardPlugin f1688 = null;

    public C1125(ISecurityGuardPlugin iSecurityGuardPlugin) {
        init(iSecurityGuardPlugin, new Object[0]);
    }

    /* renamed from: а  reason: contains not printable characters */
    private String m1129(int i, String str, boolean z) throws SecException {
        if (str == null || str.length() <= 0) {
            throw new SecException("Input data string is empty", 401);
        }
        byte[] bArr = (byte[]) this.f1688.getRouter().doCommand(10501, Integer.valueOf(i), Boolean.valueOf(z), str);
        if (bArr != null) {
            try {
                if (bArr.length > 0) {
                    return new String(bArr, "UTF-8");
                }
            } catch (Exception unused) {
                throw new SecException("dynamic crypt return with invalid string data", 499);
            }
        }
        throw new SecException("dynamic crypt return with null data", 499);
    }

    /* renamed from: б  reason: contains not printable characters */
    private byte[] m1130(int i, byte[] bArr, boolean z) throws SecException {
        if (bArr == null || bArr.length <= 0) {
            throw new SecException("Input byte data is empty", 401);
        }
        return (byte[]) this.f1688.getRouter().doCommand(10501, Integer.valueOf(i), Boolean.valueOf(z), C1122.m1126(bArr));
    }

    @Override // com.alibaba.wireless.security.open.dynamicdataencrypt.IDynamicDataEncryptComponent
    public String dynamicDecrypt(String str) throws SecException {
        return m1129(2, str, false);
    }

    @Override // com.alibaba.wireless.security.open.dynamicdataencrypt.IDynamicDataEncryptComponent
    public byte[] dynamicDecryptByteArray(byte[] bArr) throws SecException {
        if (bArr != null && bArr.length > 0) {
            return C1122.m1127(m1129(2, new String(bArr), false));
        }
        throw new SecException(401);
    }

    @Override // com.alibaba.wireless.security.open.dynamicdataencrypt.IDynamicDataEncryptComponent
    public byte[] dynamicDecryptByteArrayDDp(byte[] bArr) throws SecException {
        if (bArr != null && bArr.length > 0) {
            return C1122.m1127(m1129(4, new String(bArr), true));
        }
        throw new SecException(401);
    }

    @Override // com.alibaba.wireless.security.open.dynamicdataencrypt.IDynamicDataEncryptComponent
    public String dynamicDecryptDDp(String str) throws SecException {
        C0111.m67("dynamicDecryptDDp");
        String str2 = m1129(4, str, true);
        C0111.m66("dynamicDecryptDDp");
        return str2;
    }

    @Override // com.alibaba.wireless.security.open.dynamicdataencrypt.IDynamicDataEncryptComponent
    public String dynamicEncrypt(String str) throws SecException {
        return m1129(1, str, false);
    }

    @Override // com.alibaba.wireless.security.open.dynamicdataencrypt.IDynamicDataEncryptComponent
    public byte[] dynamicEncryptByteArray(byte[] bArr) throws SecException {
        return m1130(1, bArr, false);
    }

    @Override // com.alibaba.wireless.security.open.dynamicdataencrypt.IDynamicDataEncryptComponent
    public byte[] dynamicEncryptByteArrayDDp(byte[] bArr) throws SecException {
        return m1130(3, bArr, true);
    }

    @Override // com.alibaba.wireless.security.open.dynamicdataencrypt.IDynamicDataEncryptComponent
    public String dynamicEncryptDDp(String str) throws SecException {
        C0111.m67("dynamicEncryptDDp");
        String str2 = m1129(3, str, true);
        C0111.m66("dynamicEncryptDDp");
        return str2;
    }

    @Override // com.alibaba.wireless.security.open.IComponent
    public int init(ISecurityGuardPlugin iSecurityGuardPlugin, Object... objArr) {
        this.f1688 = iSecurityGuardPlugin;
        return 0;
    }

    @Override // com.alibaba.wireless.security.open.dynamicdataencrypt.IDynamicDataEncryptComponent
    public boolean isVerifyCrypt(String str) throws SecException {
        if (str != null && str.length() > 0) {
            return str.length() > 9 && str.charAt(8) == '@';
        }
        throw new SecException(401);
    }
}
