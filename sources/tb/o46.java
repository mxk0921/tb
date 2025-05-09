package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.mytaobao.pagev2.eventhandler.DXMtbClickRecordHandler;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class o46 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, ob5> f25134a;

    static {
        t2o.a(745537952);
    }

    public o46() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f25134a = linkedHashMap;
        linkedHashMap.put("scrollPercentExpose", new wb6());
        linkedHashMap.put("clickRecordHandler", new DXMtbClickRecordHandler());
    }

    public static /* synthetic */ Object ipc$super(o46 o46Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/pagev2/eventhandler/DXMtbEventDispatcher");
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Object obj;
        ob5 ob5Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        Object obj2 = null;
        if (objArr != null) {
            obj = ic1.L(objArr, 0);
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            obj2 = obj;
        }
        String str = (String) obj2;
        if (str != null && (ob5Var = (ob5) ((LinkedHashMap) this.f25134a).get(str)) != null) {
            ob5Var.handleEvent(dXEvent, objArr, dXRuntimeContext);
        }
    }
}
