package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.launcher.bootstrap.tao.ability.LinkRule;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.middleware.compat.MtopInitializer;
import com.taobao.themis.open.ability.calendar.TMSCalendarBridge;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class k2f extends mss {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public k2f(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(k2f k2fVar, String str, Object... objArr) {
        if (str.hashCode() == -1890718817) {
            return new Boolean(super.d((en8) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/launcher/InitMtopSSRLink");
    }

    @Override // tb.mss
    public void p(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ea6706", new Object[]{this, application, hashMap});
        } else {
            MtopInitializer.initDelay(application, hashMap);
        }
    }

    @Override // tb.vct
    public boolean d(en8<String, Void> en8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f4deb9f", new Object[]{this, en8Var})).booleanValue();
        }
        boolean d = super.d(en8Var);
        if (d) {
            LinkRule c = yrg.c();
            if (c == null) {
                return false;
            }
            d = TMSCalendarBridge.namespace.equals(c.name);
        }
        if (!d || ABGlobal.isFeatureOpened(LauncherRuntime.h, "mtop_delay_init")) {
            return d;
        }
        return false;
    }
}
