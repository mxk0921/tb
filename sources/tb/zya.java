package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.homepage.launcher.LauncherInitCheckList;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class zya {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LAUNCHER_NAME = "launcherName";
    public static final String LAUNCHER_TRIGGER = "triggerLauncher";
    public static final String LAUNCHER_TYPE = "launcherType";

    /* renamed from: a  reason: collision with root package name */
    public final f0b f33099a = f0b.i();

    static {
        t2o.a(729809316);
    }

    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
        } else if (p7p.k()) {
            LauncherInitCheckList.c(getClass());
        } else {
            if (vxl.b().u()) {
                c4b.i().k();
            }
            LauncherInitCheckList.c(getClass());
        }
    }
}
