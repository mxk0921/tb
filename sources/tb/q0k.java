package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.bottom.IBottomProxy;
import com.taobao.taolive.room.ui.growth.GrowthFrame;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class q0k implements e8c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f26427a;
    public final ux9 b;

    public q0k(Context context, ux9 ux9Var) {
        this.f26427a = context;
        this.b = ux9Var;
    }

    static {
        t2o.a(779092962);
        t2o.a(806355033);
        hiv.b();
        if (d9m.g().getFrameClassMap(IBottomProxy.KEY_FRAME_CLASS_BOTTOM_BAR_FRAME_3) != null) {
            zu1.b("tl-bottom-bar", d9m.g().getFrameClassMap(IBottomProxy.KEY_FRAME_CLASS_BOTTOM_BAR_FRAME_3));
        }
        if (d9m.g().getFrameClassMap(IBottomProxy.KEY_FRAME_CLASS_BOTTOM_BAR_REPLAY_FRAME) != null) {
            zu1.b("tl-bottom-replay", d9m.g().getFrameClassMap(IBottomProxy.KEY_FRAME_CLASS_BOTTOM_BAR_REPLAY_FRAME));
        }
        if (d9m.g().getFrameClassMap(IBottomProxy.KEY_FRAME_CLASS_BOTTOM_MORE_FRAME_2) != null) {
            zu1.b("tl-bottom-more-2", d9m.g().getFrameClassMap(IBottomProxy.KEY_FRAME_CLASS_BOTTOM_MORE_FRAME_2));
        }
        if (d9m.g().getFrameClassMap(IBottomProxy.KEY_FRAME_CLASS_BOTTOM_PLAY_FRAME) != null) {
            zu1.b("tl-bottom-play", d9m.g().getFrameClassMap(IBottomProxy.KEY_FRAME_CLASS_BOTTOM_PLAY_FRAME));
        }
        if (d9m.g().getFrameClassMap(IBottomProxy.KEY_FRAME_CLASS_BOTTOM_BACK_TO_LIVE_FRAME) != null) {
            zu1.b("tl-bottom-back-to-live", d9m.g().getFrameClassMap(IBottomProxy.KEY_FRAME_CLASS_BOTTOM_BACK_TO_LIVE_FRAME));
        }
        if (d9m.g().getFrameClassMap(IBottomProxy.KEY_FRAME_CLASS_BOTTOM_INPUT_FRAME) != null) {
            zu1.b("tl-bottom-input", d9m.g().getFrameClassMap(IBottomProxy.KEY_FRAME_CLASS_BOTTOM_INPUT_FRAME));
        }
        if (d9m.g().getFrameClassMap(IBottomProxy.KEY_FRAME_CLASS_GOODS_ICON_FRAME) != null) {
            zu1.b("tl-bottom-goods-icon", d9m.g().getFrameClassMap(IBottomProxy.KEY_FRAME_CLASS_GOODS_ICON_FRAME));
        }
        if (d9m.g().getFrameClassMap(IBottomProxy.KEY_FRAME_CLASS_MORE_FRAME) != null) {
            zu1.b("tl-bottom-more", d9m.g().getFrameClassMap(IBottomProxy.KEY_FRAME_CLASS_MORE_FRAME));
        }
        if (d9m.g().getFrameClassMap(IBottomProxy.KEY_FRAME_CLASS_SHARE_FRAME) != null) {
            zu1.b("tl-bottom-share", d9m.g().getFrameClassMap(IBottomProxy.KEY_FRAME_CLASS_SHARE_FRAME));
        }
        zu1.b("tl_7days_subscribe", GrowthFrame.class);
        if (g9a.a() && d9m.m().getGiftFrameClass() != null) {
            zu1.b("tl-room-gift", d9m.m().getGiftFrameClass());
        }
        if (d9m.B().getRankEntranceFrameClass() != null) {
            zu1.b("tl_rank_live_entrance", d9m.B().getRankEntranceFrameClass());
        }
        d9m.n().registShowcaseFrame();
        if (d9m.x().getOfficialLiveEntryFrameClass() != null) {
            zu1.b("tl-official-live-entry", d9m.x().getOfficialLiveEntryFrameClass());
        }
        if (d9m.A().getProjectScreenIconFrameClass() != null) {
            zu1.b("tl-project-screen-icon", d9m.A().getProjectScreenIconFrameClass());
        }
        if (d9m.A().getProjectScreenSearchFrameClass() != null) {
            zu1.b("tl-project-screen-search", d9m.A().getProjectScreenSearchFrameClass());
        }
        if (d9m.A().getProjectScreenOptFrameClass() != null) {
            zu1.b("tl-project-screen-opt", d9m.A().getProjectScreenOptFrameClass());
        }
    }

    @Override // tb.e8c
    public BaseFrame a(String str) {
        Class<? extends BaseFrame> a2 = zu1.a(str);
        if (a2 != null) {
            try {
                return (BaseFrame) a2.getConstructor(Context.class, ux9.class).newInstance(this.f26427a, this.b);
            } catch (Exception e) {
                o3s.b("BaseFrameFactory", "create error : " + e.getMessage());
                return null;
            }
        } else {
            o3s.b("BaseFrameFactory", "请使用BaseFrameRegistry.registerFrame注册组件");
            return null;
        }
    }
}
