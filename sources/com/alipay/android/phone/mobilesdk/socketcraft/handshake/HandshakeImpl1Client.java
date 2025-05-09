package com.alipay.android.phone.mobilesdk.socketcraft.handshake;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class HandshakeImpl1Client extends HandshakedataImpl1 implements ClientHandshakeBuilder {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String c = "*";

    public static /* synthetic */ Object ipc$super(HandshakeImpl1Client handshakeImpl1Client, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/phone/mobilesdk/socketcraft/handshake/HandshakeImpl1Client");
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.handshake.ClientHandshake
    public String getResourceDescriptor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2af5ecc6", new Object[]{this});
        }
        return this.c;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.handshake.ClientHandshakeBuilder
    public void setResourceDescriptor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97996770", new Object[]{this, str});
        } else if (str != null) {
            this.c = str;
        } else {
            throw new IllegalArgumentException("http resource descriptor must not be null");
        }
    }
}
