package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.g5e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class t6v extends iz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public w55 e;

    static {
        t2o.a(153092137);
    }

    public static /* synthetic */ Object ipc$super(t6v t6vVar, String str, Object... objArr) {
        if (str.hashCode() == 655433914) {
            super.f((Context) objArr[0], (String) objArr[1], (String) objArr[2], (JSONObject) objArr[3], (Map) objArr[4]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/common/page/provider/impl/UltronCommonMtopDataProvider");
    }

    public static /* synthetic */ w55 k(t6v t6vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w55) ipChange.ipc$dispatch("815653f7", new Object[]{t6vVar});
        }
        return t6vVar.e;
    }

    @Override // tb.g5e
    public void b(Context context, JSONObject jSONObject, JSONObject jSONObject2, g5e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80f6af9", new Object[]{this, context, jSONObject, jSONObject2, aVar});
            return;
        }
        w55 w55Var = this.e;
        if (w55Var == null) {
            aVar.a("-1", "initial failed,mRequestBuilder is null", new w6v());
            return;
        }
        com.alibaba.android.ultron.vfw.instance.a aVar2 = this.f21656a;
        aVar2.g0(w55Var.h(aVar2.b()), null, new a(aVar), null);
    }

    @Override // tb.iz, tb.g5e
    public void f(Context context, String str, String str2, JSONObject jSONObject, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("271120ba", new Object[]{this, context, str, str2, jSONObject, map});
            return;
        }
        super.f(context, str, str2, jSONObject, map);
        this.c = str2;
        this.e = e6o.a(this.f21656a.getContext(), jSONObject.getJSONObject(gj4.j), map);
    }

    @Override // tb.iz
    public rjc j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rjc) ipChange.ipc$dispatch("642ca3d3", new Object[]{this});
        }
        return new yig();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements ojd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g5e.a f28514a;

        public a(g5e.a aVar) {
            this.f28514a = aVar;
        }

        @Override // tb.ojd
        public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
            String retCode;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddd7a0a5", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                return;
            }
            String str = "UNKNOW";
            if (mtopResponse != null) {
                try {
                    retCode = mtopResponse.getRetCode();
                } catch (Exception unused) {
                    return;
                }
            } else {
                retCode = str;
            }
            if (mtopResponse != null) {
                str = mtopResponse.getRetMsg();
            }
            this.f28514a.a(retCode, str, new w6v());
            kdv.a(t6v.this.c, "mtop", retCode, str, null, null);
            t6v t6vVar = t6v.this;
            kdv.b(t6vVar.c, "mtop", t6v.k(t6vVar).t(), retCode, str, null);
        }

        @Override // tb.ojd
        public void b(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ?> map) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4ca5d12", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
                return;
            }
            r6v r6vVar = new r6v();
            r6vVar.d(new w6v());
            JSONObject i2 = fsbVar != null ? fsbVar.i() : null;
            if (i2 != null) {
                try {
                    JSONObject jSONObject = i2.getJSONObject(gj4.m);
                    boolean z2 = jSONObject != null && TextUtils.equals("true", jSONObject.getString(gj4.n));
                    if (jSONObject == null || !TextUtils.equals("true", jSONObject.getString(gj4.l))) {
                        z = false;
                    }
                    r6vVar.c(new u6v(z2, z));
                } catch (Exception e) {
                    String message = e.getMessage();
                    kdv.a(t6v.this.c, fdv.F_DATA_PROCESS, "QUERY_END_EXCEPTION", message, null, null);
                    kdv.b(t6v.this.c, fdv.F_DATA_PROCESS, "RESPONSE_GLOBAL_PROCESS", "QUERY_END_EXCEPTION", message, null);
                }
            }
            this.f28514a.b(r6vVar);
            try {
                kdv.a(t6v.this.c, "mtop", "mRequestBuilder.getApi()", "onSuccess", null, cyu.c(String.valueOf(mtopResponse.getData())));
                t6v t6vVar = t6v.this;
                kdv.c(t6vVar.c, "mtop", t6v.k(t6vVar).t(), null);
            } catch (Exception unused) {
            }
        }
    }
}
