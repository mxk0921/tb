package mtopsdk.mtop.cache;

import anetwork.network.cache.RpcCache;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.MtopResponse;
import tb.h3o;
import tb.w4j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface CacheManager {
    String getBlockName(String str);

    @Deprecated
    String getBlockName(String str, String str2);

    RpcCache getCache(String str, String str2, String str3);

    String getCacheKey(w4j w4jVar);

    boolean isNeedReadCache(h3o h3oVar, MtopListener mtopListener);

    boolean isNeedWriteCache(h3o h3oVar, Map<String, List<String>> map);

    boolean putCache(String str, String str2, MtopResponse mtopResponse);
}
