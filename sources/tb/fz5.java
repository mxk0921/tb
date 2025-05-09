package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class fz5 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HOPENPOP = 3191997407944393521L;
    public static final String TAG = "DXHOpenPopEventHandler";

    static {
        t2o.a(729809011);
    }

    public static /* synthetic */ Object ipc$super(fz5 fz5Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/dinamic3/eventhandler/DXHOpenPopEventHandler");
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
            return;
        }
        vqa j = vqa.k().i("DxEventHandler").j(TAG);
        if (objArr == null || objArr.length == 0) {
            j.e("args = null or args.length ==0").a();
            return;
        }
        Object obj = objArr[0];
        if (!(obj instanceof JSONObject)) {
            j.e("args[0] is not JSONObject").a();
            return;
        }
        JSONObject jSONObject = (JSONObject) obj;
        String string = jSONObject.getString("popScheme");
        if (TextUtils.isEmpty(string)) {
            j.e("popScheme is empty").a();
            return;
        }
        ucm.d(string).a("com.alibaba.poplayer.PopLayer.action.POP").b(jSONObject.getJSONObject("params")).e();
        r5a.d(dXRuntimeContext.i(), jSONObject);
        j.g("popScheme", string).a();
    }
}
