package tb;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class sse {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final sse INSTANCE = new sse();
    public static final String IN_SHOP_ELDER_HIT_VALUE = "elder";

    static {
        t2o.a(815793484);
    }

    public final boolean a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd875051", new Object[]{this, intent})).booleanValue();
        }
        if (intent == null) {
            return false;
        }
        String stringExtra = intent.getStringExtra(r4p.KEY_SHOP_SEARCH_ELDER);
        if (!TextUtils.isEmpty(stringExtra)) {
            return ckf.b(IN_SHOP_ELDER_HIT_VALUE, stringExtra);
        }
        Uri data = intent.getData();
        if (data == null) {
            return false;
        }
        return ckf.b(IN_SHOP_ELDER_HIT_VALUE, data.getQueryParameter(r4p.KEY_SHOP_SEARCH_ELDER));
    }

    public final void b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec84250e", new Object[]{this, intent});
        } else if (intent != null) {
            boolean g = cvr.INSTANCE.g(a(intent));
            intent.putExtra(r4p.KEY_SEARCH_ELDER_HOME_OPEN, String.valueOf(g));
            intent.putExtra(r4p.KEY_GRAY_HAIR, String.valueOf(g));
        }
    }
}
