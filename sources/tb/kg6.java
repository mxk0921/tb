package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class kg6 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TBHOMEPAGETEXIUADSCROLLEVENT = -7726063652804907491L;
    public static final String KEY_SLIDE_LAST_INDEX = "_tb_home_slide_last_index";

    public static /* synthetic */ Object ipc$super(kg6 kg6Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/ad/impl/dx/event/DXTbHomePageTexiuAdScrollEventHandler");
    }

    public final int a(DXRuntimeContext dXRuntimeContext) {
        Integer integer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5566ff51", new Object[]{this, dXRuntimeContext})).intValue();
        }
        JSONObject i = dXRuntimeContext.i();
        if (i == null || (integer = i.getInteger(KEY_SLIDE_LAST_INDEX)) == null) {
            return -1;
        }
        return integer.intValue();
    }

    public final void b(int i, float f, Object obj, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92b73152", new Object[]{this, new Integer(i), new Float(f), obj, new Integer(i2)});
            return;
        }
        JSONObject jSONObject = (JSONObject) ((JSONArray) obj).get(i);
        if (jSONObject != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("args");
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            jSONObject2.put("maskType", (Object) Integer.valueOf(i2));
            jSONObject2.put("maskAlpha", (Object) Float.valueOf(f));
            jSONObject2.put("maskIndex", (Object) Integer.valueOf(i));
            gd0.a("Page_Home", "Page_home_Texiu_Bus_Monitor", null, null, jSONObject2);
            TLog.logd("InformationFlow_TB_AD", "AdScrollEventHandler", JSON.toJSONString(jSONObject2));
        }
    }

    public final void c(DXRuntimeContext dXRuntimeContext, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52f2050c", new Object[]{this, dXRuntimeContext, new Integer(i)});
            return;
        }
        JSONObject i2 = dXRuntimeContext.i();
        if (i2 != null) {
            i2.put(KEY_SLIDE_LAST_INDEX, (Object) Integer.valueOf(i));
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

    /* JADX WARN: Removed duplicated region for block: B:31:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0090 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:8:0x0021, B:11:0x0027, B:13:0x002b, B:17:0x0037, B:18:0x003f, B:19:0x0043, B:20:0x004b, B:29:0x0060, B:33:0x006e, B:36:0x0076, B:38:0x0090, B:39:0x0091, B:66:0x00e2, B:68:0x00f2, B:71:0x00f8, B:73:0x0105, B:75:0x010a, B:76:0x011d, B:77:0x0121, B:79:0x0128), top: B:83:0x0021, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f2 A[Catch: all -> 0x0032, Exception -> 0x00f6, TryCatch #4 {Exception -> 0x00f6, blocks: (B:66:0x00e2, B:68:0x00f2, B:71:0x00f8, B:73:0x0105, B:75:0x010a), top: B:90:0x00e2, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0105 A[Catch: all -> 0x0032, Exception -> 0x00f6, TryCatch #4 {Exception -> 0x00f6, blocks: (B:66:0x00e2, B:68:0x00f2, B:71:0x00f8, B:73:0x0105, B:75:0x010a), top: B:90:0x00e2, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // tb.ob5, tb.mvb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void handleEvent(com.taobao.android.dinamicx.expression.event.DXEvent r13, java.lang.Object[] r14, com.taobao.android.dinamicx.DXRuntimeContext r15) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.kg6.handleEvent(com.taobao.android.dinamicx.expression.event.DXEvent, java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext):void");
    }
}
