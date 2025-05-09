package tb;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.model.RecommendedAddress;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class m3p {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final m3p INSTANCE = new m3p();

    /* renamed from: a  reason: collision with root package name */
    public static String f23756a;
    public static String b;

    static {
        t2o.a(815792242);
    }

    public final void a(Context context, ef0 ef0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2486fd2a", new Object[]{this, context, ef0Var});
            return;
        }
        ckf.g(context, "context");
        ckf.g(ef0Var, "addressCallback");
        mf0.b(context, r4p.RUNTIME_PERMISSION_REQUEST_BIZ_NAME, "tb_search_change_diff_city", true, "TB_SHOPPING_PROCESS", ef0Var);
    }

    public final String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("73d9114c", new Object[]{this, context});
        }
        ckf.g(context, "context");
        if (!a4p.d(context)) {
            return null;
        }
        String e = mf0.e(context, r4p.RUNTIME_PERMISSION_REQUEST_BIZ_NAME, "TB_SHOPPING_PROCESS");
        if (ckf.b(e, f23756a)) {
            return b;
        }
        try {
            JSONObject parseObject = JSON.parseObject(e);
            if (parseObject != null) {
                for (Map.Entry<String, Object> entry : parseObject.entrySet()) {
                    ckf.f(entry, "next(...)");
                    Map.Entry<String, Object> entry2 = entry;
                    if (!ckf.b(entry2.getKey(), "biz_common") && !ckf.b(entry2.getKey(), "tb_search_b2c")) {
                        Object value = entry2.getValue();
                        JSONObject jSONObject = value instanceof JSONObject ? (JSONObject) value : null;
                        if (jSONObject != null) {
                            jSONObject.remove("recommendedAddress");
                        }
                    }
                }
                b = parseObject.toString();
                f23756a = e;
            }
            return b;
        } catch (Throwable unused) {
            return b;
        }
    }

    public final RecommendedAddress c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecommendedAddress) ipChange.ipc$dispatch("89d1b2d4", new Object[]{this, context});
        }
        ckf.g(context, "context");
        return mf0.g(context, r4p.RUNTIME_PERMISSION_REQUEST_BIZ_NAME, "TB_SHOPPING_PROCESS");
    }

    public final void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b7d852b", new Object[]{this, context});
            return;
        }
        ckf.g(context, "context");
        mf0.m(context, r4p.RUNTIME_PERMISSION_REQUEST_BIZ_NAME, "", "", "TB_SHOPPING_PROCESS");
    }

    public final void e(Context context, ef0 ef0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("490d20a8", new Object[]{this, context, ef0Var});
            return;
        }
        ckf.g(context, "context");
        ckf.g(ef0Var, "addressCallback");
        mf0.j(context, r4p.RUNTIME_PERMISSION_REQUEST_BIZ_NAME, "", "local_life", "TB_SHOPPING_PROCESS", ef0Var);
    }
}
