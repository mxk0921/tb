package com.alipay.mobile.verifyidentity.prodmanger.biopen.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager;
import com.alipay.mobile.common.transportext.biz.shared.ExtTransAppVisibleReceiver;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.data.ProdManagerResult;
import com.alipay.mobile.verifyidentity.data.VerifyIdentityResult;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.info.EnvInfoUtil;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.log.behavior.VerifyLogger;
import com.alipay.mobile.verifyidentity.module.utils.DataHelper;
import com.alipay.mobile.verifyidentity.prod.manager.module.BaseProdManager;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.callback.BioCheckCallback;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.callback.VerifyCheckCallback;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.handler.BioOpenHandler;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.utils.BioCheckManager;
import com.alipay.mobile.verifyidentity.rpc.RpcException;
import com.alipay.mobile.verifyidentity.rpc.biz.MICRpcServiceBiz;
import com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity;
import com.alipay.mobile.verifyidentity.utils.CommonConstant;
import com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor;
import com.alipay.mobileic.core.model.rpc.MICProdmngRequest;
import com.alipay.mobileic.core.model.rpc.MICRpcRequest;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.util.InstallServiceCallback;
import com.alipay.security.mobile.auth.message.AuthenticatorResponse;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.acq;
import tb.upx;
import tb.yj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BioOpenActivity extends BaseVerifyActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Bundle N;
    public Bundle O;
    public BaseProdManager P;
    public String Q;
    public String R;
    public String S;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public BioCheckManager m;
    public AuthenticatorManager n;
    public BroadcastReceiver o;
    public LocalBroadcastManager p;

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return "com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioOpenActivity";
    }

    public static /* synthetic */ AuthenticatorManager access$100(BioOpenActivity bioOpenActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AuthenticatorManager) ipChange.ipc$dispatch("3bfe330f", new Object[]{bioOpenActivity});
        }
        return bioOpenActivity.n;
    }

    public static /* synthetic */ String access$1000(BioOpenActivity bioOpenActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aec34c2d", new Object[]{bioOpenActivity});
        }
        return bioOpenActivity.S;
    }

    public static /* synthetic */ void access$200(BioOpenActivity bioOpenActivity, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb266dfe", new Object[]{bioOpenActivity, str, str2, str3});
        } else {
            bioOpenActivity.b(str, str2, str3);
        }
    }

    public static /* synthetic */ void access$300(BioOpenActivity bioOpenActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a6c2dc9", new Object[]{bioOpenActivity, str});
        } else {
            bioOpenActivity.c(str);
        }
    }

    public static /* synthetic */ String access$400(BioOpenActivity bioOpenActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("68f93502", new Object[]{bioOpenActivity});
        }
        return bioOpenActivity.Q;
    }

    public static /* synthetic */ String access$500(BioOpenActivity bioOpenActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("913f7543", new Object[]{bioOpenActivity});
        }
        return bioOpenActivity.l;
    }

    public static /* synthetic */ String access$600(BioOpenActivity bioOpenActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b985b584", new Object[]{bioOpenActivity});
        }
        return bioOpenActivity.R;
    }

    public static /* synthetic */ void access$700(BioOpenActivity bioOpenActivity, String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fa0c8f7", new Object[]{bioOpenActivity, str, str2, str3, str4, str5, str6});
        } else {
            bioOpenActivity.a(str2, str3, str4, str5, str6);
        }
    }

    public static /* synthetic */ void access$800(BioOpenActivity bioOpenActivity, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ac1014c", new Object[]{bioOpenActivity, str, str2, str3, str4, str5});
        } else {
            bioOpenActivity.d(str, str2, str3, str4, str5);
        }
    }

    public static /* synthetic */ String access$900(BioOpenActivity bioOpenActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("32587647", new Object[]{bioOpenActivity});
        }
        return bioOpenActivity.j;
    }

    public static /* synthetic */ Object ipc$super(BioOpenActivity bioOpenActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/prodmanger/biopen/ui/BioOpenActivity");
        }
    }

    public final void a(final String str, final String str2, String str3, final String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b9da5a", new Object[]{this, str, str2, str3, str4, str5});
            return;
        }
        BioCheckManager bioCheckManager = this.m;
        if (bioCheckManager != null) {
            bioCheckManager.a(Integer.parseInt(str), str3, str4, str5, new BioCheckCallback() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioOpenActivity.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.verifyidentity.prodmanger.biopen.callback.BioCheckCallback
                public final void onBioCheckResult(AuthenticatorResponse authenticatorResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("51346624", new Object[]{this, authenticatorResponse});
                    } else if (authenticatorResponse != null) {
                        String access$000 = BioOpenActivity.access$000();
                        VerifyLogCat.i(access$000, "无UI result：" + authenticatorResponse.getResult());
                        if ("100".equalsIgnoreCase(String.valueOf(authenticatorResponse.getResult()))) {
                            if (authenticatorResponse.getData() != null) {
                                BioOpenActivity.access$800(BioOpenActivity.this, "1000", str2, str, str4, authenticatorResponse.getData());
                            } else {
                                BioOpenActivity.access$800(BioOpenActivity.this, "1005", str2, str, str4, "");
                            }
                        } else if ("102".equalsIgnoreCase(String.valueOf(authenticatorResponse.getResult()))) {
                            BioOpenActivity.access$800(BioOpenActivity.this, "1003", str2, str, str4, "");
                        } else {
                            BioOpenActivity.access$800(BioOpenActivity.this, "1002", str2, str, str4, "");
                        }
                    } else {
                        VerifyLogCat.i(BioOpenActivity.access$000(), "生物校验失败");
                        BioOpenActivity.access$800(BioOpenActivity.this, "1005", str2, str, str4, "");
                    }
                }
            });
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

    public final void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sysSelectCode", str2);
        hashMap.put("resultCode", str3);
        hashMap.put("sceneId", this.l);
        hashMap.put(upx.PRODUCT_ID, this.R);
        VerifyLogger.getInstance().eventBehavior(str, "", "", "", hashMap);
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        ProdManagerResult prodManagerResult = new ProdManagerResult(str);
        BaseProdManager baseProdManager = this.P;
        if (baseProdManager != null) {
            baseProdManager.callback(prodManagerResult, null);
        } else {
            VerifyLogCat.i("com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioOpenActivity", "fingerManager为空！无法回调！");
        }
        finish();
    }

    public final void d(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2001a9b", new Object[]{this, str, str2, str3, str4, str5});
            return;
        }
        b("UC-MobileIC-20180904-2", "", str);
        String verifyData = getVerifyData(str2, str3, str4, str5);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", (Object) str);
        jSONObject.put("result", (Object) verifyData);
        BaseProdManager baseProdManager = this.P;
        if (baseProdManager != null) {
            baseProdManager.callback(jSONObject.toJSONString());
        } else {
            VerifyLogCat.i("com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioOpenActivity", "fingerManager为空！无法回调！");
        }
        finish();
    }

    public String getVerifyData(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("595451b8", new Object[]{this, str, str2, str3, str4});
        }
        MICProdmngRequest mICProdmngRequest = new MICProdmngRequest();
        mICProdmngRequest.token = this.j;
        mICProdmngRequest.module = this.i;
        mICProdmngRequest.action = str;
        mICProdmngRequest.envData = EnvInfoUtil.getBaseEnvData();
        HashMap hashMap = new HashMap();
        mICProdmngRequest.params = hashMap;
        hashMap.put(yj4.PARAM_PRODUCT_TYPE, str2);
        mICProdmngRequest.params.put("sceneId", str3);
        mICProdmngRequest.params.put("secData", EnvInfoUtil.getFpSecdata());
        mICProdmngRequest.params.put("data", str4);
        return JSON.toJSONString(mICProdmngRequest).toString();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        BroadcastReceiver broadcastReceiver;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        MicroModuleContext.getInstance().onDestroyProManager();
        try {
            LocalBroadcastManager localBroadcastManager = this.p;
            if (!(localBroadcastManager == null || (broadcastReceiver = this.o) == null)) {
                localBroadcastManager.unregisterReceiver(broadcastReceiver);
            }
            BroadcastReceiver broadcastReceiver2 = this.o;
            if (broadcastReceiver2 != null) {
                unregisterReceiver(broadcastReceiver2);
            }
        } catch (Throwable th) {
            VerifyLogCat.i("com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioOpenActivity", "unregisterReceiver error:" + th.getMessage());
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        c("1003");
        return true;
    }

    @Override // com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        if ("BIC".equalsIgnoreCase(this.i)) {
            try {
                AuthenticatorManager.getInstance(this).stopAuth(this, Integer.valueOf(this.Q).intValue());
                c("1003");
            } catch (Throwable th) {
                VerifyLogCat.d("com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioOpenActivity", th.getMessage());
                c("1005");
            }
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.translucent_view);
        if (getIntent() != null) {
            this.N = getIntent().getExtras();
        }
        Bundle bundle2 = this.N;
        if (bundle2 != null) {
            this.j = bundle2.getString("token");
            this.P = MicroModuleContext.getInstance().findProManager(this.j);
            this.n = AuthenticatorManager.getInstance(this);
            this.k = this.N.getString("code");
            VerifyLogCat.i("com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioOpenActivity", "bioOPeng:" + this.k);
            this.Q = this.N.getString(yj4.PARAM_PRODUCT_TYPE);
            this.N.getString("downloadurl");
            this.h = this.N.getString("alertText");
            this.i = this.N.getString("module");
            Bundle bundle3 = this.N.getBundle("extParams");
            this.O = bundle3;
            if (bundle3 != null) {
                this.l = bundle3.getString("sceneId");
                this.R = this.O.getString(upx.PRODUCT_ID);
            }
        }
        Bundle bundle4 = this.O;
        if (bundle4 == null || !"startByVIData".equalsIgnoreCase(bundle4.getString("source"))) {
            this.o = new BroadcastReceiver() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioOpenActivity.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str2, Object... objArr) {
                    str2.hashCode();
                    int hashCode = str2.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/prodmanger/biopen/ui/BioOpenActivity$2");
                }

                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                        return;
                    }
                    String action = intent.getAction();
                    if (ExtTransAppVisibleReceiver.FRAMEWORK_ACTIVITY_USERLEAVEHINT.equalsIgnoreCase(action) || "android.intent.action.SCREEN_OFF".equalsIgnoreCase(action)) {
                        BioOpenActivity.access$300(BioOpenActivity.this, "1003");
                    }
                }
            };
            this.p = LocalBroadcastManager.getInstance(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(ExtTransAppVisibleReceiver.FRAMEWORK_ACTIVITY_USERLEAVEHINT);
            this.p.registerReceiver(this.o, intentFilter);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("android.intent.action.SCREEN_OFF");
            registerReceiver(this.o, intentFilter2);
            VerifyLogCat.d("com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioOpenActivity", "无ui开通:" + this.k);
            BioOpenHandler bioOpenHandler = new BioOpenHandler();
            if ("not_install_ifaa".equalsIgnoreCase(this.k)) {
                VerifyLogCat.i("com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioOpenActivity", "无UI 未安装服务");
                Bundle bundle5 = new Bundle();
                if (TextUtils.isEmpty(this.h)) {
                    if ("1".equalsIgnoreCase(this.Q)) {
                        this.h = MicroModuleContext.getInstance().getContext().getResources().getString(R.string.finger_guide_not_install);
                    } else if ("4".equalsIgnoreCase(this.Q)) {
                        this.h = MicroModuleContext.getInstance().getContext().getResources().getString(R.string.face_guide_not_install);
                    }
                }
                bundle5.putBoolean(CommonConstant.alertTextColor, true);
                MicroModuleContext.getInstance().alert(null, this.h, MicroModuleContext.getInstance().getContext().getResources().getString(R.string.finger_install), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioOpenActivity.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                            return;
                        }
                        BioOpenActivity.access$100(BioOpenActivity.this).downloadIfaaService(BioOpenActivity.this, new InstallServiceCallback(this) { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioOpenActivity.1.1
                            public final void onCancel() {
                                VerifyLogCat.i(BioOpenActivity.access$000(), "download ifaa cancel");
                            }

                            public final void onFailed() {
                                VerifyLogCat.i(BioOpenActivity.access$000(), "download ifaa failed");
                            }

                            public final void onFinish() {
                                VerifyLogCat.i(BioOpenActivity.access$000(), "download ifaa finish");
                            }
                        });
                        BioOpenActivity.access$200(BioOpenActivity.this, "UC-MobileIC-20190425-1", "1", "");
                        BioOpenActivity.access$300(BioOpenActivity.this, "1003");
                    }
                }, MicroModuleContext.getInstance().getContext().getResources().getString(R.string.finger_cancel), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioOpenActivity.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                            return;
                        }
                        BioOpenActivity.access$300(BioOpenActivity.this, "1003");
                        BioOpenActivity.access$200(BioOpenActivity.this, "UC-MobileIC-20190425-2", "0", "");
                    }
                }, bundle5);
            } else if ("not_exist_bic_feature".equalsIgnoreCase(this.k)) {
                Bundle bundle6 = new Bundle();
                bundle6.putBoolean(CommonConstant.alertTextColor, true);
                if ("1".equalsIgnoreCase(this.Q)) {
                    str = MicroModuleContext.getInstance().getContext().getResources().getString(R.string.finger_guide_print);
                } else if ("4".equalsIgnoreCase(this.Q)) {
                    str = MicroModuleContext.getInstance().getContext().getResources().getString(R.string.face_guide_print);
                } else {
                    str = "";
                }
                MicroModuleContext.getInstance().alert(null, str, MicroModuleContext.getInstance().getContext().getResources().getString(R.string.finger_register), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioOpenActivity.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                            return;
                        }
                        BioOpenActivity.access$100(BioOpenActivity.this).startBioManager(Integer.valueOf(BioOpenActivity.access$400(BioOpenActivity.this)).intValue());
                        BioOpenActivity.access$200(BioOpenActivity.this, "UC-MobileIC-20180315-5", "1", "");
                        BioOpenActivity.access$300(BioOpenActivity.this, "1003");
                    }
                }, MicroModuleContext.getInstance().getContext().getResources().getString(R.string.finger_cancel), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioOpenActivity.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                            return;
                        }
                        BioOpenActivity.access$300(BioOpenActivity.this, "1003");
                        BioOpenActivity.access$200(BioOpenActivity.this, "UC-MobileIC-20180315-5", "0", "");
                    }
                }, bundle6);
            } else {
                bioOpenHandler.a(this, this.N, new BioOpenHandler.BioOpenCallback() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioOpenActivity.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.mobile.verifyidentity.prodmanger.biopen.handler.BioOpenHandler.BioOpenCallback
                    public final void a(String str2, boolean z) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8123ece2", new Object[]{this, str2, new Boolean(z)});
                        } else {
                            BioOpenActivity.access$300(BioOpenActivity.this, str2);
                        }
                    }
                });
            }
        } else {
            String string = this.N.getString(Constants.VI_ENGINE_FAST_MODULENAME);
            if (TextUtils.isEmpty(string)) {
                d("1005", "", "", "", "");
                return;
            }
            this.m = new BioCheckManager(this);
            try {
                JSONObject parseObject = JSON.parseObject(string);
                String string2 = parseObject.getString("productCode");
                final String string3 = parseObject.getString(Constants.VI_ENGINE_VERIFYID);
                this.R = parseObject.getString(upx.PRODUCT_ID);
                this.Q = parseObject.getString(yj4.PARAM_PRODUCT_TYPE);
                this.l = parseObject.getString("sceneId");
                this.S = parseObject.getString("bizId");
                final String string4 = parseObject.getString(DataHelper.FP_CHALLENGE_KEY);
                final String string5 = parseObject.getString("action");
                if ("BIC".equalsIgnoreCase(string2) || "BIS".equalsIgnoreCase(string2)) {
                    AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioOpenActivity.10
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public final void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            try {
                                MICRpcRequest mICRpcRequest = new MICRpcRequest();
                                mICRpcRequest.verifyId = string3;
                                mICRpcRequest.module = BioOpenActivity.access$600(BioOpenActivity.this);
                                mICRpcRequest.token = BioOpenActivity.access$900(BioOpenActivity.this);
                                mICRpcRequest.action = "triggerAction";
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put(upx.PRODUCT_ID, (Object) BioOpenActivity.access$600(BioOpenActivity.this));
                                jSONObject.put("module", (Object) BioOpenActivity.access$600(BioOpenActivity.this));
                                jSONObject.put("sceneId", (Object) BioOpenActivity.access$500(BioOpenActivity.this));
                                jSONObject.put("action", (Object) "triggerAction");
                                jSONObject.put("token", (Object) BioOpenActivity.access$900(BioOpenActivity.this));
                                jSONObject.put("bizId", (Object) BioOpenActivity.access$1000(BioOpenActivity.this));
                                mICRpcRequest.bizRequestData = jSONObject.toJSONString();
                                if (new MICRpcServiceBiz().trigger(mICRpcRequest) != null) {
                                    BioOpenActivity.this.runOnUiThread(new Runnable() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioOpenActivity.10.1
                                        public static volatile transient /* synthetic */ IpChange $ipChange;

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            IpChange ipChange3 = $ipChange;
                                            if (ipChange3 instanceof IpChange) {
                                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                            }
                                        }
                                    });
                                    return;
                                }
                                throw new Exception();
                            } catch (RpcException e) {
                                VerifyLogCat.e(BioOpenActivity.access$000(), e);
                                BioOpenActivity.this.runOnUiThread(new Runnable() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioOpenActivity.10.2
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        }
                                    }
                                });
                                throw e;
                            } catch (Exception e2) {
                                VerifyLogCat.e(BioOpenActivity.access$000(), e2);
                            }
                        }
                    }, "trigger rpc");
                }
                if ("BIC".equalsIgnoreCase(string2)) {
                    if (CommonConstant.FINGERPRINT_PAY.equalsIgnoreCase(this.R)) {
                        runOnUiThread(new Runnable() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioOpenActivity.7
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public final void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                BioOpenActivity bioOpenActivity = BioOpenActivity.this;
                                BioOpenActivity.access$700(bioOpenActivity, string3, BioOpenActivity.access$400(bioOpenActivity), string5, string4, BioOpenActivity.access$500(BioOpenActivity.this), BioOpenActivity.access$600(BioOpenActivity.this));
                            }
                        });
                    } else if (CommonConstant.FACEID_PAY.equalsIgnoreCase(this.R)) {
                        a(this.Q, string5, string4, this.l, this.R);
                    }
                } else if ("BIS".equalsIgnoreCase(string2) || "RESET_PWD".equalsIgnoreCase(string2)) {
                    String string6 = parseObject.getString("moduleData");
                    BioCheckManager bioCheckManager = this.m;
                    if (bioCheckManager != null) {
                        bioCheckManager.a(string3, string6, this.l, this.R, new VerifyCheckCallback() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioOpenActivity.8
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.alipay.mobile.verifyidentity.prodmanger.biopen.callback.VerifyCheckCallback
                            public final void a(VerifyIdentityResult verifyIdentityResult) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("8dca1d00", new Object[]{this, verifyIdentityResult});
                                } else if (verifyIdentityResult != null) {
                                    BioOpenActivity.access$800(BioOpenActivity.this, verifyIdentityResult.getCode(), string5, BioOpenActivity.access$400(BioOpenActivity.this), BioOpenActivity.access$500(BioOpenActivity.this), "");
                                } else {
                                    BioOpenActivity bioOpenActivity = BioOpenActivity.this;
                                    BioOpenActivity.access$800(bioOpenActivity, "1005", string5, BioOpenActivity.access$400(bioOpenActivity), BioOpenActivity.access$500(BioOpenActivity.this), "");
                                }
                            }
                        });
                    }
                }
            } catch (Exception unused) {
                d("1005", "", "", "", "");
            }
        }
    }
}
