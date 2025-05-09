package com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.manager;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.helper.ITaoLiveKtGlobalTimer;
import com.taobao.kmp.live.liveBizComponent.helper.ITaoLiveKtGlobalTimerHandler;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentEntity;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.send.TaoLiveKtCommentSendResponse;
import com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtUtManager;
import com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentManager;
import com.taobao.kmp.live.liveBizComponent.service.biz.comment.TaoLiveKtCommentDriverResult;
import com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent;
import com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.builder.TaoLiveKtCommentConfigBiz;
import com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.builder.TaoLiveKtCommentQueue;
import com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.driver.TaoLiveKtCommentDataCenter;
import com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.driver.TaoLiveKtCommentDriver;
import com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.manager.TaoLiveKtCommentManager;
import com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.receiver.TaoLiveKtCommentPull;
import com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.receiver.TaoLiveKtCommentRev;
import com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.receiver.TaoLiveKtHotSalePull;
import com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.receiver.TaoLiveKtPersonalityIntroPull;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import tb.ckf;
import tb.czs;
import tb.d04;
import tb.d1a;
import tb.e3t;
import tb.es6;
import tb.exs;
import tb.g1a;
import tb.h2t;
import tb.i04;
import tb.njg;
import tb.rxs;
import tb.t2o;
import tb.txs;
import tb.u1a;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0005J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0005J\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u0005J\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0005J\u001b\u0010\u0014\u001a\u00020\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u0005J\u0019\u0010\u001d\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J/\u0010'\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\r2\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010$H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0006H\u0016¢\u0006\u0004\b)\u0010\u0005J\u000f\u0010*\u001a\u00020\u0006H\u0016¢\u0006\u0004\b*\u0010\u0005J\u000f\u0010+\u001a\u00020\u0006H\u0016¢\u0006\u0004\b+\u0010\u0005J\u000f\u0010,\u001a\u00020\u0006H\u0016¢\u0006\u0004\b,\u0010\u0005J'\u0010-\u001a\u00020\u00062\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010$H\u0016¢\u0006\u0004\b-\u0010.J%\u00100\u001a\u00020\u00062\u0014\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0018\u00010$H\u0016¢\u0006\u0004\b0\u0010.J\u0017\u00102\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0017H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0006H\u0016¢\u0006\u0004\b4\u0010\u0005J\u000f\u00105\u001a\u00020\u0006H\u0016¢\u0006\u0004\b5\u0010\u0005J\u000f\u00106\u001a\u00020\u0006H\u0016¢\u0006\u0004\b6\u0010\u0005R\u0014\u00107\u001a\u00020\u00178\u0002X\u0082D¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u001b\u0010D\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0018\u0010F\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010I\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010L\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u001b\u0010R\u001a\u00020N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010A\u001a\u0004\bP\u0010QR\u001e\u0010T\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\\\u0010]\u001a<\u0012\u0013\u0012\u00110W¢\u0006\f\bX\u0012\b\bY\u0012\u0004\b\b(Z\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\bX\u0012\b\bY\u0012\u0004\b\b([\u0012\u0004\u0012\u00020\u0006\u0018\u00010Vj\u0004\u0018\u0001`\\8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bRM\u0010g\u001a-\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\u0012\u0018\u00010d¢\u0006\f\bX\u0012\b\bY\u0012\u0004\b\b(e\u0012\u0004\u0012\u00020\u0006\u0018\u00010cj\u0004\u0018\u0001`f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lRG\u0010o\u001a'\u0012\u0015\u0012\u0013\u0018\u00010m¢\u0006\f\bX\u0012\b\bY\u0012\u0004\b\b(Z\u0012\u0004\u0012\u00020\u0006\u0018\u00010cj\u0004\u0018\u0001`n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bo\u0010h\u001a\u0004\bp\u0010j\"\u0004\bq\u0010lRU\u0010t\u001a5\u0012#\u0012!\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010$¢\u0006\f\bX\u0012\b\bY\u0012\u0004\b\b(r\u0012\u0004\u0012\u00020\u0006\u0018\u00010cj\u0004\u0018\u0001`s8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bt\u0010h\u001a\u0004\bu\u0010j\"\u0004\bv\u0010lR\u0014\u0010z\u001a\u00020w8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bx\u0010yR\u0016\u0010}\u001a\u0004\u0018\u00010<8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b{\u0010|R\u0014\u0010\u007f\u001a\u00020w8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b~\u0010y¨\u0006\u0080\u0001"}, d2 = {"Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/manager/TaoLiveKtCommentManager;", "Lcom/taobao/live/liveroom/liveBizComponent/ktManager/base/TaoLiveKtComponent;", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/comment/ITaoLiveKtCommentManager;", "Lcom/taobao/kmp/live/liveBizComponent/helper/ITaoLiveKtGlobalTimerHandler;", "<init>", "()V", "Ltb/xhv;", "resumeComments", "pauseComments", "registerPowerMsg", "startPowerMsgDriver", "addNoticeIfNeeded", "startMTopPullIfNeeded", "", Constants.Name.INTERVAL, "startHotSaleIfNeeded", "(J)V", "delayStartHotSale", "Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/comment/TaoLiveKtCommentEntity;", "personalEntity", "addTopWelcomeMsg", "(Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/comment/TaoLiveKtCommentEntity;)V", "trackPersonalGreetShow", "", "getName", "()Ljava/lang/String;", "unInstall", "Ltb/exs;", es6.DP_BIZ_CONTEXT, "install", "(Ltb/exs;)V", "Ltb/czs;", "model", "updateLiveDetail", "(Ltb/czs;)V", "subType", "", "", "data", "didRevLivePowerMsg", "(JLjava/util/Map;)V", "viewDidAppear", "viewWillDisappear", "onAppWillEnterForeground", "onAppDidEnterBackground", "updateDetailTrivialComment", "(Ljava/util/Map;)V", "config", "setupCommentOpen", "tag", "handleEvent", "(Ljava/lang/String;)V", "startManager", "stopManager", "showNoticesIfNeeded", "hotSaleDelayTag", "Ljava/lang/String;", "Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/driver/TaoLiveKtCommentDriver;", "commentDriver", "Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/driver/TaoLiveKtCommentDriver;", "Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/driver/TaoLiveKtCommentDataCenter;", "dataCenter", "Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/driver/TaoLiveKtCommentDataCenter;", "Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/receiver/TaoLiveKtCommentRev;", "commentRev$delegate", "Ltb/njg;", "getCommentRev", "()Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/receiver/TaoLiveKtCommentRev;", "commentRev", "Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/receiver/TaoLiveKtCommentPull;", "commentMTopPull", "Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/receiver/TaoLiveKtCommentPull;", "Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/receiver/TaoLiveKtHotSalePull;", "commentHotSalePull", "Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/receiver/TaoLiveKtHotSalePull;", "Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/receiver/TaoLiveKtPersonalityIntroPull;", "personalityIntroPull", "Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/receiver/TaoLiveKtPersonalityIntroPull;", "Ltb/txs;", "openConfig$delegate", "getOpenConfig", "()Ltb/txs;", "openConfig", "", "noticeList", "Ljava/util/List;", "Lkotlin/Function2;", "Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/send/TaoLiveKtCommentSendResponse;", "Lkotlin/ParameterName;", "name", "response", "entity", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/send/TaoLiveCommentSendLocalRev;", "localSendCallback", "Ltb/u1a;", "getLocalSendCallback", "()Ltb/u1a;", "setLocalSendCallback", "(Ltb/u1a;)V", "Lkotlin/Function1;", "", "locals", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/comment/TaoLiveCommentLocalDriverCallback;", "localDriverCallback", "Ltb/g1a;", "getLocalDriverCallback", "()Ltb/g1a;", "setLocalDriverCallback", "(Ltb/g1a;)V", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/comment/TaoLiveKtCommentDriverResult;", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/comment/TaoLiveCommentDriverCallback;", "driverCallback", "getDriverCallback", "setDriverCallback", "hotSaleResult", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/comment/TaoLiveCommentHotSaleCallback;", "hotSaleCallBack", "getHotSaleCallBack", "setHotSaleCallBack", "", "getDisablePlaybackComment", "()Z", "disablePlaybackComment", "getCommentDataCenter", "()Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/driver/TaoLiveKtCommentDataCenter;", "commentDataCenter", "getEnableCommentBiz", "enableCommentBiz", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtCommentManager extends TaoLiveKtComponent implements ITaoLiveKtCommentManager, ITaoLiveKtGlobalTimerHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TaoLiveKtCommentDriver commentDriver;
    private TaoLiveKtHotSalePull commentHotSalePull;
    private TaoLiveKtCommentPull commentMTopPull;
    private final njg commentRev$delegate;
    private TaoLiveKtCommentDataCenter dataCenter;
    private g1a<? super TaoLiveKtCommentDriverResult, xhv> driverCallback;
    private g1a<? super Map<String, ? extends Object>, xhv> hotSaleCallBack;
    private final String hotSaleDelayTag = "hotSaleDelayEventTag";
    private g1a<? super List<TaoLiveKtCommentEntity>, xhv> localDriverCallback;
    private u1a<? super TaoLiveKtCommentSendResponse, ? super TaoLiveKtCommentEntity, xhv> localSendCallback;
    private List<TaoLiveKtCommentEntity> noticeList;
    private final njg openConfig$delegate;
    private TaoLiveKtPersonalityIntroPull personalityIntroPull;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements w1a<Map<String, ? extends Object>, TaoLiveKtCommentEntity[], Long, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(Map<String, ? extends Object> map, TaoLiveKtCommentEntity[] taoLiveKtCommentEntityArr, Long l) {
            TaoLiveKtCommentQueue hotSales;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97192c55", new Object[]{this, map, taoLiveKtCommentEntityArr, l});
                return;
            }
            TaoLiveKtCommentDataCenter commentDataCenter = TaoLiveKtCommentManager.this.getCommentDataCenter();
            if (!(commentDataCenter == null || (hotSales = commentDataCenter.getHotSales()) == null)) {
                hotSales.writeComments(taoLiveKtCommentEntityArr);
            }
            TaoLiveKtCommentDriver access$getCommentDriver$p = TaoLiveKtCommentManager.access$getCommentDriver$p(TaoLiveKtCommentManager.this);
            if (access$getCommentDriver$p != null) {
                access$getCommentDriver$p.setHotSaleDisappearTime(l);
            }
            g1a<Map<String, ? extends Object>, xhv> hotSaleCallBack = TaoLiveKtCommentManager.this.getHotSaleCallBack();
            if (hotSaleCallBack != null) {
                hotSaleCallBack.invoke(map);
            }
        }

        @Override // tb.w1a
        public /* bridge */ /* synthetic */ xhv invoke(Map<String, ? extends Object> map, TaoLiveKtCommentEntity[] taoLiveKtCommentEntityArr, Long l) {
            a(map, taoLiveKtCommentEntityArr, l);
            return xhv.INSTANCE;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b implements g1a<TaoLiveKtCommentEntity, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public void a(TaoLiveKtCommentEntity taoLiveKtCommentEntity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2c55666", new Object[]{this, taoLiveKtCommentEntity});
            } else {
                TaoLiveKtCommentManager.access$addTopWelcomeMsg(TaoLiveKtCommentManager.this, taoLiveKtCommentEntity);
            }
        }

        @Override // tb.g1a
        public /* bridge */ /* synthetic */ xhv invoke(TaoLiveKtCommentEntity taoLiveKtCommentEntity) {
            a(taoLiveKtCommentEntity);
            return xhv.INSTANCE;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class c implements u1a<TaoLiveKtCommentEntity[], TaoLiveKtCommentEntity[], xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public void a(TaoLiveKtCommentEntity[] taoLiveKtCommentEntityArr, TaoLiveKtCommentEntity[] taoLiveKtCommentEntityArr2) {
            TaoLiveKtCommentDataCenter commentDataCenter;
            TaoLiveKtCommentQueue bottoms;
            TaoLiveKtCommentDataCenter commentDataCenter2;
            TaoLiveKtCommentQueue normals;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f15ab3f", new Object[]{this, taoLiveKtCommentEntityArr, taoLiveKtCommentEntityArr2});
                return;
            }
            if (!(taoLiveKtCommentEntityArr == null || taoLiveKtCommentEntityArr.length == 0 || (commentDataCenter2 = TaoLiveKtCommentManager.this.getCommentDataCenter()) == null || (normals = commentDataCenter2.getNormals()) == null)) {
                normals.writeComments(taoLiveKtCommentEntityArr);
            }
            if (taoLiveKtCommentEntityArr2 != null && taoLiveKtCommentEntityArr2.length != 0 && (commentDataCenter = TaoLiveKtCommentManager.this.getCommentDataCenter()) != null && (bottoms = commentDataCenter.getBottoms()) != null) {
                bottoms.writeComments(taoLiveKtCommentEntityArr2);
            }
        }

        @Override // tb.u1a
        public /* bridge */ /* synthetic */ xhv invoke(TaoLiveKtCommentEntity[] taoLiveKtCommentEntityArr, TaoLiveKtCommentEntity[] taoLiveKtCommentEntityArr2) {
            a(taoLiveKtCommentEntityArr, taoLiveKtCommentEntityArr2);
            return xhv.INSTANCE;
        }
    }

    static {
        t2o.a(1010827323);
        t2o.a(1003487344);
        t2o.a(1003487277);
    }

    public TaoLiveKtCommentManager() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.commentRev$delegate = kotlin.a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.rys
            @Override // tb.d1a
            public final Object invoke() {
                TaoLiveKtCommentRev commentRev_delegate$lambda$0;
                commentRev_delegate$lambda$0 = TaoLiveKtCommentManager.commentRev_delegate$lambda$0(TaoLiveKtCommentManager.this);
                return commentRev_delegate$lambda$0;
            }
        });
        this.openConfig$delegate = kotlin.a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.tys
            @Override // tb.d1a
            public final Object invoke() {
                txs openConfig_delegate$lambda$1;
                openConfig_delegate$lambda$1 = TaoLiveKtCommentManager.openConfig_delegate$lambda$1();
                return openConfig_delegate$lambda$1;
            }
        });
    }

    public static final /* synthetic */ void access$addTopWelcomeMsg(TaoLiveKtCommentManager taoLiveKtCommentManager, TaoLiveKtCommentEntity taoLiveKtCommentEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5186f1ae", new Object[]{taoLiveKtCommentManager, taoLiveKtCommentEntity});
        } else {
            taoLiveKtCommentManager.addTopWelcomeMsg(taoLiveKtCommentEntity);
        }
    }

    public static final /* synthetic */ TaoLiveKtCommentDriver access$getCommentDriver$p(TaoLiveKtCommentManager taoLiveKtCommentManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentDriver) ipChange.ipc$dispatch("c0eb83ba", new Object[]{taoLiveKtCommentManager});
        }
        return taoLiveKtCommentManager.commentDriver;
    }

    private final void addNoticeIfNeeded() {
        TaoLiveKtCommentDataCenter commentDataCenter;
        TaoLiveKtCommentQueue normals;
        czs czsVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3406832", new Object[]{this});
        } else if (h2t.INSTANCE.r() && getEnableCommentBiz() && !getOpenConfig().a(TaoLiveKtCommentConfigBiz.TopWelcome) && (commentDataCenter = getCommentDataCenter()) != null && (normals = commentDataCenter.getNormals()) != null) {
            rxs rxsVar = rxs.INSTANCE;
            exs bizContext = getBizContext();
            if (bizContext != null) {
                czsVar = bizContext.a();
            } else {
                czsVar = null;
            }
            normals.writeComments(rxsVar.i(czsVar));
        }
    }

    private final void addTopWelcomeMsg(TaoLiveKtCommentEntity taoLiveKtCommentEntity) {
        czs czsVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90a22b01", new Object[]{this, taoLiveKtCommentEntity});
            return;
        }
        List<TaoLiveKtCommentEntity> list = null;
        if (taoLiveKtCommentEntity != null) {
            List<TaoLiveKtCommentEntity> list2 = this.noticeList;
            if (list2 != null) {
                list2.add(taoLiveKtCommentEntity);
            }
            trackPersonalGreetShow(taoLiveKtCommentEntity);
            if (e3t.INSTANCE.t()) {
                startHotSaleIfNeeded(taoLiveKtCommentEntity.getDisappearTime() + 1000);
            }
        } else {
            rxs rxsVar = rxs.INSTANCE;
            exs bizContext = getBizContext();
            if (bizContext != null) {
                czsVar = bizContext.a();
            } else {
                czsVar = null;
            }
            TaoLiveKtCommentEntity k = rxsVar.k(czsVar);
            List<TaoLiveKtCommentEntity> list3 = this.noticeList;
            if (list3 != null) {
                list3.add(k);
            }
            if (e3t.INSTANCE.t()) {
                startHotSaleIfNeeded(3000L);
            }
        }
        g1a<List<TaoLiveKtCommentEntity>, xhv> localDriverCallback = getLocalDriverCallback();
        if (localDriverCallback != null) {
            List<TaoLiveKtCommentEntity> list4 = this.noticeList;
            if (list4 != null) {
                list = i04.B0(list4);
            }
            localDriverCallback.invoke(list);
        }
    }

    public static /* synthetic */ void addTopWelcomeMsg$default(TaoLiveKtCommentManager taoLiveKtCommentManager, TaoLiveKtCommentEntity taoLiveKtCommentEntity, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144320e", new Object[]{taoLiveKtCommentManager, taoLiveKtCommentEntity, new Integer(i), obj});
            return;
        }
        if ((i & 1) != 0) {
            taoLiveKtCommentEntity = null;
        }
        taoLiveKtCommentManager.addTopWelcomeMsg(taoLiveKtCommentEntity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TaoLiveKtCommentRev commentRev_delegate$lambda$0(TaoLiveKtCommentManager taoLiveKtCommentManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentRev) ipChange.ipc$dispatch("26d0b6e4", new Object[]{taoLiveKtCommentManager});
        }
        TaoLiveKtCommentRev taoLiveKtCommentRev = new TaoLiveKtCommentRev();
        taoLiveKtCommentRev.install(taoLiveKtCommentManager.getBizContext());
        taoLiveKtCommentRev.setDataCenter(taoLiveKtCommentManager.getCommentDataCenter());
        return taoLiveKtCommentRev;
    }

    private final void delayStartHotSale() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41fe6e9c", new Object[]{this});
            return;
        }
        TaoLiveKtHotSalePull taoLiveKtHotSalePull = new TaoLiveKtHotSalePull();
        this.commentHotSalePull = taoLiveKtHotSalePull;
        taoLiveKtHotSalePull.install(getBizContext());
        TaoLiveKtHotSalePull taoLiveKtHotSalePull2 = this.commentHotSalePull;
        if (taoLiveKtHotSalePull2 != null) {
            taoLiveKtHotSalePull2.pullMTopHotSaleItems();
        }
        TaoLiveKtHotSalePull taoLiveKtHotSalePull3 = this.commentHotSalePull;
        if (taoLiveKtHotSalePull3 != null) {
            taoLiveKtHotSalePull3.setFetchCallback(new a());
        }
    }

    private final TaoLiveKtCommentRev getCommentRev() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentRev) ipChange.ipc$dispatch("fdeb40a6", new Object[]{this});
        }
        return (TaoLiveKtCommentRev) this.commentRev$delegate.getValue();
    }

    private final boolean getDisablePlaybackComment() {
        czs a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84b8663d", new Object[]{this})).booleanValue();
        }
        exs bizContext = getBizContext();
        if (bizContext == null || (a2 = bizContext.a()) == null || !a2.B() || !getOpenConfig().a(TaoLiveKtCommentConfigBiz.PlaybackOpen)) {
            return false;
        }
        return true;
    }

    private final txs getOpenConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (txs) ipChange.ipc$dispatch("36634f9b", new Object[]{this});
        }
        return (txs) this.openConfig$delegate.getValue();
    }

    public static /* synthetic */ Object ipc$super(TaoLiveKtCommentManager taoLiveKtCommentManager, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1298417962:
                super.viewDidAppear();
                return null;
            case -783693868:
                super.didRevLivePowerMsg(((Number) objArr[0]).longValue(), (Map) objArr[1]);
                return null;
            case -607687920:
                super.onAppDidEnterBackground();
                return null;
            case 482781678:
                super.onAppWillEnterForeground();
                return null;
            case 567228013:
                super.updateLiveDetail((czs) objArr[0]);
                return null;
            case 861017161:
                super.unInstall();
                return null;
            case 1157723091:
                super.viewWillDisappear();
                return null;
            case 1889805786:
                super.install((exs) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/liveroom/liveBizComponent/leftBottomGroup/manager/TaoLiveKtCommentManager");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final txs openConfig_delegate$lambda$1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (txs) ipChange.ipc$dispatch("b0b93efd", new Object[0]);
        }
        return new txs();
    }

    private final void pauseComments() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e618191", new Object[]{this});
            return;
        }
        TaoLiveKtHotSalePull taoLiveKtHotSalePull = this.commentHotSalePull;
        if (taoLiveKtHotSalePull != null) {
            taoLiveKtHotSalePull.setPaused(true);
        }
        TaoLiveKtCommentPull taoLiveKtCommentPull = this.commentMTopPull;
        if (taoLiveKtCommentPull != null) {
            taoLiveKtCommentPull.setPaused(true);
        }
        TaoLiveKtCommentDriver taoLiveKtCommentDriver = this.commentDriver;
        if (taoLiveKtCommentDriver != null) {
            taoLiveKtCommentDriver.setPaused(true);
        }
        getCommentRev().setAtmospherePaused(true);
    }

    private final void registerPowerMsg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec8f906", new Object[]{this});
        }
    }

    private final void resumeComments() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("411a8948", new Object[]{this});
            return;
        }
        TaoLiveKtHotSalePull taoLiveKtHotSalePull = this.commentHotSalePull;
        if (taoLiveKtHotSalePull != null) {
            taoLiveKtHotSalePull.setPaused(false);
        }
        TaoLiveKtCommentPull taoLiveKtCommentPull = this.commentMTopPull;
        if (taoLiveKtCommentPull != null) {
            taoLiveKtCommentPull.setPaused(false);
        }
        TaoLiveKtCommentDriver taoLiveKtCommentDriver = this.commentDriver;
        if (taoLiveKtCommentDriver != null) {
            taoLiveKtCommentDriver.setPaused(false);
        }
        getCommentRev().setAtmospherePaused(false);
    }

    private final void startHotSaleIfNeeded(long j) {
        exs bizContext;
        ITaoLiveKtGlobalTimer b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6cef8d9", new Object[]{this, new Long(j)});
        } else if (!getOpenConfig().a(TaoLiveKtCommentConfigBiz.HotSale) && TaoLiveKtHotSalePull.Companion.a(getBizContext()) && (bizContext = getBizContext()) != null && (b2 = bizContext.b()) != null) {
            b2.delayEvent(this, this.hotSaleDelayTag, j);
        }
    }

    private final void startMTopPullIfNeeded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ac8d2e8", new Object[]{this});
        } else if (TaoLiveKtCommentPull.Companion.a(getBizContext())) {
            TaoLiveKtCommentPull taoLiveKtCommentPull = new TaoLiveKtCommentPull();
            this.commentMTopPull = taoLiveKtCommentPull;
            taoLiveKtCommentPull.install(getBizContext());
            TaoLiveKtCommentPull taoLiveKtCommentPull2 = this.commentMTopPull;
            if (taoLiveKtCommentPull2 != null) {
                taoLiveKtCommentPull2.pullMTopComments();
            }
            TaoLiveKtCommentPull taoLiveKtCommentPull3 = this.commentMTopPull;
            if (taoLiveKtCommentPull3 != null) {
                taoLiveKtCommentPull3.setCallback(new c());
            }
        }
    }

    private final void startPowerMsgDriver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e1c20d", new Object[]{this});
            return;
        }
        TaoLiveKtCommentDriver taoLiveKtCommentDriver = new TaoLiveKtCommentDriver();
        this.commentDriver = taoLiveKtCommentDriver;
        taoLiveKtCommentDriver.setOpenConfig(getOpenConfig());
        TaoLiveKtCommentDriver taoLiveKtCommentDriver2 = this.commentDriver;
        if (taoLiveKtCommentDriver2 != null) {
            taoLiveKtCommentDriver2.install(getBizContext());
        }
        TaoLiveKtCommentDriver taoLiveKtCommentDriver3 = this.commentDriver;
        if (taoLiveKtCommentDriver3 != null) {
            taoLiveKtCommentDriver3.setDataCenter(getCommentDataCenter());
        }
        TaoLiveKtCommentDriver taoLiveKtCommentDriver4 = this.commentDriver;
        if (taoLiveKtCommentDriver4 != null) {
            taoLiveKtCommentDriver4.setCallback(getDriverCallback());
        }
    }

    private final void trackPersonalGreetShow(TaoLiveKtCommentEntity taoLiveKtCommentEntity) {
        ITaoLiveKtUtManager d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d9e5d69", new Object[]{this, taoLiveKtCommentEntity});
            return;
        }
        HashMap hashMap = new HashMap();
        Map<String, Object> dxData = taoLiveKtCommentEntity.getDxData();
        Object obj = null;
        Object obj2 = dxData != null ? dxData.get("actions") : null;
        if (obj2 != null) {
            obj = obj2;
        }
        KMPJsonObject kMPJsonObject = new KMPJsonObject(obj);
        String string = kMPJsonObject.getString("type");
        if (string == null) {
            string = "";
        }
        hashMap.put("btn_name", string);
        KMPJsonObject jsonObject = kMPJsonObject.getJsonObject("show");
        if (jsonObject != null && !jsonObject.isEmpty()) {
            for (String str : jsonObject.keySet()) {
                String string2 = jsonObject.getString(str);
                if (string2 != null && string2.length() > 0) {
                    String string3 = jsonObject.getString(str);
                    if (string3 == null) {
                        string3 = "";
                    }
                    hashMap.put(str, string3);
                }
            }
        }
        exs bizContext = getBizContext();
        if (!(bizContext == null || (d = bizContext.d()) == null)) {
            ITaoLiveKtUtManager.a.a(d, "PersonalGreeting", null, hashMap, 2, null);
        }
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtDataServer
    public void didRevLivePowerMsg(long j, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d149c7d4", new Object[]{this, new Long(j), map});
            return;
        }
        super.didRevLivePowerMsg(j, map);
        getCommentRev().didRevLivePowerMsg(j, map);
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentManager
    public g1a<TaoLiveKtCommentDriverResult, xhv> getDriverCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("ecc94092", new Object[]{this});
        }
        return this.driverCallback;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentManager
    public boolean getEnableCommentBiz() {
        czs a2;
        exs bizContext;
        czs a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22e11d98", new Object[]{this})).booleanValue();
        }
        exs bizContext2 = getBizContext();
        if ((bizContext2 == null || (a2 = bizContext2.a()) == null || !a2.x() || (bizContext = getBizContext()) == null || (a3 = bizContext.a()) == null || !a3.e()) && getDisablePlaybackComment()) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentManager
    public g1a<Map<String, ? extends Object>, xhv> getHotSaleCallBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("145cf192", new Object[]{this});
        }
        return this.hotSaleCallBack;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentManager
    public g1a<List<TaoLiveKtCommentEntity>, xhv> getLocalDriverCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("e9beb013", new Object[]{this});
        }
        return this.localDriverCallback;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentManager
    public u1a<TaoLiveKtCommentSendResponse, TaoLiveKtCommentEntity, xhv> getLocalSendCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u1a) ipChange.ipc$dispatch("8f9bd392", new Object[]{this});
        }
        return this.localSendCallback;
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.component.ITaoLiveKtComponent
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "ITaoLiveKtCommentManager";
    }

    @Override // com.taobao.kmp.live.liveBizComponent.helper.ITaoLiveKtGlobalTimerHandler
    public void handleEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ba63e63", new Object[]{this, str});
            return;
        }
        ckf.g(str, "tag");
        if (ckf.b(str, this.hotSaleDelayTag)) {
            delayStartHotSale();
        }
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.component.ITaoLiveKtComponent
    public void install(exs exsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a425da", new Object[]{this, exsVar});
            return;
        }
        super.install(exsVar);
        this.dataCenter = new TaoLiveKtCommentDataCenter();
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtLifeCycle
    public void onAppDidEnterBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbc76b10", new Object[]{this});
            return;
        }
        super.onAppDidEnterBackground();
        pauseComments();
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtLifeCycle
    public void onAppWillEnterForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cc6a9ee", new Object[]{this});
            return;
        }
        super.onAppWillEnterForeground();
        resumeComments();
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentManager
    public void setDriverCallback(g1a<? super TaoLiveKtCommentDriverResult, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88c45c", new Object[]{this, g1aVar});
        } else {
            this.driverCallback = g1aVar;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentManager
    public void setHotSaleCallBack(g1a<? super Map<String, ? extends Object>, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65f4d0c4", new Object[]{this, g1aVar});
        } else {
            this.hotSaleCallBack = g1aVar;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentManager
    public void setLocalDriverCallback(g1a<? super List<TaoLiveKtCommentEntity>, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e9e0863", new Object[]{this, g1aVar});
        } else {
            this.localDriverCallback = g1aVar;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentManager
    public void setLocalSendCallback(u1a<? super TaoLiveKtCommentSendResponse, ? super TaoLiveKtCommentEntity, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27d49262", new Object[]{this, u1aVar});
        } else {
            this.localSendCallback = u1aVar;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentManager
    public void setupCommentOpen(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fbc2612", new Object[]{this, map});
            return;
        }
        getOpenConfig().b(map);
        getCommentRev().setOpenConfig(getOpenConfig());
        TaoLiveKtCommentDriver taoLiveKtCommentDriver = this.commentDriver;
        if (taoLiveKtCommentDriver != null) {
            taoLiveKtCommentDriver.setOpenConfig(getOpenConfig());
        }
        TaoLiveKtCommentDataCenter commentDataCenter = getCommentDataCenter();
        if (commentDataCenter != null) {
            commentDataCenter.setDisableCommentButton(getOpenConfig().a(TaoLiveKtCommentConfigBiz.CommentButton));
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentManager
    public void showNoticesIfNeeded() {
        List<TaoLiveKtCommentEntity> list;
        List<TaoLiveKtCommentEntity> list2;
        czs czsVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df3464b7", new Object[]{this});
        } else if (getEnableCommentBiz() && !getOpenConfig().a(TaoLiveKtCommentConfigBiz.TopWelcome)) {
            if (this.noticeList == null || !(!list.isEmpty())) {
                this.noticeList = new ArrayList();
                if (!h2t.INSTANCE.r() && (list2 = this.noticeList) != null) {
                    List<TaoLiveKtCommentEntity> list3 = list2;
                    rxs rxsVar = rxs.INSTANCE;
                    exs bizContext = getBizContext();
                    if (bizContext != null) {
                        czsVar = bizContext.a();
                    } else {
                        czsVar = null;
                    }
                    d04.w(list3, rxsVar.i(czsVar));
                }
                if (!TaoLiveKtPersonalityIntroPull.Companion.b(getBizContext())) {
                    addTopWelcomeMsg$default(this, null, 1, null);
                    return;
                }
                TaoLiveKtPersonalityIntroPull taoLiveKtPersonalityIntroPull = new TaoLiveKtPersonalityIntroPull();
                this.personalityIntroPull = taoLiveKtPersonalityIntroPull;
                taoLiveKtPersonalityIntroPull.install(getBizContext());
                TaoLiveKtPersonalityIntroPull taoLiveKtPersonalityIntroPull2 = this.personalityIntroPull;
                if (taoLiveKtPersonalityIntroPull2 != null) {
                    taoLiveKtPersonalityIntroPull2.pullMTopPersonalityIntro();
                }
                TaoLiveKtPersonalityIntroPull taoLiveKtPersonalityIntroPull3 = this.personalityIntroPull;
                if (taoLiveKtPersonalityIntroPull3 != null) {
                    taoLiveKtPersonalityIntroPull3.setFetchCallback(new b());
                }
            }
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentManager
    public void startManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b982a7f2", new Object[]{this});
        } else if (getEnableCommentBiz()) {
            registerPowerMsg();
            startPowerMsgDriver();
            startMTopPullIfNeeded();
            if (!e3t.INSTANCE.t()) {
                startHotSaleIfNeeded(3000L);
            }
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentManager
    public void stopManager() {
        TaoLiveKtCommentDataCenter dataCenter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e446e052", new Object[]{this});
            return;
        }
        pauseComments();
        this.noticeList = null;
        this.commentHotSalePull = null;
        this.commentMTopPull = null;
        TaoLiveKtCommentDriver taoLiveKtCommentDriver = this.commentDriver;
        if (!(taoLiveKtCommentDriver == null || (dataCenter = taoLiveKtCommentDriver.getDataCenter()) == null)) {
            dataCenter.clearAll();
        }
        this.commentDriver = null;
        setLocalSendCallback(null);
        setLocalDriverCallback(null);
        setDriverCallback(null);
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.component.ITaoLiveKtComponent
    public void unInstall() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33521449", new Object[]{this});
            return;
        }
        super.unInstall();
        stopManager();
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentManager
    public void updateDetailTrivialComment(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6383d2e", new Object[]{this, map});
        } else if (getEnableCommentBiz()) {
            getCommentRev().handleCommonBizComment(map);
        }
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtDataServer
    public void updateLiveDetail(czs czsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21cf366d", new Object[]{this, czsVar});
            return;
        }
        super.updateLiveDetail(czsVar);
        TaoLiveKtCommentDataCenter commentDataCenter = getCommentDataCenter();
        if (commentDataCenter != null) {
            commentDataCenter.setDetailModel(czsVar);
        }
        addNoticeIfNeeded();
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtLifeCycle
    public void viewDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b29bb6d6", new Object[]{this});
            return;
        }
        super.viewDidAppear();
        resumeComments();
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtLifeCycle
    public void viewWillDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("450173d3", new Object[]{this});
            return;
        }
        super.viewWillDisappear();
        pauseComments();
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentManager
    public TaoLiveKtCommentDataCenter getCommentDataCenter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaoLiveKtCommentDataCenter) ipChange.ipc$dispatch("d9516235", new Object[]{this}) : this.dataCenter;
    }
}
