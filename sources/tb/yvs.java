package tb;

import android.app.Application;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.appbundle.a;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class yvs {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SP_TL_GOODS_ = "com.taobao.android.tlgoods";

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f32377a = new AtomicBoolean(false);
    public static final AtomicBoolean b = new AtomicBoolean(false);

    static {
        t2o.a(806355559);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45481b60", new Object[0])).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("tblive_dx_preload", "channelDXPreloadEnable", "true"));
    }

    public static void b(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("276f7107", new Object[]{application});
        } else if (!a()) {
            TLog.loge("TBLive", "TaoLiveDXPreloadX", "channelImagePreload, orange upgrade! ");
        } else if (b.compareAndSet(false, true)) {
            TLog.loge("TBLive", "TaoLiveDXPreloadX", "channelImagePreload, running! ");
            try {
                new rws().a(application);
            } catch (Throwable th) {
                TLog.loge("TBLive", "TaoLiveDXPreloadX", "channelImagePreload, error: " + th.getMessage());
            }
            TLog.loge("TBLive", "TaoLiveDXPreloadX", "channelImagePreload success! ");
        } else {
            TLog.loge("TBLive", "TaoLiveDXPreloadX", "channelImagePreload, done! ");
        }
    }

    public static void c() {
        if (!d()) {
            TLog.loge("TBLive", "TaoLiveDXPreloadX", "liveDXPreload, orange upgrade! ");
        } else if (f32377a.compareAndSet(false, true)) {
            TLog.loge("TBLive", "TaoLiveDXPreloadX", "liveDXPreload, running! ");
            try {
                IpChange ipChange = w36.$ipChange;
                w36.class.getMethod("init", Context.class).invoke(w36.class.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]), a.Companion.a().d());
                TLog.loge("TBLive", "TaoLiveDXPreloadX", "liveDXPreload, success! ");
            } catch (Throwable th) {
                TLog.loge("TBLive", "TaoLiveDXPreloadX", "liveDXPreload, error: " + th.getMessage());
            }
        } else {
            TLog.loge("TBLive", "TaoLiveDXPreloadX", "liveDXPreload, done! ");
        }
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9c224d7", new Object[0])).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("tblive_dx_preload", "liveDXPreloadEnable", "true"));
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c67c7bb", new Object[0])).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("tblive_dx_preload", "enableTaoLiveGoodsPreload", "true"));
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80971185", new Object[0])).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("tblive_dx_preload", "enableLVPreload", "true"));
    }

    public static void g(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76ec1ca4", new Object[]{application});
            return;
        }
        if (e()) {
            Coordinator.execute(new q2s(application));
        }
        if (f()) {
            Coordinator.execute(new p2s(application));
        }
    }
}
