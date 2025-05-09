package tb;

import android.graphics.Typeface;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class yvh implements epc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final JSONObject f32375a;
    public static JSONObject b;

    static {
        t2o.a(980418575);
        t2o.a(982516040);
        JSONObject jSONObject = new JSONObject();
        f32375a = jSONObject;
        jSONObject.put("alibabafont-bold", (Object) "iconfonts/AlibabaSans102_v1_TaoBao-Bd.ttf");
    }

    public static JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3f3a3ddf", new Object[0]);
        }
        JSONObject jSONObject = b;
        if (jSONObject == null) {
            return f32375a;
        }
        return jSONObject;
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("763f19a1", new Object[0]);
        } else if (b == null) {
            try {
                b = JSON.parseObject(uvh.f().i().getConfig("alimuise", "font2021Config", ""));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // tb.epc
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4829454e", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        d();
        return c().containsKey(str.toLowerCase());
    }

    @Override // tb.epc
    public Typeface b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("34a3c994", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        d();
        return Typeface.createFromAsset(vvh.c().getAssets(), c().getString(str.toLowerCase()));
    }
}
