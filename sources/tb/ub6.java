package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXScrollEvent;
import com.taobao.android.dinamicx.expression.event.DXViewEvent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ub6 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_SCROLLEXPOSE = -4629410644348754929L;

    static {
        t2o.a(729809031);
    }

    public static /* synthetic */ Object ipc$super(ub6 ub6Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/dinamic3/eventhandler/DXScrollExposeEventHandler");
    }

    public final void a(JSONObject jSONObject, float f, float f2, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1e51ea3", new Object[]{this, jSONObject, new Float(f), new Float(f2), context});
        } else if (f2 > 0.0f && jSONObject != null) {
            int ceil = (int) Math.ceil(f / f2);
            for (int i = 0; i < ceil; i++) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(String.valueOf(i));
                if (jSONObject2 != null) {
                    k4v.c(jSONObject2, context);
                    if (cw6.b()) {
                        bqa.a("DXScrollExposeEventHandler", "expose position = " + i);
                    }
                }
            }
        }
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        float f;
        int measuredWidth;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr != null && objArr.length >= 3) {
            Object obj = objArr[0];
            if (obj instanceof JSONObject) {
                Object obj2 = objArr[1];
                if (obj2 instanceof String) {
                    Object obj3 = objArr[2];
                    if (obj3 instanceof String) {
                        JSONObject jSONObject = (JSONObject) obj;
                        String str = (String) obj2;
                        String str2 = (String) obj3;
                        if (dXRuntimeContext != null) {
                            try {
                                float d = pb6.d(dXRuntimeContext.r(), dXRuntimeContext.h(), Float.valueOf(str).floatValue());
                                float d2 = pb6.d(dXRuntimeContext.r(), dXRuntimeContext.h(), Float.valueOf(str2).floatValue());
                                if (dXEvent instanceof DXScrollEvent) {
                                    DXScrollEvent dXScrollEvent = (DXScrollEvent) dXEvent;
                                    measuredWidth = dXScrollEvent.getScrollerSize().f29533a + dXScrollEvent.getOffsetX();
                                } else if (dXEvent instanceof DXViewEvent) {
                                    measuredWidth = dXRuntimeContext.W().getMeasuredWidth();
                                } else {
                                    f = 0.0f;
                                    a(jSONObject, f - d2, d, dXRuntimeContext.h());
                                }
                                f = measuredWidth;
                                a(jSONObject, f - d2, d, dXRuntimeContext.h());
                            } catch (Throwable th) {
                                bqa.d("DXScrollExposeEventHandler", th.getMessage());
                            }
                        }
                    }
                }
            }
        }
    }
}
