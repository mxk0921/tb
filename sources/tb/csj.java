package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.net.core.request.MtopRequest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class csj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1018167337);
    }

    public static nw a(ow owVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nw) ipChange.ipc$dispatch("77655d25", new Object[]{owVar});
        }
        if (owVar instanceof o6j) {
            return new MtopRequest();
        }
        if (owVar instanceof tp0) {
            return new sp0();
        }
        return null;
    }
}
