package com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.enter;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentBadgeModel;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.enter.ITaoLiveKtEnterAtmosphereEntity;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.enter.TaoLiveKtAtmosphereType;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import tb.ckf;
import tb.h2t;
import tb.ksl;
import tb.t2o;
import tb.vaj;
import tb.yh6;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000b\u001a\u00020\b2\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\nJ'\u0010\f\u001a\u00020\b2\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\f\u0010\nJ\u0019\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\r\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0003R2\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\nR$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR2\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\nR$\u0010!\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\"\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&R$\u0010)\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b)\u0010\"\u001a\u0004\b*\u0010$\"\u0004\b+\u0010&R\"\u0010-\u001a\u00020,8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R,\u00104\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u0001038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R*\u0010;\u001a\n\u0012\u0004\u0012\u00020:\u0018\u0001038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b;\u00105\u001a\u0004\b<\u00107\"\u0004\b=\u00109R$\u0010>\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b>\u0010\"\u001a\u0004\b?\u0010$\"\u0004\b@\u0010&R$\u0010A\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bA\u0010\"\u001a\u0004\bB\u0010$\"\u0004\bC\u0010&R2\u0010D\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bD\u0010\u0014\u001a\u0004\bE\u0010\u0016\"\u0004\bF\u0010\nR\"\u0010H\u001a\u00020G8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010O\u001a\u00020N8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0018\u0010V\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\"\u0010X\u001a\u00020,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010.\u001a\u0004\bY\u00100\"\u0004\bZ\u00102R&\u0010\\\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010\u0014¨\u0006]"}, d2 = {"Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/enter/TaoLiveKtEnterAtmosphereEntity;", "Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/enter/ITaoLiveKtEnterAtmosphereEntity;", "<init>", "()V", "", "", "", "data", "Ltb/xhv;", "mkEnterAtmosphereWithData", "(Ljava/util/Map;)V", "mkTradeAtmosphereWithData", "mkDXAtmosphereWithData", "text", "formatName", "(Ljava/lang/String;)Ljava/lang/String;", "content", "formatContent", "mkDataEntity", "originData", "Ljava/util/Map;", "getOriginData", "()Ljava/util/Map;", "setOriginData", "Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/enter/TaoLiveKtAtmosphereType;", "atmosphereType", "Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/enter/TaoLiveKtAtmosphereType;", "getAtmosphereType", "()Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/enter/TaoLiveKtAtmosphereType;", "setAtmosphereType", "(Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/enter/TaoLiveKtAtmosphereType;)V", "getData", "setData", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getContent", "setContent", vaj.KEY_BG_COLOR, "getBgColor", "setBgColor", "", "fansLevel", TLogTracker.LEVEL_INFO, "getFansLevel", "()I", "setFansLevel", "(I)V", "", "originBadgeInfos", "Ljava/util/List;", "getOriginBadgeInfos", "()Ljava/util/List;", "setOriginBadgeInfos", "(Ljava/util/List;)V", "Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/comment/TaoLiveKtCommentBadgeModel;", "badgeInfos", "getBadgeInfos", "setBadgeInfos", "bizType", "getBizType", "setBizType", yh6.CONFIG_KEY_TEMPLATE_NAME, "getTemplateName", "setTemplateName", ksl.PARSER_KEY_DX_DATA, "getDxData", "setDxData", "", "canInterrupt", "Z", "getCanInterrupt", "()Z", "setCanInterrupt", "(Z)V", "", "disappearTime", "J", "getDisappearTime", "()J", "setDisappearTime", "(J)V", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;", "dataObj", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;", "mergeCount", "getMergeCount", "setMergeCount", "", "mutableDxData", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtEnterAtmosphereEntity implements ITaoLiveKtEnterAtmosphereEntity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<TaoLiveKtCommentBadgeModel> badgeInfos;
    private String bizType;
    private Map<String, ? extends Object> data;
    private KMPJsonObject dataObj;
    private Map<String, ? extends Object> dxData;
    private int fansLevel;
    private int mergeCount;
    private Map<String, Object> mutableDxData;
    private List<? extends Object> originBadgeInfos;
    private Map<String, ? extends Object> originData;
    private String templateName;
    private TaoLiveKtAtmosphereType atmosphereType = TaoLiveKtAtmosphereType.Enter;
    private String name = "";
    private String content = "";
    private String bgColor = "";
    private boolean canInterrupt = true;
    private long disappearTime = 8000;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(1010827319);
            int[] iArr = new int[TaoLiveKtAtmosphereType.values().length];
            try {
                iArr[TaoLiveKtAtmosphereType.Enter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TaoLiveKtAtmosphereType.Trade.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TaoLiveKtAtmosphereType.DXAtmosphere.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        t2o.a(1010827318);
        t2o.a(1003487311);
    }

    private final String formatContent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2c091f6d", new Object[]{this, str});
        }
        String str2 = str == null ? "" : str;
        if (this.mergeCount <= 0) {
            return str2;
        }
        return "等" + this.mergeCount + (char) 20154 + str;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void mkEnterAtmosphereWithData(java.util.Map<java.lang.String, ? extends java.lang.Object> r11) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.enter.TaoLiveKtEnterAtmosphereEntity.mkEnterAtmosphereWithData(java.util.Map):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void mkTradeAtmosphereWithData(java.util.Map<java.lang.String, ? extends java.lang.Object> r11) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.enter.TaoLiveKtEnterAtmosphereEntity.mkTradeAtmosphereWithData(java.util.Map):void");
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.leftBottom.enter.ITaoLiveKtEnterAtmosphereEntity
    public TaoLiveKtAtmosphereType getAtmosphereType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtAtmosphereType) ipChange.ipc$dispatch("a4bbdebb", new Object[]{this});
        }
        return this.atmosphereType;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.leftBottom.enter.ITaoLiveKtEnterAtmosphereEntity
    public List<TaoLiveKtCommentBadgeModel> getBadgeInfos() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1a80c48", new Object[]{this});
        }
        return this.badgeInfos;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.leftBottom.enter.ITaoLiveKtEnterAtmosphereEntity
    public String getBgColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("73519e11", new Object[]{this});
        }
        return this.bgColor;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.leftBottom.enter.ITaoLiveKtEnterAtmosphereEntity
    public String getBizType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this});
        }
        return this.bizType;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.leftBottom.enter.ITaoLiveKtEnterAtmosphereEntity
    public boolean getCanInterrupt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("628d12f4", new Object[]{this})).booleanValue();
        }
        return this.canInterrupt;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.leftBottom.enter.ITaoLiveKtEnterAtmosphereEntity
    public String getContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1ec9696", new Object[]{this});
        }
        return this.content;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.leftBottom.enter.ITaoLiveKtEnterAtmosphereEntity
    public Map<String, Object> getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("516a2e9c", new Object[]{this});
        }
        return this.data;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.leftBottom.enter.ITaoLiveKtEnterAtmosphereEntity
    public long getDisappearTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e08670d5", new Object[]{this})).longValue();
        }
        return this.disappearTime;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.leftBottom.enter.ITaoLiveKtEnterAtmosphereEntity
    public Map<String, Object> getDxData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7ecc9ad0", new Object[]{this});
        }
        return this.dxData;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.leftBottom.enter.ITaoLiveKtEnterAtmosphereEntity
    public int getFansLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7bce7a68", new Object[]{this})).intValue();
        }
        return this.fansLevel;
    }

    public final int getMergeCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b1c33da7", new Object[]{this})).intValue();
        }
        return this.mergeCount;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.leftBottom.enter.ITaoLiveKtEnterAtmosphereEntity
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.name;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.leftBottom.enter.ITaoLiveKtEnterAtmosphereEntity
    public List<Object> getOriginBadgeInfos() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("79dcc742", new Object[]{this});
        }
        return this.originBadgeInfos;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.base.ITaoLiveKtOutViewModel
    public Map<String, Object> getOriginData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("830078e2", new Object[]{this});
        }
        return this.originData;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.leftBottom.enter.ITaoLiveKtEnterAtmosphereEntity
    public String getTemplateName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8afad3e", new Object[]{this});
        }
        return this.templateName;
    }

    public final void mkDataEntity() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fde12b72", new Object[]{this});
        } else if (getData() != null) {
            TaoLiveKtAtmosphereType atmosphereType = getAtmosphereType();
            if (atmosphereType == null) {
                i = -1;
            } else {
                i = a.$EnumSwitchMapping$0[atmosphereType.ordinal()];
            }
            if (i == 1) {
                mkEnterAtmosphereWithData(getData());
            } else if (i == 2) {
                mkTradeAtmosphereWithData(getData());
            } else if (i == 3) {
                mkDXAtmosphereWithData(getData());
            }
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.leftBottom.enter.ITaoLiveKtEnterAtmosphereEntity
    public void setAtmosphereType(TaoLiveKtAtmosphereType taoLiveKtAtmosphereType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03bc2d", new Object[]{this, taoLiveKtAtmosphereType});
        } else {
            this.atmosphereType = taoLiveKtAtmosphereType;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.leftBottom.enter.ITaoLiveKtEnterAtmosphereEntity
    public void setBadgeInfos(List<TaoLiveKtCommentBadgeModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f430631c", new Object[]{this, list});
        } else {
            this.badgeInfos = list;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.leftBottom.enter.ITaoLiveKtEnterAtmosphereEntity
    public void setBgColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fde5aced", new Object[]{this, str});
        } else {
            this.bgColor = str;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.leftBottom.enter.ITaoLiveKtEnterAtmosphereEntity
    public void setBizType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebf7407c", new Object[]{this, str});
        } else {
            this.bizType = str;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.leftBottom.enter.ITaoLiveKtEnterAtmosphereEntity
    public void setCanInterrupt(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caac0a58", new Object[]{this, new Boolean(z)});
        } else {
            this.canInterrupt = z;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.leftBottom.enter.ITaoLiveKtEnterAtmosphereEntity
    public void setContent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52a9c508", new Object[]{this, str});
        } else {
            this.content = str;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.leftBottom.enter.ITaoLiveKtEnterAtmosphereEntity
    public void setData(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9cd3172", new Object[]{this, map});
        } else {
            this.data = map;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.leftBottom.enter.ITaoLiveKtEnterAtmosphereEntity
    public void setDisappearTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c773a40f", new Object[]{this, new Long(j)});
        } else {
            this.disappearTime = j;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.leftBottom.enter.ITaoLiveKtEnterAtmosphereEntity
    public void setDxData(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c54bebe", new Object[]{this, map});
        } else {
            this.dxData = map;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.leftBottom.enter.ITaoLiveKtEnterAtmosphereEntity
    public void setFansLevel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5f7af3a", new Object[]{this, new Integer(i)});
        } else {
            this.fansLevel = i;
        }
    }

    public final void setMergeCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd7b8543", new Object[]{this, new Integer(i)});
        } else {
            this.mergeCount = i;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.leftBottom.enter.ITaoLiveKtEnterAtmosphereEntity
    public void setName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b22cde", new Object[]{this, str});
        } else {
            this.name = str;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.leftBottom.enter.ITaoLiveKtEnterAtmosphereEntity
    public void setOriginBadgeInfos(List<? extends Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("881ce62", new Object[]{this, list});
        } else {
            this.originBadgeInfos = list;
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

    @Override // com.taobao.kmp.live.liveBizComponent.model.leftBottom.enter.ITaoLiveKtEnterAtmosphereEntity
    public void setTemplateName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dde46ef8", new Object[]{this, str});
        } else {
            this.templateName = str;
        }
    }

    private final String formatName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ffeb98cd", new Object[]{this, str});
        }
        if (str == null) {
            str = "";
        }
        if (str.length() <= 5) {
            return str;
        }
        String substring = str.substring(0, 5);
        ckf.f(substring, "substring(...)");
        return substring.concat("…");
    }

    private final void mkDXAtmosphereWithData(Map<String, ? extends Object> map) {
        Map<String, ? extends Object> map2;
        Long l;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a010027a", new Object[]{this, map});
            return;
        }
        String str = null;
        Map<String, Object> t = map != null ? kotlin.collections.a.t(map) : null;
        this.mutableDxData = t;
        if (t != null) {
            t.put("denoise", Boolean.valueOf(h2t.INSTANCE.r()));
        }
        Map<String, Object> map3 = this.mutableDxData;
        if (map3 != null) {
            map2 = kotlin.collections.a.r(map3);
        } else {
            map2 = kotlin.collections.a.h();
        }
        setDxData(map2);
        if (!(map instanceof Object)) {
            map = null;
        }
        KMPJsonObject kMPJsonObject = new KMPJsonObject(map);
        this.dataObj = kMPJsonObject;
        KMPJsonObject jsonObject = kMPJsonObject.getJsonObject("msgData");
        KMPJsonObject jsonObject2 = jsonObject != null ? jsonObject.getJsonObject("styleConfig") : null;
        if (jsonObject2 != null) {
            str = jsonObject2.getString(yh6.CONFIG_KEY_TEMPLATE_NAME);
        }
        setTemplateName(str);
        if (jsonObject2 != null) {
            z = ckf.b(jsonObject2.getBoolean("canInterrupt"), Boolean.TRUE);
        }
        setCanInterrupt(z);
        setDisappearTime(((jsonObject2 == null || (l = jsonObject2.getLong("showDuration")) == null) ? 8L : l.longValue()) * 1000);
    }
}
