package com.taobao.live.liveroom.liveBizComponent.topGroup.manager;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.topGroup.TaoLiveKtNoticeEntityType;
import com.taobao.kmp.live.liveBizComponent.service.base.TaoLiveKtMsgSubType;
import com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent;
import com.taobao.live.liveroom.liveBizComponent.topGroup.manager.TaoLiveKtNoticeManager;
import com.taobao.live.liveroom.liveBizComponent.topGroup.model.TaoLiveKtNoticeDxModel;
import com.taobao.live.liveroom.liveBizComponent.topGroup.model.TaoLiveKtNoticeEntity;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJSONUtils_androidKt;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import tb.ckf;
import tb.czs;
import tb.d1a;
import tb.dun;
import tb.exs;
import tb.l1t;
import tb.myd;
import tb.njg;
import tb.ns3;
import tb.pus;
import tb.r1t;
import tb.t1t;
import tb.t2o;
import tb.tvr;
import tb.x1t;
import tb.xhv;
import tb.z1t;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\n\u001a\u00020\t2\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\f\u001a\u00020\t2\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u0004R\u001b\u0010 \u001a\u00020\u001b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR0\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010!j\u0004\u0018\u0001`\"8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/taobao/live/liveroom/liveBizComponent/topGroup/manager/TaoLiveKtNoticeManager;", "Lcom/taobao/live/liveroom/liveBizComponent/ktManager/base/TaoLiveKtComponent;", "Ltb/myd;", "<init>", "()V", "", "", "", "data", "Ltb/xhv;", "handleNormalNotice", "(Ljava/util/Map;)V", "handleDxNotice", "getName", "()Ljava/lang/String;", "Ltb/czs;", "model", "updateLiveDetail", "(Ltb/czs;)V", "", "subType", "didRevLivePowerMsg", "(JLjava/util/Map;)V", "Lcom/taobao/live/liveroom/liveBizComponent/topGroup/model/TaoLiveKtNoticeEntity;", "fetchNoticeEntity", "()Lcom/taobao/live/liveroom/liveBizComponent/topGroup/model/TaoLiveKtNoticeEntity;", "unInstall", "Ltb/x1t;", "notices$delegate", "Ltb/njg;", "getNotices", "()Ltb/x1t;", "notices", "Lkotlin/Function0;", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/topGroup/TaoLiveKtNoticeCallback;", "noticeCallback", "Ltb/d1a;", "getNoticeCallback", "()Ltb/d1a;", "setNoticeCallback", "(Ltb/d1a;)V", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtNoticeManager extends TaoLiveKtComponent implements myd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private d1a<xhv> noticeCallback;
    private final njg notices$delegate = a.a(LazyThreadSafetyMode.PUBLICATION, new d1a() { // from class: tb.v1t
        @Override // tb.d1a
        public final Object invoke() {
            x1t notices_delegate$lambda$0;
            notices_delegate$lambda$0 = TaoLiveKtNoticeManager.notices_delegate$lambda$0();
            return notices_delegate$lambda$0;
        }
    });

    static {
        t2o.a(1010827384);
        t2o.a(1003487359);
    }

    private final void handleDxNotice(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afa124ca", new Object[]{this, map});
            return;
        }
        l1t l1tVar = l1t.INSTANCE;
        Serializable serializable = null;
        if (map != null) {
            try {
                serializable = KMPJSONUtils_androidKt.decodeFromJsonObject(com.taobao.uniinfra_kmp.common_utils.serialization.a.Companion, new KMPJsonObject(map instanceof Object ? map : null), dun.b(TaoLiveKtNoticeDxModel.class));
            } catch (Exception e) {
                pus pusVar = pus.INSTANCE;
                String valueOf = String.valueOf(((ns3) dun.b(l1tVar.getClass())).getSimpleName());
                pusVar.f(valueOf, "", "modelFromMap === " + e.getMessage() + ", data === " + map);
            }
        }
        TaoLiveKtNoticeDxModel taoLiveKtNoticeDxModel = (TaoLiveKtNoticeDxModel) serializable;
        if (taoLiveKtNoticeDxModel != null) {
            getNotices().c(r1t.INSTANCE.a(taoLiveKtNoticeDxModel, getBizContext()));
            d1a<xhv> noticeCallback = getNoticeCallback();
            if (noticeCallback != null) {
                noticeCallback.invoke();
            }
        }
    }

    private final void handleNormalNotice(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32274bd7", new Object[]{this, map});
            return;
        }
        getNotices().c(r1t.INSTANCE.b(map));
        d1a<xhv> noticeCallback = getNoticeCallback();
        if (noticeCallback != null) {
            noticeCallback.invoke();
        }
    }

    public static /* synthetic */ Object ipc$super(TaoLiveKtNoticeManager taoLiveKtNoticeManager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 567228013) {
            super.updateLiveDetail((czs) objArr[0]);
            return null;
        } else if (hashCode == 861017161) {
            super.unInstall();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/live/liveroom/liveBizComponent/topGroup/manager/TaoLiveKtNoticeManager");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x1t notices_delegate$lambda$0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x1t) ipChange.ipc$dispatch("87238cac", new Object[0]);
        }
        return new x1t();
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtDataServer
    public void didRevLivePowerMsg(long j, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d149c7d4", new Object[]{this, new Long(j), map});
        } else if (j == TaoLiveKtMsgSubType.NormalNotice.getValue()) {
            handleNormalNotice(map);
        } else if (j == TaoLiveKtMsgSubType.DXNotice.getValue()) {
            handleDxNotice(map);
        }
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.component.ITaoLiveKtComponent
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "ITaoLiveKtNoticeManager";
    }

    public d1a<xhv> getNoticeCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d1a) ipChange.ipc$dispatch("c0b3f3c3", new Object[]{this});
        }
        return this.noticeCallback;
    }

    public final x1t getNotices() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x1t) ipChange.ipc$dispatch("1398f63", new Object[]{this});
        }
        return (x1t) this.notices$delegate.getValue();
    }

    @Override // tb.myd
    public void setNoticeCallback(d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9f406ad", new Object[]{this, d1aVar});
        } else {
            this.noticeCallback = d1aVar;
        }
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.component.ITaoLiveKtComponent
    public void unInstall() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33521449", new Object[]{this});
            return;
        }
        super.unInstall();
        getNotices().a();
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtDataServer
    public void updateLiveDetail(czs czsVar) {
        String str;
        String str2;
        String str3;
        czs a2;
        String m;
        KMPJsonObject j;
        KMPJsonObject j2;
        KMPJsonObject j3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21cf366d", new Object[]{this, czsVar});
            return;
        }
        super.updateLiveDetail(czsVar);
        String str4 = "";
        if (czsVar == null || (j3 = czsVar.j()) == null || (str = j3.getString("isFromRankNotice")) == null) {
            str = str4;
        }
        if (ckf.b(str, "1")) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (czsVar == null || (j2 = czsVar.j()) == null || (str2 = j2.getString("trackId")) == null) {
                str2 = str4;
            }
            linkedHashMap.put("trackId", str2);
            if (czsVar == null || (j = czsVar.j()) == null || (str3 = j.getString("trackName")) == null) {
                str3 = str4;
            }
            linkedHashMap.put("trackName", str3);
            exs bizContext = getBizContext();
            if (!(bizContext == null || (a2 = bizContext.a()) == null || (m = a2.m()) == null)) {
                str4 = m;
            }
            linkedHashMap.put("liveId", str4);
            z1t.INSTANCE.a(linkedHashMap);
        }
    }

    @Override // tb.myd
    public TaoLiveKtNoticeEntity fetchNoticeEntity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtNoticeEntity) ipChange.ipc$dispatch("24e9e0a1", new Object[]{this});
        }
        TaoLiveKtNoticeEntity b = getNotices().b();
        while (true) {
            TaoLiveKtNoticeEntityType taoLiveKtNoticeEntityType = null;
            if (tvr.c(b)) {
                return null;
            }
            if (b != null) {
                taoLiveKtNoticeEntityType = b.getNoticeType();
            }
            if (taoLiveKtNoticeEntityType != TaoLiveKtNoticeEntityType.DXNotice || t1t.INSTANCE.a(b, getBizContext())) {
                return b;
            }
            b = getNotices().b();
        }
    }
}
