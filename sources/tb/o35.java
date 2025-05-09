package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.job.core.TaskDeffer;
import tb.q35;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class o35<T, R> implements m35<T, R> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final eft<T, R> f25120a;

    public o35(n35<T, R> n35Var) {
        this.f25120a = n35Var.a();
    }

    @Override // tb.m35
    public q35<T, R> a(String str, aft<T, R> aftVar, ket<T, R> ketVar, TaskDeffer<T, R> taskDeffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q35) ipChange.ipc$dispatch("973eda53", new Object[]{this, str, aftVar, ketVar, taskDeffer});
        }
        return new q35.a(str, this.f25120a, aftVar).c(ketVar).b(taskDeffer).a();
    }

    @Override // tb.m35
    public fn8 b(xto xtoVar, q35<T, R> q35Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fn8) ipChange.ipc$dispatch("3378ee8d", new Object[]{this, xtoVar, q35Var});
        }
        jdh.i("o35", "schedule stage '%s' with policy", q35Var.g());
        return q35Var.f(xtoVar);
    }

    @Override // tb.m35
    public q35<T, R> c(String str, aft<T, R> aftVar, ket<T, R> ketVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q35) ipChange.ipc$dispatch("9bc074c4", new Object[]{this, str, aftVar, ketVar});
        }
        return a(str, aftVar, ketVar, null);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.f25120a.toString();
    }
}
