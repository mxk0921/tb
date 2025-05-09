package tb;

import android.app.Activity;
import android.content.Context;
import android.view.Window;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.common.view.VideoRoundCornerLayout;
import com.taobao.android.fluid.framework.list.render.RecyclerViewHolder;
import tb.wlb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class c2g extends wlb.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String e = "KeepScreenManager";

    /* renamed from: a  reason: collision with root package name */
    private final prp f16792a;
    private Context b;
    private Window c;
    private int d = -1;

    static {
        t2o.a(468714050);
    }

    public c2g(prp prpVar) {
        this.f16792a = prpVar;
        prpVar.N().addCardLifecycleListener((wlb.a) this);
    }

    public static /* synthetic */ Object ipc$super(c2g c2gVar, String str, Object... objArr) {
        if (str.hashCode() == 2063982600) {
            super.onCreateView((uq9) objArr[0], (RecyclerViewHolder) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/cards/video/manager/keepscreen/KeepScreenManager");
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfd09697", new Object[]{this});
            return;
        }
        Window window = this.c;
        if (window != null) {
            window.addFlags(128);
            ir9.b(e, "keepScreenOn");
        }
    }

    private void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45c1d7ce", new Object[]{this});
            return;
        }
        Window window = this.c;
        if (window != null && (window.getAttributes().flags & 128) == 0) {
            ir9.b(e, "setWindowKeepScreenOnTask,屏幕保持常亮状态未设置");
            l();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("993133e8", new Object[]{this});
        }
    }

    public void o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("363a7ff1", new Object[]{this, new Integer(i)});
            return;
        }
        if (i != this.d) {
            v();
        }
        this.d = i;
    }

    @Override // tb.wlb.a, tb.wlb
    public void onCreateView(uq9 uq9Var, RecyclerViewHolder recyclerViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b05e008", new Object[]{this, uq9Var, recyclerViewHolder});
            return;
        }
        super.onCreateView(uq9Var, recyclerViewHolder);
        VideoRoundCornerLayout Q = this.f16792a.x1().Q();
        if (Q != null) {
            Context context = Q.getContext();
            this.b = context;
            if (context instanceof Activity) {
                this.c = ((Activity) context).getWindow();
            }
        }
    }
}
