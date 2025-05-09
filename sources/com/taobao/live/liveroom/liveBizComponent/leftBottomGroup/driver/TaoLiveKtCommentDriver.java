package com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.driver;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.helper.ITaoLiveKtGlobalTimer;
import com.taobao.kmp.live.liveBizComponent.helper.ITaoLiveKtGlobalTimerHandler;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentEntity;
import com.taobao.kmp.live.liveBizComponent.service.biz.comment.TaoLiveKtCommentDriverResult;
import com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent;
import com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.builder.TaoLiveKtCommentConfigBiz;
import com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.builder.TaoLiveKtCommentQueue;
import com.taobao.weex.common.Constants;
import kotlin.Metadata;
import tb.ckf;
import tb.es6;
import tb.exs;
import tb.g1a;
import tb.nys;
import tb.t2o;
import tb.txs;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u001f\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019RG\u0010 \u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u001b¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001aj\u0004\u0018\u0001`\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010'\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010.\u001a\u00020-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R.\u00105\u001a\u0004\u0018\u00010\t2\b\u00104\u001a\u0004\u0018\u00010\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020-8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u00101¨\u0006="}, d2 = {"Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/driver/TaoLiveKtCommentDriver;", "Lcom/taobao/live/liveroom/liveBizComponent/ktManager/base/TaoLiveKtComponent;", "Lcom/taobao/kmp/live/liveBizComponent/helper/ITaoLiveKtGlobalTimerHandler;", "<init>", "()V", "Ltb/xhv;", "registerEvent", "", "tag", "", Constants.Name.INTERVAL, "registerAutoIntervalEvent", "(Ljava/lang/String;J)V", "Ltb/exs;", es6.DP_BIZ_CONTEXT, "install", "(Ltb/exs;)V", "handleEvent", "(Ljava/lang/String;)V", "Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/driver/TaoLiveKtCommentDataCenter;", "dataCenter", "Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/driver/TaoLiveKtCommentDataCenter;", "getDataCenter", "()Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/driver/TaoLiveKtCommentDataCenter;", "setDataCenter", "(Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/driver/TaoLiveKtCommentDataCenter;)V", "Lkotlin/Function1;", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/comment/TaoLiveKtCommentDriverResult;", "Lkotlin/ParameterName;", "name", "response", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/comment/TaoLiveCommentDriverCallback;", "callback", "Ltb/g1a;", "getCallback", "()Ltb/g1a;", "setCallback", "(Ltb/g1a;)V", "Ltb/txs;", "openConfig", "Ltb/txs;", "getOpenConfig", "()Ltb/txs;", "setOpenConfig", "(Ltb/txs;)V", "", "paused", "Z", "getPaused", "()Z", "setPaused", "(Z)V", "value", "hotSaleDisappearTime", "Ljava/lang/Long;", "getHotSaleDisappearTime", "()Ljava/lang/Long;", "setHotSaleDisappearTime", "(Ljava/lang/Long;)V", "getEnableEnterAtmosphere", "enableEnterAtmosphere", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtCommentDriver extends TaoLiveKtComponent implements ITaoLiveKtGlobalTimerHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private g1a<? super TaoLiveKtCommentDriverResult, xhv> callback;
    private TaoLiveKtCommentDataCenter dataCenter;
    private Long hotSaleDisappearTime;
    private txs openConfig;
    private boolean paused;

    static {
        t2o.a(1010827314);
        t2o.a(1003487277);
    }

    private final boolean getEnableEnterAtmosphere() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd5a4c6c", new Object[]{this})).booleanValue();
        }
        txs txsVar = this.openConfig;
        if (txsVar == null || txsVar.a(TaoLiveKtCommentConfigBiz.EnterAtmosphere)) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ Object ipc$super(TaoLiveKtCommentDriver taoLiveKtCommentDriver, String str, Object... objArr) {
        if (str.hashCode() == 1889805786) {
            super.install((exs) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/liveroom/liveBizComponent/leftBottomGroup/driver/TaoLiveKtCommentDriver");
    }

    private final void registerAutoIntervalEvent(String str, long j) {
        ITaoLiveKtGlobalTimer b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fdaf7f0", new Object[]{this, str, new Long(j)});
            return;
        }
        exs bizContext = getBizContext();
        if (bizContext != null && (b = bizContext.b()) != null) {
            b.loopEvent(this, str, j);
        }
    }

    private final void registerEvent() {
        ITaoLiveKtGlobalTimer b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56f9d2be", new Object[]{this});
            return;
        }
        exs bizContext = getBizContext();
        if (bizContext != null && (b = bizContext.b()) != null) {
            nys nysVar = nys.INSTANCE;
            b.loopEvent(this, nysVar.d(), 500L);
            b.loopEvent(this, nysVar.a(), 1000L);
            if (getEnableEnterAtmosphere()) {
                b.loopEvent(this, nysVar.b(), 2000L);
            }
        }
    }

    public final g1a<TaoLiveKtCommentDriverResult, xhv> getCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("2fd5f95a", new Object[]{this});
        }
        return this.callback;
    }

    public final TaoLiveKtCommentDataCenter getDataCenter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentDataCenter) ipChange.ipc$dispatch("55f41722", new Object[]{this});
        }
        return this.dataCenter;
    }

    public final Long getHotSaleDisappearTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("220870bc", new Object[]{this});
        }
        return this.hotSaleDisappearTime;
    }

    public final txs getOpenConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (txs) ipChange.ipc$dispatch("36634f9b", new Object[]{this});
        }
        return this.openConfig;
    }

    public final boolean getPaused() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb968eaf", new Object[]{this})).booleanValue();
        }
        return this.paused;
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.component.ITaoLiveKtComponent
    public void install(exs exsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a425da", new Object[]{this, exsVar});
            return;
        }
        super.install(exsVar);
        registerEvent();
    }

    public final void setCallback(g1a<? super TaoLiveKtCommentDriverResult, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20c9d94", new Object[]{this, g1aVar});
        } else {
            this.callback = g1aVar;
        }
    }

    public final void setDataCenter(TaoLiveKtCommentDataCenter taoLiveKtCommentDataCenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5b48cae", new Object[]{this, taoLiveKtCommentDataCenter});
        } else {
            this.dataCenter = taoLiveKtCommentDataCenter;
        }
    }

    public final void setHotSaleDisappearTime(Long l) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfdde684", new Object[]{this, l});
            return;
        }
        this.hotSaleDisappearTime = l;
        String c = nys.INSTANCE.c();
        Long l2 = this.hotSaleDisappearTime;
        if (l2 != null) {
            j = l2.longValue();
        } else {
            j = 2000;
        }
        registerAutoIntervalEvent(c, j);
    }

    public final void setOpenConfig(txs txsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa4c11c3", new Object[]{this, txsVar});
        } else {
            this.openConfig = txsVar;
        }
    }

    public final void setPaused(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1da16cfd", new Object[]{this, new Boolean(z)});
        } else {
            this.paused = z;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.helper.ITaoLiveKtGlobalTimerHandler
    public void handleEvent(String str) {
        TaoLiveKtCommentQueue hotSales;
        TaoLiveKtCommentQueue hotSales2;
        TaoLiveKtCommentQueue normalResponses;
        TaoLiveKtCommentQueue normalResponses2;
        TaoLiveKtCommentQueue warnings;
        TaoLiveKtCommentQueue everyBodySays;
        TaoLiveKtCommentQueue bottoms;
        TaoLiveKtCommentQueue normals;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ba63e63", new Object[]{this, str});
            return;
        }
        ckf.g(str, "tag");
        if (this.dataCenter != null && !this.paused) {
            TaoLiveKtCommentDriverResult taoLiveKtCommentDriverResult = new TaoLiveKtCommentDriverResult();
            nys nysVar = nys.INSTANCE;
            TaoLiveKtCommentEntity taoLiveKtCommentEntity = null;
            if (ckf.b(str, nysVar.d())) {
                TaoLiveKtCommentDataCenter taoLiveKtCommentDataCenter = this.dataCenter;
                if (!(taoLiveKtCommentDataCenter == null || (normals = taoLiveKtCommentDataCenter.getNormals()) == null)) {
                    taoLiveKtCommentEntity = normals.readComment();
                }
                taoLiveKtCommentDriverResult.setNormal(taoLiveKtCommentEntity);
            } else if (ckf.b(str, nysVar.a())) {
                TaoLiveKtCommentDataCenter taoLiveKtCommentDataCenter2 = this.dataCenter;
                if (!(taoLiveKtCommentDataCenter2 == null || (bottoms = taoLiveKtCommentDataCenter2.getBottoms()) == null || bottoms.isEmpty())) {
                    TaoLiveKtCommentDataCenter taoLiveKtCommentDataCenter3 = this.dataCenter;
                    taoLiveKtCommentDriverResult.setBottom(taoLiveKtCommentDataCenter3 != null ? taoLiveKtCommentDataCenter3.readBottom() : null);
                }
                TaoLiveKtCommentDataCenter taoLiveKtCommentDataCenter4 = this.dataCenter;
                if (!(taoLiveKtCommentDataCenter4 == null || (everyBodySays = taoLiveKtCommentDataCenter4.getEveryBodySays()) == null || everyBodySays.isEmpty())) {
                    TaoLiveKtCommentDataCenter taoLiveKtCommentDataCenter5 = this.dataCenter;
                    taoLiveKtCommentDriverResult.setEveryBodySay(taoLiveKtCommentDataCenter5 != null ? taoLiveKtCommentDataCenter5.readEveryBodySay() : null);
                }
                TaoLiveKtCommentDataCenter taoLiveKtCommentDataCenter6 = this.dataCenter;
                if (!(taoLiveKtCommentDataCenter6 == null || (warnings = taoLiveKtCommentDataCenter6.getWarnings()) == null || warnings.isEmpty())) {
                    TaoLiveKtCommentDataCenter taoLiveKtCommentDataCenter7 = this.dataCenter;
                    taoLiveKtCommentDriverResult.setWarning(taoLiveKtCommentDataCenter7 != null ? taoLiveKtCommentDataCenter7.readWarning() : null);
                }
                TaoLiveKtCommentDataCenter taoLiveKtCommentDataCenter8 = this.dataCenter;
                if (!(taoLiveKtCommentDataCenter8 == null || (normalResponses = taoLiveKtCommentDataCenter8.getNormalResponses()) == null || normalResponses.isEmpty())) {
                    TaoLiveKtCommentDataCenter taoLiveKtCommentDataCenter9 = this.dataCenter;
                    if (!(taoLiveKtCommentDataCenter9 == null || (normalResponses2 = taoLiveKtCommentDataCenter9.getNormalResponses()) == null)) {
                        taoLiveKtCommentEntity = normalResponses2.readComment();
                    }
                    taoLiveKtCommentDriverResult.setNormalResponse(taoLiveKtCommentEntity);
                }
            } else if (ckf.b(str, nysVar.c())) {
                TaoLiveKtCommentDataCenter taoLiveKtCommentDataCenter10 = this.dataCenter;
                if (!(taoLiveKtCommentDataCenter10 == null || (hotSales = taoLiveKtCommentDataCenter10.getHotSales()) == null || hotSales.isEmpty())) {
                    TaoLiveKtCommentDataCenter taoLiveKtCommentDataCenter11 = this.dataCenter;
                    if (!(taoLiveKtCommentDataCenter11 == null || (hotSales2 = taoLiveKtCommentDataCenter11.getHotSales()) == null)) {
                        taoLiveKtCommentEntity = hotSales2.readComment();
                    }
                    taoLiveKtCommentDriverResult.setHotSale(taoLiveKtCommentEntity);
                }
            } else if (ckf.b(str, nysVar.b()) && getEnableEnterAtmosphere()) {
                taoLiveKtCommentDriverResult.setAtmospherePop(true);
            }
            g1a<? super TaoLiveKtCommentDriverResult, xhv> g1aVar = this.callback;
            if (g1aVar != null) {
                g1aVar.invoke(taoLiveKtCommentDriverResult);
            }
        }
    }
}
