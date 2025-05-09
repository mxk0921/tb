package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class elq implements dlq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final dlq f18665a;

    static {
        t2o.a(676331679);
        t2o.a(676331678);
    }

    public elq(dlq dlqVar) {
        this.f18665a = dlqVar;
    }

    @Override // tb.dlq
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cec9502", new Object[]{this, str, str2});
            return;
        }
        dlq dlqVar = this.f18665a;
        if (dlqVar != null) {
            dlqVar.a(str, str2);
        }
    }

    @Override // tb.dlq
    public void b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("518cf63", new Object[]{this, str, new Integer(i)});
            return;
        }
        dlq dlqVar = this.f18665a;
        if (dlqVar != null) {
            dlqVar.b(str, i);
        }
    }
}
