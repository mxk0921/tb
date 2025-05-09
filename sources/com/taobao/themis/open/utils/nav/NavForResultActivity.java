package com.taobao.themis.open.utils.nav;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import kotlin.Metadata;
import tb.acq;
import tb.ckf;
import tb.jnj;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/taobao/themis/open/utils/nav/NavForResultActivity;", "Landroid/app/Activity;", "<init>", "()V", "themis_open_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class NavForResultActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(843055407);
    }

    public static /* synthetic */ Object ipc$super(NavForResultActivity navForResultActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else if (hashCode == 1257714799) {
            super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/themis/open/utils/nav/NavForResultActivity");
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        jnj.INSTANCE.b(i, i2, intent);
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        Nav from = Nav.from(this);
        Bundle bundleExtra = getIntent().getBundleExtra("navExtras");
        if (bundleExtra != null) {
            ckf.d(from);
            from.withExtras(bundleExtra);
        }
        Bundle bundleExtra2 = getIntent().getBundleExtra("navOptions");
        if (bundleExtra2 != null) {
            ckf.d(from);
            from.withOptions(bundleExtra2);
        }
        String stringExtra = getIntent().getStringExtra("navCategory");
        if (stringExtra != null) {
            ckf.d(from);
            from.withCategory(stringExtra);
        }
        int intExtra = getIntent().getIntExtra("navResultCode", -1);
        if (intExtra != -1) {
            ckf.d(from);
            from.forResult(intExtra);
        }
        String stringExtra2 = getIntent().getStringExtra("navUri");
        if (from == null || TextUtils.isEmpty(stringExtra2)) {
            finish();
        } else {
            from.toUri(stringExtra2);
        }
    }
}
