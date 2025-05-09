package com.alipay.sdk.util;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.alipay.android.app.IAlixPay;
import com.alipay.android.app.IRemoteServiceCallback;
import com.alipay.android.msp.ui.views.MspBaseActivity;
import com.alipay.sdk.app.statistic.StatisticManager;
import com.alipay.sdk.app.statistic.StatisticRecord;
import com.alipay.sdk.data.DynamicConfig;
import com.alipay.sdk.sys.BizContext;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class PayHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIND_FAILED = "failed";
    public static final String SCHEME_FAILED = "scheme_failed";

    /* renamed from: a  reason: collision with root package name */
    public Activity f4539a;
    public volatile IAlixPay b;
    public boolean d;
    public IAlipayBindListener e;
    public final BizContext f;
    public final Object c = IAlixPay.class;
    public String g = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class AlipayServiceConnection implements ServiceConnection {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AlipayServiceConnection() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                return;
            }
            StatisticManager.putAction(PayHelper.access$300(PayHelper.this), "biz", "srvCon");
            synchronized (PayHelper.access$600(PayHelper.this)) {
                PayHelper.access$502(PayHelper.this, IAlixPay.Stub.asInterface(iBinder));
                PayHelper.access$600(PayHelper.this).notify();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                return;
            }
            StatisticManager.putAction(PayHelper.access$300(PayHelper.this), "biz", "srvDis");
            PayHelper.access$502(PayHelper.this, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface IAlipayBindListener {
        void onBinded();

        void onStartActivity();
    }

    public PayHelper(Activity activity, BizContext bizContext, IAlipayBindListener iAlipayBindListener) {
        this.f4539a = activity;
        this.f = bizContext;
        this.e = iAlipayBindListener;
    }

    public static /* synthetic */ String access$202(PayHelper payHelper, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("407830c5", new Object[]{payHelper, str});
        }
        payHelper.g = str;
        return str;
    }

    public static /* synthetic */ BizContext access$300(PayHelper payHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BizContext) ipChange.ipc$dispatch("19930ff9", new Object[]{payHelper});
        }
        return payHelper.f;
    }

    public static /* synthetic */ Activity access$400(PayHelper payHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("e9758917", new Object[]{payHelper});
        }
        return payHelper.f4539a;
    }

    public static /* synthetic */ IAlixPay access$502(PayHelper payHelper, IAlixPay iAlixPay) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAlixPay) ipChange.ipc$dispatch("81c61710", new Object[]{payHelper, iAlixPay});
        }
        payHelper.b = iAlixPay;
        return iAlixPay;
    }

    public static /* synthetic */ Object access$600(PayHelper payHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("4993ffa3", new Object[]{payHelper});
        }
        return payHelper.c;
    }

    public static /* synthetic */ IAlipayBindListener access$700(PayHelper payHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAlipayBindListener) ipChange.ipc$dispatch("d4ddb58a", new Object[]{payHelper});
        }
        return payHelper.e;
    }

    public static boolean c(String str, Context context, BizContext bizContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9bbb625", new Object[]{str, context, bizContext})).booleanValue();
        }
        try {
            Intent intent = new Intent();
            intent.setClassName(str, "com.alipay.android.app.flybird.ui.window.FlyBirdWindowActivity");
            if (intent.resolveActivityInfo(context.getPackageManager(), 0) != null) {
                return true;
            }
            StatisticManager.putAction(bizContext, "biz", "BSADetectFail");
            return false;
        } catch (Throwable th) {
            StatisticManager.putError(bizContext, "biz", "BSADetectFail", th);
            return false;
        }
    }

    public void clearContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a713a29", new Object[]{this});
            return;
        }
        this.f4539a = null;
        this.e = null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:35:0x010d
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:90)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public final java.lang.String d(java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.util.PayHelper.d(java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String pay4Client(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "biz"
            com.android.alibaba.ip.runtime.IpChange r1 = com.alipay.sdk.util.PayHelper.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x001a
            java.lang.String r0 = "7991fad8"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r7
            r3 = 1
            r2[r3] = r8
            java.lang.Object r8 = r1.ipc$dispatch(r0, r2)
            java.lang.String r8 = (java.lang.String) r8
            return r8
        L_0x001a:
            java.lang.String r1 = ""
            r2 = 0
            java.util.List<com.alipay.sdk.data.DynamicConfig$LaunchAppSwitchItem> r3 = com.alipay.sdk.app.RegionUtils.defaultItems     // Catch: all -> 0x0072
            com.alipay.sdk.sys.BizContext r4 = r7.f     // Catch: all -> 0x0072
            android.app.Activity r5 = r7.f4539a     // Catch: all -> 0x0072
            com.alipay.sdk.util.Utils$ExpectedPkg r3 = com.alipay.sdk.util.Utils.getExpectedPkg(r4, r5, r3)     // Catch: all -> 0x0072
            java.lang.String r4 = "failed"
            if (r3 == 0) goto L_0x006a
            com.alipay.sdk.sys.BizContext r5 = r7.f     // Catch: all -> 0x004a
            boolean r5 = r3.isSignIllegal(r5)     // Catch: all -> 0x004a
            if (r5 != 0) goto L_0x006a
            boolean r5 = r3.isVersionIllegal()     // Catch: all -> 0x004a
            if (r5 == 0) goto L_0x003a
            goto L_0x006a
        L_0x003a:
            android.content.pm.PackageInfo r5 = r3.pkgInfo     // Catch: all -> 0x004a
            boolean r5 = com.alipay.sdk.util.Utils.isAlipay1015ErrorVersion(r5)     // Catch: all -> 0x004a
            if (r5 == 0) goto L_0x004c
            com.alipay.sdk.sys.BizContext r5 = r7.f     // Catch: all -> 0x004a
            java.lang.String r6 = "PkgExcludeVersion"
            com.alipay.sdk.app.statistic.StatisticManager.putAction(r5, r0, r6)     // Catch: all -> 0x004a
            return r4
        L_0x004a:
            r4 = move-exception
            goto L_0x0074
        L_0x004c:
            android.content.pm.PackageInfo r4 = r3.pkgInfo     // Catch: all -> 0x004a
            if (r4 == 0) goto L_0x0060
            java.lang.String r5 = "com.eg.android.AlipayGphone"
            java.lang.String r4 = r4.packageName     // Catch: all -> 0x004a
            boolean r4 = r5.equals(r4)     // Catch: all -> 0x004a
            if (r4 == 0) goto L_0x005b
            goto L_0x0060
        L_0x005b:
            android.content.pm.PackageInfo r4 = r3.pkgInfo     // Catch: all -> 0x004a
            java.lang.String r1 = r4.packageName     // Catch: all -> 0x004a
            goto L_0x0064
        L_0x0060:
            java.lang.String r1 = com.alipay.sdk.util.Utils.getAlipayPkgName()     // Catch: all -> 0x004a
        L_0x0064:
            android.content.pm.PackageInfo r0 = r3.pkgInfo     // Catch: all -> 0x004a
            if (r0 == 0) goto L_0x007b
            r2 = r0
            goto L_0x007b
        L_0x006a:
            com.alipay.sdk.sys.BizContext r5 = r7.f     // Catch: all -> 0x004a
            java.lang.String r6 = "PkgIllegal"
            com.alipay.sdk.app.statistic.StatisticManager.putAction(r5, r0, r6)     // Catch: all -> 0x004a
            return r4
        L_0x0072:
            r4 = move-exception
            r3 = r2
        L_0x0074:
            com.alipay.sdk.sys.BizContext r5 = r7.f
            java.lang.String r6 = "CheckClientSignEx"
            com.alipay.sdk.app.statistic.StatisticManager.putError(r5, r0, r6, r4)
        L_0x007b:
            java.lang.String r8 = r7.b(r8, r1, r2, r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.util.PayHelper.pay4Client(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:15|(3:(3:91|17|(12:19|(14:21|22|97|23|24|(1:29)|31|89|38|39|40|(1:42)(1:44)|95|45)(1:33)|34|35|36|89|38|39|40|(0)(0)|95|45))|95|45)|37|89|38|39|40|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0119, code lost:
        r17 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014f A[Catch: all -> 0x0174, TryCatch #1 {all -> 0x0174, blocks: (B:54:0x0149, B:56:0x014f, B:58:0x0159, B:60:0x0161), top: B:87:0x0149 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String b(java.lang.String r21, java.lang.String r22, android.content.pm.PackageInfo r23, com.alipay.sdk.util.Utils.ExpectedPkg r24) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.util.PayHelper.b(java.lang.String, java.lang.String, android.content.pm.PackageInfo, com.alipay.sdk.util.Utils$ExpectedPkg):java.lang.String");
    }

    public final Pair<String, Boolean> a(String str, String str2, BizContext bizContext) {
        int i;
        boolean z;
        AlipayServiceCallback alipayServiceCallback;
        Throwable th;
        Activity activity;
        Activity activity2;
        String Pay;
        Activity activity3;
        Activity activity4;
        Context.BindServiceFlags of;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("e890945", new Object[]{this, str, str2, bizContext});
        }
        Intent intent = new Intent();
        intent.setPackage(str2);
        intent.setAction(Utils.getAlipayServiceActionName(str2));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        StringBuilder sb = new StringBuilder();
        sb.append(elapsedRealtime);
        sb.append("|");
        sb.append(str != null ? str.length() : 0);
        StatisticManager.putAction(bizContext, "biz", StatisticRecord.EC_PROGRESS_BIND_STARTING, sb.toString());
        try {
            if (DynamicConfig.isFalse("degrade_start_srv_first")) {
                ComponentName startService = this.f4539a.getApplication().startService(intent);
                if (startService != null) {
                    str3 = startService.getPackageName();
                } else {
                    str3 = "null";
                }
                StatisticManager.putAction(bizContext, "biz", "stSrv", str3);
            } else {
                StatisticManager.putAction(bizContext, "biz", "stSrv", "skipped");
            }
            if (DynamicConfig.isFalse("degrade_bind_use_imp")) {
                StatisticManager.putAction(bizContext, "biz", "bindFlg", "imp");
                i = 65;
            } else {
                i = 1;
            }
            AlipayServiceConnection alipayServiceConnection = new AlipayServiceConnection();
            if (Build.VERSION.SDK_INT < 34 || !DynamicConfig.isFalse("degrade_bind_use_allow_activity_starts")) {
                z = this.f4539a.getApplicationContext().bindService(intent, alipayServiceConnection, i);
            } else {
                of = Context.BindServiceFlags.of(i | 512);
                StatisticManager.putAction(bizContext, "biz", "bindFlg", "allow_activity_starts");
                z = this.f4539a.getApplicationContext().bindService(intent, alipayServiceConnection, of);
            }
            if (z) {
                synchronized (this.c) {
                    if (this.b == null) {
                        try {
                            this.c.wait(15000L);
                        } catch (InterruptedException e) {
                            StatisticManager.putError(bizContext, "biz", StatisticRecord.EC_BIND_WAIT_TIMEOUT_EX, e);
                        }
                    }
                }
                IAlixPay iAlixPay = this.b;
                try {
                    if (iAlixPay == null) {
                        StatisticManager.putError(bizContext, "biz", StatisticRecord.EC_BIND_TIMEOUT);
                        Pair<String, Boolean> pair = new Pair<>("failed", Boolean.TRUE);
                        try {
                            this.f4539a.getApplicationContext().unbindService(alipayServiceConnection);
                        } catch (Throwable th2) {
                            LogUtils.printExceptionStackTrace(th2);
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(SystemClock.elapsedRealtime());
                        StatisticManager.putAction(bizContext, "biz", StatisticRecord.EC_PROGRESS_BIND_ENDED, sb2.toString());
                        this.b = null;
                        if (this.d && (activity4 = this.f4539a) != null) {
                            activity4.setRequestedOrientation(0);
                            this.d = false;
                        }
                        return pair;
                    }
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    StatisticManager.putAction(bizContext, "biz", StatisticRecord.EC_PROGRESS_BINDED, String.valueOf(elapsedRealtime2));
                    IAlipayBindListener iAlipayBindListener = this.e;
                    if (iAlipayBindListener != null) {
                        iAlipayBindListener.onBinded();
                    }
                    if (this.f4539a.getRequestedOrientation() == 0) {
                        this.f4539a.setRequestedOrientation(1);
                        this.d = true;
                    }
                    int version = iAlixPay.getVersion();
                    alipayServiceCallback = new AlipayServiceCallback();
                    try {
                        if (version >= 3) {
                            iAlixPay.registerCallback03(alipayServiceCallback, str, null);
                        } else {
                            iAlixPay.registerCallback(alipayServiceCallback);
                        }
                        long elapsedRealtime3 = SystemClock.elapsedRealtime();
                        StatisticManager.putAction(bizContext, "biz", StatisticRecord.EC_PROGRESS_BIND_PAY, String.valueOf(elapsedRealtime3));
                        if (version >= 3) {
                            iAlixPay.r03("biz", "bind_pay", null);
                        }
                        if (version >= 2) {
                            HashMap<String, String> generateApInfo = BizContext.generateApInfo(bizContext);
                            generateApInfo.put("ts_bind", String.valueOf(elapsedRealtime));
                            generateApInfo.put("ts_bend", String.valueOf(elapsedRealtime2));
                            generateApInfo.put("ts_pay", String.valueOf(elapsedRealtime3));
                            Pay = iAlixPay.pay02(str, generateApInfo);
                        } else {
                            Pay = iAlixPay.Pay(str);
                        }
                        try {
                            iAlixPay.unregisterCallback(alipayServiceCallback);
                        } catch (Throwable th3) {
                            LogUtils.printExceptionStackTrace(th3);
                        }
                        try {
                            this.f4539a.getApplicationContext().unbindService(alipayServiceConnection);
                        } catch (Throwable th4) {
                            LogUtils.printExceptionStackTrace(th4);
                        }
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(SystemClock.elapsedRealtime());
                        StatisticManager.putAction(bizContext, "biz", StatisticRecord.EC_PROGRESS_BIND_ENDED, sb3.toString());
                        this.b = null;
                        if (this.d && (activity3 = this.f4539a) != null) {
                            activity3.setRequestedOrientation(0);
                            this.d = false;
                        }
                        return new Pair<>(Pay, Boolean.FALSE);
                    } catch (Throwable th5) {
                        th = th5;
                        try {
                            StatisticManager.putError(bizContext, "biz", StatisticRecord.EC_BIND_FAILED, th);
                            Pair<String, Boolean> pair2 = new Pair<>("failed", Boolean.TRUE);
                            if (alipayServiceCallback != null) {
                                try {
                                    iAlixPay.unregisterCallback(alipayServiceCallback);
                                } catch (Throwable th6) {
                                    LogUtils.printExceptionStackTrace(th6);
                                }
                            }
                            try {
                                this.f4539a.getApplicationContext().unbindService(alipayServiceConnection);
                            } catch (Throwable th7) {
                                LogUtils.printExceptionStackTrace(th7);
                            }
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(SystemClock.elapsedRealtime());
                            StatisticManager.putAction(bizContext, "biz", StatisticRecord.EC_PROGRESS_BIND_ENDED, sb4.toString());
                            this.b = null;
                            if (this.d && (activity2 = this.f4539a) != null) {
                                activity2.setRequestedOrientation(0);
                                this.d = false;
                            }
                            return pair2;
                        } catch (Throwable th8) {
                            if (alipayServiceCallback != null) {
                                try {
                                    iAlixPay.unregisterCallback(alipayServiceCallback);
                                } catch (Throwable th9) {
                                    LogUtils.printExceptionStackTrace(th9);
                                }
                            }
                            try {
                                this.f4539a.getApplicationContext().unbindService(alipayServiceConnection);
                            } catch (Throwable th10) {
                                LogUtils.printExceptionStackTrace(th10);
                            }
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(SystemClock.elapsedRealtime());
                            StatisticManager.putAction(bizContext, "biz", StatisticRecord.EC_PROGRESS_BIND_ENDED, sb5.toString());
                            this.b = null;
                            if (this.d && (activity = this.f4539a) != null) {
                                activity.setRequestedOrientation(0);
                                this.d = false;
                            }
                            throw th8;
                        }
                    }
                } catch (Throwable th11) {
                    th = th11;
                    alipayServiceCallback = null;
                }
            } else {
                throw new Throwable("bindService fail");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class AlipayServiceCallback extends IRemoteServiceCallback.Stub {
        private AlipayServiceCallback() {
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public int getVersion() throws RemoteException {
            return 3;
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public boolean isHideLoadingScreen() throws RemoteException {
            return false;
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public void r03(String str, String str2, Map map) throws RemoteException {
            StatisticManager.putAction(PayHelper.access$300(PayHelper.this), StatisticRecord.ET_WLT, str, str2);
            if (TextUtils.equals(str2, "ActivityStartSuccess") && PayHelper.access$700(PayHelper.this) != null) {
                PayHelper.access$700(PayHelper.this).onStartActivity();
            }
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public void startActivity(String str, String str2, int i, Bundle bundle) throws RemoteException {
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            if (bundle == null) {
                bundle = new Bundle();
            }
            try {
                bundle.putInt(MspBaseActivity.KEY_ID, i);
                intent.putExtras(bundle);
            } catch (Exception e) {
                StatisticManager.putError(PayHelper.access$300(PayHelper.this), "biz", StatisticRecord.EC_PROGRESS_ERR_INTENT_EX, e);
            }
            intent.setClassName(str, str2);
            try {
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                BizContext access$300 = PayHelper.access$300(PayHelper.this);
                StatisticManager.putAction(access$300, "biz", "isFg", runningAppProcessInfo.processName + "|" + runningAppProcessInfo.importance + "|");
            } catch (Throwable unused) {
            }
            try {
                if (PayHelper.access$400(PayHelper.this) != null) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    PayHelper.access$400(PayHelper.this).startActivity(intent);
                    BizContext access$3002 = PayHelper.access$300(PayHelper.this);
                    StringBuilder sb = new StringBuilder();
                    sb.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                    StatisticManager.putAction(access$3002, "biz", "stAct2", sb.toString());
                    return;
                }
                StatisticManager.putError(PayHelper.access$300(PayHelper.this), "biz", StatisticRecord.EC_PROGRESS_ERR_ACTIVITY_NULL);
                Context appContext = PayHelper.access$300(PayHelper.this).getAppContext();
                if (appContext != null) {
                    appContext.startActivity(intent);
                }
            } catch (Throwable th) {
                StatisticManager.putError(PayHelper.access$300(PayHelper.this), "biz", StatisticRecord.EC_PROGRESS_ERR_ACTIVITY_EX, th);
                throw th;
            }
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public void payEnd(boolean z, String str) throws RemoteException {
        }
    }
}
