package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class lv5 extends rw5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_EVENTCHAINEVENTDATA = 5680234302234270868L;

    static {
        t2o.a(444596857);
    }

    public static /* synthetic */ Object ipc$super(lv5 lv5Var, String str, Object... objArr) {
        if (str.hashCode() == -858210922) {
            return super.evalWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/parser/DXEventChainEventDataDataParser");
    }

    @Override // tb.rw5
    public Object a(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8dd225a", new Object[]{this, dXRuntimeContext});
        }
        if (dXRuntimeContext == null || dXRuntimeContext.u() == null) {
            return null;
        }
        return dXRuntimeContext.u().d();
    }

    public JSONObject d(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b3612536", new Object[]{this, dXEvent});
        }
        return srf.i(dXEvent, true, DXEvent.class);
    }

    @Override // tb.rw5, tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        Object evalWithArgs = super.evalWithArgs(objArr, dXRuntimeContext);
        if (evalWithArgs != null) {
            return evalWithArgs;
        }
        if (!zg5.N3() || dXRuntimeContext == null || dXRuntimeContext.u() == null) {
            return null;
        }
        DXEvent b = dXRuntimeContext.u().b();
        if (!(objArr == null || objArr.length == 0)) {
            Object obj = objArr[0];
            if ((obj instanceof String) && b != null) {
                return b((String) obj, d(b), dXRuntimeContext);
            }
        }
        return new JSONObject();
    }

    @Override // tb.nb5, tb.wvb, tb.xwb
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return "eventChainEventData";
    }
}
