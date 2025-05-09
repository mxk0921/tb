package tb;

import android.os.Environment;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class coq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ERROR = -1;

    static {
        t2o.a(989856442);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a36c014", new Object[0])).booleanValue();
        }
        try {
            String externalStorageState = Environment.getExternalStorageState();
            if (externalStorageState != null) {
                if (externalStorageState.equals("mounted")) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
