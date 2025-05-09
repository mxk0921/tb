package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class rqr implements hzc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(502267950);
        t2o.a(503316595);
    }

    @Override // tb.hzc
    public void a(Context context, String str, Bundle bundle, Bundle bundle2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1620e46", new Object[]{this, context, str, bundle, bundle2});
            return;
        }
        Nav from = Nav.from(context);
        if (bundle != null) {
            from.withExtras(bundle);
        }
        if (bundle2 != null) {
            from.withOptions(bundle2);
        }
        from.toUri(str);
    }

    @Override // tb.hzc
    public void b(Context context, String str, String str2, Bundle bundle, Bundle bundle2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9a029f3", new Object[]{this, context, str, str2, bundle, bundle2, new Integer(i)});
            return;
        }
        Nav from = Nav.from(context);
        if (bundle != null) {
            from.withExtras(bundle);
        }
        if (bundle2 != null) {
            from.withOptions(bundle2);
        }
        from.withFlags(i);
        if (!(context instanceof Activity) || !n6r.d(context)) {
            from.withClassName(context.getPackageName(), str);
        } else {
            from.withClassName(context.getPackageName(), "com.taobao.tao.welcome.Welcome");
        }
        from.toUri(str2);
    }

    @Override // tb.hzc
    public void e(Context context, String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be6277ce", new Object[]{this, context, str, bundle});
            return;
        }
        Nav from = Nav.from(context);
        if (bundle != null) {
            from.withExtras(bundle);
        }
        from.toUri(str);
    }
}
