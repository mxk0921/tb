package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class uo7 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HANDLEDINAMICXPAGEEVENT = 1544903441687469454L;

    static {
        t2o.a(806355636);
    }

    public static /* synthetic */ Object ipc$super(uo7 uo7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/ability/DinamicXPageEventHandler");
    }

    public final JSONArray a(DXRootView dXRootView, String str) {
        JSONObject tborderJson;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("5d3bd041", new Object[]{this, dXRootView, str});
        }
        if (TextUtils.isEmpty(str) || dXRootView == null || dXRootView.getExpandWidgetNode() == null || (tborderJson = dXRootView.getExpandWidgetNode().getTborderJson()) == null || tborderJson.getJSONArray(str) == null) {
            return null;
        }
        return i19.a(tborderJson.getJSONArray(str));
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        if (objArr.length > 0) {
            Object obj = objArr[0];
            if ((obj instanceof String) && sj8.h(dXRuntimeContext, (String) obj) != null) {
                new sj8().handleEvent(dXEvent, objArr, dXRuntimeContext);
                return;
            }
        }
        b(dXEvent, objArr, dXRuntimeContext);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(com.taobao.android.dinamicx.expression.event.DXEvent r10, java.lang.Object[] r11, com.taobao.android.dinamicx.DXRuntimeContext r12) {
        /*
            r9 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = tb.uo7.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x001b
            java.lang.String r2 = "a6ef51b2"
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r9
            r0 = 1
            r3[r0] = r10
            r10 = 2
            r3[r10] = r11
            r10 = 3
            r3[r10] = r12
            r1.ipc$dispatch(r2, r3)
            return
        L_0x001b:
            int r1 = r11.length
            if (r1 <= 0) goto L_0x00b4
            r1 = r11[r0]
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L_0x00b4
            java.lang.String r1 = (java.lang.String) r1
            com.taobao.android.dinamicx.DXRootView r2 = r12.L()
            com.alibaba.fastjson.JSONArray r1 = r9.a(r2, r1)
            java.lang.Object r7 = r12.q()
            boolean r2 = r7 instanceof java.util.Map
            java.lang.String r3 = "DinamicXPageEventHandler"
            if (r2 != 0) goto L_0x003e
            java.lang.String r10 = "Dinamic context not instance of Map"
            tb.v7t.d(r3, r10)
            return
        L_0x003e:
            r2 = r7
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r4 = "DXEvent"
            r2.put(r4, r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            android.view.View r4 = r12.D()
            if (r4 == 0) goto L_0x005f
            int r5 = tb.mgw.DINAMICX_3_CUSTOM_INPUT_KEY
            java.lang.Object r4 = r4.getTag(r5)
            boolean r5 = r4 instanceof java.util.ArrayList
            if (r5 == 0) goto L_0x005f
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            r8 = r4
            goto L_0x0060
        L_0x005f:
            r8 = r10
        L_0x0060:
            java.lang.String r10 = "ViewEngine"
            java.lang.Object r10 = r2.get(r10)
            com.alibaba.android.ultron.vfw.core.ViewEngine r10 = (com.alibaba.android.ultron.vfw.core.ViewEngine) r10
            if (r10 != 0) goto L_0x0070
            java.lang.String r10 = "ViewEngine is null"
            tb.v7t.d(r3, r10)
            return
        L_0x0070:
            java.util.HashMap r3 = new java.util.HashMap
            r4 = 5
            r3.<init>(r4)
            java.lang.String r4 = "dxSubdata"
            java.lang.Object r5 = r12.O()
            r3.put(r4, r5)
            java.lang.String r4 = "dxData"
            com.alibaba.fastjson.JSONObject r5 = r12.i()
            r3.put(r4, r5)
            java.lang.String r4 = "dxRuntimeContext"
            r3.put(r4, r12)
            java.lang.String r4 = "nativeView"
            android.view.View r5 = r12.D()
            r3.put(r4, r5)
            java.lang.String r4 = "bizParams"
            r2.put(r4, r3)
            java.lang.Class<tb.mqk> r2 = tb.mqk.class
            java.lang.Object r10 = r10.a0(r2)
            r2 = r10
            tb.mqk r2 = (tb.mqk) r2
            if (r1 == 0) goto L_0x00a9
            r11[r0] = r1
        L_0x00a9:
            com.taobao.android.dinamicx.DXRootView r3 = r12.L()
            java.lang.String r4 = ""
            r6 = 0
            r5 = r11
            r2.a(r3, r4, r5, r6, r7, r8)
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.uo7.b(com.taobao.android.dinamicx.expression.event.DXEvent, java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext):void");
    }
}
