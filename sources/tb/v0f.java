package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.android.hudong.TBHDColdLaunchTask;
import com.taobao.android.launcher.bootstrap.tao.ability.LinkRule;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class v0f extends mss {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public v0f(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(v0f v0fVar, String str, Object... objArr) {
        if (str.hashCode() == -1890718817) {
            return new Boolean(super.d((en8) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/launcher/InitHudongSdk");
    }

    @Override // tb.vct
    public boolean d(en8<String, Void> en8Var) {
        LinkRule c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f4deb9f", new Object[]{this, en8Var})).booleanValue();
        }
        if (super.d(en8Var) && (c = yrg.c()) != null) {
            return "hdsdk".equals(c.name);
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
        xhq c = ppo.b().c();
        if (c != null) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("uriString", c.e.getDataString());
            LinkRule c2 = yrg.c();
            hashMap2.put(AliFestivalWVPlugin.PARAMS_MODULE_NAME, c2 == null ? null : c2.name);
            TBHDColdLaunchTask.init(application, hashMap2);
        }
    }
}
