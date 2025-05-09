package tb;

import android.os.Handler;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class wd7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements nwc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ yyb f30630a;

        public a(yyb yybVar) {
            this.f30630a = yybVar;
        }

        @Override // tb.nwc
        public void onError(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97d08c84", new Object[]{this, str, str2});
                return;
            }
            ggh.c(a.class, "requestData onError: " + str + " retMsg" + str2);
            yyb yybVar = this.f30630a;
            if (yybVar != null) {
                yybVar.a(str2);
            }
        }

        @Override // tb.nwc
        public void onSuccess(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37d948b5", new Object[]{this, str});
                return;
            }
            ggh.c(a.class, "requestData onSuccess");
            yyb yybVar = this.f30630a;
            if (yybVar != null && str != null) {
                yybVar.b(str);
            }
        }
    }

    public static void a(JSONObject jSONObject, x3o x3oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ec06e56", new Object[]{jSONObject, x3oVar});
        } else if (jSONObject != null && x3oVar != null) {
            List<String> b = x3oVar.b();
            if (b != null && b.size() > 0) {
                jSONObject.put("dynamicList", (Object) b);
            }
            List<String> a2 = x3oVar.a();
            if (a2 != null && a2.size() > 0) {
                jSONObject.put("animList", (Object) a2);
            }
        }
    }

    public static void b(String str, List<String> list, Object obj, boolean z, yyb yybVar, Handler handler, x3o x3oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a50e469b", new Object[]{str, list, obj, new Boolean(z), yybVar, handler, x3oVar});
            return;
        }
        try {
            HashMap hashMap = new HashMap(1);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", (Object) str);
            jSONObject.put("ids", (Object) list);
            a(jSONObject, x3oVar);
            if (obj != null) {
                jSONObject.put("bizExt", obj);
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.add(0, jSONObject);
            hashMap.put("bizInfo", jSONArray.toString());
            hashMap.put(MspDBHelper.RecordEntry.COLUMN_NAME_VERSION, "1.0");
            JSONObject jSONObject2 = new JSONObject();
            JSONObject f = vd7.e(sd7.d().b()).f();
            if (f != null) {
                jSONObject2.put("mockData", (Object) f);
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("encryptedUid", (Object) vd7.e(sd7.d().b()).d());
            jSONObject2.put("encryptedUser", (Object) jSONObject3);
            if (x3oVar != null && !TextUtils.isEmpty(x3oVar.c())) {
                jSONObject2.put("requestType", (Object) x3oVar.c());
            }
            hashMap.put("extMap", String.valueOf(jSONObject2));
            xd7.b(hashMap, z, new a(yybVar), handler);
        } catch (Exception e) {
            ggh.d("requestServerData onError: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
