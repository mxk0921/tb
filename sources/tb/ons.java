package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ons implements lcd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ lns f25518a;

    public ons(lns lnsVar) {
        this.f25518a = lnsVar;
    }

    @Override // tb.lcd
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c57fdb6", new Object[]{this});
        } else if (lns.N(this.f25518a) != null) {
            lns.N(this.f25518a).a();
        }
    }
}
