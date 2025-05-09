package com.taobao.android.nav;

import android.net.Uri;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.lifecycle.PanguActivity;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class NavRouterActivity extends PanguActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(775946290);
    }

    public static /* synthetic */ Object ipc$super(NavRouterActivity navRouterActivity, String str, Object... objArr) {
        if (str.hashCode() == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nav/NavRouterActivity");
    }

    public Uri l3(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("3d306e7a", new Object[]{this, uri});
        }
        String fragment = uri.getFragment();
        if (fragment == null || !fragment.startsWith("!/")) {
            return null;
        }
        return uri.buildUpon().fragment(null).path(fragment.substring(1)).build();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Uri l3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        finish();
        Uri data = getIntent().getData();
        if (data != null && data.isHierarchical() && (l3 = l3(data)) != null) {
            Nav.from(this).disallowLoopback().toUri(l3);
        }
    }
}
