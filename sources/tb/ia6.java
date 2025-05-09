package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ia6 extends m8<tk6> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String REFRESHTEMPLATE = "3886183279055418426";

    static {
        t2o.a(786432061);
    }

    public static /* synthetic */ Object ipc$super(ia6 ia6Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbabilitykit/dx/DXRefreshTemplateAbility");
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
        DXWidgetNode dXWidgetNode;
        DXWidgetRefreshOption dXWidgetRefreshOption;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("f0bde67e", new Object[]{this, n8Var, tk6Var, u8Var});
        }
        if (tk6Var == null) {
            return i("abilityRuntimeContext为空", true);
        }
        DXRuntimeContext p = tk6Var.p();
        if (p == null) {
            return i("runtimeContext为空", true);
        }
        DXWidgetNode W = p.W();
        if (W == null) {
            return i("rootWidget为空", true);
        }
        String i = n8Var.i("userId");
        if (!TextUtils.isEmpty(i)) {
            dXWidgetNode = W.queryWidgetNodeByUserId(i);
        } else {
            dXWidgetNode = tk6Var.q();
        }
        if (dXWidgetNode == null) {
            return i("查找当前widget为空", true);
        }
        String i2 = n8Var.i("type");
        JSONObject g = n8Var.g("option");
        if (g == null) {
            dXWidgetRefreshOption = new DXWidgetRefreshOption();
        } else {
            dXWidgetRefreshOption = new DXWidgetRefreshOption.a().c(vwf.d(g, "refreshChildrenStrategy", 0)).d(vwf.b(g, "needRefreshChildren", false)).g(vwf.b(g, "refreshImmediately", false)).a();
        }
        DinamicXEngine f = p.s().f();
        if (f == null) {
            return i("engine为空", true);
        }
        if ("layout".equals(i2)) {
            f.I0(dXWidgetNode, 1, dXWidgetRefreshOption);
        } else if ("parse".equals(i2)) {
            f.I0(dXWidgetNode, 0, dXWidgetRefreshOption);
        }
        return new f8();
    }
}
