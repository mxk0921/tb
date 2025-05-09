package com.taobao.taolive.message_sdk.core;

import com.alibaba.ability.impl.nfc.NfcAbility;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public enum LiveMessageStatus {
    error("error"),
    unSubscribe(NfcAbility.API_UNSUBSCRIBE),
    running(MiscUtils.KEY_RUNNING),
    stop("stop");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String dec;

    LiveMessageStatus(String str) {
        this.dec = str;
    }

    public static /* synthetic */ Object ipc$super(LiveMessageStatus liveMessageStatus, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/message_sdk/core/LiveMessageStatus");
    }

    public static LiveMessageStatus valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveMessageStatus) ipChange.ipc$dispatch("37a2766c", new Object[]{str});
        }
        return (LiveMessageStatus) Enum.valueOf(LiveMessageStatus.class, str);
    }

    @Override // java.lang.Enum
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.dec;
    }
}
