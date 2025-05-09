package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.weex_framework.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class r27 implements apc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.apc
    public boolean b(Context context, a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b85d157b", new Object[]{this, context, aVar, str})).booleanValue();
        }
        dwh.a("pop " + str);
        if (context instanceof Activity) {
            ((Activity) context).finish();
        }
        return true;
    }

    @Override // tb.apc
    public boolean a(Context context, a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b778484", new Object[]{this, context, aVar, str})).booleanValue();
        }
        String string = JSON.parseObject(str).getString("url");
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        if (!Nav.from(context).toUri(string)) {
            Nav.from(context).toUri(string.trim());
        }
        return true;
    }
}
