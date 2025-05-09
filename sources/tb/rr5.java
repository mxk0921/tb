package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.api.ConnectionResult;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class rr5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TBHOMEPAGEFIRSTADTEXIU = -6834540955644463954L;

    static {
        t2o.a(486539389);
    }

    public static /* synthetic */ Object ipc$super(rr5 rr5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/parser/DXDataParserTbHomePageFirstAdTexiu");
    }

    public final int a(DXRuntimeContext dXRuntimeContext) {
        Integer integer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5566ff51", new Object[]{this, dXRuntimeContext})).intValue();
        }
        JSONObject i = dXRuntimeContext.i();
        if (i == null || (integer = i.getInteger(kg6.KEY_SLIDE_LAST_INDEX)) == null) {
            return -1;
        }
        return integer.intValue();
    }

    public final void b(DXRuntimeContext dXRuntimeContext, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52f2050c", new Object[]{this, dXRuntimeContext, new Integer(i)});
            return;
        }
        JSONObject i2 = dXRuntimeContext.i();
        if (i2 != null) {
            i2.put(kg6.KEY_SLIDE_LAST_INDEX, (Object) Integer.valueOf(i));
        }
    }

    public final void c(Object obj, int i, int i2) {
        JSONObject jSONObject;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d523053", new Object[]{this, obj, new Integer(i), new Integer(i2)});
        } else if ((obj instanceof JSONArray) && (jSONObject = (JSONObject) ((JSONArray) obj).get(i)) != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("args");
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            if (i2 == 1) {
                str = "guajian";
            } else if (i2 == 2) {
                str = "fuceng";
            } else if (i2 != 3) {
                str = "unknown";
            } else {
                str = "pokuang";
            }
            jSONObject2.put("floatMaskType", (Object) str);
            uve.a("Page_Home", 2201, "Page_Home_ShowPendant", null, null, jSONObject2.toString());
            uve.a("Page_Home", ConnectionResult.SERVICE_UPDATING, "Page_Home_ShowPendant", null, null, jSONObject2.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0072 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098  */
    @Override // tb.nb5, tb.evb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object evalWithArgs(java.lang.Object[] r11, com.taobao.android.dinamicx.DXRuntimeContext r12) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rr5.evalWithArgs(java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext):java.lang.Object");
    }
}
