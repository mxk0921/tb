package com.ali.user.open.oauth;

import android.content.Context;
import android.text.TextUtils;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.Site;
import com.ali.user.open.oauth.alipay3.AlipayOauthServiceProviderImpl;
import com.ali.user.open.oauth.damai.DamaiOauthServiceProviderImpl;
import com.ali.user.open.oauth.eleme.ElemeOauthServiceProviderImpl;
import com.ali.user.open.oauth.xianyu.XianyuOauthServiceProviderImpl;
import com.ali.user.open.service.SessionService;
import com.ali.user.open.service.impl.SessionManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class OauthServiceProviderFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile OauthServiceProviderFactory instance;
    private Map<String, OauthServiceProvider> mServiceProviderMap;

    private OauthServiceProviderFactory() {
        HashMap hashMap = new HashMap();
        this.mServiceProviderMap = hashMap;
        if (hashMap.isEmpty()) {
            HashMap hashMap2 = new HashMap();
            this.mServiceProviderMap = hashMap2;
            hashMap2.put("alipay", new AlipayOauthServiceProviderImpl());
            this.mServiceProviderMap.put("eleme", new ElemeOauthServiceProviderImpl());
            this.mServiceProviderMap.put(Site.DAMAI, new DamaiOauthServiceProviderImpl());
            this.mServiceProviderMap.put("xianyu", new XianyuOauthServiceProviderImpl());
        }
    }

    public static OauthServiceProviderFactory getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OauthServiceProviderFactory) ipChange.ipc$dispatch("67723aa0", new Object[0]);
        }
        if (instance == null) {
            synchronized (OauthServiceProviderFactory.class) {
                try {
                    if (instance == null) {
                        instance = new OauthServiceProviderFactory();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    public void cleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0f7d54b", new Object[]{this});
        } else {
            this.mServiceProviderMap.clear();
        }
    }

    public OauthServiceProvider getOauthServiceProvider(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OauthServiceProvider) ipChange.ipc$dispatch("6c09b728", new Object[]{this, str});
        }
        OauthServiceProvider oauthServiceProvider = this.mServiceProviderMap.get(str);
        if (oauthServiceProvider != null) {
            return oauthServiceProvider;
        }
        return new DefaultOauthServiceProviderImpl();
    }

    public List<String> logoutAll(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b26d803d", new Object[]{this, context});
        }
        ArrayList arrayList = new ArrayList();
        Set<String> allSessionSites = SessionManager.INSTANCE.getAllSessionSites();
        for (String str : this.mServiceProviderMap.keySet()) {
            if (this.mServiceProviderMap.get(str) != null && !TextUtils.equals(str, AliMemberSDK.getMasterSite())) {
                if (allSessionSites != null) {
                    allSessionSites.remove(str);
                }
                this.mServiceProviderMap.get(str).logout(context, str);
                arrayList.add(str);
            }
        }
        if (allSessionSites != null) {
            for (String str2 : allSessionSites) {
                try {
                    if (!TextUtils.equals(str2, AliMemberSDK.getMasterSite())) {
                        arrayList.add(str2);
                        ((SessionService) AliMemberSDK.getService(SessionService.class)).logout(str2);
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return arrayList;
    }

    public OauthServiceProvider putOauthServiceProvider(String str, OauthServiceProvider oauthServiceProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OauthServiceProvider) ipChange.ipc$dispatch("714f4987", new Object[]{this, str, oauthServiceProvider});
        }
        return this.mServiceProviderMap.put(str, oauthServiceProvider);
    }
}
