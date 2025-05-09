package com.taobao.live.liveroom.liveBizComponent.bottomGroup.manager;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.helper.ITaoLiveKtGlobalTimer;
import com.taobao.kmp.live.liveBizComponent.helper.ITaoLiveKtGlobalTimerHandler;
import com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtUtManager;
import com.taobao.kmp.live.liveBizComponent.service.base.TaoLiveKtMsgSubType;
import com.taobao.kmp.live.liveBizComponent.service.biz.bottomGroup.ITaoLiveKtLikeInputProtocol;
import com.taobao.kmp.live.liveBizComponent.service.biz.bottomGroup.ITaoLiveKtLikeManager;
import com.taobao.kmp.live.liveBizComponent.service.biz.bottomGroup.TaoLiveKtLikeInputModel;
import com.taobao.kmp.live.liveBizComponent.service.biz.bottomGroup.TaoLiveKtLikeViewModel;
import com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent;
import com.taobao.taolive.sdk.model.message.PowerMsgType;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import tb.ckf;
import tb.czs;
import tb.d1a;
import tb.exs;
import tb.g1a;
import tb.l0r;
import tb.n1t;
import tb.t2o;
import tb.vqx;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u00020\u000f2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0012\u001a\u00020\u000f2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0005J\u000f\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0005J\u000f\u0010\u0018\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0005J\u000f\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001d\u0010\u0005J\u0019\u0010\u001e\u001a\u00020\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\b2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u000bH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010\u0005J\u0017\u0010%\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\fH\u0016¢\u0006\u0004\b%\u0010&J)\u0010)\u001a\u0004\u0018\u00010(2\u0016\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u000bH\u0016¢\u0006\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010-R\u0014\u0010/\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b/\u00100R\"\u00102\u001a\u0002018\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u00109\u001a\u0004\u0018\u0001088\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R0\u0010A\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0018\u00010?j\u0004\u0018\u0001`@8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR0\u0010H\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0018\u00010?j\u0004\u0018\u0001`G8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bH\u0010B\u001a\u0004\bI\u0010D\"\u0004\bJ\u0010FR \u0010M\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010L¨\u0006N"}, d2 = {"Lcom/taobao/live/liveroom/liveBizComponent/bottomGroup/manager/TaoLiveKtLikeManager;", "Lcom/taobao/live/liveroom/liveBizComponent/ktManager/base/TaoLiveKtComponent;", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/bottomGroup/ITaoLiveKtLikeManager;", "Lcom/taobao/kmp/live/liveBizComponent/helper/ITaoLiveKtGlobalTimerHandler;", "<init>", "()V", "Ltb/czs;", "model", "", "fetchDetailLikeCount", "(Ltb/czs;)J", "", "", "", "data", "Ltb/xhv;", "handleNormalLikeCountUpdatePM", "(Ljava/util/Map;)V", "handleOfficialMainRoomInfoChangePM", "count", "refreshWithCount", "(J)V", "delayUploadLikeCount", "uploadWhenQuit", "uploadLikeCount", "getLikeDelayTime", "()J", "getName", "()Ljava/lang/String;", "viewDidDisappear", "updateLiveDetail", "(Ltb/czs;)V", "subType", "didRevLivePowerMsg", "(JLjava/util/Map;)V", "triggerAddFavorAction", "tag", "handleEvent", "(Ljava/lang/String;)V", "params", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/bottomGroup/TaoLiveKtLikeInputModel;", "fetchLikeInput", "(Ljava/util/Map;)Lcom/taobao/kmp/live/liveBizComponent/service/biz/bottomGroup/TaoLiveKtLikeInputModel;", "", "likeDelayUploadLocked", "Z", "likeUploadRequestLocked", "likeUploadDelayTag", "Ljava/lang/String;", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/bottomGroup/TaoLiveKtLikeViewModel;", "likeViewModel", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/bottomGroup/TaoLiveKtLikeViewModel;", "getLikeViewModel", "()Lcom/taobao/kmp/live/liveBizComponent/service/biz/bottomGroup/TaoLiveKtLikeViewModel;", "setLikeViewModel", "(Lcom/taobao/kmp/live/liveBizComponent/service/biz/bottomGroup/TaoLiveKtLikeViewModel;)V", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/bottomGroup/ITaoLiveKtLikeInputProtocol;", "likeInputImpl", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/bottomGroup/ITaoLiveKtLikeInputProtocol;", "getLikeInputImpl", "()Lcom/taobao/kmp/live/liveBizComponent/service/biz/bottomGroup/ITaoLiveKtLikeInputProtocol;", "setLikeInputImpl", "(Lcom/taobao/kmp/live/liveBizComponent/service/biz/bottomGroup/ITaoLiveKtLikeInputProtocol;)V", "Lkotlin/Function0;", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/bottomGroup/TaoLiveLikeRemoteCountUpdateCallback;", "likeRemoteCountUpdateCallback", "Ltb/d1a;", "getLikeRemoteCountUpdateCallback", "()Ltb/d1a;", "setLikeRemoteCountUpdateCallback", "(Ltb/d1a;)V", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/bottomGroup/TaoLiveLikeUploadCallback;", "likeUploadCallback", "getLikeUploadCallback", "setLikeUploadCallback", vqx.HUMMER_FOUNDATION_GET_INTPUT_PARAMS, "()Ljava/util/Map;", "inputParams", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtLikeManager extends TaoLiveKtComponent implements ITaoLiveKtLikeManager, ITaoLiveKtGlobalTimerHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean likeDelayUploadLocked;
    private ITaoLiveKtLikeInputProtocol likeInputImpl;
    private d1a<xhv> likeRemoteCountUpdateCallback;
    private d1a<xhv> likeUploadCallback;
    private boolean likeUploadRequestLocked;
    private final String likeUploadDelayTag = "likeUploadDelayTag";
    private TaoLiveKtLikeViewModel likeViewModel = new TaoLiveKtLikeViewModel();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements g1a<Boolean, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("36b985b5", new Object[]{this, new Boolean(z)});
                return;
            }
            TaoLiveKtLikeManager.access$setLikeDelayUploadLocked$p(TaoLiveKtLikeManager.this, false);
            TaoLiveKtLikeManager.access$setLikeUploadRequestLocked$p(TaoLiveKtLikeManager.this, false);
            if (z) {
                d1a<xhv> likeUploadCallback = TaoLiveKtLikeManager.this.getLikeUploadCallback();
                if (likeUploadCallback != null) {
                    likeUploadCallback.invoke();
                }
                TaoLiveKtLikeManager.this.getLikeViewModel().setUserLikeCount(0L);
            }
        }

        @Override // tb.g1a
        public /* bridge */ /* synthetic */ xhv invoke(Boolean bool) {
            a(bool.booleanValue());
            return xhv.INSTANCE;
        }
    }

    static {
        t2o.a(1010827270);
        t2o.a(1003487338);
        t2o.a(1003487277);
    }

    public static final /* synthetic */ void access$setLikeDelayUploadLocked$p(TaoLiveKtLikeManager taoLiveKtLikeManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7681dfda", new Object[]{taoLiveKtLikeManager, new Boolean(z)});
        } else {
            taoLiveKtLikeManager.likeDelayUploadLocked = z;
        }
    }

    public static final /* synthetic */ void access$setLikeUploadRequestLocked$p(TaoLiveKtLikeManager taoLiveKtLikeManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("305776f0", new Object[]{taoLiveKtLikeManager, new Boolean(z)});
        } else {
            taoLiveKtLikeManager.likeUploadRequestLocked = z;
        }
    }

    private final void delayUploadLikeCount() {
        ITaoLiveKtGlobalTimer iTaoLiveKtGlobalTimer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79648d3b", new Object[]{this});
        } else if (getLikeViewModel().getUserLikeCount() <= 0) {
            this.likeDelayUploadLocked = false;
        } else if (!this.likeDelayUploadLocked) {
            exs bizContext = getBizContext();
            if (bizContext != null) {
                iTaoLiveKtGlobalTimer = bizContext.b();
            } else {
                iTaoLiveKtGlobalTimer = null;
            }
            if (iTaoLiveKtGlobalTimer != null) {
                this.likeDelayUploadLocked = true;
                iTaoLiveKtGlobalTimer.delayEvent(this, this.likeUploadDelayTag, getLikeDelayTime());
            }
        }
    }

    private final long getLikeDelayTime() {
        czs a2;
        KMPJsonObject s;
        Long l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eb69e85e", new Object[]{this})).longValue();
        }
        exs bizContext = getBizContext();
        long longValue = (bizContext == null || (a2 = bizContext.a()) == null || (s = a2.s()) == null || (l = s.getLong("likeEventDelayReportWindowSize")) == null) ? 0L : l.longValue();
        return longValue > 0 ? longValue : l0r.DEFAULT_TCP_CONNECT_TIMEOUT_MS;
    }

    private final void handleNormalLikeCountUpdatePM(Map<String, ? extends Object> map) {
        czs a2;
        Long l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2378cf", new Object[]{this, map});
            return;
        }
        exs bizContext = getBizContext();
        if (bizContext != null && (a2 = bizContext.a()) != null && !a2.z()) {
            if (!(map instanceof Object)) {
                map = null;
            }
            KMPJsonObject jsonObject = new KMPJsonObject(map).getJsonObject("value");
            refreshWithCount((jsonObject == null || (l = jsonObject.getLong(PowerMsgType.KEY_FAVOR)) == null) ? 0L : l.longValue());
        }
    }

    public static /* synthetic */ Object ipc$super(TaoLiveKtLikeManager taoLiveKtLikeManager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -54136528) {
            super.viewDidDisappear();
            return null;
        } else if (hashCode == 567228013) {
            super.updateLiveDetail((czs) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/live/liveroom/liveBizComponent/bottomGroup/manager/TaoLiveKtLikeManager");
        }
    }

    private final void refreshWithCount(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e84d148f", new Object[]{this, new Long(j)});
        } else if (j > getLikeViewModel().getShowLikeCount()) {
            long showLikeCount = j - getLikeViewModel().getShowLikeCount();
            getLikeViewModel().setShowLikeCount(j);
            getLikeViewModel().setRemoteLikeDiff(showLikeCount);
            d1a<xhv> likeRemoteCountUpdateCallback = getLikeRemoteCountUpdateCallback();
            if (likeRemoteCountUpdateCallback != null) {
                likeRemoteCountUpdateCallback.invoke();
            }
        }
    }

    private final void uploadLikeCount() {
        ITaoLiveKtUtManager d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76a56bbe", new Object[]{this});
        } else if (getLikeViewModel().getUserLikeCount() <= 0) {
            this.likeDelayUploadLocked = false;
        } else if (!this.likeUploadRequestLocked) {
            this.likeUploadRequestLocked = true;
            exs bizContext = getBizContext();
            if (!(bizContext == null || (d = bizContext.d()) == null)) {
                d.clicked("Button-like_test", "TaobaoLiveWatch", kotlin.collections.a.h());
            }
            n1t.INSTANCE.a(getInputParams(), new a());
        }
    }

    private final void uploadWhenQuit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6a88551", new Object[]{this});
        } else {
            uploadLikeCount();
        }
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtDataServer
    public void didRevLivePowerMsg(long j, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d149c7d4", new Object[]{this, new Long(j), map});
        } else if (j == TaoLiveKtMsgSubType.NormalLikeCountUpdate.getValue()) {
            handleNormalLikeCountUpdatePM(map);
        } else if (j == TaoLiveKtMsgSubType.OfficialMainRoomInfoChange.getValue()) {
            handleOfficialMainRoomInfoChangePM(map);
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.bottomGroup.ITaoLiveKtLikeManager
    public TaoLiveKtLikeInputModel fetchLikeInput(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtLikeInputModel) ipChange.ipc$dispatch("8637a10e", new Object[]{this, map});
        }
        if (!(map instanceof Object)) {
            map = null;
        }
        KMPJsonObject kMPJsonObject = new KMPJsonObject(map);
        TaoLiveKtLikeInputModel taoLiveKtLikeInputModel = new TaoLiveKtLikeInputModel();
        String string = kMPJsonObject.getString("extraFlag");
        if (string == null) {
            string = "";
        }
        taoLiveKtLikeInputModel.setExtraFlag(string);
        return taoLiveKtLikeInputModel;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.bottomGroup.ITaoLiveKtLikeManager
    public ITaoLiveKtLikeInputProtocol getLikeInputImpl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITaoLiveKtLikeInputProtocol) ipChange.ipc$dispatch("bbb3da9f", new Object[]{this});
        }
        return this.likeInputImpl;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.bottomGroup.ITaoLiveKtLikeManager
    public d1a<xhv> getLikeRemoteCountUpdateCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d1a) ipChange.ipc$dispatch("336f972c", new Object[]{this});
        }
        return this.likeRemoteCountUpdateCallback;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.bottomGroup.ITaoLiveKtLikeManager
    public d1a<xhv> getLikeUploadCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d1a) ipChange.ipc$dispatch("1163523", new Object[]{this});
        }
        return this.likeUploadCallback;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.bottomGroup.ITaoLiveKtLikeManager
    public TaoLiveKtLikeViewModel getLikeViewModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtLikeViewModel) ipChange.ipc$dispatch("79d34a5e", new Object[]{this});
        }
        return this.likeViewModel;
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.component.ITaoLiveKtComponent
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "ITaoLiveKtLikeManager";
    }

    @Override // com.taobao.kmp.live.liveBizComponent.helper.ITaoLiveKtGlobalTimerHandler
    public void handleEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ba63e63", new Object[]{this, str});
            return;
        }
        ckf.g(str, "tag");
        if (ckf.b(str, this.likeUploadDelayTag)) {
            uploadLikeCount();
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.bottomGroup.ITaoLiveKtLikeManager
    public void setLikeInputImpl(ITaoLiveKtLikeInputProtocol iTaoLiveKtLikeInputProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82b76b05", new Object[]{this, iTaoLiveKtLikeInputProtocol});
        } else {
            this.likeInputImpl = iTaoLiveKtLikeInputProtocol;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.bottomGroup.ITaoLiveKtLikeManager
    public void setLikeRemoteCountUpdateCallback(d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("451452cc", new Object[]{this, d1aVar});
        } else {
            this.likeRemoteCountUpdateCallback = d1aVar;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.bottomGroup.ITaoLiveKtLikeManager
    public void setLikeUploadCallback(d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a0a0b4d", new Object[]{this, d1aVar});
        } else {
            this.likeUploadCallback = d1aVar;
        }
    }

    public void setLikeViewModel(TaoLiveKtLikeViewModel taoLiveKtLikeViewModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98aa6a7e", new Object[]{this, taoLiveKtLikeViewModel});
            return;
        }
        ckf.g(taoLiveKtLikeViewModel, "<set-?>");
        this.likeViewModel = taoLiveKtLikeViewModel;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.bottomGroup.ITaoLiveKtLikeManager
    public void triggerAddFavorAction() {
        ITaoLiveKtUtManager d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfcab992", new Object[]{this});
            return;
        }
        exs bizContext = getBizContext();
        if (!(bizContext == null || (d = bizContext.d()) == null)) {
            d.clicked("Button-Like", "Page_TaobaoLiveWatch", kotlin.collections.a.h());
        }
        TaoLiveKtLikeViewModel likeViewModel = getLikeViewModel();
        likeViewModel.setUserLikeCount(likeViewModel.getUserLikeCount() + 1);
        TaoLiveKtLikeViewModel likeViewModel2 = getLikeViewModel();
        likeViewModel2.setUserTotalLikeCount(likeViewModel2.getUserTotalLikeCount() + 1);
        delayUploadLikeCount();
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtDataServer
    public void updateLiveDetail(czs czsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21cf366d", new Object[]{this, czsVar});
            return;
        }
        super.updateLiveDetail(czsVar);
        long fetchDetailLikeCount = fetchDetailLikeCount(czsVar);
        if (fetchDetailLikeCount > 0) {
            getLikeViewModel().setShowLikeCount(fetchDetailLikeCount);
            getLikeViewModel().setRemoteLikeDiff(fetchDetailLikeCount);
        }
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtLifeCycle
    public void viewDidDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcc5f130", new Object[]{this});
            return;
        }
        super.viewDidDisappear();
        uploadWhenQuit();
    }

    private final long fetchDetailLikeCount(czs czsVar) {
        KMPJsonObject s;
        Long l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a219fe8", new Object[]{this, czsVar})).longValue();
        }
        if (czsVar != null && czsVar.z()) {
            Long l2 = czsVar.q().getLong("praiseCount");
            if (l2 != null) {
                return l2.longValue();
            }
            return 0L;
        } else if (czsVar == null || (s = czsVar.s()) == null || (l = s.getLong("praiseCount")) == null) {
            return 0L;
        } else {
            return l.longValue();
        }
    }

    private final Map<String, Object> getInputParams() {
        String str;
        TaoLiveKtLikeInputModel fetchLikeInputModel;
        String extraFlag;
        czs a2;
        String str2;
        czs a3;
        czs a4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ad86a8b6", new Object[]{this});
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("count", Long.valueOf(getLikeViewModel().getUserLikeCount()));
        exs bizContext = getBizContext();
        String str3 = "";
        if (bizContext == null || (a4 = bizContext.a()) == null || (str = a4.v()) == null) {
            str = str3;
        }
        linkedHashMap.put("topic", str);
        exs bizContext2 = getBizContext();
        if (!(bizContext2 == null || (a2 = bizContext2.a()) == null || !a2.z())) {
            exs bizContext3 = getBizContext();
            if (bizContext3 == null || (a3 = bizContext3.a()) == null || (str2 = a3.r()) == null) {
                str2 = str3;
            }
            linkedHashMap.put("relatedTopic", str2);
        }
        ITaoLiveKtLikeInputProtocol likeInputImpl = getLikeInputImpl();
        if (!(likeInputImpl == null || (fetchLikeInputModel = likeInputImpl.fetchLikeInputModel()) == null || (extraFlag = fetchLikeInputModel.getExtraFlag()) == null)) {
            str3 = extraFlag;
        }
        linkedHashMap.put("extraFlag", str3);
        return kotlin.collections.a.r(linkedHashMap);
    }

    private final void handleOfficialMainRoomInfoChangePM(Map<String, ? extends Object> map) {
        czs a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebf6963c", new Object[]{this, map});
            return;
        }
        exs bizContext = getBizContext();
        if (bizContext != null && (a2 = bizContext.a()) != null && a2.z()) {
            if (!(map instanceof Object)) {
                map = null;
            }
            Long l = new KMPJsonObject(map).getLong("praiseCount");
            refreshWithCount(l != null ? l.longValue() : 0L);
        }
    }
}
