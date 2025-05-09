package com.alipay.mobile.common.netsdkextdependapi.userinfo;

import com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory;
import com.alipay.mobile.common.netsdkextdependapi.BeanServiceConstants;
import com.alipay.mobile.common.netsdkextdependapi.InnerMiscUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class UserInfoManagerFactory extends AbstraceExtBeanFactory<UserInfoManager> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static UserInfoManagerFactory f4029a;

    public static final UserInfoManagerFactory getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UserInfoManagerFactory) ipChange.ipc$dispatch("8b8430ae", new Object[0]);
        }
        UserInfoManagerFactory userInfoManagerFactory = f4029a;
        if (userInfoManagerFactory != null) {
            return userInfoManagerFactory;
        }
        synchronized (UserInfoManagerFactory.class) {
            try {
                UserInfoManagerFactory userInfoManagerFactory2 = f4029a;
                if (userInfoManagerFactory2 != null) {
                    return userInfoManagerFactory2;
                }
                UserInfoManagerFactory userInfoManagerFactory3 = new UserInfoManagerFactory();
                f4029a = userInfoManagerFactory3;
                return userInfoManagerFactory3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ Object ipc$super(UserInfoManagerFactory userInfoManagerFactory, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/netsdkextdependapi/userinfo/UserInfoManagerFactory");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    public UserInfoManager newBackupBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UserInfoManager) ipChange.ipc$dispatch("de1f7a57", new Object[]{this}) : new UserInfoManagerAdapter();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alipay.mobile.common.netsdkextdependapi.AbstraceExtBeanFactory
    public UserInfoManager newDefaultBean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UserInfoManager) ipChange.ipc$dispatch("5dc7ebb8", new Object[]{this}) : (UserInfoManager) InnerMiscUtil.newDefaultBean(BeanServiceConstants.userInfoManagerServiceName, UserInfoManager.class);
    }
}
