package tb;

import android.content.Context;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.task.Coordinator;
import com.taobao.flowcustoms.afc.utils.AfcUtils;
import com.taobao.linkmanager.AfcLifeCycleCenter;
import com.taobao.linkmanager.afc.reduction.LoginReductionManager;
import com.taobao.linkmanager.afc.remote.HomePageReceiver;
import com.taobao.linkmanager.afc.remote.LoginReceiver;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import com.taobao.linkmanager.flowout.FlowOutCenter;
import com.taobao.linkmanager.launcher.TbFcLinkInit;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class z2b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f32482a = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                FlowOutCenter.f().g(TbFcLinkInit.instance().mApplication);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f32483a;
        public final /* synthetic */ boolean b;

        public b(Context context, boolean z) {
            this.f32483a = context;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (AfcUtils.s(this.f32483a)) {
                AfcUtils.w(this.f32483a);
                if (this.b) {
                    vp9.a("linkx", "HomePageTask === executeHomePageTask === 首次安装，执行还原逻辑");
                    LoginReductionManager.l().g(this.f32483a, false);
                } else {
                    vp9.a("linkx", "HomePageTask === executeHomePageTask === 多语言站点，不执行还原逻辑");
                }
            }
            ci7.a(this.f32483a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f32484a;

        public c(Context context) {
            this.f32484a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            LoginBroadcastHelper.registerLoginReceiver(this.f32484a, LoginReceiver.b.f10914a);
            try {
                z2b.a(this.f32484a);
            } catch (Exception e) {
                vp9.a("linkx", "HomePageReceiver === onReceive: 上传渠道信息异常：" + e);
            }
        }
    }

    static {
        t2o.a(744489103);
    }

    public static /* synthetic */ void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fe40831", new Object[]{context});
        } else {
            d(context);
        }
    }

    public static void b(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a8644bd", new Object[]{context, new Boolean(z)});
            return;
        }
        if (aaa.b()) {
            Coordinator.execute(new a());
        } else {
            FlowOutCenter.f().g(TbFcLinkInit.instance().mApplication);
        }
        if (AfcLifeCycleCenter.isLauncherStart) {
            Coordinator.execute(new b(context, z));
        } else {
            if (LauncherRuntime.m) {
                bht.a();
            }
            LocalBroadcastManager.getInstance(context).unregisterReceiver(HomePageReceiver.a.f10912a);
        }
        Coordinator.execute(new c(context));
    }

    public static void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b186ccb", new Object[]{context});
        } else if (context != null && ((Boolean) cmp.b(context).a("huaWei_first_install", Boolean.TRUE)).booleanValue()) {
            String o = TFCCommonUtils.o(context);
            vp9.a("linkx", "HomePageReceiver === onReceive === 获取的trackId：" + o);
            HashMap hashMap = new HashMap();
            hashMap.put("imei", AfcUtils.j(context, false));
            hashMap.put("oaid", TFCCommonUtils.k(context));
            hashMap.put("activeTime", AfcUtils.g() + "");
            hashMap.put("hwChannelId", o);
            ah0.c(19999, "hw_channel_data", "", "", hashMap);
            ah0.c(2101, "hw_channel_data", "", "", hashMap);
            cmp.b(context).d("huaWei_first_install", Boolean.FALSE);
        }
    }

    public static void c(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f600e69b", new Object[]{context, new Boolean(z)});
        } else if (f32482a.compareAndSet(false, true)) {
            vp9.a("linkx", "HomePageTask === executeHomePageTask");
            b(context, z);
            ah0.h(true);
        }
    }
}
