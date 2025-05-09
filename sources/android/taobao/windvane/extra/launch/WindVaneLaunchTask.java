package android.taobao.windvane.extra.launch;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WindVaneLaunchTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final WindVaneWelComeTask welcomeTask = new WindVaneWelComeTask();
    private static final WindVaneHomeVisibleTask homeVisibleTask = new WindVaneHomeVisibleTask();
    private static final WindVaneIdleTask idleTask = new WindVaneIdleTask();
    public static final WindVanePreCreateTask preCreateTask = new WindVanePreCreateTask();

    static {
        t2o.a(989855984);
    }

    public static void initAtHomeVisible(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3596abab", new Object[]{application, hashMap});
        } else {
            homeVisibleTask.init(application, hashMap);
        }
    }

    public static void initAtIdle(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27321852", new Object[]{application, hashMap});
        } else {
            idleTask.init(application, hashMap);
        }
    }

    public static void initAtWelcome(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a64178fa", new Object[]{application, hashMap});
        } else {
            welcomeTask.init(application, hashMap);
        }
    }

    public static void initPreCreate(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37907aca", new Object[]{application, hashMap});
        } else {
            preCreateTask.init(application, hashMap);
        }
    }
}
