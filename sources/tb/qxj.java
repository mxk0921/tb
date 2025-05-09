package tb;

import android.app.Activity;
import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.base.weex.DetailWeexV2Module;
import com.taobao.android.detail2.core.framework.base.weex.VideoWeexModule;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.live.timemove.weex.TBLivePlatformView;
import com.taobao.livephoto.weex.LivePhotoWeexView;
import com.taobao.tao.TBMainHost;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class qxj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321602);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        txj.b(txj.TAG_RENDER, "NewDetailLaunchIdleTask调用");
        wgj.b();
        wgj.e();
        MUSEngine.registerPlatformView("tblivevideox", TBLivePlatformView.class);
        MUSEngine.registerPlatformView("livephotoview", LivePhotoWeexView.class);
        MUSEngine.registerModule("newdetail_message", DetailWeexV2Module.class);
        MUSEngine.registerModule(VideoWeexModule.MODULE_NAME, VideoWeexModule.class);
        zgj.f = true;
        zgj.c = true;
        r19.T("idle");
        r19.V("idle");
        ftm b = itm.b("new_detail");
        if (b != null) {
            b.s(byj.L(y9a.b()));
        }
        if (!(TBMainHost.b().getContext() instanceof Activity)) {
            txj.b(txj.TAG_RENDER, "NewDetailLaunchIdleTask 没拿到首页activity");
            return;
        }
        zgj.e = true;
        if (r19.G0()) {
            txj.b("NewDetailLaunchIdleTask", "Idle Task , Run , preloadWeexV2FromCache 02");
            syj.h(syj.PRELOAD_TYPE_IDLE_TASK);
            zgj.d = true;
        } else {
            qyj.a("weex_sync_delete_code", "idleTask init preloadDetailCardMainPicWeex Error:" + r19.Y());
        }
        if (r19.S0("fast_key_pre_init_switch")) {
            r19.a1();
        }
    }
}
