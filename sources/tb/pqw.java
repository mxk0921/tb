package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class pqw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DEFAULT_MAX_AGE = 2592000000L;
    public static final int FILE_INFO_MIN_LEN = 60;
    public static final long S_MAX_AGE = 300000;

    static {
        t2o.a(989855767);
    }

    public static oqw b(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oqw) ipChange.ipc$dispatch("4240cd1d", new Object[]{bArr, new Integer(i), new Integer(i2)});
        }
        try {
            return a(new String(bArr, i, i2, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static oqw a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oqw) ipChange.ipc$dispatch("87d5ce5a", new Object[]{str});
        }
        if (str.length() > 60 && str.charAt(13) == '~' && str.charAt(27) == '~' && str.charAt(60) == '~') {
            oqw oqwVar = new oqw();
            String[] split = str.split(Constants.WAVE_SEPARATOR);
            if (7 != split.length) {
                return null;
            }
            try {
                oqwVar.f25584a = Long.parseLong(split[0]);
                try {
                    oqwVar.b = Long.parseLong(split[1]);
                    oqwVar.c = split[2];
                    oqwVar.e = split[3];
                    oqwVar.d = split[4];
                    oqwVar.f = split[5];
                    oqwVar.g = split[6];
                    return oqwVar;
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    return null;
                }
            } catch (NumberFormatException e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public static void c(oqw oqwVar, FileChannel fileChannel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("176b0930", new Object[]{oqwVar, fileChannel});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        byte[] a2 = oqwVar.a();
        if (a2 != null) {
            ByteBuffer allocate = ByteBuffer.allocate(a2.length + 1);
            allocate.put(a2);
            allocate.put((byte) 10);
            allocate.position(0);
            try {
                fileChannel.write(allocate, oqwVar.h);
            } catch (IOException e) {
                v7t.d("FileInfoParser", "refreshFileInfo: write error. " + e.getMessage());
            }
            if (v7t.h()) {
                v7t.a("FileInfoParser", "refreshFileInfo time cost:" + (System.currentTimeMillis() - currentTimeMillis));
            }
        }
    }

    public static oqw d(int i, oqw oqwVar, FileChannel fileChannel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oqw) ipChange.ipc$dispatch("ea462fd8", new Object[]{new Integer(i), oqwVar, fileChannel});
        }
        if (v7t.h()) {
            v7t.a("FileInfoParser", "updateFileInfo filename:" + oqwVar.c + "operation:" + i);
        }
        if (i == 1) {
            c(oqwVar, fileChannel);
        } else if (i == 2) {
            long currentTimeMillis = System.currentTimeMillis();
            if (oqwVar.f25584a == 0) {
                oqwVar.f25584a = currentTimeMillis + 300000;
            }
            c(oqwVar, fileChannel);
        } else if (i == 3) {
            oqwVar.i = false;
            c(oqwVar, fileChannel);
        } else if (i == 4) {
            long currentTimeMillis2 = System.currentTimeMillis();
            if (oqwVar.f25584a == 0) {
                oqwVar.f25584a = currentTimeMillis2 + 300000;
            }
            try {
                oqwVar.h = fileChannel.size();
            } catch (IOException e) {
                v7t.d("FileInfoParser", "updateFileInfo setPos error:" + oqwVar.c + ". fChannel.size():" + e.getMessage());
            }
            c(oqwVar, fileChannel);
        }
        return oqwVar;
    }
}
