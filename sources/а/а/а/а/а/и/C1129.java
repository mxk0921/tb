package а.а.а.а.а.и;

import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin;
import com.alibaba.wireless.security.open.staticdataencrypt.IStaticDataEncryptComponent;
import java.io.UnsupportedEncodingException;

/* renamed from: а.а.а.а.а.и.а  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C1129 implements IStaticDataEncryptComponent {

    /* renamed from: б  reason: contains not printable characters */
    public static final int f1715 = 3;

    /* renamed from: в  reason: contains not printable characters */
    public static final int f1716 = 16;

    /* renamed from: г  reason: contains not printable characters */
    public static final int f1717 = 17;

    /* renamed from: д  reason: contains not printable characters */
    public static final int f1718 = 18;

    /* renamed from: е  reason: contains not printable characters */
    public static final int f1719 = 19;

    /* renamed from: ж  reason: contains not printable characters */
    public static final int f1720 = 2;

    /* renamed from: з  reason: contains not printable characters */
    public static final int f1721 = 1;

    /* renamed from: и  reason: contains not printable characters */
    public static final int f1722 = 0;

    /* renamed from: ё  reason: contains not printable characters */
    public static final int f1723 = 1;

    /* renamed from: а  reason: contains not printable characters */
    private ISecurityGuardPlugin f1724 = null;

    public C1129(ISecurityGuardPlugin iSecurityGuardPlugin) {
        init(iSecurityGuardPlugin, new Object[0]);
    }

    /* renamed from: а  reason: contains not printable characters */
    private byte[] m1136(int i, int i2, int i3, String str, byte[] bArr, String str2) {
        return (byte[]) this.f1724.getRouter().doCommand(10601, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str, bArr, str2);
    }

    /* renamed from: б  reason: contains not printable characters */
    private byte[] m1137(int i, String str, byte[] bArr, String str2) {
        return m1136(2, i, 0, str, bArr, str2);
    }

    /* renamed from: в  reason: contains not printable characters */
    private byte[] m1138(int i, String str, byte[] bArr, String str2) {
        return m1136(1, i, 0, str, bArr, str2);
    }

    @Override // com.alibaba.wireless.security.open.IComponent
    public int init(ISecurityGuardPlugin iSecurityGuardPlugin, Object... objArr) {
        this.f1724 = iSecurityGuardPlugin;
        return 0;
    }

    @Override // com.alibaba.wireless.security.open.staticdataencrypt.IStaticDataEncryptComponent
    public byte[] staticBinarySafeDecrypt(int i, String str, byte[] bArr, String str2) throws SecException {
        if (str != null && str.length() > 0 && i >= 3 && i < 19 && bArr != null && bArr.length > 0) {
            return m1136(2, i, 1, str, bArr, str2);
        }
        throw new SecException("", 301);
    }

    @Override // com.alibaba.wireless.security.open.staticdataencrypt.IStaticDataEncryptComponent
    public byte[] staticBinarySafeDecryptNoB64(int i, String str, byte[] bArr, String str2) throws SecException {
        if (str != null && str.length() > 0 && i >= 3 && i < 19 && bArr != null && bArr.length > 0) {
            return m1137(i, str, bArr, str2);
        }
        throw new SecException("", 301);
    }

    @Override // com.alibaba.wireless.security.open.staticdataencrypt.IStaticDataEncryptComponent
    public byte[] staticBinarySafeEncrypt(int i, String str, byte[] bArr, String str2) throws SecException {
        if (str != null && str.length() > 0 && i >= 3 && i < 19 && bArr != null && bArr.length > 0) {
            return m1136(1, i, 1, str, bArr, str2);
        }
        throw new SecException("", 301);
    }

    @Override // com.alibaba.wireless.security.open.staticdataencrypt.IStaticDataEncryptComponent
    public byte[] staticBinarySafeEncryptNoB64(int i, String str, byte[] bArr, String str2) throws SecException {
        if (str != null && str.length() > 0 && i >= 3 && i < 19 && bArr != null && bArr.length > 0) {
            return m1138(i, str, bArr, str2);
        }
        throw new SecException("", 301);
    }

    @Override // com.alibaba.wireless.security.open.staticdataencrypt.IStaticDataEncryptComponent
    public String staticSafeDecrypt(int i, String str, String str2, String str3) throws SecException {
        if (str == null || str.length() <= 0 || i < 3 || i >= 19 || str2 == null || str2.length() <= 0) {
            throw new SecException("", 301);
        }
        byte[] bArr = m1136(2, i, 1, str, str2.getBytes(), str3);
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    @Override // com.alibaba.wireless.security.open.staticdataencrypt.IStaticDataEncryptComponent
    public String staticSafeEncrypt(int i, String str, String str2, String str3) throws SecException {
        if (str == null || str.length() <= 0 || i < 3 || i >= 19 || str2 == null || str2.length() <= 0) {
            throw new SecException("", 301);
        }
        byte[] bArr = m1136(1, i, 1, str, str2.getBytes(), str3);
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }
}
