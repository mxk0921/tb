package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.biz.outlinkservice.OutLinkServiceImpl;
import com.taobao.infoflow.core.subservice.biz.rocketservice.RocketServiceImpl;
import com.taobao.infoflow.protocol.subservice.ISubService;
import com.taobao.infoflow.taobao.subservice.biz.loginservice.TbLoginServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.pop.TbPopViewServiceImpl;
import com.taobao.infoflow.taobao.subservice.framework.hostservice.HomePageHostService;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class uv1 implements qve {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final lza f29628a;

    public uv1(lza lzaVar) {
        this.f29628a = lzaVar;
    }

    public List<ISubService> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d83bf2e6", new Object[]{this});
        }
        List<ISubService> a2 = mgt.a();
        a2.add(new HomePageHostService(this.f29628a));
        a2.add(new RocketServiceImpl());
        a2.add(new TbLoginServiceImpl());
        a2.add(new OutLinkServiceImpl());
        a2.add(new TbPopViewServiceImpl());
        return a2;
    }
}
