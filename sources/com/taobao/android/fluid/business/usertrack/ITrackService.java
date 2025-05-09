package com.taobao.android.fluid.business.usertrack;

import com.taobao.android.fluid.business.usertrack.track.PageStartTimeBean;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.RenderTrackUtils;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.VideoTracker;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.a;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import java.util.HashMap;
import java.util.Map;
import tb.g2e;
import tb.o6d;
import tb.oau;
import tb.sob;
import tb.t19;
import tb.uq9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface ITrackService extends FluidService, o6d {
    /* synthetic */ void addCommonTrackChangedListener(sob sobVar);

    void commitTintFail(String str, String str2, Map map, uq9 uq9Var);

    Map<String, String> getActiveCardCommonTrack();

    oau getConfig();

    Map<String, String> getDPVCommonTrack();

    int getMaxSlideIndexPublicMode();

    long getNavElapsdorealTime();

    long getNavStartTime();

    PageStartTimeBean getPageCreateTimeBean();

    t19 getPageFastTracker();

    Map<String, String> getPageUTProperties();

    HashMap<String, String> getPageUtProperties();

    VideoTracker getPageVideoTracker();

    String getRecordContentId();

    int getRecordCount();

    int getSessionPlayTime();

    int getTab3ComponentDisappearTimes();

    Map<String, String> getThisCardCommonTrack(uq9 uq9Var);

    Map<String, String> getTintAllTrackInfoWithCard(uq9 uq9Var);

    Map<String, String> getTintAllTrackInfoWithDetail(a.d dVar);

    g2e getTrackTint();

    RenderTrackUtils.a getTrackerRenderInfo();

    String getUtparamPre();

    String getUtparamUrl();

    a.b getVideoTrackerPageInfo();

    boolean isFirstSetAdapter();

    boolean isFirstSetUTParams();

    boolean isPageFirstEnter();

    boolean isProcessFromLauncherFlag();

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

    /* synthetic */ void removeCommonTrackChangedListener(sob sobVar);

    void resetTab3EnterPageStartTime();

    void setFirstSetAdapter(boolean z);

    void setFirstSetUTParams(boolean z);

    void setPageCreateTimeBean(PageStartTimeBean pageStartTimeBean);

    void setPageFastTracker(t19 t19Var);

    void setPageFirstEnter(boolean z);

    PageStartTimeBean setPageStartTime(FluidContext fluidContext);

    void setPageVideoTracker(VideoTracker videoTracker);

    void setRecordContentId(String str);

    void setRecordCount(int i);

    void setTab3ComponentDisappearTimes(int i);

    void setTrackerRenderInfo(RenderTrackUtils.a aVar);

    void setVideoTrackerPageInfo(a.b bVar);

    void trackPageStart();

    void triggerTrackStayTime(uq9 uq9Var);

    void updateCommonTrack(Map<String, String> map);
}
