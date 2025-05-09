package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.utils.DataUtils;
import com.taobao.android.detail.ttdetail.utils.UtUtils;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class c3l implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "openCommonDialog";

    /* renamed from: a  reason: collision with root package name */
    public final Activity f16821a;
    public final ze7 b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements s2d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f16822a;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ String c;

        public a(c3l c3lVar, String str, JSONObject jSONObject, String str2) {
            this.f16822a = str;
            this.b = jSONObject;
            this.c = str2;
        }

        @Override // tb.s2d
        public void onCallback(ExecuteResult executeResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
            } else if (executeResult.getStatusCode() > 99) {
                HashMap hashMap = new HashMap();
                String jSONString = JSON.toJSONString(executeResult.toFormattedData());
                hashMap.put("errorMsg", jSONString);
                hashMap.put("itemId", this.f16822a);
                hashMap.put("popId", this.b.getString("popId"));
                hashMap.put("renderType", this.c);
                bw7.b(hashMap, -800022, jSONString);
                tgh.b("OpenCommonDialogImplementor", "mega callback error, result:" + jSONString);
            }
        }
    }

    static {
        t2o.a(912261892);
        t2o.a(912261826);
    }

    public c3l(Context context, ze7 ze7Var) {
        if (context instanceof Activity) {
            this.f16821a = (Activity) context;
        }
        this.b = ze7Var;
    }

    public final JSONObject b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("62a427a2", new Object[]{this, jSONObject});
        }
        JSONObject p = DataUtils.p(this.b);
        if (p == null) {
            return null;
        }
        return p.getJSONObject(jSONObject.getString("bizDataKey"));
    }

    public final void c(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c11913", new Object[]{this, str, str2, str3, str4, jSONObject});
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("apiName", (Object) str);
            jSONObject2.put("renderType", (Object) str2);
            jSONObject2.put("url", (Object) str3);
            jSONObject2.put("popId", (Object) str4);
            jSONObject2.put("extParams", (Object) jSONObject);
            UtUtils.f(19999, "tt_detail_open_common_dialog", jSONObject2);
        } catch (Exception e) {
            tgh.b("OpenCommonDialogImplementor", "openCommonDialogTrack error:" + e.getMessage());
        }
    }

    @Override // tb.zre
    public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        tgh.b("OpenCommonDialogImplementor", xpc.RECORD_EXECUTE);
        if (irVar == null || (a2 = irVar.a()) == null || this.f16821a == null) {
            return false;
        }
        if (a2.getBooleanValue("useBizData")) {
            a2 = b(a2);
        }
        if (a2 == null) {
            return false;
        }
        String string = a2.getString("itemId");
        String d = d(a2);
        if (TextUtils.isEmpty(d)) {
            return true;
        }
        tgh.b("OpenCommonDialogImplementor", d);
        HashMap hashMap = new HashMap();
        hashMap.put("errorMsg", d);
        hashMap.put("itemId", string);
        hashMap.put("popId", a2.getString("popId"));
        bw7.b(hashMap, -800022, d);
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cd, code lost:
        if (r9.equals("Weex1.0") == false) goto L_0x00a6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String d(com.alibaba.fastjson.JSONObject r21) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.c3l.d(com.alibaba.fastjson.JSONObject):java.lang.String");
    }
}
