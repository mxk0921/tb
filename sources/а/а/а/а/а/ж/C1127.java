package а.а.а.а.а.ж;

import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin;
import com.alibaba.wireless.security.open.safetoken.ISafeTokenComponent;
import java.io.UnsupportedEncodingException;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* renamed from: а.а.а.а.а.ж.а  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C1127 implements ISafeTokenComponent {

    /* renamed from: б  reason: contains not printable characters */
    private static final int f1706 = 0;

    /* renamed from: в  reason: contains not printable characters */
    private static final int f1707 = 1;

    /* renamed from: г  reason: contains not printable characters */
    private static final int f1708 = 2;

    /* renamed from: д  reason: contains not printable characters */
    private static final int f1709 = 3;

    /* renamed from: е  reason: contains not printable characters */
    private static final int f1710 = 4;

    /* renamed from: ж  reason: contains not printable characters */
    private static final int f1711 = 6;

    /* renamed from: ё  reason: contains not printable characters */
    private static final int f1712 = 5;

    /* renamed from: а  reason: contains not printable characters */
    private ISecurityGuardPlugin f1713;

    public C1127(ISecurityGuardPlugin iSecurityGuardPlugin) {
        init(iSecurityGuardPlugin, new Object[0]);
    }

    /* renamed from: а  reason: contains not printable characters */
    private Object m1135(int i, String str, byte[] bArr, String str2, int i2) throws SecException {
        if (str == null || str.length() <= 0) {
            throw new SecException("", 1601);
        } else if (i > 0 && i < 4) {
            return (Boolean) this.f1713.getRouter().doCommand(IMediaPlayer.MEDIA_INFO_VIDEO_FIRST_RENDER_SURFACE_UPDATE, Integer.valueOf(i), str, bArr, str2, Integer.valueOf(i2));
        } else {
            if (i <= 3 || i > 6) {
                return null;
            }
            byte[] bArr2 = (byte[]) this.f1713.getRouter().doCommand(IMediaPlayer.MEDIA_INFO_VIDEO_FIRST_RENDER_SURFACE_UPDATE, Integer.valueOf(i), str, bArr, str2, Integer.valueOf(i2));
            return i == 6 ? new String(bArr2) : bArr2;
        }
    }

    @Override // com.alibaba.wireless.security.open.safetoken.ISafeTokenComponent
    public byte[] decryptWithToken(String str, byte[] bArr, int i) throws SecException {
        return (byte[]) m1135(5, str, bArr, null, i);
    }

    @Override // com.alibaba.wireless.security.open.safetoken.ISafeTokenComponent
    public byte[] encryptWithToken(String str, byte[] bArr, int i) throws SecException {
        return (byte[]) m1135(4, str, bArr, null, i);
    }

    @Override // com.alibaba.wireless.security.open.safetoken.ISafeTokenComponent
    public byte[] getOtp(String str, int i, String[] strArr, byte[][] bArr) throws SecException {
        if (str != null && str.length() > 0) {
            return (byte[]) this.f1713.getRouter().doCommand(IMediaPlayer.MEDIA_INFO_VIDEO_REPLAY_AFTER_NET_STATE_ERROR, str, Integer.valueOf(i), strArr, bArr, "");
        }
        throw new SecException("", 1601);
    }

    @Override // com.alibaba.wireless.security.open.safetoken.ISafeTokenComponent
    public byte[] getOtp(String str, int i, String[] strArr, byte[][] bArr, String str2) throws SecException {
        if (str != null && str.length() > 0) {
            return (byte[]) this.f1713.getRouter().doCommand(IMediaPlayer.MEDIA_INFO_VIDEO_REPLAY_AFTER_NET_STATE_ERROR, str, Integer.valueOf(i), strArr, bArr, str2);
        }
        throw new SecException("", 1601);
    }

    @Override // com.alibaba.wireless.security.open.IComponent
    public int init(ISecurityGuardPlugin iSecurityGuardPlugin, Object... objArr) {
        this.f1713 = iSecurityGuardPlugin;
        return 0;
    }

    @Override // com.alibaba.wireless.security.open.safetoken.ISafeTokenComponent
    public boolean isTokenExisted(String str) throws SecException {
        return ((Boolean) m1135(2, str, null, null, 0)).booleanValue();
    }

    @Override // com.alibaba.wireless.security.open.safetoken.ISafeTokenComponent
    public void removeToken(String str) throws SecException {
        m1135(3, str, null, null, 0);
    }

    @Override // com.alibaba.wireless.security.open.safetoken.ISafeTokenComponent
    public boolean saveToken(String str, String str2, String str3, int i) throws SecException {
        if (str2 == null || str2.length() <= 0) {
            throw new SecException("", 1601);
        }
        try {
            return ((Boolean) m1135(1, str, str2.getBytes("UTF-8"), str3, i)).booleanValue();
        } catch (UnsupportedEncodingException unused) {
            throw new SecException("", 1601);
        }
    }

    @Override // com.alibaba.wireless.security.open.safetoken.ISafeTokenComponent
    public String signWithToken(String str, byte[] bArr, int i) throws SecException {
        return (String) m1135(6, str, bArr, null, i);
    }
}
