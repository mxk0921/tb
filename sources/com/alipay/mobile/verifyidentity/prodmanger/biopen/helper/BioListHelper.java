package com.alipay.mobile.verifyidentity.prodmanger.biopen.helper;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.info.EnvInfoUtil;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.log.behavior.VerifyLogger;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.data.BioPageData;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.data.MenuGroup;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity;
import com.alipay.mobile.verifyidentity.rpc.RpcException;
import com.alipay.mobile.verifyidentity.rpc.biz.MICRpcServiceBiz;
import com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor;
import com.alipay.mobileic.core.model.rpc.MICProdmngRequest;
import com.alipay.mobileic.core.model.rpc.MICProdmngResponse;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BioListHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static long f4368a;

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            MicroModuleContext.getInstance().toast(MicroModuleContext.getInstance().getContext().getResources().getString(R.string.vi_system_error), R.drawable.vi_warning, 0);
        }
    }

    public static /* synthetic */ void access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1bc42b8", new Object[0]);
        } else {
            b();
        }
    }

    public static /* synthetic */ String access$200() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("682607c7", new Object[0]);
        }
        return "BioListHelper";
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else {
            MicroModuleContext.getInstance().toast(MicroModuleContext.getInstance().getContext().getResources().getString(R.string.vi_network_error), R.drawable.vi_warning, 0);
        }
    }

    public static void doBioListRequest(final String str, final Bundle bundle) {
        final Bundle bundle2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6547d9cf", new Object[]{str, bundle});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - f4368a;
        if (0 >= j || j >= 1000) {
            f4368a = elapsedRealtime;
            if (bundle == null) {
                bundle2 = new Bundle();
            } else {
                bundle2 = bundle;
            }
            AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.helper.BioListHelper.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        MicroModuleContext.getInstance().showProgressDialog("");
                        MICProdmngRequest mICProdmngRequest = new MICProdmngRequest();
                        mICProdmngRequest.envData = EnvInfoUtil.getBaseEnvData();
                        mICProdmngRequest.module = str;
                        mICProdmngRequest.action = "query";
                        mICProdmngRequest.params = new HashMap();
                        for (String str2 : bundle2.keySet()) {
                            mICProdmngRequest.params.put(str2, bundle2.get(str2));
                        }
                        BioListHelper.access$000(new MICRpcServiceBiz().prodmng(mICProdmngRequest), str, bundle);
                        MicroModuleContext.getInstance().dismissProgressDialog();
                    } catch (RpcException unused) {
                        MicroModuleContext.getInstance().dismissProgressDialog();
                        BioListHelper.access$100();
                        VerifyLogCat.e(BioListHelper.access$200(), "RpcException");
                    }
                }
            }, "QUERY_BIO_LIST");
        }
    }

    public static /* synthetic */ void access$000(MICProdmngResponse mICProdmngResponse, String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eead850d", new Object[]{mICProdmngResponse, str, bundle});
        } else if (mICProdmngResponse == null) {
            VerifyLogCat.i("BioListHelper", "产品列表页面请求rpc异常 response: " + mICProdmngResponse);
            b();
        } else {
            if (bundle != null) {
                String string = bundle.getString("sceneId");
                String valueOf = String.valueOf(mICProdmngResponse.success);
                String str2 = mICProdmngResponse.code;
                String valueOf2 = String.valueOf(mICProdmngResponse.finish);
                HashMap hashMap = new HashMap();
                hashMap.put("success", valueOf);
                hashMap.put("module", str);
                hashMap.put("code", str2);
                hashMap.put("finish", valueOf2);
                hashMap.put("sceneId", string);
                VerifyLogger.getInstance().eventBehavior("UC-MobileIC-20180830-1", "", "", "", hashMap);
            }
            Map<String, String> map = mICProdmngResponse.data;
            if (map == null) {
                b();
            } else if (!mICProdmngResponse.success) {
                a();
            } else if (map != null) {
                String str3 = map.get("result");
                String str4 = mICProdmngResponse.data.get("introduceText");
                String str5 = mICProdmngResponse.data.get("introduceUrl");
                VerifyLogCat.i("BioListHelper", "产品列表页面请求rpc结果，bioListData: " + str3 + ", introduceText: " + str4 + ", introduceUrl: " + str5);
                if (TextUtils.isEmpty(str3)) {
                    a();
                    return;
                }
                try {
                    BioPageData bioPageData = (BioPageData) JSON.parseObject(str3, BioPageData.class);
                    if (str3 == null) {
                        a();
                    } else {
                        List<MenuGroup> list = bioPageData.menuGroup;
                        if (!(list == null || list.get(0) == null)) {
                            if (bioPageData.menuGroup.get(0).menus == null) {
                                a();
                            }
                        }
                        a();
                    }
                } catch (Exception unused) {
                    VerifyLogCat.i("BioListHelper", "json fail");
                    a();
                }
                Intent intent = new Intent(MicroModuleContext.getInstance().getContext(), BioListActivity.class);
                Bundle bundle2 = new Bundle();
                bundle2.putString("bioListData", str3);
                bundle2.putString("biolistintroducetxt", str4);
                bundle2.putString("biolistintrodicturl", str5);
                bundle2.putBundle("initParams", bundle);
                intent.putExtras(bundle2);
                MicroModuleContext.getInstance().startProdActivityByContext(intent);
            } else {
                a();
            }
        }
    }
}
