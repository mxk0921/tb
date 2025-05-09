package tb;

import android.content.Context;
import android.os.Environment;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class tg9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093652);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a33a29a", new Object[]{str});
        }
        int lastIndexOf = str.lastIndexOf("../");
        if (lastIndexOf == -1) {
            return str;
        }
        return str.substring(lastIndexOf + 1);
    }

    public static String b(Context context, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a3f43b33", new Object[]{context, str});
        }
        File externalFilesDir = context.getExternalFilesDir(null);
        if (("mounted".equals(Environment.getExternalStorageState()) || !Environment.isExternalStorageRemovable()) && externalFilesDir != null) {
            str2 = externalFilesDir.getAbsolutePath();
        } else {
            str2 = context.getFilesDir().getAbsolutePath();
        }
        return str2 + File.separator + str;
    }
}
