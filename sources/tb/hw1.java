package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hw1 implements plh<kkh> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ jw1 f20921a;

    public hw1(jw1 jw1Var) {
        this.f20921a = jw1Var;
    }

    /* renamed from: a */
    public void onResult(kkh kkhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1419bbae", new Object[]{this, kkhVar});
        } else if (kkhVar != null) {
            if (jw1.f(this.f20921a) != null) {
                jw1.f(this.f20921a).setComposition(kkhVar);
                jw1.f(this.f20921a).playAnimation();
            }
            if (jw1.e(this.f20921a) != null) {
                jw1.e(this.f20921a).j(this);
            }
        }
    }
}
