package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AlertConfirmInfo;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class zk0 extends n6v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FIELD_ALERT = "alert";
    public static final String NEXT_TAG_CANCEL = "cancel";
    public static final String NEXT_TAG_CONFIRM = "confirm";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements osc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b8v f32814a;

        public a(b8v b8vVar) {
            this.f32814a = b8vVar;
        }

        @Override // tb.cfb
        public void B(AlertConfirmInfo alertConfirmInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2958b9b", new Object[]{this, alertConfirmInfo});
            } else {
                hav.d("AlertV2Subscriber", "onOther");
            }
        }

        @Override // tb.cfb
        public void J(AlertConfirmInfo alertConfirmInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5529a063", new Object[]{this, alertConfirmInfo});
            } else {
                zk0.this.C(this.f32814a, "cancel");
            }
        }

        @Override // tb.jdb
        public void O(ErrorResult errorResult) {
            String str;
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14182866", new Object[]{this, errorResult});
                return;
            }
            if (errorResult != null) {
                str = errorResult.getCode();
            } else {
                str = "defaultCode";
            }
            if (errorResult != null) {
                str2 = errorResult.getMsg();
            } else {
                str2 = "defaultMsg";
            }
            hav.d("AlertV2Subscriber", "onError: ".concat("code: " + str + " - msg: " + str2));
        }

        @Override // tb.cfb
        public void n(AlertConfirmInfo alertConfirmInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a873d70b", new Object[]{this, alertConfirmInfo});
            } else {
                zk0.this.C(this.f32814a, "confirm");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements sfb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b8v f32815a;

        public b(b8v b8vVar) {
            this.f32815a = b8vVar;
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9b609d1", new Object[]{this, new Boolean(z)});
            } else if (z) {
                zk0.this.C(this.f32815a, "confirm");
            } else {
                zk0.this.C(this.f32815a, "cancel");
            }
        }
    }

    static {
        t2o.a(614465537);
    }

    public static JSONObject J(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("40d5dc7", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", (Object) "alertV2");
        jSONObject2.put("fields", (Object) jSONObject.getJSONObject("alert"));
        if (!jSONObject.containsKey("cancelText")) {
            jSONObject2.getJSONObject("fields").put("cancelText", (Object) Localization.q(R.string.order_biz_cancel));
        }
        return jSONObject2;
    }

    public static /* synthetic */ Object ipc$super(zk0 zk0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/event/ext/AlertV2Subscriber");
    }

    @Override // tb.n6v
    public String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4e47c3c", new Object[]{this});
        }
        return "-1290276990007329743";
    }

    @Override // tb.n6v
    public void I(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146e2815", new Object[]{this, b8vVar});
            return;
        }
        JSONObject E = E(b8vVar);
        if (E == null) {
            uj8.a(zk0.class.getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", "获取fields失败");
            return;
        }
        Context e = b8vVar.e();
        if (e instanceof Activity) {
            try {
                if (wbl.B()) {
                    K(b8vVar, (Activity) e, E);
                } else {
                    L(b8vVar, (Activity) e, E);
                }
            } catch (Exception e2) {
                uj8.b("AlertV2Subscriber", "onHandleEventChain", "EVENT_CHAIN_TRY_EXCEPTION_ERROR", uj8.d(e2));
            }
        } else {
            uj8.a(zk0.class.getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", "context异常 context is" + e);
        }
    }

    public final void K(b8v b8vVar, Activity activity, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("677618e8", new Object[]{this, b8vVar, activity, jSONObject});
        } else if (b8vVar != null) {
            bii a2 = bii.a();
            xk0 a3 = xk0.a();
            if (!TextUtils.isEmpty(jSONObject.getString("title"))) {
                a3.f31435a = jSONObject.getString("title");
            }
            if (!TextUtils.isEmpty(jSONObject.getString("msg"))) {
                a3.b = jSONObject.getString("msg");
            }
            if (!TextUtils.isEmpty(jSONObject.getString("cancelText"))) {
                a3.e = jSONObject.getString("cancelText");
            }
            if (!TextUtils.isEmpty(jSONObject.getString("confirmText"))) {
                a3.d = jSONObject.getString("confirmText");
            }
            a2.b(activity, a3, new a(b8vVar));
        }
    }

    public final void L(b8v b8vVar, Activity activity, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c52063", new Object[]{this, b8vVar, activity, jSONObject});
        } else if (b8vVar != null) {
            new yt0(activity, new b(b8vVar), jSONObject.getString("title"), jSONObject.getString("msg"), jSONObject.getString("cancelText"), jSONObject.getString("confirmText")).c();
        }
    }
}
