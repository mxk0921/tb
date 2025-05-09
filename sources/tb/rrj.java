package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class rrj implements qzc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final qzc f27569a;

    static {
        t2o.a(283115571);
        t2o.a(283115569);
    }

    public rrj(qzc qzcVar) {
        this.f27569a = qzcVar;
    }

    @Override // tb.qzc
    public void a(f5o f5oVar, szc szcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58622037", new Object[]{this, f5oVar, szcVar});
            return;
        }
        qzc qzcVar = this.f27569a;
        if (qzcVar != null) {
            qzcVar.a(f5oVar, szcVar);
        }
    }
}
