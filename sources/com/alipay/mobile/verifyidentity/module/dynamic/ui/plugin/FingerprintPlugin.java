package com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alipay.android.app.smartpays.api.callback.IFingerprintCallback;
import com.alipay.android.app.smartpays.api.model.FingerprintRequest;
import com.alipay.android.app.smartpays.api.model.FingerprintResult;
import com.alipay.android.app.template.FBPluginCtx;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.alipay.mobile.verifyidentity.data.DefaultModuleResult;
import com.alipay.mobile.verifyidentity.data.ModuleDataModel;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.log.behavior.VerifyLogger;
import com.alipay.mobile.verifyidentity.module.MicroModule;
import com.alipay.mobile.verifyidentity.module.fingerprint.FingerprintCheckActivity;
import com.alipay.mobile.verifyidentity.module.fingerprint.FingerprintModule;
import com.alipay.mobile.verifyidentity.module.fingerprint.SafepayChecker;
import com.alipay.mobile.verifyidentity.module.fingerprint.proxy.ApiFingerprintManagerProxy;
import com.alipay.mobile.verifyidentity.module.utils.DataHelper;
import com.alipay.mobile.verifyidentity.module.zface.ZFaceChecker;
import com.alipay.mobile.verifyidentity.rpc.RpcException;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin;
import com.alipay.mobile.verifyidentity.ui.helper.DialogHelper;
import com.alipay.mobile.verifyidentity.utils.ReportHelper;
import com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor;
import com.alipay.mobileic.core.model.rpc.MICRpcRequest;
import com.alipay.mobileic.core.model.rpc.MICRpcResponse;
import com.alipay.security.mobile.auth.message.AuthenticatorResponse;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FingerprintPlugin extends BaseFBPlugin {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f4314a = "FingerprintPlugin";
    private static long p;
    private Context b;
    private FBPluginCtx c;
    private int d;
    private View e;
    private TextView f;
    public BroadcastReceiver fpBroadcastReceiver;
    private TextView g;
    private int i;
    private DataHelper n;
    public BroadcastReceiver pageChangeBroadcastReceiver;
    private boolean h = false;
    private SafepayChecker j = new SafepayChecker();
    private AtomicBoolean k = new AtomicBoolean(true);
    private AtomicBoolean l = new AtomicBoolean(false);
    private AtomicBoolean m = new AtomicBoolean(false);
    private boolean o = false;

    /* compiled from: Taobao */
    /* renamed from: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.FingerprintPlugin$3  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class AnonymousClass3 implements IFingerprintCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass3() {
        }

        @Override // com.alipay.android.app.smartpays.api.callback.IFingerprintCallback
        public void onCallBack(final FingerprintResult fingerprintResult) {
            Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("646591f4", new Object[]{this, fingerprintResult});
            } else if (FingerprintPlugin.access$400(FingerprintPlugin.this).get()) {
                String access$000 = FingerprintPlugin.access$000();
                StringBuilder sb = new StringBuilder("指纹校验已取消，不处理回调结果[");
                if (fingerprintResult != null) {
                    obj = fingerprintResult.mStatus;
                } else {
                    obj = "";
                }
                sb.append(obj);
                sb.append("]");
                VerifyLogCat.i(access$000, sb.toString());
            } else {
                FingerprintPlugin.access$700(FingerprintPlugin.this).post(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.FingerprintPlugin.3.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        FingerprintPlugin.access$100(FingerprintPlugin.this).logFpResBehavior(String.valueOf(fingerprintResult.mResult), "client");
                        if (fingerprintResult.mStatus == FingerprintResult.FingerprintStatus.COMMON_SUCCESS) {
                            VerifyLogCat.i(FingerprintPlugin.access$000(), "SP指纹本地校验成功，提交服务端校验");
                            FingerprintPlugin.access$100(FingerprintPlugin.this).buildRequestData(true, fingerprintResult);
                            FingerprintPlugin.access$500(FingerprintPlugin.this);
                            return;
                        }
                        String access$0002 = FingerprintPlugin.access$000();
                        VerifyLogCat.i(access$0002, "SP指纹本地校验未通过（含取消）, 转密码支付[" + fingerprintResult.mStatus + "]");
                        FingerprintPlugin.access$600(FingerprintPlugin.this).postDelayed(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.FingerprintPlugin.3.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    FingerprintPlugin.access$100(FingerprintPlugin.this).goToPayPwd(fingerprintResult);
                                }
                            }
                        }, 250L);
                    }
                });
            }
        }

        @Override // com.alipay.android.app.smartpays.api.callback.IFingerprintCallback
        public void onProgressChanged(boolean z, final FingerprintResult fingerprintResult) {
            Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b636ace", new Object[]{this, new Boolean(z), fingerprintResult});
            } else if (FingerprintPlugin.access$400(FingerprintPlugin.this).get()) {
                String access$000 = FingerprintPlugin.access$000();
                StringBuilder sb = new StringBuilder("指纹校验已取消，不处理状态回调结果[");
                if (fingerprintResult != null) {
                    obj = fingerprintResult.mStatus;
                } else {
                    obj = "";
                }
                sb.append(obj);
                sb.append("]");
                VerifyLogCat.i(access$000, sb.toString());
            } else {
                FingerprintPlugin.access$1000(FingerprintPlugin.this).post(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.FingerprintPlugin.3.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        String access$0002 = FingerprintPlugin.access$000();
                        VerifyLogCat.i(access$0002, "onProgressChanged[" + fingerprintResult.mStatus + "]");
                        FingerprintResult.FingerprintStatus fingerprintStatus = fingerprintResult.mStatus;
                        if (fingerprintStatus == FingerprintResult.FingerprintStatus.COMMON_FAILED) {
                            FingerprintPlugin.access$800(FingerprintPlugin.this).setVisibility(8);
                            FingerprintPlugin.access$900(FingerprintPlugin.this, BaseFBPlugin.ACT_CONF.hwRetryText);
                        } else if (fingerprintStatus == FingerprintResult.FingerprintStatus.COMMON_VERIFYING) {
                            FingerprintPlugin.access$800(FingerprintPlugin.this).setVisibility(8);
                            FingerprintPlugin.access$900(FingerprintPlugin.this, BaseFBPlugin.ACT_CONF.hwAuthingText);
                        }
                    }
                });
            }
        }
    }

    public FingerprintPlugin(Context context, FBPluginCtx fBPluginCtx, int i) {
        super(context, fBPluginCtx);
        this.b = context;
        this.c = fBPluginCtx;
        this.d = i;
        if (fBPluginCtx != null && i != 0) {
            VerifyLogCat.i(f4314a, "just for PMD");
        }
    }

    private boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        DataHelper dataHelper = this.n;
        if (!dataHelper.multiBio) {
            if (z) {
                dataHelper.proVerifyResult = "FP_STATUS-" + this.i;
                String string = this.b.getResources().getString(R.string.vi_fp_tip_sys_fingerprint_error_setting);
                if (!TextUtils.isEmpty(string)) {
                    this.n.updateTipToPwd(string);
                }
            }
            this.n.goToPayPwd();
            return false;
        } else if (dataHelper.hasNextBio()) {
            this.n.parseNextBio();
            if (this.n.isFP()) {
                this.viType = "fp";
            } else if (this.n.isFACEID()) {
                this.viType = DataHelper.FACEID_TYPE_VALUE;
            } else if (this.n.isZFACE()) {
                this.viType = DataHelper.ZFACE_TYPE_VALUE;
            } else if (this.n.isWL()) {
                this.viType = "wl";
            }
            return true;
        } else {
            if (z) {
                DataHelper dataHelper2 = this.n;
                dataHelper2.proVerifyResult = "FP_STATUS-" + this.i;
                String string2 = this.b.getResources().getString(R.string.vi_fp_tip_sys_fingerprint_error_setting);
                if (!TextUtils.isEmpty(string2)) {
                    this.n.updateTipToPwd(string2);
                }
            }
            this.n.goToPayPwd();
            return false;
        }
    }

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return f4314a;
    }

    public static /* synthetic */ DataHelper access$100(FingerprintPlugin fingerprintPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DataHelper) ipChange.ipc$dispatch("d81e842a", new Object[]{fingerprintPlugin});
        }
        return fingerprintPlugin.n;
    }

    public static /* synthetic */ Handler access$1000(FingerprintPlugin fingerprintPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("813a3070", new Object[]{fingerprintPlugin});
        }
        return fingerprintPlugin.mainHandler;
    }

    public static /* synthetic */ MicroModule access$1100(FingerprintPlugin fingerprintPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("4fa61837", new Object[]{fingerprintPlugin});
        }
        return fingerprintPlugin.mModule;
    }

    public static /* synthetic */ MicroModule access$1200(FingerprintPlugin fingerprintPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("dc1a5516", new Object[]{fingerprintPlugin});
        }
        return fingerprintPlugin.mModule;
    }

    public static /* synthetic */ MicroModule access$1300(FingerprintPlugin fingerprintPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("688e91f5", new Object[]{fingerprintPlugin});
        }
        return fingerprintPlugin.mModule;
    }

    public static /* synthetic */ AtomicBoolean access$1400(FingerprintPlugin fingerprintPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("ede092d2", new Object[]{fingerprintPlugin});
        }
        return fingerprintPlugin.l;
    }

    public static /* synthetic */ Context access$1500(FingerprintPlugin fingerprintPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("50a00e69", new Object[]{fingerprintPlugin});
        }
        return fingerprintPlugin.b;
    }

    public static /* synthetic */ void access$1600(FingerprintPlugin fingerprintPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beb710d0", new Object[]{fingerprintPlugin});
            return;
        }
        fingerprintPlugin.k.set(false);
        MicroModuleContext.getInstance().notifyAndFinishModule(fingerprintPlugin.mModule.getVerifyId(), fingerprintPlugin.mModule.getToken(), fingerprintPlugin.mModule.getModuleName(), new DefaultModuleResult("2003"));
    }

    public static /* synthetic */ TextView access$1700(FingerprintPlugin fingerprintPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("34003aa3", new Object[]{fingerprintPlugin});
        }
        return fingerprintPlugin.g;
    }

    public static /* synthetic */ AtomicBoolean access$1800(FingerprintPlugin fingerprintPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("baa8714e", new Object[]{fingerprintPlugin});
        }
        return fingerprintPlugin.k;
    }

    public static /* synthetic */ void access$200(FingerprintPlugin fingerprintPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("577f6823", new Object[]{fingerprintPlugin});
        } else {
            fingerprintPlugin.c();
        }
    }

    public static /* synthetic */ void access$300(FingerprintPlugin fingerprintPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f7ec682", new Object[]{fingerprintPlugin});
        } else {
            fingerprintPlugin.a();
        }
    }

    public static /* synthetic */ AtomicBoolean access$400(FingerprintPlugin fingerprintPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("6a4af0e1", new Object[]{fingerprintPlugin});
        }
        return fingerprintPlugin.m;
    }

    public static /* synthetic */ Handler access$600(FingerprintPlugin fingerprintPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("1ec552c7", new Object[]{fingerprintPlugin});
        }
        return fingerprintPlugin.mainHandler;
    }

    public static /* synthetic */ Handler access$700(FingerprintPlugin fingerprintPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("622bc208", new Object[]{fingerprintPlugin});
        }
        return fingerprintPlugin.mainHandler;
    }

    public static /* synthetic */ TextView access$800(FingerprintPlugin fingerprintPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("14963fd1", new Object[]{fingerprintPlugin});
        }
        return fingerprintPlugin.f;
    }

    public static /* synthetic */ void access$900(FingerprintPlugin fingerprintPlugin, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6918ef86", new Object[]{fingerprintPlugin, str});
        } else {
            fingerprintPlugin.a(str);
        }
    }

    private boolean b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d6ac0f", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (!TextUtils.isEmpty(this.n.userId)) {
            int checkUserStatus = this.j.checkUserStatus(this.n.userId);
            this.i = checkUserStatus;
            if (checkUserStatus == 2) {
                VerifyLogCat.i(f4314a, "用户本地指纹状态正常");
            } else {
                String str = f4314a;
                VerifyLogCat.i(str, "用户本地指纹状态不正确[" + checkUserStatus + "]");
                if (z) {
                    VerifyLogCat.i(str, "指纹状态不正确转密码");
                    AuthenticatorResponse authenticatorResponse = new AuthenticatorResponse();
                    authenticatorResponse.setResult(checkUserStatus);
                    HashMap<String, String> hashMap = new HashMap<>();
                    hashMap.put("status", String.valueOf(checkUserStatus));
                    this.n.logBehavior("yhfpztyc", "UC-MobileIC-180929-1", hashMap);
                    DataHelper dataHelper = this.n;
                    dataHelper.proVerifyResult = "FP_STATUS-" + this.i;
                    this.n.goToPayPwd(authenticatorResponse);
                }
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ Object ipc$super(FingerprintPlugin fingerprintPlugin, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2070326638) {
            super.addPlugin((String) objArr[0], (String) objArr[1], (ModuleDataModel) objArr[2], (Bundle) objArr[3]);
            return null;
        } else if (hashCode == -111775739) {
            super.onBNPageClose();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alipay/mobile/verifyidentity/module/dynamic/ui/plugin/FingerprintPlugin");
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin
    public void addPlugin(String str, String str2, ModuleDataModel moduleDataModel, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84995292", new Object[]{this, str, str2, moduleDataModel, bundle});
        } else {
            super.addPlugin(str, str2, moduleDataModel, bundle);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin
    public void bindModule(MicroModule microModule, String str) {
        boolean z;
        String reportFlag;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c61b9cc", new Object[]{this, microModule, str});
            return;
        }
        this.mModule = microModule;
        this.n = new DataHelper(this.mModule, str, this);
        String actConf = getActConf("usePwd");
        boolean z2 = !TextUtils.isEmpty(actConf) && "Y".equalsIgnoreCase(actConf);
        if (DataHelper.FP_TYPE_VALUE.equalsIgnoreCase(this.n.predata_type)) {
            this.viType = "fp";
            this.j.init(this.b, 1);
        } else if (DataHelper.WL_TYPE_VALUE.equalsIgnoreCase(this.n.predata_type)) {
            this.viType = "wl";
        } else if (DataHelper.FACEID_TYPE_VALUE.equalsIgnoreCase(this.n.predata_type)) {
            this.viType = DataHelper.FACEID_TYPE_VALUE;
        } else if (this.n.isZFACE()) {
            this.viType = DataHelper.ZFACE_TYPE_VALUE;
        } else {
            VerifyLogCat.w(f4314a, "Predata Type is not FP or WL. Go to check pay pwd!");
            this.n.goToPayPwd();
            return;
        }
        VerifyLogCat.i("DST", "fingeplugin create");
        if (!this.n.isEmbed) {
            this.e.setVisibility(8);
            if ("fp".equalsIgnoreCase(this.viType) && !b(false)) {
                VerifyLogCat.i(f4314a, "viStart过来的普通指纹，发现本地指纹状态异常，直接通知模版切密码");
                if ("Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.closeFpStatusAction))) {
                    AuthenticatorResponse authenticatorResponse = new AuthenticatorResponse();
                    authenticatorResponse.setResult(this.i);
                    HashMap<String, String> hashMap = new HashMap<>();
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.i);
                    hashMap.put("status", sb.toString());
                    this.n.logBehavior("yhfpztyc", "UC-MobileIC-180929-1", hashMap);
                    DataHelper dataHelper = this.n;
                    dataHelper.proVerifyResult = "FP_STATUS-" + this.i;
                    String string = this.b.getResources().getString(R.string.vi_fp_tip_sys_fingerprint_error_setting);
                    if (!TextUtils.isEmpty(string)) {
                        this.n.updateTipToPwd(string);
                    }
                    this.n.goToPayPwd(authenticatorResponse);
                    return;
                }
                HashMap<String, String> hashMap2 = new HashMap<>();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.i);
                hashMap2.put("status", sb2.toString());
                this.n.logBehavior("yhfpztyc", "UC-MobileIC-180929-1", hashMap2);
                if (a(true)) {
                    String string2 = this.b.getResources().getString(R.string.vi_fp_tip_sys_fingerprint_error_setting);
                    if (!TextUtils.isEmpty(string2)) {
                        DialogHelper.makeToast(this.b, 0, string2, 0).show();
                    }
                } else {
                    return;
                }
            }
            if (DataHelper.ZFACE_TYPE_VALUE.equalsIgnoreCase(this.viType) && ZFaceChecker.isSameVerifyIdCallAgain(this.verifyId)) {
                VerifyLogCat.i(f4314a, "相同vid再次调用2D人脸，直接切密码");
                if (!a(false)) {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putString(FingerprintModule.FP_MODULE_DATA_KEY, str);
            bundle.putBoolean(FingerprintModule.FP_IS_MSP_USE_PWD, z2);
            Bundle bundle2 = this.extParams;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            this.o = true;
            FingerprintCheckActivity.addDataHelper(this.verifyId, this.n);
            Intent intent = new Intent(this.b, FingerprintCheckActivity.class);
            intent.putExtras(bundle);
            MicroModuleContext.getInstance().setStartActivityMonitor();
            MicroModuleContext.getInstance().startActivity(this.mModule, intent);
        } else {
            this.e.setVisibility(0);
            this.pageChangeBroadcastReceiver = new BroadcastReceiver() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.FingerprintPlugin.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass7 r2, String str3, Object... objArr) {
                    str3.hashCode();
                    int hashCode = str3.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str3 + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/module/dynamic/ui/plugin/FingerprintPlugin$7");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent2});
                        return;
                    }
                    VerifyLogCat.i(FingerprintPlugin.access$000(), "收到广播：com.alipay.phonecashier.framechange");
                    FingerprintPlugin.this.onBNPageClose();
                }
            };
            LocalBroadcastManager.getInstance(this.b).registerReceiver(this.pageChangeBroadcastReceiver, new IntentFilter(MspGlobalDefine.FRAME_CHANGE_ACTION));
            if (DataHelper.WL_TYPE_VALUE.equalsIgnoreCase(this.n.predata_type) || DataHelper.FACEID_TYPE_VALUE.equalsIgnoreCase(this.n.predata_type) || DataHelper.ZFACE_TYPE_VALUE.equalsIgnoreCase(this.n.predata_type)) {
                VerifyLogCat.i(f4314a, "viPreStart过来的可穿戴设备或人脸校验，不处理");
                b();
                return;
            } else if (!b(false)) {
                VerifyLogCat.i(f4314a, "viPreStart过来的华为内嵌模式，发现本地指纹状态异常，不渲染插件");
                return;
            } else {
                this.o = true;
                a(BaseFBPlugin.ACT_CONF.hwAuthTip);
                try {
                    reportFlag = ReportHelper.getReportFlag(this.b, ReportHelper.fpDelay);
                    str2 = f4314a;
                    VerifyLogCat.i(str2, "fpDelay：" + reportFlag);
                } catch (Throwable unused) {
                    VerifyLogCat.i(f4314a, "延时判断出现异常，直接启动指纹");
                }
                if (!TextUtils.isEmpty(reportFlag)) {
                    long longValue = Long.valueOf(reportFlag).longValue() - (SystemClock.elapsedRealtime() - p);
                    VerifyLogCat.i(str2, "本次调用指纹需要延时：[" + longValue + "]毫秒（只>0时延）");
                    if (longValue > 0) {
                        this.mainHandler.postDelayed(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.FingerprintPlugin.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    FingerprintPlugin.access$300(FingerprintPlugin.this);
                                }
                            }
                        }, longValue);
                        this.fpBroadcastReceiver = new BroadcastReceiver() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.FingerprintPlugin.6
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            public static /* synthetic */ Object ipc$super(AnonymousClass6 r2, String str3, Object... objArr) {
                                str3.hashCode();
                                int hashCode = str3.hashCode();
                                throw new InstantReloadException("String switch could not find '" + str3 + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/module/dynamic/ui/plugin/FingerprintPlugin$6");
                            }

                            @Override // android.content.BroadcastReceiver
                            public void onReceive(Context context, Intent intent2) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent2});
                                    return;
                                }
                                VerifyLogCat.i(FingerprintPlugin.access$000(), "收到广播：fingerprint_authenticate_result");
                                if (113 == intent2.getIntExtra("result", 1)) {
                                    if ("Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.fp2PwdOnRpc))) {
                                        VerifyLogCat.i(FingerprintPlugin.access$000(), "服务端关闭了广播切密码的优化后逻辑，走老逻辑");
                                    } else if (!FingerprintPlugin.access$1800(FingerprintPlugin.this).get()) {
                                        VerifyLogCat.i(FingerprintPlugin.access$000(), "用户离开，已进入rpc流程（或已结束），不转密码");
                                        return;
                                    }
                                    VerifyLogCat.i(FingerprintPlugin.access$000(), "用户离开，指纹要转支付密码");
                                    if (FingerprintPlugin.access$100(FingerprintPlugin.this) == null || FingerprintPlugin.access$400(FingerprintPlugin.this).get()) {
                                        VerifyLogCat.i(FingerprintPlugin.access$000(), "用户离开，指纹已取消，不转密码");
                                        return;
                                    }
                                    FingerprintPlugin.access$100(FingerprintPlugin.this).goToPayPwd();
                                    FingerprintPlugin.access$200(FingerprintPlugin.this);
                                }
                            }
                        };
                        LocalBroadcastManager.getInstance(this.b).registerReceiver(this.fpBroadcastReceiver, new IntentFilter(MspGlobalDefine.FP_AUTHENTICATE_ACTION));
                    }
                }
                a();
                this.fpBroadcastReceiver = new BroadcastReceiver() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.FingerprintPlugin.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass6 r2, String str3, Object... objArr) {
                        str3.hashCode();
                        int hashCode = str3.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str3 + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/module/dynamic/ui/plugin/FingerprintPlugin$6");
                    }

                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent2});
                            return;
                        }
                        VerifyLogCat.i(FingerprintPlugin.access$000(), "收到广播：fingerprint_authenticate_result");
                        if (113 == intent2.getIntExtra("result", 1)) {
                            if ("Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.fp2PwdOnRpc))) {
                                VerifyLogCat.i(FingerprintPlugin.access$000(), "服务端关闭了广播切密码的优化后逻辑，走老逻辑");
                            } else if (!FingerprintPlugin.access$1800(FingerprintPlugin.this).get()) {
                                VerifyLogCat.i(FingerprintPlugin.access$000(), "用户离开，已进入rpc流程（或已结束），不转密码");
                                return;
                            }
                            VerifyLogCat.i(FingerprintPlugin.access$000(), "用户离开，指纹要转支付密码");
                            if (FingerprintPlugin.access$100(FingerprintPlugin.this) == null || FingerprintPlugin.access$400(FingerprintPlugin.this).get()) {
                                VerifyLogCat.i(FingerprintPlugin.access$000(), "用户离开，指纹已取消，不转密码");
                                return;
                            }
                            FingerprintPlugin.access$100(FingerprintPlugin.this).goToPayPwd();
                            FingerprintPlugin.access$200(FingerprintPlugin.this);
                        }
                    }
                };
                LocalBroadcastManager.getInstance(this.b).registerReceiver(this.fpBroadcastReceiver, new IntentFilter(MspGlobalDefine.FP_AUTHENTICATE_ACTION));
            }
        }
        DataHelper dataHelper2 = this.n;
        if (dataHelper2.newUiParamsObj != null) {
            if (dataHelper2.isFP()) {
                z = this.n.newUiParamsObj.getBooleanValue(DataHelper.FP_TYPE_VALUE);
            } else if (this.n.isFACEID() || this.n.isZFACE() || this.n.isWL()) {
                z = this.n.newUiParamsObj.getBooleanValue(ModuleConstants.VI_MODULE_NAME_PAY_PWD);
            }
            String actConf2 = getActConf(BaseFBPlugin.ACT_CONF.supportVersion);
            if (z || TextUtils.isEmpty(actConf2) || !"2.0".equalsIgnoreCase(actConf2)) {
                this.h = false;
                updateVerifyStatus("start");
            }
            this.h = true;
            updateVerifyStatusNew("start");
            return;
        }
        z = false;
        String actConf22 = getActConf(BaseFBPlugin.ACT_CONF.supportVersion);
        if (z) {
        }
        this.h = false;
        updateVerifyStatus("start");
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            onBNPageClose();
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin
    public String getPluginName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd12a725", new Object[]{this});
        }
        return FingerprintPlugin.class.getSimpleName();
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin
    public void handleEngineCancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b64b42b", new Object[]{this});
            return;
        }
        VerifyLogCat.i(f4314a, "fp plugin cancel");
        if (!this.h) {
            updateVerifyStatus(BaseFBPlugin.VERIFY_STATUS.abort);
        } else if (openDuplicatePayTaskFix()) {
            updateVerifyStatusFotQuit(BaseFBPlugin.VERIFY_STATUS.abort, BaseFBPlugin.ABORT_SCENE_CANCEL_BY_ENGINE);
        } else {
            updateVerifyStatusNew(BaseFBPlugin.VERIFY_STATUS.abort);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin
    public void onBNPageClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9567005", new Object[]{this});
            return;
        }
        super.onBNPageClose();
        if (!this.m.get()) {
            c();
            b();
        }
        if (this.fpBroadcastReceiver != null) {
            LocalBroadcastManager.getInstance(this.b).unregisterReceiver(this.fpBroadcastReceiver);
        }
        if (this.pageChangeBroadcastReceiver != null) {
            LocalBroadcastManager.getInstance(this.b).unregisterReceiver(this.pageChangeBroadcastReceiver);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin
    public void onPaySuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a313101", new Object[]{this});
        } else {
            a(BaseFBPlugin.ACT_CONF.hwPaySuccessText);
        }
    }

    public static /* synthetic */ void access$500(FingerprintPlugin fingerprintPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f7d8340", new Object[]{fingerprintPlugin});
            return;
        }
        fingerprintPlugin.k.set(false);
        VerifyLogCat.i(f4314a, "upload fingerprint check result");
        fingerprintPlugin.f.setVisibility(8);
        fingerprintPlugin.a(BaseFBPlugin.ACT_CONF.hwPayingText);
        AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.FingerprintPlugin.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    MICRpcRequest mICRpcRequest = new MICRpcRequest();
                    mICRpcRequest.module = FingerprintPlugin.access$1100(FingerprintPlugin.this).getModuleName();
                    mICRpcRequest.verifyId = FingerprintPlugin.access$1200(FingerprintPlugin.this).getVerifyId();
                    mICRpcRequest.action = "VERIFY_PPW";
                    mICRpcRequest.token = FingerprintPlugin.access$1300(FingerprintPlugin.this).getToken();
                    String access$000 = FingerprintPlugin.access$000();
                    VerifyLogCat.i(access$000, "fingerprint data json str：" + FingerprintPlugin.access$100(FingerprintPlugin.this).fingerprintResultData);
                    mICRpcRequest.data = FingerprintPlugin.access$100(FingerprintPlugin.this).fingerprintResultData;
                    if (FingerprintPlugin.access$400(FingerprintPlugin.this).get()) {
                        VerifyLogCat.i(FingerprintPlugin.access$000(), "已压后台。不再发rpc了！");
                        return;
                    }
                    final MICRpcResponse sendRpcRequest = FingerprintPlugin.this.sendRpcRequest(mICRpcRequest);
                    FingerprintPlugin.access$1400(FingerprintPlugin.this).set(true);
                    if (sendRpcRequest == null) {
                        FingerprintPlugin.access$1600(FingerprintPlugin.this);
                    } else if (sendRpcRequest.verifySuccess) {
                        FingerprintPlugin.access$100(FingerprintPlugin.this).notifyResult(sendRpcRequest);
                    } else if (sendRpcRequest.finish) {
                        String str = sendRpcRequest.verifyMessage;
                        if (TextUtils.isEmpty(str)) {
                            str = FingerprintPlugin.access$1500(FingerprintPlugin.this).getResources().getString(R.string.verifyidentity_wrong_data);
                        }
                        MicroModuleContext.getInstance().alert("", str, FingerprintPlugin.access$1500(FingerprintPlugin.this).getResources().getString(R.string.verifyidentity_confirm), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.FingerprintPlugin.4.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                                    return;
                                }
                                FingerprintPlugin.this.updateVerifyStatus(BaseFBPlugin.VERIFY_STATUS.abort);
                                FingerprintPlugin.access$100(FingerprintPlugin.this).notifyResult(sendRpcRequest);
                            }
                        }, null, null);
                    } else {
                        FingerprintPlugin.access$100(FingerprintPlugin.this).updateTipToPwd(sendRpcRequest.verifyMessage);
                        FingerprintPlugin.access$100(FingerprintPlugin.this).logFpResBehavior(sendRpcRequest.verifyCode, "server");
                        FingerprintPlugin.access$100(FingerprintPlugin.this).goToPayPwd();
                    }
                } catch (RpcException unused) {
                    FingerprintPlugin.access$1400(FingerprintPlugin.this).set(true);
                    VerifyLogCat.w(FingerprintPlugin.access$000(), "upload fingerprint check result got rpc error");
                    FingerprintPlugin.access$1600(FingerprintPlugin.this);
                }
            }
        }, "VERIFY_FINGERPRINT_MINI");
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        if (!this.m.get()) {
            this.m.set(true);
            this.j.getFingerprintManager(this.b).cancel();
            p = SystemClock.elapsedRealtime();
            VerifyLogCat.i(f4314a, "取消指纹校验");
        }
        this.m.set(true);
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public View createView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        View inflate = ((LayoutInflater) this.b.getSystemService("layout_inflater")).inflate(R.layout.fb_fp_plugin, (ViewGroup) null);
        this.e = inflate;
        forbidDark(inflate);
        this.e.setVisibility(8);
        this.f = (TextView) this.e.findViewById(R.id.go_pwd);
        this.g = (TextView) this.e.findViewById(R.id.mini_fp_tips);
        this.f.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.FingerprintPlugin.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                VerifyLogCat.i(FingerprintPlugin.access$000(), "用户选择切换到支付密码");
                if (FingerprintPlugin.access$100(FingerprintPlugin.this) == null) {
                    VerifyLogCat.i(FingerprintPlugin.access$000(), "mDataHelper为空！！无法转密码");
                    try {
                        VerifyLogger.getInstance().eventBehavior("UC-MobileIC-180928-1", "", "", "", null);
                    } catch (Throwable th) {
                        VerifyLogCat.w(FingerprintPlugin.access$000(), "eventBehavior Exception", th);
                    }
                } else {
                    FingerprintPlugin.access$100(FingerprintPlugin.this).logFpResBehavior("RESULT_FALLBACK", null);
                    FingerprintPlugin.access$100(FingerprintPlugin.this).goToPayPwd();
                    FingerprintPlugin.access$200(FingerprintPlugin.this);
                }
            }
        });
        String actConf = getActConf(BaseFBPlugin.ACT_CONF.hwInputPwdTip);
        if (!TextUtils.isEmpty(actConf)) {
            String str = f4314a;
            VerifyLogCat.i(str, "收银台指定了切换密码文案hwInputPwdTip：" + actConf);
            this.f.setText(actConf);
        }
        this.o = false;
        return this.e;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.mModule == null) {
            VerifyLogCat.i(f4314a, "mModule为空？！返回。");
        } else {
            DefaultModuleResult defaultModuleResult = new DefaultModuleResult("1003");
            if (!this.o) {
                try {
                    if (defaultModuleResult.getExtInfo() != null) {
                        defaultModuleResult.getExtInfo().put("cancel_scene", "fp_plugin");
                    } else {
                        HashMap<String, Object> hashMap = new HashMap<>();
                        hashMap.put("cancel_scene", "fp_plugin");
                        defaultModuleResult.setExtInfo(hashMap);
                    }
                } catch (Throwable unused) {
                    VerifyLogCat.i(f4314a, "setExtParams error");
                }
            }
            MicroModuleContext.getInstance().notifyAndFinishModule(this.mModule.getVerifyId(), this.mModule.getToken(), this.mModule.getModuleName(), defaultModuleResult);
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        VerifyLogCat.i(f4314a, "startSpFingerprintChecker");
        this.n.logBehavior("cpzwjyks", "UC-MobileIC-160321-01", null);
        this.j.init(this.b, 1);
        if (b(true)) {
            FingerprintRequest fingerprintRequest = new FingerprintRequest();
            DataHelper dataHelper = this.n;
            fingerprintRequest.mData = dataHelper.challenge;
            fingerprintRequest.mUserId = dataHelper.userId;
            new ApiFingerprintManagerProxy(this.j.getFingerprintManager(this.b)).vertify(fingerprintRequest, new AnonymousClass3());
        }
    }

    private void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.mainHandler.post(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.FingerprintPlugin.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    String actConf = FingerprintPlugin.this.getActConf(str);
                    if (!TextUtils.isEmpty(actConf)) {
                        FingerprintPlugin.access$1700(FingerprintPlugin.this).setText(actConf);
                    } else if (DataHelper.confResidMap.get(str) != null) {
                        FingerprintPlugin.access$1700(FingerprintPlugin.this).setText(DataHelper.confResidMap.get(str).intValue());
                    }
                }
            });
        }
    }
}
