package com.taobao.tao.messagekit.core.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class AccsConnInfo extends BaseMessage {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean connected;

    static {
        t2o.a(628097154);
    }

    public AccsConnInfo(boolean z) {
        this.connected = z;
    }

    public static /* synthetic */ Object ipc$super(AccsConnInfo accsConnInfo, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/messagekit/core/model/AccsConnInfo");
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage
    public byte[] bizToProtocol() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("972ab150", new Object[]{this});
        }
        return new byte[0];
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage
    public byte[] bodyToProtocol() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("d8e964e1", new Object[]{this});
        }
        return new byte[0];
    }

    @Override // com.taobao.tao.messagekit.core.model.BaseMessage, com.taobao.tao.messagekit.core.model.IProtocol
    public int statusCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc4b95f9", new Object[]{this})).intValue();
        }
        return 1000;
    }
}
