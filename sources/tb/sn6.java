package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class sn6 implements qub {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final qub f28155a;
    public final lxb b;

    static {
        t2o.a(444597733);
        t2o.a(444597451);
    }

    public sn6(qub qubVar, lxb lxbVar) {
        this.f28155a = qubVar;
        this.b = lxbVar;
    }

    @Override // tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        DXWidgetNode build = this.f28155a.build(obj);
        build.setEnableButter(true);
        build.setStrategy(this.b);
        return build;
    }
}
