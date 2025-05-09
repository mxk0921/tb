package tb;

import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.info.frequency.b;
import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.trigger.Event;
import com.alibaba.poplayer.trigger.a;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class nig {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(625999951);
    }

    public static boolean a(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4faf3bc", new Object[]{popRequest})).booleanValue();
        }
        try {
            BaseConfigItem J = a.J(popRequest);
            if (J == null || PopLayer.getReference().getCurrentTimeStamp() <= J.getEndTimeStamp()) {
                return true;
            }
            popRequest.k().c0 = OnePopModule.OnePopLoseReasonCode.LMLifeCycleCheckFail;
            popRequest.k().d0 = "endTime";
            if (popRequest instanceof a) {
                d0j.h((a) popRequest);
            }
            return false;
        } catch (Throwable th) {
            wdm.h("LMConfigCheck.error.", th);
            return true;
        }
    }

    public static boolean b(PopRequest popRequest) {
        Event M;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5ffe39a", new Object[]{popRequest})).booleanValue();
        }
        try {
            BaseConfigItem J = a.J(popRequest);
            if (J == null || (M = a.M(popRequest)) == null || b.e().a(M.curPage, M.curPageUrl, J.layerType)) {
                return true;
            }
            popRequest.k().c0 = OnePopModule.OnePopLoseReasonCode.LMLifeCycleCheckFail;
            popRequest.k().d0 = a9l.SP_KEY_SCENE_FREQ;
            if (popRequest instanceof a) {
                d0j.h((a) popRequest);
            }
            return false;
        } catch (Throwable th) {
            wdm.h("LMConfigCheck.error.", th);
            return true;
        }
    }
}
