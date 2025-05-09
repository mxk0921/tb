package tb;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class aul {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f16014a;

    static {
        t2o.a(782237712);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2952316a", new Object[0]);
        }
        return f16014a;
    }

    public static void b(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee4f43ec", new Object[]{context});
            return;
        }
        if ("mounted".equals(Environment.getExternalStorageState()) || !Environment.isExternalStorageRemovable()) {
            File externalCacheDir = context.getExternalCacheDir();
            if (externalCacheDir == null || !externalCacheDir.exists()) {
                str = context.getCacheDir().getAbsolutePath();
            } else {
                str = externalCacheDir.getAbsolutePath();
            }
        } else {
            str = context.getCacheDir().getAbsolutePath();
        }
        if (!TextUtils.isEmpty(str)) {
            String str2 = File.separator;
            if (!str.endsWith(str2)) {
                str = str + str2;
            }
        }
        f16014a = str + "taopai" + File.separator + "charge_file";
    }
}
