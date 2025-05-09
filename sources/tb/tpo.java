package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoPackageInfo;
import com.taobao.update.framework.UpdateRuntime;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class tpo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(956301314);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7c1a4f0", new Object[]{this});
            return;
        }
        String ttid = TaoPackageInfo.getTTID();
        String group = m51.getGroup(ttid);
        UpdateRuntime.init(Globals.getApplication(), ttid, m51.getAppDispName(), group);
        kjv.getInstance().init(Globals.getApplication(), group, ttid, false, new bjv());
    }

    public boolean initSafemode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70f2b86b", new Object[]{this})).booleanValue();
        }
        if (UpdateRuntime.processName.equals(Globals.getApplication().getPackageName())) {
            return false;
        }
        if (UpdateRuntime.processName.endsWith(":safemode")) {
            a();
        }
        return true;
    }
}
