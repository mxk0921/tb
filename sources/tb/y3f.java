package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.protodb.LSDB;
import com.taobao.phenix.compat.PhenixApngDelayInitializer;
import com.taobao.phenix.compat.PhenixInitializer;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class y3f extends bxk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public y3f(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(y3f y3fVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/launcher/InitPhenixMin");
    }

    @Override // tb.mss
    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c246ea2", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.bxk, tb.mss
    public void p(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ea6706", new Object[]{this, application, hashMap});
            return;
        }
        LSDB.tryLoadNativeLibrary();
        HashMap<String, Object> hashMap2 = new HashMap<>(2);
        Boolean bool = Boolean.TRUE;
        hashMap2.put("isNextLaunch", bool);
        hashMap2.put("ngLaunch", bool);
        new PhenixInitializer().init(application, hashMap2);
        PhenixInitializer.initHeif(application);
        PhenixInitializer.initTBScheduler(application);
        PhenixApngDelayInitializer.init(application, hashMap);
        PhenixInitializer.initBuild(application);
    }
}
