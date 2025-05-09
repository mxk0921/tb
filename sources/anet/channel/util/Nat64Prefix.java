package anet.channel.util;

import com.android.alibaba.ip.runtime.IpChange;
import java.net.Inet6Address;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Nat64Prefix {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Inet6Address mPrefix;
    public int mPrefixLength;

    static {
        t2o.a(607125953);
    }

    public Nat64Prefix(Inet6Address inet6Address, int i) {
        this.mPrefixLength = i;
        this.mPrefix = inet6Address;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.mPrefix.getHostAddress() + "/" + this.mPrefixLength;
    }
}
