package com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.driver;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentCriticalModel;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentEntity;
import com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentDataCenter;
import com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentShowPriority;
import com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.builder.TaoLiveKtAtmosphereQueue;
import com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.builder.TaoLiveKtCommentQueue;
import com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.driver.TaoLiveKtCommentDataCenter;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import com.taobao.weex.common.Constants;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import tb.ckf;
import tb.czs;
import tb.d1a;
import tb.njg;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0012\u0010\rR2\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010$\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010+\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001b\u00106\u001a\u0002018VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001b\u0010:\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b7\u00103\u001a\u0004\b8\u00109R\u001b\u0010=\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b;\u00103\u001a\u0004\b<\u00109R\u001b\u0010@\u001a\u00020\u00068VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b>\u00103\u001a\u0004\b?\u00109R\u001b\u0010C\u001a\u00020\u00068VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bA\u00103\u001a\u0004\bB\u00109R\u001b\u0010F\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bD\u00103\u001a\u0004\bE\u00109R\u001b\u0010I\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bG\u00103\u001a\u0004\bH\u00109R$\u0010K\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001b\u0010S\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bQ\u00103\u001a\u0004\bR\u00109R\u001b\u0010V\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bT\u00103\u001a\u0004\bU\u00109¨\u0006W"}, d2 = {"Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/driver/TaoLiveKtCommentDataCenter;", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/comment/ITaoLiveKtCommentDataCenter;", "<init>", "()V", "", Constants.Name.MAX_LENGTH, "Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/builder/TaoLiveKtCommentQueue;", "mkCommentQueue", "(I)Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/builder/TaoLiveKtCommentQueue;", "Ltb/xhv;", "clearAll", "Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/comment/TaoLiveKtCommentEntity;", "readBottom", "()Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/comment/TaoLiveKtCommentEntity;", "readAnchorResponse", "readAnchorTopMsg", "cleanCritical", "readEveryBodySay", "readWarning", "", "", "", "originData", "Ljava/util/Map;", "getOriginData", "()Ljava/util/Map;", "setOriginData", "(Ljava/util/Map;)V", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/comment/ITaoLiveKtCommentShowPriority;", "priority", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/comment/ITaoLiveKtCommentShowPriority;", "getPriority", "()Lcom/taobao/kmp/live/liveBizComponent/service/biz/comment/ITaoLiveKtCommentShowPriority;", "setPriority", "(Lcom/taobao/kmp/live/liveBizComponent/service/biz/comment/ITaoLiveKtCommentShowPriority;)V", "", "disableCommentButton", "Z", "getDisableCommentButton", "()Z", "setDisableCommentButton", "(Z)V", "Ltb/czs;", "detailModel", "Ltb/czs;", "getDetailModel", "()Ltb/czs;", "setDetailModel", "(Ltb/czs;)V", "Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/builder/TaoLiveKtAtmosphereQueue;", "enterAtmospheres$delegate", "Ltb/njg;", "getEnterAtmospheres", "()Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/builder/TaoLiveKtAtmosphereQueue;", "enterAtmospheres", "normals$delegate", "getNormals", "()Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/builder/TaoLiveKtCommentQueue;", "normals", "bottoms$delegate", "getBottoms", "bottoms", "anchorResponses$delegate", "getAnchorResponses", "anchorResponses", "anchorTopMessages$delegate", "getAnchorTopMessages", "anchorTopMessages", "normalResponses$delegate", "getNormalResponses", "normalResponses", "hotSales$delegate", "getHotSales", "hotSales", "Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/comment/TaoLiveKtCommentCriticalModel;", "criticalModel", "Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/comment/TaoLiveKtCommentCriticalModel;", "getCriticalModel", "()Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/comment/TaoLiveKtCommentCriticalModel;", "setCriticalModel", "(Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/comment/TaoLiveKtCommentCriticalModel;)V", "everyBodySays$delegate", "getEveryBodySays", "everyBodySays", "warnings$delegate", "getWarnings", "warnings", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtCommentDataCenter implements ITaoLiveKtCommentDataCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final njg anchorResponses$delegate;
    private final njg anchorTopMessages$delegate;
    private final njg bottoms$delegate;
    private TaoLiveKtCommentCriticalModel criticalModel;
    private czs detailModel;
    private boolean disableCommentButton;
    private final njg enterAtmospheres$delegate;
    private final njg everyBodySays$delegate;
    private final njg hotSales$delegate;
    private final njg normalResponses$delegate;
    private final njg normals$delegate;
    private Map<String, ? extends Object> originData;
    private ITaoLiveKtCommentShowPriority priority = new TaoLiveKtCommentShowPriority();
    private final njg warnings$delegate;

    static {
        t2o.a(1010827313);
        t2o.a(1003487343);
    }

    public TaoLiveKtCommentDataCenter() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.enterAtmospheres$delegate = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.vxs
            @Override // tb.d1a
            public final Object invoke() {
                TaoLiveKtAtmosphereQueue enterAtmospheres_delegate$lambda$0;
                enterAtmospheres_delegate$lambda$0 = TaoLiveKtCommentDataCenter.enterAtmospheres_delegate$lambda$0();
                return enterAtmospheres_delegate$lambda$0;
            }
        });
        this.normals$delegate = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.xxs
            @Override // tb.d1a
            public final Object invoke() {
                TaoLiveKtCommentQueue normals_delegate$lambda$1;
                normals_delegate$lambda$1 = TaoLiveKtCommentDataCenter.normals_delegate$lambda$1(TaoLiveKtCommentDataCenter.this);
                return normals_delegate$lambda$1;
            }
        });
        this.bottoms$delegate = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.zxs
            @Override // tb.d1a
            public final Object invoke() {
                TaoLiveKtCommentQueue bottoms_delegate$lambda$2;
                bottoms_delegate$lambda$2 = TaoLiveKtCommentDataCenter.bottoms_delegate$lambda$2(TaoLiveKtCommentDataCenter.this);
                return bottoms_delegate$lambda$2;
            }
        });
        this.anchorResponses$delegate = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.bys
            @Override // tb.d1a
            public final Object invoke() {
                TaoLiveKtCommentQueue anchorResponses_delegate$lambda$3;
                anchorResponses_delegate$lambda$3 = TaoLiveKtCommentDataCenter.anchorResponses_delegate$lambda$3(TaoLiveKtCommentDataCenter.this);
                return anchorResponses_delegate$lambda$3;
            }
        });
        this.anchorTopMessages$delegate = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.dys
            @Override // tb.d1a
            public final Object invoke() {
                TaoLiveKtCommentQueue anchorTopMessages_delegate$lambda$4;
                anchorTopMessages_delegate$lambda$4 = TaoLiveKtCommentDataCenter.anchorTopMessages_delegate$lambda$4(TaoLiveKtCommentDataCenter.this);
                return anchorTopMessages_delegate$lambda$4;
            }
        });
        this.normalResponses$delegate = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.fys
            @Override // tb.d1a
            public final Object invoke() {
                TaoLiveKtCommentQueue normalResponses_delegate$lambda$5;
                normalResponses_delegate$lambda$5 = TaoLiveKtCommentDataCenter.normalResponses_delegate$lambda$5(TaoLiveKtCommentDataCenter.this);
                return normalResponses_delegate$lambda$5;
            }
        });
        this.hotSales$delegate = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.hys
            @Override // tb.d1a
            public final Object invoke() {
                TaoLiveKtCommentQueue hotSales_delegate$lambda$6;
                hotSales_delegate$lambda$6 = TaoLiveKtCommentDataCenter.hotSales_delegate$lambda$6(TaoLiveKtCommentDataCenter.this);
                return hotSales_delegate$lambda$6;
            }
        });
        this.everyBodySays$delegate = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.jys
            @Override // tb.d1a
            public final Object invoke() {
                TaoLiveKtCommentQueue everyBodySays_delegate$lambda$7;
                everyBodySays_delegate$lambda$7 = TaoLiveKtCommentDataCenter.everyBodySays_delegate$lambda$7(TaoLiveKtCommentDataCenter.this);
                return everyBodySays_delegate$lambda$7;
            }
        });
        this.warnings$delegate = a.a(lazyThreadSafetyMode, new d1a() { // from class: tb.lys
            @Override // tb.d1a
            public final Object invoke() {
                TaoLiveKtCommentQueue warnings_delegate$lambda$8;
                warnings_delegate$lambda$8 = TaoLiveKtCommentDataCenter.warnings_delegate$lambda$8(TaoLiveKtCommentDataCenter.this);
                return warnings_delegate$lambda$8;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TaoLiveKtCommentQueue anchorResponses_delegate$lambda$3(TaoLiveKtCommentDataCenter taoLiveKtCommentDataCenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentQueue) ipChange.ipc$dispatch("af8c655b", new Object[]{taoLiveKtCommentDataCenter});
        }
        return taoLiveKtCommentDataCenter.mkCommentQueue(20);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TaoLiveKtCommentQueue anchorTopMessages_delegate$lambda$4(TaoLiveKtCommentDataCenter taoLiveKtCommentDataCenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentQueue) ipChange.ipc$dispatch("b0263a6b", new Object[]{taoLiveKtCommentDataCenter});
        }
        return taoLiveKtCommentDataCenter.mkCommentQueue(20);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TaoLiveKtCommentQueue bottoms_delegate$lambda$2(TaoLiveKtCommentDataCenter taoLiveKtCommentDataCenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentQueue) ipChange.ipc$dispatch("f62532d1", new Object[]{taoLiveKtCommentDataCenter});
        }
        return taoLiveKtCommentDataCenter.mkCommentQueue(30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TaoLiveKtAtmosphereQueue enterAtmospheres_delegate$lambda$0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtAtmosphereQueue) ipChange.ipc$dispatch("d5833dc3", new Object[0]);
        }
        return new TaoLiveKtAtmosphereQueue(50);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TaoLiveKtCommentQueue everyBodySays_delegate$lambda$7(TaoLiveKtCommentDataCenter taoLiveKtCommentDataCenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentQueue) ipChange.ipc$dispatch("cc63870f", new Object[]{taoLiveKtCommentDataCenter});
        }
        return taoLiveKtCommentDataCenter.mkCommentQueue(20);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TaoLiveKtCommentQueue hotSales_delegate$lambda$6(TaoLiveKtCommentDataCenter taoLiveKtCommentDataCenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentQueue) ipChange.ipc$dispatch("d274f1d6", new Object[]{taoLiveKtCommentDataCenter});
        }
        return taoLiveKtCommentDataCenter.mkCommentQueue(20);
    }

    private final TaoLiveKtCommentQueue mkCommentQueue(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentQueue) ipChange.ipc$dispatch("612f2ab", new Object[]{this, new Integer(i)});
        }
        TaoLiveKtCommentQueue taoLiveKtCommentQueue = new TaoLiveKtCommentQueue(i);
        taoLiveKtCommentQueue.setDetailModel(this.detailModel);
        taoLiveKtCommentQueue.setDisableCommentButton(this.disableCommentButton);
        return taoLiveKtCommentQueue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TaoLiveKtCommentQueue normalResponses_delegate$lambda$5(TaoLiveKtCommentDataCenter taoLiveKtCommentDataCenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentQueue) ipChange.ipc$dispatch("71ff0cb", new Object[]{taoLiveKtCommentDataCenter});
        }
        return taoLiveKtCommentDataCenter.mkCommentQueue(20);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TaoLiveKtCommentQueue normals_delegate$lambda$1(TaoLiveKtCommentDataCenter taoLiveKtCommentDataCenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentQueue) ipChange.ipc$dispatch("e8ac546e", new Object[]{taoLiveKtCommentDataCenter});
        }
        return taoLiveKtCommentDataCenter.mkCommentQueue(100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TaoLiveKtCommentQueue warnings_delegate$lambda$8(TaoLiveKtCommentDataCenter taoLiveKtCommentDataCenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentQueue) ipChange.ipc$dispatch("cbdc797c", new Object[]{taoLiveKtCommentDataCenter});
        }
        return taoLiveKtCommentDataCenter.mkCommentQueue(20);
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentDataCenter
    public void cleanCritical() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e8af98f", new Object[]{this});
            return;
        }
        getEveryBodySays().clearComment$tao_live_crossplatform_foundation_release();
        this.criticalModel = null;
    }

    public final void clearAll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c823e69b", new Object[]{this});
            return;
        }
        getNormals().clearComment$tao_live_crossplatform_foundation_release();
        getBottoms().clearComment$tao_live_crossplatform_foundation_release();
        getAnchorResponses().clearComment$tao_live_crossplatform_foundation_release();
        getAnchorTopMessages().clearComment$tao_live_crossplatform_foundation_release();
        getHotSales().clearComment$tao_live_crossplatform_foundation_release();
        getEveryBodySays().clearComment$tao_live_crossplatform_foundation_release();
        getWarnings().clearComment$tao_live_crossplatform_foundation_release();
        getEnterAtmospheres().clearComment$tao_live_crossplatform_foundation_release();
    }

    public final TaoLiveKtCommentQueue getBottoms() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentQueue) ipChange.ipc$dispatch("37802bf8", new Object[]{this});
        }
        return (TaoLiveKtCommentQueue) this.bottoms$delegate.getValue();
    }

    public final TaoLiveKtCommentCriticalModel getCriticalModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentCriticalModel) ipChange.ipc$dispatch("f51d23a7", new Object[]{this});
        }
        return this.criticalModel;
    }

    public final czs getDetailModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (czs) ipChange.ipc$dispatch("d902976d", new Object[]{this});
        }
        return this.detailModel;
    }

    public final boolean getDisableCommentButton() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c13dea", new Object[]{this})).booleanValue();
        }
        return this.disableCommentButton;
    }

    public final TaoLiveKtCommentQueue getEveryBodySays() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentQueue) ipChange.ipc$dispatch("f99d2635", new Object[]{this});
        }
        return (TaoLiveKtCommentQueue) this.everyBodySays$delegate.getValue();
    }

    public final TaoLiveKtCommentQueue getHotSales() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentQueue) ipChange.ipc$dispatch("c807643b", new Object[]{this});
        }
        return (TaoLiveKtCommentQueue) this.hotSales$delegate.getValue();
    }

    public final TaoLiveKtCommentQueue getNormalResponses() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentQueue) ipChange.ipc$dispatch("220556fb", new Object[]{this});
        }
        return (TaoLiveKtCommentQueue) this.normalResponses$delegate.getValue();
    }

    public final TaoLiveKtCommentQueue getNormals() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentQueue) ipChange.ipc$dispatch("21a832bc", new Object[]{this});
        }
        return (TaoLiveKtCommentQueue) this.normals$delegate.getValue();
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.base.ITaoLiveKtOutViewModel
    public Map<String, Object> getOriginData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("830078e2", new Object[]{this});
        }
        return this.originData;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentDataCenter
    public ITaoLiveKtCommentShowPriority getPriority() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITaoLiveKtCommentShowPriority) ipChange.ipc$dispatch("47399482", new Object[]{this});
        }
        return this.priority;
    }

    public final TaoLiveKtCommentQueue getWarnings() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentQueue) ipChange.ipc$dispatch("5826a7d3", new Object[]{this});
        }
        return (TaoLiveKtCommentQueue) this.warnings$delegate.getValue();
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentDataCenter
    public TaoLiveKtCommentEntity readAnchorResponse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentEntity) ipChange.ipc$dispatch("1672654a", new Object[]{this});
        }
        TaoLiveKtCommentEntity readComment = getAnchorResponses().readComment();
        if (readComment == null) {
            return null;
        }
        readComment.setDisappearTime(10000L);
        return readComment;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentDataCenter
    public TaoLiveKtCommentEntity readAnchorTopMsg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentEntity) ipChange.ipc$dispatch("2cde573f", new Object[]{this});
        }
        TaoLiveKtCommentEntity readComment = getAnchorTopMessages().readComment();
        if (readComment == null) {
            return null;
        }
        readComment.setDisappearTime(15000L);
        return readComment;
    }

    public final TaoLiveKtCommentEntity readBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentEntity) ipChange.ipc$dispatch("f98b24d5", new Object[]{this});
        }
        TaoLiveKtCommentEntity readComment = getBottoms().readComment();
        if (readComment == null) {
            return null;
        }
        readComment.setDisappearTime(3000L);
        return readComment;
    }

    public final TaoLiveKtCommentEntity readEveryBodySay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentEntity) ipChange.ipc$dispatch("7f977592", new Object[]{this});
        }
        TaoLiveKtCommentEntity readComment = getEveryBodySays().readComment();
        if (readComment == null) {
            return null;
        }
        readComment.setDisappearTime(5000L);
        return readComment;
    }

    public final void setCriticalModel(TaoLiveKtCommentCriticalModel taoLiveKtCommentCriticalModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b13cb72d", new Object[]{this, taoLiveKtCommentCriticalModel});
        } else {
            this.criticalModel = taoLiveKtCommentCriticalModel;
        }
    }

    public final void setDetailModel(czs czsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc2277fd", new Object[]{this, czsVar});
        } else {
            this.detailModel = czsVar;
        }
    }

    public final void setDisableCommentButton(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd338a22", new Object[]{this, new Boolean(z)});
        } else {
            this.disableCommentButton = z;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.base.ITaoLiveKtOutViewModel
    public void setOriginData(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("371348ec", new Object[]{this, map});
        } else {
            this.originData = map;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentDataCenter
    public void setPriority(ITaoLiveKtCommentShowPriority iTaoLiveKtCommentShowPriority) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e85a19a", new Object[]{this, iTaoLiveKtCommentShowPriority});
            return;
        }
        ckf.g(iTaoLiveKtCommentShowPriority, "<set-?>");
        this.priority = iTaoLiveKtCommentShowPriority;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentDataCenter
    public TaoLiveKtCommentQueue getAnchorResponses() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaoLiveKtCommentQueue) ipChange.ipc$dispatch("d041e9ed", new Object[]{this}) : (TaoLiveKtCommentQueue) this.anchorResponses$delegate.getValue();
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentDataCenter
    public TaoLiveKtCommentQueue getAnchorTopMessages() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaoLiveKtCommentQueue) ipChange.ipc$dispatch("a103219c", new Object[]{this}) : (TaoLiveKtCommentQueue) this.anchorTopMessages$delegate.getValue();
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentDataCenter
    public TaoLiveKtAtmosphereQueue getEnterAtmospheres() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaoLiveKtAtmosphereQueue) ipChange.ipc$dispatch("53147e00", new Object[]{this}) : (TaoLiveKtAtmosphereQueue) this.enterAtmospheres$delegate.getValue();
    }

    public final TaoLiveKtCommentEntity readWarning() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentEntity) ipChange.ipc$dispatch("85dba2b0", new Object[]{this});
        }
        TaoLiveKtCommentEntity readComment = getWarnings().readComment();
        Map<String, Object> map = null;
        if (readComment == null) {
            return null;
        }
        Map<String, Object> dxData = readComment.getDxData();
        if (dxData != null) {
            map = dxData;
        }
        KMPJsonObject kMPJsonObject = new KMPJsonObject(map);
        Long l = kMPJsonObject.getLong(Constants.Name.INTERVAL);
        long longValue = l != null ? l.longValue() : 0L;
        Boolean bool = kMPJsonObject.getBoolean("permanent");
        if (bool != null) {
            z = bool.booleanValue();
        }
        if (z) {
            readComment.setDisappearTime(longValue * 1000);
        }
        return readComment;
    }
}
