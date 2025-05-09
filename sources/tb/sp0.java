package tb;

import anetwork.channel.NetworkCallBack;
import anetwork.channel.NetworkEvent;
import anetwork.channel.Request;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.utils.Global;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class sp0 extends nw<tp0> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements NetworkCallBack.FinishListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ msj f28193a;

        public a(sp0 sp0Var, msj msjVar) {
            this.f28193a = msjVar;
        }

        @Override // anetwork.channel.NetworkCallBack.FinishListener
        public void onFinished(NetworkEvent.FinishEvent finishEvent, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a00910e8", new Object[]{this, finishEvent, obj});
                return;
            }
            lsj lsjVar = new lsj();
            if (finishEvent != null) {
                lsjVar.f23544a = String.valueOf(finishEvent.getHttpCode());
                lsjVar.b = finishEvent.getDesc();
                lsjVar.c = obj;
            }
            msj msjVar = this.f28193a;
            if (msjVar != null) {
                msjVar.a(lsjVar);
            }
        }
    }

    static {
        t2o.a(1018167330);
    }

    public static /* synthetic */ Object ipc$super(sp0 sp0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/alimama/net/core/request/AliHttpRequest");
    }

    /* renamed from: b */
    public void a(tp0 tp0Var, msj msjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10f8e71a", new Object[]{this, tp0Var, msjVar});
        } else {
            new DegradableNetwork(Global.getApplication()).asyncSend(c(tp0Var), null, null, new a(this, msjVar));
        }
    }

    public final Request c(tp0 tp0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Request) ipChange.ipc$dispatch("73f858e1", new Object[]{this, tp0Var});
        }
        RequestImpl requestImpl = new RequestImpl(tp0Var.g());
        requestImpl.setCharset("UTF-8");
        requestImpl.setFollowRedirects(tp0Var.q());
        requestImpl.setRetryTime(tp0Var.p());
        requestImpl.setConnectTimeout(tp0Var.m());
        requestImpl.setReadTimeout(tp0Var.o());
        if (tp0Var.n() != null) {
            for (Map.Entry<String, String> entry : tp0Var.n().entrySet()) {
                requestImpl.addHeader(entry.getKey(), entry.getValue());
            }
        }
        return requestImpl;
    }
}
