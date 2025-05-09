package com.taobao.infoflow.core.subservice.base.cacheservice;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.base.ICacheService;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.cfc;
import tb.t2o;
import tb.ut3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class CacheServiceImpl implements ICacheService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Map<String, Object> mCache = new ConcurrentHashMap();
    private ICacheService.a mClickCache;

    static {
        t2o.a(486539329);
        t2o.a(488636521);
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.ICacheService
    public <T> T getCacheObject(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("da27b711", new Object[]{this, str, cls});
        }
        T t = (T) this.mCache.get(str);
        if (t != null && cls.isInstance(t)) {
            return t;
        }
        return null;
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.ICacheService
    public ICacheService.a getClickCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ICacheService.a) ipChange.ipc$dispatch("4ce0b0ce", new Object[]{this});
        }
        if (this.mClickCache == null) {
            this.mClickCache = new ut3();
        }
        return this.mClickCache;
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.ICacheService
    public void putCacheObject(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("104b28ff", new Object[]{this, str, obj});
        } else {
            this.mCache.put(str, obj);
        }
    }
}
