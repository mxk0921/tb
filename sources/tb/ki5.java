package tb;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ki5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long DX_PARSER_ID = k06.a("arrayJoinedByString");

    static {
        t2o.a(912262656);
    }

    public static /* synthetic */ Object ipc$super(ki5 ki5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/transfer/handler/DXDataParserArrayJoinedByString");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        String str = "";
        if (objArr != null && objArr.length >= 2) {
            Object obj = objArr[0];
            if (obj instanceof JSONArray) {
                jSONArray = (JSONArray) obj;
            } else {
                jSONArray = null;
            }
            if (jSONArray != null && !jSONArray.isEmpty()) {
                Object obj2 = objArr[1];
                if (obj2 instanceof String) {
                    str = (String) obj2;
                }
                StringBuffer stringBuffer = new StringBuffer();
                for (int i = 0; i < jSONArray.size(); i++) {
                    stringBuffer.append(jSONArray.get(i));
                    if (i < jSONArray.size() - 1) {
                        stringBuffer.append(str);
                    }
                }
                return stringBuffer.toString();
            }
        }
        return str;
    }
}
