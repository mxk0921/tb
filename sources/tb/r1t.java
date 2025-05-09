package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.topGroup.TaoLiveKtNoticeEntityType;
import com.taobao.live.liveroom.liveBizComponent.topGroup.model.TaoLiveKtNoticeDxModel;
import com.taobao.live.liveroom.liveBizComponent.topGroup.model.TaoLiveKtNoticeEntity;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class r1t {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final r1t INSTANCE = new r1t();

    static {
        t2o.a(1010827377);
    }

    public final TaoLiveKtNoticeEntity a(TaoLiveKtNoticeDxModel taoLiveKtNoticeDxModel, exs exsVar) {
        String str;
        czs a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtNoticeEntity) ipChange.ipc$dispatch("3aee4d15", new Object[]{this, taoLiveKtNoticeDxModel, exsVar});
        }
        ckf.g(taoLiveKtNoticeDxModel, "model");
        TaoLiveKtNoticeEntity taoLiveKtNoticeEntity = new TaoLiveKtNoticeEntity();
        taoLiveKtNoticeEntity.setNoticeModel(taoLiveKtNoticeDxModel);
        taoLiveKtNoticeEntity.setNoticeType(TaoLiveKtNoticeEntityType.DXNotice);
        taoLiveKtNoticeEntity.setPriority$tao_live_crossplatform_foundation_release(taoLiveKtNoticeDxModel.getPriority());
        taoLiveKtNoticeEntity.setShowDuration(taoLiveKtNoticeDxModel.getShowDuration());
        if (ckf.b(taoLiveKtNoticeDxModel.getSourceLiveId(), (exsVar == null || (a2 = exsVar.a()) == null) ? null : a2.m())) {
            str = "1";
        } else {
            str = "0";
        }
        taoLiveKtNoticeEntity.setSelfLiveRoom(str);
        return taoLiveKtNoticeEntity;
    }

    public final TaoLiveKtNoticeEntity b(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtNoticeEntity) ipChange.ipc$dispatch("c038ebcc", new Object[]{this, map});
        }
        if (!(map instanceof Object)) {
            map = null;
        }
        KMPJsonObject kMPJsonObject = new KMPJsonObject(map);
        TaoLiveKtNoticeEntity taoLiveKtNoticeEntity = new TaoLiveKtNoticeEntity();
        taoLiveKtNoticeEntity.setText(kMPJsonObject.getString("notice"));
        Integer num = kMPJsonObject.getInt("priority");
        taoLiveKtNoticeEntity.setPriority$tao_live_crossplatform_foundation_release(num != null ? num.intValue() : 3);
        e3t e3tVar = e3t.INSTANCE;
        taoLiveKtNoticeEntity.setShowDuration(e3tVar.A());
        taoLiveKtNoticeEntity.setRepeatTime(e3tVar.x());
        return taoLiveKtNoticeEntity;
    }
}
