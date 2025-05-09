package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.widget.broadcast.BroadcastMsg;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class tl2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f28781a;
    public final a b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void a(ArrayList<BroadcastMsg> arrayList);
    }

    static {
        t2o.a(852492316);
    }

    public tl2(String str, a aVar) {
        ckf.g(str, "instanceId");
        this.f28781a = str;
        this.b = aVar;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c00da33", new Object[]{this});
        }
        return this.f28781a;
    }

    public final void b(ArrayList<BroadcastMsg> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("808af904", new Object[]{this, arrayList});
            return;
        }
        a aVar = this.b;
        if (aVar != null) {
            aVar.a(arrayList);
        }
    }
}
