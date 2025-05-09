package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import mtopsdk.mtop.global.SDKUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class h16 implements evb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_INJECT = 9422011105736515L;

    static {
        t2o.a(473956368);
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
            bqa.d("DXInjectDataParser", "operationList == null || operationList.length == 0");
            return i;
        } else if (objArr.length != 1) {
            bqa.d("DXInjectDataParser", "operationList.length != 1");
            return null;
        } else {
            Object obj = objArr[0];
            if (!(obj instanceof String)) {
                bqa.d("DXInjectDataParser", "!(operationList[0] instanceof String)");
                return null;
            } else if ("time".equals(obj)) {
                return String.valueOf(SDKUtils.getCorrectionTimeMillis());
            } else {
                return null;
            }
        }
    }
}
