package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class gw1 implements plh<Throwable> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ jw1 f20263a;

    public gw1(jw1 jw1Var) {
        this.f20263a = jw1Var;
    }

    /* renamed from: a */
    public void onResult(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f750ea72", new Object[]{this, th});
        } else if (jw1.e(this.f20263a) != null) {
            jw1.e(this.f20263a).i(this);
        }
    }
}
