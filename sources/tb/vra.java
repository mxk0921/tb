package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class vra extends yra {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long DX_EVENT_ID = k06.a("handleDinamicXEvent");

    static {
        t2o.a(912261757);
    }

    public vra(Context context, ze7 ze7Var) {
        super(context, ze7Var);
    }

    public static /* synthetic */ Object ipc$super(vra vraVar, String str, Object... objArr) {
        if (str.hashCode() == -103056537) {
            super.handleEvent((DXEvent) objArr[0], (Object[]) objArr[1], (DXRuntimeContext) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/dinamicx/event/HandleDinamicXEvent");
    }

    public final List<ir> a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2a752e3b", new Object[]{this, jSONArray});
        }
        ArrayList arrayList = new ArrayList(jSONArray.size());
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONObject) {
                arrayList.add(new ir((JSONObject) next));
            }
        }
        return arrayList;
    }

    @Override // tb.yra, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr != null && objArr.length > 0) {
            Object obj = objArr[0];
            if (obj instanceof JSONArray) {
                this.f32298a.b().g(a((JSONArray) obj), e28.b(objArr, dXRuntimeContext, this.f32298a));
            } else if (obj instanceof String) {
                super.handleEvent(dXEvent, objArr, dXRuntimeContext);
            }
        }
    }

    @Override // tb.yra, tb.mvb
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        }
    }
}
