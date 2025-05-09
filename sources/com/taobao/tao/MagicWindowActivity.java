package com.taobao.tao;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.taobao.mulitenv.EnvironmentSwitcher;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.weexv2.page.WeexV2Activity;
import tb.acq;
import tb.m7r;
import tb.qj4;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MagicWindowActivity extends WeexV2Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(775946320);
    }

    public static /* synthetic */ Object ipc$super(MagicWindowActivity magicWindowActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/MagicWindowActivity");
        }
    }

    @Override // com.taobao.weex.weexv2.page.WeexV2Activity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    public final String l3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("efc3ccd7", new Object[]{this});
        }
        if (EnvironmentSwitcher.EnvType.OnLINE.getValue() == EnvironmentSwitcher.a()) {
            return "https://meta.m.taobao.com/app/tbhome/iconsecondfloor/all?wh_weex=true&weex_mode=dom&wx_navbar_hidden=true&_wx_statusbar_hidden=true&wx_navbar_transparent=true&hide_back=true";
        }
        return "https://meta.wapa.taobao.com/app/tbhome/iconsecondfloor/all?wh_weex=true&weex_mode=dom&wx_navbar_hidden=true&_wx_statusbar_hidden=true&wx_navbar_transparent=true&hide_back=true";
    }

    @Override // com.taobao.weex.weexv2.page.WeexV2Activity, com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        String l3 = l3();
        Uri build = Uri.parse(l3).buildUpon().appendQueryParameter(m7r.WEEX_REFERER_ORIGIN, l3).build();
        Intent intent = getIntent();
        intent.setData(build);
        intent.putExtra(qj4.c, l3);
        intent.putExtra(qj4.e, l3);
        intent.putExtra(qj4.d, l3);
        setIntent(intent);
        super.onCreate(bundle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
    }
}
