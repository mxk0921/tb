package tb;

import android.os.Handler;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.params.MtopRequestParams;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.Map;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class f6j<E extends MtopRequestParams> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final E f19050a;
    public final RemoteBusiness b = RemoteBusiness.build(i(), nj7.c());

    static {
        t2o.a(912262175);
    }

    public f6j(E e) {
        this.f19050a = e;
        a();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52402a8f", new Object[]{this});
            return;
        }
        this.b.reqMethod(h());
        String m = m();
        if (TextUtils.equals("UNIT_TRADE", m) || TextUtils.equals("UNIT_GUIDE", m)) {
            this.b.setUnitStrategy(m);
        }
        if (o()) {
            this.b.useWua();
        }
        Map<String, String> g = g();
        if (g != null && !g.isEmpty()) {
            this.b.headers(g);
        }
        String f = f();
        if (!TextUtils.isEmpty(f)) {
            this.b.setBizTopic(f);
        }
        this.b.upstreamCompress(b());
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("730ed18b", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
            return;
        }
        RemoteBusiness remoteBusiness = this.b;
        if (remoteBusiness != null) {
            remoteBusiness.startRequest();
        }
    }

    public abstract String d();

    public abstract String e();

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ebec4e7", new Object[]{this});
        }
        return "";
    }

    public Map<String, String> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("79ac0f15", new Object[]{this});
        }
        return null;
    }

    public MethodEnum h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MethodEnum) ipChange.ipc$dispatch("2fddf0c4", new Object[]{this});
        }
        return MethodEnum.GET;
    }

    public final MtopRequest i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("8175faa3", new Object[]{this});
        }
        String j = j();
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setData(j);
        mtopRequest.setApiName(d());
        mtopRequest.setVersion(e());
        mtopRequest.setNeedEcode(k());
        mtopRequest.setNeedSession(l());
        return mtopRequest;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("daa8ec1e", new Object[]{this});
        }
        return this.f19050a.toData();
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3050dbb1", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a40a375", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7072a98c", new Object[]{this});
        }
        return "UNIT_TRADE";
    }

    public f6j n(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f6j) ipChange.ipc$dispatch("b47587d1", new Object[]{this, handler});
        }
        RemoteBusiness remoteBusiness = this.b;
        if (remoteBusiness != null) {
            remoteBusiness.handler(handler);
        }
        return this;
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84e1d191", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public f6j p(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f6j) ipChange.ipc$dispatch("10704a01", new Object[]{this, map});
        }
        if (map != null && !map.isEmpty()) {
            this.b.headers(map);
        }
        return this;
    }

    public f6j q(MtopListener mtopListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f6j) ipChange.ipc$dispatch("bc10761f", new Object[]{this, mtopListener});
        }
        this.b.registeListener(mtopListener);
        return this;
    }

    public f6j r(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f6j) ipChange.ipc$dispatch("df076fd8", new Object[]{this, new Boolean(z)});
        }
        this.b.streamMode(z);
        return this;
    }
}
