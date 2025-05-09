package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class oht extends m8<tk6> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long TBLUPDATEVIEWPROPERTY = -8594539178745856614L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(310378571);
            t2o.a(336592930);
        }

        /* renamed from: a */
        public oht build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (oht) ipChange.ipc$dispatch("70c77360", new Object[]{this, obj});
            }
            return new oht();
        }
    }

    static {
        t2o.a(310378570);
    }

    public static /* synthetic */ Object ipc$super(oht ohtVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/dinamicx/TblUpdateViewPropertyAbility");
    }

    /* renamed from: i */
    public c8 f(n8 n8Var, tk6 tk6Var, u8 u8Var) {
        DXWidgetNode queryWidgetNodeByUserId;
        View D;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("f0bde67e", new Object[]{this, n8Var, tk6Var, u8Var});
        }
        JSONObject h = n8Var == null ? null : n8Var.h();
        if (h == null) {
            return new d8();
        }
        String string = h.getString("targetNodeId");
        String string2 = h.getString("property");
        String string3 = h.getString("value");
        if (lrq.a(string) || lrq.a(string2) || lrq.a(string3)) {
            return new d8();
        }
        if (tk6Var != null) {
            DXRootView L = tk6Var.p().L();
            if (!(lrq.a(string) || (queryWidgetNodeByUserId = L.getExpandWidgetNode().queryWidgetNodeByUserId(string)) == null || (D = queryWidgetNodeByUserId.getDXRuntimeContext().D()) == null)) {
                try {
                    int hashCode = string2.hashCode();
                    if (hashCode == -859610604) {
                        string2.equals("imageUrl");
                    } else if (hashCode == 92909918 && string2.equals("alpha")) {
                        D.setAlpha(Float.parseFloat(string3));
                    }
                } catch (Exception unused) {
                }
            }
        }
        return null;
    }
}
