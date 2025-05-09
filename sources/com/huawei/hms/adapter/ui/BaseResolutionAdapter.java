package com.huawei.hms.adapter.ui;

import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.kpms.KpmsConstant;
import com.huawei.hms.utils.RegionUtils;
import com.huawei.hms.utils.ResolutionFlagUtil;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class BaseResolutionAdapter implements IBridgeActivityDelegate {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<Activity> f5259a;
    private String b = "";
    private long c = 0;

    private void a(long j) {
        if (!RegionUtils.isChinaROM(c())) {
            HMSLog.i("BaseResolutionAdapter", "not ChinaROM");
            return;
        }
        Activity c = c();
        if (c != null && !c.isFinishing()) {
            HashMap hashMap = new HashMap();
            hashMap.put("package", c.getPackageName());
            hashMap.put(CommonCode.MapKey.RESOLUTION_FLAG, this.c + "-" + j);
            HiAnalyticsUtils.getInstance().onEvent(c, HiAnalyticsConstant.HMS_SDK_BASE_START_RESOLUTION, hashMap);
            HMSLog.e("BaseResolutionAdapter", "check resolution flag failed, transactionId: " + this.b + ", carriedTimeStamp: " + this.c + ", savedTimeStamp: " + j);
        }
    }

    private void b() {
        Activity c = c();
        if (c != null && !c.isFinishing()) {
            c.finish();
        }
    }

    private Activity c() {
        WeakReference<Activity> weakReference = this.f5259a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    private void d() {
        SystemManager.getInstance().notifyResolutionResult(null, this.b);
        b();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 1001;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onBridgeActivityCreate(android.app.Activity r10) {
        /*
            r9 = this;
            java.lang.String r0 = "BaseResolutionAdapter"
            if (r10 != 0) goto L_0x000d
            java.lang.String r10 = "activity is null"
            com.huawei.hms.support.log.HMSLog.e(r0, r10)
            r9.d()
            return
        L_0x000d:
            boolean r1 = r10.isFinishing()
            if (r1 == 0) goto L_0x0019
            java.lang.String r10 = "activity is finishing"
            com.huawei.hms.support.log.HMSLog.e(r0, r10)
            return
        L_0x0019:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r10)
            r9.f5259a = r1
            android.content.Intent r1 = r10.getIntent()
            if (r1 != 0) goto L_0x002a
            r9.d()
            return
        L_0x002a:
            android.os.Bundle r2 = r1.getExtras()     // Catch: all -> 0x0045
            java.lang.String r3 = "transaction_id"
            java.lang.String r3 = r1.getStringExtra(r3)     // Catch: all -> 0x0043
            r9.b = r3     // Catch: all -> 0x0043
            java.lang.String r3 = "resolution_flag"
            r4 = 0
            long r3 = r1.getLongExtra(r3, r4)     // Catch: all -> 0x0043
            r9.c = r3     // Catch: all -> 0x0043
            goto L_0x0058
        L_0x0043:
            r1 = move-exception
            goto L_0x0047
        L_0x0045:
            r1 = move-exception
            r2 = 0
        L_0x0047:
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r3 = "get transaction_id or resolution_flag exception:"
            java.lang.String r1 = r3.concat(r1)
            com.huawei.hms.support.log.HMSLog.e(r0, r1)
        L_0x0058:
            boolean r1 = r9.a()
            if (r1 != 0) goto L_0x0062
            r9.d()
            return
        L_0x0062:
            java.lang.String r1 = r9.b
            if (r1 == 0) goto L_0x007b
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r1 < r3) goto L_0x007b
            java.lang.String r1 = "remove apk resolution failed task."
            com.huawei.hms.support.log.HMSLog.i(r0, r1)
            com.huawei.hms.adapter.sysobs.ApkResolutionFailedManager r1 = com.huawei.hms.adapter.sysobs.ApkResolutionFailedManager.getInstance()
            java.lang.String r3 = r9.b
            r1.removeTask(r3)
        L_0x007b:
            if (r2 != 0) goto L_0x0081
            r9.d()
            return
        L_0x0081:
            java.lang.String r1 = "resolution"
            android.os.Parcelable r1 = r2.getParcelable(r1)
            if (r1 != 0) goto L_0x008e
            r9.d()
            return
        L_0x008e:
            boolean r2 = r1 instanceof android.content.Intent
            if (r2 == 0) goto L_0x00a7
            android.content.Intent r1 = (android.content.Intent) r1     // Catch: all -> 0x009e
            android.content.Intent r1 = com.huawei.hms.utils.IntentUtil.modifyIntentBehaviorsSafe(r1)     // Catch: all -> 0x009e
            r2 = 1001(0x3e9, float:1.403E-42)
            r10.startActivityForResult(r1, r2)     // Catch: all -> 0x009e
            goto L_0x00c4
        L_0x009e:
            r9.d()
            java.lang.String r10 = "ActivityNotFoundException:exception"
            com.huawei.hms.support.log.HMSLog.e(r0, r10)
            goto L_0x00c4
        L_0x00a7:
            boolean r2 = r1 instanceof android.app.PendingIntent
            if (r2 == 0) goto L_0x00c4
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1     // Catch: SendIntentException -> 0x00bc
            android.content.IntentSender r3 = r1.getIntentSender()     // Catch: SendIntentException -> 0x00bc
            r7 = 0
            r8 = 0
            r4 = 1001(0x3e9, float:1.403E-42)
            r5 = 0
            r6 = 0
            r2 = r10
            r2.startIntentSenderForResult(r3, r4, r5, r6, r7, r8)     // Catch: SendIntentException -> 0x00bc
            goto L_0x00c4
        L_0x00bc:
            r9.d()
            java.lang.String r10 = "SendIntentException:exception"
            com.huawei.hms.support.log.HMSLog.e(r0, r10)
        L_0x00c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.adapter.ui.BaseResolutionAdapter.onBridgeActivityCreate(android.app.Activity):void");
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        HMSLog.i("BaseResolutionAdapter", "onBridgeActivityDestroy");
        this.f5259a = null;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        if (i != getRequestCode()) {
            return false;
        }
        HMSLog.i("BaseResolutionAdapter", "onBridgeActivityResult, resultCode: " + i2);
        if (i2 == 1001 || i2 == 1002) {
            if (intent == null) {
                intent = new Intent();
            }
            intent.putExtra(CommonCode.MapKey.PRIVACY_STATEMENT_CONFIRM_RESULT, i2);
        }
        if (i2 == -1 || intent.hasExtra(KpmsConstant.KIT_UPDATE_RESULT) || intent.hasExtra(CommonCode.MapKey.PRIVACY_STATEMENT_CONFIRM_RESULT)) {
            SystemManager.getInstance().notifyResolutionResult(intent, this.b);
        } else {
            SystemManager.getInstance().notifyResolutionResult(null, this.b);
        }
        b();
        return true;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        HMSLog.i("BaseResolutionAdapter", "onBridgeConfigurationChanged");
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i, KeyEvent keyEvent) {
        HMSLog.i("BaseResolutionAdapter", "On key up when resolve conn error");
    }

    private boolean a() {
        long resolutionFlag = ResolutionFlagUtil.getInstance().getResolutionFlag(this.b);
        ResolutionFlagUtil.getInstance().removeResolutionFlag(this.b);
        if (resolutionFlag != 0 && resolutionFlag == this.c) {
            return true;
        }
        a(resolutionFlag);
        return false;
    }
}
