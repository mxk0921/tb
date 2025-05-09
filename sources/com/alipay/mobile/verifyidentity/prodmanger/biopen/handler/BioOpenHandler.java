package com.alipay.mobile.verifyidentity.prodmanger.biopen.handler;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.data.VerifyIdentityResult;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.log.behavior.VerifyLogger;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.callback.BioCheckCallback;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.callback.VerifyCheckCallback;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.helper.BioOpenHelper;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.utils.BioCheckManager;
import com.alipay.mobile.verifyidentity.utils.CommonConstant;
import com.alipay.mobileic.core.model.rpc.MICProdmngResponse;
import com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.util.InstallServiceCallback;
import com.alipay.security.mobile.api.AuthenticatorApi;
import com.alipay.security.mobile.auth.AuthenticatorCallback;
import com.alipay.security.mobile.auth.IAuthenticator;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.alipay.security.mobile.auth.message.AuthenticatorResponse;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import tb.upx;
import tb.yj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BioOpenHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public AuthenticatorManager f4354a;
    public BioCheckManager b;
    public String c;
    public String d;
    public String e;
    public String f;
    public BioOpenCallback g;
    public Context h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface BioOpenCallback {
        void a(String str, boolean z);
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : "com.alipay.mobile.verifyidentity.prodmanger.biopen.handler.BioOpenHandler";
    }

    public static /* synthetic */ String b(BioOpenHandler bioOpenHandler) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1b882de7", new Object[]{bioOpenHandler}) : bioOpenHandler.e;
    }

    public static /* synthetic */ AuthenticatorManager c(BioOpenHandler bioOpenHandler) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AuthenticatorManager) ipChange.ipc$dispatch("1e4bc286", new Object[]{bioOpenHandler}) : bioOpenHandler.f4354a;
    }

    public static /* synthetic */ BioCheckManager d(BioOpenHandler bioOpenHandler) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BioCheckManager) ipChange.ipc$dispatch("b89ef3c1", new Object[]{bioOpenHandler}) : bioOpenHandler.b;
    }

    public static /* synthetic */ String e(BioOpenHandler bioOpenHandler) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aaadc9ea", new Object[]{bioOpenHandler}) : bioOpenHandler.d;
    }

    public final void f(final String str, Map<String, String> map, final Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff12c8e1", new Object[]{this, str, map, bundle});
            return;
        }
        final String str2 = map.get("module");
        final String str3 = map.get("action");
        if (!TextUtils.isEmpty(map.get(Constants.VI_ENGINE_VERIFYID))) {
            String str4 = map.get(Constants.VI_ENGINE_VERIFYID);
            String str5 = map.get("moduleData");
            BioCheckManager bioCheckManager = this.b;
            if (bioCheckManager != null) {
                bioCheckManager.a(str4, str5, this.d, this.c, new VerifyCheckCallback() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.handler.BioOpenHandler.11
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.mobile.verifyidentity.prodmanger.biopen.callback.VerifyCheckCallback
                    public final void a(VerifyIdentityResult verifyIdentityResult) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dca1d00", new Object[]{this, verifyIdentityResult});
                        } else if (verifyIdentityResult == null) {
                            BioOpenHandler.a(BioOpenHandler.this, "1003", true);
                        } else if ("1000".equalsIgnoreCase(verifyIdentityResult.getCode())) {
                            BioOpenHandler.a(BioOpenHandler.this, str, str2, str3, bundle);
                        } else if ("2006".equalsIgnoreCase(verifyIdentityResult.getCode())) {
                            BioOpenHandler.a(BioOpenHandler.this, "2006", true);
                        } else {
                            BioOpenHandler.a(BioOpenHandler.this, "1003", true);
                        }
                    }
                });
            }
        }
    }

    public final void i(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d257bc1", new Object[]{this, str, new Boolean(z)});
            return;
        }
        BioOpenCallback bioOpenCallback = this.g;
        if (bioOpenCallback != null) {
            bioOpenCallback.a(str, z);
        }
    }

    public static /* synthetic */ String a(BioOpenHandler bioOpenHandler) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ebd0f9e6", new Object[]{bioOpenHandler}) : bioOpenHandler.c;
    }

    public static /* synthetic */ void b(BioOpenHandler bioOpenHandler, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa3e1963", new Object[]{bioOpenHandler, str});
        } else {
            bioOpenHandler.i(str, false);
        }
    }

    public final void c(int i, String str, final String str2, final String str3, final String str4, final Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5875cf31", new Object[]{this, new Integer(i), str, str2, str3, str4, bundle});
            return;
        }
        BioCheckManager bioCheckManager = this.b;
        if (bioCheckManager != null) {
            bioCheckManager.a(i, str, this.d, this.c, new BioCheckCallback() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.handler.BioOpenHandler.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.verifyidentity.prodmanger.biopen.callback.BioCheckCallback
                public final void onBioCheckResult(AuthenticatorResponse authenticatorResponse) {
                    Bundle bundle2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("51346624", new Object[]{this, authenticatorResponse});
                    } else if (authenticatorResponse == null || !"100".equalsIgnoreCase(String.valueOf(authenticatorResponse.getResult()))) {
                        VerifyLogCat.i(BioOpenHandler.a(), "校验人脸失败");
                        BioOpenHandler.a(BioOpenHandler.this, "1003", true);
                    } else if (authenticatorResponse.getData() != null && (bundle2 = bundle) != null) {
                        bundle2.putString("data", authenticatorResponse.getData());
                        BioOpenHandler.a(BioOpenHandler.this, str2, str3, str4, bundle);
                    }
                }
            });
        }
    }

    public final void d(String str, String str2, String str3, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b732ce", new Object[]{this, str, str2, str3, bundle});
        } else {
            BioOpenHelper.doBioRpcRequest(str, str2, str3, bundle, new BioOpenHelper.RpcCallBack() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.handler.BioOpenHandler.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.verifyidentity.prodmanger.biopen.helper.BioOpenHelper.RpcCallBack
                public final void onResult(String str4, String str5, String str6, boolean z, MICProdmngResponse mICProdmngResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c40fbbe1", new Object[]{this, str4, str5, str6, new Boolean(z), mICProdmngResponse});
                    } else if (mICProdmngResponse == null) {
                        BioOpenHandler.a(BioOpenHandler.this, "2003", true);
                    } else if (!"1000".equalsIgnoreCase(str6)) {
                        BioOpenHandler.a(BioOpenHandler.this, str6, z);
                    } else {
                        BioOpenHandler.a(BioOpenHandler.this, mICProdmngResponse, str5);
                    }
                }
            });
        }
    }

    public final void e(final String str, String str2, final String str3, final Map<String, String> map, final Bundle bundle) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acd547f5", new Object[]{this, str, str2, str3, map, bundle});
        } else if ("not_install_ifaa".equalsIgnoreCase(str2)) {
            VerifyLogCat.i("com.alipay.mobile.verifyidentity.prodmanger.biopen.handler.BioOpenHandler", "未安装服务");
            String string = bundle.getString("alertText");
            Bundle bundle2 = new Bundle();
            if (TextUtils.isEmpty(string)) {
                if ("1".equalsIgnoreCase(this.e)) {
                    string = MicroModuleContext.getInstance().getContext().getResources().getString(R.string.finger_guide_not_install);
                } else if ("4".equalsIgnoreCase(this.e)) {
                    string = MicroModuleContext.getInstance().getContext().getResources().getString(R.string.face_guide_not_install);
                }
            }
            bundle2.putBoolean(CommonConstant.alertTextColor, true);
            MicroModuleContext.getInstance().alert(null, string, MicroModuleContext.getInstance().getContext().getResources().getString(R.string.finger_install), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.handler.BioOpenHandler.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    AuthenticatorManager.getInstance(MicroModuleContext.getInstance().getContext()).downloadIfaaService(MicroModuleContext.getInstance().getContext(), new InstallServiceCallback(this) { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.handler.BioOpenHandler.5.1
                        public final void onCancel() {
                            VerifyLogCat.i(BioOpenHandler.a(), "detail download ifaa cancel");
                        }

                        public final void onFailed() {
                            VerifyLogCat.i(BioOpenHandler.a(), "detail download ifaa failed");
                        }

                        public final void onFinish() {
                            VerifyLogCat.i(BioOpenHandler.a(), "detail download ifaa finish");
                        }
                    });
                    BioOpenHandler.a(BioOpenHandler.this, "1003", false);
                }
            }, MicroModuleContext.getInstance().getContext().getResources().getString(R.string.finger_cancel), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.handler.BioOpenHandler.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    } else {
                        BioOpenHandler.a(BioOpenHandler.this, "1003", true);
                    }
                }
            }, bundle2);
        } else if ("not_exist_bic_feature".equalsIgnoreCase(str2)) {
            Bundle bundle3 = new Bundle();
            bundle3.putBoolean(CommonConstant.alertTextColor, true);
            if (CommonConstant.FINGERPRINT_PAY.equalsIgnoreCase(this.c)) {
                str4 = MicroModuleContext.getInstance().getContext().getResources().getString(R.string.finger_guide_print);
            } else if (CommonConstant.FACEID_PAY.equalsIgnoreCase(this.c)) {
                str4 = MicroModuleContext.getInstance().getContext().getResources().getString(R.string.face_guide_print);
            } else {
                str4 = "";
            }
            MicroModuleContext.getInstance().alert(null, str4, MicroModuleContext.getInstance().getContext().getResources().getString(R.string.finger_register), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.handler.BioOpenHandler.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    BioOpenHandler.c(BioOpenHandler.this).startBioManager(Integer.valueOf(BioOpenHandler.b(BioOpenHandler.this)).intValue());
                    BioOpenHandler.a(BioOpenHandler.this, "RETRY_FINNGER", true);
                    BioOpenHandler.a(BioOpenHandler.this, "UC-MobileIC-20180315-5", "1");
                }
            }, MicroModuleContext.getInstance().getContext().getResources().getString(R.string.finger_cancel), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.handler.BioOpenHandler.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    VerifyLogCat.i(BioOpenHandler.a(), "cancel");
                    BioOpenHandler.a(BioOpenHandler.this, "1003", true);
                    BioOpenHandler.a(BioOpenHandler.this, "UC-MobileIC-20180315-5", "0");
                }
            }, bundle3);
        } else if (CommonConstant.FINGERPRINT_PAY.equalsIgnoreCase(this.c)) {
            ((Activity) this.h).runOnUiThread(new Runnable() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.handler.BioOpenHandler.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (BioOpenHandler.d(BioOpenHandler.this) == null || TextUtils.isEmpty(BioOpenHandler.b(BioOpenHandler.this))) {
                        BioOpenHandler.a(BioOpenHandler.this, "1003", true);
                    } else {
                        BioCheckManager d = BioOpenHandler.d(BioOpenHandler.this);
                        Map map2 = map;
                        if (map2 != null) {
                            map2.get(Constants.VI_ENGINE_VERIFYID);
                        }
                        d.a(Integer.valueOf(BioOpenHandler.b(BioOpenHandler.this)).intValue(), str3, BioOpenHandler.e(BioOpenHandler.this), BioOpenHandler.a(BioOpenHandler.this), new BioCheckCallback() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.handler.BioOpenHandler.9.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.alipay.mobile.verifyidentity.prodmanger.biopen.callback.BioCheckCallback
                            public final void onBioCheckResult(AuthenticatorResponse authenticatorResponse) {
                                Bundle bundle4;
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("51346624", new Object[]{this, authenticatorResponse});
                                } else if (authenticatorResponse == null || !"100".equalsIgnoreCase(String.valueOf(authenticatorResponse.getResult()))) {
                                    VerifyLogCat.i(BioOpenHandler.a(), "指纹校验取消/失败");
                                    BioOpenHandler.a(BioOpenHandler.this, "1003", true);
                                } else {
                                    if (!(authenticatorResponse.getData() == null || (bundle4 = bundle) == null)) {
                                        bundle4.putString("data", authenticatorResponse.getData());
                                    }
                                    AnonymousClass9 r6 = AnonymousClass9.this;
                                    BioOpenHandler.b(BioOpenHandler.this, str, map, bundle);
                                }
                            }
                        });
                    }
                }
            });
        } else if (CommonConstant.FACEID_PAY.equalsIgnoreCase(this.c)) {
            final String str5 = map.get("module");
            final String str6 = map.get("action");
            if (!TextUtils.isEmpty(map.get(Constants.VI_ENGINE_VERIFYID))) {
                final String str7 = map.get(Constants.VI_ENGINE_VERIFYID);
                String str8 = map.get("moduleData");
                VerifyLogCat.i("com.alipay.mobile.verifyidentity.prodmanger.biopen.handler.BioOpenHandler", "调起核身做密码校验");
                BioCheckManager bioCheckManager = this.b;
                if (bioCheckManager != null) {
                    bioCheckManager.a(str7, str8, this.d, this.c, new VerifyCheckCallback() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.handler.BioOpenHandler.10
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.alipay.mobile.verifyidentity.prodmanger.biopen.callback.VerifyCheckCallback
                        public final void a(VerifyIdentityResult verifyIdentityResult) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8dca1d00", new Object[]{this, verifyIdentityResult});
                                return;
                            }
                            if (verifyIdentityResult != null) {
                                if (!"1000".equalsIgnoreCase(verifyIdentityResult.getCode())) {
                                    VerifyLogCat.i(BioOpenHandler.a(), "核身密码校验失败");
                                } else if (!TextUtils.isEmpty(BioOpenHandler.b(BioOpenHandler.this))) {
                                    BioOpenHandler bioOpenHandler = BioOpenHandler.this;
                                    BioOpenHandler.a(bioOpenHandler, Integer.valueOf(BioOpenHandler.b(bioOpenHandler)).intValue(), str3, str, str5, str6, bundle);
                                    return;
                                } else {
                                    BioOpenHandler.a(BioOpenHandler.this, "1003", true);
                                    return;
                                }
                            }
                            BioOpenHandler.a(BioOpenHandler.this, "1003", true);
                        }
                    });
                }
            } else if (!TextUtils.isEmpty(this.e)) {
                c(Integer.valueOf(this.e).intValue(), str3, str, str5, str6, bundle);
            } else {
                g("1003", true);
            }
        } else if (CommonConstant.FACE_PAY.equalsIgnoreCase(this.c)) {
            f(str, map, bundle);
        }
    }

    public static /* synthetic */ String a(BioOpenHandler bioOpenHandler, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dcbed7dc", new Object[]{bioOpenHandler, str}) : bioOpenHandler.b(str);
    }

    public final String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        try {
            JSONObject jSONObject = JSON.parseObject(str).getJSONObject("pageModel");
            if (jSONObject == null) {
                return "";
            }
            String string = jSONObject.getString("registerCommand");
            this.e = jSONObject.getString(yj4.PARAM_PRODUCT_TYPE);
            VerifyLogCat.i("com.alipay.mobile.verifyidentity.prodmanger.biopen.handler.BioOpenHandler", "registerCommand:" + string);
            return string;
        } catch (Exception unused) {
            g("1005", true);
            VerifyLogCat.e("com.alipay.mobile.verifyidentity.prodmanger.biopen.handler.BioOpenHandler", "json fail");
            return null;
        }
    }

    public final void g(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
        } else if ("true".equalsIgnoreCase(this.f)) {
            if ("RPC_EXCEPTION".equalsIgnoreCase(str)) {
                i("2003", false);
                return;
            }
            if (!"SYSTEM_ERROR".equalsIgnoreCase(str)) {
                if ("1003".equalsIgnoreCase(str)) {
                    i("1003", false);
                    return;
                } else if ("2006".equalsIgnoreCase(str)) {
                    i("2006", false);
                    return;
                }
            }
            i("1001", false);
        } else if ("true".equalsIgnoreCase(this.f) || !z) {
            i(str, false);
        } else {
            i(str, true);
        }
    }

    public final void h(boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da24c280", new Object[]{this, new Boolean(z), str, str2});
        } else if ("true".equalsIgnoreCase(this.f)) {
            i(str2, false);
        } else if (!z) {
            i("1001", true);
        } else if ("REGISTER_BIO_SUBMIT".equalsIgnoreCase(str)) {
            i("OPEN_SUCCESS", false);
        } else if ("CLOSE_BIO".equalsIgnoreCase(str)) {
            i("CLOSE_SUCCESS", false);
        }
    }

    public static /* synthetic */ void a(BioOpenHandler bioOpenHandler, int i, String str, String str2, String str3, String str4, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ba811c3", new Object[]{bioOpenHandler, new Integer(i), str, str2, str3, str4, bundle});
        } else {
            bioOpenHandler.c(i, str, str2, str3, str4, bundle);
        }
    }

    public static /* synthetic */ void a(BioOpenHandler bioOpenHandler, String str, String str2, String str3, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98e3657c", new Object[]{bioOpenHandler, str, str2, str3, bundle});
        } else {
            bioOpenHandler.d(str, str2, str3, bundle);
        }
    }

    public static /* synthetic */ void a(BioOpenHandler bioOpenHandler, String str, String str2, String str3, Map map, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ca3a387", new Object[]{bioOpenHandler, str, str2, str3, map, bundle});
        } else {
            bioOpenHandler.e(str, str2, str3, map, bundle);
        }
    }

    public static /* synthetic */ void a(BioOpenHandler bioOpenHandler, String str, Map map, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8588573", new Object[]{bioOpenHandler, str, map, bundle});
        } else {
            bioOpenHandler.f(str, map, bundle);
        }
    }

    public static /* synthetic */ void a(BioOpenHandler bioOpenHandler, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ecb8e10", new Object[]{bioOpenHandler, str, new Boolean(z)});
        } else {
            bioOpenHandler.g(str, z);
        }
    }

    public final void a(Context context, Bundle bundle, BioOpenCallback bioOpenCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4395dc7b", new Object[]{this, context, bundle, bioOpenCallback});
            return;
        }
        this.h = context;
        this.g = bioOpenCallback;
        this.f4354a = AuthenticatorManager.getInstance(context);
        this.b = new BioCheckManager(this.h);
        if (bundle != null) {
            String string = bundle.getString("action");
            if ("REGISTER_BIO_SUBMIT".equalsIgnoreCase(string)) {
                VerifyLogCat.i("com.alipay.mobile.verifyidentity.prodmanger.biopen.handler.BioOpenHandler", "无UI模式，进行生物校验");
                Bundle bundle2 = bundle.getBundle("extParams");
                String string2 = bundle.getString("module");
                String string3 = bundle.getString("token");
                String string4 = bundle.getString("code");
                HashMap hashMap = new HashMap();
                this.e = bundle.getString(yj4.PARAM_PRODUCT_TYPE);
                String string5 = bundle.getString(Constants.VI_ENGINE_FAST_MODULENAME);
                if (!TextUtils.isEmpty(string5)) {
                    try {
                        JSONObject parseObject = JSON.parseObject(string5);
                        if (parseObject != null) {
                            for (String str : parseObject.keySet()) {
                                hashMap.put(str, parseObject.getString(str));
                            }
                        }
                    } catch (Exception unused) {
                        VerifyLogCat.e("com.alipay.mobile.verifyidentity.prodmanger.biopen.handler.BioOpenHandler", "json fail");
                        g("1005", true);
                    }
                }
                if (bundle2 != null) {
                    this.c = bundle2.getString(upx.PRODUCT_ID);
                    this.f = bundle2.getString("forbidUI");
                    this.d = bundle2.getString("sceneId");
                    bundle2.putString(yj4.PARAM_PRODUCT_TYPE, this.e);
                }
                if ("BIC".equalsIgnoreCase(string2)) {
                    e(string3, string4, bundle.getString("registerCommand"), hashMap, bundle2);
                } else if ("BIS".equalsIgnoreCase(string2)) {
                    f(string3, hashMap, bundle2);
                }
            } else {
                String string6 = bundle.getString("module");
                String string7 = bundle.getString("token");
                final Bundle bundle3 = bundle.getBundle("extParams");
                this.c = bundle.getString(upx.PRODUCT_ID);
                if (bundle3 != null) {
                    this.d = bundle3.getString("sceneId");
                    bundle3.putString(upx.PRODUCT_ID, this.c);
                }
                if ("open".equalsIgnoreCase(bundle.getString("status"))) {
                    BioOpenHelper.doBioRpcRequest(string7, string6, string, bundle3, new BioOpenHelper.RpcCallBack() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.handler.BioOpenHandler.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.alipay.mobile.verifyidentity.prodmanger.biopen.helper.BioOpenHelper.RpcCallBack
                        public final void onResult(String str2, String str3, String str4, boolean z, MICProdmngResponse mICProdmngResponse) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("c40fbbe1", new Object[]{this, str2, str3, str4, new Boolean(z), mICProdmngResponse});
                            } else if (mICProdmngResponse == null) {
                                BioOpenHandler.a(BioOpenHandler.this, "2003", true);
                            } else if ("1000".equalsIgnoreCase(str4)) {
                                if (CommonConstant.FACELOGIN.equalsIgnoreCase(BioOpenHandler.a(BioOpenHandler.this))) {
                                    BioOpenHandler.a(BioOpenHandler.this, str2, mICProdmngResponse.nextStep, bundle3);
                                    return;
                                }
                                BioOpenHandler bioOpenHandler = BioOpenHandler.this;
                                BioOpenHandler.a(bioOpenHandler, mICProdmngResponse.token, mICProdmngResponse.code, BioOpenHandler.a(bioOpenHandler, JSON.toJSONString(mICProdmngResponse.data)), mICProdmngResponse.nextStep, bundle3);
                            } else if ("1004".equalsIgnoreCase(str4)) {
                                BioOpenHandler.b(BioOpenHandler.this, "OPEN_SUCCESS");
                            } else {
                                BioOpenHandler.a(BioOpenHandler.this, str4, z);
                            }
                        }
                    });
                } else if ("close".equalsIgnoreCase(bundle.getString("status"))) {
                    d(string7, string6, string, bundle3);
                }
            }
        }
    }

    public static /* synthetic */ void b(BioOpenHandler bioOpenHandler, final String str, Map map, final Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0f409d2", new Object[]{bioOpenHandler, str, map, bundle});
            return;
        }
        final String str2 = (String) map.get("module");
        final String str3 = (String) map.get("action");
        if (!TextUtils.isEmpty((CharSequence) map.get(Constants.VI_ENGINE_VERIFYID))) {
            String str4 = (String) map.get(Constants.VI_ENGINE_VERIFYID);
            String str5 = (String) map.get("moduleData");
            VerifyLogCat.i("com.alipay.mobile.verifyidentity.prodmanger.biopen.handler.BioOpenHandler", "调起核身做密码校验");
            BioCheckManager bioCheckManager = bioOpenHandler.b;
            if (bioCheckManager != null) {
                bioCheckManager.a(str4, str5, bioOpenHandler.d, bioOpenHandler.c, new VerifyCheckCallback() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.handler.BioOpenHandler.12
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.mobile.verifyidentity.prodmanger.biopen.callback.VerifyCheckCallback
                    public final void a(VerifyIdentityResult verifyIdentityResult) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dca1d00", new Object[]{this, verifyIdentityResult});
                            return;
                        }
                        if (verifyIdentityResult != null) {
                            if ("1000".equalsIgnoreCase(verifyIdentityResult.getCode())) {
                                BioOpenHandler.a(BioOpenHandler.this, str, str2, str3, bundle);
                                return;
                            }
                            VerifyLogCat.i(BioOpenHandler.a(), "核身密码校验失败/取消");
                        }
                        BioOpenHandler.a(BioOpenHandler.this, "1003", true);
                    }
                });
                return;
            }
            return;
        }
        bioOpenHandler.d(str, str2, str3, bundle);
    }

    public static /* synthetic */ void a(BioOpenHandler bioOpenHandler, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fdcae0e", new Object[]{bioOpenHandler, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sysSelectCode", str2);
        hashMap.put("sceneId", bioOpenHandler.d);
        hashMap.put(upx.PRODUCT_ID, bioOpenHandler.c);
        VerifyLogger.getInstance().eventBehavior(str, "", "", "", hashMap);
    }

    public static /* synthetic */ void a(BioOpenHandler bioOpenHandler, MICProdmngResponse mICProdmngResponse, String str) {
        IAuthenticator iAuthenticator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fefff544", new Object[]{bioOpenHandler, mICProdmngResponse, str});
        } else if (!mICProdmngResponse.success || !"REGISTER_BIO_SUBMIT".equalsIgnoreCase(str) || !mICProdmngResponse.finish) {
            if (mICProdmngResponse.success && "CLOSE_BIO".equalsIgnoreCase(str) && mICProdmngResponse.finish) {
                if ("1000".equalsIgnoreCase(mICProdmngResponse.finishCode)) {
                    if (CommonConstant.FINGERPRINT_PAY.equalsIgnoreCase(bioOpenHandler.c)) {
                        iAuthenticator = AuthenticatorApi.create(MicroModuleContext.getInstance().getContext(), 1);
                    } else {
                        iAuthenticator = CommonConstant.FACEID_PAY.equalsIgnoreCase(bioOpenHandler.c) ? AuthenticatorApi.create(MicroModuleContext.getInstance().getContext(), 4) : null;
                    }
                    Map<String, String> map = mICProdmngResponse.data;
                    if (map != null) {
                        try {
                            iAuthenticator.process(new AuthenticatorMessage(4, 2, JSON.parseObject(map.get("pageModel")).getString("closeRequestData")), new AuthenticatorCallback() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.handler.BioOpenHandler.4
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.alipay.security.mobile.auth.AuthenticatorCallback
                                public final void callback(AuthenticatorResponse authenticatorResponse) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("e8b9fa1b", new Object[]{this, authenticatorResponse});
                                        return;
                                    }
                                    String a2 = BioOpenHandler.a();
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(authenticatorResponse.getResult());
                                    VerifyLogCat.i(a2, sb.toString());
                                }
                            });
                        } catch (Exception unused) {
                            bioOpenHandler.g("1005", true);
                            VerifyLogCat.e("com.alipay.mobile.verifyidentity.prodmanger.biopen.handler.BioOpenHandler", "json fail");
                        }
                    }
                    bioOpenHandler.h(true, str, "1000");
                    return;
                }
                bioOpenHandler.h(false, str, "1001");
            }
        } else if ("1000".equalsIgnoreCase(mICProdmngResponse.finishCode)) {
            bioOpenHandler.h(true, str, "1000");
        } else {
            bioOpenHandler.h(false, str, "1001");
        }
    }
}
