package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.kernel.serviceinterface.KSPowerMsgSendMessageParams;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface lic extends kic {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1004536602);
        }

        public static /* synthetic */ void a(lic licVar, KSPowerMsgSendMessageParams kSPowerMsgSendMessageParams, g1a g1aVar, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4886d3a1", new Object[]{licVar, kSPowerMsgSendMessageParams, g1aVar, new Integer(i), obj});
            } else if (obj == null) {
                if ((i & 2) != 0) {
                    g1aVar = null;
                }
                licVar.c(kSPowerMsgSendMessageParams, g1aVar);
            } else {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendMessage");
            }
        }
    }

    void c(KSPowerMsgSendMessageParams kSPowerMsgSendMessageParams, g1a<? super w0g, xhv> g1aVar);
}
