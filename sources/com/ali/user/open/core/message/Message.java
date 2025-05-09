package com.ali.user.open.core.message;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Message implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int code;
    public String message;

    static {
        t2o.a(71303194);
    }

    public static Message create(int i, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Message) ipChange.ipc$dispatch("24968e45", new Object[]{new Integer(i), objArr});
        }
        return MessageUtils.createMessage(i, objArr);
    }

    public Object clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("78b3604e", new Object[]{this});
        }
        return super.clone();
    }
}
