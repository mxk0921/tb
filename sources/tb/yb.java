package tb;

import android.content.Context;
import anetwork.channel.Network;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.http.HttpNetwork;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.global.SwitchConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class yb extends i00 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Network i;
    public final Network j;
    public final Network k;

    static {
        t2o.a(589300040);
    }

    public yb(h3o h3oVar, Context context) {
        super(h3oVar, context);
        if (!SwitchConfig.getInstance().isGlobalSpdySwitchOpen()) {
            if (this.j == null) {
                this.j = new HttpNetwork(context);
            }
            this.k = this.j;
            return;
        }
        this.k = new DegradableNetwork(context);
    }

    public static /* synthetic */ Object ipc$super(yb ybVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in mtopsdk/network/impl/ANetworkStreamCallImpl");
    }

    @Override // tb.zu2
    public void a(htj htjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0f3d5fd", new Object[]{this, htjVar});
            return;
        }
        h3o request = request();
        TBSdkLog.e("mtopsdk.ANetworkStreamCallImpl", this.e, "[enqueue]send data");
        this.d = this.k.asyncSend(xb.b(request), request.r, null, new kpq(this, htjVar, request.e, request.i));
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
