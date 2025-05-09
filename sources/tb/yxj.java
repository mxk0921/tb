package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class yxj implements ncd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321675);
    }

    public void a(dxj dxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0b0e6ea", new Object[]{this, dxjVar});
        } else if (dxjVar != null) {
            dxjVar.g(this);
        }
    }
}
