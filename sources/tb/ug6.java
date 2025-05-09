package tb;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ug6 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TBLSEARCHTAP = -3206170206360344375L;

    static {
        t2o.a(310378548);
    }

    public static /* synthetic */ Object ipc$super(ug6 ug6Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/dinamicx/DXTblSearchTapEventHandler");
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

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr != null && objArr.length != 0 && dXRuntimeContext != null) {
            try {
                if (dXRuntimeContext.h() instanceof Activity) {
                    FlexaLiveX.o().z(FlexaLiveX.ATYPE, false, dXRuntimeContext.h());
                    FlexaLiveX.o().z(FlexaLiveX.BTYPE, false, dXRuntimeContext.h());
                    if (bl9.g().b() && d9m.e() != null) {
                        if (d9m.e().getNonageServiceX().a((Activity) dXRuntimeContext.h(), "搜索")) {
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            Object obj = objArr[0];
            JSONObject jSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
            if (jSONObject != null) {
                String string = jSONObject.getString(rg0.JUMP_URL);
                String string2 = jSONObject.getString("hotWordInfo");
                if (!TextUtils.isEmpty(string)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("hotWordInfo", string2);
                    a2h.c(dXRuntimeContext.h(), string, bundle);
                }
            }
        }
    }
}
