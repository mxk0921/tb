package а.а.а.а.а.е;

import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent;
import com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin;
import java.io.UnsupportedEncodingException;
import а.а.а.а.а.б.C1122;

/* renamed from: а.а.а.а.а.е.а  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C1126 implements IDynamicDataStoreComponent {

    /* renamed from: б  reason: contains not printable characters */
    private static final String f1689 = "DynamicData";

    /* renamed from: в  reason: contains not printable characters */
    private static final String f1690 = "[B";

    /* renamed from: г  reason: contains not printable characters */
    private static final String f1691 = "LString";

    /* renamed from: д  reason: contains not printable characters */
    private static final String f1692 = "I";

    /* renamed from: е  reason: contains not printable characters */
    private static final String f1693 = "F";

    /* renamed from: ж  reason: contains not printable characters */
    private static final String f1694 = "Z";

    /* renamed from: з  reason: contains not printable characters */
    private static final int f1695 = 5;

    /* renamed from: и  reason: contains not printable characters */
    private static final int f1696 = 6;

    /* renamed from: й  reason: contains not printable characters */
    private static final int f1697 = 7;

    /* renamed from: к  reason: contains not printable characters */
    private static final int f1698 = 8;

    /* renamed from: л  reason: contains not printable characters */
    private static final int f1699 = 9;

    /* renamed from: м  reason: contains not printable characters */
    private static final int f1700 = 10;

    /* renamed from: н  reason: contains not printable characters */
    private static final int f1701 = 11;

    /* renamed from: о  reason: contains not printable characters */
    private static final int f1702 = 12;

    /* renamed from: п  reason: contains not printable characters */
    private static final int f1703 = 13;

    /* renamed from: ё  reason: contains not printable characters */
    private static final String f1704 = "J";

    /* renamed from: а  reason: contains not printable characters */
    private ISecurityGuardPlugin f1705;

    public C1126(ISecurityGuardPlugin iSecurityGuardPlugin) {
        init(iSecurityGuardPlugin, new Object[0]);
    }

    /* renamed from: а  reason: contains not printable characters */
    private Object m1131(int i, String str, byte[] bArr, int i2) throws SecException {
        if (str == null || str.length() <= 0) {
            throw new SecException("", 501);
        } else if (i == 8 || i == 9 || i == 13 || i == 12) {
            return (Boolean) this.f1705.getRouter().doCommand(10503, Integer.valueOf(i), str, bArr, Integer.valueOf(i2));
        } else {
            if (i != 10 && i != 11) {
                return null;
            }
            byte[] bArr2 = (byte[]) this.f1705.getRouter().doCommand(10503, Integer.valueOf(i), str, bArr, Integer.valueOf(i2));
            return i == 10 ? new String(bArr2) : bArr2;
        }
    }

    /* renamed from: б  reason: contains not printable characters */
    private String m1132(String str, String str2, boolean z) throws SecException {
        byte[] bArr = (byte[]) this.f1705.getRouter().doCommand(10502, 6, str2, Boolean.valueOf(z), str, null);
        if (bArr != null) {
            try {
                if (bArr.length > 0) {
                    return new String(bArr, "UTF-8");
                }
            } catch (Exception unused) {
                throw new SecException("return invalid String result", 499);
            }
        }
        throw new SecException("return null byteResult", 499);
    }

    /* renamed from: в  reason: contains not printable characters */
    private int m1133(String str, String str2, String str3, boolean z) throws SecException {
        return ((Integer) this.f1705.getRouter().doCommand(10502, 5, str3, Boolean.valueOf(z), str, str2)).intValue();
    }

    /* renamed from: г  reason: contains not printable characters */
    private void m1134(String str, String str2, boolean z) throws SecException {
        this.f1705.getRouter().doCommand(10502, 7, str2, Boolean.valueOf(z), str, null);
    }

    @Override // com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent
    public boolean getBoolean(String str) throws SecException {
        String str2 = m1132(str, "Z", false);
        if (str2 == null) {
            return false;
        }
        try {
            return "1".equals(str2);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent
    public byte[] getByteArray(String str) throws SecException {
        String str2 = m1132(str, f1690, false);
        if (str2 != null) {
            try {
                return C1122.m1127(str2);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    @Override // com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent
    public byte[] getByteArrayDDp(String str) throws SecException {
        String str2 = m1132(str, f1690, true);
        if (str2 != null) {
            try {
                return C1122.m1127(str2);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    @Override // com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent
    public byte[] getByteArrayDDpEx(String str, int i) throws SecException {
        return (byte[]) m1131(11, str, null, i);
    }

    @Override // com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent
    public float getFloat(String str) throws SecException {
        String str2 = m1132(str, "F", false);
        if (str2 != null) {
            try {
                return Float.parseFloat(str2);
            } catch (Throwable unused) {
            }
        }
        return -1.0f;
    }

    @Override // com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent
    public int getInt(String str) throws SecException {
        String str2 = m1132(str, "I", false);
        if (str2 != null) {
            try {
                return Integer.parseInt(str2);
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    @Override // com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent
    public long getLong(String str) throws SecException {
        String str2 = m1132(str, f1704, false);
        if (str2 != null) {
            try {
                return Long.parseLong(str2);
            } catch (Throwable unused) {
            }
        }
        return -1L;
    }

    @Override // com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent
    public String getString(String str) throws SecException {
        return m1132(str, f1691, false);
    }

    @Override // com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent
    public String getStringDDp(String str) throws SecException {
        return m1132(str, f1691, true);
    }

    @Override // com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent
    public String getStringDDpEx(String str, int i) throws SecException {
        return (String) m1131(10, str, null, i);
    }

    @Override // com.alibaba.wireless.security.open.IComponent
    public int init(ISecurityGuardPlugin iSecurityGuardPlugin, Object... objArr) {
        this.f1705 = iSecurityGuardPlugin;
        return 0;
    }

    @Override // com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent
    public int putBoolean(String str, boolean z) throws SecException {
        return m1133(str, z ? "1" : "0", "Z", false);
    }

    @Override // com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent
    public int putByteArray(String str, byte[] bArr) throws SecException {
        return m1133(str, C1122.m1126(bArr), f1690, false);
    }

    @Override // com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent
    public int putByteArrayDDp(String str, byte[] bArr) throws SecException {
        return m1133(str, C1122.m1126(bArr), f1690, true);
    }

    @Override // com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent
    public boolean putByteArrayDDpEx(String str, byte[] bArr, int i) throws SecException {
        return ((Boolean) m1131(9, str, bArr, i)).booleanValue();
    }

    @Override // com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent
    public int putFloat(String str, float f) throws SecException {
        return m1133(str, Float.toString(f), "F", false);
    }

    @Override // com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent
    public int putInt(String str, int i) throws SecException {
        return m1133(str, Integer.toString(i), "I", false);
    }

    @Override // com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent
    public int putLong(String str, long j) throws SecException {
        return m1133(str, Long.toString(j), f1704, false);
    }

    @Override // com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent
    public int putString(String str, String str2) throws SecException {
        return m1133(str, str2, f1691, false);
    }

    @Override // com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent
    public int putStringDDp(String str, String str2) throws SecException {
        return m1133(str, str2, f1691, true);
    }

    @Override // com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent
    public boolean putStringDDpEx(String str, String str2, int i) throws SecException {
        if (str2 == null || str2.length() <= 0) {
            throw new SecException("", 501);
        }
        try {
            return ((Boolean) m1131(8, str, str2.getBytes("UTF-8"), i)).booleanValue();
        } catch (UnsupportedEncodingException unused) {
            throw new SecException("", 501);
        }
    }

    @Override // com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent
    public void removeBoolean(String str) throws SecException {
        m1134(str, "Z", false);
    }

    @Override // com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent
    public void removeByteArray(String str) throws SecException {
        m1134(str, f1690, false);
    }

    @Override // com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent
    public void removeByteArrayDDp(String str) throws SecException {
        m1134(str, f1690, true);
    }

    @Override // com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent
    public void removeByteArrayDDpEx(String str, int i) throws SecException {
        m1131(13, str, null, i);
    }

    @Override // com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent
    public void removeFloat(String str) throws SecException {
        m1134(str, "F", false);
    }

    @Override // com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent
    public void removeInt(String str) throws SecException {
        m1134(str, "I", false);
    }

    @Override // com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent
    public void removeLong(String str) throws SecException {
        m1134(str, f1704, false);
    }

    @Override // com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent
    public void removeString(String str) throws SecException {
        m1134(str, f1691, false);
    }

    @Override // com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent
    public void removeStringDDp(String str) throws SecException {
        m1134(str, f1691, true);
    }

    @Override // com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent
    public void removeStringDDpEx(String str, int i) throws SecException {
        m1131(12, str, null, i);
    }
}
