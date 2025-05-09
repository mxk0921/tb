package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class zg extends rpg implements cdb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int p = 0;
    public int q = 1;
    public Map<String, Object> r;

    static {
        t2o.a(80740608);
        t2o.a(80740620);
    }

    public zg(int i) {
        super(0, i);
    }

    public static /* synthetic */ Object ipc$super(zg zgVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/service/render/layout/vlayouthelper/AURACardLayoutHelper");
    }

    @Override // tb.cdb
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9e3aff5", new Object[]{this});
        }
        return "card";
    }

    @Override // tb.cdb
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a21a3e4", new Object[]{this})).intValue();
        }
        return this.q;
    }

    @Override // tb.cdb
    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a209b53e", new Object[]{this, new Integer(i)});
        } else {
            this.q = i;
        }
    }

    @Override // tb.cdb
    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ad774e7", new Object[]{this, new Integer(i)});
        } else {
            this.p = i;
        }
    }

    @Override // tb.cdb
    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f18c983", new Object[]{this})).intValue();
        }
        return this.p;
    }

    public Map<String, Object> g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9c3179b7", new Object[]{this});
        }
        return this.r;
    }

    public void h0(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("918c2d4f", new Object[]{this, map});
        } else {
            this.r = map;
        }
    }
}
