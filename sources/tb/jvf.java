package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.hhc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class jvf implements hhc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final qvf f22241a;

    static {
        t2o.a(490733583);
        t2o.a(490733580);
    }

    public jvf(String str) {
        qvf qvfVar = new qvf();
        this.f22241a = qvfVar;
        qvfVar.c(str);
    }

    @Override // tb.hhc
    public void a(hhc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b681bcf", new Object[]{this, aVar});
        } else {
            this.f22241a.d(aVar);
        }
    }

    @Override // tb.hhc
    public void b(hhc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eff9e576", new Object[]{this, aVar});
        } else {
            this.f22241a.e(aVar);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            this.f22241a.b();
        }
    }
}
