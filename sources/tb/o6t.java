package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.controller2.TaoLiveRealController;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class o6t implements s3c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TaoLiveRealController f25170a;

    public o6t(TaoLiveRealController taoLiveRealController) {
        this.f25170a = taoLiveRealController;
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return "TaoLiveController2";
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{uyg.EVENT_GET_FOLLOW_STATUS, uyg.EVENT_FOLLOW_FROM_FOLLOWFRAME, "com.taobao.taolive.room.live_type", "com.taobao.taolive.room.recommend.good.card.did.appear", "com.taobao.taolive.room.recommend.good.card.did.disappear"};
    }

    @Override // tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        if (TaoLiveRealController.C(this.f25170a) != null) {
            return TaoLiveRealController.C(this.f25170a).V();
        }
        return null;
    }

    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if ("com.taobao.taolive.room.live_type".equals(str)) {
            if (TaoLiveRealController.V(this.f25170a) != null) {
                TaoLiveRealController.V(this.f25170a).g(obj);
                TaoLiveRealController.V(this.f25170a).a(d6q.KEY_APP_NAME, "taobao");
                if (TaoLiveRealController.C(this.f25170a) != null && (TaoLiveRealController.C(this.f25170a).r() instanceof ATaoLiveOpenEntity)) {
                    String str2 = ((ATaoLiveOpenEntity) TaoLiveRealController.C(this.f25170a).r()).bizCode;
                    if (TextUtils.equals(str2, TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Tab2.toString())) {
                        TaoLiveRealController.V(this.f25170a).a(d6q.KEY_TAOLIVEOPENBIZCODE, pc.SCENE_NAME);
                    } else if (TextUtils.equals(str2, TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_OpenWatch.toString())) {
                        TaoLiveRealController.V(this.f25170a).a(d6q.KEY_TAOLIVEOPENBIZCODE, "OpenWatch");
                    } else if (TextUtils.equals(str2, TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_StandardOpenWatch.toString())) {
                        TaoLiveRealController.V(this.f25170a).a(d6q.KEY_TAOLIVEOPENBIZCODE, "OpenWatchPublic");
                    }
                }
            }
        } else if (uyg.EVENT_GET_FOLLOW_STATUS.equalsIgnoreCase(str)) {
            if (TaoLiveRealController.V(this.f25170a) != null) {
                TaoLiveRealController.V(this.f25170a).a("followStatus", String.valueOf(obj));
            }
        } else if (uyg.EVENT_FOLLOW_FROM_FOLLOWFRAME.equalsIgnoreCase(str)) {
            if (TaoLiveRealController.V(this.f25170a) != null) {
                TaoLiveRealController.V(this.f25170a).a("followStatus", "true");
            }
        } else if ("com.taobao.taolive.room.recommend.good.card.did.appear".equals(str)) {
            if (TaoLiveRealController.g0(this.f25170a) != null) {
                TaoLiveRealController.g0(this.f25170a).setVisibility(8);
            }
        } else if ("com.taobao.taolive.room.recommend.good.card.did.disappear".equals(str) && !up6.s0(vx9.d()) && TaoLiveRealController.g0(this.f25170a) != null) {
            TaoLiveRealController.g0(this.f25170a).setVisibility(0);
        }
    }
}
