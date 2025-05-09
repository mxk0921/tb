package com.alipay.mobile.common.netsdkextdependapi.fltracer;

import com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory;
import com.alipay.mobile.common.netsdkextdependapi.BeanServiceConstants;
import com.alipay.mobile.common.netsdkextdependapi.InnerMiscUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FltracerManagerFactory extends AbstraceExtBeanFactory<FltracerManager> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static FltracerManagerFactory f4015a;

    public static final FltracerManagerFactory getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FltracerManagerFactory) ipChange.ipc$dispatch("764b238e", new Object[0]);
        }
        FltracerManagerFactory fltracerManagerFactory = f4015a;
        if (fltracerManagerFactory != null) {
            return fltracerManagerFactory;
        }
        synchronized (FltracerManagerFactory.class) {
            try {
                FltracerManagerFactory fltracerManagerFactory2 = f4015a;
                if (fltracerManagerFactory2 != null) {
                    return fltracerManagerFactory2;
                }
                FltracerManagerFactory fltracerManagerFactory3 = new FltracerManagerFactory();
                f4015a = fltracerManagerFactory3;
                return fltracerManagerFactory3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ Object ipc$super(FltracerManagerFactory fltracerManagerFactory, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/netsdkextdependapi/fltracer/FltracerManagerFactory");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    public FltracerManager newBackupBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FltracerManager) ipChange.ipc$dispatch("66420377", new Object[]{this}) : new FltracerManagerAdapter();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    public FltracerManager newDefaultBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FltracerManager) ipChange.ipc$dispatch("e5ea74d8", new Object[]{this}) : (FltracerManager) InnerMiscUtil.newDefaultBean(BeanServiceConstants.fltracerManagerServiceName, FltracerManager.class);
    }
}
