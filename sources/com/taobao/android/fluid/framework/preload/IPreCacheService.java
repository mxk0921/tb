package com.taobao.android.fluid.framework.preload;

import com.taobao.android.fluid.business.intelligence.netpredict.NetFactor;
import com.taobao.android.fluid.core.FluidService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.preload.cache.DetailCacheData;
import java.util.List;
import tb.uq9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IPreCacheService extends FluidService {
    void commitFeature(List<a> list, int i);

    void commitFeatureLabel(String str);

    void commitLabel(String str, String str2, Object obj);

    void downloadCacheVideo(String str);

    boolean enablePreCache();

    boolean enablePreloadVideoUseCache();

    void exposedDeleteCacheData(String str);

    DetailCacheData getCacheData();

    boolean isWeakNetWork(NetFactor netFactor);

    void onMtopLoadingEnd(long j);

    void onMtopLoadingStart();

    void onVideoLoadingEnd(long j);

    void onVideoLoadingStart();

    void onVideoProgressChanged(uq9 uq9Var, int i, int i2, int i3);

    void pickCacheData();

    void saveUnExposeDetailCache(List<a> list, int i);
}
