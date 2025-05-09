package com.alibaba.android.nextrpc.request;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.common.MtopCacheEvent;
import mtopsdk.mtop.domain.BaseOutDo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class CachedMainResponse extends AbsResponse {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final BaseOutDo mtopBaseOutDo;
    private final MtopCacheEvent mtopCacheEvent;
    private final Object mtopRequestContext;

    public CachedMainResponse(String str, String str2, Map<String, List<String>> map, MtopCacheEvent mtopCacheEvent, BaseOutDo baseOutDo, Object obj) {
        super(str, str2, map);
        this.mtopCacheEvent = mtopCacheEvent;
        this.mtopBaseOutDo = baseOutDo;
        this.mtopRequestContext = obj;
    }

    public static /* synthetic */ Object ipc$super(CachedMainResponse cachedMainResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/nextrpc/request/CachedMainResponse");
    }

    public BaseOutDo getMtopBaseOutDo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseOutDo) ipChange.ipc$dispatch("36c3ccdb", new Object[]{this});
        }
        return this.mtopBaseOutDo;
    }

    public MtopCacheEvent getMtopCacheEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopCacheEvent) ipChange.ipc$dispatch("3a25556e", new Object[]{this});
        }
        return this.mtopCacheEvent;
    }

    public Object getMtopRequestContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("7c97b24d", new Object[]{this});
        }
        return this.mtopRequestContext;
    }
}
