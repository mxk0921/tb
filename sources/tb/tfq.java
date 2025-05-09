package tb;

import android.content.Context;
import anetwork.channel.Network;
import anetwork.channel.degrade.DegradableNetwork;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.TBSdkLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class tfq extends i00 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Network i;
    public final Network j;

    public tfq(h3o h3oVar, Context context) {
        super(h3oVar, context);
        this.j = new DegradableNetwork(context);
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i("ssr.SsrNetworkCallImpl", this.e, "mNetwork=DegradableNetwork in ANetworkCallImpl");
        }
    }

    public static /* synthetic */ Object ipc$super(tfq tfqVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in mtopsdk/ssrcore/network/impl/SsrNetworkCallImpl");
    }

    @Override // tb.zu2
    public void a(htj htjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0f3d5fd", new Object[]{this, htjVar});
            return;
        }
        h3o request = request();
        this.d = this.j.asyncSend(xb.b(request), request.r, null, new xfq(this, htjVar, request.e));
    }

    @Override // tb.bs8
    public boolean b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e7299db", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i == -200) {
            return true;
        }
        return false;
    }
}
