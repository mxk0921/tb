package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.rule.AURALocalAdjustIO;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "alibuy.impl.rule.localAdjust.validateData")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class zr0 extends ct {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(301989983);
    }

    public static /* synthetic */ Object ipc$super(zr0 zr0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/buy/extension/localadjust/AlibuyValidateRuleExtension");
    }

    public final boolean B(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5967a0c0", new Object[]{this, jSONObject})).booleanValue();
        }
        for (String str : jSONObject.keySet()) {
            if (!jSONObject.getBooleanValue(str)) {
                return false;
            }
        }
        return true;
    }

    @Override // tb.qbb
    public String D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ff62591f", new Object[]{this});
        }
        return "buyValidateRuleHandle";
    }

    @Override // tb.ct
    public Component x(AURALocalAdjustIO aURALocalAdjustIO) {
        JSONObject r;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Component) ipChange.ipc$dispatch("172f30d5", new Object[]{this, aURALocalAdjustIO});
        }
        ak localAdjustModel = aURALocalAdjustIO.getLocalAdjustModel();
        String c = localAdjustModel.c();
        Map<String, Object> map = localAdjustModel.a().fields;
        if (bh.b(map)) {
            return null;
        }
        String str = (String) fk.b(map, "validateState", String.class, null);
        JSONObject b = localAdjustModel.b();
        if (b == null) {
            return null;
        }
        String string = b.getString("shareContextPath");
        if (TextUtils.isEmpty(string) || (r = r()) == null) {
            return null;
        }
        JSONObject jSONObject = r.getJSONObject(string);
        if (jSONObject == null) {
            jSONObject = new JSONObject();
            r.put(string, (Object) jSONObject);
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("componentKeys");
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
            jSONObject.put("componentKeys", (Object) jSONObject2);
        }
        jSONObject2.put(c, (Object) str);
        jSONObject.put("state", (Object) Boolean.valueOf(B(jSONObject2)));
        Component component = new Component();
        component.fields = map;
        return component;
    }
}
