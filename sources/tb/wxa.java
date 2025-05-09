package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.movehighlight.screen.frame.FullScreenFrame;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class wxa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final hcc f30985a;

    static {
        t2o.a(779092678);
    }

    public wxa(hcc hccVar) {
        this.f30985a = hccVar;
    }

    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a75e0cb", new Object[]{this, obj});
            return;
        }
        hcc hccVar = this.f30985a;
        if (hccVar != null) {
            ((FullScreenFrame.d) hccVar).a(obj);
        }
    }
}
