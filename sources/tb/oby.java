package tb;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.android.base.Versions;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class oby {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_STRING = "encode";

    static {
        t2o.a(760217670);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("83fd067b", new Object[]{str, str2});
        }
        if (str == null || str2 == null) {
            return null;
        }
        return str + "encode" + str2;
    }

    public static Bitmap b(String str, String str2) {
        InputStream H;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("41c18f4f", new Object[]{str, str2});
        }
        if (str == null || str2 == null || (H = AVFSCacheManager.getInstance().defaultCache().w().H(a(str, str2))) == null) {
            return null;
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(H);
        if (decodeStream != null) {
            Versions.isDebug();
            return decodeStream;
        }
        Versions.isDebug();
        return null;
    }

    public static boolean c(Bitmap bitmap, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("512608fd", new Object[]{bitmap, str, str2})).booleanValue();
        }
        if (bitmap == null || str == null || str2 == null) {
            return false;
        }
        boolean j = AVFSCacheManager.getInstance().defaultCache().w().j(a(str, str2), new ByteArrayInputStream(ple.a(bitmap)));
        Versions.isDebug();
        return j;
    }
}
