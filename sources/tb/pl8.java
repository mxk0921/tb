package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.MetricContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class pl8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f26154a;
    public final ol8 b;

    public pl8(int i, ol8 ol8Var) {
        this.f26154a = i;
        this.b = ol8Var;
    }

    public void a(n3c n3cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9dbb6cf", new Object[]{this, n3cVar});
        } else {
            this.b.g(this.f26154a, n3cVar);
        }
    }

    public ol8 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ol8) ipChange.ipc$dispatch("c45ca086", new Object[]{this});
        }
        return this.b;
    }

    public void c(MetricContext metricContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce7c6c76", new Object[]{this, metricContext});
        } else {
            this.b.s(metricContext);
        }
    }

    public void d(n3c n3cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9bad38c", new Object[]{this, n3cVar});
        } else {
            this.b.r(this.f26154a, n3cVar);
        }
    }
}
