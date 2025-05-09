package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import java.util.Map;
import tb.lgs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class b57 extends e0o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(502268062);
    }

    public b57(lgs.b bVar) {
        super(bVar);
    }

    public static /* synthetic */ Object ipc$super(b57 b57Var, String str, Object... objArr) {
        if (str.hashCode() == 92125536) {
            return new Boolean(super.i((TNodeView) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/container/intercept/DefaultRenderIntercept");
    }

    @Override // tb.e0o
    public boolean i(TNodeView tNodeView) {
        lgs.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57db960", new Object[]{this, tNodeView})).booleanValue();
        }
        try {
            if (super.i(tNodeView) && (bVar = this.f18196a) != null) {
                if (bVar.f()) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // tb.e0o
    public void j(Context context, Object obj, Object obj2, lgs.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d459e8f2", new Object[]{this, context, obj, obj2, bVar});
        }
    }

    @Override // tb.e0o
    public void k(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b978b779", new Object[]{this, nVar});
        }
    }

    @Override // tb.e0o
    public void l(Context context, TNodeView tNodeView, Object obj, lgs.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50be3a1", new Object[]{this, context, tNodeView, obj, bVar});
        }
    }

    @Override // tb.e0o
    public void m(Context context, n nVar, String str, String str2, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7598859f", new Object[]{this, context, nVar, str, str2, map});
        }
    }

    @Override // tb.e0o
    public void n(Context context, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7c1db50", new Object[]{this, context, obj});
        }
    }

    @Override // tb.e0o
    public void o(Context context, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32bdcadb", new Object[]{this, context, obj});
        }
    }
}
