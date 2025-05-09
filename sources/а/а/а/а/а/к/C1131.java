package а.а.а.а.а.к;

import android.util.Base64;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin;
import com.alibaba.wireless.security.open.statickeyencrypt.IStaticKeyEncryptComponent;
import com.taobao.wireless.security.adapter.common.SPUtility2;

/* renamed from: а.а.а.а.а.к.а  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C1131 implements IStaticKeyEncryptComponent {

    /* renamed from: б  reason: contains not printable characters */
    private static final String f1726 = "StaticKey";

    /* renamed from: в  reason: contains not printable characters */
    private static final int f1727 = 700;

    /* renamed from: г  reason: contains not printable characters */
    private static final int f1728 = 701;

    /* renamed from: д  reason: contains not printable characters */
    private static final int f1729 = 702;

    /* renamed from: е  reason: contains not printable characters */
    private static final int f1730 = 703;

    /* renamed from: ж  reason: contains not printable characters */
    private static final int f1731 = 705;

    /* renamed from: з  reason: contains not printable characters */
    private static final int f1732 = 799;

    /* renamed from: ё  reason: contains not printable characters */
    private static final int f1733 = 704;

    /* renamed from: а  reason: contains not printable characters */
    private ISecurityGuardPlugin f1734 = null;

    public C1131(ISecurityGuardPlugin iSecurityGuardPlugin) {
        init(iSecurityGuardPlugin, new Object[0]);
    }

    /* renamed from: а  reason: contains not printable characters */
    private byte[] m1139(int i, int i2, byte[] bArr, byte[] bArr2) {
        return (byte[]) this.f1734.getRouter().doCommand(10605, Integer.valueOf(i), Integer.valueOf(i2), bArr, bArr2);
    }

    /* renamed from: б  reason: contains not printable characters */
    private byte[] m1140(int i, String str, byte[] bArr) throws SecException {
        String readFromSPUnified = SPUtility2.readFromSPUnified(f1726, str, null);
        if (readFromSPUnified == null || readFromSPUnified.length() <= 0) {
            throw new SecException(703);
        }
        return m1139(702, i, readFromSPUnified.getBytes(), Base64.encode(bArr, 2));
    }

    /* renamed from: в  reason: contains not printable characters */
    private byte[] m1141(int i, String str, byte[] bArr) throws SecException {
        String readFromSPUnified = SPUtility2.readFromSPUnified(f1726, str, null);
        if (readFromSPUnified == null || readFromSPUnified.length() <= 0) {
            throw new SecException(703);
        }
        byte[] bArr2 = m1139(701, i, readFromSPUnified.getBytes(), bArr);
        return (bArr2 == null || bArr2.length <= 0) ? bArr2 : Base64.decode(bArr2, 0);
    }

    /* renamed from: г  reason: contains not printable characters */
    private byte[] m1142(int i, String str, String str2) throws SecException {
        String readFromSPUnified = SPUtility2.readFromSPUnified(f1726, str, null);
        String readFromSPUnified2 = SPUtility2.readFromSPUnified(f1726, str2, null);
        if (readFromSPUnified == null || readFromSPUnified.length() == 0) {
            throw new SecException(703);
        } else if (readFromSPUnified2 == null || readFromSPUnified2.length() == 0) {
            throw new SecException(703);
        } else {
            byte[] bArr = m1139(703, i, readFromSPUnified.getBytes(), readFromSPUnified2.getBytes());
            if (bArr == null || bArr.length <= 0) {
                return bArr;
            }
            try {
                return Base64.decode(bArr, 0);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: д  reason: contains not printable characters */
    private byte[] m1143(int i, byte[] bArr) {
        return (byte[]) this.f1734.getRouter().doCommand(10605, Integer.valueOf(i), bArr);
    }

    /* renamed from: ж  reason: contains not printable characters */
    private int m1144(String str) {
        if (SPUtility2.readFromSPUnified(f1726, str, null) == null) {
            return 2;
        }
        return SPUtility2.removeFromSPUnified(f1726, str, true) ? 1 : 0;
    }

    /* renamed from: з  reason: contains not printable characters */
    private byte[] m1145(int i, byte[] bArr, byte[] bArr2) {
        return (byte[]) this.f1734.getRouter().doCommand(10605, Integer.valueOf(i), bArr, bArr2);
    }

    /* renamed from: и  reason: contains not printable characters */
    private int m1146(String str, byte[] bArr) throws SecException {
        if (str == null || str.length() <= 0 || bArr == null || bArr.length <= 0) {
            throw new SecException(701);
        }
        byte[] bArr2 = m1145(704, str.getBytes(), bArr);
        if (bArr2 != null && bArr2.length > 0) {
            String readFromSPUnified = SPUtility2.readFromSPUnified(f1726, str, null);
            if (SPUtility2.saveToSPUnified(f1726, str, new String(bArr2), true)) {
                return (readFromSPUnified == null || readFromSPUnified.length() <= 0) ? 1 : 2;
            }
        }
        return 0;
    }

    /* renamed from: ё  reason: contains not printable characters */
    private boolean m1147(String str) {
        String readFromSPUnified = SPUtility2.readFromSPUnified(f1726, str, null);
        return readFromSPUnified != null && readFromSPUnified.length() > 0;
    }

    @Override // com.alibaba.wireless.security.open.statickeyencrypt.IStaticKeyEncryptComponent
    public byte[] decrypt(int i, String str, byte[] bArr) throws SecException {
        if (str != null && str.length() > 0 && bArr != null && bArr.length > 0 && i >= 16 && i <= 18) {
            return m1140(i, str, bArr);
        }
        throw new SecException(701);
    }

    @Override // com.alibaba.wireless.security.open.statickeyencrypt.IStaticKeyEncryptComponent
    public byte[] encrypt(int i, String str, byte[] bArr) throws SecException {
        if (str != null && str.length() > 0 && bArr != null && bArr.length > 0 && i >= 16 && i <= 18) {
            return m1141(i, str, bArr);
        }
        throw new SecException(701);
    }

    @Override // com.alibaba.wireless.security.open.statickeyencrypt.IStaticKeyEncryptComponent
    public byte[] encryptSecretData(int i, String str, String str2) throws SecException {
        if (str != null && str.length() > 0 && str2 != null && str2.length() > 0 && i >= 16 && i <= 18) {
            return m1142(i, str, str2);
        }
        throw new SecException(701);
    }

    @Override // com.alibaba.wireless.security.open.IComponent
    public int init(ISecurityGuardPlugin iSecurityGuardPlugin, Object... objArr) {
        this.f1734 = iSecurityGuardPlugin;
        return 0;
    }

    @Override // com.alibaba.wireless.security.open.statickeyencrypt.IStaticKeyEncryptComponent
    public boolean isSecretExist(String str) throws SecException {
        if (str != null && str.length() > 0) {
            return m1147(str);
        }
        throw new SecException(701);
    }

    @Override // com.alibaba.wireless.security.open.statickeyencrypt.IStaticKeyEncryptComponent
    public int removeSecret(String str) throws SecException {
        if (str != null && str.length() > 0) {
            return m1144(str);
        }
        throw new SecException(701);
    }

    @Override // com.alibaba.wireless.security.open.statickeyencrypt.IStaticKeyEncryptComponent
    public int saveSecret(String str, byte[] bArr) throws SecException {
        if (str != null && str.length() > 0 && bArr != null && bArr.length > 0) {
            return m1146(str, bArr);
        }
        throw new SecException(701);
    }

    /* renamed from: е  reason: contains not printable characters */
    public String m1148(String str) {
        byte[] bArr;
        if (str == null || str.length() <= 0) {
            return null;
        }
        String readFromSPUnified = SPUtility2.readFromSPUnified(f1726, str, null);
        return (readFromSPUnified == null || readFromSPUnified.length() <= 0 || (bArr = m1143(705, readFromSPUnified.getBytes())) == null || bArr.length <= 0) ? readFromSPUnified : Base64.encodeToString(bArr, 2);
    }
}
