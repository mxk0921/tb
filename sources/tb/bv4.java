package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class bv4 extends ej8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int g;
    public double h;

    static {
        t2o.a(962593030);
    }

    public static /* synthetic */ Object ipc$super(bv4 bv4Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -418211225) {
            super.fill((Object[]) objArr[0]);
            return null;
        } else if (hashCode == 620746685) {
            return super.b();
        } else {
            if (hashCode == 1724855933) {
                bv4Var.a((Long) objArr[0]);
                return null;
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/appmonitor/event/CountEvent");
        }
    }

    @Override // tb.ej8
    public synchronized JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("24ffd7bd", new Object[]{this});
        }
        JSONObject b = super.b();
        b.put("count", (Object) Integer.valueOf(this.g));
        b.put("value", (Object) Double.valueOf(this.h));
        return b;
    }

    public synchronized void c(double d, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b31a386", new Object[]{this, new Double(d), l});
            return;
        }
        this.h += d;
        this.g++;
        a(l);
    }

    @Override // tb.ej8, tb.rbo
    public synchronized void fill(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7129a67", new Object[]{this, objArr});
            return;
        }
        super.fill(objArr);
        this.h = vu3.b.GEO_NOT_SUPPORT;
        this.g = 0;
    }
}
