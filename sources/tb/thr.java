package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class thr extends m8<tk6> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long TBLCALLEVENTCHAIN = -8050389688105802924L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(806355368);
            t2o.a(336592930);
        }

        /* renamed from: a */
        public thr build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (thr) ipChange.ipc$dispatch("9baf4916", new Object[]{this, obj});
            }
            return new thr();
        }
    }

    static {
        t2o.a(806355367);
    }

    public static /* synthetic */ Object ipc$super(thr thrVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/home/dinamic/ability/TBLCallEventChainAbility");
    }

    public b8 i(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b8) ipChange.ipc$dispatch("52a08036", new Object[]{this, str, new Boolean(z)});
        }
        return new b8(new a8(18426, str), z);
    }

    /* renamed from: j */
    public c8 f(n8 n8Var, tk6 tk6Var, u8 u8Var) {
        DXRuntimeContext p;
        DXWidgetNode W;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("f0bde67e", new Object[]{this, n8Var, tk6Var, u8Var});
        }
        if (n8Var == null || n8Var.h() == null) {
            return new d8();
        }
        JSONObject h = n8Var.h();
        String string = h.getString("targetChainName");
        String string2 = h.getString("currentUserId");
        String string3 = h.getString("targetUserId");
        JSONObject jSONObject = h.getJSONObject(fnm.KEY_TARGET_PARAMS);
        if (!arq.a(string)) {
            if (!(tk6Var == null || (p = tk6Var.p()) == null)) {
                DinamicXEngine r = p.r();
                DXRootView L = p.L();
                DXWidgetNode W2 = p.W();
                if (!(r == null || L == null || L.getExpandWidgetNode() == null)) {
                    if (!arq.a(string2)) {
                        W2 = L.getExpandWidgetNode().queryWidgetNodeByUserId(string2);
                    }
                    if (!arq.a(string3)) {
                        W = L.getExpandWidgetNode().queryWidgetNodeByUserId(string3);
                    } else {
                        W = p.W();
                    }
                    if (!(W2 == null || W == null)) {
                        r.s(string, W2, W, jSONObject, null, null);
                        return new f8();
                    }
                }
            }
            return new d8();
        } else if (tk6Var != null) {
            return i("参数缺失", true);
        } else {
            return new d8();
        }
    }
}
