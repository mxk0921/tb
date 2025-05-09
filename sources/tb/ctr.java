package tb;

import android.app.Application;
import com.alibaba.poplayer.trigger.InternalTriggerController;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.AccsPopLayerService;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ctr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f17319a = new AtomicBoolean(false);

    static {
        t2o.a(790626372);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        try {
            wdm.d("TBPopInitTask.pre.init.", new Object[0]);
            if (!f17319a.getAndSet(true)) {
                xsr xsrVar = new xsr();
                wdm.k(new aor());
                jd0 c = jd0.c();
                c.d(qyi.a());
                c.e(new bto());
                t4f.a().l(mj9.a());
                auv.a().c(new w9u());
                o71.a().b(new b71());
                if (hashMap == null || !(hashMap.get("isDebuggable") instanceof Boolean)) {
                    xsrVar.setupNew(application, false);
                } else {
                    xsrVar.setupNew(application, ((Boolean) hashMap.get("isDebuggable")).booleanValue());
                }
                xsrVar.registerPopLayerViewAdapter(zsr.a());
                if (t4f.a().d()) {
                    AccsPopLayerService.d(xsrVar.getApp());
                    wdm.d("TBPopInitTask.pre.init.AccsPopLayerService", new Object[0]);
                }
                if (t4f.a().b()) {
                    wdm.g(wdm.CATEGORY_LIFE_CYCLE, "", "UCPFirstPageSwitchTrack.from=TBPopPreInitTask.init.");
                    nsu.g(InternalTriggerController.getCurUri());
                    wdm.d("TBPopInitTask.pre.init.UCPTracker", new Object[0]);
                }
                wdm.g(wdm.CATEGORY_LIFE_CYCLE, "", "TBPopInitTask.pre.init.done");
            }
        } catch (Throwable th) {
            wdm.h("TBPopLayer.setup.error.", th);
        }
    }
}
