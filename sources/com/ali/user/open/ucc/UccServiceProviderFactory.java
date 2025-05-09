package com.ali.user.open.ucc;

import com.ali.user.open.core.Site;
import com.ali.user.open.ucc.alipay3.AlipayUccServiceProviderImpl;
import com.ali.user.open.ucc.eleme.ElemeUccServiceProviderImpl;
import com.ali.user.open.ucc.icbu.IcbuUccServiceProviderImpl;
import com.ali.user.open.ucc.jiuyou.JiuYouUccServiceProviderImpl;
import com.ali.user.open.ucc.netease.NeteaseUccServiceProviderImpl;
import com.ali.user.open.ucc.qq.QQUccServiceProviderImpl;
import com.ali.user.open.ucc.taobao.TaobaoUccServiceProviderImpl;
import com.ali.user.open.ucc.wechat.WechatUccServiceProviderImpl;
import com.ali.user.open.ucc.weibo.WeiboUccServiceProviderImpl;
import com.ali.user.open.ucc.xianyu.XianyuUccServiceProviderImpl;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UccServiceProviderFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile UccServiceProviderFactory instance;
    private Map<String, UccServiceProvider> mUccServiceProviderMap;

    static {
        t2o.a(76546083);
    }

    private UccServiceProviderFactory() {
        HashMap hashMap = new HashMap();
        this.mUccServiceProviderMap = hashMap;
        if (hashMap.isEmpty()) {
            HashMap hashMap2 = new HashMap();
            this.mUccServiceProviderMap = hashMap2;
            hashMap2.put("alipay", new AlipayUccServiceProviderImpl());
            this.mUccServiceProviderMap.put("taobao", new TaobaoUccServiceProviderImpl());
            this.mUccServiceProviderMap.put("eleme", new ElemeUccServiceProviderImpl());
            this.mUccServiceProviderMap.put(Site.ICBU, new IcbuUccServiceProviderImpl());
            this.mUccServiceProviderMap.put("weibo", new WeiboUccServiceProviderImpl());
            this.mUccServiceProviderMap.put("wechat", new WechatUccServiceProviderImpl());
            this.mUccServiceProviderMap.put("qq", new QQUccServiceProviderImpl());
            this.mUccServiceProviderMap.put(Site.NETEASE, new NeteaseUccServiceProviderImpl());
            this.mUccServiceProviderMap.put(Site.JIUYOU, new JiuYouUccServiceProviderImpl());
            this.mUccServiceProviderMap.put("xianyu", new XianyuUccServiceProviderImpl());
        }
    }

    public static UccServiceProviderFactory getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UccServiceProviderFactory) ipChange.ipc$dispatch("aac68e24", new Object[0]);
        }
        if (instance == null) {
            synchronized (UccServiceProviderFactory.class) {
                try {
                    if (instance == null) {
                        instance = new UccServiceProviderFactory();
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
            this.mUccServiceProviderMap.clear();
        }
    }

    public UccServiceProvider getUccServiceProvider(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UccServiceProvider) ipChange.ipc$dispatch("d71d922", new Object[]{this, str});
        }
        UccServiceProvider uccServiceProvider = this.mUccServiceProviderMap.get(str);
        if (uccServiceProvider != null) {
            return uccServiceProvider;
        }
        return new DefaultUccServiceProviderImpl();
    }
}
