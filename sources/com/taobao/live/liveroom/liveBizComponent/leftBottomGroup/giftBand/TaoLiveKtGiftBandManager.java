package com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.giftBand;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtUtManager;
import com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.a;
import tb.czs;
import tb.exs;
import tb.jpu;
import tb.lyd;
import tb.mhr;
import tb.srv;
import tb.t2o;
import tb.v3i;
import tb.z9u;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u0019\u0010\u000b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u0019\u0010\u000e\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R&\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/giftBand/TaoLiveKtGiftBandManager;", "Lcom/taobao/live/liveroom/liveBizComponent/ktManager/base/TaoLiveKtComponent;", "Ltb/lyd;", "<init>", "()V", "", "videoUrl", "Ltb/xhv;", "playVideoIfNeeded", "(Ljava/lang/String;)V", "showExpose", "makeGiftMessage", "Ltb/czs;", "model", "updateLiveDetail", "(Ltb/czs;)V", "", "", "readGiftMessage", "()Ljava/util/Map;", "getName", "()Ljava/lang/String;", "giftMessage", "Ljava/util/Map;", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtGiftBandManager extends TaoLiveKtComponent implements lyd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<String, ? extends Object> giftMessage;

    static {
        t2o.a(1010827322);
        t2o.a(1003487350);
    }

    public static /* synthetic */ Object ipc$super(TaoLiveKtGiftBandManager taoLiveKtGiftBandManager, String str, Object... objArr) {
        if (str.hashCode() == 567228013) {
            super.updateLiveDetail((czs) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/liveroom/liveBizComponent/leftBottomGroup/giftBand/TaoLiveKtGiftBandManager");
    }

    private final void makeGiftMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("850bafba", new Object[]{this, str});
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("giftType", "1");
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        linkedHashMap.put("animationMp4", str);
        String b = srv.b();
        if (b != null) {
            str2 = b;
        }
        linkedHashMap.put("senderId", str2);
        this.giftMessage = v3i.f(jpu.a("giftEffectInfo", a.r(linkedHashMap)));
    }

    private final void playVideoIfNeeded(String str) {
        String str2;
        czs a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("370687ca", new Object[]{this, str});
            return;
        }
        exs bizContext = getBizContext();
        if (bizContext == null || (a2 = bizContext.a()) == null || (str2 = a2.m()) == null) {
            str2 = "";
        }
        String concat = str2.concat("_key");
        String str3 = mhr.Y().get(concat);
        if (str3 == null || str3.length() == 0) {
            showExpose();
            makeGiftMessage(str);
            mhr.Y().set(concat, "1");
        }
    }

    private final void showExpose() {
        String str;
        ITaoLiveKtUtManager d;
        czs a2;
        String a3;
        czs a4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c4af528", new Object[]{this});
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        exs bizContext = getBizContext();
        String str2 = "";
        if (bizContext == null || (a4 = bizContext.a()) == null || (str = a4.m()) == null) {
            str = str2;
        }
        linkedHashMap.put("feed_id", str);
        exs bizContext2 = getBizContext();
        if (!(bizContext2 == null || (a2 = bizContext2.a()) == null || (a3 = a2.a()) == null)) {
            str2 = a3;
        }
        linkedHashMap.put(z9u.KEY_ACCOUNT_ID, str2);
        exs bizContext3 = getBizContext();
        if (bizContext3 != null && (d = bizContext3.d()) != null) {
            d.exposed("Show-Decelerate", "Page_TaobaoLiveWatch", a.r(linkedHashMap));
        }
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.component.ITaoLiveKtComponent
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "ITaoLiveKtGiftBandManager";
    }

    @Override // tb.lyd
    public Map<String, Object> readGiftMessage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9cbc3d7d", new Object[]{this});
        }
        return this.giftMessage;
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtDataServer
    public void updateLiveDetail(czs czsVar) {
        String str;
        KMPJsonObject s;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21cf366d", new Object[]{this, czsVar});
            return;
        }
        super.updateLiveDetail(czsVar);
        if (czsVar == null || (s = czsVar.s()) == null || (str = s.getString("superLiveAtmosphereUrl")) == null) {
            str = "";
        }
        if (str.length() > 0) {
            playVideoIfNeeded(str);
        }
    }
}
