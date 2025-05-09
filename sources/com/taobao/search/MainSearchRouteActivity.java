package com.taobao.search;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.search.common.SearchSdk;
import com.taobao.tao.util.NavUrls;
import java.util.Set;
import org.android.agoo.common.AgooConstants;
import tb.acq;
import tb.ckf;
import tb.o4p;
import tb.r4p;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class MainSearchRouteActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792138);
    }

    public static /* synthetic */ Object ipc$super(MainSearchRouteActivity mainSearchRouteActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/MainSearchRouteActivity");
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
    public void onCreate(Bundle bundle) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        SearchSdk.Companion.b();
        super.onCreate(bundle);
        Intent intent = getIntent();
        Uri data = intent != null ? intent.getData() : null;
        if (data == null) {
            finish();
            return;
        }
        String queryParameter = data.getQueryParameter("q");
        String queryParameter2 = data.getQueryParameter(r4p.KEY_POP_UP);
        if (TextUtils.isEmpty(queryParameter)) {
            str = NavUrls.NAV_URL_SEARCH_HOME;
        } else {
            str = "https://s.m.taobao.com/h5";
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        Set<String> queryParameterNames = data.getQueryParameterNames();
        ckf.d(queryParameterNames);
        if (!queryParameterNames.isEmpty()) {
            for (String str2 : queryParameterNames) {
                if (!TextUtils.isEmpty(str2)) {
                    String queryParameter3 = data.getQueryParameter(str2);
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        buildUpon.appendQueryParameter(str2, queryParameter3);
                    }
                }
            }
        }
        if (!TextUtils.equals(queryParameter2, "true") || !o4p.o1()) {
            Nav.from(this).toUri(buildUpon.build());
            finish();
            return;
        }
        buildUpon.appendQueryParameter(r4p.KEY_G_POP_UP, "true");
        Nav.from(this).withAction(AgooConstants.MESSAGE_POPUP).withExtras(getIntent().getExtras()).disableTransition().toUri(buildUpon.build());
        finish();
        overridePendingTransition(0, 0);
    }
}
