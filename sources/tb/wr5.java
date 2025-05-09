package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class wr5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TBLGETEXPOSE = -5525453168114082334L;

    static {
        t2o.a(310378534);
    }

    public static /* synthetic */ Object ipc$super(wr5 wr5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/dinamicx/DXDataParserTblGetExpose");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Object obj = objArr[0];
        if (obj instanceof JSONObject) {
            jSONArray = a((JSONObject) obj, jSONArray);
        }
        Object obj2 = objArr[0];
        if (obj2 instanceof JSONArray) {
            try {
                JSONArray jSONArray2 = (JSONArray) obj2;
                if (jSONArray2.size() == 0) {
                    return jSONArray;
                }
                for (int i = 0; i < jSONArray2.size(); i++) {
                    jSONArray = a(jSONArray2.getJSONObject(i), jSONArray);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return jSONArray;
    }

    public final JSONArray a(JSONObject jSONObject, JSONArray jSONArray) {
        JSONArray jSONArray2;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("1423a7f", new Object[]{this, jSONObject, jSONArray});
        }
        if (!(jSONObject == null || (jSONArray2 = jSONObject.getJSONArray("cardData")) == null || jSONArray2.size() <= 0 || (jSONObject2 = jSONArray2.getJSONObject(0)) == null)) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("accountInfo");
            String str = "";
            String string = jSONObject3 != null ? jSONObject3.getString("accountId") : str;
            JSONObject jSONObject4 = jSONObject2.getJSONObject("liveInfo");
            if (jSONObject4 != null) {
                str = jSONObject4.getString("liveId");
            }
            JSONArray jSONArray3 = jSONObject2.getJSONArray(bia.UNDER_TAKE_GOODS_LIST);
            if (jSONArray3 == null || jSONArray3.size() <= 0) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("accountId", (Object) string);
                jSONObject5.put("liveId", (Object) str);
                jSONObject5.put("timeStamp", (Object) Long.valueOf(System.currentTimeMillis() / 1000));
                jSONArray.add(jSONObject5);
            } else {
                for (int i = 0; i < jSONArray3.size(); i++) {
                    JSONObject jSONObject6 = jSONArray3.getJSONObject(i);
                    if (jSONObject6 != null) {
                        JSONObject jSONObject7 = new JSONObject();
                        String string2 = jSONObject6.getString("itemId");
                        jSONObject7.put("accountId", (Object) string);
                        jSONObject7.put("liveId", (Object) str);
                        jSONObject7.put("itemId", (Object) string2);
                        jSONObject7.put("timeStamp", (Object) Long.valueOf(System.currentTimeMillis() / 1000));
                        jSONArray.add(jSONObject7);
                    }
                }
            }
        }
        return jSONArray;
    }
}
