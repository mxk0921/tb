package tb;

import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.artry.constants.ResultCode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class c6a<T> implements rv2<T>, b0n {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG = c6a.class.getSimpleName();
    private JSONObject mExtraParams;
    public pkd mResultSender;

    static {
        t2o.a(396361737);
        t2o.a(396361767);
        t2o.a(396361769);
    }

    private void sendResult(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94051768", new Object[]{this, new Boolean(z), jSONObject});
            return;
        }
        pkd pkdVar = this.mResultSender;
        if (pkdVar != null) {
            try {
                pkdVar.sendResult(z, jSONObject);
            } catch (Throwable th) {
                Log.e(TAG, "some exceptions happened...", th);
            }
        }
    }

    public c6a addExtraParam(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c6a) ipChange.ipc$dispatch("ff571ba5", new Object[]{this, str, obj});
        }
        if (this.mExtraParams == null) {
            this.mExtraParams = new JSONObject();
        }
        this.mExtraParams.put(str, obj);
        return this;
    }

    public boolean checkSuccess(xao<T> xaoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb657c2c", new Object[]{this, xaoVar})).booleanValue();
        }
        if (xaoVar == null || !xaoVar.f31251a) {
            return false;
        }
        return true;
    }

    public void failCallback(xao<T> xaoVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec48b120", new Object[]{this, xaoVar, jSONObject});
        }
    }

    public pkd getResultSender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pkd) ipChange.ipc$dispatch("ec122093", new Object[]{this});
        }
        return this.mResultSender;
    }

    @Override // tb.b0n
    public void onProgress(int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("756ebb40", new Object[]{this, new Integer(i), jSONObject});
            return;
        }
        pkd pkdVar = this.mResultSender;
        if (pkdVar instanceof b0n) {
            ((b0n) pkdVar).onProgress(i, jSONObject);
        }
    }

    public void setResultSender(pkd pkdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b094f6c7", new Object[]{this, pkdVar});
        } else {
            this.mResultSender = pkdVar;
        }
    }

    public void successCallback(xao<T> xaoVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c534e15b", new Object[]{this, xaoVar, jSONObject});
        }
    }

    @Override // tb.rv2
    public final void callback(xao<T> xaoVar) {
        ResultCode resultCode;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2196b92", new Object[]{this, xaoVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (checkSuccess(xaoVar)) {
            jSONObject.put("resultCode", (Object) ResultCode.SUCCESS.name());
            successCallback(xaoVar, jSONObject);
        } else {
            if (xaoVar == null) {
                resultCode = ResultCode.FAILURE_NULL_RESULT;
            } else {
                resultCode = xaoVar.b;
            }
            String name = resultCode.name();
            jSONObject.put("resultCode", (Object) name);
            StringBuilder sb = new StringBuilder("the result is false, because of [");
            sb.append(name);
            sb.append("]");
            failCallback(xaoVar, jSONObject);
            z = false;
        }
        T t = xaoVar.c;
        if ((t instanceof JSONObject) && !dxv.i((JSONObject) t)) {
            jSONObject.put("extra", (Object) xaoVar.c);
        }
        if (!dxv.i(this.mExtraParams)) {
            jSONObject.put("extra", (Object) this.mExtraParams);
        }
        sendResult(z, jSONObject);
    }
}
