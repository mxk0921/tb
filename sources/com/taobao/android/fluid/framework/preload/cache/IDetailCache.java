package com.taobao.android.fluid.framework.preload.cache;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IDetailCache {
    public static final String CACHE_VERSION = "1";
    public static final int KEEP_MIN_HAS_CACHE_COUNT = 2;
    public static final int KEEP_MIN_HAS_CACHE_TIME = 21600000;
    public static final int KEEP_MIN_OLD_CACHE_COUNT = 2;
    public static final String SCENE_NAME_SHORT_VIDEO_INTERNAL_EXPOSED = "shortvideo_cache_internal_exposed";
    public static final String SCENE_NAME_SHORT_VIDEO_INTERNAL_UNEXPOSED = "shortvideo_cache_internal_unexposed";
    public static final String TAG_CACHE = "[cachevideo]";

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface CacheSceneName {
    }

    void a(String str);

    boolean b(String str, String str2, int i, long j);

    void c();

    List<DetailCacheData> d();

    DetailCacheData e();

    DetailCacheData f(String str);

    DetailCacheData g(Map<String, Object> map);

    void save(List<DetailCacheData> list);
}
