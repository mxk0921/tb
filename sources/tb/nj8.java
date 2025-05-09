package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mmad.ability.biz.coupon.ReceiveCouponEvent;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class nj8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, ku1> f24772a = new HashMap<>();
    public final nwi b;

    static {
        t2o.a(573571081);
    }

    public nj8(nwi nwiVar) {
        this.b = nwiVar;
        c(new dnj());
        c(new je0());
        c(new ReceiveCouponEvent());
        c(new x44());
        c(new t5l());
    }

    public static <T> zk8<T> a(T t, jj8 jj8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zk8) ipChange.ipc$dispatch("782caab8", new Object[]{t, jj8Var});
        }
        return new zk8<>(t, jj8Var);
    }

    public void b(String str, zk8 zk8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faf61714", new Object[]{this, str, zk8Var});
            return;
        }
        ku1 ku1Var = this.f24772a.get(str);
        if (ku1Var == null) {
            jgh.a("EventCenter", "executeEvent: event not found name=" + str);
            return;
        }
        try {
            ku1Var.b(this.b, zk8Var);
        } catch (Exception e) {
            jgh.b("EventCenter", "executeEvent: event=" + ku1Var.d() + " error", e);
        }
    }

    public boolean c(ku1 ku1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93ffa5fc", new Object[]{this, ku1Var})).booleanValue();
        }
        if (ku1Var == null) {
            jgh.a("EventCenter", "registerEvent: event is null");
            return false;
        } else if (this.f24772a.containsKey(ku1Var.d())) {
            jgh.a("EventCenter", "registerEvent: event already exists");
            return false;
        } else {
            this.f24772a.put(ku1Var.d(), ku1Var);
            jgh.a("EventCenter", "registerEvent: success name=" + ku1Var.d());
            return true;
        }
    }
}
