package tb;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.turbo.subpage.component.dx.DxVideoControlHelper;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class xa2 extends m8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long BINDMULTITABVIDEOCONTROL = 6410613550586411439L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(916455725);
            t2o.a(336592930);
        }

        /* renamed from: a */
        public xa2 build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xa2) ipChange.ipc$dispatch("69b0dcb8", new Object[]{this, obj});
            }
            return new xa2();
        }
    }

    static {
        t2o.a(916455724);
    }

    public static /* synthetic */ Object ipc$super(xa2 xa2Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/subpage/component/dx/BindMultiTabVideoControlAbility");
    }

    @Override // tb.m8
    public c8 f(n8 n8Var, k8 k8Var, u8 u8Var) {
        DinamicXEngine engine;
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("40f5a125", new Object[]{this, n8Var, k8Var, u8Var});
        }
        try {
            DXRootView o = ((tk6) k8Var).o();
            engine = o.getFlattenWidgetNode().getEngine();
            viewGroup = (ViewGroup) o.getParent();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (viewGroup != null) {
            int i = R.id.turbo_dx_video_view_control;
            if (viewGroup.getTag(i) == null) {
                viewGroup.setTag(i, "true");
                if (engine != null) {
                    new DxVideoControlHelper(engine, n8Var.i("childRecyclerLayoutUserId")).u(viewGroup);
                }
                return null;
            }
        }
        return null;
    }
}
