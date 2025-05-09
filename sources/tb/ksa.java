package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.ui.engine.render.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class ksa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final whp f22885a;

    static {
        t2o.a(666894437);
    }

    public ksa(whp whpVar) {
        this.f22885a = whpVar;
    }

    public boolean a(Context context, ma4 ma4Var, int i, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30134a7", new Object[]{this, context, ma4Var, new Integer(i), bVar})).booleanValue();
        }
        boolean c = c(context, ma4Var, i, bVar);
        if (c) {
            b(context, ma4Var, i, bVar);
        }
        return c;
    }

    public abstract void b(Context context, ma4 ma4Var, int i, b bVar);

    public abstract boolean c(Context context, ma4 ma4Var, int i, b bVar);
}
