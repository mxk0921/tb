package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class sj8 extends mv5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARSER_KEY_DX_RUNTIMECONTEXT = "dxRuntimeContext";

    static {
        t2o.a(350224403);
    }

    public static boolean f(DXEvent dXEvent, DXRuntimeContext dXRuntimeContext, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("664b681f", new Object[]{dXEvent, dXRuntimeContext, objArr})).booleanValue();
        }
        if (objArr == null || objArr.length <= 0 || TextUtils.isEmpty(String.valueOf(objArr[0])) || h(dXRuntimeContext, String.valueOf(objArr[0])) == null) {
            return false;
        }
        new sj8().handleEvent(dXEvent, objArr, dXRuntimeContext);
        return true;
    }

    public static boolean g(b8v b8vVar, String str) {
        DXRuntimeContext dXRuntimeContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c36bd55", new Object[]{b8vVar, str})).booleanValue();
        }
        if (b8vVar == null) {
            return false;
        }
        try {
            DXEvent dXEvent = (DXEvent) b8vVar.i(f8v.KEY_DXEVENT);
            HashMap hashMap = (HashMap) b8vVar.i("bizParams");
            if (hashMap == null) {
                dXRuntimeContext = null;
            } else {
                dXRuntimeContext = (DXRuntimeContext) hashMap.get(PARSER_KEY_DX_RUNTIMECONTEXT);
            }
            return f(dXEvent, dXRuntimeContext, new Object[]{str, i(b8vVar)});
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public static gv5 h(DXRuntimeContext dXRuntimeContext, String str) {
        tv5 dxEventChains;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gv5) ipChange.ipc$dispatch("240a5b80", new Object[]{dXRuntimeContext, str});
        }
        if (dXRuntimeContext == null || dXRuntimeContext.W() == null || dXRuntimeContext.W().queryRootWidgetNode() == null || (dxEventChains = dXRuntimeContext.W().queryRootWidgetNode().getDxEventChains()) == null) {
            return null;
        }
        return dxEventChains.b(str);
    }

    public static JSONObject i(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fbcf9596", new Object[]{b8vVar});
        }
        Object f = b8vVar.f();
        if (f instanceof DMEvent) {
            return ((DMEvent) f).getFields();
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(sj8 sj8Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/adam/common/EventChainHandler");
    }
}
