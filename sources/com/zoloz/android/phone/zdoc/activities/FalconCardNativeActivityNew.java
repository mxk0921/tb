package com.zoloz.android.phone.zdoc.activities;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.security.realidentity.ui.view.ALBiometricsActivityParentView;
import com.alipay.mobile.security.bio.service.BioAppDescription;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.BioUploadResult;
import com.alipay.mobile.security.bio.service.local.apsecurity.ApSecurityService;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.workspace.BioFragmentContainer;
import com.alipay.mobile.security.bio.workspace.BioFragmentResponse;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.zoloz.android.phone.zdoc.R;
import com.zoloz.android.phone.zdoc.constant.DocCodeConstants;
import com.zoloz.android.phone.zdoc.fragment.BaseDocFragment;
import com.zoloz.android.phone.zdoc.fragment.BaseFragment;
import com.zoloz.android.phone.zdoc.module.DocModule;
import com.zoloz.android.phone.zdoc.module.ZdocRemoteConfig;
import java.util.HashMap;
import java.util.Locale;
import tb.acq;
import tb.hl7;
import tb.k75;
import tb.q83;
import tb.spx;
import tb.t2o;
import tb.tpx;
import tb.upx;
import tb.vpx;
import tb.wuu;
import tb.xz8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class FalconCardNativeActivityNew extends BioFragmentContainer implements q83 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public upx b;
    public String c;
    public FrameLayout d;
    public Fragment e;
    public String f = "";
    public final Bundle g = new Bundle();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            dialogInterface.dismiss();
            FalconCardNativeActivityNew.l3(FalconCardNativeActivityNew.this, 205, null);
        }
    }

    static {
        t2o.a(245366890);
        t2o.a(245366924);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object ipc$super(FalconCardNativeActivityNew falconCardNativeActivityNew, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2012646654:
                FalconCardNativeActivityNew.super.onWindowFocusChanged(((Boolean) objArr[0]).booleanValue());
                return null;
            case -1504501726:
                FalconCardNativeActivityNew.super.onDestroy();
                return null;
            case -641568046:
                FalconCardNativeActivityNew.super.onCreate((Bundle) objArr[0]);
                return null;
            case 143326307:
                FalconCardNativeActivityNew.super.onBackPressed();
                return null;
            case 514894248:
                FalconCardNativeActivityNew.super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1257714799:
                FalconCardNativeActivityNew.super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1281559479:
                FalconCardNativeActivityNew.super.onRestart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/zoloz/android/phone/zdoc/activities/FalconCardNativeActivityNew");
        }
    }

    public static /* synthetic */ void l3(FalconCardNativeActivityNew falconCardNativeActivityNew, int i, BioUploadResult bioUploadResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f28b9268", new Object[]{falconCardNativeActivityNew, new Integer(i), bioUploadResult});
        } else {
            falconCardNativeActivityNew.s3(i, bioUploadResult);
        }
    }

    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        FalconCardNativeActivityNew.super.attachBaseContext(context);
        acq.B(context);
    }

    public void m3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9559024", new Object[]{this});
            return;
        }
        hl7 hl7Var = new hl7(this);
        if (!hl7Var.i()) {
            new tpx().c(upx.SYSTEM_EXCEPTION_ERROR);
            hl7Var.d(getString(R.string.system_error_title), getString(R.string.system_error_msg), getString(R.string.system_error_got_it), new a(), null, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n3() {
        try {
            Class<?> cls = Class.forName(this.f, true, getClassLoader());
            try {
                String p3 = p3(this.d.getId(), cls.getName());
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
                BaseDocFragment baseDocFragment = (BaseDocFragment) supportFragmentManager.findFragmentByTag(p3);
                Bundle bundle = this.g;
                if (baseDocFragment != null) {
                    if (baseDocFragment.getArguments() == null) {
                        try {
                            baseDocFragment.setArguments(bundle);
                        } catch (IllegalStateException unused) {
                        }
                    } else {
                        baseDocFragment.getArguments().putAll(bundle);
                    }
                    beginTransaction.attach(baseDocFragment);
                } else {
                    baseDocFragment = (BaseDocFragment) cls.newInstance();
                    baseDocFragment.setArguments(bundle);
                    beginTransaction.replace(this.d.getId(), baseDocFragment, p3);
                }
                beginTransaction.commitAllowingStateLoss();
                this.e = baseDocFragment;
            } catch (Exception e) {
                BioLog.e(e);
                m3();
            }
        } catch (ClassNotFoundException e2) {
            BioLog.e(e2);
            m3();
        }
    }

    public final void o3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3308211d", new Object[]{this});
            return;
        }
        this.d = new FrameLayout(this);
        this.d.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.d.setId(16908300);
        setContentView(this.d);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Fragment fragment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else if ((i >> 16) != 0 || (fragment = this.e) == null) {
            FalconCardNativeActivityNew.super.onActivityResult(i, i2, intent);
        } else {
            fragment.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        Fragment fragment = this.e;
        if (fragment instanceof BaseDocFragment) {
            z = ((BaseDocFragment) fragment).onBackPressed();
        }
        if (!z) {
            FalconCardNativeActivityNew.super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        requestWindowFeature(1);
        setRequestedOrientation(1);
        FalconCardNativeActivityNew.super.onCreate(bundle);
        if (BioServiceManager.getCurrentInstance() == null) {
            BioLog.e(new IllegalStateException("null == BioServiceManager.getCurrentInstance()"));
            finish();
            return;
        }
        BioAppDescription bioAppDescription = this.mBioAppDescription;
        if (bioAppDescription == null) {
            BioLog.e(new IllegalStateException("null == mBioAppDescription"));
            finish();
            return;
        }
        t3((String) bioAppDescription.getExtProperty().get("locale"));
        r3();
        xz8.a().b(this);
        o3();
        try {
            ParserConfig.getGlobalInstance().putDeserializer(DocModule.class, new spx());
            ZdocRemoteConfig zdocRemoteConfig = (ZdocRemoteConfig) JSON.parseObject(this.mBioAppDescription.getCfg(), ZdocRemoteConfig.class);
            if (zdocRemoteConfig.getCaptureMode() == 1) {
                this.f = "com.zoloz.android.phone.zdoc.fragment.ZdocScanTasksFragment";
            } else if (zdocRemoteConfig.getCaptureMode() == 2) {
                this.f = "com.zoloz.android.phone.zdoc.fragment.ZdocScanFancyFragment";
            } else {
                this.f = "com.zoloz.android.phone.zdoc.fragment.ZdocCaptureFragment";
            }
            this.g.putSerializable(ALBiometricsActivityParentView.p, this.mBioAppDescription);
            this.g.putSerializable("config", zdocRemoteConfig);
            n3();
        } catch (Exception e) {
            BioLog.e(e);
            finish();
        }
    }

    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        FalconCardNativeActivityNew.super.onDestroy();
        wuu.n();
    }

    public void onRestart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c630bb7", new Object[]{this});
            return;
        }
        FalconCardNativeActivityNew.super.onRestart();
        Fragment fragment = this.e;
        if (fragment != null && (fragment instanceof BaseFragment)) {
            ((BaseFragment) fragment).onRestart();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
            return;
        }
        FalconCardNativeActivityNew.super.onWindowFocusChanged(z);
        Fragment fragment = this.e;
        if (fragment != null) {
            ((BaseDocFragment) fragment).onWindowFocusChanged(z);
        }
    }

    public final String p3(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3a55206", new Object[]{this, new Integer(i), str});
        }
        return getClass().getSimpleName() + ":" + i + ":" + str;
    }

    public void q3(vpx vpxVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c249ef8", new Object[]{this, vpxVar});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(upx.ZDOC_RESULT, Integer.toString(vpxVar.b));
        if (this.b == null) {
            this.b = (upx) BioServiceManager.getCurrentInstance().getBioService(upx.class);
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("module", "zdoc");
        this.b.write(upx.ZTECH_EXIT, hashMap2);
        this.b.write(upx.END_ZDOC, hashMap);
        BioFragmentResponse bioFragmentResponse = new BioFragmentResponse();
        BioUploadResult bioUploadResult = vpxVar.c;
        if (bioUploadResult != null) {
            int i = bioUploadResult.productRetCode;
            if (i != 1001) {
                z = false;
            }
            bioFragmentResponse.isSucess = z;
            bioFragmentResponse.suggest = i;
            bioFragmentResponse.resultMessage = bioUploadResult.subMsg;
            bioFragmentResponse.ext.put("upload_response", JSON.toJSONString(bioUploadResult));
        }
        bioFragmentResponse.errorCode = vpxVar.b;
        bioFragmentResponse.ext.putAll(vpxVar.f30166a);
        bioFragmentResponse.token = getAppDescription().getBistoken();
        int i2 = vpxVar.b;
        if (i2 == 101 || i2 == 200) {
            String str = DocCodeConstants.b;
            bioFragmentResponse.subCode = str;
            bioFragmentResponse.subMsg = DocCodeConstants.a(str);
        } else if (i2 == 100) {
            String str2 = DocCodeConstants.b;
            bioFragmentResponse.subCode = str2;
            bioFragmentResponse.subMsg = DocCodeConstants.a(str2);
        } else if (i2 == 205) {
            String str3 = DocCodeConstants.f15141a;
            bioFragmentResponse.subCode = str3;
            bioFragmentResponse.subMsg = DocCodeConstants.a(str3);
        } else if (i2 == 209) {
            String str4 = DocCodeConstants.g;
            bioFragmentResponse.subCode = str4;
            bioFragmentResponse.subMsg = DocCodeConstants.a(str4);
        } else if (i2 == 202) {
            String str5 = DocCodeConstants.f;
            bioFragmentResponse.subCode = str5;
            bioFragmentResponse.subMsg = DocCodeConstants.a(str5);
        } else if (i2 == 203) {
            String str6 = DocCodeConstants.e;
            bioFragmentResponse.subCode = str6;
            bioFragmentResponse.subMsg = DocCodeConstants.a(str6);
        } else if (i2 == 207) {
            String str7 = DocCodeConstants.d;
            bioFragmentResponse.subCode = str7;
            bioFragmentResponse.subMsg = DocCodeConstants.a(str7);
        } else if (i2 == 208) {
            BioUploadResult bioUploadResult2 = vpxVar.c;
            if (bioUploadResult2 != null) {
                bioFragmentResponse.subCode = bioUploadResult2.subCode;
                bioFragmentResponse.subMsg = bioUploadResult2.subMsg;
            } else {
                String str8 = DocCodeConstants.h;
                bioFragmentResponse.subCode = str8;
                bioFragmentResponse.subMsg = DocCodeConstants.a(str8);
            }
        } else if (i2 == 301) {
            String str9 = DocCodeConstants.c;
            bioFragmentResponse.subCode = str9;
            bioFragmentResponse.subMsg = DocCodeConstants.a(str9);
        }
        sendResponse(bioFragmentResponse);
        finishActivity(false);
    }

    public final void r3() {
        ApSecurityService apSecurityService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8719c5b6", new Object[]{this});
            return;
        }
        if (this.b == null) {
            this.b = (upx) BioServiceManager.getCurrentInstance().getBioService(upx.class);
        }
        this.c = this.mBioAppDescription.getCfg();
        HashMap hashMap = new HashMap();
        hashMap.put(upx.PRODUCT_ID, "zoloz_zdoc");
        hashMap.put("sdkVersion", k75.VIDEOCONFIG_API_VERSION_3);
        hashMap.put(upx.BISTOKEN, this.mBioAppDescription.getBistoken());
        String staticApDidToken = ApSecurityService.getStaticApDidToken();
        if (TextUtils.isEmpty(staticApDidToken) && (apSecurityService = (ApSecurityService) BioServiceManager.getCurrentInstance().getBioService(ApSecurityService.class)) != null) {
            staticApDidToken = apSecurityService.getApDidToken();
        }
        hashMap.put(upx.APDIDTOKEN, staticApDidToken);
        this.b.addExtProperties(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("params", this.c);
        hashMap2.put("deviceBrand", Build.BRAND);
        this.b.write(upx.START_ZDOC, hashMap2);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("module", "zdoc");
        this.b.write(upx.ZTECH_ENTER, hashMap3);
    }

    public final void s3(int i, BioUploadResult bioUploadResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99f45ab", new Object[]{this, new Integer(i), bioUploadResult});
            return;
        }
        vpx vpxVar = new vpx();
        vpxVar.b = i;
        vpxVar.c = bioUploadResult;
        xz8.a().c(vpxVar);
    }

    public final void t3(String str) {
        Locale locale;
        LocaleList locales;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a585ed4", new Object[]{this, str});
        } else if (str != null) {
            try {
                Configuration configuration = getResources().getConfiguration();
                if (str.contains("-")) {
                    String[] split = str.split("-");
                    if (split.length == 2) {
                        locale = new Locale(split[0], split[1]);
                    } else if (split.length == 1) {
                        locale = new Locale(split[0]);
                    } else if (Build.VERSION.SDK_INT >= 24) {
                        locales = getResources().getConfiguration().getLocales();
                        locale = locales.get(0);
                    } else {
                        locale = getResources().getConfiguration().locale;
                    }
                } else {
                    locale = new Locale(str);
                }
                configuration.setLocale(locale);
                getBaseContext().getResources().updateConfiguration(configuration, getResources().getDisplayMetrics());
            } catch (Exception e) {
                BioLog.e(e);
            }
        }
    }
}
