package com.taobao.live.liveroom.liveBizComponent.topGroup.model;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.topGroup.ITaoLiveKtDxNoticeModel;
import com.taobao.kmp.live.liveBizComponent.model.topGroup.ITaoLiveKtNoticeEntity;
import com.taobao.kmp.live.liveBizComponent.model.topGroup.TaoLiveKtNoticeEntityType;
import java.util.Map;
import kotlin.Metadata;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0013X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010#\"\u0004\b'\u0010%R\u001e\u0010(\u001a\u0004\u0018\u00010)X\u0080\u000e¢\u0006\u0010\n\u0002\u0010.\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010/\u001a\u00020\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0015\"\u0004\b1\u0010\u0017¨\u00062"}, d2 = {"Lcom/taobao/live/liveroom/liveBizComponent/topGroup/model/TaoLiveKtNoticeEntity;", "Lcom/taobao/kmp/live/liveBizComponent/model/topGroup/ITaoLiveKtNoticeEntity;", "<init>", "()V", "originData", "", "", "", "getOriginData", "()Ljava/util/Map;", "setOriginData", "(Ljava/util/Map;)V", "noticeType", "Lcom/taobao/kmp/live/liveBizComponent/model/topGroup/TaoLiveKtNoticeEntityType;", "getNoticeType", "()Lcom/taobao/kmp/live/liveBizComponent/model/topGroup/TaoLiveKtNoticeEntityType;", "setNoticeType", "(Lcom/taobao/kmp/live/liveBizComponent/model/topGroup/TaoLiveKtNoticeEntityType;)V", "showDuration", "", "getShowDuration", "()I", "setShowDuration", "(I)V", "repeatTime", "getRepeatTime", "setRepeatTime", "noticeModel", "Lcom/taobao/kmp/live/liveBizComponent/model/topGroup/ITaoLiveKtDxNoticeModel;", "getNoticeModel", "()Lcom/taobao/kmp/live/liveBizComponent/model/topGroup/ITaoLiveKtDxNoticeModel;", "setNoticeModel", "(Lcom/taobao/kmp/live/liveBizComponent/model/topGroup/ITaoLiveKtDxNoticeModel;)V", "text", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "isSelfLiveRoom", "setSelfLiveRoom", "enqueueTime", "", "getEnqueueTime$tao_live_crossplatform_foundation_release", "()Ljava/lang/Long;", "setEnqueueTime$tao_live_crossplatform_foundation_release", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "priority", "getPriority$tao_live_crossplatform_foundation_release", "setPriority$tao_live_crossplatform_foundation_release", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtNoticeEntity implements ITaoLiveKtNoticeEntity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Long enqueueTime;
    private ITaoLiveKtDxNoticeModel noticeModel;
    private Map<String, ? extends Object> originData;
    private int priority;
    private int repeatTime;
    private int showDuration;
    private String text;
    private TaoLiveKtNoticeEntityType noticeType = TaoLiveKtNoticeEntityType.NormalNotice;
    private String isSelfLiveRoom = "0";

    static {
        t2o.a(1010827387);
        t2o.a(1003487328);
    }

    public final Long getEnqueueTime$tao_live_crossplatform_foundation_release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("c14cdfb6", new Object[]{this});
        }
        return this.enqueueTime;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.topGroup.ITaoLiveKtNoticeEntity
    public ITaoLiveKtDxNoticeModel getNoticeModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITaoLiveKtDxNoticeModel) ipChange.ipc$dispatch("ab0750d9", new Object[]{this});
        }
        return this.noticeModel;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.topGroup.ITaoLiveKtNoticeEntity
    public TaoLiveKtNoticeEntityType getNoticeType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtNoticeEntityType) ipChange.ipc$dispatch("e2b3d2e9", new Object[]{this});
        }
        return this.noticeType;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.base.ITaoLiveKtOutViewModel
    public Map<String, Object> getOriginData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("830078e2", new Object[]{this});
        }
        return this.originData;
    }

    public final int getPriority$tao_live_crossplatform_foundation_release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b355838d", new Object[]{this})).intValue();
        }
        return this.priority;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.topGroup.ITaoLiveKtNoticeEntity
    public int getRepeatTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ffcc3c78", new Object[]{this})).intValue();
        }
        return this.repeatTime;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.topGroup.ITaoLiveKtNoticeEntity
    public int getShowDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1f0eb21", new Object[]{this})).intValue();
        }
        return this.showDuration;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.topGroup.ITaoLiveKtNoticeEntity
    public String getText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97297536", new Object[]{this});
        }
        return this.text;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.topGroup.ITaoLiveKtNoticeEntity
    public String isSelfLiveRoom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3899d97c", new Object[]{this});
        }
        return this.isSelfLiveRoom;
    }

    public final void setEnqueueTime$tao_live_crossplatform_foundation_release(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("732c4632", new Object[]{this, l});
        } else {
            this.enqueueTime = l;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.topGroup.ITaoLiveKtNoticeEntity
    public void setNoticeModel(ITaoLiveKtDxNoticeModel iTaoLiveKtDxNoticeModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3297db1", new Object[]{this, iTaoLiveKtDxNoticeModel});
        } else {
            this.noticeModel = iTaoLiveKtDxNoticeModel;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.topGroup.ITaoLiveKtNoticeEntity
    public void setNoticeType(TaoLiveKtNoticeEntityType taoLiveKtNoticeEntityType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cd7726f", new Object[]{this, taoLiveKtNoticeEntityType});
        } else {
            this.noticeType = taoLiveKtNoticeEntityType;
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

    public final void setPriority$tao_live_crossplatform_foundation_release(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5278781d", new Object[]{this, new Integer(i)});
        } else {
            this.priority = i;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.topGroup.ITaoLiveKtNoticeEntity
    public void setRepeatTime(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30926092", new Object[]{this, new Integer(i)});
        } else {
            this.repeatTime = i;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.topGroup.ITaoLiveKtNoticeEntity
    public void setSelfLiveRoom(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9a1c1a6", new Object[]{this, str});
        } else {
            this.isSelfLiveRoom = str;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.topGroup.ITaoLiveKtNoticeEntity
    public void setShowDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37c2fa09", new Object[]{this, new Integer(i)});
        } else {
            this.showDuration = i;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.topGroup.ITaoLiveKtNoticeEntity
    public void setText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2847200", new Object[]{this, str});
        } else {
            this.text = str;
        }
    }
}
