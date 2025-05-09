package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.ISubService;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class j2b implements wcc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public quq f21718a;

    static {
        t2o.a(729810146);
        t2o.a(729810153);
    }

    @Override // tb.cfc
    public <T extends ISubService> T a(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((ISubService) ipChange.ipc$dispatch("3e2437be", new Object[]{this, cls}));
        }
        quq quqVar = this.f21718a;
        if (quqVar == null) {
            return null;
        }
        return (T) quqVar.d(cls);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        quq quqVar = this.f21718a;
        if (quqVar != null) {
            quqVar.h();
            this.f21718a = null;
            bqa.d("HomePageContext", "服务销毁");
        }
    }

    public void c(ycc yccVar, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80670fd6", new Object[]{this, yccVar, list});
            return;
        }
        this.f21718a = new quq();
        phg.e("init.getSubServiceList");
        List<ISubService> a2 = yccVar.a();
        phg.d("init.getSubServiceList");
        if (!a2.isEmpty()) {
            phg.e("init.registerSubServiceRegistry");
            this.f21718a.j(a2);
            phg.d("init.registerSubServiceRegistry");
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        phg.e("init.onCreateAllService");
        this.f21718a.f(this, list);
        phg.d("init.onCreateAllService");
        bqa.d("HomePageContext", "服务初始化");
    }

    public void d(ycc yccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a6d2d3a", new Object[]{this, yccVar});
        } else if (this.f21718a != null) {
            List<ISubService> a2 = yccVar.a();
            if (!a2.isEmpty()) {
                this.f21718a.j(a2);
            }
            this.f21718a.g(this, a2);
        }
    }

    @Override // tb.cfc
    public /* synthetic */ arb getContainerType() {
        return vcc.a(this);
    }
}
