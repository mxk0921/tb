package com.alipay.mobile.verifyidentity.ui.helper;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.data.VerifyIdentityTask;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.BehaviourIdEnum;
import com.alipay.mobile.verifyidentity.log.TimeCostLog;
import com.alipay.mobile.verifyidentity.log.VerifyBehavorLogger;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.MicroModule;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ActivityHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PROD_ACTIVITY = "isProActivity";
    public static final String TASK_MODULENAME = "task_modulename";
    public static final String TASK_TOKEN = "task_token";
    public static final String TASK_VERIFYID = "task_verifyid";
    public static final String[] d = {"com.alipay.mobile.verifyidentity.ui.helper.DialogActivity", "com.alipay.mobile.verifyidentity.ui.helper.NoticeActivity", "com.alipay.mobile.security.faceauth.ui.bank.WebNavigationActivity", "com.alipay.mobile.security.faceauth.ui.uniform.FaceLoginActivity", "com.alipay.mobile.security.faceauth.ui.uniform.FaceSampleActivity", "com.alipay.mobile.verifyidentity.helper.ui.VerifyParamsActivity", "com.alipay.mobile.verifyidentity.helper.ui.BuildVerifyActivity", "com.alipay.mobile.verifyidentity.helper.ui.RpcShowActivity", "com.alipay.mobile.verifyidentity.helper.ui.VerifyLogShowActivity", "com.alipay.mobile.verifyidentity.helper.zxing.activity.CaptureActivity", "com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity", "com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioProtoActivity", "com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioOpenActivity", "com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity", "com.alipay.mobile.verifyidentity.ui.helper.VerifyGuideActivity", "com.alipay.mobile.verifyidentity.ui.helper.VerifyDialogActivity", "com.alipay.mobile.verifyidentity.module.dynamic.ui.ViWebViewActivity"};

    /* renamed from: a  reason: collision with root package name */
    public final Activity f4470a;
    public final DialogHelper b;
    public final boolean c;
    public MicroModuleContext mMicroModuleContext;
    public MicroModule mModule;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ActivityHelper(android.app.Activity r9) {
        /*
            r8 = this;
            java.lang.String r0 = "ActivityHelper"
            r8.<init>()
            r1 = 0
            r8.c = r1
            r8.f4470a = r9
            com.alipay.mobile.verifyidentity.ui.helper.DialogHelper r2 = new com.alipay.mobile.verifyidentity.ui.helper.DialogHelper
            r2.<init>(r9)
            r8.b = r2
            java.lang.String r2 = ""
            android.content.Intent r3 = r9.getIntent()     // Catch: all -> 0x004b
            java.lang.String r4 = "task_verifyid"
            java.lang.String r3 = r3.getStringExtra(r4)     // Catch: all -> 0x004b
            android.content.Intent r4 = r9.getIntent()     // Catch: all -> 0x0047
            java.lang.String r5 = "task_token"
            java.lang.String r4 = r4.getStringExtra(r5)     // Catch: all -> 0x0047
            android.content.Intent r5 = r9.getIntent()     // Catch: all -> 0x0044
            java.lang.String r6 = "task_modulename"
            java.lang.String r5 = r5.getStringExtra(r6)     // Catch: all -> 0x0044
            android.content.Intent r6 = r9.getIntent()     // Catch: all -> 0x0042
            java.lang.String r7 = "isProActivity"
            boolean r6 = r6.getBooleanExtra(r7, r1)     // Catch: all -> 0x0042
            r8.c = r6     // Catch: all -> 0x0042
            goto L_0x0052
        L_0x0042:
            r6 = move-exception
            goto L_0x004f
        L_0x0044:
            r6 = move-exception
            r5 = r2
            goto L_0x004f
        L_0x0047:
            r6 = move-exception
            r4 = r2
        L_0x0049:
            r5 = r4
            goto L_0x004f
        L_0x004b:
            r6 = move-exception
            r3 = r2
            r4 = r3
            goto L_0x0049
        L_0x004f:
            com.alipay.mobile.verifyidentity.log.VerifyLogCat.e(r0, r6)
        L_0x0052:
            com.alipay.mobile.verifyidentity.engine.MicroModuleContext r6 = com.alipay.mobile.verifyidentity.engine.MicroModuleContext.getInstance()
            r8.mMicroModuleContext = r6
            com.alipay.mobile.verifyidentity.module.MicroModule r6 = r6.findModule(r3, r4, r5)
            r8.mModule = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "verifyId: "
            r6.<init>(r7)
            r6.append(r3)
            java.lang.String r3 = " token: "
            r6.append(r3)
            r6.append(r4)
            java.lang.String r3 = " moduleName: "
            r6.append(r3)
            r6.append(r5)
            java.lang.String r3 = r6.toString()
            com.alipay.mobile.verifyidentity.log.VerifyLogCat.v(r0, r3)
            com.alipay.mobile.verifyidentity.module.MicroModule r3 = r8.mModule
            if (r3 == 0) goto L_0x008f
            r3.setIsPrevent(r1)
            com.alipay.mobile.verifyidentity.module.MicroModule r9 = r8.mModule
            android.app.Activity r0 = r8.f4470a
            r9.pushActivity(r0)
            return
        L_0x008f:
            if (r9 == 0) goto L_0x0099
            java.lang.Class r9 = r9.getClass()
            java.lang.String r2 = r9.getName()
        L_0x0099:
            java.lang.String r9 = "ActivityHelper mModule is null: "
            java.lang.String r9 = r9.concat(r2)
            com.alipay.mobile.verifyidentity.log.VerifyLogCat.e(r0, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.ui.helper.ActivityHelper.<init>(android.app.Activity):void");
    }

    public void alert(String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17008757", new Object[]{this, str, str2, str3, onClickListener, str4, onClickListener2});
        } else {
            this.b.alert(str, str2, str3, onClickListener, str4, onClickListener2, null);
        }
    }

    public void dismissProgressDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afa6c806", new Object[]{this});
        } else {
            this.b.dismissProgressDialog();
        }
    }

    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        MicroModule microModule = this.mModule;
        if (microModule != null) {
            microModule.removeActivity(this.f4470a);
        }
        this.b.dismissProgressDialog();
    }

    public DialogHelper getDialogHelper() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DialogHelper) ipChange.ipc$dispatch("3a7cfdc6", new Object[]{this});
        }
        return this.b;
    }

    public MicroModuleContext getMicroModuleContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModuleContext) ipChange.ipc$dispatch("e3291d3f", new Object[]{this});
        }
        return this.mMicroModuleContext;
    }

    public MicroModule getModule() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("841a5a2b", new Object[]{this});
        }
        return this.mModule;
    }

    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        MicroModule microModule = this.mModule;
        if (microModule != null) {
            microModule.setIsPrevent(false);
        }
    }

    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        }
    }

    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else if (!this.c) {
            this.mMicroModuleContext.updateActivity(this.f4470a);
            MicroModule microModule = this.mModule;
            if (microModule != null && microModule.isNeedReportVisible()) {
                writeLogFirstModuleVisible();
                this.mModule.setNeedReportVisible(false);
            }
        }
    }

    public void showProgressDialog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4a6743", new Object[]{this, str});
        } else {
            this.b.showProgressDialog(str);
        }
    }

    public void toast(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4329f88b", new Object[]{this, str, new Integer(i)});
        } else {
            this.b.toast(str, i);
        }
    }

    public void updateAlertLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19e1f124", new Object[]{this});
        } else {
            this.b.updateAlertLayout();
        }
    }

    public MicroModule whenModuleIsNull() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("dbfe3980", new Object[]{this});
        }
        MicroModule microModule = new MicroModule() { // from class: com.alipay.mobile.verifyidentity.ui.helper.ActivityHelper.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/ui/helper/ActivityHelper$1");
            }

            @Override // com.alipay.mobile.verifyidentity.module.MicroModule
            public void onCreate(String str, String str2, String str3, Bundle bundle) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3304cdb4", new Object[]{this, str, str2, str3, bundle});
                }
            }

            @Override // com.alipay.mobile.verifyidentity.module.MicroModule
            public void onDestroy() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a6532022", new Object[]{this});
                }
            }

            @Override // com.alipay.mobile.verifyidentity.module.MicroModule
            public void onStart() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7f2d84ca", new Object[]{this});
                }
            }
        };
        this.mModule = microModule;
        return microModule;
    }

    public void writeLogFirstModuleVisible() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93ef2a62", new Object[]{this});
            return;
        }
        if (("本次task的第一个Module的第一个界面可见，做埋点（Activity：" + this.f4470a) == null) {
            str = "";
        } else {
            str = this.f4470a.getClass().getSimpleName().concat("）");
        }
        VerifyLogCat.i("ActivityHelper", str);
        VerifyIdentityTask task = this.mModule.getTask();
        if (task != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("sceneId", task.sceneId);
            hashMap.put("bizId", task.bizId);
            hashMap.put("module", this.mModule.getModuleName());
            hashMap.put(Constants.VI_ENGINE_VERIFY_TYPE, task.getCompatibleVerifyType());
            VerifyBehavorLogger.logBehavorRightAway(BehaviourIdEnum.EVENT, "UC-MobileIC-160816-1", Constants.VI_ENGINE_APPID, "dygjmkj", this.mModule.getToken(), this.mModule.getVerifyId(), String.valueOf(SystemClock.elapsedRealtime() - task.getTaskCreateTime()), hashMap);
            TimeCostLog.log(getClass().getSimpleName(), "首个页面唤起总耗时：", task.getTaskCreateTime());
        }
    }

    public void alert(String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a82bc296", new Object[]{this, str, str2, str3, onClickListener, str4, onClickListener2, bool});
        } else {
            this.b.alert(str, str2, str3, onClickListener, str4, onClickListener2, bool, null);
        }
    }

    public void showProgressDialog(String str, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11a225aa", new Object[]{this, str, new Boolean(z), onCancelListener});
        } else {
            this.b.showProgressDialog(str, z, onCancelListener, true);
        }
    }

    public void toast(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22158bd8", new Object[]{this, str, new Integer(i), new Integer(i2)});
        } else {
            this.b.toast(str, i, i2);
        }
    }

    public static boolean isInWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88815dcd", new Object[]{str})).booleanValue();
        }
        String[] strArr = d;
        for (int i = 0; i < 17; i++) {
            if (strArr[i].equalsIgnoreCase(str)) {
                VerifyLogCat.w("ActivityHelper", "The mModule of a [ " + str + " ] can be null... ");
                return true;
            }
        }
        VerifyLogCat.e("ActivityHelper", "mModule of [ " + str + " ] is null!!! ");
        return false;
    }

    public void alert(String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("392f581d", new Object[]{this, str, str2, str3, onClickListener, str4, onClickListener2, bundle});
        } else {
            this.b.alert(str, str2, str3, onClickListener, str4, onClickListener2, bundle);
        }
    }

    public void showProgressDialog(String str, boolean z, DialogInterface.OnCancelListener onCancelListener, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22a3426a", new Object[]{this, str, new Boolean(z), onCancelListener, new Boolean(z2)});
        } else {
            this.b.showProgressDialog(str, z, onCancelListener, z2);
        }
    }
}
