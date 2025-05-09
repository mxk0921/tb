package com.taobao.themis.widget.group;

import android.content.Context;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.net.URLDecoder;
import kotlin.Metadata;
import tb.acq;
import tb.ckf;
import tb.ies;
import tb.t2o;
import tb.yes;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/taobao/themis/widget/group/WidgetPreviewActivity;", "Landroidx/fragment/app/FragmentActivity;", "<init>", "()V", "themis_widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class WidgetPreviewActivity extends FragmentActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public yes f13815a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements yes.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.yes.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edfb8375", new Object[]{this});
            } else {
                TMSLogger.b("TestActivity", "renderSuccess");
            }
        }

        @Override // tb.yes.a
        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("313409ce", new Object[]{this, str, str2});
                return;
            }
            ckf.g(str, "errorCode");
            ckf.g(str2, "errorMsg");
            TMSLogger.b("TestActivity", "renderError");
        }
    }

    static {
        t2o.a(852492346);
    }

    public static /* synthetic */ Object ipc$super(WidgetPreviewActivity widgetPreviewActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/widget/group/WidgetPreviewActivity");
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

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String decode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setContentView(frameLayout);
        String c = ies.c(getIntent().getStringExtra("oriUrl"), "piUrl");
        String str = "https://dev.weex.alibaba-inc.com/build/u/kjhwwmdc/mggj0o9xqc90?wh_weex=true&weex_mode=dom";
        if (!(c == null || (decode = URLDecoder.decode(c, "UTF-8")) == null)) {
            str = decode;
        }
        yes yesVar = new yes(this, str, new a());
        this.f13815a = yesVar;
        frameLayout.addView(yesVar.h());
        yes yesVar2 = this.f13815a;
        if (yesVar2 != null) {
            yesVar2.l(null);
        } else {
            ckf.y("mGroupInstance");
            throw null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        yes yesVar = this.f13815a;
        if (yesVar != null) {
            yesVar.e();
        } else {
            ckf.y("mGroupInstance");
            throw null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        yes yesVar = this.f13815a;
        if (yesVar != null) {
            yesVar.j();
        } else {
            ckf.y("mGroupInstance");
            throw null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        yes yesVar = this.f13815a;
        if (yesVar != null) {
            yesVar.k();
        } else {
            ckf.y("mGroupInstance");
            throw null;
        }
    }
}
