package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IPopViewService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class jdm implements sad {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final IPopViewService f21933a;

    static {
        t2o.a(486539589);
        t2o.a(488636448);
    }

    public jdm(cfc cfcVar) {
        if (cfcVar != null) {
            this.f21933a = (IPopViewService) cfcVar.a(IPopViewService.class);
        }
    }

    @Override // tb.sad
    public void addPopMessageListenerByMain(IPopViewService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f869e2b9", new Object[]{this, aVar});
            return;
        }
        IPopViewService iPopViewService = this.f21933a;
        if (iPopViewService != null) {
            iPopViewService.addPopMessageListener(aVar);
        }
    }

    @Override // tb.sad
    public void onPopTabSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5c7b785", new Object[]{this});
            return;
        }
        IPopViewService iPopViewService = this.f21933a;
        if (iPopViewService != null) {
            iPopViewService.onPopTabSelected();
        }
    }

    @Override // tb.sad
    public void onPopTabUnSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf130ffe", new Object[]{this});
            return;
        }
        IPopViewService iPopViewService = this.f21933a;
        if (iPopViewService != null) {
            iPopViewService.onPopTabUnSelected();
        }
    }

    @Override // tb.sad
    public void removePopMessageListenerByMain(IPopViewService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e8fa476", new Object[]{this, aVar});
            return;
        }
        IPopViewService iPopViewService = this.f21933a;
        if (iPopViewService != null) {
            iPopViewService.removePopMessageListener(aVar);
        }
    }

    @Override // tb.sad
    public void triggerPopRemoveByMain(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dacbf3e", new Object[]{this, str});
            return;
        }
        IPopViewService iPopViewService = this.f21933a;
        if (iPopViewService != null) {
            iPopViewService.triggerPopRemove(str);
        }
    }

    @Override // tb.sad
    public void triggerPopShowByMain(int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b38f4fa", new Object[]{this, new Integer(i), jSONObject});
            return;
        }
        IPopViewService iPopViewService = this.f21933a;
        if (iPopViewService != null) {
            iPopViewService.triggerPopShowByPopData(i, jSONObject);
        }
    }
}
