package tb;

import android.content.Context;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class sqr implements nyc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(758120548);
        t2o.a(758120482);
    }

    @Override // tb.nyc
    public void a(Context context, String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("359beb5d", new Object[]{this, context, str, bundle});
        } else {
            Nav.from(context).withExtras(bundle).toUri(str);
        }
    }
}
