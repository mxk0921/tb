package com.taobao.mytaobao.newsetting;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.schedule.ViewProxy;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.tao.TaobaoApplication;
import com.taobao.taobao.R;
import tb.acq;
import tb.j9t;
import tb.r0k;
import tb.t2o;
import tb.ulp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class VideoAutoPlaySettingActivity extends CustomBaseActivity implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public View f11242a;
    public View b;
    public View c;
    public j9t d;

    static {
        t2o.a(745537807);
    }

    public VideoAutoPlaySettingActivity() {
        ApplicationInvoker.getInstance("com.taobao.mytaobao").invoke("com.taobao.tao.MytaobaoApplication", TaobaoApplication.sApplication);
    }

    public static /* synthetic */ Object ipc$super(VideoAutoPlaySettingActivity videoAutoPlaySettingActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/mytaobao/newsetting/VideoAutoPlaySettingActivity");
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        int id = view.getId();
        if (id == R.id.mobile_flow_and_WIFI_rl) {
            l3(1);
        } else if (id == R.id.only_WIFI_rl) {
            l3(0);
        } else if (id == R.id.close_rl) {
            l3(2);
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.layout_video_auto_play_setting);
        getSupportActionBar().setTitle(getString(R.string.setting_general_video_play_title));
        View findViewById = findViewById(R.id.mobile_flow_and_WIFI_rl);
        View findViewById2 = findViewById(R.id.only_WIFI_rl);
        View findViewById3 = findViewById(R.id.close_rl);
        ViewProxy.setOnClickListener(findViewById, this);
        ViewProxy.setOnClickListener(findViewById2, this);
        ViewProxy.setOnClickListener(findViewById3, this);
        this.f11242a = findViewById(R.id.icon_select_mobile_and_wifi);
        this.b = findViewById(R.id.icon_select_only_wifi);
        this.c = findViewById(R.id.icon_select_close);
        this.d = j9t.e(getApplicationContext(), "mytaobao");
        if (ulp.c(getApplicationContext()).a("Global_App_Video_Play_Network_Type")) {
            i = this.d.b().e(0);
        } else {
            i = this.d.b().e(1);
        }
        l3(i);
    }

    public final void l3(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a3dc21e", new Object[]{this, new Integer(i)});
        } else if (i == 1) {
            this.f11242a.setVisibility(0);
            this.b.setVisibility(8);
            this.c.setVisibility(8);
            this.d.c().b(1);
            r0k.P("video", 1);
            TBS.Adv.ctrlClicked("Page_TBGeneralSettingVC", CT.Button, "VideoPlay-allon");
        } else if (i != 2) {
            this.f11242a.setVisibility(8);
            this.b.setVisibility(0);
            this.c.setVisibility(8);
            this.d.c().b(0);
            r0k.P("video", 0);
            TBS.Adv.ctrlClicked("Page_TBGeneralSettingVC", CT.Button, "VideoPlay-WIFI");
        } else {
            this.f11242a.setVisibility(8);
            this.b.setVisibility(8);
            this.c.setVisibility(0);
            this.d.c().b(2);
            r0k.P("video", 2);
            TBS.Adv.ctrlClicked("Page_TBGeneralSettingVC", CT.Button, "VideoPlay-alloff");
        }
    }
}
