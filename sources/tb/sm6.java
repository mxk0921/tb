package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.video.DXVideoViewWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class sm6 extends m8<tk6> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String DXVIDEOVIEWABILITY = "-5052942527431262194";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(786432067);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(786432066);
    }

    public static /* synthetic */ Object ipc$super(sm6 sm6Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbabilitykit/dx/DXVideoViewAbility");
    }

    /* renamed from: i */
    public c8<?> f(n8 n8Var, tk6 tk6Var, u8 u8Var) {
        DXWidgetNode dXWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("f0bde67e", new Object[]{this, n8Var, tk6Var, u8Var});
        }
        if (n8Var != null) {
            if (tk6Var == null) {
                return new b8(new a8(-1999, "DXVideoViewAbility akCtx == null"), false);
            }
            String i = n8Var.i("userId");
            String i2 = n8Var.i("action");
            DXWidgetNode q = tk6Var.q();
            DXVideoViewWidgetNode dXVideoViewWidgetNode = null;
            if (ckf.b(i, q != null ? q.getUserId() : null)) {
                dXWidgetNode = tk6Var.q();
            } else {
                DXWidgetNode q2 = tk6Var.q();
                dXWidgetNode = q2 != null ? q2.queryWidgetNodeByUserId(i) : null;
            }
            if (dXWidgetNode instanceof DXVideoViewWidgetNode) {
                dXVideoViewWidgetNode = dXWidgetNode;
            }
            DXVideoViewWidgetNode dXVideoViewWidgetNode2 = dXVideoViewWidgetNode;
            if (dXVideoViewWidgetNode2 != null) {
                DXEvent dXEvent = new DXEvent(DXVideoViewWidgetNode.DXVIDEOVIEW_ONACTION);
                dXEvent.setArgs(v3i.f(jpu.a("action", mw5.O(i2))));
                dXVideoViewWidgetNode2.postEvent(dXEvent);
            }
        }
        return new f8();
    }
}
