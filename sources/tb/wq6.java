package tb;

import com.alibaba.android.ultron.vfw.dataloader.a;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class wq6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public cit f30857a;
    public a b;

    static {
        t2o.a(157286606);
    }

    public a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("c1831f9c", new Object[]{this});
        }
        return this.b;
    }

    public cit b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cit) ipChange.ipc$dispatch("46bfca4c", new Object[]{this});
        }
        return this.f30857a;
    }

    public void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e07ddfe", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }

    public void d(cit citVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0524286", new Object[]{this, citVar});
        } else {
            this.f30857a = citVar;
        }
    }
}
