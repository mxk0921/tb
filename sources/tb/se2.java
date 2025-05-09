package tb;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class se2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f27988a;
    @JSONField(serialize = false)
    public long startTime;

    static {
        t2o.a(468714608);
    }

    public se2(String str) {
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a02127e2", new Object[]{this});
        } else if (lwl.a()) {
            this.f27988a = (System.nanoTime() - this.startTime) / 100000;
            az9.q(this);
        }
    }

    public se2 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (se2) ipChange.ipc$dispatch("949d4c2f", new Object[]{this});
        }
        if (lwl.a()) {
            this.startTime = System.nanoTime();
        }
        return this;
    }
}
