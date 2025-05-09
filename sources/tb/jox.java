package tb;

import android.graphics.Color;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class jox {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f22133a;
    public final int b;
    public final int c;
    public final int d;

    static {
        t2o.a(993002087);
    }

    public jox(JSONObject jSONObject) {
        int i;
        ckf.g(jSONObject, "styleObj");
        this.f22133a = d("topRadius", jSONObject);
        this.b = d("bottomRadius", jSONObject);
        try {
            i = Color.parseColor(jSONObject.getString("backgroundColor"));
        } catch (Exception unused) {
            i = 0;
        }
        this.c = i;
        this.d = d("paddingTop", jSONObject);
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7cbe599", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a100bc0d", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c5536f4", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public final int d(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7b0a941b", new Object[]{this, str, jSONObject})).intValue();
        }
        String string = jSONObject.getString(str);
        if (!TextUtils.isEmpty(string)) {
            try {
            } catch (Exception unused) {
                return 0;
            }
        }
        return (int) fxh.e(string);
    }

    public final int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ccbccb8b", new Object[]{this})).intValue();
        }
        return this.f22133a;
    }
}
