package mtopsdk.mtop.domain;

import anetwork.network.cache.RpcCache;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import mtopsdk.common.util.StringUtils;
import mtopsdk.mtop.cache.CacheManager;
import tb.t2o;
import tb.w4j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class ResponseSource implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String cacheBlock;
    private String cacheKey;
    public CacheManager cacheManager;
    public MtopResponse cacheResponse;
    public w4j mtopContext;
    public String seqNo;
    public RpcCache rpcCache = null;
    public boolean requireConnection = true;

    static {
        t2o.a(589299914);
    }

    public ResponseSource(w4j w4jVar, CacheManager cacheManager) {
        this.mtopContext = w4jVar;
        this.cacheManager = cacheManager;
        this.seqNo = w4jVar.h;
    }

    public String getCacheBlock() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f5abf78", new Object[]{this});
        }
        if (StringUtils.isNotBlank(this.cacheBlock)) {
            return this.cacheBlock;
        }
        String blockName = this.cacheManager.getBlockName(this.mtopContext.b.getKey());
        this.cacheBlock = blockName;
        return blockName;
    }

    public String getCacheKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0d367e6", new Object[]{this});
        }
        if (StringUtils.isNotBlank(this.cacheKey)) {
            return this.cacheKey;
        }
        String cacheKey = this.cacheManager.getCacheKey(this.mtopContext);
        this.cacheKey = cacheKey;
        return cacheKey;
    }
}
