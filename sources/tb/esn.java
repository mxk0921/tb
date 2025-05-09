package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXMsgCenterEvent;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class esn extends m8<tk6> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(786432078);
    }

    public static /* synthetic */ Object ipc$super(esn esnVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbabilitykit/dx/recycler/RecyclerBaseAbility");
    }

    @Override // tb.m8
    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8750119", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public b8 i(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b8) ipChange.ipc$dispatch("52a08036", new Object[]{this, str, new Boolean(z)});
        }
        return new b8(new a8(k(), str), z);
    }

    public DXRecyclerLayout j(DXWidgetNode dXWidgetNode) {
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
        return j(dXWidgetNode.getParentWidget());
    }

    public abstract int k();

    public DXEvent l(JSONObject jSONObject, tk6 tk6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXEvent) ipChange.ipc$dispatch("51dc8e28", new Object[]{this, jSONObject, tk6Var});
        }
        String string = jSONObject.getString("method");
        if (tk6Var instanceof s8) {
            jSONObject.put(DXRecyclerLayout.ABILITY_SPAN, (Object) d());
        }
        DXMsgCenterEvent dXMsgCenterEvent = new DXMsgCenterEvent(-1747756056147111305L);
        dXMsgCenterEvent.setParams(jSONObject);
        dXMsgCenterEvent.setType("General");
        dXMsgCenterEvent.setMethod(string);
        return dXMsgCenterEvent;
    }

    public abstract c8 n(n8 n8Var, DXRecyclerLayout dXRecyclerLayout, DXWidgetNode dXWidgetNode, tk6 tk6Var);

    /* renamed from: m */
    public c8 f(n8 n8Var, tk6 tk6Var, u8 u8Var) {
        DXWidgetNode dXWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("f0bde67e", new Object[]{this, n8Var, tk6Var, u8Var});
        }
        DXRuntimeContext p = tk6Var.p();
        if (p == null) {
            return i("runtimeContext为空", true);
        }
        if (tk6Var.o() == null) {
            return i("rootView为空", true);
        }
        av5 s = p.s();
        if (s == null) {
            return i("engineContext为空", true);
        }
        if (s.f() == null) {
            return i("dinamicXEngine为空", true);
        }
        String i = n8Var.i("recyclerNodeId");
        DXRuntimeContext p2 = tk6Var.p();
        if (p2 == null) {
            return i("rootViewContext为空", true);
        }
        DXWidgetNode W = p2.W();
        if (W == null) {
            return i("rootWidget为空", true);
        }
        if (!TextUtils.isEmpty(i)) {
            dXWidgetNode = tk6Var.q();
            if (dXWidgetNode == null || !i.equals(dXWidgetNode.getUserId())) {
                dXWidgetNode = W.queryWidgetNodeByUserId(i);
            }
        } else {
            dXWidgetNode = j(tk6Var.q());
        }
        if (!(dXWidgetNode instanceof DXRecyclerLayout)) {
            return i("RecyclerLayout 没有找到", true);
        }
        return n(n8Var, (DXRecyclerLayout) dXWidgetNode, W, tk6Var);
    }
}
