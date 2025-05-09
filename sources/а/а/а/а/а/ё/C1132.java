package а.а.а.а.а.ё;

import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin;
import com.alibaba.wireless.security.open.opensdk.IOpenSDKComponent;
import java.nio.ByteBuffer;

/* renamed from: а.а.а.а.а.ё.а  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C1132 implements IOpenSDKComponent {

    /* renamed from: а  reason: contains not printable characters */
    private ISecurityGuardPlugin f1735;

    public C1132(ISecurityGuardPlugin iSecurityGuardPlugin) {
        init(iSecurityGuardPlugin, new Object[0]);
    }

    /* renamed from: а  reason: contains not printable characters */
    private byte[] m1149(String str, String str2, String str3, byte[] bArr, String str4) {
        return (byte[]) this.f1735.getRouter().doCommand(11601, str, str2, str3, bArr, str4);
    }

    /* renamed from: б  reason: contains not printable characters */
    private long m1150(byte[] bArr) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.put(bArr, 0, bArr.length);
        allocate.flip();
        return allocate.getLong();
    }

    @Override // com.alibaba.wireless.security.open.opensdk.IOpenSDKComponent
    public Long analyzeOpenId(String str, String str2, String str3, byte[] bArr, String str4) throws SecException {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0 || str3 == null || str2.length() == 0 || bArr == null || bArr.length == 0) {
            throw new SecException(1101);
        }
        byte[] bArr2 = m1149(str, str2, str3, bArr, str4);
        if (bArr2 == null || bArr2.length > 8 || bArr2.length <= 0) {
            return null;
        }
        return Long.valueOf(m1150(bArr2));
    }

    @Override // com.alibaba.wireless.security.open.IComponent
    public int init(ISecurityGuardPlugin iSecurityGuardPlugin, Object... objArr) {
        this.f1735 = iSecurityGuardPlugin;
        return 0;
    }
}
