package tb;

import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.recycler.WaterfallLayout;
import com.taobao.detail.rate.RateFeedsFragment;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ru5 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final long DX_EVENT_DXEVENTSCROLLSTATECHANGE = -3683706025822114132L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    public static /* synthetic */ Object ipc$super(ru5 ru5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/vivid/dinamicX/event/DXDxEventScrollStateChangeEventHandlerKT");
    }

    public final void a(DXRuntimeContext dXRuntimeContext) {
        tgn M2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79634dc4", new Object[]{this, dXRuntimeContext});
        } else if ((dXRuntimeContext.h() instanceof FragmentActivity) && !psn.INSTANCE.e() && n9l.INSTANCE.b()) {
            i6v i6vVar = i6v.INSTANCE;
            Context h = dXRuntimeContext.h();
            if (h != null) {
                FragmentActivity fragmentActivity = (FragmentActivity) h;
                DinamicXEngine r = dXRuntimeContext.r();
                RateFeedsFragment d = i6vVar.d(fragmentActivity, r != null ? r.v() : null);
                System.currentTimeMillis();
                if (d != null && (M2 = d.M2()) != null) {
                    M2.d(System.currentTimeMillis(), new JSONObject());
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    public final void b(DinamicXEngine dinamicXEngine, String str) {
        y7 v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd327c3", new Object[]{this, dinamicXEngine, str});
            return;
        }
        ckf.g(str, "state");
        if (TextUtils.equals(str, psn.DX_RECYCLER_LAYOUT_SCROLL_STATE_END) && dinamicXEngine != null && (v = dinamicXEngine.v()) != null) {
            v.l("RECYCLER_SCROLL_END", null);
        }
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        String str;
        hm6 F;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        ckf.g(dXEvent, "event");
        ckf.g(objArr, "args");
        ckf.g(dXRuntimeContext, "runtimeContext");
        if (objArr.length != 0 && !TextUtils.isEmpty(objArr[0].toString())) {
            av5 s = dXRuntimeContext.s();
            RecyclerView recyclerView = null;
            DinamicXEngine f = s != null ? s.f() : null;
            DXWidgetNode W = dXRuntimeContext.W();
            if (W instanceof DXRecyclerLayout) {
                WaterfallLayout q0 = ((DXRecyclerLayout) W).q0();
                ckf.f(q0, "recyclerNode.waterfallLayout");
                recyclerView = q0.k();
            }
            if (recyclerView != null) {
                Object obj = objArr[0];
                if (obj instanceof String) {
                    str = obj.toString();
                } else {
                    str = "";
                }
                psn psnVar = psn.INSTANCE;
                if (!psnVar.f()) {
                    a(dXRuntimeContext);
                    psnVar.b(str);
                    b(f, str);
                    return;
                }
                a(dXRuntimeContext);
                psnVar.c(str);
                if (!TextUtils.equals(str, psn.DX_RECYCLER_LAYOUT_SCROLL_STATE_BEGIN)) {
                    TextUtils.equals(str, psn.DX_RECYCLER_LAYOUT_SCROLL_STATE_END);
                } else if (!(f == null || (F = f.F()) == null)) {
                    F.a(recyclerView);
                }
                b(f, str);
            }
        }
    }
}
