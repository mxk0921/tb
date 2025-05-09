package mtopsdk.mtop.global;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.intf.Mtop;
import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class MtopSDK {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(589299923);
    }

    @Deprecated
    public static void checkMtopSDKInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd87b2e1", new Object[0]);
        } else {
            Mtop.instance(null).checkMtopSDKInit();
        }
    }

    @Deprecated
    public static void setLogSwitch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62e8af97", new Object[]{new Boolean(z)});
        } else {
            Mtop.instance(null).logSwitch(z);
        }
    }
}
