package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.api.ConnectionResult;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class sr5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TBHOMEPAGEFIRSTADTEXIU = -6834540955644463954L;

    public static /* synthetic */ Object ipc$super(sr5 sr5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/ad/impl/dx/parser/DXDataParserTbHomePageFirstAdTexiu");
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
            svv.b("Page_Home", 2201, "Page_Home_ShowPendant", null, null, jSONObject2);
            svv.b("Page_Home", ConnectionResult.SERVICE_UPDATING, "Page_Home_ShowPendant", null, null, jSONObject2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0077 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0092 A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #3 {all -> 0x0033, blocks: (B:8:0x0021, B:12:0x0029, B:14:0x002f, B:19:0x003a, B:21:0x0040, B:23:0x0048, B:25:0x004e, B:29:0x005a, B:31:0x0060, B:34:0x006c, B:39:0x007b, B:42:0x0082, B:44:0x0092, B:63:0x00ba, B:66:0x00c4, B:68:0x00ca, B:70:0x00d8), top: B:80:0x0021, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009d  */
    @Override // tb.nb5, tb.evb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object evalWithArgs(java.lang.Object[] r12, com.taobao.android.dinamicx.DXRuntimeContext r13) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.sr5.evalWithArgs(java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext):java.lang.Object");
    }
}
