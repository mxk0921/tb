package tb;

import android.app.Application;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class v6f extends mss {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String e = "TLog.InitTaoLog";

    public v6f(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(v6f v6fVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/launcher/InitTaoLogForAccs");
    }

    @Override // tb.mss
    public void p(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ea6706", new Object[]{this, application, hashMap});
            return;
        }
        try {
            j5s.j().N();
        } catch (Exception e2) {
            Log.e(e, "tlog set uploader and msg sender failure", e2);
        }
        try {
            r4s.e(application);
        } catch (Exception e3) {
            Log.e(e, "tlog config switch failure", e3);
        }
    }
}
