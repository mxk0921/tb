package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class wwq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ja0 f30975a;

    static {
        t2o.a(815793288);
    }

    public wwq(ja0 ja0Var) {
        this.f30975a = ja0Var;
    }

    public static wwq a(ja0 ja0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wwq) ipChange.ipc$dispatch("d6780057", new Object[]{ja0Var});
        }
        return new wwq(ja0Var);
    }
}
