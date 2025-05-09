package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.core.model.DWResponse;
import com.taobao.avplayer.interactivelifecycle.frontcover.model.DWFrontCoverBean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class s75 implements vsb, ltb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ptb f27840a;

    static {
        t2o.a(452985105);
        t2o.a(452985106);
        t2o.a(452985042);
    }

    public void a(DWContext dWContext, ptb ptbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b7accae", new Object[]{this, dWContext, ptbVar});
            return;
        }
        this.f27840a = ptbVar;
        if (dWContext == null || TextUtils.isEmpty(dWContext.mFrom) || dWContext.mInteractiveId <= 0 || dWContext.mNetworkAdapter == null) {
            ((r75) this.f27840a).h(-1, null);
        } else {
            dWContext.queryConfigData(this, false);
        }
    }

    @Override // tb.ltb
    public void onError(DWResponse dWResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f1dda8d", new Object[]{this, dWResponse});
        } else {
            ((r75) this.f27840a).h(-1, dWResponse);
        }
    }

    @Override // tb.ltb
    public void onSuccess(DWResponse dWResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6105f72", new Object[]{this, dWResponse});
        } else if (dWResponse == null || dWResponse.data == null) {
            ((r75) this.f27840a).h(-1, null);
        } else {
            ((r75) this.f27840a).i(new DWFrontCoverBean(dWResponse));
        }
    }
}
