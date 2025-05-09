package com.taobao.message.notification.base;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class EnvService implements IEnvProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private IEnvProvider sEnvProvider = new DefaultEnvProvider();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class SingletonHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static EnvService instance = new EnvService();

        static {
            t2o.a(610271291);
        }

        private SingletonHolder() {
        }

        public static /* synthetic */ EnvService access$000() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (EnvService) ipChange.ipc$dispatch("96e11d8b", new Object[0]);
            }
            return instance;
        }
    }

    static {
        t2o.a(610271290);
        t2o.a(610271293);
    }

    public static EnvService instance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EnvService) ipChange.ipc$dispatch("ecca1eb0", new Object[0]);
        }
        return SingletonHolder.access$000();
    }

    @Override // com.taobao.message.notification.base.IEnvProvider
    public boolean checkBrand(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d97e34b4", new Object[]{this, str})).booleanValue();
        }
        return this.sEnvProvider.checkBrand(str);
    }

    @Override // com.taobao.message.notification.base.IEnvProvider
    public boolean isAppBackGround(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63a3421a", new Object[]{this, str})).booleanValue();
        }
        return this.sEnvProvider.isAppBackGround(str);
    }

    @Override // com.taobao.message.notification.base.IEnvProvider
    public boolean isProcessRight(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("359ac94e", new Object[]{this, context})).booleanValue();
        }
        return this.sEnvProvider.isProcessRight(context);
    }

    @Override // com.taobao.message.notification.base.IEnvProvider
    public boolean isWindowManagerAvaliable(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd1f0055", new Object[]{this, context})).booleanValue();
        }
        return this.sEnvProvider.isWindowManagerAvaliable(context);
    }

    public void setEnvProvider(IEnvProvider iEnvProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85ae8454", new Object[]{this, iEnvProvider});
        } else {
            this.sEnvProvider = iEnvProvider;
        }
    }
}
