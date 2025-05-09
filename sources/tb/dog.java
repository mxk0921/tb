package tb;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class dog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(708837382);
    }

    public static void a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bff15be0", new Object[]{context, str, str2});
            return;
        }
        if (!(context instanceof FragmentActivity)) {
            ck.g().d("LightBuyDowngrade context not FragmentActivity!!");
        }
        ck.g().f("LightBuy downgrade ", ck.b.b().l("LightBuyDowngrade").i("LightBuy/downgrade").g("code", str).g("info", str2).a());
        eog.b(str, str2);
        FragmentActivity fragmentActivity = (FragmentActivity) context;
        q8r.d("Degrade-Float-Native", lql.d(fragmentActivity.getIntent()));
        fragmentActivity.getIntent().putExtra("needNativeContainer", "true");
        g8r.a(fragmentActivity);
    }
}
