package com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.receiver;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentCriticalModel;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentEntity;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.enter.TaoLiveKtAtmosphereType;
import com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtUtManager;
import com.taobao.kmp.live.liveBizComponent.service.base.TaoLiveKtMsgSubType;
import com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent;
import com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.builder.TaoLiveKtAtmosphereQueue;
import com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.builder.TaoLiveKtCommentConfigBiz;
import com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.builder.TaoLiveKtCommentQueue;
import com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.driver.TaoLiveKtCommentDataCenter;
import com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.enter.TaoLiveKtEnterAtmosphereEntity;
import com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.model.TaoLiveKtCommentDxBizType;
import com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.model.TaoLiveKtCommentDxModel;
import com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.model.TaoLiveKtCommentDxShowType;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJSONUtils_androidKt;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import com.taobao.uniinfra_kmp.common_utils.serialization.a;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import tb.ckf;
import tb.czs;
import tb.dun;
import tb.e3t;
import tb.exs;
import tb.h2t;
import tb.l1t;
import tb.mhr;
import tb.ns3;
import tb.pus;
import tb.rxs;
import tb.t2o;
import tb.txs;
import tb.zys;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ/\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\b2\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\nJ'\u0010\u0016\u001a\u00020\b2\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\nJ'\u0010\u0017\u001a\u00020\b2\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\nJ'\u0010\u0018\u001a\u00020\b2\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\nJ/\u0010\u0019\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u000eJ%\u0010\u001a\u001a\u00020\b2\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0004¢\u0006\u0004\b\u001a\u0010\nR$\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010#\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010*\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u0010-¨\u00064"}, d2 = {"Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/receiver/TaoLiveKtCommentRev;", "Lcom/taobao/live/liveroom/liveBizComponent/ktManager/base/TaoLiveKtComponent;", "<init>", "()V", "", "", "", "data", "Ltb/xhv;", "handleEnterTrade", "(Ljava/util/Map;)V", "", "subType", "handleEnterAtmosphere", "(JLjava/util/Map;)V", "Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/model/TaoLiveKtCommentDxModel;", "model", "Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/comment/TaoLiveKtCommentEntity;", "entity", "handleAnchorResponse", "(Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/model/TaoLiveKtCommentDxModel;Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/comment/TaoLiveKtCommentEntity;)V", "handleNormalComment", "handleAddOneOpenConfig", "handleCommentCritical", "handleDianTaoSpecial", "didRevLivePowerMsg", "handleCommonBizComment", "Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/driver/TaoLiveKtCommentDataCenter;", "dataCenter", "Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/driver/TaoLiveKtCommentDataCenter;", "getDataCenter", "()Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/driver/TaoLiveKtCommentDataCenter;", "setDataCenter", "(Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/driver/TaoLiveKtCommentDataCenter;)V", "Ltb/txs;", "openConfig", "Ltb/txs;", "getOpenConfig", "()Ltb/txs;", "setOpenConfig", "(Ltb/txs;)V", "", "atmospherePaused", "Z", "getAtmospherePaused", "()Z", "setAtmospherePaused", "(Z)V", "TaoLiveKtCommentRevTag", "Ljava/lang/String;", "getEnableEnterAtmosphere", "enableEnterAtmosphere", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtCommentRev extends TaoLiveKtComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String TaoLiveKtCommentRevTag = "TaoLiveKtCommentRev";
    private boolean atmospherePaused;
    private TaoLiveKtCommentDataCenter dataCenter;
    private txs openConfig;

    static {
        t2o.a(1010827364);
    }

    private final boolean getEnableEnterAtmosphere() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd5a4c6c", new Object[]{this})).booleanValue();
        }
        txs txsVar = this.openConfig;
        if (txsVar == null || txsVar.a(TaoLiveKtCommentConfigBiz.EnterAtmosphere) || this.atmospherePaused) {
            return false;
        }
        return true;
    }

    private final void handleAnchorResponse(TaoLiveKtCommentDxModel taoLiveKtCommentDxModel, TaoLiveKtCommentEntity taoLiveKtCommentEntity) {
        TaoLiveKtCommentQueue anchorResponses;
        TaoLiveKtCommentQueue normalResponses;
        TaoLiveKtCommentDataCenter taoLiveKtCommentDataCenter;
        TaoLiveKtCommentQueue anchorResponses2;
        TaoLiveKtCommentDataCenter taoLiveKtCommentDataCenter2;
        TaoLiveKtCommentQueue anchorResponses3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2ccfbf", new Object[]{this, taoLiveKtCommentDxModel, taoLiveKtCommentEntity});
        } else if (!h2t.INSTANCE.l() || !ckf.b(taoLiveKtCommentDxModel.getBizType(), TaoLiveKtCommentDxBizType.LiveAiInteractive.getValue())) {
            if (ckf.b(taoLiveKtCommentDxModel.getBizType(), TaoLiveKtCommentDxBizType.LiveCopilot.getValue())) {
                txs txsVar = this.openConfig;
                if (txsVar != null && !txsVar.a(TaoLiveKtCommentConfigBiz.AIResponse) && (taoLiveKtCommentDataCenter = this.dataCenter) != null && (anchorResponses2 = taoLiveKtCommentDataCenter.getAnchorResponses()) != null) {
                    anchorResponses2.writeComment(taoLiveKtCommentEntity);
                }
            } else if (taoLiveKtCommentDxModel.isResponseOther()) {
                TaoLiveKtCommentDataCenter taoLiveKtCommentDataCenter3 = this.dataCenter;
                if (taoLiveKtCommentDataCenter3 != null && (normalResponses = taoLiveKtCommentDataCenter3.getNormalResponses()) != null) {
                    normalResponses.writeComment(taoLiveKtCommentEntity);
                }
            } else {
                TaoLiveKtCommentDataCenter taoLiveKtCommentDataCenter4 = this.dataCenter;
                if (taoLiveKtCommentDataCenter4 != null && (anchorResponses = taoLiveKtCommentDataCenter4.getAnchorResponses()) != null) {
                    anchorResponses.writeComment(taoLiveKtCommentEntity);
                }
            }
        } else if (zys.INSTANCE.b() && (taoLiveKtCommentDataCenter2 = this.dataCenter) != null && (anchorResponses3 = taoLiveKtCommentDataCenter2.getAnchorResponses()) != null) {
            anchorResponses3.writeComment(taoLiveKtCommentEntity);
        }
    }

    private final void handleDianTaoSpecial(Map<String, ? extends Object> map) {
        TaoLiveKtCommentQueue normals;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8f0e06d", new Object[]{this, map});
        } else if (map != null && !map.isEmpty()) {
            TaoLiveKtCommentEntity a2 = rxs.INSTANCE.a(map);
            TaoLiveKtCommentDataCenter taoLiveKtCommentDataCenter = this.dataCenter;
            if (taoLiveKtCommentDataCenter != null && (normals = taoLiveKtCommentDataCenter.getNormals()) != null) {
                normals.writeComment(a2);
            }
        }
    }

    private final void handleEnterAtmosphere(long j, Map<String, ? extends Object> map) {
        TaoLiveKtAtmosphereQueue enterAtmospheres;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afd0449a", new Object[]{this, new Long(j), map});
        } else if (getEnableEnterAtmosphere() && map != null && !map.isEmpty()) {
            TaoLiveKtAtmosphereType taoLiveKtAtmosphereType = TaoLiveKtAtmosphereType.Enter;
            if (j == TaoLiveKtMsgSubType.EnterDXAtmosphere.getValue()) {
                taoLiveKtAtmosphereType = TaoLiveKtAtmosphereType.DXAtmosphere;
            }
            TaoLiveKtEnterAtmosphereEntity taoLiveKtEnterAtmosphereEntity = new TaoLiveKtEnterAtmosphereEntity();
            taoLiveKtEnterAtmosphereEntity.setAtmosphereType(taoLiveKtAtmosphereType);
            taoLiveKtEnterAtmosphereEntity.setData(map);
            TaoLiveKtCommentDataCenter taoLiveKtCommentDataCenter = this.dataCenter;
            if (taoLiveKtCommentDataCenter != null && (enterAtmospheres = taoLiveKtCommentDataCenter.getEnterAtmospheres()) != null) {
                enterAtmospheres.writeAtmosphere(taoLiveKtEnterAtmosphereEntity);
            }
        }
    }

    private final void handleEnterTrade(Map<String, ? extends Object> map) {
        Boolean bool;
        TaoLiveKtCommentDataCenter taoLiveKtCommentDataCenter;
        TaoLiveKtAtmosphereQueue enterAtmospheres;
        TaoLiveKtAtmosphereQueue enterAtmospheres2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("121ab9ea", new Object[]{this, map});
        } else if (getEnableEnterAtmosphere() && map != null && !map.isEmpty()) {
            TaoLiveKtEnterAtmosphereEntity taoLiveKtEnterAtmosphereEntity = new TaoLiveKtEnterAtmosphereEntity();
            taoLiveKtEnterAtmosphereEntity.setAtmosphereType(TaoLiveKtAtmosphereType.Trade);
            taoLiveKtEnterAtmosphereEntity.setData(map);
            TaoLiveKtCommentDataCenter taoLiveKtCommentDataCenter2 = this.dataCenter;
            if (taoLiveKtCommentDataCenter2 == null || (enterAtmospheres2 = taoLiveKtCommentDataCenter2.getEnterAtmospheres()) == null) {
                bool = null;
            } else {
                bool = Boolean.valueOf(enterAtmospheres2.findMerged(taoLiveKtEnterAtmosphereEntity.getAtmosphereType()));
            }
            if (ckf.b(bool, Boolean.FALSE) && (taoLiveKtCommentDataCenter = this.dataCenter) != null && (enterAtmospheres = taoLiveKtCommentDataCenter.getEnterAtmospheres()) != null) {
                enterAtmospheres.writeAtmosphere(taoLiveKtEnterAtmosphereEntity);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void handleNormalComment(java.util.Map<java.lang.String, ? extends java.lang.Object> r8) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.receiver.TaoLiveKtCommentRev.handleNormalComment(java.util.Map):void");
    }

    public static /* synthetic */ Object ipc$super(TaoLiveKtCommentRev taoLiveKtCommentRev, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/liveroom/liveBizComponent/leftBottomGroup/receiver/TaoLiveKtCommentRev");
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtDataServer
    public void didRevLivePowerMsg(long j, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d149c7d4", new Object[]{this, new Long(j), map});
        } else if (j == TaoLiveKtMsgSubType.EnterDXAtmosphere.getValue()) {
            handleEnterAtmosphere(j, map);
        } else if (j == TaoLiveKtMsgSubType.EnterLiveRoom.getValue()) {
            if (zys.INSTANCE.c()) {
                handleEnterAtmosphere(j, map);
            }
        } else if (j == TaoLiveKtMsgSubType.EnterDTRoom.getValue()) {
            if (zys.INSTANCE.b()) {
                handleEnterAtmosphere(j, map);
            }
        } else if (j == TaoLiveKtMsgSubType.EnterTradeAtmosphere.getValue()) {
            if (zys.INSTANCE.b()) {
                handleEnterTrade(map);
            }
        } else if (j == TaoLiveKtMsgSubType.System.getValue() || j == TaoLiveKtMsgSubType.Normal.getValue() || j == TaoLiveKtMsgSubType.UserAction.getValue() || j == TaoLiveKtMsgSubType.Anchor.getValue()) {
            handleNormalComment(map);
        } else if (j == TaoLiveKtMsgSubType.CommonBiz.getValue()) {
            handleCommonBizComment(map);
        } else if (j == TaoLiveKtMsgSubType.CommentCritical.getValue()) {
            handleCommentCritical(map);
        } else if (j == TaoLiveKtMsgSubType.DTSpecialMsg.getValue()) {
            handleDianTaoSpecial(map);
        } else if (j == TaoLiveKtMsgSubType.AddOneOpen.getValue()) {
            handleAddOneOpenConfig(map);
        }
    }

    public final boolean getAtmospherePaused() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ee549f1", new Object[]{this})).booleanValue();
        }
        return this.atmospherePaused;
    }

    public final TaoLiveKtCommentDataCenter getDataCenter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentDataCenter) ipChange.ipc$dispatch("55f41722", new Object[]{this});
        }
        return this.dataCenter;
    }

    public final txs getOpenConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (txs) ipChange.ipc$dispatch("36634f9b", new Object[]{this});
        }
        return this.openConfig;
    }

    public final void setAtmospherePaused(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd758fb", new Object[]{this, new Boolean(z)});
        } else {
            this.atmospherePaused = z;
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

    public final void setOpenConfig(txs txsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa4c11c3", new Object[]{this, txsVar});
        } else {
            this.openConfig = txsVar;
        }
    }

    private final void handleAddOneOpenConfig(Map<String, ? extends Object> map) {
        czs a2;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c2ff25", new Object[]{this, map});
            return;
        }
        if (!(map instanceof Object)) {
            map = null;
        }
        Boolean bool = new KMPJsonObject(map).getBoolean("switchStatus");
        if (bool != null) {
            z = bool.booleanValue();
        }
        exs bizContext = getBizContext();
        if (bizContext != null && (a2 = bizContext.a()) != null) {
            a2.F(z);
        }
    }

    private final void handleCommentCritical(Map<String, ? extends Object> map) {
        ITaoLiveKtUtManager d;
        czs a2;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5307c88", new Object[]{this, map});
            return;
        }
        Serializable serializable = null;
        if (!(map instanceof Object)) {
            map = null;
        }
        KMPJsonObject jsonObject = new KMPJsonObject(map).getJsonObject("data");
        Map<String, Object> map2 = jsonObject != null ? jsonObject.toMap() : null;
        l1t l1tVar = l1t.INSTANCE;
        String str = "";
        if (map2 != null) {
            try {
                serializable = KMPJSONUtils_androidKt.decodeFromJsonObject(a.Companion, new KMPJsonObject(map2), dun.b(TaoLiveKtCommentCriticalModel.class));
            } catch (Exception e) {
                pus.INSTANCE.f(String.valueOf(((ns3) dun.b(l1tVar.getClass())).getSimpleName()), str, "modelFromMap === " + e.getMessage() + ", data === " + map2);
            }
        }
        TaoLiveKtCommentCriticalModel taoLiveKtCommentCriticalModel = (TaoLiveKtCommentCriticalModel) serializable;
        if (taoLiveKtCommentCriticalModel != null) {
            exs bizContext = getBizContext();
            if (!(bizContext == null || (a2 = bizContext.a()) == null)) {
                z = a2.d();
            }
            if (!e3t.INSTANCE.w() || z) {
                taoLiveKtCommentCriticalModel.setCloseAddOneComment(true);
            }
            TaoLiveKtCommentDataCenter taoLiveKtCommentDataCenter = this.dataCenter;
            if (taoLiveKtCommentDataCenter != null) {
                taoLiveKtCommentDataCenter.setCriticalModel(taoLiveKtCommentCriticalModel);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String content = taoLiveKtCommentCriticalModel.getContent();
            if (content != null) {
                str = content;
            }
            linkedHashMap.put("content", str);
            exs bizContext2 = getBizContext();
            if (bizContext2 != null && (d = bizContext2.d()) != null) {
                ITaoLiveKtUtManager.a.a(d, "Comment_HotWordShowup", null, linkedHashMap, 2, null);
            }
        }
    }

    public final void handleCommonBizComment(Map<String, ? extends Object> map) {
        TaoLiveKtCommentDataCenter taoLiveKtCommentDataCenter;
        TaoLiveKtCommentQueue anchorTopMessages;
        TaoLiveKtCommentQueue warnings;
        TaoLiveKtCommentQueue bottoms;
        TaoLiveKtCommentQueue normals;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b30e95f", new Object[]{this, map});
            return;
        }
        mhr.b0(this.TaoLiveKtCommentRevTag, "handleCommonBizComment msg: " + l1t.INSTANCE.c(map));
        String str = "";
        Serializable serializable = null;
        if (map != null) {
            try {
                serializable = KMPJSONUtils_androidKt.decodeFromJsonObject(a.Companion, new KMPJsonObject(map instanceof Object ? map : null), dun.b(TaoLiveKtCommentDxModel.class));
            } catch (Exception e) {
                pus pusVar = pus.INSTANCE;
                String valueOf = String.valueOf(((ns3) dun.b(l1t.class)).getSimpleName());
                pusVar.f(valueOf, str, "modelFromMap === " + e.getMessage() + ", data === " + map);
            }
        }
        TaoLiveKtCommentDxModel taoLiveKtCommentDxModel = (TaoLiveKtCommentDxModel) serializable;
        if (taoLiveKtCommentDxModel != null) {
            taoLiveKtCommentDxModel.modifyDXBizType();
            TaoLiveKtCommentEntity d = rxs.INSTANCE.d(taoLiveKtCommentDxModel);
            String showType = taoLiveKtCommentDxModel.getShowType();
            if (showType != null) {
                str = showType;
            }
            if (ckf.b(str, TaoLiveKtCommentDxShowType.Normal.getValue())) {
                TaoLiveKtCommentDataCenter taoLiveKtCommentDataCenter2 = this.dataCenter;
                if (!(taoLiveKtCommentDataCenter2 == null || (normals = taoLiveKtCommentDataCenter2.getNormals()) == null)) {
                    normals.writeComment(d);
                }
            } else if (ckf.b(str, TaoLiveKtCommentDxShowType.Bottom.getValue())) {
                TaoLiveKtCommentDataCenter taoLiveKtCommentDataCenter3 = this.dataCenter;
                if (!(taoLiveKtCommentDataCenter3 == null || (bottoms = taoLiveKtCommentDataCenter3.getBottoms()) == null)) {
                    bottoms.writeComment(d);
                }
            } else if (ckf.b(str, TaoLiveKtCommentDxShowType.WarnTips.getValue())) {
                TaoLiveKtCommentDataCenter taoLiveKtCommentDataCenter4 = this.dataCenter;
                if (!(taoLiveKtCommentDataCenter4 == null || (warnings = taoLiveKtCommentDataCenter4.getWarnings()) == null)) {
                    warnings.writeComment(d);
                }
            } else if (ckf.b(str, TaoLiveKtCommentDxShowType.AnchorResponse.getValue())) {
                handleAnchorResponse(taoLiveKtCommentDxModel, d);
            }
            if (taoLiveKtCommentDxModel.isTopSelect() && (taoLiveKtCommentDataCenter = this.dataCenter) != null && (anchorTopMessages = taoLiveKtCommentDataCenter.getAnchorTopMessages()) != null) {
                anchorTopMessages.writeComment(d);
            }
        }
    }
}
