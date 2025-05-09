package tb;

import android.app.Application;
import com.alibaba.poplayer.info.mock.PopLayerMockManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.UtUtils;
import com.taobao.tbpoplayer.mock.WVPopLayerMock;
import com.taobao.tbpoplayer.util.LoginStatusListener;
import com.taobao.tbpoplayer.util.TBPositionMgr;
import com.taobao.tbpoplayer.view.jsbridge.PopLayerGlobalWVPlugin;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class btr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f16625a = new AtomicBoolean(false);
    public static final AtomicBoolean b = new AtomicBoolean(false);

    static {
        t2o.a(790626371);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afd00f15", new Object[0])).booleanValue();
        }
        return b.get();
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5411daf5", new Object[0]);
            return;
        }
        try {
            t4f.a().g(1);
        } catch (Throwable th) {
            wdm.h("trackInitStart error.", th);
        }
    }

    public static void d() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aacda52e", new Object[0]);
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            chb g = c21.g();
            if (g != null) {
                str = String.valueOf(g.getString("launchType", "HOT"));
            } else {
                str = "";
            }
            hashMap.put("launchType", str);
            hashMap.put("enableOpt", "true");
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("PopLayerPerf", UtUtils.CHANGED_UPP_EVENT_ID, "Perf", "PopInitStart", String.valueOf(System.currentTimeMillis()), hashMap).build());
            t4f.a().k(str);
            t4f.a().h(1);
        } catch (Throwable th) {
            wdm.h("trackInitStart error.", th);
        }
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        wdm.g(wdm.CATEGORY_LIFE_CYCLE, "", "TBPopInitTask.init.new.init");
        if (!f16625a.getAndSet(true)) {
            d();
            try {
                fsw.i("PopLayerWindvaneModule", PopLayerGlobalWVPlugin.class, true);
                fsw.i("WVPopLayerManager", WVPopLayerMock.class, true);
            } catch (Throwable th) {
                wdm.h("TBPopLayer.setup.registerPlugin.fail", th);
            }
            TBPositionMgr.e().d(application);
            LoginStatusListener.a();
            PopLayerMockManager.instance().syncTimeTravelSec();
            if (PopLayerMockManager.instance().isPersistentMocking()) {
                PopLayerMockManager.instance().setMock(true, PopLayerMockManager.instance().getPersistentMockData(), true, PopLayerMockManager.instance().isConstraintMocking(), PopLayerMockManager.instance().getTimeTravelSec(), PopLayerMockManager.instance().getMockParamData());
            }
            c();
            b.set(true);
            wdm.g(wdm.CATEGORY_LIFE_CYCLE, "", "TBPopInitTask.init.new.done");
        }
    }
}
