package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class yif {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final CopyOnWriteArrayList<hgc> f32113a = new CopyOnWriteArrayList<>();

    static {
        t2o.a(468714269);
    }

    public void a(hgc hgcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5177e34e", new Object[]{this, hgcVar});
        } else if (!this.f32113a.contains(hgcVar)) {
            this.f32113a.add(hgcVar);
        }
    }

    public hgc b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hgc) ipChange.ipc$dispatch("fda55376", new Object[]{this, new Integer(i)});
        }
        return this.f32113a.get(i);
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae43b971", new Object[]{this})).intValue();
        }
        return this.f32113a.size();
    }
}
