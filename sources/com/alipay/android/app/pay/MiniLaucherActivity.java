package com.alipay.android.app.pay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alipay.android.app.pay.AuthTask;
import com.alipay.android.app.pay.RendTask;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.app.selftest.SelfTestManager;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.framework.dns.storage.DnsPreference;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.offline.CashierOperationReceiver;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.pay.results.ResultStatus;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import com.taobao.tao.alipay.export.CashdeskConstants;
import tb.acq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MiniLaucherActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile long e;

    /* renamed from: a  reason: collision with root package name */
    public boolean f3478a = false;
    public PayTask b = null;
    public AuthTask c = null;
    public RendTask d = null;

    public static /* synthetic */ boolean access$002(MiniLaucherActivity miniLaucherActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("611a7b6e", new Object[]{miniLaucherActivity, new Boolean(z)})).booleanValue();
        }
        miniLaucherActivity.f3478a = z;
        return z;
    }

    public static /* synthetic */ Object ipc$super(MiniLaucherActivity miniLaucherActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 323739864:
                super.setRequestedOrientation(((Number) objArr[0]).intValue());
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            case 2136601924:
                return super.getWindow();
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/app/pay/MiniLaucherActivity");
        }
    }

    public final void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
            return;
        }
        try {
            GlobalHelper.getInstance().init(getApplicationContext());
            String stringExtra = intent.getStringExtra(CashdeskConstants.ALIPAY_SIGN_STR);
            String stringExtra2 = intent.getStringExtra(CashierOperationReceiver.PARAMS_EXTEND_PARAMS);
            if (!TextUtils.isEmpty(stringExtra)) {
                c(stringExtra, stringExtra2);
                return;
            }
            String stringExtra3 = intent.getStringExtra("auth_info");
            if (!TextUtils.isEmpty(stringExtra3)) {
                b(stringExtra3);
                return;
            }
            String stringExtra4 = intent.getStringExtra("bizType");
            String stringExtra5 = intent.getStringExtra("data");
            int intExtra = intent.getIntExtra(BaseOuterComponent.b.SOURCE_COMPONENT_ID, -1);
            if (!TextUtils.isEmpty(stringExtra4)) {
                d(stringExtra4, stringExtra5, intExtra);
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            finish();
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

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        synchronized (MiniLaucherActivity.class) {
            try {
                if (SystemClock.elapsedRealtime() - e >= 3000) {
                    e = SystemClock.elapsedRealtime();
                    AuthTask authTask = new AuthTask(this, new AuthTask.OnAuthListener() { // from class: com.alipay.android.app.pay.MiniLaucherActivity.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.alipay.android.app.pay.AuthTask.OnAuthListener
                        public void onAuthSuccess(Context context, String str2, String str3, String str4) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("3e7600e3", new Object[]{this, context, str2, str3, str4});
                                return;
                            }
                            Intent intent = new Intent();
                            intent.putExtra("resultStatus", str2);
                            intent.putExtra("memo", str3);
                            intent.putExtra("result", str4);
                            MiniLaucherActivity.this.setResult(-1, intent);
                            MiniLaucherActivity.access$002(MiniLaucherActivity.this, true);
                            MiniLaucherActivity.this.finish();
                        }

                        @Override // com.alipay.android.app.pay.AuthTask.OnAuthListener
                        public void onAuthFailed(Context context, String str2, String str3, String str4) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("76e32e7b", new Object[]{this, context, str2, str3, str4});
                                return;
                            }
                            Intent intent = new Intent();
                            intent.putExtra("resultStatus", str2);
                            intent.putExtra("memo", str3);
                            intent.putExtra("result", str4);
                            MiniLaucherActivity.this.setResult(0, intent);
                            MiniLaucherActivity.access$002(MiniLaucherActivity.this, true);
                            MiniLaucherActivity.this.finish();
                        }
                    });
                    this.c = authTask;
                    authTask.auth(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(String str, String str2, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba9507", new Object[]{this, str, str2, new Integer(i)});
            return;
        }
        LogUtil.i("MiniLaucherActivity", "doRend", "currentRendTime=" + e + " , SystemClock.elapsedRealtime() =" + SystemClock.elapsedRealtime());
        synchronized (MiniLaucherActivity.class) {
            try {
                if (SystemClock.elapsedRealtime() - e >= 3000) {
                    e = SystemClock.elapsedRealtime();
                    RendTask rendTask = new RendTask(this, new RendTask.OnContainerFinishListener() { // from class: com.alipay.android.app.pay.MiniLaucherActivity.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.alipay.android.app.pay.RendTask.OnContainerFinishListener
                        public void onContainerFinish(Context context, String str3, String str4) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("e4419fc0", new Object[]{this, context, str3, str4});
                                return;
                            }
                            Intent intent = new Intent(MspGlobalDefine.ACTION_REND_FINISH);
                            intent.putExtra("errorCode", str3);
                            intent.putExtra("result", str4);
                            intent.putExtra(BaseOuterComponent.b.SOURCE_COMPONENT_ID, i);
                            MiniLaucherActivity.this.setResult(-1, intent);
                            MiniLaucherActivity.access$002(MiniLaucherActivity.this, true);
                            MiniLaucherActivity.this.finish();
                            LocalBroadcastManager.getInstance(MiniLaucherActivity.this.getApplicationContext()).sendBroadcast(intent);
                        }
                    });
                    this.d = rendTask;
                    rendTask.rend(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.getWindow().requestFeature(1);
        super.onCreate(bundle);
        super.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        super.getWindow().getDecorView().setBackgroundDrawable(new ColorDrawable(0));
        setRequestedOrientation(1);
        SelfTestManager.triggerSelfTestAsync(this);
        try {
            a(getIntent());
        } catch (Throwable unused) {
            finish();
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i == 4) {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.WARNING, "MiniOnBack", String.valueOf(i));
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        a(intent);
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("134be0d8", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            super.setRequestedOrientation(i);
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        if (!this.f3478a) {
            ResultStatus resultStatus = ResultStatus.CANCELED;
            Intent intent = new Intent("com.alipay.android.app.pay.ACTION_PAY_FAILED");
            intent.putExtra("resultStatus", String.valueOf(resultStatus.getStatus()));
            intent.putExtra("memo", resultStatus.getMemo());
            intent.putExtra("result", "");
            setResult(0, intent);
        }
        PayTask payTask = this.b;
        if (payTask != null) {
            payTask.clear();
            this.b = null;
        }
        AuthTask authTask = this.c;
        if (authTask != null) {
            authTask.clear();
            this.c = null;
        }
        RendTask rendTask = this.d;
        if (rendTask != null) {
            rendTask.clear();
            this.d = null;
        }
        super.finish();
    }

    public static boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        for (String str2 : str.split("&")) {
            String[] split = str2.split("=");
            if (split.length == 2 && split[0].equalsIgnoreCase("biz_type") && (split[1].equalsIgnoreCase("\"trade\"") || split[1].equalsIgnoreCase(DnsPreference.KEY_TRADE))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(final java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = com.alipay.android.app.pay.MiniLaucherActivity.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "d9378d7c"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r9
            r5[r1] = r10
            r5[r0] = r11
            r3.ipc$dispatch(r4, r5)
            return
        L_0x0018:
            java.lang.Class<com.alipay.android.app.pay.MiniLaucherActivity> r3 = com.alipay.android.app.pay.MiniLaucherActivity.class
            monitor-enter(r3)
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch: all -> 0x002a
            long r6 = com.alipay.android.app.pay.MiniLaucherActivity.e     // Catch: all -> 0x002a
            long r4 = r4 - r6
            r6 = 3000(0xbb8, double:1.482E-320)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x002d
            monitor-exit(r3)     // Catch: all -> 0x002a
            return
        L_0x002a:
            r10 = move-exception
            goto L_0x00d4
        L_0x002d:
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch: all -> 0x002a
            com.alipay.android.app.pay.MiniLaucherActivity.e = r4     // Catch: all -> 0x002a
            monitor-exit(r3)     // Catch: all -> 0x002a
            com.alipay.android.msp.plugin.engine.IWalletEngine r3 = com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine.getMspWallet()     // Catch: all -> 0x003c
            r3.initConfigManger(r9)     // Catch: all -> 0x003c
            goto L_0x0044
        L_0x003c:
            r3 = move-exception
            java.lang.String r4 = "MiniLaucherActivity"
            java.lang.String r5 = "doPay.initConfigManager"
            com.alipay.android.msp.utils.LogUtil.printExceptionStackTrace(r4, r5, r3)
        L_0x0044:
            java.lang.String r3 = "MiniLaucherActivity"
            java.lang.String r4 = "doPay"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "orderInfo="
            r5.<init>(r6)
            r5.append(r10)
            java.lang.String r6 = " extendParams="
            r5.append(r6)
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            com.alipay.android.msp.utils.LogUtil.i(r3, r4, r5)
            boolean r3 = android.text.TextUtils.isEmpty(r11)     // Catch: all -> 0x0074
            if (r3 != 0) goto L_0x007c
            com.alibaba.fastjson.JSONObject r3 = com.alibaba.fastjson.JSON.parseObject(r11)     // Catch: all -> 0x0074
            java.lang.String r4 = "useStandardSdk"
            boolean r3 = r3.getBooleanValue(r4)     // Catch: all -> 0x0074
            goto L_0x007d
        L_0x0074:
            r3 = move-exception
            java.lang.String r4 = "MiniLaucherActivity"
            java.lang.String r5 = "doPay.parseExtendParams"
            com.alipay.android.msp.utils.LogUtil.printExceptionStackTrace(r4, r5, r3)
        L_0x007c:
            r3 = 0
        L_0x007d:
            if (r3 != 0) goto L_0x00c1
            java.util.List<com.alipay.sdk.data.DynamicConfig$LaunchAppSwitchItem> r3 = com.alipay.sdk.app.RegionUtils.defaultItems
            com.alipay.android.msp.framework.drm.DrmManager r4 = com.alipay.android.msp.framework.drm.DrmManager.getInstance(r9)
            java.lang.String r5 = "gray_to_alipaysdk_231221"
            boolean r4 = r4.isGray(r5, r2, r9)
            if (r4 == 0) goto L_0x00a4
            com.alipay.sdk.sys.BizContext r4 = new com.alipay.sdk.sys.BizContext
            java.lang.String r5 = "pay"
            r4.<init>(r9, r10, r5)
            boolean r3 = com.alipay.sdk.util.Utils.isExistAnyExpectedPackage(r4, r9, r3)
            if (r3 == 0) goto L_0x00a4
            boolean r3 = e(r10)
            if (r3 == 0) goto L_0x00a4
            r3 = 1
            goto L_0x00a5
        L_0x00a4:
            r3 = 0
        L_0x00a5:
            if (r3 == 0) goto L_0x00a8
            goto L_0x00c1
        L_0x00a8:
            com.alipay.android.msp.utils.LogAgent.onPayStart()
            com.alipay.android.app.pay.PayTask r3 = new com.alipay.android.app.pay.PayTask
            com.alipay.android.app.pay.MiniLaucherActivity$3 r4 = new com.alipay.android.app.pay.MiniLaucherActivity$3
            r4.<init>()
            r3.<init>(r9, r4)
            r9.b = r3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r10
            r0[r1] = r11
            r3.execute(r0)
            return
        L_0x00c1:
            java.lang.Thread r11 = new java.lang.Thread
            com.alipay.android.app.pay.MiniLaucherActivity$4 r0 = new com.alipay.android.app.pay.MiniLaucherActivity$4
            r0.<init>()
            r11.<init>(r0)
            java.lang.String r10 = "MiniLauncherPayThread"
            r11.setName(r10)
            com.alipay.android.msp.framework.taskscheduler.TaskHelper.execute(r11)
            return
        L_0x00d4:
            monitor-exit(r3)     // Catch: all -> 0x002a
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.app.pay.MiniLaucherActivity.c(java.lang.String, java.lang.String):void");
    }
}
