package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class wra extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long DX_EVENT_ID = k06.a("xTap");

    /* renamed from: a  reason: collision with root package name */
    public final ze7 f30869a;

    public wra(Context context, ze7 ze7Var) {
        this.f30869a = ze7Var;
    }

    public static /* synthetic */ Object ipc$super(wra wraVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/dinamicx/event/HandleDinamicXTapEvent");
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr != null && objArr.length > 0) {
            Object obj = objArr[0];
            if (obj instanceof JSONArray) {
                Iterator<Object> it = ((JSONArray) obj).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof JSONObject) {
                        JSONObject jSONObject = (JSONObject) next;
                        if ("false".equalsIgnoreCase(jSONObject.getString(pg1.ATOM_EXT_inline)) || "false".equalsIgnoreCase(jSONObject.getString("native"))) {
                            String string = jSONObject.getString("key");
                            tgh.b("HandleDinamicXTapEvent", "handleEvent encounter an accident with xTap key: " + string);
                        } else {
                            this.f30869a.b().h(new ir(jSONObject), e28.b(objArr, dXRuntimeContext, this.f30869a));
                        }
                    }
                }
            }
        }
    }

    static {
        t2o.a(912261758);
    }
}
