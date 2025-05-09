package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class d3l extends l12 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_COMMON_POPUP_FIELDS = "commonPopupFields";
    public static final String KEY_NEED_CALL_ADJUST_WHEN_CLOSE = "needCallAdjustWhenClose";
    public static final String KEY_OPTIONS = "options";
    public static final String KEY_PARAMS = "params";
    public static final String KEY_TYPE = "type";
    public static final String TAG = "OpenCommonPopupWindowSubscriber";
    public static final String TYPE_CLOSE = "close";
    public static final String TYPE_CONFIRM = "confirm";
    public static y7 k;
    public final u8 j = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements u8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.u8
        public void callback(String str, c8 c8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc026703", new Object[]{this, str, c8Var});
            } else if (c8Var == null) {
                UnifyLog.e(d3l.TAG, "AKIAbilityCallback result is null");
            } else {
                Object a2 = c8Var.a();
                if (!(a2 instanceof JSONObject)) {
                    UnifyLog.e(d3l.TAG, "AKIAbilityCallback result invalid");
                    return;
                }
                JSONObject jSONObject = (JSONObject) a2;
                String string = jSONObject.getString("type");
                if ("close".equals(string)) {
                    d3l.p(d3l.this);
                } else if ("confirm".equals(string)) {
                    d3l.q(d3l.this, jSONObject);
                }
            }
        }
    }

    static {
        t2o.a(155189313);
    }

    public d3l() {
        b();
    }

    public static /* synthetic */ Object ipc$super(d3l d3lVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/trade/event/OpenCommonPopupWindowSubscriber");
    }

    public static /* synthetic */ void p(d3l d3lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("954234b1", new Object[]{d3lVar});
        } else {
            d3lVar.r();
        }
    }

    public static /* synthetic */ void q(d3l d3lVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce854a3e", new Object[]{d3lVar, jSONObject});
        } else {
            d3lVar.s(jSONObject);
        }
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        lcu lcuVar = this.f23048a;
        if (lcuVar != null) {
            lcuVar.h();
        }
        if (v()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", (Object) "H5Back");
            n(g(), jSONObject);
            this.c.d().g(this.e);
        }
    }

    public final void s(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce15f489", new Object[]{this, jSONObject});
            return;
        }
        IDMComponent iDMComponent = this.e;
        if (iDMComponent == null) {
            UnifyLog.e(TAG, "confirm,mComponent is null");
            return;
        }
        JSONObject fields = iDMComponent.getFields();
        if (fields != null) {
            fields.put("type", (Object) jSONObject.getString("type"));
            fields.put("params", (Object) jSONObject.getJSONObject("params"));
        }
        if (t(this.e)) {
            this.c.d().g(this.e);
        }
    }

    public final boolean t(IDMComponent iDMComponent) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("867242ea", new Object[]{this, iDMComponent})).booleanValue();
        }
        JSONObject stashData = iDMComponent.getStashData();
        JSONObject data = iDMComponent.getData();
        if (stashData == null || data == null) {
            return false;
        }
        try {
            z = u(data, stashData);
        } catch (Exception unused) {
        }
        return !z;
    }

    public final boolean u(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5a4906d", new Object[]{this, jSONObject, jSONObject2})).booleanValue();
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        for (String str : jSONObject.keySet()) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Object obj = jSONObject.get(str);
            Object obj2 = jSONObject2.get(str);
            if (obj instanceof JSONObject) {
                if (!u((JSONObject) obj, (JSONObject) obj2)) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    public final void w(lcu lcuVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1d98660", new Object[]{this, lcuVar, jSONObject});
            return;
        }
        if (k == null) {
            k = new y7();
        }
        Context b = lcuVar.b();
        if (b instanceof Activity) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(KEY_COMMON_POPUP_FIELDS);
            if (jSONObject2 == null) {
                UnifyLog.e(TAG, "showCommonPopupWindow,popupFields is null");
                return;
            }
            try {
                n8 n8Var = new n8(jSONObject2);
                n9 n9Var = new n9();
                n9Var.i(b);
                n9Var.m(((Activity) b).getWindow().getDecorView());
                k.b(n8Var, n9Var, this.j);
            } catch (Exception e) {
                UnifyLog.e(TAG, e.toString());
            }
        }
    }

    public final boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d41ae066", new Object[]{this})).booleanValue();
        }
        JSONObject c = c();
        if (c == null || c.getJSONObject("options") == null) {
            return false;
        }
        return Boolean.parseBoolean(c.getJSONObject("options").getString(KEY_NEED_CALL_ADJUST_WHEN_CLOSE));
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
        } else if (lcuVar == null) {
            UnifyLog.e(TAG, "onHandleEvent,event is null");
        } else {
            gsb g = g();
            if (g == null) {
                UnifyLog.e(TAG, "onHandleEvent,idmEvent is null");
                return;
            }
            JSONObject fields = g.getFields();
            if (fields == null) {
                UnifyLog.e(TAG, "onHandleEvent,event fields is null");
            } else if (this.e == null) {
                UnifyLog.e(TAG, "onHandleEvent,mComponent is null");
            } else {
                v8j v8jVar = new v8j(Arrays.asList(this.e));
                v8jVar.b();
                lcuVar.p(v8jVar);
                w(lcuVar, fields);
            }
        }
    }
}
