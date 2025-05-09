package tb;

import android.os.Build;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.BroadcastAddListenerEventResult;
import com.taobao.android.abilityidl.ability.BroadcastEventResult;
import com.taobao.tbhudong.TBHuDongServiceImp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class avp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final dii f16028a = dii.c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements qsc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.jdb
        public void O(ErrorResult errorResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14182866", new Object[]{this, errorResult});
            }
        }

        @Override // tb.ekb
        public void n1(BroadcastAddListenerEventResult broadcastAddListenerEventResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70116a6f", new Object[]{this, broadcastAddListenerEventResult});
            } else {
                aqa.b("ShortcutsMegaHelper onAdd", broadcastAddListenerEventResult);
            }
        }

        @Override // tb.qsc, tb.ekb
        public void onEvent(BroadcastEventResult broadcastEventResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("560ff2e1", new Object[]{this, broadcastEventResult});
                return;
            }
            aqa.b("ShortcutsMegaHelper onEvent", broadcastEventResult);
            if (Build.VERSION.SDK_INT >= 25) {
                yup.u(TBHuDongServiceImp.getApplication()).C();
            }
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f994e680", new Object[0]);
            return;
        }
        el2 a2 = el2.a("ShortCutsRefresh");
        a2.f18656a = "ShortCuts";
        a2.b = "ShortCutsRefresh";
        f16028a.b(a2, new a());
    }
}
