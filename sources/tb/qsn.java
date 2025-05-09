package tb;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class qsn extends m8<tk6> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String RECYCLER_SCROLL_TO_POSITION = "2378982137915074040";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXRecyclerLayout f26910a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ int c;

        public a(DXRecyclerLayout dXRecyclerLayout, boolean z, int i) {
            this.f26910a = dXRecyclerLayout;
            this.b = z;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            DXRecyclerLayout dXRecyclerLayout = this.f26910a;
            if (dXRecyclerLayout != null) {
                dXRecyclerLayout.c1(this.b, this.c);
            }
        }
    }

    static {
        t2o.a(786432084);
    }

    public static /* synthetic */ Object ipc$super(qsn qsnVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbabilitykit/dx/recycler/RecyclerScrollToPositionAbility");
    }

    public DXRecyclerLayout i(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRecyclerLayout) ipChange.ipc$dispatch("6bba05e7", new Object[]{this, dXWidgetNode});
        }
        if (dXWidgetNode == null) {
            return null;
        }
        if (dXWidgetNode instanceof DXRecyclerLayout) {
            return (DXRecyclerLayout) dXWidgetNode;
        }
        return i(dXWidgetNode.getParentWidget());
    }

    /* renamed from: j */
    public c8 f(n8 n8Var, tk6 tk6Var, u8 u8Var) {
        DXWidgetNode dXWidgetNode;
        boolean z = true;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("f0bde67e", new Object[]{this, n8Var, tk6Var, u8Var});
        }
        DXRuntimeContext p = tk6Var.p();
        if (p == null) {
            return new b8(new a8(f.DXERROR_ENGINE_CREATE_VIEW_IN_GLOBAL_CENTER, "rootViewContext为空"), true);
        }
        DXWidgetNode W = p.W();
        if (W == null) {
            return new b8(new a8(f.DXERROR_ENGINE_CREATE_VIEW_IN_GLOBAL_CENTER, "rootWidget为空"), true);
        }
        String i2 = n8Var.i("userId");
        if (TextUtils.isEmpty(i2)) {
            i2 = n8Var.i("recyclerNodeId");
        }
        if (!TextUtils.isEmpty(i2)) {
            dXWidgetNode = W.queryWidgetNodeByUserId(i2);
        } else {
            dXWidgetNode = i(tk6Var.q());
        }
        if (!(dXWidgetNode instanceof DXRecyclerLayout)) {
            return new b8(new a8(f.DXERROR_ENGINE_CREATE_VIEW_IN_GLOBAL_CENTER, "查找recycler出错"), true);
        }
        String i3 = n8Var.i("offset");
        if (!TextUtils.isEmpty(i3)) {
            try {
                i = Integer.parseInt(i3);
            } catch (NumberFormatException unused) {
            }
        }
        String i4 = n8Var.i("animation");
        if (!TextUtils.isEmpty(i4)) {
            z = "true".equals(i4);
        }
        new Handler(Looper.getMainLooper()).post(new a((DXRecyclerLayout) dXWidgetNode, z, i));
        return new f8();
    }
}
