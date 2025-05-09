package com.alipay.android.phone.mobilesdk.socketcraft.handshake;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class HandshakeImpl1Server extends HandshakedataImpl1 implements ServerHandshakeBuilder {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public short c;
    public String d;

    public static /* synthetic */ Object ipc$super(HandshakeImpl1Server handshakeImpl1Server, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/phone/mobilesdk/socketcraft/handshake/HandshakeImpl1Server");
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.handshake.ServerHandshake
    public short getHttpStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea25b314", new Object[]{this})).shortValue();
        }
        return this.c;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.handshake.ServerHandshake
    public String getHttpStatusMessage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("25d8dc02", new Object[]{this});
        }
        return this.d;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.handshake.ServerHandshakeBuilder
    public void setHttpStatus(short s) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9167e1ca", new Object[]{this, new Short(s)});
        } else {
            this.c = s;
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.handshake.ServerHandshakeBuilder
    public void setHttpStatusMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92c1ac1c", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }
}
