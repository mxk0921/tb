package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class k5a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public i5a f22415a;
    public final Map<String, s4a> b = new ConcurrentHashMap();
    public final Map<String, es6> c = new ConcurrentHashMap();

    static {
        t2o.a(475004954);
    }

    public k5a(i5a i5aVar) {
        this.f22415a = i5aVar;
    }

    public s4a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s4a) ipChange.ipc$dispatch("a93c9601", new Object[]{this, str});
        }
        return (s4a) ((ConcurrentHashMap) this.b).get(str);
    }

    public es6 b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (es6) ipChange.ipc$dispatch("737112ea", new Object[]{this, str});
        }
        return (es6) ((ConcurrentHashMap) this.c).get(str);
    }

    public void c(String str, s4a s4aVar) throws GatewayException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7c8fc18", new Object[]{this, str, s4aVar});
        } else if (((ConcurrentHashMap) this.b).containsKey(str)) {
            throw new GatewayException("register action duplicate");
        } else if (s4aVar != null) {
            ((ConcurrentHashMap) this.b).put(str, s4aVar);
        }
    }

    public void d(String str, es6 es6Var) throws GatewayException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a7885ad", new Object[]{this, str, es6Var});
        } else if (((ConcurrentHashMap) this.c).containsKey(str)) {
            throw new GatewayException("register dataProvider duplicate");
        } else if (es6Var != null) {
            ((ConcurrentHashMap) this.c).put(str, es6Var);
        }
    }

    public void e(i5a i5aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e61f9e3", new Object[]{this, i5aVar});
            return;
        }
        this.f22415a = i5aVar;
        try {
            c(s4a.BIZ_CONTEXT_RECORD, new pd2(this.f22415a));
            c(s4a.SWITCH_BOOLEAN, new c0r());
            c(s4a.SWITCH_STRING, new a1r());
            d(es6.DP_BIZ_CONTEXT, new od2(this.f22415a));
        } catch (GatewayException e) {
            e.printStackTrace();
        }
    }
}
