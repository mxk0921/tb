package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.imp.ParseResponseHelper;
import java.util.HashMap;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONException;
import tb.zv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class n7h extends zv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final u55 f24556a;
    public final Context b;
    public final boolean c;

    static {
        t2o.a(83886173);
    }

    public n7h(w55 w55Var) {
        if (w55Var != null) {
            this.b = w55Var.z();
            fsb A = w55Var.A();
            if (A instanceof u55) {
                this.f24556a = (u55) A;
            } else {
                this.f24556a = new u55(w55Var.R());
            }
            this.f24556a.q0(w55Var.z());
            this.f24556a.a(w55Var.w());
            this.f24556a.f(w55Var.y());
            this.c = w55Var.X();
        }
    }

    public static /* synthetic */ Object ipc$super(n7h n7hVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/datamodel/imp/LocalDataDataRequest");
    }

    public final String b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66c4c8f", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return "";
        }
        return jSONObject.toJSONString();
    }

    public final MtopResponse c(JSONObject jSONObject, byte[] bArr) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("86acfd2a", new Object[]{this, jSONObject, bArr});
        }
        MtopResponse mtopResponse = new MtopResponse();
        if (this.c || bArr == null) {
            str = b(jSONObject);
        } else {
            str = null;
        }
        if (bArr != null) {
            mtopResponse.setBytedata(bArr);
        } else {
            mtopResponse.setBytedata(str.getBytes());
        }
        try {
            if (this.c) {
                mtopResponse.setDataJsonObject(new org.json.JSONObject(str));
            }
        } catch (JSONException e) {
            f9v.q(xh8.a(this.f24556a.getBizName()).c("LocalDataDataRequest").message(e.getMessage()));
        }
        return mtopResponse;
    }

    @Override // tb.zv
    public void a(JSONObject jSONObject, zv.a aVar, smc smcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ba33d4", new Object[]{this, jSONObject, aVar, smcVar});
            return;
        }
        if (this.f24556a.d()) {
            this.f24556a.m0();
        }
        this.f24556a.n0(true);
        ParseResponseHelper parseResponseHelper = new ParseResponseHelper(this.f24556a);
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        parseResponseHelper.p(jSONObject2);
        if (parseResponseHelper.h(o1n.FEATURE_CONTAINER_CACHE)) {
            parseResponseHelper.v(this.b, this.f24556a.getBizName(), jSONObject2, true, true);
        }
        parseResponseHelper.q(jSONObject);
        byte[] a2 = aVar == null ? null : aVar.a();
        if (parseResponseHelper.i()) {
            smcVar.b(c(jSONObject, a2), this.f24556a, parseResponseHelper.f());
        } else {
            smcVar.a(c(jSONObject, a2), true, parseResponseHelper.f());
        }
        new HashMap().put("isSuccess", Boolean.valueOf(parseResponseHelper.i()));
    }
}
