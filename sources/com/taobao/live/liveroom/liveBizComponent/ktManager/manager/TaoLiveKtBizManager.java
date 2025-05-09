package com.taobao.live.liveroom.liveBizComponent.ktManager.manager;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.component.ITaoLiveKtServiceContainer;
import com.taobao.kmp.live.liveBizComponent.helper.ITaoLiveKtGlobalTimer;
import com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtComponentOpenService;
import com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtUtManager;
import com.taobao.kmp.live.liveBizComponent.service.base.TaoLiveKtMsgSubType;
import com.taobao.kmp.live.liveBizComponent.service.biz.bottomGroup.ITaoLiveKtLikeManager;
import com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentManager;
import com.taobao.kmp.live.liveBizComponent.service.biz.liveResource.ITaoLiveKtEmojiManager;
import com.taobao.kmp.live.liveBizComponent.service.biz.send.ITaoLiveKtCommentSend;
import com.taobao.kmp.live.liveBizComponent.service.biz.send.ITaoLiveKtCommentTrack;
import com.taobao.kmp.live.liveBizComponent.service.biz.topGroup.ITaoLiveKtAccountManager;
import com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel;
import com.taobao.live.liveroom.liveBizComponent.bottomGroup.manager.TaoLiveKtEmojiManager;
import com.taobao.live.liveroom.liveBizComponent.bottomGroup.manager.TaoLiveKtLikeManager;
import com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtGroup;
import com.taobao.live.liveroom.liveBizComponent.ktManager.helper.TaoLiveKtGlobalTimer;
import com.taobao.live.liveroom.liveBizComponent.ktManager.manager.TaoLiveKtBizManager;
import com.taobao.live.liveroom.liveBizComponent.ktManager.service.TaoLiveKtServiceContainer;
import com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.giftBand.TaoLiveKtGiftBandManager;
import com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.manager.TaoLiveKtCommentManager;
import com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.sender.TaoLiveKtCommentSender;
import com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.sender.TaoLiveKtCommentTracker;
import com.taobao.live.liveroom.liveBizComponent.topGroup.manager.TaoLiveKtAccountManager;
import com.taobao.live.liveroom.liveBizComponent.topGroup.manager.TaoLiveKtNoticeManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import tb.czs;
import tb.d1a;
import tb.es6;
import tb.exs;
import tb.fg8;
import tb.lyd;
import tb.myd;
import tb.njg;
import tb.t2o;
import tb.zz3;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u0019\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\n\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\n\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u0019\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020$8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020*8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010-R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001b\u0010<\u001a\u0002088VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b9\u0010&\u001a\u0004\b:\u0010;R\u001b\u0010A\u001a\u00020=8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b>\u0010&\u001a\u0004\b?\u0010@R\u001b\u0010F\u001a\u00020B8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bC\u0010&\u001a\u0004\bD\u0010ER\u0018\u0010G\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010L\u001a\u0004\u0018\u00010I8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0016\u0010P\u001a\u0004\u0018\u00010M8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0016\u0010T\u001a\u0004\u0018\u00010Q8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010S¨\u0006U"}, d2 = {"Lcom/taobao/live/liveroom/liveBizComponent/ktManager/manager/TaoLiveKtBizManager;", "Lcom/taobao/live/liveroom/liveBizComponent/ktManager/base/TaoLiveKtGroup;", "Lcom/taobao/kmp/live/liveBizComponent/service/base/ITaoLiveKtComponentOpenService;", "<init>", "()V", "Ltb/xhv;", "addBizComponents", "initBizManager", "", "config", "install", "(Ljava/lang/String;)V", "", "", "revMsgSubTypes", "()Ljava/util/List;", "Ltb/exs;", es6.DP_BIZ_CONTEXT, "(Ltb/exs;)V", "unInstall", "Ltb/czs;", "model", "updateLiveDetail", "(Ltb/czs;)V", "Lcom/taobao/kmp/live/liveBizComponent/service/base/ITaoLiveKtUtManager;", "impl", "updateLiveUtManager", "(Lcom/taobao/kmp/live/liveBizComponent/service/base/ITaoLiveKtUtManager;)V", "Lcom/taobao/kmp/live/updown/model/TaoLiveKtSwitchModel;", "data", "updateUpDownSwitchModel", "(Lcom/taobao/kmp/live/updown/model/TaoLiveKtSwitchModel;)V", "", "isPortrait", "onScreenOrientationChanged", "(Z)V", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/send/ITaoLiveKtCommentSend;", "commentSender$delegate", "Ltb/njg;", "getCommentSender", "()Lcom/taobao/kmp/live/liveBizComponent/service/biz/send/ITaoLiveKtCommentSend;", "commentSender", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/send/ITaoLiveKtCommentTrack;", "commentTracker$delegate", "getCommentTracker", "()Lcom/taobao/kmp/live/liveBizComponent/service/biz/send/ITaoLiveKtCommentTrack;", "commentTracker", "Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/manager/TaoLiveKtCommentManager;", "ktCommentManager", "Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/manager/TaoLiveKtCommentManager;", "Lcom/taobao/live/liveroom/liveBizComponent/bottomGroup/manager/TaoLiveKtEmojiManager;", "ktEmojiManager", "Lcom/taobao/live/liveroom/liveBizComponent/bottomGroup/manager/TaoLiveKtEmojiManager;", "Lcom/taobao/live/liveroom/liveBizComponent/topGroup/manager/TaoLiveKtAccountManager;", "ktAccountManager", "Lcom/taobao/live/liveroom/liveBizComponent/topGroup/manager/TaoLiveKtAccountManager;", "Ltb/myd;", "noticeManager$delegate", "getNoticeManager", "()Ltb/myd;", "noticeManager", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/bottomGroup/ITaoLiveKtLikeManager;", "likeManager$delegate", "getLikeManager", "()Lcom/taobao/kmp/live/liveBizComponent/service/biz/bottomGroup/ITaoLiveKtLikeManager;", "likeManager", "Ltb/lyd;", "giftBandManager$delegate", "getGiftBandManager", "()Ltb/lyd;", "giftBandManager", "rootContext", "Ltb/exs;", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/comment/ITaoLiveKtCommentManager;", "getCommentManager", "()Lcom/taobao/kmp/live/liveBizComponent/service/biz/comment/ITaoLiveKtCommentManager;", "commentManager", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/liveResource/ITaoLiveKtEmojiManager;", "getEmojiManager", "()Lcom/taobao/kmp/live/liveBizComponent/service/biz/liveResource/ITaoLiveKtEmojiManager;", "emojiManager", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/topGroup/ITaoLiveKtAccountManager;", "getAccountManager", "()Lcom/taobao/kmp/live/liveBizComponent/service/biz/topGroup/ITaoLiveKtAccountManager;", "accountManager", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtBizManager extends TaoLiveKtGroup implements ITaoLiveKtComponentOpenService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final njg commentSender$delegate;
    private final njg commentTracker$delegate;
    private final njg giftBandManager$delegate;
    private TaoLiveKtAccountManager ktAccountManager;
    private TaoLiveKtCommentManager ktCommentManager;
    private TaoLiveKtEmojiManager ktEmojiManager;
    private final njg likeManager$delegate;
    private final njg noticeManager$delegate;
    private exs rootContext = new exs();

    static {
        t2o.a(1010827303);
        t2o.a(1003487330);
    }

    public TaoLiveKtBizManager() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.commentSender$delegate = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.fxs
            @Override // tb.d1a
            public final Object invoke() {
                TaoLiveKtCommentSender commentSender_delegate$lambda$0;
                commentSender_delegate$lambda$0 = TaoLiveKtBizManager.commentSender_delegate$lambda$0(TaoLiveKtBizManager.this);
                return commentSender_delegate$lambda$0;
            }
        });
        this.commentTracker$delegate = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.hxs
            @Override // tb.d1a
            public final Object invoke() {
                TaoLiveKtCommentTracker commentTracker_delegate$lambda$1;
                commentTracker_delegate$lambda$1 = TaoLiveKtBizManager.commentTracker_delegate$lambda$1(TaoLiveKtBizManager.this);
                return commentTracker_delegate$lambda$1;
            }
        });
        this.noticeManager$delegate = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.jxs
            @Override // tb.d1a
            public final Object invoke() {
                TaoLiveKtNoticeManager noticeManager_delegate$lambda$2;
                noticeManager_delegate$lambda$2 = TaoLiveKtBizManager.noticeManager_delegate$lambda$2(TaoLiveKtBizManager.this);
                return noticeManager_delegate$lambda$2;
            }
        });
        this.likeManager$delegate = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.lxs
            @Override // tb.d1a
            public final Object invoke() {
                TaoLiveKtLikeManager likeManager_delegate$lambda$3;
                likeManager_delegate$lambda$3 = TaoLiveKtBizManager.likeManager_delegate$lambda$3(TaoLiveKtBizManager.this);
                return likeManager_delegate$lambda$3;
            }
        });
        this.giftBandManager$delegate = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.nxs
            @Override // tb.d1a
            public final Object invoke() {
                TaoLiveKtGiftBandManager giftBandManager_delegate$lambda$4;
                giftBandManager_delegate$lambda$4 = TaoLiveKtBizManager.giftBandManager_delegate$lambda$4(TaoLiveKtBizManager.this);
                return giftBandManager_delegate$lambda$4;
            }
        });
    }

    private final void addBizComponents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1df9f5ef", new Object[]{this});
            return;
        }
        TaoLiveKtCommentManager taoLiveKtCommentManager = new TaoLiveKtCommentManager();
        this.ktCommentManager = taoLiveKtCommentManager;
        addComponent(taoLiveKtCommentManager);
        TaoLiveKtEmojiManager taoLiveKtEmojiManager = new TaoLiveKtEmojiManager();
        this.ktEmojiManager = taoLiveKtEmojiManager;
        addComponent(taoLiveKtEmojiManager);
        TaoLiveKtAccountManager taoLiveKtAccountManager = new TaoLiveKtAccountManager();
        this.ktAccountManager = taoLiveKtAccountManager;
        addComponent(taoLiveKtAccountManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TaoLiveKtCommentSender commentSender_delegate$lambda$0(TaoLiveKtBizManager taoLiveKtBizManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentSender) ipChange.ipc$dispatch("d08bbdad", new Object[]{taoLiveKtBizManager});
        }
        TaoLiveKtCommentSender taoLiveKtCommentSender = new TaoLiveKtCommentSender();
        taoLiveKtBizManager.addLazyComponent(taoLiveKtCommentSender);
        return taoLiveKtCommentSender;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TaoLiveKtCommentTracker commentTracker_delegate$lambda$1(TaoLiveKtBizManager taoLiveKtBizManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentTracker) ipChange.ipc$dispatch("66f2b482", new Object[]{taoLiveKtBizManager});
        }
        TaoLiveKtCommentTracker taoLiveKtCommentTracker = new TaoLiveKtCommentTracker();
        taoLiveKtBizManager.addLazyComponent(taoLiveKtCommentTracker);
        return taoLiveKtCommentTracker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TaoLiveKtGiftBandManager giftBandManager_delegate$lambda$4(TaoLiveKtBizManager taoLiveKtBizManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtGiftBandManager) ipChange.ipc$dispatch("935b77d1", new Object[]{taoLiveKtBizManager});
        }
        TaoLiveKtGiftBandManager taoLiveKtGiftBandManager = new TaoLiveKtGiftBandManager();
        taoLiveKtBizManager.addLazyComponent(taoLiveKtGiftBandManager);
        return taoLiveKtGiftBandManager;
    }

    private final void initBizManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4565bd1", new Object[]{this});
            return;
        }
        exs exsVar = this.rootContext;
        if (exsVar != null) {
            exsVar.i(new TaoLiveKtServiceContainer());
        }
        exs exsVar2 = this.rootContext;
        if (exsVar2 != null) {
            exsVar2.g(new TaoLiveKtGlobalTimer());
        }
    }

    public static /* synthetic */ Object ipc$super(TaoLiveKtBizManager taoLiveKtBizManager, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2022875330:
                super.onScreenOrientationChanged(((Boolean) objArr[0]).booleanValue());
                return null;
            case -703614405:
                super.updateLiveUtManager((ITaoLiveKtUtManager) objArr[0]);
                return null;
            case 567228013:
                super.updateLiveDetail((czs) objArr[0]);
                return null;
            case 861017161:
                super.unInstall();
                return null;
            case 1437299332:
                super.updateUpDownSwitchModel((TaoLiveKtSwitchModel) objArr[0]);
                return null;
            case 1889805786:
                super.install((exs) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/liveroom/liveBizComponent/ktManager/manager/TaoLiveKtBizManager");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TaoLiveKtLikeManager likeManager_delegate$lambda$3(TaoLiveKtBizManager taoLiveKtBizManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtLikeManager) ipChange.ipc$dispatch("2170553d", new Object[]{taoLiveKtBizManager});
        }
        TaoLiveKtLikeManager taoLiveKtLikeManager = new TaoLiveKtLikeManager();
        taoLiveKtBizManager.addLazyComponent(taoLiveKtLikeManager);
        return taoLiveKtLikeManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TaoLiveKtNoticeManager noticeManager_delegate$lambda$2(TaoLiveKtBizManager taoLiveKtBizManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtNoticeManager) ipChange.ipc$dispatch("173c6b3a", new Object[]{taoLiveKtBizManager});
        }
        TaoLiveKtNoticeManager taoLiveKtNoticeManager = new TaoLiveKtNoticeManager();
        taoLiveKtBizManager.addLazyComponent(taoLiveKtNoticeManager);
        return taoLiveKtNoticeManager;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtComponentOpenService
    public ITaoLiveKtAccountManager getAccountManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITaoLiveKtAccountManager) ipChange.ipc$dispatch("741ac2b5", new Object[]{this});
        }
        return this.ktAccountManager;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtComponentOpenService
    public ITaoLiveKtCommentManager getCommentManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITaoLiveKtCommentManager) ipChange.ipc$dispatch("3f0617f0", new Object[]{this});
        }
        return this.ktCommentManager;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtComponentOpenService
    public ITaoLiveKtCommentSend getCommentSender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITaoLiveKtCommentSend) ipChange.ipc$dispatch("673f004", new Object[]{this});
        }
        return (ITaoLiveKtCommentSend) this.commentSender$delegate.getValue();
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtComponentOpenService
    public ITaoLiveKtCommentTrack getCommentTracker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITaoLiveKtCommentTrack) ipChange.ipc$dispatch("387c192e", new Object[]{this});
        }
        return (ITaoLiveKtCommentTrack) this.commentTracker$delegate.getValue();
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtComponentOpenService
    public ITaoLiveKtEmojiManager getEmojiManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITaoLiveKtEmojiManager) ipChange.ipc$dispatch("e5b89757", new Object[]{this});
        }
        return this.ktEmojiManager;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtComponentOpenService
    public lyd getGiftBandManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lyd) ipChange.ipc$dispatch("c50f1254", new Object[]{this});
        }
        return (lyd) this.giftBandManager$delegate.getValue();
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtComponentOpenService
    public ITaoLiveKtLikeManager getLikeManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITaoLiveKtLikeManager) ipChange.ipc$dispatch("8ebb2691", new Object[]{this});
        }
        return (ITaoLiveKtLikeManager) this.likeManager$delegate.getValue();
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtComponentOpenService
    public myd getNoticeManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (myd) ipChange.ipc$dispatch("9e231635", new Object[]{this});
        }
        return (myd) this.noticeManager$delegate.getValue();
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtComponentOpenService
    public void install(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c3769ec", new Object[]{this, str});
            return;
        }
        initBizManager();
        install(this.rootContext);
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtGroup, com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtDataServer
    public void onScreenOrientationChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("876d5f3e", new Object[]{this, new Boolean(z)});
            return;
        }
        exs exsVar = this.rootContext;
        if (exsVar != null) {
            exsVar.h(z);
        }
        super.onScreenOrientationChanged(z);
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtComponentOpenService
    public List<Long> revMsgSubTypes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("58134969", new Object[]{this});
        }
        fg8<TaoLiveKtMsgSubType> entries = TaoLiveKtMsgSubType.getEntries();
        ArrayList arrayList = new ArrayList(zz3.q(entries, 10));
        for (TaoLiveKtMsgSubType taoLiveKtMsgSubType : entries) {
            arrayList.add(Long.valueOf(taoLiveKtMsgSubType.getValue()));
        }
        return arrayList;
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtGroup, com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.component.ITaoLiveKtComponent
    public void unInstall() {
        ITaoLiveKtGlobalTimer b;
        ITaoLiveKtServiceContainer c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33521449", new Object[]{this});
            return;
        }
        super.unInstall();
        exs exsVar = this.rootContext;
        if (!(exsVar == null || (c = exsVar.c()) == null)) {
            c.clearAll();
        }
        exs exsVar2 = this.rootContext;
        if (!(exsVar2 == null || (b = exsVar2.b()) == null)) {
            b.destroy();
        }
        this.rootContext = null;
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtGroup, com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtDataServer
    public void updateLiveDetail(czs czsVar) {
        ITaoLiveKtGlobalTimer b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21cf366d", new Object[]{this, czsVar});
            return;
        }
        exs exsVar = this.rootContext;
        if (exsVar != null) {
            exsVar.f(czsVar);
        }
        exs exsVar2 = this.rootContext;
        if (!(exsVar2 == null || (b = exsVar2.b()) == null)) {
            b.startTimer();
        }
        super.updateLiveDetail(czsVar);
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtGroup, com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtDataServer
    public void updateLiveUtManager(ITaoLiveKtUtManager iTaoLiveKtUtManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d60fb23b", new Object[]{this, iTaoLiveKtUtManager});
            return;
        }
        exs exsVar = this.rootContext;
        if (exsVar != null) {
            exsVar.k(iTaoLiveKtUtManager);
        }
        super.updateLiveUtManager(iTaoLiveKtUtManager);
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtGroup, com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtDataServer
    public void updateUpDownSwitchModel(TaoLiveKtSwitchModel taoLiveKtSwitchModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55ab7284", new Object[]{this, taoLiveKtSwitchModel});
            return;
        }
        exs exsVar = this.rootContext;
        if (exsVar != null) {
            exsVar.j(taoLiveKtSwitchModel);
        }
        super.updateUpDownSwitchModel(taoLiveKtSwitchModel);
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtGroup, com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.component.ITaoLiveKtComponent
    public void install(exs exsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a425da", new Object[]{this, exsVar});
            return;
        }
        super.install(exsVar);
        addBizComponents();
    }
}
