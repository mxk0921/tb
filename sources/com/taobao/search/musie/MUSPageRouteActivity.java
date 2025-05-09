package com.taobao.search.musie;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.acq;
import tb.hwh;
import tb.o4p;
import tb.r4p;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MUSPageRouteActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f11559a = r4p.KEY_POP_UP;

    public static /* synthetic */ Object ipc$super(MUSPageRouteActivity mUSPageRouteActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/musie/MUSPageRouteActivity");
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        if (o4p.i1()) {
            Intent intent = new Intent(this, MUSPageActivity.class);
            intent.setData(getIntent().getData());
            startActivity(intent);
            finish();
            return;
        }
        Uri data = getIntent().getData();
        if (data == null) {
            finish();
            return;
        }
        if (hwh.INSTANCE.a(data)) {
            data = data.buildUpon().appendQueryParameter("isPreload", "true").build();
        }
        if (!data.getBooleanQueryParameter(f11559a, false)) {
            Intent intent2 = new Intent(this, MUSPageActivity.class);
            intent2.setData(data);
            startActivity(intent2);
        } else {
            Intent intent3 = new Intent(this, MUSPopPageActivity.class);
            intent3.setData(data);
            startActivity(intent3);
            overridePendingTransition(0, 0);
        }
        finish();
    }

    static {
        t2o.a(815792626);
    }
}
