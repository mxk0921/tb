package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class bk7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989855813);
    }

    public void onFailed(File file, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acf9a904", new Object[]{this, file, str});
        }
    }

    public void onSuccess(File file, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c4f8b2c", new Object[]{this, file, str});
        }
    }
}
