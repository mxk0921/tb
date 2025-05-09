package tb;

import com.ali.adapt.api.AtlasServiceFinder;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class yur implements gid {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092399);
        t2o.a(806354997);
    }

    @Override // tb.gid
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49ddee19", new Object[]{this});
        } else {
            AtlasServiceFinder.getInstance().registerService(bvd.class, "com.taobao.taolive", omr.class.getName());
        }
    }
}
