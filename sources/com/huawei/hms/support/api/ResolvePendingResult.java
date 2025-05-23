package com.huawei.hms.support.api;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.Status;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ResolvePendingResult<T extends IMessageEntity> extends PendingResultImpl<ResolveResult<T>, T> {
    public ResolvePendingResult(ApiClient apiClient, String str, IMessageEntity iMessageEntity, Class<T> cls) {
        super(apiClient, str, iMessageEntity, cls);
    }

    public static <R extends IMessageEntity> ResolvePendingResult<R> build(ApiClient apiClient, String str, IMessageEntity iMessageEntity, Class<R> cls) {
        return new ResolvePendingResult<>(apiClient, str, iMessageEntity, cls);
    }

    public T get() {
        return (T) ((IMessageEntity) await().getValue());
    }

    @Override // com.huawei.hms.support.api.PendingResultImpl
    public ResolveResult<T> onComplete(T t) {
        ResolveResult<T> resolveResult = new ResolveResult<>(t);
        resolveResult.setStatus(new Status(0));
        return resolveResult;
    }
}
