package com.taobao.android.riverlogger.inspector;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum MessagePriority {
    Normal(0),
    Low(1);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final int value;

    MessagePriority(int i) {
        this.value = i;
    }

    public static /* synthetic */ Object ipc$super(MessagePriority messagePriority, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/riverlogger/inspector/MessagePriority");
    }

    public static MessagePriority valueOf(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MessagePriority) ipChange.ipc$dispatch("db9f561f", new Object[]{str}) : (MessagePriority) Enum.valueOf(MessagePriority.class, str);
    }

    public static MessagePriority valueOf(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MessagePriority) ipChange.ipc$dispatch("c3a0cd04", new Object[]{new Integer(i)});
        }
        if (i == 1) {
            return Low;
        }
        return Normal;
    }
}
