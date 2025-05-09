package com.taobao.android.tab2liveroom.liveroom;

import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;
import com.taobao.taolive.room.openarchitecture.listener.WatchPlatformListenerEnum;
import com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;
import tb.akt;
import tb.alc;
import tb.azb;
import tb.bmc;
import tb.cba;
import tb.cv1;
import tb.f5l;
import tb.l3l;
import tb.lbt;
import tb.muk;
import tb.nwv;
import tb.rg0;
import tb.t2o;
import tb.tfs;
import tb.ty;
import tb.utk;
import tb.v2d;
import tb.v3h;
import tb.x2d;
import tb.z9u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class LiveRoomEventHandler implements x2d, bmc, v2d, muk, utk, cv1.a, azb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final alc f9494a;
    public final lbt b;
    public Boolean c;
    public l3l d;
    public f5l e;
    public VideoInfo f;
    public ISmallWindowStrategy g;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public @interface ScrollType {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements ISmallWindowStrategy {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy
        public void onSmallWindowClick(View view, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("265e0e99", new Object[]{this, view, str, str2, str3});
                return;
            }
            tfs.g(com.taobao.android.tab2liveroom.liveroom.a.TAG, "onSmallWindowClick, url:" + str + ", id:" + str2 + ", liveType:" + str3);
            HashMap hashMap = new HashMap();
            hashMap.put("url", str);
            hashMap.put("id", str2);
            hashMap.put("liveType", str3);
            LiveRoomEventHandler.u(LiveRoomEventHandler.this).sendLiveRoomMessage("onMiniWindow", hashMap);
        }
    }

    static {
        t2o.a(779092116);
        t2o.a(806355736);
        t2o.a(806355733);
        t2o.a(806355734);
        t2o.a(779092847);
        t2o.a(779092846);
        t2o.a(806356055);
        t2o.a(779092138);
    }

    public LiveRoomEventHandler(alc alcVar) {
        this.f9494a = alcVar;
        lbt lbtVar = new lbt();
        this.b = lbtVar;
        lbtVar.h(this);
        lbtVar.i(this);
        lbtVar.g(this);
        A();
        y();
    }

    public static /* synthetic */ alc u(LiveRoomEventHandler liveRoomEventHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (alc) ipChange.ipc$dispatch("ef320ebc", new Object[]{liveRoomEventHandler});
        }
        return liveRoomEventHandler.f9494a;
    }

    public final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1a99758", new Object[]{this});
            return;
        }
        if (this.d == null) {
            this.d = new l3l(this.f9494a, this);
        }
        this.b.f(this.d);
    }

    public void B(Object obj) {
        VideoInfo videoInfo;
        String str;
        HashMap hashMap;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcdab4f9", new Object[]{this, obj});
            return;
        }
        tfs.g(com.taobao.android.tab2liveroom.liveroom.a.TAG, "onLiveDetailChanged, onReceiveDetailResponse");
        if (obj instanceof VideoInfo) {
            videoInfo = (VideoInfo) obj;
            this.f = videoInfo;
            hashMap = new HashMap();
            hashMap.put("liveId", videoInfo.liveId);
            hashMap.put("roomNum", videoInfo.roomNum);
            hashMap.put("roomStatus", videoInfo.roomStatus);
            hashMap.put(z9u.KEY_ROOMTYPE, Integer.valueOf(videoInfo.roomType));
            AccountInfo accountInfo = videoInfo.broadCaster;
            if (accountInfo != null) {
                hashMap.put("accountId", accountInfo.accountId);
                hashMap.put("accountName", videoInfo.broadCaster.accountName);
                hashMap.put("headImg", videoInfo.broadCaster.headImg);
                hashMap.put(rg0.JUMP_URL, videoInfo.broadCaster.jumpUrl);
                hashMap.put("shopId", videoInfo.broadCaster.shopId);
                hashMap.put("subscribe", Boolean.valueOf(videoInfo.broadCaster.subscribe));
                hashMap.put("follow", Boolean.valueOf(videoInfo.broadCaster.follow));
                hashMap.put("topFollow", Boolean.valueOf(videoInfo.broadCaster.topFollow));
                hashMap.put("type", videoInfo.broadCaster.type);
                hashMap.put("shopName", videoInfo.broadCaster.shopName);
            }
            VideoInfo.OfficialLiveInfo officialLiveInfo = videoInfo.officialLiveInfo;
            if (officialLiveInfo != null) {
                hashMap.put("officialLiveId", officialLiveInfo.officialLiveId);
                hashMap.put("officialAccountId", videoInfo.officialLiveInfo.accountId);
                hashMap.put("officialAccountName", videoInfo.officialLiveInfo.accountName);
                hashMap.put("officialHeadImg", videoInfo.officialLiveInfo.officialHeadImg);
                hashMap.put("officialFollow", videoInfo.officialLiveInfo.follow);
                if (TextUtils.equals(videoInfo.officialLiveInfo.officialLive, "official")) {
                    str2 = "mainroom";
                } else if (TextUtils.equals(videoInfo.officialLiveInfo.officialLive, "rebroadcast")) {
                    str2 = "subroom";
                } else {
                    str2 = "none";
                }
                hashMap.put("officialLiveType", str2);
            }
            str = videoInfo.liveId;
            VideoInfo.OfficialLiveInfo officialLiveInfo2 = videoInfo.officialLiveInfo;
            if (officialLiveInfo2 != null && !TextUtils.isEmpty(officialLiveInfo2.officialLiveId)) {
                str = videoInfo.officialLiveInfo.officialLiveId;
            }
        } else {
            tfs.g(com.taobao.android.tab2liveroom.liveroom.a.TAG, "unsupport type response:" + JSON.toJSONString(obj));
            videoInfo = null;
            hashMap = null;
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            this.f9494a.updateCurrentLiveRoomInfo(videoInfo, str, this.c);
        }
        this.f9494a.sendLiveRoomMessage("onLiveDetailChanged", hashMap);
        this.f9494a.onLiveDetailSuccess();
    }

    @Override // tb.v2d
    public void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22ad806b", new Object[]{this, str, str2, str3});
            return;
        }
        tfs.g(com.taobao.android.tab2liveroom.liveroom.a.TAG, "onFollowChanged, onFollowAction accountId:" + str + " accountType:" + str2 + " followSource:" + str3);
        HashMap hashMap = new HashMap();
        hashMap.put(com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_FOLLOWED, Boolean.TRUE);
        hashMap.put("accountId", str);
        hashMap.put("accountType", str2);
        hashMap.put("followSource", str3);
        this.f9494a.sendLiveRoomMessage("onFollowChanged", hashMap);
    }

    @Override // tb.v2d
    public void c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a59b963a", new Object[]{this, str, str2, str3});
            return;
        }
        tfs.g(com.taobao.android.tab2liveroom.liveroom.a.TAG, "onFollowChanged, onUnfollowAciton accountId:" + str + " accountType:" + str2 + " followSource:" + str3);
        HashMap hashMap = new HashMap();
        hashMap.put(com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_FOLLOWED, Boolean.FALSE);
        hashMap.put("accountId", str);
        hashMap.put("accountType", str2);
        hashMap.put("followSource", str3);
        this.f9494a.sendLiveRoomMessage("onFollowChanged", hashMap);
    }

    @Override // tb.v2d
    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dcea941", new Object[]{this, new Boolean(z)});
            return;
        }
        tfs.g(com.taobao.android.tab2liveroom.liveroom.a.TAG, "onScreenCleanChanged, clean: " + z);
        HashMap hashMap = new HashMap();
        hashMap.put("clean", Boolean.valueOf(z));
        this.f9494a.sendLiveRoomMessage("onScreenCleanChanged", hashMap);
    }

    @Override // tb.z2d
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcbec7b7", new Object[]{this});
        } else {
            tfs.g(com.taobao.android.tab2liveroom.liveroom.a.TAG, "onStreamStateChanged, onPrelive");
        }
    }

    @Override // tb.a3d
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79dc178c", new Object[]{this});
            return;
        }
        tfs.g(com.taobao.android.tab2liveroom.liveroom.a.TAG, "onRoomStateChanged, liveRoomUserLeave");
        HashMap hashMap = new HashMap();
        hashMap.put("state", "userleave");
        this.f9494a.sendLiveRoomMessage("onRoomStateChanged", hashMap);
    }

    @Override // tb.y2d
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae1f44ae", new Object[]{this});
            return;
        }
        tfs.g(com.taobao.android.tab2liveroom.liveroom.a.TAG, "onPlayerStatusChange, playerError");
        HashMap hashMap = new HashMap();
        hashMap.put("state", "error");
        this.f9494a.sendLiveRoomMessage("onPlayerStatusChange", hashMap);
        VideoInfo videoInfo = this.f;
        v3h.b(this.f9494a, videoInfo != null ? videoInfo.liveId : null);
    }

    @Override // tb.z2d
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9880272", new Object[]{this});
        } else {
            tfs.g(com.taobao.android.tab2liveroom.liveroom.a.TAG, "onStreamStateChanged, onLive");
        }
    }

    @Override // tb.w2d
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da11895b", new Object[]{this});
        } else {
            tfs.g(com.taobao.android.tab2liveroom.liveroom.a.TAG, "onStreamStateChanged, streamPlay");
        }
    }

    @Override // tb.cv1.a
    public void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ead943b", new Object[]{this, new Boolean(z)});
            return;
        }
        alc alcVar = this.f9494a;
        if (alcVar != null) {
            alcVar.sendMuteStateMessage(z);
        }
        this.c = Boolean.valueOf(z);
    }

    @Override // tb.a3d
    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab030dfb", new Object[]{this});
            return;
        }
        tfs.g(com.taobao.android.tab2liveroom.liveroom.a.TAG, "onRoomStateChanged, liveRoomEnd");
        HashMap hashMap = new HashMap();
        hashMap.put("state", "end");
        this.f9494a.sendLiveRoomMessage("onRoomStateChanged", hashMap);
    }

    @Override // tb.utk
    public void onFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("badeed9", new Object[]{this});
        } else {
            tfs.g(com.taobao.android.tab2liveroom.liveroom.a.TAG, "onFinish");
        }
    }

    @Override // tb.x2d
    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa10b06d", new Object[]{this});
        } else {
            tfs.g(com.taobao.android.tab2liveroom.liveroom.a.TAG, "onVerticalScrollDisable");
        }
    }

    @Override // tb.w2d
    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3bffdd", new Object[]{this});
        } else {
            tfs.g(com.taobao.android.tab2liveroom.liveroom.a.TAG, "onStreamStateChanged, streamPause");
        }
    }

    @Override // tb.z2d
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ebae02d", new Object[]{this});
        } else {
            tfs.g(com.taobao.android.tab2liveroom.liveroom.a.TAG, "onStreamStateChanged, onReplay");
        }
    }

    @Override // tb.v2d
    public void t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aed10667", new Object[]{this, str});
        }
    }

    public ty v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ty) ipChange.ipc$dispatch("6e6e0021", new Object[]{this});
        }
        return this.e;
    }

    public final int w() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ef816c7", new Object[]{this})).intValue();
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.f9494a.getTaoliveOpenLiveRoom();
        if (taoliveOpenLiveRoom != null) {
            i = taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.getCurRoomIndex, new Object[0]);
        } else {
            i = 0;
        }
        return nwv.t(i, 0);
    }

    public lbt x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lbt) ipChange.ipc$dispatch("6d91dbf7", new Object[]{this});
        }
        return this.b;
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c27236", new Object[]{this});
        } else if (this.e == null) {
            this.e = new f5l(this.f9494a);
        }
    }

    public final void D(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aba853d6", new Object[]{this, map, str});
            return;
        }
        this.f9494a.setImmersiveMode(true);
        HashMap hashMap = new HashMap();
        hashMap.put("scrollType", str);
        hashMap.put("index", Integer.valueOf(w()));
        if (map != null) {
            hashMap.putAll(map);
        }
        this.f9494a.sendLiveRoomMessage("onScrollChanged", hashMap);
    }

    @Override // tb.muk
    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af77910", new Object[]{this, map});
            return;
        }
        tfs.g(com.taobao.android.tab2liveroom.liveroom.a.TAG, "onLiveRoomChanged onScrollDown");
        this.f9494a.rootViewHeightChange(false);
        D(map, "scrollDown");
    }

    @Override // tb.x2d
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae2dbcc", new Object[]{this});
            return;
        }
        if (!(this.f9494a.getLiveSecondRefreshManager() == null || this.f9494a.getLiveSecondRefreshManager().g() == null || !akt.p2("enableFixClearLiveScreen", true))) {
            this.f9494a.getLiveSecondRefreshManager().g().e();
        }
        tfs.g(com.taobao.android.tab2liveroom.liveroom.a.TAG, "onVerticalScrollEnable");
    }

    @Override // tb.muk
    public void f(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fad69777", new Object[]{this, map});
            return;
        }
        tfs.g(com.taobao.android.tab2liveroom.liveroom.a.TAG, "onLiveRoomChanged onScrollUp");
        this.f9494a.rootViewHeightChange(false);
        D(map, "scrollUp");
    }

    @Override // tb.y2d
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c610301b", new Object[]{this});
            return;
        }
        tfs.g(com.taobao.android.tab2liveroom.liveroom.a.TAG, "onPlayerStatusChange, playerFirstFrameRender");
        HashMap hashMap = new HashMap();
        hashMap.put("state", ImageLoader.Scene.FIRST_FRAME);
        if (!(this.f9494a.getLiveSecondRefreshManager() == null || this.f9494a.getLiveSecondRefreshManager().g() == null)) {
            this.f9494a.getLiveSecondRefreshManager().g().b(false);
            this.f9494a.getLiveSecondRefreshManager().g().e();
        }
        this.f9494a.onCleanPreloadData();
        this.f9494a.sendLiveRoomMessage("onPlayerStatusChange", hashMap);
    }

    @Override // tb.x2d
    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b00893f", new Object[]{this});
            return;
        }
        tfs.g(com.taobao.android.tab2liveroom.liveroom.a.TAG, "onHorizontalScrollDisable");
        this.f9494a.setScrollEnable(false);
        this.f9494a.sendScrollStateMessage(false, false, false);
    }

    public void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f869906a", new Object[]{this});
            return;
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.f9494a.getTaoliveOpenLiveRoom();
        if (taoliveOpenLiveRoom != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("onScrollListener", this);
            this.f9494a.getTaoliveOpenLiveRoom().callWatchPlatform(WatchPlatformListenerEnum.setOnScrollListener, hashMap);
            if (akt.p2("enableInterceptLiveFinish", true)) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put(DataReceiveMonitor.CB_LISTENER, this);
                this.f9494a.getTaoliveOpenLiveRoom().callWatchPlatform(WatchPlatformListenerEnum.setRoomFinishListener, hashMap2);
            }
            Object callWatchPlatform = taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.getGlobalContext, new Object[0]);
            if (callWatchPlatform instanceof cba) {
                cba cbaVar = (cba) callWatchPlatform;
                boolean e0 = cbaVar.e0();
                this.c = Boolean.valueOf(e0);
                this.f9494a.sendMuteStateMessage(e0);
                cbaVar.a(this);
            }
            z();
        }
    }

    @Override // tb.x2d
    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f0ba0ba", new Object[]{this});
            return;
        }
        tfs.g(com.taobao.android.tab2liveroom.liveroom.a.TAG, "onHorizontalScrollEnable");
        this.f9494a.setScrollEnable(true);
        this.f9494a.sendScrollStateMessage(true, false, false);
    }

    public final void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18156dea", new Object[]{this});
            return;
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.f9494a.getTaoliveOpenLiveRoom();
        if (taoliveOpenLiveRoom != null) {
            HashMap hashMap = new HashMap();
            if (this.g == null) {
                this.g = new a();
            }
            hashMap.put(DataReceiveMonitor.CB_LISTENER, this.g);
            taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.setSmallWindowClickListener, hashMap);
        }
    }
}
