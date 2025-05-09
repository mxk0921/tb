package com.taobao.adaemon;

import com.taobao.aranger.annotation.type.Callback;
import com.taobao.aranger.exception.IPCException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
@Callback
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface ITrigger {
    public static final String TYPE_SYS_SCHEDULE = "sys_schedule";

    void onTrigger(String str) throws IPCException;
}
