package com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.builder;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.enter.ITaoLiveKtEnterAtmosphereEntity;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.enter.TaoLiveKtAtmosphereType;
import com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtAtmosphereQueue;
import com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.enter.TaoLiveKtEnterAtmosphereEntity;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.weex.common.Constants;
import java.util.Map;
import kotlin.Metadata;
import tb.ob1;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u0005R2\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u00010\u001c8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/builder/TaoLiveKtAtmosphereQueue;", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/comment/ITaoLiveKtAtmosphereQueue;", "", Constants.Name.MAX_LENGTH, "<init>", "(I)V", "Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/enter/TaoLiveKtEnterAtmosphereEntity;", "model", "Ltb/xhv;", "writeAtmosphere", "(Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/enter/TaoLiveKtEnterAtmosphereEntity;)V", "Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/enter/TaoLiveKtAtmosphereType;", "type", "", "findMerged", "(Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/enter/TaoLiveKtAtmosphereType;)Z", "Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/enter/ITaoLiveKtEnterAtmosphereEntity;", "readComment", "()Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/enter/ITaoLiveKtEnterAtmosphereEntity;", "clearComment$tao_live_crossplatform_foundation_release", "()V", "clearComment", "isEmpty", "()Z", TLogTracker.LEVEL_INFO, "getMaxLength", "()I", "setMaxLength", "", "", "", "originData", "Ljava/util/Map;", "getOriginData", "()Ljava/util/Map;", "setOriginData", "(Ljava/util/Map;)V", "Ltb/ob1;", "arrayDeque", "Ltb/ob1;", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtAtmosphereQueue implements ITaoLiveKtAtmosphereQueue {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ob1<TaoLiveKtEnterAtmosphereEntity> arrayDeque = new ob1<>();
    private int maxLength;
    private Map<String, ? extends Object> originData;

    static {
        t2o.a(1010827307);
        t2o.a(1003487342);
    }

    public TaoLiveKtAtmosphereQueue(int i) {
        this.maxLength = i;
    }

    public final void clearComment$tao_live_crossplatform_foundation_release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96ebb9d2", new Object[]{this});
            return;
        }
        ob1<TaoLiveKtEnterAtmosphereEntity> ob1Var = this.arrayDeque;
        if (ob1Var != null) {
            ob1Var.clear();
        }
        this.arrayDeque = null;
    }

    public final boolean findMerged(TaoLiveKtAtmosphereType taoLiveKtAtmosphereType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8dbf904a", new Object[]{this, taoLiveKtAtmosphereType})).booleanValue();
        }
        ob1<TaoLiveKtEnterAtmosphereEntity> ob1Var = this.arrayDeque;
        if (ob1Var != null) {
            for (TaoLiveKtEnterAtmosphereEntity taoLiveKtEnterAtmosphereEntity : ob1Var) {
                if (taoLiveKtEnterAtmosphereEntity.getAtmosphereType() == taoLiveKtAtmosphereType) {
                    taoLiveKtEnterAtmosphereEntity.setMergeCount(taoLiveKtEnterAtmosphereEntity.getMergeCount() + 1);
                    return true;
                }
            }
        }
        return false;
    }

    public final int getMaxLength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc9ead2e", new Object[]{this})).intValue();
        }
        return this.maxLength;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.base.ITaoLiveKtOutViewModel
    public Map<String, Object> getOriginData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("830078e2", new Object[]{this});
        }
        return this.originData;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtAtmosphereQueue
    public boolean isEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
        }
        ob1<TaoLiveKtEnterAtmosphereEntity> ob1Var = this.arrayDeque;
        if (ob1Var != null) {
            return ob1Var.isEmpty();
        }
        return true;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtAtmosphereQueue
    public ITaoLiveKtEnterAtmosphereEntity readComment() {
        TaoLiveKtEnterAtmosphereEntity taoLiveKtEnterAtmosphereEntity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITaoLiveKtEnterAtmosphereEntity) ipChange.ipc$dispatch("44d953d6", new Object[]{this});
        }
        ob1<TaoLiveKtEnterAtmosphereEntity> ob1Var = this.arrayDeque;
        if (ob1Var != null) {
            taoLiveKtEnterAtmosphereEntity = ob1Var.k();
        } else {
            taoLiveKtEnterAtmosphereEntity = null;
        }
        if (taoLiveKtEnterAtmosphereEntity != null) {
            taoLiveKtEnterAtmosphereEntity.mkDataEntity();
        }
        return taoLiveKtEnterAtmosphereEntity;
    }

    public final void setMaxLength(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f2dd534", new Object[]{this, new Integer(i)});
        } else {
            this.maxLength = i;
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

    public final void writeAtmosphere(TaoLiveKtEnterAtmosphereEntity taoLiveKtEnterAtmosphereEntity) {
        ob1<TaoLiveKtEnterAtmosphereEntity> ob1Var;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6556317", new Object[]{this, taoLiveKtEnterAtmosphereEntity});
        } else if (taoLiveKtEnterAtmosphereEntity != null) {
            ob1<TaoLiveKtEnterAtmosphereEntity> ob1Var2 = this.arrayDeque;
            if (ob1Var2 != null) {
                i = ob1Var2.size();
            }
            if (i + 1 > this.maxLength && (ob1Var = this.arrayDeque) != null) {
                ob1Var.removeFirst();
            }
            ob1<TaoLiveKtEnterAtmosphereEntity> ob1Var3 = this.arrayDeque;
            if (ob1Var3 != null) {
                ob1Var3.add(taoLiveKtEnterAtmosphereEntity);
            }
        }
    }
}
