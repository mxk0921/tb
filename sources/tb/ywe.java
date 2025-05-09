package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.init.Launcher_InitAccs;
import com.taobao.android.speed.TBSpeed;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ywe extends bxk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ywe(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(ywe yweVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/launcher/InitAccsInAppConnectionB");
    }

    @Override // tb.bxk, tb.mss
    public void p(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ea6706", new Object[]{this, application, hashMap});
        } else if (TBSpeed.isSpeedEdition(application, "accs_opt")) {
            new Launcher_InitAccs().init(application, hashMap);
        }
    }
}
