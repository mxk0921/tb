package tb;

import android.app.Application;
import com.alibaba.ability.localization.InitLocalization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class p1f extends bxk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public p1f(String str) {
        super(str);
        i(true);
    }

    public static /* synthetic */ Object ipc$super(p1f p1fVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/launcher/InitLocalization");
    }

    @Override // tb.bxk, tb.mss
    public void p(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ea6706", new Object[]{this, application, hashMap});
        } else {
            InitLocalization.init(application, hashMap);
        }
    }
}
