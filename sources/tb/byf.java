package tb;

import android.content.Context;
import android.os.Bundle;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliNavServiceInterface;
import com.taobao.android.nav.Nav;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class byf implements khc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(786432110);
        t2o.a(786432108);
    }

    @Override // tb.khc
    public void a(Context context, String str, JSONObject jSONObject, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e15284a9", new Object[]{this, context, str, jSONObject, str2, str3});
            return;
        }
        Bundle a2 = hp6.a(new Bundle(), jSONObject);
        if (Boolean.parseBoolean(str3)) {
            Nav.from(context).withExtras(a2).allowEscape().toUri(str);
            return;
        }
        AliNavServiceInterface c = xq0.c();
        if (c != null) {
            c.a(context).d(a2).c(str);
        }
    }
}
