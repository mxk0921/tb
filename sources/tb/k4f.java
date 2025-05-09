package tb;

import android.app.Application;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class k4f extends mss {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public k4f(String str) {
        super(str);
        i(true);
    }

    public static /* synthetic */ Object ipc$super(k4f k4fVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/launcher/InitPreEnv");
    }

    @Override // tb.mss
    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c246ea2", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.mss
    public void p(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ea6706", new Object[]{this, application, hashMap});
            return;
        }
        System.setProperty(OConstant.DIMEN_PROCESS_START_TIME, "" + SystemClock.uptimeMillis());
        PreferenceManager.getDefaultSharedPreferences(application);
        application.getSharedPreferences("taobao_speed", 0);
    }
}
