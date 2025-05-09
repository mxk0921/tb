package com.alipay.mobile.common.netsdkextdependapi.appinfo;

import com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory;
import com.alipay.mobile.common.netsdkextdependapi.BeanServiceConstants;
import com.alipay.mobile.common.netsdkextdependapi.InnerMiscUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.logging.Level;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AppInfoManagerFactory extends AbstraceExtBeanFactory<AppInfoManager> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static AppInfoManagerFactory f4009a;

    public static final AppInfoManagerFactory getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppInfoManagerFactory) ipChange.ipc$dispatch("62466f6e", new Object[0]);
        }
        AppInfoManagerFactory appInfoManagerFactory = f4009a;
        if (appInfoManagerFactory != null) {
            return appInfoManagerFactory;
        }
        synchronized (AppInfoManagerFactory.class) {
            try {
                AppInfoManagerFactory appInfoManagerFactory2 = f4009a;
                if (appInfoManagerFactory2 != null) {
                    return appInfoManagerFactory2;
                }
                AppInfoManagerFactory appInfoManagerFactory3 = new AppInfoManagerFactory();
                f4009a = appInfoManagerFactory3;
                return appInfoManagerFactory3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ Object ipc$super(AppInfoManagerFactory appInfoManagerFactory, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/netsdkextdependapi/appinfo/AppInfoManagerFactory");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    public AppInfoManager newBackupBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AppInfoManager) ipChange.ipc$dispatch("ac5765d7", new Object[]{this}) : new AppInfoManagerAdapter();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    public AppInfoManager newDefaultBean() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppInfoManager) ipChange.ipc$dispatch("987ebb78", new Object[]{this});
        }
        InnerMiscUtil.log(Level.FINEST, "AppInfoManagerFactory newDefaultBean");
        return (AppInfoManager) InnerMiscUtil.newDefaultBean(BeanServiceConstants.appInfoManagerServiceName, AppInfoManager.class);
    }
}
