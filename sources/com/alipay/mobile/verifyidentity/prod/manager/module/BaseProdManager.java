package com.alipay.mobile.verifyidentity.prod.manager.module;

import android.os.Bundle;
import com.alipay.mobile.verifyidentity.callback.ProdManagerListener;
import com.alipay.mobile.verifyidentity.callback.RecommendBioListener;
import com.alipay.mobile.verifyidentity.data.ProdManagerResult;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class BaseProdManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f4341a = getClass().getSimpleName();
    public ProdManagerListener mListener;
    public String mName;
    public RecommendBioListener mRecommandListener;
    public String mToken;

    public void callback(ProdManagerResult prodManagerResult, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c197fae", new Object[]{this, prodManagerResult, hashMap});
        } else if (this.mListener == null) {
            VerifyLogCat.w(this.f4341a, "调用方没有传入回调，放弃回调");
        } else {
            if (hashMap != null) {
                if (prodManagerResult.getExtInfo() == null) {
                    prodManagerResult.setExtInfo(new HashMap<>());
                }
                prodManagerResult.getExtInfo().putAll(hashMap);
            }
            this.mListener.onResult(this.mToken, prodManagerResult);
        }
    }

    public final void create(String str, String str2, String str3, String str4, String str5, Bundle bundle, ProdManagerListener prodManagerListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be930de0", new Object[]{this, str, str2, str3, str4, str5, bundle, prodManagerListener});
            return;
        }
        MicroModuleContext.getInstance().addProManager(str, this);
        this.mToken = str;
        this.mListener = prodManagerListener;
        onCreate(str, str2, str3, str4, str5, bundle);
    }

    public abstract void onCreate(String str, String str2, Bundle bundle);

    public abstract void onCreate(String str, String str2, String str3, String str4, String str5, Bundle bundle);

    public abstract void onDestroy();

    public abstract void onStart();

    public final void create(String str, String str2, Bundle bundle, RecommendBioListener recommendBioListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53793c64", new Object[]{this, str, str2, bundle, recommendBioListener});
            return;
        }
        MicroModuleContext.getInstance().addProManager(str, this);
        this.mToken = str;
        this.mRecommandListener = recommendBioListener;
        onCreate(str, str2, bundle);
    }

    public void callback(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca1da916", new Object[]{this, str});
            return;
        }
        RecommendBioListener recommendBioListener = this.mRecommandListener;
        if (recommendBioListener == null) {
            VerifyLogCat.w(this.f4341a, "调用方没有传入回调，放弃回调");
        } else {
            recommendBioListener.onResult(str);
        }
    }
}
