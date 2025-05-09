package com.taobao.android.fluid.framework.data;

import android.os.Handler;
import android.util.Pair;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.videocollection.ICollectionService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.fluid.framework.data.datamodel.MediaMixContentDetail;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.data.request.meidainfo.MediaInfoRequestManager;
import com.taobao.android.fluid.framework.list.render.ListRenderManager;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import tb.aon;
import tb.d5n;
import tb.dzb;
import tb.i6e;
import tb.iaw;
import tb.inn;
import tb.k58;
import tb.kon;
import tb.miv;
import tb.mkc;
import tb.n1c;
import tb.ncp;
import tb.ood;
import tb.qq6;
import tb.rg7;
import tb.sg7;
import tb.src;
import tb.sv2;
import tb.t2o;
import tb.tg7;
import tb.tgv;
import tb.uxb;
import tb.vrp;
import tb.vx1;
import tb.ws6;
import tb.yao;
import tb.yif;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DataService implements IDataService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private qq6 mDataListenerManager;
    private final ws6 mDataServiceConfig;
    private sg7 mDetailRequestManagerWrapper;
    private n1c mDynamicRecommendManager;
    private final FluidContext mFluidContext;
    private src mMediaInfoRequestManager;
    private inn mRecommendDataManager;
    private kon mRecommendDataRequestManager;
    private boolean mTab3CacheEnable;
    private i6e mUnexposedDataManager;

    static {
        t2o.a(468714171);
        t2o.a(468714177);
    }

    public DataService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
        this.mDataListenerManager = new qq6(fluidContext);
        this.mDataServiceConfig = new ws6(fluidContext, this.mDataListenerManager);
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void addDataChangeListener(uxb uxbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c33e537", new Object[]{this, uxbVar});
        } else {
            this.mDataListenerManager.addDataChangeListener(uxbVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public int addDetailList(int i, kon.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dccd59b3", new Object[]{this, new Integer(i), hVar})).intValue();
        }
        return this.mRecommendDataManager.e(i, hVar);
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void addDetailRequestListener(rg7.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47c46039", new Object[]{this, cVar});
        } else {
            this.mDataListenerManager.addDetailRequestListener(cVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void addDetailRequestSuccessListener(dzb dzbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58cd169d", new Object[]{this, dzbVar});
        } else {
            this.mDataListenerManager.addDetailRequestSuccessListener(dzbVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void addListDataChangeListener(mkc mkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb9ef294", new Object[]{this, mkcVar});
        } else {
            this.mRecommendDataManager.f(mkcVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void addMultiDetailRequestListener(rg7.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79e12e13", new Object[]{this, dVar});
        } else {
            this.mDataListenerManager.addMultiDetailRequestListener(dVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void addServerConfigChangeListener(ood oodVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7cd2cc7", new Object[]{this, oodVar});
        } else {
            this.mDataListenerManager.addServerConfigChangeListener(oodVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void appendDetailListAtFirst(kon.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94bfd5ef", new Object[]{this, hVar});
        } else {
            this.mRecommendDataManager.g(hVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void appendDetailListAtLast(kon.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83e3ecd", new Object[]{this, hVar});
        } else {
            this.mRecommendDataManager.h(hVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public boolean canLoopOnceRequestRecommend() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e61f7cd", new Object[]{this})).booleanValue();
        }
        return this.mRecommendDataManager.i();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void clearListNextData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b513a36f", new Object[]{this});
        } else {
            this.mRecommendDataManager.j();
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public ArrayList<a> convertToMediaSetDataArrayList(kon.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("d9eead36", new Object[]{this, hVar});
        }
        return this.mRecommendDataManager.k(hVar);
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public LinkedList<a> convertToMediaSetDataList(List<MediaContentDetailData> list, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedList) ipChange.ipc$dispatch("71484afa", new Object[]{this, list, jSONArray});
        }
        return this.mRecommendDataManager.l(list, jSONArray);
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService, tb.n1c
    public boolean dynamicRecommend(aon aonVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a98b0ccb", new Object[]{this, aonVar})).booleanValue();
        }
        return this.mDynamicRecommendManager.dynamicRecommend(aonVar);
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void fetchContentDetail(tg7 tg7Var, rg7.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f709bb2", new Object[]{this, tg7Var, cVar});
        } else {
            this.mDetailRequestManagerWrapper.w(tg7Var, cVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService, tb.src
    public void fetchVideoInfoAndPrecreateDwInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f797c6", new Object[]{this});
        } else {
            this.mMediaInfoRequestManager.fetchVideoInfoAndPrecreateDwInstance();
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public long getBeforeDetailMtopTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f128d8f6", new Object[]{this})).longValue();
        }
        return this.mDetailRequestManagerWrapper.x();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public ws6 getConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ws6) ipChange.ipc$dispatch("c3c8e34a", new Object[]{this});
        }
        return this.mDataServiceConfig;
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public String getCurrentContentId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fedca28", new Object[]{this});
        }
        return this.mRecommendDataManager.m();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public int getCurrentDetailSuccessMtopId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9b5b4c", new Object[]{this})).intValue();
        }
        return this.mRecommendDataManager.n();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public a.d getCurrentMediaDetail() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.d) ipChange.ipc$dispatch("548daa07", new Object[]{this});
        }
        return this.mRecommendDataManager.o();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public int getCurrentMediaPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fde0424", new Object[]{this})).intValue();
        }
        return this.mRecommendDataManager.p();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public a getCurrentMediaSetData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("541847df", new Object[]{this});
        }
        return this.mRecommendDataManager.q();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public sv2<yao<List<a>>> getDetailCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sv2) ipChange.ipc$dispatch("6b88b8f5", new Object[]{this});
        }
        return this.mDetailRequestManagerWrapper.y();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public yif getDetailInterceptorManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yif) ipChange.ipc$dispatch("7a4765d3", new Object[]{this});
        }
        return this.mDetailRequestManagerWrapper.z();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public List<a> getDetailMediaSetDataList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("61b878f3", new Object[]{this});
        }
        return this.mDetailRequestManagerWrapper.A();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public long getDetailMtopCost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b127cc97", new Object[]{this})).longValue();
        }
        return this.mDetailRequestManagerWrapper.B();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public long getDetailMtopSuccessTIme() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86ff741c", new Object[]{this})).longValue();
        }
        return this.mDetailRequestManagerWrapper.C();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public String getDetailRequestRefreshType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("27c8b6cc", new Object[]{this});
        }
        return this.mDetailRequestManagerWrapper.D();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public String getDetailRequestRetCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5a668ef3", new Object[]{this});
        }
        return this.mDetailRequestManagerWrapper.E();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public int getDetailRequestStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e5064ed4", new Object[]{this})).intValue();
        }
        return this.mDetailRequestManagerWrapper.F();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public miv getDetailUnlikeRecorder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (miv) ipChange.ipc$dispatch("a712e92e", new Object[]{this});
        }
        return this.mDetailRequestManagerWrapper.G();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public iaw getDetailVideoPositiveFeedbackIdsModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iaw) ipChange.ipc$dispatch("e135e4c2", new Object[]{this});
        }
        return this.mDetailRequestManagerWrapper.H();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService, tb.n1c
    public LinkedList<kon.h> getFeedbackList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedList) ipChange.ipc$dispatch("7e945bee", new Object[]{this});
        }
        return this.mDynamicRecommendManager.getFeedbackList();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public int getIndexOfList(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9d51cc26", new Object[]{this, aVar})).intValue();
        }
        return this.mRecommendDataManager.r(aVar);
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public int getLastDataSequenceNumber() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("55cb555a", new Object[]{this})).intValue();
        }
        return this.mRecommendDataRequestManager.v();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public boolean getLoadingState(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e06616e6", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        return this.mRecommendDataRequestManager.w(z);
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public ArrayList<a> getMediaSetList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("e318faf3", new Object[]{this});
        }
        return this.mRecommendDataManager.s();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public String getNoMoreMsg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2f44e9e4", new Object[]{this});
        }
        return this.mRecommendDataRequestManager.x();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public String getNoMoreMsgUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94bb6349", new Object[]{this});
        }
        return this.mRecommendDataRequestManager.y();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public int getNoRecReason() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("15258af7", new Object[]{this})).intValue();
        }
        return this.mRecommendDataRequestManager.z();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public ListRenderManager.h getOffsetPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListRenderManager.h) ipChange.ipc$dispatch("d9fd5963", new Object[]{this});
        }
        return this.mRecommendDataManager.t();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public String getPreloadUseCacheValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7f21ddf6", new Object[]{this});
        }
        return this.mDetailRequestManagerWrapper.I();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public long getQuickSecondRefreshMd5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e9235809", new Object[]{this})).longValue();
        }
        return this.mRecommendDataManager.u();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public String getRecommendRequestId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("993fa4d5", new Object[]{this});
        }
        return this.mRecommendDataRequestManager.A();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public String getRequestRetCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ee1a0884", new Object[]{this});
        }
        return this.mRecommendDataRequestManager.B();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public long getStartRecommendtime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76844038", new Object[]{this})).longValue();
        }
        return this.mRecommendDataRequestManager.C();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public int getTotalCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ffb341b", new Object[]{this})).intValue();
        }
        return this.mRecommendDataManager.v();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public Map<String, Object> getTransmission() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3c695056", new Object[]{this});
        }
        return this.mRecommendDataRequestManager.D();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public Map<String, Object> getTransmissionUP() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("803efbb1", new Object[]{this});
        }
        return this.mRecommendDataRequestManager.E();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService, tb.i6e
    public String getUnExposeIds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72ff2b94", new Object[]{this});
        }
        return this.mUnexposedDataManager.getUnExposeIds();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService, tb.i6e
    public List getUnExposeItems() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c74ff73", new Object[]{this});
        }
        return this.mUnexposedDataManager.getUnExposeItems();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService, tb.i6e
    public List<a.d> getUnExposedItems() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7da581d1", new Object[]{this});
        }
        return this.mUnexposedDataManager.getUnExposedItems();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public ArrayList<a> getUnRemoveMediaSetList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("27e83b10", new Object[]{this});
        }
        return this.mRecommendDataManager.w();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService, tb.i6e
    public List<MediaContentDetailData> getUnVisibleOrExposedItems(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ae902e1a", new Object[]{this, new Boolean(z), new Boolean(z2)});
        }
        return this.mUnexposedDataManager.getUnVisibleOrExposedItems(z, z2);
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public List<a> getUnmodifiableMediaSetList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("98383071", new Object[]{this});
        }
        return this.mRecommendDataManager.x();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public Handler getmPreloadNextHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("a3d7e1fa", new Object[]{this});
        }
        return this.mRecommendDataManager.y();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void insertDetailListAtCurrent(kon.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e481aa39", new Object[]{this, hVar});
        } else {
            this.mRecommendDataManager.z(hVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public boolean isDetailLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8c036ac", new Object[]{this})).booleanValue();
        }
        return this.mDetailRequestManagerWrapper.M();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public boolean isDetailMTopSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87a218ab", new Object[]{this})).booleanValue();
        }
        return this.mDetailRequestManagerWrapper.N();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public boolean isDetailRequestSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ba4767a", new Object[]{this})).booleanValue();
        }
        return this.mDataListenerManager.isDetailRequestSuccess();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public boolean isDownNoMoreData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de829217", new Object[]{this})).booleanValue();
        }
        return this.mRecommendDataRequestManager.H();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public boolean isHasPageErrorShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d79f1b1", new Object[]{this})).booleanValue();
        }
        return this.mDetailRequestManagerWrapper.O();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public boolean isHasShowNoMoreMsg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60df62c9", new Object[]{this})).booleanValue();
        }
        return this.mRecommendDataRequestManager.I();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public boolean isLoadingMore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2ac832", new Object[]{this})).booleanValue();
        }
        return this.mRecommendDataRequestManager.J();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public boolean isLoadingUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0a514f8", new Object[]{this})).booleanValue();
        }
        return this.mRecommendDataRequestManager.K();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public boolean isNoMoreData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b47f59d5", new Object[]{this})).booleanValue();
        }
        return this.mRecommendDataRequestManager.L();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public boolean isNoMoreDataUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8956490", new Object[]{this})).booleanValue();
        }
        return this.mRecommendDataRequestManager.M();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public boolean isTab3CacheEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1cd46908", new Object[]{this})).booleanValue();
        }
        return this.mTab3CacheEnable;
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public boolean isTab3FirstCellIconStreamRequestDetail() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("931ef808", new Object[]{this})).booleanValue();
        }
        return this.mDetailRequestManagerWrapper.R();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public boolean isTab3LauncherHitMtopPrefetch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d4a7235", new Object[]{this})).booleanValue();
        }
        return this.mDetailRequestManagerWrapper.S();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public boolean isUpNoMoreData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3ac3ed0", new Object[]{this})).booleanValue();
        }
        return this.mRecommendDataRequestManager.N();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public boolean ismHasShowNoMoreMsgUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fcc931d", new Object[]{this})).booleanValue();
        }
        return this.mRecommendDataRequestManager.O();
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void notifyContentDetailCallback(rg7.c cVar, yao<Pair<a, MediaMixContentDetail>> yaoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e71ba78", new Object[]{this, cVar, yaoVar});
        } else {
            this.mDataListenerManager.notifyContentDetailCallback(cVar, yaoVar);
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
            return;
        }
        this.mDetailRequestManagerWrapper = new sg7(this.mFluidContext);
        this.mRecommendDataRequestManager = new kon(this.mFluidContext);
        this.mRecommendDataManager = new inn(this.mFluidContext);
        this.mUnexposedDataManager = new tgv(this.mFluidContext);
        this.mDynamicRecommendManager = new k58(this.mFluidContext);
        this.mMediaInfoRequestManager = new MediaInfoRequestManager(this.mFluidContext);
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService, tb.uxb
    public void onDataChanged(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("559b0a2d", new Object[]{this, aVar});
        } else {
            this.mDataListenerManager.onDataChanged(aVar);
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService, tb.dzb
    public void onDetailRequestSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91cae82b", new Object[]{this});
        } else {
            this.mDataListenerManager.onDetailRequestSuccess();
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService, tb.rg7.c
    public void onResult(yao<Pair<a, MediaMixContentDetail>> yaoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fcf9b57", new Object[]{this, yaoVar});
        } else {
            this.mDataListenerManager.onResult(yaoVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService, tb.ood
    public void onServerConfigChanged(ncp ncpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23d4bb4", new Object[]{this, ncpVar});
        } else {
            this.mDataListenerManager.onServerConfigChanged(ncpVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService, tb.rg7.c
    public void onStartRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adbafdd3", new Object[]{this});
        } else {
            this.mDataListenerManager.onStartRequest();
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void postLoadDownRunnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("642ed0ac", new Object[]{this});
        } else {
            this.mRecommendDataRequestManager.P();
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void postLoadUpRunnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b46a5", new Object[]{this});
        } else {
            this.mRecommendDataRequestManager.Q();
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService, tb.n1c
    public boolean reOrderTailUnExposeList(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("780399e2", new Object[]{this, list})).booleanValue();
        }
        return this.mDynamicRecommendManager.reOrderTailUnExposeList(list);
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void refreshCurrentData(a aVar, vrp.a aVar2, vx1 vx1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70cb0a19", new Object[]{this, aVar, aVar2, vx1Var});
        } else {
            this.mRecommendDataManager.D(aVar, aVar2, vx1Var);
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void removeDataChangeListener(uxb uxbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed948c34", new Object[]{this, uxbVar});
        } else {
            this.mDataListenerManager.removeDataChangeListener(uxbVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void removeDetailListAtIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a3da30", new Object[]{this, new Integer(i)});
        } else {
            this.mRecommendDataManager.E(i);
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void removeDetailListByIds(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccd2cae6", new Object[]{this, list});
        } else {
            this.mRecommendDataManager.F(list);
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void removeDetailListWithAuthor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d59e7615", new Object[]{this, str});
        } else {
            this.mRecommendDataManager.G(str);
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void removeDetailRequestListener(rg7.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b7e199c", new Object[]{this, cVar});
        } else {
            this.mDataListenerManager.removeDetailRequestListener(cVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void removeDetailRequestSuccessListener(dzb dzbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("755bccc0", new Object[]{this, dzbVar});
        } else {
            this.mDataListenerManager.removeDetailRequestSuccessListener(dzbVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void removeLoadingRequestCallback(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d973fbf1", new Object[]{this, new Boolean(z)});
        } else {
            this.mRecommendDataRequestManager.T(z);
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void removeMultiDetailRequestListener(rg7.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3f8c7b6", new Object[]{this, dVar});
        } else {
            this.mDataListenerManager.removeMultiDetailRequestListener(dVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void removeServerConfigChangeListener(ood oodVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b727e184", new Object[]{this, oodVar});
        } else {
            this.mDataListenerManager.removeServerConfigChangeListener(oodVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void replaceDetail(kon.h hVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ba9906a", new Object[]{this, hVar, str});
        } else {
            this.mRecommendDataManager.H(hVar, str);
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void requestDetailDataAndRefresh(d5n d5nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eeb1baa5", new Object[]{this, d5nVar});
        } else {
            this.mRecommendDataRequestManager.U(d5nVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void requestForCommendData(boolean z, boolean z2, boolean z3, int i, String str, aon aonVar, sv2<kon.h> sv2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dcede", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3), new Integer(i), str, aonVar, sv2Var});
        } else {
            this.mRecommendDataRequestManager.V(z, z2, z3, i, str, aonVar, sv2Var);
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void requestList(boolean z, Map map, sv2<kon.h> sv2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b910fdf7", new Object[]{this, new Boolean(z), map, sv2Var});
            return;
        }
        setLoadingState(z, false);
        this.mRecommendDataRequestManager.X(z, map, sv2Var);
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void requestListForCollection(boolean z, Map map, int i, sv2<kon.h> sv2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17211603", new Object[]{this, new Boolean(z), map, new Integer(i), sv2Var});
        } else if (!((ICollectionService) this.mFluidContext.getService(ICollectionService.class)).isCollectionScene() || i <= 0) {
            this.mRecommendDataRequestManager.X(z, map, sv2Var);
        } else {
            this.mRecommendDataRequestManager.W(z, i, map, sv2Var);
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void requestListInternal(boolean z, Map map, sv2<kon.h> sv2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65431a54", new Object[]{this, new Boolean(z), map, sv2Var});
        } else {
            this.mRecommendDataRequestManager.X(z, map, sv2Var);
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void resetNoMoreDataFlag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e36a342", new Object[]{this});
        } else {
            this.mRecommendDataRequestManager.Y();
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void setBeforeDetailMtopTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dbf1676", new Object[]{this, new Long(j)});
        } else {
            this.mDetailRequestManagerWrapper.U(j);
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void setDetailMtopCost(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c216fdf5", new Object[]{this, new Long(j)});
        } else {
            this.mDetailRequestManagerWrapper.V(j);
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void setDetailMtopSuccessTIme(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48ae3da8", new Object[]{this, new Long(j)});
        } else {
            this.mDetailRequestManagerWrapper.W(j);
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void setHasShowNoMoreMsg(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d802c77", new Object[]{this, new Boolean(z)});
        } else {
            this.mRecommendDataRequestManager.Z(z);
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void setHasShowNoMoreMsgUp(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75aa741c", new Object[]{this, new Boolean(z)});
        } else {
            this.mRecommendDataRequestManager.a0(z);
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void setLoadingState(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c388fa3e", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else {
            this.mRecommendDataRequestManager.b0(z, z2);
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void setLoopOnceRequestRecommend(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5890d8d9", new Object[]{this, new Boolean(z)});
        } else {
            this.mRecommendDataManager.I(z);
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void setMediaSet(List<a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b141ebd8", new Object[]{this, list});
        } else {
            this.mRecommendDataManager.J(list);
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void setMediaSetAndScrollTo(List<a> list, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a4067a7", new Object[]{this, list, new Boolean(z), str});
        } else {
            this.mRecommendDataManager.K(list, z, str);
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void setPreloadUseCacheValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49638940", new Object[]{this, str});
        } else {
            this.mDetailRequestManagerWrapper.X(str);
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void setTab3CacheEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4834d88", new Object[]{this, new Boolean(z)});
        } else {
            this.mTab3CacheEnable = z;
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void setTab3LauncherHitMtopPrefetch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28bb55fb", new Object[]{this, new Boolean(z)});
        } else {
            this.mDetailRequestManagerWrapper.Y(z);
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void setTransmission(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ff92f8", new Object[]{this, map});
        } else {
            this.mRecommendDataRequestManager.g0(map);
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void setTransmissionUp(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e69391dd", new Object[]{this, map});
        } else {
            this.mRecommendDataRequestManager.h0(map);
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void updateAppendRecommenParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fb62578", new Object[]{this, jSONObject});
        } else {
            this.mRecommendDataRequestManager.j0(jSONObject);
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService, tb.n1c
    public void updateNoDynamicRecContents(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb65b6ae", new Object[]{this, str, new Boolean(z)});
        } else {
            this.mDynamicRecommendManager.updateNoDynamicRecContents(str, z);
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void fetchContentDetail(Map map, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30b69b8e", new Object[]{this, map, new Boolean(z), new Boolean(z2)});
        } else {
            this.mDetailRequestManagerWrapper.u(map, z, z2);
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService, tb.rg7.d
    public void onResult(yao<Pair<a, MediaMixContentDetail>> yaoVar, yao<Pair<a, MediaMixContentDetail>> yaoVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc2f754b", new Object[]{this, yaoVar, yaoVar2});
        } else {
            this.mDataListenerManager.onResult(yaoVar, yaoVar2);
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService, tb.rg7.d
    public void onStartRequest(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a52f90", new Object[]{this, new Integer(i)});
        } else {
            this.mDataListenerManager.onStartRequest(i);
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void fetchContentDetail(Map map, boolean z, boolean z2, boolean z3, d5n d5nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d582ff4", new Object[]{this, map, new Boolean(z), new Boolean(z2), new Boolean(z3), d5nVar});
        } else {
            this.mDetailRequestManagerWrapper.v(map, z, z2, z3, d5nVar);
        }
    }
}
