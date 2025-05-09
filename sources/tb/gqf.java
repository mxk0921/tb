package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.jscore.TNodeJSCore;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class gqf implements fqf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(502267915);
        t2o.a(503316566);
    }

    @Override // tb.fqf
    public nvf a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nvf) ipChange.ipc$dispatch("22ad4e84", new Object[]{this});
        }
        return new TNodeJSCore();
    }
}
