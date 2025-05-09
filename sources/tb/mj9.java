package tb;

import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.trigger.InternalTriggerController;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.AccsPopLayerService;
import tb.t4f;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class mj9 implements t4f.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final mj9 f24081a = new mj9();

        static {
            t2o.a(790626333);
        }

        public static /* synthetic */ mj9 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (mj9) ipChange.ipc$dispatch("bc102087", new Object[0]);
            }
            return f24081a;
        }
    }

    static {
        t2o.a(790626332);
        t2o.a(626000041);
    }

    public static mj9 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mj9) ipChange.ipc$dispatch("de59bcec", new Object[0]);
        }
        return a.a();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e857b11", new Object[]{this});
        } else if (btr.b()) {
            AccsPopLayerService.d(PopLayer.getReference().getApp());
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9f12b11", new Object[]{this});
        } else if (btr.b()) {
            wdm.g(wdm.CATEGORY_LIFE_CYCLE, "", "UCPFirstPageSwitchTrack.from=onFirstPageAndConfigReady.");
            nsu.g(InternalTriggerController.getCurUri());
            t4f.a().m();
        }
    }
}
