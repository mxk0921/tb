package com.taobao.taobao.setting;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.taobao.mulitenv.EnvironmentSwitcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridInstanceRenderMode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexErrorType;
import com.taobao.android.weex.WeexEventTarget;
import com.taobao.android.weex.WeexInstance;
import com.taobao.taobao.R;
import tb.acq;
import tb.j6x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class WeexSettingContainerActivity extends AppCompatActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int RESULT_CODE_SIGNED = 1000;
    public static final int RESULT_CODE_UNSIGNED = 1001;
    public static final String RESULT_URL_SIGNED;
    public static final String RESULT_URL_UNSIGNED;
    public static final String SETTING_PAGE_URL;
    public WeexInstance I0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements j6x {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FrameLayout f12957a;

        public a(WeexSettingContainerActivity weexSettingContainerActivity, FrameLayout frameLayout) {
            this.f12957a = frameLayout;
        }

        @Override // tb.j6x
        public void E1(WeexInstance weexInstance, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f794a71b", new Object[]{this, weexInstance, new Boolean(z)});
            }
        }

        @Override // tb.j6x
        public void H0(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99cc9148", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
            }
        }

        @Override // tb.j6x
        public void I1(WeexInstance weexInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("68c948df", new Object[]{this, weexInstance});
            }
        }

        @Override // tb.j6x
        public void K0(WeexInstance weexInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad8178b2", new Object[]{this, weexInstance});
            }
        }

        @Override // tb.j6x
        public void K1(WeexInstance weexInstance, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a414e261", new Object[]{this, weexInstance, new Boolean(z)});
                return;
            }
            if (weexInstance.getRootView().getParent() instanceof ViewGroup) {
                ((ViewGroup) weexInstance.getRootView().getParent()).removeView(weexInstance.getRootView());
            }
            this.f12957a.addView(weexInstance.getRootView());
        }

        @Override // tb.j6x
        public void d2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a7821b2", new Object[]{this, weexInstance, weexErrorType, str});
            }
        }

        @Override // tb.j6x
        public void e2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52b846bb", new Object[]{this, weexInstance, weexErrorType, str});
            }
        }

        @Override // tb.j6x
        public void l2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("55726f6d", new Object[]{this, weexInstance, weexErrorType, str});
            }
        }

        @Override // tb.j6x
        public void z1(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bee002", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
            }
        }
    }

    static {
        String str;
        String str2;
        String str3;
        if (EnvironmentSwitcher.a() == 0) {
            str = "http://market.m.taobao.com/apps/market/trade/aviodpay.html?wh_weex=true&requestType=unsign&signType=no_password_pay&signScene=taobao";
        } else {
            str = "http://market.wapa.taobao.com/apps/market/trade/aviodpay.html?wh_weex=true&requestType=unsign&signType=no_password_pay&signScene=taobao";
        }
        RESULT_URL_UNSIGNED = str;
        if (EnvironmentSwitcher.a() == 0) {
            str2 = "http://market.m.taobao.com/apps/market/trade/aviodpay.html?wh_weex=true&requestType=sign&signType=no_password_pay&signScene=taobao";
        } else {
            str2 = "http://market.wapa.taobao.com/apps/market/trade/aviodpay.html?wh_weex=true&requestType=sign&signType=no_password_pay&signScene=taobao";
        }
        RESULT_URL_SIGNED = str2;
        if (EnvironmentSwitcher.a() == 0) {
            str3 = "https://meta.m.taobao.com/app/tb-trade/pay-setting/home?wh_weex=true&wx_opaque=0&weex_mode=dom&wx_navbar_hidden=true&wx_navbar_transparent=true&_wx_statusbar_hidden=true";
        } else {
            str3 = "https://meta.wapa.taobao.com/app/tb-trade/pay-setting/home?wh_weex=true&wx_opaque=0&weex_mode=dom&wx_navbar_hidden=true&wx_navbar_transparent=true&_wx_statusbar_hidden=true";
        }
        SETTING_PAGE_URL = str3;
    }

    public static /* synthetic */ Object ipc$super(WeexSettingContainerActivity weexSettingContainerActivity, String str, Object... objArr) {
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
            case 188604040:
                super.onStop();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/setting/WeexSettingContainerActivity");
        }
    }

    public static void n(Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bed35a6c", new Object[]{activity, new Boolean(z)});
            return;
        }
        View decorView = activity.getWindow().getDecorView();
        if (z) {
            decorView.setSystemUiVisibility(9216);
        } else {
            decorView.setSystemUiVisibility(1280);
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

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d73f6498", new Object[]{this});
        } else {
            this.I0.dispatchEvent(WeexEventTarget.WINDOW_TARGET, "refreshPage", null);
        }
    }

    public void o(boolean z, boolean z2) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ea65944", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        if (!z) {
            i = 5892;
        } else {
            i = 5888;
        }
        if (!z2) {
            i |= 2;
        }
        getWindow().getDecorView().setSystemUiVisibility(i);
        p(0);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.I0.destroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        this.I0.onActivityPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        this.I0.onActivityResume();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        this.I0.onActivityStart();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        this.I0.onActivityStop();
    }

    public void p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bcbc3a1", new Object[]{this, new Integer(i)});
            return;
        }
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setNavigationBarColor(i);
        getWindow().setStatusBarColor(i);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_weex_setting_container);
        o(true, true);
        n(this, true);
        this.I0 = com.alibaba.android.ultron.vfw.weex2.a.g().f(this, SETTING_PAGE_URL, UltronTradeHybridInstanceRenderMode.SURFACE);
        this.I0.addInstanceListener(new a(this, (FrameLayout) findViewById(R.id.weex_container)));
        this.I0.render(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
        if (r6.getBoolean("cancel").booleanValue() != false) goto L_0x0045;
     */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onActivityResult(int r5, int r6, android.content.Intent r7) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.taobao.setting.WeexSettingContainerActivity.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0025
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r5)
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r6)
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r1] = r4
            r6[r0] = r3
            r0 = 2
            r6[r0] = r5
            r5 = 3
            r6[r5] = r7
            java.lang.String r5 = "4af7346f"
            r2.ipc$dispatch(r5, r6)
            return
        L_0x0025:
            super.onActivityResult(r5, r6, r7)
            java.lang.String r6 = "result"
            java.lang.String r6 = r7.getStringExtra(r6)     // Catch: Exception -> 0x0042
            com.alibaba.fastjson.JSONObject r6 = com.alibaba.fastjson.JSON.parseObject(r6)     // Catch: Exception -> 0x0042
            if (r6 == 0) goto L_0x0044
            java.lang.String r7 = "cancel"
            java.lang.Boolean r6 = r6.getBoolean(r7)     // Catch: Exception -> 0x0042
            boolean r6 = r6.booleanValue()     // Catch: Exception -> 0x0042
            if (r6 == 0) goto L_0x0044
            goto L_0x0045
        L_0x0042:
            goto L_0x0046
        L_0x0044:
            r0 = 0
        L_0x0045:
            r1 = r0
        L_0x0046:
            r4.m()
            if (r1 != 0) goto L_0x005b
            r6 = 1000(0x3e8, float:1.401E-42)
            if (r5 != r6) goto L_0x0052
            java.lang.String r5 = com.taobao.taobao.setting.WeexSettingContainerActivity.RESULT_URL_SIGNED
            goto L_0x0054
        L_0x0052:
            java.lang.String r5 = com.taobao.taobao.setting.WeexSettingContainerActivity.RESULT_URL_UNSIGNED
        L_0x0054:
            com.taobao.android.nav.Nav r6 = com.taobao.android.nav.Nav.from(r4)
            r6.toUri(r5)
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taobao.setting.WeexSettingContainerActivity.onActivityResult(int, int, android.content.Intent):void");
    }
}
