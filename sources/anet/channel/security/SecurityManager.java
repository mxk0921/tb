package anet.channel.security;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SecurityManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile ISecurityFactory securityFactory = null;

    static {
        t2o.a(607125707);
    }

    public static ISecurityFactory getSecurityFactory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISecurityFactory) ipChange.ipc$dispatch("14ff7ff9", new Object[0]);
        }
        if (securityFactory == null) {
            securityFactory = new ISecurityFactory() { // from class: anet.channel.security.SecurityManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // anet.channel.security.ISecurityFactory
                public ISecurity createNonSecurity(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (ISecurity) ipChange2.ipc$dispatch("cbdd9a3a", new Object[]{this, str});
                    }
                    return new NoSecurityGuardImpl(str);
                }

                @Override // anet.channel.security.ISecurityFactory
                public ISecurity createSecurity(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (ISecurity) ipChange2.ipc$dispatch("9746f9c5", new Object[]{this, str});
                    }
                    return new SecurityGuardImpl(str);
                }
            };
        }
        return securityFactory;
    }

    public static void setSecurityFactory(ISecurityFactory iSecurityFactory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76fb492d", new Object[]{iSecurityFactory});
        } else {
            securityFactory = iSecurityFactory;
        }
    }
}
