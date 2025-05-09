package org.android.netutil;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class AddressListener extends NetListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public AddressListener() {
        super(NetListenerType.NL_NEW_IP_ADDRESS);
    }

    public static /* synthetic */ Object ipc$super(AddressListener addressListener, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in org/android/netutil/AddressListener");
    }

    public abstract void onNewAddress(String str);
}
