package tb;

import android.text.TextUtils;
import android.view.View;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.layermanager.d;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.trigger.InternalTriggerController;
import com.alibaba.poplayer.trigger.page.PageTriggerService;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ysr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f32324a;
        public String b;
        public String c;
        public boolean d;
        public View e;

        static {
            t2o.a(790626352);
        }
    }

    static {
        t2o.a(790626351);
    }

    public a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("e4dfc7d2", new Object[]{this, str});
        }
        try {
            com.alibaba.poplayer.trigger.a curRequestingRequest = PageTriggerService.instance().getCurRequestingRequest(str);
            if (curRequestingRequest == null) {
                return null;
            }
            a aVar = new a();
            aVar.c = curRequestingRequest.O();
            aVar.f32324a = curRequestingRequest.q();
            aVar.b = curRequestingRequest.K().layerType;
            aVar.d = "true".equals(curRequestingRequest.k().B);
            "true".equals(curRequestingRequest.k().C);
            aVar.e = curRequestingRequest.i();
            return aVar;
        } catch (Throwable th) {
            wdm.h("TBPopLayerQuery.getCurRequestingPopInfo.error", th);
            return null;
        }
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5b91618", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            for (com.alibaba.poplayer.trigger.a aVar : PageTriggerService.instance().getCurPageRequestingRequest()) {
                BaseConfigItem K = aVar.K();
                if (!qyi.a().ignoreViewType(K.type) && !K.layerType.equals(str)) {
                    return true;
                }
            }
        } catch (Throwable th) {
            wdm.h("TBPopLayerQuery.hasOtherLayerRequestingPop.error", th);
        }
        return false;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12dfa46f", new Object[]{this})).booleanValue();
        }
        try {
            return d.t().r(PopLayer.getReference().internalGetCurrentActivity(), InternalTriggerController.getCurKeyCode());
        } catch (Throwable th) {
            wdm.h("TBPopLayerQuery.hasRequestingPop.error", th);
            return false;
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9e1dda6", new Object[]{this})).booleanValue();
        }
        return btr.b();
    }
}
