package tb;

import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.utils.TransportConstants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.livehome.plugin.atype.flexalocal.TaoLiveHomePageX;
import java.util.UUID;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class br5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TBLFETCHDEVICEINFO = 3909709391975154874L;

    static {
        t2o.a(310378532);
    }

    public static /* synthetic */ Object ipc$super(br5 br5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/dinamicx/DXDataParserTBLFetchDeviceInfo");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appVersion", (Object) TaoLiveHomePageX.getAppVersion(null));
        jSONObject.put("taobaoAppVersion", (Object) sj7.j());
        jSONObject.put(TransportConstants.KEY_UUID, (Object) UUID.randomUUID());
        String str = "release";
        jSONObject.put("currentEnvironment", (Object) (qw0.p() ? "debug" : str));
        jSONObject.put("devicePackage", (Object) (qw0.p() ? "debug" : str));
        if (qw0.f() == 1) {
            str = "debug";
        }
        jSONObject.put("deviceEnvironment", (Object) str);
        jSONObject.put("newWorkQuality", (Object) qw0.h());
        jSONObject.put("netWorkQuality", (Object) qw0.h());
        jSONObject.put("bottomSafeAreaHeight", (Object) 0);
        if (dXRuntimeContext != null) {
            jSONObject.put("foldDevice", (Object) Boolean.valueOf(sj7.s(dXRuntimeContext.h())));
            jSONObject.put("isLandscape", (Object) Boolean.valueOf(sj7.u(dXRuntimeContext.h())));
            jSONObject.put("isPadOrFoldLandscape", (Object) Boolean.valueOf(sj7.v(dXRuntimeContext.h())));
        }
        return jSONObject;
    }
}
