package com.ali.user.mobile.ability.excutor;

import com.ali.user.mobile.callback.DataCallback;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface Executor {
    ExecutorResult execute(ExecutorContext executorContext, DataCallback<ExecutorResult> dataCallback);

    String executorName();

    Class paramClass();

    boolean supportSync();
}
