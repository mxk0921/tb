package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.zu2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class vb implements zu2.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f29902a;

    static {
        t2o.a(589300037);
        t2o.a(589300019);
    }

    public vb(Context context) {
        this.f29902a = context;
    }

    @Override // tb.zu2.a
    public zu2 a(h3o h3oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zu2) ipChange.ipc$dispatch("86b8e3d7", new Object[]{this, h3oVar});
        }
        if (h3oVar.y) {
            return new yb(h3oVar, this.f29902a);
        }
        return new wb(h3oVar, this.f29902a);
    }
}
