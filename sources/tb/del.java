package tb;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.wp8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class del implements wp8.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809722);
        t2o.a(329252915);
    }

    @Override // tb.wp8.b
    public String a(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c7d44af5", new Object[]{this, context, intent});
        }
        if (intent == null) {
            return String.valueOf(false);
        }
        return String.valueOf(b(intent));
    }

    public final boolean b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f25e89bf", new Object[]{this, intent})).booleanValue();
        }
        if (!f4b.b("enableAfterBuyPreLoadOptimize", true)) {
            uqa.b("recmdPrefetch", "OrderListRecmdPrefetchParser", "orange开关为关");
            return false;
        }
        String c = vls.c(intent.getData());
        if (TextUtils.isEmpty(c)) {
            uqa.b("recmdPrefetch", "OrderListRecmdPrefetchParser", "没有解析到对应的tab");
            return false;
        }
        int d = vls.d(c);
        JSONObject f = vls.f(d);
        if (f == null || f.isEmpty()) {
            uqa.b("recmdPrefetch", "OrderListRecmdPrefetchParser", "recmdConfig == null || recmdConfig.isEmpty()");
            return false;
        }
        String string = f.getString("optimizeType");
        if ("tschedule".equals(string) || "tscheduleAndInstantOpen".equals(string)) {
            return d <= f.getIntValue("orderNumThreshold");
        }
        uqa.b("recmdPrefetch", "OrderListRecmdPrefetchParser", "没有服务端开关");
        return false;
    }
}
