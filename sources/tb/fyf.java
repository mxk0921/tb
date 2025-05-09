package tb;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class fyf implements khc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(786432112);
        t2o.a(786432108);
    }

    @Override // tb.khc
    public void a(Context context, String str, JSONObject jSONObject, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e15284a9", new Object[]{this, context, str, jSONObject, str2, str3});
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "get";
        }
        if ("post".equals(str2)) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("isPostUrl", true);
            xq0.c().a(context).d(bundle).g(xq0.c().a(context).f(str, jSONObject));
            return;
        }
        xq0.c().a(context).c(str);
    }
}
