package tb;

import android.view.View;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class yo7 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DISPATCHER_TAG = "handleDinamicXEventWithIndex";

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, Object> f32229a;

    static {
        t2o.a(157286634);
        HashMap<String, Object> hashMap = new HashMap<>();
        f32229a = hashMap;
        hashMap.put(mcu.KEY_INDEX_MODE, Boolean.TRUE);
    }

    public static /* synthetic */ Object ipc$super(yo7 yo7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/event/DinamicXWithIndexEventDispatcherV3");
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        mqk mqkVar;
        ArrayList arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (dXRuntimeContext != null && dXRuntimeContext.q() != null) {
            Object q = dXRuntimeContext.q();
            if (q instanceof Map) {
                Map map = (Map) q;
                ViewEngine viewEngine = (ViewEngine) map.get("ViewEngine");
                if (viewEngine != null && (mqkVar = (mqk) viewEngine.a0(mqk.class)) != null) {
                    map.put(f8v.KEY_DXEVENT, dXEvent);
                    ArrayList arrayList2 = new ArrayList();
                    View D = dXRuntimeContext.D();
                    if (D != null) {
                        Object tag = D.getTag(mgw.DINAMICX_3_CUSTOM_INPUT_KEY);
                        if (tag instanceof ArrayList) {
                            arrayList = (ArrayList) tag;
                            ((kqk) mqkVar).b(dXRuntimeContext.L(), "", objArr, null, q, arrayList, f32229a);
                        }
                    }
                    arrayList = arrayList2;
                    ((kqk) mqkVar).b(dXRuntimeContext.L(), "", objArr, null, q, arrayList, f32229a);
                }
            }
        }
    }
}
