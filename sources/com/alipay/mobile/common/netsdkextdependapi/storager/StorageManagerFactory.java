package com.alipay.mobile.common.netsdkextdependapi.storager;

import com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory;
import com.alipay.mobile.common.netsdkextdependapi.BeanServiceConstants;
import com.alipay.mobile.common.netsdkextdependapi.InnerMiscUtil;
import com.alipay.mobile.common.netsdkextdependapi.security.SecurityManagerFactory;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class StorageManagerFactory extends AbstraceExtBeanFactory<StorageManager> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static StorageManagerFactory f4026a;

    public static final StorageManagerFactory getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StorageManagerFactory) ipChange.ipc$dispatch("e675483c", new Object[0]);
        }
        StorageManagerFactory storageManagerFactory = f4026a;
        if (storageManagerFactory != null) {
            return storageManagerFactory;
        }
        synchronized (SecurityManagerFactory.class) {
            try {
                StorageManagerFactory storageManagerFactory2 = f4026a;
                if (storageManagerFactory2 != null) {
                    return storageManagerFactory2;
                }
                StorageManagerFactory storageManagerFactory3 = new StorageManagerFactory();
                f4026a = storageManagerFactory3;
                return storageManagerFactory3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ Object ipc$super(StorageManagerFactory storageManagerFactory, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/netsdkextdependapi/storager/StorageManagerFactory");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    public StorageManager newBackupBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StorageManager) ipChange.ipc$dispatch("cb559037", new Object[]{this}) : new StorageManagerAdapter();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    public StorageManager newDefaultBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StorageManager) ipChange.ipc$dispatch("6418eeb6", new Object[]{this}) : (StorageManager) InnerMiscUtil.newDefaultBean(BeanServiceConstants.storageManagerServiceName, StorageManager.class);
    }
}
