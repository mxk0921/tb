package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.mtop.intf.Mtop;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class k3q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final MtopBusiness f22386a;

    static {
        t2o.a(442499210);
    }

    public k3q(Context context, tqd tqdVar) {
        if (context != null && tqdVar != null) {
            MtopBusiness build = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, context), tqdVar.getMtopRequest());
            this.f22386a = build;
            build.setUnitStrategy(tqdVar.getUnitStrategy());
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e48bb980", new Object[]{this})).booleanValue();
        }
        MtopBusiness mtopBusiness = this.f22386a;
        if (mtopBusiness == null) {
            return false;
        }
        mtopBusiness.startRequest();
        return true;
    }

    public void b(IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de537318", new Object[]{this, iRemoteBaseListener});
            return;
        }
        MtopBusiness mtopBusiness = this.f22386a;
        if (mtopBusiness != null && iRemoteBaseListener != null) {
            mtopBusiness.registerListener((IRemoteListener) iRemoteBaseListener);
        }
    }
}
