package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class mct {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CHKSUMLEN = 8;
    public static final int GIDLEN = 8;
    public static final byte LF_BLK = 52;
    public static final byte LF_CHR = 51;
    public static final byte LF_CONTIG = 55;
    public static final byte LF_DIR = 53;
    public static final byte LF_FIFO = 54;
    public static final byte LF_LINK = 49;
    public static final byte LF_NORMAL = 48;
    public static final byte LF_OLDNORM = 0;
    public static final byte LF_SYMLINK = 50;
    public static final int MODELEN = 8;
    public static final int MODTIMELEN = 12;
    public static final int NAMELEN = 100;
    public static final int SIZELEN = 12;
    public static final int UIDLEN = 8;
    public static final int USTAR_DEVLEN = 8;
    public static final int USTAR_FILENAME_PREFIX = 155;
    public static final int USTAR_GROUP_NAMELEN = 32;
    public static final String USTAR_MAGIC = "ustar";
    public static final int USTAR_MAGICLEN = 8;
    public static final int USTAR_USER_NAMELEN = 32;

    /* renamed from: a  reason: collision with root package name */
    public StringBuffer f23945a = new StringBuffer();
    public long b;
    public byte c;
    public StringBuffer d;

    static {
        t2o.a(843055307);
    }

    public mct() {
        String property = System.getProperty("user.name", "");
        new StringBuffer(property.length() > 31 ? property.substring(0, 31) : property);
        this.d = new StringBuffer();
    }

    public static StringBuffer a(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StringBuffer) ipChange.ipc$dispatch("ed97a8b4", new Object[]{bArr, new Integer(i), new Integer(i2)});
        }
        StringBuffer stringBuffer = new StringBuffer(i2);
        int i3 = i2 + i;
        while (i < i3) {
            byte b = bArr[i];
            if (b == 0) {
                break;
            }
            stringBuffer.append((char) b);
            i++;
        }
        return stringBuffer;
    }
}
