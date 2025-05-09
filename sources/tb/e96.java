package tb;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.homepage.utils.HomeOptimizeUtils;
import com.taobao.tao.recommend3.gateway.msgcenter.RecmdGatewayMsg;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class e96 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_RTAP = 37581716043L;
    public static final String TAG = "rTap";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements HomeOptimizeUtils.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXEvent f18369a;
        public final /* synthetic */ Object[] b;
        public final /* synthetic */ DXRuntimeContext c;

        public a(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
            this.f18369a = dXEvent;
            this.b = objArr;
            this.c = dXRuntimeContext;
        }

        @Override // com.taobao.homepage.utils.HomeOptimizeUtils.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("39174778", new Object[]{this});
            } else {
                e96.a(e96.this, this.f18369a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b extends TypeReference<HashMap<String, String>> {
        public b(e96 e96Var) {
        }
    }

    static {
        t2o.a(729809027);
    }

    public static /* synthetic */ void a(e96 e96Var, DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ca64729", new Object[]{e96Var, dXEvent, objArr, dXRuntimeContext});
        } else {
            e96Var.g(dXEvent, objArr, dXRuntimeContext);
        }
    }

    public static /* synthetic */ Object ipc$super(e96 e96Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/dinamic3/eventhandler/DXRTapEvent");
    }

    public final void b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5560db7e", new Object[]{this, jSONObject});
        } else if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("clickParam")) != null) {
            String string = jSONObject2.getString("page");
            if (!TextUtils.isEmpty(string) && string.equals("Page_Home")) {
                x9u.K("Page_Home", "track_center_action", "rec_list_item_click_count");
            }
        }
    }

    public final String c(Context context, Bundle bundle, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f06b8bbb", new Object[]{this, context, bundle, str});
        }
        try {
            if (TextUtils.isEmpty(str) || !TextUtils.equals("ContentDetailPage", Uri.parse(str).getQueryParameter("currentChannel"))) {
                return str;
            }
            Map<String, String> pageProperties = UTAnalytics.getInstance().getDefaultTracker().getPageProperties(context);
            if (!TextUtils.equals("true", pageProperties.get("useEntryUtparam"))) {
                return str;
            }
            str = str + "&useEntryUtparam=true";
            bundle.putString("entryUtParam", URLDecoder.decode(pageProperties.get(yj4.PARAM_ENTRY_UT_PARAM)));
            bundle.putString("entrySpm", pageProperties.get("entrySpm"));
            bundle.putString("entryScm", pageProperties.get("entryScm"));
            return str;
        } catch (Exception e) {
            bqa.d("Page_Home_Track", "DX3Rap update imagedetailUt failed" + Log.getStackTraceString(e));
            return str;
        }
    }

    public final void d(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2c522b3", new Object[]{this, jSONObject, jSONObject2});
            return;
        }
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject.getJSONObject("args") != null) {
            JSONObject jSONObject4 = jSONObject.getJSONObject("args");
            jSONObject3.put(yj4.PARAM_PVID, (Object) jSONObject4.getString(yj4.PARAM_PVID));
            jSONObject3.put("spm", (Object) jSONObject4.getString("spm"));
            JSONObject jSONObject5 = jSONObject4.getJSONObject("utLogMapEdge");
            if (jSONObject5 != null) {
                jSONObject3.put("x_object_id", (Object) jSONObject5.getString("x_object_id"));
                if (cw6.b()) {
                    bqa.d(z68.TAG, "commit tap, it can get utLogMapEdge");
                }
            } else {
                String string = jSONObject4.getString("utLogMap");
                try {
                    if (!TextUtils.isEmpty(string)) {
                        jSONObject3.put("x_object_id", (Object) JSON.parseObject(URLDecoder.decode(string, "utf-8")).getString("x_object_id"));
                    }
                } catch (UnsupportedEncodingException e) {
                    sfh.e("rTap", "utLogMap catch decode error", e);
                } catch (NullPointerException e2) {
                    sfh.e("rTap", "utLogMap catch npe error", e2);
                }
            }
        }
        if (jSONObject2.getJSONObject("clickParam") != null) {
            str2 = jSONObject2.getJSONObject("clickParam").getString("itemId");
            str = jSONObject2.getJSONObject("clickParam").getString("arg1");
        } else {
            str = "click_recommend_item";
            str2 = null;
        }
        cqv.u("Page_Home", str, null, str2, gqv.b(jSONObject3));
    }

    public final void e(JSONObject jSONObject, JSONObject jSONObject2, View view) {
        b5a b5aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("309b7baa", new Object[]{this, jSONObject, jSONObject2, view});
            return;
        }
        Object tag = view.getTag(R.id.tag_recommend_containerId);
        String str = null;
        String obj = tag == null ? null : tag.toString();
        String string = jSONObject2.getJSONObject("clickParam").getString("itemId");
        String string2 = jSONObject.getString("sectionBizCode");
        von.H(obj, string);
        von.I(obj, string, string2, f(jSONObject));
        JSONObject jSONObject3 = new JSONObject();
        if (tag != null) {
            str = tag.toString();
        }
        jSONObject3.put("containerId", (Object) str);
        jSONObject3.put("itemId", (Object) string);
        if (yyj.p(obj)) {
            b5aVar = new b5a("RTapClick", yyj.n, jSONObject3);
        } else {
            b5aVar = new b5a("RTapClick", kmn.d, jSONObject3);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(b5aVar);
        RecmdGatewayMsg message = RecmdGatewayMsg.getMessage(arrayList);
        if (message != null) {
            zza.a(obj).c(message);
        }
        d(jSONObject, jSONObject2);
    }

    public final JSONObject f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ee910945", new Object[]{this, jSONObject});
        }
        if (jSONObject.getJSONObject("bizData") != null) {
            return jSONObject.getJSONObject("bizData").getJSONObject("itemPassParam");
        }
        return null;
    }

    public final void h() {
        JSONObject s;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc0cab7", new Object[]{this});
            return;
        }
        imn d = zza.d(null);
        if (d != null && (s = d.s()) != null && s.size() > 0) {
            String jSONString = s.toJSONString();
            r5a.r((HashMap) JSON.parseObject(jSONString, new b(this), new Feature[0]));
            r5a.s(jSONString);
            bqa.d("Page_Home_Track", "DX3Rap updateNextPageUtParams");
        }
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        try {
            HomeOptimizeUtils.a(dXRuntimeContext.h(), new a(dXEvent, objArr, dXRuntimeContext));
        } catch (Exception e) {
            ddv.h("rTap", "2.0", "rTapError", e.getMessage(), null, null);
            uqa.b("rTap", "handleEvent crash:", e.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0218 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(com.taobao.android.dinamicx.expression.event.DXEvent r21, java.lang.Object[] r22, com.taobao.android.dinamicx.DXRuntimeContext r23) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.e96.g(com.taobao.android.dinamicx.expression.event.DXEvent, java.lang.Object[], com.taobao.android.dinamicx.DXRuntimeContext):void");
    }
}
