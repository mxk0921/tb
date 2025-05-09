package tb;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b9 extends m8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_PARAMS = "params";
    public static final String KEY_QUERY_PARAMS = "queryParams";
    public static final String KEY_TYPE = "type";
    public static final String KEY_URL = "url";
    public static final String OPEN_URL_KEY = "5176777946386787820";
    public static final String TYPE_OPEN_URL_NATIVE = "Native";

    static {
        t2o.a(336592942);
    }

    public static /* synthetic */ Object ipc$super(b9 b9Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilitykit/ability/AKOpenUrlAbility");
    }

    public void i(Context context, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6036865", new Object[]{this, context, str, jSONObject});
            return;
        }
        Bundle a2 = hp6.a(new Bundle(), jSONObject);
        Intent intent = new Intent(str);
        intent.putExtras(a2);
        context.startActivity(intent);
    }

    @Override // tb.m8
    public c8 f(n8 n8Var, k8 k8Var, u8 u8Var) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("40f5a125", new Object[]{this, n8Var, k8Var, u8Var});
        }
        if (g8.b() != null) {
            return g8.b().a(k8Var.d(), n8Var);
        }
        if (n8Var != null) {
            String i = n8Var.i("type");
            String i2 = n8Var.i("url");
            JSONObject g = n8Var.g("queryParams");
            if (g != null) {
                i2 = hp6.b(i2, g);
            }
            JSONObject g2 = n8Var.g("params");
            if (!"Native".equalsIgnoreCase(i) || TextUtils.isEmpty(i2)) {
                if (TextUtils.isEmpty(i2)) {
                    str = "open url ability has not inject impl,and url is empty";
                } else {
                    str = "open url ability has not inject impl,and type is not native";
                }
                return new b8(new a8(10002, str), true);
            }
            i(k8Var.d(), i2, g2);
        }
        return new f8();
    }
}
