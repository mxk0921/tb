package tb;

import android.text.TextUtils;
import android.view.View;
import androidx.collection.ArrayMap;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class mo7 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long HANDLE_DINAMICX_EVENT_ONCE = 1656475939690454807L;

    static {
        t2o.a(157286633);
    }

    public static /* synthetic */ Object ipc$super(mo7 mo7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/event/DinamicXEventOnceDispatcher");
    }

    public final boolean a(IDMComponent iDMComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("416719d", new Object[]{this, iDMComponent, str})).booleanValue();
        }
        ArrayMap<String, Object> onceExtMap = iDMComponent.getOnceExtMap();
        if (onceExtMap != null && !TextUtils.isEmpty(str)) {
            Object obj = onceExtMap.get(str);
            if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        mqk mqkVar;
        ArrayList arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr != null && objArr.length >= 2 && (objArr[0] instanceof String) && (objArr[1] instanceof String) && dXRuntimeContext != null && dXRuntimeContext.q() != null) {
            Object q = dXRuntimeContext.q();
            if (q instanceof Map) {
                Map map = (Map) q;
                ViewEngine viewEngine = (ViewEngine) map.get("ViewEngine");
                if (viewEngine != null && (mqkVar = (mqk) viewEngine.a0(mqk.class)) != null) {
                    String str = ((String) objArr[0]) + "_" + ((String) objArr[1]);
                    Object obj = map.get(xo7.TAG_DINAMICX_VIEW_COMPONENT);
                    if (obj instanceof IDMComponent) {
                        IDMComponent iDMComponent = (IDMComponent) obj;
                        if (iDMComponent.getOnceExtMap() != null && !a(iDMComponent, str)) {
                            iDMComponent.getOnceExtMap().put(str, Boolean.TRUE);
                            map.put(f8v.KEY_DXEVENT, dXEvent);
                            ArrayList arrayList2 = new ArrayList();
                            View D = dXRuntimeContext.D();
                            if (D != null) {
                                Object tag = D.getTag(mgw.DINAMICX_3_CUSTOM_INPUT_KEY);
                                if (tag instanceof ArrayList) {
                                    arrayList = (ArrayList) tag;
                                    mqkVar.a(dXRuntimeContext.L(), "", objArr, null, q, arrayList);
                                }
                            }
                            arrayList = arrayList2;
                            mqkVar.a(dXRuntimeContext.L(), "", objArr, null, q, arrayList);
                        }
                    }
                }
            }
        }
    }
}
