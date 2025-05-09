package com.alipay.mobile.common.netsdkextdependapi.misc;

import com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory;
import com.alipay.mobile.common.netsdkextdependapi.BeanServiceConstants;
import com.alipay.mobile.common.netsdkextdependapi.InnerMiscUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MiscManagerFactory extends AbstraceExtBeanFactory<MiscManager> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static MiscManagerFactory f4018a;

    public static final MiscManagerFactory getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MiscManagerFactory) ipChange.ipc$dispatch("8efbd0ee", new Object[0]);
        }
        MiscManagerFactory miscManagerFactory = f4018a;
        if (miscManagerFactory != null) {
            return miscManagerFactory;
        }
        synchronized (MiscManagerFactory.class) {
            try {
                MiscManagerFactory miscManagerFactory2 = f4018a;
                if (miscManagerFactory2 != null) {
                    return miscManagerFactory2;
                }
                MiscManagerFactory miscManagerFactory3 = new MiscManagerFactory();
                f4018a = miscManagerFactory3;
                return miscManagerFactory3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ Object ipc$super(MiscManagerFactory miscManagerFactory, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/netsdkextdependapi/misc/MiscManagerFactory");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    public MiscManager newBackupBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MiscManager) ipChange.ipc$dispatch("5c414b17", new Object[]{this}) : new MiscManagerAdapter();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    public MiscManager newDefaultBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MiscManager) ipChange.ipc$dispatch("777dad78", new Object[]{this}) : (MiscManager) InnerMiscUtil.newDefaultBean(BeanServiceConstants.miscManagerServiceName, MiscManager.class);
    }
}
