package com.taobao.android.external;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.pz3;
import tb.rm1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class BHXVisualCenterItem extends rm1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BHXVisualCenterItemPositionLeftBottom = 3;
    public static final int BHXVisualCenterItemPositionLeftTop = 1;
    public static final int BHXVisualCenterItemPositionRightBottom = 4;
    public static final int BHXVisualCenterItemPositionRightTop = 2;
    public int i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface BHXVisualCenterItemPosition {
    }

    static {
        t2o.a(404750671);
    }

    public static /* synthetic */ Object ipc$super(BHXVisualCenterItem bHXVisualCenterItem, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/external/BHXVisualCenterItem");
    }

    public JSONObject f(long j, Map<String, String> map, boolean z, long j2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("aadf2cfc", new Object[]{this, new Long(j), map, new Boolean(z), new Long(j2)});
        }
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(this.f27464a) && this.d < 0) {
            return jSONObject;
        }
        jSONObject.put("position", (Object) Integer.valueOf(this.i));
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        jSONObject.put("isFirstScreen", (Object) str);
        if (!pz3.b(map)) {
            jSONObject.put("slideGesture", (Object) map);
        }
        a(jSONObject, j, j2);
        d(jSONObject);
        b(jSONObject);
        c(jSONObject);
        return jSONObject;
    }
}
