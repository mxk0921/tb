package com.taobao.android.fluid.framework.preload;

import android.view.View;
import com.taobao.android.fluid.core.FluidService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import java.util.HashMap;
import java.util.Map;
import tb.atb;
import tb.cnm;
import tb.ntm;
import tb.o6d;
import tb.r8e;
import tb.usm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IUsePreloadService extends FluidService, o6d {
    boolean enableTab3UseCacheData();

    atb findPreAttachedDWInstance();

    ntm findPreAttachedPreloadedVideo();

    ntm findPreloadVideo();

    usm getConfig();

    String getPlayerPlayToken();

    cnm getPreLoadManager();

    HashMap<String, String> getTab3CacheTrackParams();

    long getTab3LauncherPrePlayerStartTime();

    String getmPrePlayerVideoId();

    boolean isLaunchCodeRequest();

    boolean isLocalOrCacheVideo(atb atbVar);

    boolean ismTab3QuickRender();

    void moveVideoToList(ntm ntmVar);

    @Override // tb.o6d
    /* synthetic */ void onCreate();

    @Override // tb.o6d
    /* synthetic */ void onDestroy();

    @Override // tb.o6d
    /* synthetic */ void onPause();

    @Override // tb.o6d
    /* synthetic */ void onRealStart();

    @Override // tb.o6d
    /* synthetic */ void onRealStop();

    @Override // tb.o6d
    /* synthetic */ void onResume();

    @Override // tb.o6d
    /* synthetic */ void onStart();

    @Override // tb.o6d
    /* synthetic */ void onStop();

    void preloadDetailDataInBackground();

    void quickRenderFetchContentDetail(Map map);

    void removePreAttachedDWInstance(boolean z);

    void resetDetailPrefetchFlag();

    void setIsLaunchCodeRequest(boolean z);

    void setPlayerPlayToken(String str);

    void setTab3CacheTrackParams(HashMap<String, String> hashMap);

    void setTab3LauncherPrePlayerStartTime(long j);

    void setTab3QuickRender();

    r8e setVideoCommentSizeObject(View view);

    void startPreloadVideo(a aVar, int i, int i2, int i3);

    void stopPreloadVideo();
}
