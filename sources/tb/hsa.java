package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.ui.engine.render.b;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class hsa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<ksa> f20861a;

    static {
        t2o.a(666894436);
    }

    public hsa(List<ksa> list) {
        this.f20861a = list;
    }

    public void a(b bVar, mjp mjpVar, Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69c72cc5", new Object[]{this, bVar, mjpVar, context, new Integer(i)});
            return;
        }
        ma4 a2 = mjpVar.a();
        Iterator<ksa> it = this.f20861a.iterator();
        while (it.hasNext() && !it.next().a(context, a2, i, bVar)) {
        }
    }
}
