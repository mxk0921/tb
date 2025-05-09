package tb;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliNavServiceInterface;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class cyf implements khc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(786432111);
        t2o.a(786432108);
    }

    @Override // tb.khc
    public void a(Context context, String str, JSONObject jSONObject, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e15284a9", new Object[]{this, context, str, jSONObject, str2, str3});
        } else if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            try {
                AliNavServiceInterface c = xq0.c();
                if (c != null) {
                    c.a(context).g(parse);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
