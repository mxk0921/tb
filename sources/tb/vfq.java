package tb;

import com.ali.user.mobile.rpc.filter.FilterManager;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.util.ErrorConstant;
import tb.egq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class vfq implements xrd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final zrd f29987a;

    public vfq(zrd zrdVar) {
        this.f29987a = zrdVar;
    }

    @Override // tb.xrd
    public String b(efq efqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a9becdb8", new Object[]{this, efqVar});
        }
        h3o b = ((q30) this.f29987a).b(efqVar);
        if (b == null) {
            efqVar.f = new egq.b().b(417).e("SSER_NETWORK_REQUEST_CONVERT_ERROR").d(ErrorConstant.ERRMSG_NETWORK_REQUEST_CONVERT_ERROR).a();
            lfq.d(efqVar);
            return FilterManager.STOP;
        }
        efqVar.e = b;
        i7j i7jVar = efqVar.d;
        i7jVar.U = b.f20395a;
        b.t = i7jVar.T;
        return "CONTINUE";
    }

    @Override // tb.fwc
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "ssr.SsrNetworkConvertBeforeFilter";
    }
}
