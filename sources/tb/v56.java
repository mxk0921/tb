package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class v56 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public float f29789a = 0.0f;
    public float b = 0.0f;
    public float c = 1.0f;
    public float d = 1.0f;
    public float e = 0.0f;
    public float f = 0.0f;
    public float g = 0.0f;

    static {
        t2o.a(444597327);
    }

    public v56 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v56) ipChange.ipc$dispatch("8a7c9f37", new Object[]{this});
        }
        v56 v56Var = new v56();
        v56Var.f29789a = this.f29789a;
        v56Var.b = this.b;
        v56Var.c = this.c;
        v56Var.d = this.d;
        v56Var.e = this.e;
        v56Var.f = this.f;
        v56Var.g = this.g;
        return v56Var;
    }
}
