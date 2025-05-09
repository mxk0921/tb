package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class pm6 extends vb6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String VIDEO_CONTROL_ABILITY = "4633893273292495833";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(786432065);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(786432064);
    }

    public static /* synthetic */ Object ipc$super(pm6 pm6Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbabilitykit/dx/DXVideoPlayAbility");
    }

    @Override // tb.vb6
    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54a5a515", new Object[]{this});
        }
        return "videoPlay";
    }

    @Override // tb.vb6
    public void l(String str, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36d427cb", new Object[]{this, str, dXWidgetNode});
            return;
        }
        ckf.g(dXWidgetNode, "layout");
        if (((t8e) (!(dXWidgetNode instanceof t8e) ? null : dXWidgetNode)) == null) {
            return;
        }
        if (tsq.y(str, "trigger", false, 2, null)) {
            ((t8e) dXWidgetNode).triggerVideoPlayControl();
        } else if (tsq.y(str, "stop", false, 2, null)) {
            ((t8e) dXWidgetNode).stopVideoPlayControl();
        }
    }
}
