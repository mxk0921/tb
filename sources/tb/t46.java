package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXScrollEvent;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class t46 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_MTB_TOOLSSCROLLEXPOSE = -4027356617499343157L;

    static {
        t2o.a(745538125);
    }

    public static /* synthetic */ Object ipc$super(t46 t46Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/ultron/event/DXMtbToolsScrollExposeEventHandler");
    }

    public final int a(Context context, Object obj) throws Exception {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5aadccec", new Object[]{this, context, obj})).intValue();
        }
        if (obj instanceof Number) {
            i = ((Number) obj).intValue();
        } else {
            i = Integer.parseInt(obj.toString());
        }
        return pb6.c(context, i);
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        Integer integer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(u3j.b, 19999, "Page_MyTaobao_toolbar_scroll", "", "", new HashMap()).build());
        if (objArr != null && objArr.length >= 4) {
            try {
                if (dXEvent instanceof DXScrollEvent) {
                    Object obj = objArr[3];
                    if (obj instanceof JSONArray) {
                        JSONArray jSONArray = (JSONArray) obj;
                        if (jSONArray.size() != 0) {
                            int a2 = a(dXRuntimeContext.h(), objArr[0]);
                            int a3 = a(dXRuntimeContext.h(), objArr[1]);
                            int a4 = a(dXRuntimeContext.h(), objArr[2]);
                            DXScrollEvent dXScrollEvent = (DXScrollEvent) dXEvent;
                            int offsetX = dXScrollEvent.getOffsetX();
                            int min = Math.min(dXScrollEvent.getOffsetX() + dXScrollEvent.getScrollerSize().f29533a, dXScrollEvent.getContentSize().f29533a);
                            for (int i = 0; i < jSONArray.size(); i++) {
                                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                                if (!(jSONObject3.getBooleanValue("hasExpose") || (jSONObject = jSONObject3.getJSONObject("fields")) == null || (jSONObject2 = jSONObject.getJSONObject("args")) == null || (integer = jSONObject2.getInteger("itemIndex")) == null)) {
                                    double intValue = (integer.intValue() * (a4 + a3)) + a2 + (a4 * 0.5d);
                                    if (offsetX < intValue && intValue < min) {
                                        ruv.a(jsh.a(null, jSONObject3));
                                        jSONObject3.put("hasExpose", (Object) Boolean.TRUE);
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // tb.ob5, tb.mvb
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }
}
