package tb;

import android.view.View;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class lo7 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DISPATCHER_TAG = "handleDinamicXEvent";

    static {
        t2o.a(157286632);
    }

    public static /* synthetic */ Object ipc$super(lo7 lo7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/event/DinamicXEventDispatcherV3");
    }

    public final void a(View view, View view2) {
        View findViewWithTag;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7d3c4d6", new Object[]{this, view, view2});
            return;
        }
        if (!(view == null || (findViewWithTag = view.findViewWithTag(f8v.TAG_CLICK_VIEW)) == null)) {
            findViewWithTag.setTag(null);
        }
        if (view2 != null && view2.getTag() == null) {
            view2.setTag(f8v.TAG_CLICK_VIEW);
        }
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        ArrayList arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (dXRuntimeContext == null || dXRuntimeContext.q() == null) {
            hav.g("DX事件", "DinamicXEventDispatcherV3", "context is null");
        } else {
            Object q = dXRuntimeContext.q();
            if (!(q instanceof Map)) {
                hav.g("DX事件", "DinamicXEventDispatcherV3", "userContext is null");
                return;
            }
            Map map = (Map) q;
            ViewEngine viewEngine = (ViewEngine) map.get("ViewEngine");
            if (viewEngine == null) {
                hav.g("DX事件", "DinamicXEventDispatcherV3", "engine is null");
                return;
            }
            mqk mqkVar = (mqk) viewEngine.a0(mqk.class);
            if (mqkVar == null) {
                hav.g("DX事件", "DinamicXEventDispatcherV3", "listener is null");
                return;
            }
            map.put(f8v.KEY_DXEVENT, dXEvent);
            ArrayList arrayList2 = new ArrayList();
            View D = dXRuntimeContext.D();
            if (D != null) {
                Object tag = D.getTag(mgw.DINAMICX_3_CUSTOM_INPUT_KEY);
                if (tag instanceof ArrayList) {
                    arrayList = (ArrayList) tag;
                    a(dXRuntimeContext.L(), D);
                    mqkVar.a(dXRuntimeContext.L(), "", objArr, null, q, arrayList);
                }
            }
            arrayList = arrayList2;
            a(dXRuntimeContext.L(), D);
            mqkVar.a(dXRuntimeContext.L(), "", objArr, null, q, arrayList);
        }
    }
}
