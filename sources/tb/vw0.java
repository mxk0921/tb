package tb;

import anet.channel.AwcnConfig;
import anetwork.channel.Request;
import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URL;
import java.util.concurrent.Future;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vw0 implements l55 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Request f30290a;
    public DegradableNetwork b;
    public Future<Response> c;

    @Override // tb.l55
    public void a(p55 p55Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73b9cc0", new Object[]{this, p55Var});
        } else {
            this.c = this.b.asyncSend(this.f30290a, null, null, new ww0(p55Var));
        }
    }

    @Override // tb.l55
    public void addRequestHeader(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1518e9f6", new Object[]{this, str, str2});
        } else {
            this.f30290a.addHeader(str, str2);
        }
    }

    @Override // tb.l55
    public void b(URL url, m55 m55Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c680e8e9", new Object[]{this, url, m55Var});
            return;
        }
        RequestImpl requestImpl = new RequestImpl(url);
        this.f30290a = requestImpl;
        requestImpl.setRetryTime(3);
        this.f30290a.setFollowRedirects(true);
        this.f30290a.setReadTimeout(m55Var.d());
        this.f30290a.setConnectTimeout(m55Var.c());
        this.f30290a.setBizId(m55Var.a());
        this.b = new DegradableNetwork(xh4.f31395a);
        try {
            xh4.q = AwcnConfig.getRangeBoostOpen();
            xh4.p = AwcnConfig.getFragmentFileLengthThreshold();
        } catch (Throwable unused) {
        }
    }

    @Override // tb.l55
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        Future<Response> future = this.c;
        if (future != null) {
            future.cancel(true);
        }
    }

    @Override // tb.l55
    public void setExtProperty(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("506a336f", new Object[]{this, str, str2});
        } else {
            this.f30290a.setExtProperty(str, str2);
        }
    }
}
