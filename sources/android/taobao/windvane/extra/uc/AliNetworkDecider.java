package android.taobao.windvane.extra.uc;

import android.taobao.windvane.extra.uc.interfaces.INetworkDecider;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AliNetworkDecider implements INetworkDecider {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989856045);
        t2o.a(989856160);
    }

    @Override // android.taobao.windvane.extra.uc.interfaces.INetworkDecider
    public int chooseNetwork(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b1abc35b", new Object[]{this, str})).intValue();
        }
        return (str.startsWith("ws://") || str.startsWith("wss://") || !WVUCWebView.getUseTaobaoNetwork()) ? 0 : 2;
    }
}
