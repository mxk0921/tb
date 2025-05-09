package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class c1n {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_STRETCH_HEIGHT = "stretchHeight";

    /* renamed from: a  reason: collision with root package name */
    public final int f16778a;

    static {
        t2o.a(912261543);
    }

    public c1n(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString(KEY_STRETCH_HEIGHT);
            if (!TextUtils.isEmpty(string)) {
                this.f16778a = Integer.parseInt(string);
            }
        } catch (Throwable th) {
            tgh.c("PropertiesData", "stretchHeight is not a number", th);
        }
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3f613250", new Object[]{this})).intValue();
        }
        return this.f16778a;
    }
}
