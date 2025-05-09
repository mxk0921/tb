package tb;

import android.app.Activity;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import com.taobao.linkmanager.launcher.TbFcLinkInit;
import com.taobao.tao.BaseActivity;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class bht {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static WeakReference<Activity> f16396a;

    static {
        t2o.a(744489001);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9536a445", new Object[0]);
            return;
        }
        vp9.a("linkx", "TbNavContext === closeNav2MainPageActivity: 冷启动拉端，关闭首页");
        WeakReference<Activity> weakReference = f16396a;
        if (weakReference != null && weakReference.get() != null) {
            Activity activity = f16396a.get();
            Intent intent = activity.getIntent();
            if (intent != null) {
                intent.putExtra("finishReason", "linkManager");
            }
            if (!LauncherRuntime.n || !(activity instanceof BaseActivity)) {
                f16396a.get().finish();
            } else {
                ((BaseActivity) activity).finish(true);
            }
            f16396a = null;
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d478e598", new Object[0]);
            return;
        }
        WeakReference<Activity> weakReference = f16396a;
        if (weakReference != null && weakReference.get() != null) {
            vp9.a("linkx", "TbNavCenter === closeOpenActivity === openActivity =" + f16396a.get().getClass());
            Activity activity = f16396a.get();
            if (activity != null) {
                boolean b = qg0.b(activity.getIntent());
                vp9.a("linkx", "TbNavCenter === closeOpenActivity === isColdStartup = " + b);
                if (!b) {
                    activity.finish();
                }
            }
            f16396a = null;
        }
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("531dac2b", new Object[0]);
            return;
        }
        TFCCommonUtils.u(TbFcLinkInit.instance().mApplication);
        b();
    }
}
