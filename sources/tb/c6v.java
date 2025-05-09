package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import com.taobao.infoflow.taobao.subservice.biz.clienttoservermonitorservice.impl.GatewayPhaseEnum;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class c6v implements IContainerService.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final vzi f16895a;
    public final cfc b;
    public long c;

    static {
        t2o.a(491782304);
        t2o.a(488636647);
    }

    public c6v(vzi vziVar, cfc cfcVar) {
        this.f16895a = vziVar;
        this.b = cfcVar;
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
    public void a(IUiRefreshActionModel iUiRefreshActionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acfd1f16", new Object[]{this, iUiRefreshActionModel});
            return;
        }
        f();
        d(iUiRefreshActionModel);
        c();
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
    public void b(IUiRefreshActionModel iUiRefreshActionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("154ae7b7", new Object[]{this, iUiRefreshActionModel});
        } else {
            this.c = SystemClock.uptimeMillis();
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9b34c27", new Object[]{this});
            return;
        }
        this.f16895a.a("network");
        fve.e("UiRefreshListener", "clearCommitMonitorData");
    }

    public final void d(IUiRefreshActionModel iUiRefreshActionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa8117a4", new Object[]{this, iUiRefreshActionModel});
            return;
        }
        Map<String, Object> b = this.f16895a.b("network");
        if (!e(b)) {
            fve.e("UiRefreshListener", "参数非法");
            return;
        }
        HashMap hashMap = new HashMap(8);
        hashMap.put(PopConst.POP_CLIENT_PARAMS_KEY, b);
        String requestType = iUiRefreshActionModel.getRequestType();
        gve.b(requestType, this.b.getContainerType().a(), hashMap);
        fve.e("UiRefreshListener", "commitMonitorData actionType:" + requestType + "当前的信息是：" + b);
    }

    public final boolean e(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2d977ed", new Object[]{this, map})).booleanValue();
        }
        if (map == null || map.size() < GatewayPhaseEnum.values().length) {
            return false;
        }
        return true;
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8000726", new Object[]{this});
        } else if (this.c <= 0) {
            fve.e("UiRefreshListener", "mUiRefreshStartTime <= 0");
        } else {
            this.f16895a.d(GatewayPhaseEnum.uiRenderTime.name(), SystemClock.uptimeMillis() - this.c);
        }
    }
}
