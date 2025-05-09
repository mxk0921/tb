package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ag5 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_CARTWRITEBACK = 7001061658296939571L;

    static {
        t2o.a(478150710);
    }

    public static /* synthetic */ Object ipc$super(ag5 ag5Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/dx/DXCartWriteBackEventHandler");
    }

    public final Object a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a9a5f0bb", new Object[]{this, str, obj});
        }
        if (obj == null || !(obj instanceof JSONObject)) {
            return null;
        }
        return ((JSONObject) obj).get(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0079  */
    @Override // tb.ob5, tb.mvb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void handleEvent(com.taobao.android.dinamicx.expression.event.DXEvent r8, java.lang.Object[] r9, com.taobao.android.dinamicx.DXRuntimeContext r10) {
        /*
            r7 = this;
            r0 = 2
            r1 = 0
            r2 = 1
            com.android.alibaba.ip.runtime.IpChange r3 = tb.ag5.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001b
            java.lang.String r4 = "f9db7b67"
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r1] = r7
            r5[r2] = r8
            r5[r0] = r9
            r8 = 3
            r5[r8] = r10
            r3.ipc$dispatch(r4, r5)
            return
        L_0x001b:
            if (r9 == 0) goto L_0x0086
            int r8 = r9.length
            if (r8 != 0) goto L_0x0021
            goto L_0x0086
        L_0x0021:
            com.taobao.android.ultron.common.model.IDMComponent r8 = tb.yn2.c(r10)
            if (r8 != 0) goto L_0x0028
            return
        L_0x0028:
            com.alibaba.fastjson.JSONObject r8 = r8.getFields()
            if (r8 != 0) goto L_0x002f
            return
        L_0x002f:
            int r10 = r9.length
            if (r10 <= r2) goto L_0x0071
            r10 = r9[r2]
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r3 = "."
            boolean r3 = r10.contains(r3)
            if (r3 == 0) goto L_0x0053
            java.lang.String r3 = "\\."
            java.lang.String[] r10 = r10.split(r3)
            int r3 = r10.length
            r5 = r8
            r4 = 0
        L_0x0049:
            if (r4 >= r3) goto L_0x0057
            r6 = r10[r4]
            java.lang.Object r5 = r7.a(r6, r5)
            int r4 = r4 + r2
            goto L_0x0049
        L_0x0053:
            java.lang.Object r5 = r8.get(r10)
        L_0x0057:
            int r10 = r9.length
            if (r10 <= r0) goto L_0x0071
            if (r5 == 0) goto L_0x0071
            r10 = r9[r0]
            java.lang.String r10 = java.lang.String.valueOf(r10)
            int r10 = java.lang.Integer.parseInt(r10)
            boolean r0 = r5 instanceof com.alibaba.fastjson.JSONArray
            if (r0 == 0) goto L_0x0071
            com.alibaba.fastjson.JSONArray r5 = (com.alibaba.fastjson.JSONArray) r5
            com.alibaba.fastjson.JSONObject r10 = r5.getJSONObject(r10)
            goto L_0x0072
        L_0x0071:
            r10 = 0
        L_0x0072:
            r9 = r9[r1]
            boolean r0 = r9 instanceof com.alibaba.fastjson.JSONObject
            if (r0 != 0) goto L_0x0079
            return
        L_0x0079:
            if (r10 == 0) goto L_0x0081
            java.util.Map r9 = (java.util.Map) r9
            r10.putAll(r9)
            return
        L_0x0081:
            java.util.Map r9 = (java.util.Map) r9
            r8.putAll(r9)
        L_0x0086:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ag5.handleEvent(com.taobao.android.dinamicx.expression.event.DXEvent, java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext):void");
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
