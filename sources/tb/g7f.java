package tb;

import android.app.Application;
import com.alibaba.triver.TriverNavInitializer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class g7f extends mss {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public g7f(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(g7f g7fVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/launcher/InitTriverNav");
    }

    @Override // tb.mss
    public void p(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ea6706", new Object[]{this, application, hashMap});
        } else {
            TriverNavInitializer.init(application, hashMap);
        }
    }
}
