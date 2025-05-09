package com.taobao.live.liveroom.liveBizComponent.topGroup.model;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.topGroup.ITaoLiveKtDxNoticeModel;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.Map;
import kotlin.Metadata;
import tb.a07;
import tb.ksl;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0000\u0018\u0000 22\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\b\"\u0004\b\u0014\u0010\nR\"\u0010\u0015\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\b\"\u0004\b\u0017\u0010\nR\"\u0010\u0018\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\b\"\u0004\b\u001a\u0010\nR2\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0018\u00010\u001b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010#\u001a\u0004\u0018\u00010\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b#\u0010\r\u001a\u0004\b$\u0010\u000f\"\u0004\b%\u0010\u0011R$\u0010&\u001a\u0004\u0018\u00010\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b&\u0010\r\u001a\u0004\b'\u0010\u000f\"\u0004\b(\u0010\u0011R$\u0010)\u001a\u0004\u0018\u00010\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b)\u0010\r\u001a\u0004\b*\u0010\u000f\"\u0004\b+\u0010\u0011R2\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0018\u00010\u001b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b,\u0010\u001e\u001a\u0004\b-\u0010 \"\u0004\b.\u0010\"R2\u0010/\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0018\u00010\u001b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b/\u0010\u001e\u001a\u0004\b0\u0010 \"\u0004\b1\u0010\"¨\u00064"}, d2 = {"Lcom/taobao/live/liveroom/liveBizComponent/topGroup/model/TaoLiveKtNoticeDxModel;", "Lcom/taobao/kmp/live/liveBizComponent/model/topGroup/ITaoLiveKtDxNoticeModel;", "<init>", "()V", "", "showCountPerDay", TLogTracker.LEVEL_INFO, "getShowCountPerDay", "()I", "setShowCountPerDay", "(I)V", "", "sourceLiveId", "Ljava/lang/String;", "getSourceLiveId", "()Ljava/lang/String;", "setSourceLiveId", "(Ljava/lang/String;)V", "showGap", "getShowGap", "setShowGap", "priority", "getPriority", "setPriority", "showDuration", "getShowDuration", "setShowDuration", "", "", "utParams", "Ljava/util/Map;", "getUtParams", "()Ljava/util/Map;", "setUtParams", "(Ljava/util/Map;)V", "fromAccountId", "getFromAccountId", "setFromAccountId", "bizType", "getBizType", "setBizType", "dxName", "getDxName", "setDxName", ksl.PARSER_KEY_DX_DATA, "getDxData", "setDxData", "originData", "getOriginData", "setOriginData", "Companion", "a", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtNoticeDxModel implements ITaoLiveKtDxNoticeModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private String bizType;
    private Map<String, ? extends Object> dxData;
    private String dxName;
    private String fromAccountId;
    private Map<String, ? extends Object> originData;
    private int priority;
    private int showCountPerDay;
    private int showDuration;
    private int showGap;
    private String sourceLiveId;
    private Map<String, ? extends Object> utParams;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1010827386);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(1010827385);
        t2o.a(1003487327);
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.topGroup.ITaoLiveKtDxNoticeModel
    public String getBizType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this});
        }
        return this.bizType;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.topGroup.ITaoLiveKtDxNoticeModel
    public Map<String, Object> getDxData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7ecc9ad0", new Object[]{this});
        }
        return this.dxData;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.topGroup.ITaoLiveKtDxNoticeModel
    public String getDxName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec979de4", new Object[]{this});
        }
        return this.dxName;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.topGroup.ITaoLiveKtDxNoticeModel
    public String getFromAccountId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("76a73011", new Object[]{this});
        }
        return this.fromAccountId;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.base.ITaoLiveKtOutViewModel
    public Map<String, Object> getOriginData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("830078e2", new Object[]{this});
        }
        return this.originData;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.topGroup.ITaoLiveKtDxNoticeModel
    public int getPriority() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("49b31e94", new Object[]{this})).intValue();
        }
        return this.priority;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.topGroup.ITaoLiveKtDxNoticeModel
    public int getShowCountPerDay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7887dcb5", new Object[]{this})).intValue();
        }
        return this.showCountPerDay;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.topGroup.ITaoLiveKtDxNoticeModel
    public int getShowDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1f0eb21", new Object[]{this})).intValue();
        }
        return this.showDuration;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.topGroup.ITaoLiveKtDxNoticeModel
    public int getShowGap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e560d55d", new Object[]{this})).intValue();
        }
        return this.showGap;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.topGroup.ITaoLiveKtDxNoticeModel
    public String getSourceLiveId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("499cc861", new Object[]{this});
        }
        return this.sourceLiveId;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.topGroup.ITaoLiveKtDxNoticeModel
    public Map<String, Object> getUtParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5e259437", new Object[]{this});
        }
        return this.utParams;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.topGroup.ITaoLiveKtDxNoticeModel
    public void setBizType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebf7407c", new Object[]{this, str});
        } else {
            this.bizType = str;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.topGroup.ITaoLiveKtDxNoticeModel
    public void setDxData(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c54bebe", new Object[]{this, map});
        } else {
            this.dxData = map;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.topGroup.ITaoLiveKtDxNoticeModel
    public void setDxName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46060c12", new Object[]{this, str});
        } else {
            this.dxName = str;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.topGroup.ITaoLiveKtDxNoticeModel
    public void setFromAccountId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92deb3ed", new Object[]{this, str});
        } else {
            this.fromAccountId = str;
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

    @Override // com.taobao.kmp.live.liveBizComponent.model.topGroup.ITaoLiveKtDxNoticeModel
    public void setPriority(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f878ef6", new Object[]{this, new Integer(i)});
        } else {
            this.priority = i;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.topGroup.ITaoLiveKtDxNoticeModel
    public void setShowCountPerDay(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12c75d8d", new Object[]{this, new Integer(i)});
        } else {
            this.showCountPerDay = i;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.topGroup.ITaoLiveKtDxNoticeModel
    public void setShowDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37c2fa09", new Object[]{this, new Integer(i)});
        } else {
            this.showDuration = i;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.topGroup.ITaoLiveKtDxNoticeModel
    public void setShowGap(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd0345e5", new Object[]{this, new Integer(i)});
        } else {
            this.showGap = i;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.topGroup.ITaoLiveKtDxNoticeModel
    public void setSourceLiveId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a9ab835", new Object[]{this, str});
        } else {
            this.sourceLiveId = str;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.topGroup.ITaoLiveKtDxNoticeModel
    public void setUtParams(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6666a537", new Object[]{this, map});
        } else {
            this.utParams = map;
        }
    }
}
