package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class b9i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(782237816);
    }

    public static String a(String str) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e5ce5e2c", new Object[]{str});
        }
        File file = new File(str);
        if (!file.exists() || (listFiles = file.listFiles()) == null) {
            return "";
        }
        for (File file2 : listFiles) {
            if (TextUtils.equals("material.json", file2.getName()) || TextUtils.equals("config.json", file2.getName())) {
                return file2.getAbsolutePath();
            }
        }
        return "";
    }
}
