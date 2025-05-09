package а.а.а.а.а.в;

import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.compat.ICompatComponent;
import com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin;

/* renamed from: а.а.а.а.а.в.а  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C1123 implements ICompatComponent {

    /* renamed from: а  reason: contains not printable characters */
    private static ISecurityGuardPlugin f1680 = null;

    /* renamed from: б  reason: contains not printable characters */
    private static final int f1681 = 32;

    /* renamed from: в  reason: contains not printable characters */
    private static final int f1682 = 24;

    public C1123(ISecurityGuardPlugin iSecurityGuardPlugin) {
        init(iSecurityGuardPlugin, new Object[0]);
    }

    /* renamed from: а  reason: contains not printable characters */
    private String m1128(int i) {
        return (String) f1680.getRouter().doCommand(12801, Integer.valueOf(i));
    }

    @Override // com.alibaba.wireless.security.open.compat.ICompatComponent
    public String getCachedSecurityToken(int i) throws SecException {
        String str = m1128(i);
        return (str == null || "".equals(str) || !(str.length() == 32 || str.length() == 24)) ? "000000000000000000000000" : str;
    }

    @Override // com.alibaba.wireless.security.open.IComponent
    public int init(ISecurityGuardPlugin iSecurityGuardPlugin, Object... objArr) {
        f1680 = iSecurityGuardPlugin;
        return 0;
    }
}
