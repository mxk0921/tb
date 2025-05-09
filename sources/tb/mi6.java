package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import mtopsdk.mtop.global.SDKUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class mi6 implements evb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_INJECT = 9422011105736515L;
    public static final String TAG = "inject";

    static {
        t2o.a(157286620);
        t2o.a(444596865);
    }

    @Override // tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        JSONObject i = dXRuntimeContext.i();
        if (objArr == null || objArr.length == 0) {
            return i;
        }
        if (objArr.length != 1) {
            return null;
        }
        Object obj = objArr[0];
        if (!(obj instanceof String) || !"time".equals(obj)) {
            return null;
        }
        return String.valueOf(SDKUtils.getCorrectionTimeMillis());
    }
}
