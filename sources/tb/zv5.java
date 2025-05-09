package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class zv5 extends vb6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String EXPOSURE_ABILITY = "-6578109113989720488";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(786432059);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(786432058);
    }

    public static /* synthetic */ Object ipc$super(zv5 zv5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbabilitykit/dx/DXExposureAbility");
    }

    @Override // tb.vb6
    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54a5a515", new Object[]{this});
        }
        return "exposure";
    }

    @Override // tb.vb6
    public void l(String str, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36d427cb", new Object[]{this, str, dXWidgetNode});
            return;
        }
        ckf.g(dXWidgetNode, "layout");
        if (((l4c) (!(dXWidgetNode instanceof l4c) ? null : dXWidgetNode)) == null) {
            return;
        }
        if (tsq.y(str, "trigger", false, 2, null)) {
            ((l4c) dXWidgetNode).triggerExposure();
        } else if (tsq.y(str, "clearCache", false, 2, null)) {
            ((l4c) dXWidgetNode).clearExposureCache();
        }
    }
}
