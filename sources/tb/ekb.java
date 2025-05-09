package tb;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.BroadcastAddListenerEventResult;
import com.taobao.android.abilityidl.ability.BroadcastEventResult;
import tb.jdb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface ekb extends jdb {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(525337006);
        }

        public static void a(ekb ekbVar, ErrorResult errorResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cd4be2a", new Object[]{ekbVar, errorResult});
                return;
            }
            ckf.g(errorResult, "result");
            jdb.a.a(ekbVar, errorResult);
        }
    }

    void n1(BroadcastAddListenerEventResult broadcastAddListenerEventResult);

    void onEvent(BroadcastEventResult broadcastEventResult);
}
