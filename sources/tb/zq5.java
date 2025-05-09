package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.service.BUFS;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zq5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TBLFETCHBHXBUFSFEATURE = -7938287296485434688L;

    static {
        t2o.a(806355428);
    }

    public static /* synthetic */ Object ipc$super(zq5 zq5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/home/dinamic/parser/DXDataParserTBLFetchBHXBUFSFeature");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (!(objArr == null || objArr.length == 0)) {
            Object obj = objArr[0];
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                return BUFS.getFeature(new BUFS.QueryArgs(), jSONObject.getString("invokeId"), jSONObject.getString("bizIdentifier"), jSONObject.getString("currentScene"));
            }
        }
        return null;
    }
}
