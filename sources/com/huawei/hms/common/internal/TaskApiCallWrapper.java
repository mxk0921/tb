package com.huawei.hms.common.internal;

import tb.fdt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TaskApiCallWrapper<TResult> extends BaseContentWrapper {

    /* renamed from: a  reason: collision with root package name */
    private final TaskApiCall<? extends AnyClient, TResult> f5325a;
    private final fdt<TResult> b;

    public TaskApiCallWrapper(TaskApiCall<? extends AnyClient, TResult> taskApiCall, fdt<TResult> fdtVar) {
        super(1);
        this.f5325a = taskApiCall;
        this.b = fdtVar;
    }

    public TaskApiCall<? extends AnyClient, TResult> getTaskApiCall() {
        return this.f5325a;
    }

    public fdt<TResult> getTaskCompletionSource() {
        return this.b;
    }
}
