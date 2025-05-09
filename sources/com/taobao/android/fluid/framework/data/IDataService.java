package com.taobao.android.fluid.framework.data;

import android.os.Handler;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.fluid.core.FluidService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.list.render.ListRenderManager;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import tb.aon;
import tb.ar9;
import tb.d5n;
import tb.dzb;
import tb.i6e;
import tb.iaw;
import tb.kon;
import tb.miv;
import tb.mkc;
import tb.n1c;
import tb.ncp;
import tb.ood;
import tb.rg7;
import tb.src;
import tb.sv2;
import tb.tg7;
import tb.uxb;
import tb.vrp;
import tb.vx1;
import tb.ws6;
import tb.yao;
import tb.yif;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IDataService extends FluidService, i6e, n1c, src, ood, uxb, dzb, rg7.c, rg7.d {
    public static final ar9 DATA_ERROR_INTERCEPTOR_CHAIN_OUT_OF_INDEX = new ar9("DATA-1", "数据请求链数组越界");
    public static final ar9 ERROR_CODE_REQUEST_DATA = new ar9("DATA-2", "请求接口失败");
    public static final String SERVICE_NAME = "IDataService";

    /* synthetic */ void addDataChangeListener(uxb uxbVar);

    /* synthetic */ int addDetailList(int i, kon.h hVar);

    /* synthetic */ void addDetailRequestListener(rg7.c cVar);

    /* synthetic */ void addDetailRequestSuccessListener(dzb dzbVar);

    /* synthetic */ void addListDataChangeListener(mkc mkcVar);

    /* synthetic */ void addMultiDetailRequestListener(rg7.d dVar);

    /* synthetic */ void addServerConfigChangeListener(ood oodVar);

    /* synthetic */ void appendDetailListAtFirst(kon.h hVar);

    /* synthetic */ void appendDetailListAtLast(kon.h hVar);

    /* synthetic */ boolean canLoopOnceRequestRecommend();

    /* synthetic */ void clearListNextData();

    /* synthetic */ ArrayList convertToMediaSetDataArrayList(kon.h hVar);

    /* synthetic */ LinkedList convertToMediaSetDataList(List list, JSONArray jSONArray);

    /* synthetic */ boolean dynamicRecommend(aon aonVar);

    /* synthetic */ void fetchContentDetail(Map map, boolean z, boolean z2);

    /* synthetic */ void fetchContentDetail(Map map, boolean z, boolean z2, boolean z3, d5n d5nVar);

    /* synthetic */ void fetchContentDetail(tg7 tg7Var, rg7.c cVar);

    /* synthetic */ void fetchVideoInfoAndPrecreateDwInstance();

    /* synthetic */ long getBeforeDetailMtopTime();

    ws6 getConfig();

    /* synthetic */ String getCurrentContentId();

    /* synthetic */ int getCurrentDetailSuccessMtopId();

    /* synthetic */ a.d getCurrentMediaDetail();

    /* synthetic */ int getCurrentMediaPosition();

    /* synthetic */ a getCurrentMediaSetData();

    /* synthetic */ sv2 getDetailCallback();

    /* synthetic */ yif getDetailInterceptorManager();

    /* synthetic */ List getDetailMediaSetDataList();

    /* synthetic */ long getDetailMtopCost();

    /* synthetic */ long getDetailMtopSuccessTIme();

    /* synthetic */ String getDetailRequestRefreshType();

    /* synthetic */ String getDetailRequestRetCode();

    /* synthetic */ int getDetailRequestStatus();

    /* synthetic */ miv getDetailUnlikeRecorder();

    /* synthetic */ iaw getDetailVideoPositiveFeedbackIdsModel();

    /* synthetic */ LinkedList getFeedbackList();

    /* synthetic */ int getIndexOfList(a aVar);

    /* synthetic */ int getLastDataSequenceNumber();

    /* synthetic */ boolean getLoadingState(boolean z);

    /* synthetic */ ArrayList getMediaSetList();

    /* synthetic */ String getNoMoreMsg();

    /* synthetic */ String getNoMoreMsgUp();

    /* synthetic */ int getNoRecReason();

    /* synthetic */ ListRenderManager.h getOffsetPosition();

    /* synthetic */ String getPreloadUseCacheValue();

    /* synthetic */ long getQuickSecondRefreshMd5();

    /* synthetic */ String getRecommendRequestId();

    /* synthetic */ String getRequestRetCode();

    /* synthetic */ long getStartRecommendtime();

    /* synthetic */ int getTotalCount();

    /* synthetic */ Map getTransmission();

    /* synthetic */ Map getTransmissionUP();

    /* synthetic */ String getUnExposeIds();

    /* synthetic */ List getUnExposeItems();

    /* synthetic */ List getUnExposedItems();

    /* synthetic */ ArrayList getUnRemoveMediaSetList();

    /* synthetic */ List getUnVisibleOrExposedItems(boolean z, boolean z2);

    /* synthetic */ List getUnmodifiableMediaSetList();

    /* synthetic */ Handler getmPreloadNextHandler();

    /* synthetic */ void insertDetailListAtCurrent(kon.h hVar);

    /* synthetic */ boolean isDetailLoading();

    /* synthetic */ boolean isDetailMTopSuccess();

    /* synthetic */ boolean isDetailRequestSuccess();

    /* synthetic */ boolean isDownNoMoreData();

    /* synthetic */ boolean isHasPageErrorShow();

    /* synthetic */ boolean isHasShowNoMoreMsg();

    /* synthetic */ boolean isLoadingMore();

    /* synthetic */ boolean isLoadingUp();

    /* synthetic */ boolean isNoMoreData();

    /* synthetic */ boolean isNoMoreDataUp();

    boolean isTab3CacheEnable();

    /* synthetic */ boolean isTab3FirstCellIconStreamRequestDetail();

    /* synthetic */ boolean isTab3LauncherHitMtopPrefetch();

    /* synthetic */ boolean isUpNoMoreData();

    /* synthetic */ boolean ismHasShowNoMoreMsgUp();

    /* synthetic */ void notifyContentDetailCallback(rg7.c cVar, yao yaoVar);

    /* synthetic */ void onDataChanged(a aVar);

    /* synthetic */ void onDetailRequestSuccess();

    /* synthetic */ void onResult(yao yaoVar);

    /* synthetic */ void onResult(yao yaoVar, yao yaoVar2);

    /* synthetic */ void onServerConfigChanged(ncp ncpVar);

    /* synthetic */ void onStartRequest();

    /* synthetic */ void onStartRequest(int i);

    /* synthetic */ void postLoadDownRunnable();

    /* synthetic */ void postLoadUpRunnable();

    /* synthetic */ boolean reOrderTailUnExposeList(List list);

    /* synthetic */ void refreshCurrentData(a aVar, vrp.a aVar2, vx1 vx1Var);

    /* synthetic */ void removeDataChangeListener(uxb uxbVar);

    /* synthetic */ void removeDetailListAtIndex(int i);

    /* synthetic */ void removeDetailListByIds(List list);

    /* synthetic */ void removeDetailListWithAuthor(String str);

    /* synthetic */ void removeDetailRequestListener(rg7.c cVar);

    /* synthetic */ void removeDetailRequestSuccessListener(dzb dzbVar);

    /* synthetic */ void removeLoadingRequestCallback(boolean z);

    /* synthetic */ void removeMultiDetailRequestListener(rg7.d dVar);

    /* synthetic */ void removeServerConfigChangeListener(ood oodVar);

    /* synthetic */ void replaceDetail(kon.h hVar, String str);

    /* synthetic */ void requestDetailDataAndRefresh(d5n d5nVar);

    /* synthetic */ void requestForCommendData(boolean z, boolean z2, boolean z3, int i, String str, aon aonVar, sv2 sv2Var);

    void requestList(boolean z, Map map, sv2<kon.h> sv2Var);

    void requestListForCollection(boolean z, Map map, int i, sv2<kon.h> sv2Var);

    /* synthetic */ void requestListInternal(boolean z, Map map, sv2 sv2Var);

    /* synthetic */ void resetNoMoreDataFlag();

    /* synthetic */ void setBeforeDetailMtopTime(long j);

    /* synthetic */ void setDetailMtopCost(long j);

    /* synthetic */ void setDetailMtopSuccessTIme(long j);

    /* synthetic */ void setHasShowNoMoreMsg(boolean z);

    /* synthetic */ void setHasShowNoMoreMsgUp(boolean z);

    /* synthetic */ void setLoadingState(boolean z, boolean z2);

    /* synthetic */ void setLoopOnceRequestRecommend(boolean z);

    /* synthetic */ void setMediaSet(List list);

    /* synthetic */ void setMediaSetAndScrollTo(List list, boolean z, String str);

    /* synthetic */ void setPreloadUseCacheValue(String str);

    void setTab3CacheEnable(boolean z);

    /* synthetic */ void setTab3LauncherHitMtopPrefetch(boolean z);

    /* synthetic */ void setTransmission(Map map);

    /* synthetic */ void setTransmissionUp(Map map);

    /* synthetic */ void updateAppendRecommenParams(JSONObject jSONObject);

    /* synthetic */ void updateNoDynamicRecContents(String str, boolean z);
}
