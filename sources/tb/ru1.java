package tb;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.testutils.log.LogUtils;
import tb.jm1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class ru1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FEATURE_CONTENT = "featureContent";
    public static final String FEATURE_JSON = "featureJSON";
    public static final String FEATURE_NAME = "featureName";
    public static final String TRIGGER_CONTENT = "triggerContent";
    public static final String TYPE = "bx_feature";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
    }

    static {
        t2o.a(404750517);
    }

    public ru1(JSONObject jSONObject) {
    }

    public JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("87d5db88", new Object[]{this, jSONObject, jSONObject2});
        }
        if (jSONObject2 == null || jSONObject == null) {
            return null;
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(FEATURE_CONTENT, (Object) jSONObject2);
        jSONObject3.put(TRIGGER_CONTENT, (Object) jSONObject);
        jSONObject3.put(FEATURE_NAME, (Object) e());
        return jSONObject3;
    }

    public boolean c(JSONObject jSONObject, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd33d06e", new Object[]{this, jSONObject, aVar})).booleanValue();
        }
        h(jSONObject);
        JSONObject d = d(jSONObject);
        g(jSONObject, d);
        if (d == null || d.size() == 0) {
            return false;
        }
        b(jSONObject, d);
        f(a(jSONObject, d), aVar);
        return true;
    }

    public abstract JSONObject d(JSONObject jSONObject);

    public abstract String e();

    public void f(JSONObject jSONObject, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bbbe64f", new Object[]{this, jSONObject, aVar});
        } else if (aVar != null) {
            ((jm1.a) aVar).a(jSONObject);
        }
    }

    public void g(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f726f33c", new Object[]{this, jSONObject, jSONObject2});
        }
    }

    public void h(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39eaad11", new Object[]{this, jSONObject});
        }
    }

    public boolean b(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c376f000", new Object[]{this, jSONObject, jSONObject2})).booleanValue();
        }
        String e = e();
        if (TextUtils.isEmpty(e)) {
            LogUtils.f(LogUtils.BX_BIZ_NAME, "broadcastFeature", "featureName is null");
            return false;
        } else if (jSONObject == null) {
            LogUtils.f(LogUtils.BX_BIZ_NAME, "broadcastFeature", "trigger is null");
            return false;
        } else if (jSONObject2 == null || jSONObject2.size() == 0) {
            LogUtils.f(LogUtils.BX_BIZ_NAME, "broadcastFeature", "feature is empty");
            return false;
        } else {
            Intent intent = new Intent("BehaviX_Feature_" + e);
            Bundle bundle = new Bundle();
            bundle.putString("scene", jSONObject.getString("scene"));
            bundle.putString("actionType", jSONObject.getString("actionType"));
            bundle.putString("actionName", jSONObject.getString("actionName"));
            bundle.putInt(yj4.PARAM_IS_FIRST_ENTER, jSONObject.getIntValue(yj4.PARAM_IS_FIRST_ENTER));
            bundle.putInt("destroy", jSONObject.getIntValue("destroy"));
            bundle.putString("fromScene", jSONObject.getString("fromScene"));
            bundle.putString("toScene", jSONObject.getString("toScene"));
            bundle.putLong("actionDuration", jSONObject.getLongValue("actionDuration"));
            bundle.putString("bizArgKVS", jSONObject.getString("bizArgKVS"));
            bundle.putLong("createTime", jSONObject.getLongValue("createTime"));
            if (gwv.A(v82.i("closeAllEdge", 0.05d), false)) {
                str = "1";
            } else {
                str = "0";
            }
            bundle.putString("isCloseEdge", str);
            intent.putExtra(TRIGGER_CONTENT, bundle);
            Bundle bundle2 = new Bundle();
            bundle2.putString(FEATURE_JSON, jSONObject2.toJSONString());
            intent.putExtra(FEATURE_CONTENT, bundle2);
            intent.setPackage(f82.d().getPackageName());
            f82.d().sendBroadcast(intent);
            return true;
        }
    }
}
