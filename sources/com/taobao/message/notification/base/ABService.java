package com.taobao.message.notification.base;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ABService implements IABProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private IABProvider sABProvider = new DefaultABProvider();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class SingletonHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static ABService instance = new ABService();

        static {
            t2o.a(610271287);
        }

        private SingletonHolder() {
        }

        public static /* synthetic */ ABService access$000() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ABService) ipChange.ipc$dispatch("52bd86ef", new Object[0]);
            }
            return instance;
        }
    }

    static {
        t2o.a(610271286);
        t2o.a(610271292);
    }

    public static ABService instance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ABService) ipChange.ipc$dispatch("7ecd4d2a", new Object[0]);
        }
        return SingletonHolder.access$000();
    }

    @Override // com.taobao.message.notification.base.IABProvider
    public String getABResult(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("653ecea7", new Object[]{this, str, str2, str3});
        }
        return this.sABProvider.getABResult(str, str2, str3);
    }

    public void setABProvider(IABProvider iABProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d656c3c4", new Object[]{this, iABProvider});
        } else {
            this.sABProvider = iABProvider;
        }
    }
}
