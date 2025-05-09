package tb;

import android.widget.Toast;
import androidx.appcompat.taobao.util.Globals;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class j0u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(573571215);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20d609ce", new Object[]{str});
        } else {
            Toast.makeText(Globals.getApplication(), str, 0).show();
        }
    }
}
