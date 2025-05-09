package com.taobao.live.liveroom.updown.mtop.manager;

import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.helper.ITaoLiveKtGlobalTimerHandler;
import com.taobao.kmp.live.updown.TaoLiveKtUpDownRequestType;
import com.taobao.kmp.live.updown.model.TaoLiveKtAlimamaInfo;
import com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel;
import com.taobao.kmp.live.updown.model.TaoLiveKtUpDownResponse;
import com.taobao.live.liveroom.liveBizComponent.ktManager.helper.TaoLiveKtGlobalTimer;
import com.taobao.live.liveroom.updown.mtop.manager.TaoLiveKtUpDownRequestManager;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import tb.c5t;
import tb.ckf;
import tb.e5t;
import tb.g1a;
import tb.i04;
import tb.iqz;
import tb.j0g;
import tb.ju6;
import tb.l0g;
import tb.l1t;
import tb.oyd;
import tb.pus;
import tb.pxs;
import tb.rsq;
import tb.t2o;
import tb.u5t;
import tb.w1a;
import tb.xhv;
import tb.yj4;
import tb.z3t;
import tb.ziv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010%\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004JC\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072 \u0010\u000e\u001a\u001c\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010JE\u0010\u0011\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072 \u0010\u000e\u001a\u001c\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J3\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010 \u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b \u0010!J#\u0010\"\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\rH\u0002¢\u0006\u0004\b$\u0010\u0004J\u0019\u0010%\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b'\u0010&J\u000f\u0010(\u001a\u00020\rH\u0002¢\u0006\u0004\b(\u0010\u0004J\u000f\u0010)\u001a\u00020\rH\u0002¢\u0006\u0004\b)\u0010\u0004J!\u0010-\u001a\u00020\r2\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010,\u001a\u00020\u000bH\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\rH\u0016¢\u0006\u0004\b/\u0010\u0004J\u000f\u00100\u001a\u00020\rH\u0016¢\u0006\u0004\b0\u0010\u0004J'\u00104\u001a\u00020\r2\u0016\u00103\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u000102\u0018\u000101H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\rH\u0016¢\u0006\u0004\b6\u0010\u0004J;\u00109\u001a\u00020\r2\b\u00107\u001a\u0004\u0018\u00010\u001c2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0016\u00108\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u000102\u0018\u000101H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020\r2\u0006\u0010;\u001a\u00020\u0007H\u0016¢\u0006\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010A\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010C\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010BR$\u0010D\u001a\u0004\u0018\u00010*8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0016\u0010J\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010BR\u0018\u0010K\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR2\u0010M\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u000102\u0018\u0001018\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u00105R2\u0010S\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u000102\u0018\u00010R8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bS\u0010N\u001a\u0004\bT\u0010P\"\u0004\bU\u00105R\"\u0010V\u001a\u00020\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R$\u0010\\\u001a\u0004\u0018\u00010\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\\\u0010?\u001a\u0004\b]\u0010^\"\u0004\b_\u0010=R\u0018\u0010a\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010c\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010?R&\u0010d\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u000102\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010NR\u0016\u0010f\u001a\u00020e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0016\u0010h\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010?R\u0016\u0010i\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010BRL\u0010m\u001a,\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\f\u0012\n\u0012\u0004\u0012\u00020k\u0018\u00010j\u0012\u0004\u0012\u00020\r\u0018\u00010\tj\u0004\u0018\u0001`l8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR@\u0010t\u001a \u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u000102\u0018\u000101\u0012\u0004\u0012\u00020\r\u0018\u00010s8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010y¨\u0006z"}, d2 = {"Lcom/taobao/live/liveroom/updown/mtop/manager/TaoLiveKtUpDownRequestManager;", "Ltb/oyd;", "Lcom/taobao/kmp/live/liveBizComponent/helper/ITaoLiveKtGlobalTimerHandler;", "<init>", "()V", "Ltb/ziv;", "requestModel", "", "requestTypeName", "Lkotlin/Function3;", "Ltb/l0g;", "", "Lcom/taobao/kmp/live/updown/model/TaoLiveKtUpDownResponse;", "Ltb/xhv;", "callback", "performBatchRecRequest", "(Ltb/ziv;Ljava/lang/String;Ltb/w1a;)V", "performRealTimeRecRequest", "resultOriginData", "isSuccess", "responseModel", "handleUpDownRequestResponse", "(Ltb/l0g;ZLcom/taobao/kmp/live/updown/model/TaoLiveKtUpDownResponse;Ljava/lang/String;)V", "requestType", "handleResponseOnError", "(Ltb/l0g;Ljava/lang/String;)V", "handleResponseNoData", "(Ltb/l0g;)V", "Lcom/taobao/kmp/live/updown/model/TaoLiveKtSwitchModel;", "curModel", "nextModel", "isFirst", "initAutoRecommend", "(Lcom/taobao/kmp/live/updown/model/TaoLiveKtSwitchModel;Lcom/taobao/kmp/live/updown/model/TaoLiveKtSwitchModel;Z)V", "enableAutoRecommend", "(Lcom/taobao/kmp/live/updown/model/TaoLiveKtSwitchModel;Lcom/taobao/kmp/live/updown/model/TaoLiveKtSwitchModel;)Z", "pollingAutoRecommendTimer", "sendAutoLoopTask", "(Lcom/taobao/kmp/live/updown/model/TaoLiveKtSwitchModel;)V", "sendAutoLoopTaskFast", "launchPollingTimer", "pollingAlimamaAdsTimer", "Ltb/pxs;", "cacheManager", yj4.PARAM_SWITCH_RT_RCMD, "initManager", "(Ltb/pxs;Z)V", "start", "stop", "", "", "initTppParams", "buildInitTppParams", "(Ljava/util/Map;)V", "liveRoomSwitched", "model", "additionalParams", "requestRecommendModel", "(Lcom/taobao/kmp/live/updown/model/TaoLiveKtSwitchModel;Ljava/lang/String;Ljava/util/Map;)V", "tag", "handleEvent", "(Ljava/lang/String;)V", RPCDataItems.SWITCH_TAG_LOG, "Ljava/lang/String;", "", "s", "J", "n", "mCacheManager", "Ltb/pxs;", "getMCacheManager", "()Ltb/pxs;", "setMCacheManager", "(Ltb/pxs;)V", "mLastRequestTime", "mLastRequestModel", "Ltb/ziv;", "mFirstInitParams", "Ljava/util/Map;", "getMFirstInitParams", "()Ljava/util/Map;", "setMFirstInitParams", "", "mInitTppParams", "getMInitTppParams", "setMInitTppParams", "mSwitchRtRcmd", "Z", "getMSwitchRtRcmd", "()Z", "setMSwitchRtRcmd", "(Z)V", "mMockUserId", "getMMockUserId", "()Ljava/lang/String;", "setMMockUserId", "Lcom/taobao/live/liveroom/liveBizComponent/ktManager/helper/TaoLiveKtGlobalTimer;", "timer", "Lcom/taobao/live/liveroom/liveBizComponent/ktManager/helper/TaoLiveKtGlobalTimer;", "autoRecommendTask", "lastAdditionalParams", "", "mAutoRecommendTime", TLogTracker.LEVEL_INFO, "alimamaAdsTask", "alimamaAdsCheckInterval", "", "Ltb/z3t;", "Lcom/taobao/live/liveroom/updown/mtop/manager/onResponseHandleCompletionCallBack;", "responseHandleCompletionCallBack", "Ltb/w1a;", "getResponseHandleCompletionCallBack", "()Ltb/w1a;", "setResponseHandleCompletionCallBack", "(Ltb/w1a;)V", "Lkotlin/Function1;", "tppParamsBuildCallback", "Ltb/g1a;", "getTppParamsBuildCallback", "()Ltb/g1a;", "setTppParamsBuildCallback", "(Ltb/g1a;)V", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtUpDownRequestManager implements oyd, ITaoLiveKtGlobalTimerHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<String, ? extends Object> lastAdditionalParams;
    private int mAutoRecommendTime;
    private pxs mCacheManager;
    private Map<String, ? extends Object> mFirstInitParams;
    private ziv mLastRequestModel;
    private long mLastRequestTime;
    private String mMockUserId;
    private boolean mSwitchRtRcmd;
    private long n;
    private w1a<? super Boolean, ? super String, ? super List<z3t>, xhv> responseHandleCompletionCallBack;
    private long s;
    private TaoLiveKtGlobalTimer timer;
    private g1a<? super Map<String, ? extends Object>, xhv> tppParamsBuildCallback;
    private final String TAG = "TaoLiveKtUpDownRequestManager";
    private Map<String, Object> mInitTppParams = new LinkedHashMap();
    private String autoRecommendTask = "autoRealTimeRecommendTask";
    private String alimamaAdsTask = "alimamaAdsTask";
    private long alimamaAdsCheckInterval = Long.MAX_VALUE;

    static {
        t2o.a(1010827419);
        t2o.a(1010827416);
        t2o.a(1003487277);
    }

    private final boolean enableAutoRecommend(TaoLiveKtSwitchModel taoLiveKtSwitchModel, TaoLiveKtSwitchModel taoLiveKtSwitchModel2) {
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ede26795", new Object[]{this, taoLiveKtSwitchModel, taoLiveKtSwitchModel2})).booleanValue();
        }
        if (taoLiveKtSwitchModel != null && c5t.INSTANCE.z()) {
            TaoLiveKtAlimamaInfo taoLiveKtAlimamaInfo = null;
            if (taoLiveKtSwitchModel2 != null) {
                map = taoLiveKtSwitchModel2.getReserveItemCardInfo();
            } else {
                map = null;
            }
            if (map == null) {
                if (taoLiveKtSwitchModel2 != null) {
                    taoLiveKtAlimamaInfo = taoLiveKtSwitchModel2.getAlimama();
                }
                if (taoLiveKtAlimamaInfo != null || taoLiveKtSwitchModel.getAutoRecommendRepeat() == 0 || taoLiveKtSwitchModel.getAutoRecommendInterval() == 0 || taoLiveKtSwitchModel.getAutoRecommendIntervalFast() == 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    private final void handleResponseNoData(l0g l0gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4d183dd", new Object[]{this, l0gVar});
            return;
        }
        pus pusVar = pus.INSTANCE;
        String str = this.TAG;
        pusVar.g(str, "", "live_recommend_no_data " + hashCode());
        u5t.INSTANCE.a("0", getMInitTppParams(), l0gVar);
    }

    private final void handleResponseOnError(l0g l0gVar, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7859e313", new Object[]{this, l0gVar, str});
            return;
        }
        pus pusVar = pus.INSTANCE;
        String str3 = this.TAG;
        StringBuilder sb = new StringBuilder("handleRequestOnError, requestType:");
        sb.append(str);
        sb.append(", error msg:");
        j0g b = l0gVar.b();
        String str4 = null;
        if (b != null) {
            str2 = b.a();
        } else {
            str2 = null;
        }
        sb.append(str2);
        pusVar.g(str3, "", sb.toString());
        u5t u5tVar = u5t.INSTANCE;
        j0g b2 = l0gVar.b();
        if (b2 != null) {
            str4 = b2.b();
        }
        u5tVar.a(str4, getMInitTppParams(), l0gVar);
        TaoLiveKtGlobalTimer taoLiveKtGlobalTimer = this.timer;
        if (taoLiveKtGlobalTimer != null) {
            taoLiveKtGlobalTimer.unregisterEvent(this, this.autoRecommendTask);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xhv handleUpDownRequestResponse$lambda$3(TaoLiveKtUpDownRequestManager taoLiveKtUpDownRequestManager, boolean z, String str, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("151c9d4c", new Object[]{taoLiveKtUpDownRequestManager, new Boolean(z), str, list});
        }
        w1a<Boolean, String, List<z3t>, xhv> responseHandleCompletionCallBack = taoLiveKtUpDownRequestManager.getResponseHandleCompletionCallBack();
        if (responseHandleCompletionCallBack != null) {
            responseHandleCompletionCallBack.invoke(Boolean.valueOf(z), str, list);
        }
        return xhv.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xhv handleUpDownRequestResponse$lambda$4(TaoLiveKtUpDownRequestManager taoLiveKtUpDownRequestManager, boolean z, String str, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("3af292b", new Object[]{taoLiveKtUpDownRequestManager, new Boolean(z), str, list});
        }
        w1a<Boolean, String, List<z3t>, xhv> responseHandleCompletionCallBack = taoLiveKtUpDownRequestManager.getResponseHandleCompletionCallBack();
        if (responseHandleCompletionCallBack != null) {
            responseHandleCompletionCallBack.invoke(Boolean.valueOf(z), str, list);
        }
        return xhv.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xhv handleUpDownRequestResponse$lambda$5(TaoLiveKtUpDownRequestManager taoLiveKtUpDownRequestManager, boolean z, String str, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("f241b50a", new Object[]{taoLiveKtUpDownRequestManager, new Boolean(z), str, list});
        }
        w1a<Boolean, String, List<z3t>, xhv> responseHandleCompletionCallBack = taoLiveKtUpDownRequestManager.getResponseHandleCompletionCallBack();
        if (responseHandleCompletionCallBack != null) {
            responseHandleCompletionCallBack.invoke(Boolean.valueOf(z), str, list);
        }
        return xhv.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xhv handleUpDownRequestResponse$lambda$6(TaoLiveKtUpDownRequestManager taoLiveKtUpDownRequestManager, boolean z, String str, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("e0d440e9", new Object[]{taoLiveKtUpDownRequestManager, new Boolean(z), str, list});
        }
        w1a<Boolean, String, List<z3t>, xhv> responseHandleCompletionCallBack = taoLiveKtUpDownRequestManager.getResponseHandleCompletionCallBack();
        if (responseHandleCompletionCallBack != null) {
            responseHandleCompletionCallBack.invoke(Boolean.valueOf(z), str, list);
        }
        return xhv.INSTANCE;
    }

    private final void initAutoRecommend(TaoLiveKtSwitchModel taoLiveKtSwitchModel, TaoLiveKtSwitchModel taoLiveKtSwitchModel2, boolean z) {
        Map<String, Object> map;
        Object obj;
        long j;
        long j2;
        String str;
        long j3;
        long j4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c941acf0", new Object[]{this, taoLiveKtSwitchModel, taoLiveKtSwitchModel2, new Boolean(z)});
            return;
        }
        this.mAutoRecommendTime = 0;
        TaoLiveKtGlobalTimer taoLiveKtGlobalTimer = this.timer;
        if (taoLiveKtGlobalTimer != null) {
            taoLiveKtGlobalTimer.unregisterEvent(this, this.autoRecommendTask);
        }
        if (taoLiveKtSwitchModel != null) {
            if (z) {
                if (taoLiveKtSwitchModel2 != null) {
                    j3 = taoLiveKtSwitchModel2.getAutoRecommendInterval();
                } else {
                    j3 = 0;
                }
                taoLiveKtSwitchModel.setAutoRecommendInterval(j3);
                if (taoLiveKtSwitchModel2 != null) {
                    j4 = taoLiveKtSwitchModel2.getAutoRecommendRepeat();
                } else {
                    j4 = 0;
                }
                taoLiveKtSwitchModel.setAutoRecommendRepeat(j4);
            }
            Object obj2 = null;
            if (z) {
                l1t l1tVar = l1t.INSTANCE;
                if (taoLiveKtSwitchModel2 != null) {
                    str = taoLiveKtSwitchModel2.getExtendMap();
                } else {
                    str = null;
                }
                map = l1tVar.e(str);
            } else {
                map = l1t.INSTANCE.e(taoLiveKtSwitchModel.getExtendMap());
            }
            if (map != null) {
                obj = map.get("autoRecommendIntervalFast");
            } else {
                obj = null;
            }
            Double k = rsq.k(String.valueOf(obj));
            if (k != null) {
                j = (long) k.doubleValue();
            } else {
                j = 0;
            }
            taoLiveKtSwitchModel.setAutoRecommendIntervalFast(j);
            if (map != null) {
                obj2 = map.get("autoRecommendFastStart");
            }
            Double k2 = rsq.k(String.valueOf(obj2));
            if (k2 != null) {
                j2 = (long) k2.doubleValue();
            } else {
                j2 = 0;
            }
            taoLiveKtSwitchModel.setAutoRecommendFastStart(j2);
            if (!enableAutoRecommend(taoLiveKtSwitchModel, taoLiveKtSwitchModel2)) {
                return;
            }
            if (taoLiveKtSwitchModel.getAutoRecommendFastStart() > 0) {
                sendAutoLoopTask(taoLiveKtSwitchModel);
            } else {
                sendAutoLoopTaskFast(taoLiveKtSwitchModel);
            }
        }
    }

    private final void launchPollingTimer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec43a9c", new Object[]{this});
            return;
        }
        c5t c5tVar = c5t.INSTANCE;
        if (c5tVar.E()) {
            long x = c5tVar.x() * 1000;
            this.alimamaAdsCheckInterval = x;
            TaoLiveKtGlobalTimer taoLiveKtGlobalTimer = this.timer;
            if (taoLiveKtGlobalTimer != null) {
                taoLiveKtGlobalTimer.loopEvent(this, this.alimamaAdsTask, x);
            }
        }
    }

    private final void performBatchRecRequest(ziv zivVar, String str, w1a<? super l0g, ? super Boolean, ? super TaoLiveKtUpDownResponse, xhv> w1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("716e9c9c", new Object[]{this, zivVar, str, w1aVar});
            return;
        }
        pus pusVar = pus.INSTANCE;
        String str2 = this.TAG;
        pusVar.k(str2, "", "perform Batch Recommend Request, requestType:" + str);
        if (ckf.b(str, TaoLiveKtUpDownRequestType.FirstBatch.getValue())) {
            this.s = 0L;
            zivVar.b(zivVar.a() + ":0");
        }
        this.n = c5t.INSTANCE.y();
        zivVar.g(Long.valueOf(this.s));
        zivVar.f(Long.valueOf(this.n));
        e5t.INSTANCE.a(zivVar, str, w1aVar);
    }

    private final void performRealTimeRecRequest(ziv zivVar, String str, w1a<? super l0g, ? super Boolean, ? super TaoLiveKtUpDownResponse, xhv> w1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("570045cf", new Object[]{this, zivVar, str, w1aVar});
            return;
        }
        pus pusVar = pus.INSTANCE;
        String str2 = this.TAG;
        pusVar.k(str2, "", "perform RealTime Recommend Request, requestType:" + str);
        if (ckf.b(str, TaoLiveKtUpDownRequestType.AdRealtime.getValue())) {
            ziv zivVar2 = this.mLastRequestModel;
            if (zivVar2 != null) {
                e5t.INSTANCE.a(zivVar2, str, w1aVar);
            }
        } else if (!ckf.b(str, TaoLiveKtUpDownRequestType.NormalRealtime.getValue()) && !ckf.b(str, TaoLiveKtUpDownRequestType.AutoRealtime.getValue())) {
            pusVar.g(this.TAG, "", "requestType is not supported");
        } else if (getMSwitchRtRcmd() && zivVar != null) {
            long a2 = ju6.a();
            c5t c5tVar = c5t.INSTANCE;
            if (a2 - this.mLastRequestTime >= c5tVar.I() || !c5tVar.F()) {
                this.n = 1L;
                zivVar.f(1L);
                zivVar.g(Long.valueOf(this.s));
                e5t.INSTANCE.a(zivVar, str, w1aVar);
                this.mLastRequestTime = a2;
                this.mLastRequestModel = zivVar;
                return;
            }
            pusVar.g(this.TAG, "", "performRealTime interval less than settings");
        }
    }

    private final void pollingAlimamaAdsTimer() {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b913699f", new Object[]{this});
            return;
        }
        pxs mCacheManager = getMCacheManager();
        if (mCacheManager != null) {
            num = Integer.valueOf(mCacheManager.b());
        } else {
            num = null;
        }
        if (num == null || num.intValue() != -1) {
            requestRecommendModel(null, TaoLiveKtUpDownRequestType.AdRealtime.getValue(), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xhv requestRecommendModel$lambda$0(TaoLiveKtUpDownRequestManager taoLiveKtUpDownRequestManager, String str, l0g l0gVar, boolean z, TaoLiveKtUpDownResponse taoLiveKtUpDownResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("40f4f1fc", new Object[]{taoLiveKtUpDownRequestManager, str, l0gVar, new Boolean(z), taoLiveKtUpDownResponse});
        }
        ckf.g(l0gVar, "resultData");
        taoLiveKtUpDownRequestManager.handleUpDownRequestResponse(l0gVar, z, taoLiveKtUpDownResponse, str);
        return xhv.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xhv requestRecommendModel$lambda$1(TaoLiveKtUpDownRequestManager taoLiveKtUpDownRequestManager, String str, l0g l0gVar, boolean z, TaoLiveKtUpDownResponse taoLiveKtUpDownResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("79b0bf1b", new Object[]{taoLiveKtUpDownRequestManager, str, l0gVar, new Boolean(z), taoLiveKtUpDownResponse});
        }
        ckf.g(l0gVar, "resultData");
        taoLiveKtUpDownRequestManager.handleUpDownRequestResponse(l0gVar, z, taoLiveKtUpDownResponse, str);
        return xhv.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xhv requestRecommendModel$lambda$2(TaoLiveKtUpDownRequestManager taoLiveKtUpDownRequestManager, String str, l0g l0gVar, boolean z, TaoLiveKtUpDownResponse taoLiveKtUpDownResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("b26c8c3a", new Object[]{taoLiveKtUpDownRequestManager, str, l0gVar, new Boolean(z), taoLiveKtUpDownResponse});
        }
        ckf.g(l0gVar, "resultData");
        taoLiveKtUpDownRequestManager.handleUpDownRequestResponse(l0gVar, z, taoLiveKtUpDownResponse, str);
        return xhv.INSTANCE;
    }

    private final void sendAutoLoopTask(TaoLiveKtSwitchModel taoLiveKtSwitchModel) {
        TaoLiveKtGlobalTimer taoLiveKtGlobalTimer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99f84393", new Object[]{this, taoLiveKtSwitchModel});
        } else if (taoLiveKtSwitchModel != null && (taoLiveKtGlobalTimer = this.timer) != null) {
            taoLiveKtGlobalTimer.delayEvent(this, this.autoRecommendTask, taoLiveKtSwitchModel.getAutoRecommendInterval() * 1000);
        }
    }

    private final void sendAutoLoopTaskFast(TaoLiveKtSwitchModel taoLiveKtSwitchModel) {
        TaoLiveKtGlobalTimer taoLiveKtGlobalTimer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1745997", new Object[]{this, taoLiveKtSwitchModel});
        } else if (taoLiveKtSwitchModel != null && (taoLiveKtGlobalTimer = this.timer) != null) {
            taoLiveKtGlobalTimer.delayEvent(this, this.autoRecommendTask, taoLiveKtSwitchModel.getAutoRecommendIntervalFast() * 1000);
        }
    }

    @Override // tb.oyd
    public void buildInitTppParams(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4edbb182", new Object[]{this, map});
        } else if (map != null) {
            Map<String, Object> mInitTppParams = getMInitTppParams();
            if (mInitTppParams != null) {
                mInitTppParams.putAll(map);
            }
            iqz.INSTANCE.c(map);
        }
    }

    public pxs getMCacheManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pxs) ipChange.ipc$dispatch("76c119ff", new Object[]{this});
        }
        return this.mCacheManager;
    }

    public Map<String, Object> getMFirstInitParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("91a9918b", new Object[]{this});
        }
        return this.mFirstInitParams;
    }

    public Map<String, Object> getMInitTppParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7fa20a2f", new Object[]{this});
        }
        return this.mInitTppParams;
    }

    public String getMMockUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("591fb5d2", new Object[]{this});
        }
        return this.mMockUserId;
    }

    public boolean getMSwitchRtRcmd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa0c58a0", new Object[]{this})).booleanValue();
        }
        return this.mSwitchRtRcmd;
    }

    public w1a<Boolean, String, List<z3t>, xhv> getResponseHandleCompletionCallBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w1a) ipChange.ipc$dispatch("838e27b3", new Object[]{this});
        }
        return this.responseHandleCompletionCallBack;
    }

    public g1a<Map<String, ? extends Object>, xhv> getTppParamsBuildCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("736c60c6", new Object[]{this});
        }
        return this.tppParamsBuildCallback;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.helper.ITaoLiveKtGlobalTimerHandler
    public void handleEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ba63e63", new Object[]{this, str});
            return;
        }
        ckf.g(str, "tag");
        if (ckf.b(str, this.autoRecommendTask)) {
            pollingAutoRecommendTimer();
        } else if (ckf.b(str, this.alimamaAdsTask)) {
            pollingAlimamaAdsTimer();
        }
    }

    public void initManager(pxs pxsVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0977472", new Object[]{this, pxsVar, new Boolean(z)});
            return;
        }
        setMCacheManager(pxsVar);
        setMSwitchRtRcmd(z);
    }

    @Override // tb.oyd
    public void liveRoomSwitched() {
        TaoLiveKtSwitchModel taoLiveKtSwitchModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6d1ab61", new Object[]{this});
            return;
        }
        pxs mCacheManager = getMCacheManager();
        TaoLiveKtSwitchModel taoLiveKtSwitchModel2 = null;
        if (mCacheManager != null) {
            taoLiveKtSwitchModel = mCacheManager.d();
        } else {
            taoLiveKtSwitchModel = null;
        }
        pxs mCacheManager2 = getMCacheManager();
        if (mCacheManager2 != null) {
            taoLiveKtSwitchModel2 = mCacheManager2.o(taoLiveKtSwitchModel);
        }
        initAutoRecommend(taoLiveKtSwitchModel, taoLiveKtSwitchModel2, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ad, code lost:
        if ((r2 != null ? r2.get("cardInfo") : null) != null) goto L_0x00af;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cf  */
    @Override // tb.oyd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void requestRecommendModel(com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel r6, final java.lang.String r7, java.util.Map<java.lang.String, ? extends java.lang.Object> r8) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.live.liveroom.updown.mtop.manager.TaoLiveKtUpDownRequestManager.requestRecommendModel(com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel, java.lang.String, java.util.Map):void");
    }

    public void setMCacheManager(pxs pxsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf02d0a9", new Object[]{this, pxsVar});
        } else {
            this.mCacheManager = pxsVar;
        }
    }

    @Override // tb.oyd
    public void setMFirstInitParams(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b299e63", new Object[]{this, map});
        } else {
            this.mFirstInitParams = map;
        }
    }

    public void setMInitTppParams(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df57873f", new Object[]{this, map});
        } else {
            this.mInitTppParams = map;
        }
    }

    @Override // tb.oyd
    public void setMMockUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e28e334c", new Object[]{this, str});
        } else {
            this.mMockUserId = str;
        }
    }

    public void setMSwitchRtRcmd(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eaaefc4", new Object[]{this, new Boolean(z)});
        } else {
            this.mSwitchRtRcmd = z;
        }
    }

    @Override // tb.oyd
    public void setResponseHandleCompletionCallBack(w1a<? super Boolean, ? super String, ? super List<z3t>, xhv> w1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49adb797", new Object[]{this, w1aVar});
        } else {
            this.responseHandleCompletionCallBack = w1aVar;
        }
    }

    @Override // tb.oyd
    public void setTppParamsBuildCallback(g1a<? super Map<String, ? extends Object>, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d0cdea8", new Object[]{this, g1aVar});
        } else {
            this.tppParamsBuildCallback = g1aVar;
        }
    }

    @Override // tb.oyd
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        iqz.INSTANCE.d(getTppParamsBuildCallback());
        TaoLiveKtGlobalTimer taoLiveKtGlobalTimer = new TaoLiveKtGlobalTimer();
        this.timer = taoLiveKtGlobalTimer;
        taoLiveKtGlobalTimer.startTimer();
        launchPollingTimer();
    }

    @Override // tb.oyd
    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        TaoLiveKtGlobalTimer taoLiveKtGlobalTimer = this.timer;
        if (taoLiveKtGlobalTimer != null) {
            taoLiveKtGlobalTimer.destroy();
        }
    }

    private final void pollingAutoRecommendTimer() {
        TaoLiveKtSwitchModel d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79154ba2", new Object[]{this});
            return;
        }
        pxs mCacheManager = getMCacheManager();
        if (mCacheManager != null && (d = mCacheManager.d()) != null) {
            pxs mCacheManager2 = getMCacheManager();
            int i = -1;
            int c = mCacheManager2 != null ? mCacheManager2.c() : -1;
            pxs mCacheManager3 = getMCacheManager();
            if (mCacheManager3 != null) {
                i = mCacheManager3.f();
            }
            if (c < 0 || i < 0 || i > c) {
                pus.INSTANCE.g(this.TAG, "", "异常/回滑场景不能进行动态推荐请求");
                return;
            }
            requestRecommendModel(d, TaoLiveKtUpDownRequestType.AutoRealtime.getValue(), this.lastAdditionalParams);
            int i2 = this.mAutoRecommendTime + 1;
            this.mAutoRecommendTime = i2;
            if (i2 < d.getAutoRecommendFastStart()) {
                sendAutoLoopTask(d);
            } else if (this.mAutoRecommendTime < d.getAutoRecommendRepeat()) {
                sendAutoLoopTaskFast(d);
            } else {
                pus pusVar = pus.INSTANCE;
                String str = this.TAG;
                pusVar.g(str, "", "动态推荐次数已满，总次数:" + this.mAutoRecommendTime);
            }
        }
    }

    private final void handleUpDownRequestResponse(l0g l0gVar, final boolean z, TaoLiveKtUpDownResponse taoLiveKtUpDownResponse, final String str) {
        List<TaoLiveKtSwitchModel> model;
        TaoLiveKtSwitchModel taoLiveKtSwitchModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6c84eed", new Object[]{this, l0gVar, new Boolean(z), taoLiveKtUpDownResponse, str});
            return;
        }
        TaoLiveKtSwitchModel taoLiveKtSwitchModel2 = null;
        if (!z) {
            handleResponseOnError(l0gVar, str);
            w1a<Boolean, String, List<z3t>, xhv> responseHandleCompletionCallBack = getResponseHandleCompletionCallBack();
            if (responseHandleCompletionCallBack != null) {
                responseHandleCompletionCallBack.invoke(Boolean.valueOf(z), str, null);
            }
        } else if (taoLiveKtUpDownResponse == null || (model = taoLiveKtUpDownResponse.getModel()) == null || model.isEmpty()) {
            handleResponseNoData(l0gVar);
            w1a<Boolean, String, List<z3t>, xhv> responseHandleCompletionCallBack2 = getResponseHandleCompletionCallBack();
            if (responseHandleCompletionCallBack2 != null) {
                responseHandleCompletionCallBack2.invoke(Boolean.valueOf(z), str, null);
            }
        } else {
            pus pusVar = pus.INSTANCE;
            String str2 = this.TAG;
            StringBuilder sb = new StringBuilder("Request success, modelSize:");
            List<TaoLiveKtSwitchModel> model2 = taoLiveKtUpDownResponse.getModel();
            sb.append(model2 != null ? Integer.valueOf(model2.size()) : null);
            sb.append(" first liveId:");
            List<TaoLiveKtSwitchModel> model3 = taoLiveKtUpDownResponse.getModel();
            sb.append((model3 == null || (taoLiveKtSwitchModel = model3.get(0)) == null) ? null : taoLiveKtSwitchModel.getLiveId());
            sb.append(" requestType:");
            sb.append(str);
            sb.append(" hashCode:");
            sb.append(hashCode());
            pusVar.k(str2, "", sb.toString());
            pxs mCacheManager = getMCacheManager();
            if (mCacheManager != null) {
                TaoLiveKtUpDownRequestType taoLiveKtUpDownRequestType = TaoLiveKtUpDownRequestType.FirstBatch;
                if (ckf.b(str, taoLiveKtUpDownRequestType.getValue()) || ckf.b(str, TaoLiveKtUpDownRequestType.NextBatch.getValue()) || ckf.b(str, TaoLiveKtUpDownRequestType.ForceBatch.getValue())) {
                    if (ckf.b(str, taoLiveKtUpDownRequestType.getValue())) {
                        pxs mCacheManager2 = getMCacheManager();
                        TaoLiveKtSwitchModel d = mCacheManager2 != null ? mCacheManager2.d() : null;
                        List<TaoLiveKtSwitchModel> model4 = taoLiveKtUpDownResponse.getModel();
                        if (model4 != null) {
                            taoLiveKtSwitchModel2 = model4.get(0);
                        }
                        initAutoRecommend(d, taoLiveKtSwitchModel2, true);
                    }
                    mCacheManager.u(taoLiveKtUpDownResponse.getModel(), new g1a() { // from class: tb.m5t
                        @Override // tb.g1a
                        public final Object invoke(Object obj) {
                            xhv handleUpDownRequestResponse$lambda$3;
                            handleUpDownRequestResponse$lambda$3 = TaoLiveKtUpDownRequestManager.handleUpDownRequestResponse$lambda$3(TaoLiveKtUpDownRequestManager.this, z, str, (List) obj);
                            return handleUpDownRequestResponse$lambda$3;
                        }
                    });
                } else if (ckf.b(str, TaoLiveKtUpDownRequestType.NormalRealtime.getValue())) {
                    if (!c5t.INSTANCE.B()) {
                        int g = mCacheManager.g();
                        List<TaoLiveKtSwitchModel> model5 = taoLiveKtUpDownResponse.getModel();
                        if (model5 != null) {
                            taoLiveKtSwitchModel2 = model5.get(0);
                        }
                        mCacheManager.t(g, taoLiveKtSwitchModel2, new g1a() { // from class: tb.o5t
                            @Override // tb.g1a
                            public final Object invoke(Object obj) {
                                xhv handleUpDownRequestResponse$lambda$4;
                                handleUpDownRequestResponse$lambda$4 = TaoLiveKtUpDownRequestManager.handleUpDownRequestResponse$lambda$4(TaoLiveKtUpDownRequestManager.this, z, str, (List) obj);
                                return handleUpDownRequestResponse$lambda$4;
                            }
                        });
                    } else {
                        return;
                    }
                } else if (ckf.b(str, TaoLiveKtUpDownRequestType.AutoRealtime.getValue())) {
                    if (!c5t.INSTANCE.B()) {
                        TaoLiveKtSwitchModel d2 = mCacheManager.d();
                        List<TaoLiveKtSwitchModel> model6 = taoLiveKtUpDownResponse.getModel();
                        if (!enableAutoRecommend(d2, model6 != null ? model6.get(0) : null)) {
                            TaoLiveKtGlobalTimer taoLiveKtGlobalTimer = this.timer;
                            if (taoLiveKtGlobalTimer != null) {
                                taoLiveKtGlobalTimer.unregisterEvent(this, this.autoRecommendTask);
                                return;
                            }
                            return;
                        }
                        int g2 = mCacheManager.g() + 1;
                        List<TaoLiveKtSwitchModel> model7 = taoLiveKtUpDownResponse.getModel();
                        if (model7 != null) {
                            taoLiveKtSwitchModel2 = (TaoLiveKtSwitchModel) i04.d0(model7, 0);
                        }
                        mCacheManager.z(g2, taoLiveKtSwitchModel2, new g1a() { // from class: tb.q5t
                            @Override // tb.g1a
                            public final Object invoke(Object obj) {
                                xhv handleUpDownRequestResponse$lambda$5;
                                handleUpDownRequestResponse$lambda$5 = TaoLiveKtUpDownRequestManager.handleUpDownRequestResponse$lambda$5(TaoLiveKtUpDownRequestManager.this, z, str, (List) obj);
                                return handleUpDownRequestResponse$lambda$5;
                            }
                        });
                    } else {
                        return;
                    }
                } else if (!ckf.b(str, TaoLiveKtUpDownRequestType.AdRealtime.getValue())) {
                    pusVar.g(this.TAG, "", "requestType is not supported");
                } else if (!c5t.INSTANCE.B()) {
                    int b = mCacheManager.b();
                    List<TaoLiveKtSwitchModel> model8 = taoLiveKtUpDownResponse.getModel();
                    if (model8 != null) {
                        taoLiveKtSwitchModel2 = (TaoLiveKtSwitchModel) i04.d0(model8, 0);
                    }
                    mCacheManager.z(b, taoLiveKtSwitchModel2, new g1a() { // from class: tb.s5t
                        @Override // tb.g1a
                        public final Object invoke(Object obj) {
                            xhv handleUpDownRequestResponse$lambda$6;
                            handleUpDownRequestResponse$lambda$6 = TaoLiveKtUpDownRequestManager.handleUpDownRequestResponse$lambda$6(TaoLiveKtUpDownRequestManager.this, z, str, (List) obj);
                            return handleUpDownRequestResponse$lambda$6;
                        }
                    });
                } else {
                    return;
                }
                this.s += this.n;
            }
        }
    }
}
