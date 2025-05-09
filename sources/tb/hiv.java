package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.android.live.plugin.proxy.bottom.IBottomProxy;
import com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy;
import tb.bl9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class hiv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements bl9.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.bl9.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bef331", new Object[]{this});
                return;
            }
            try {
                hiv.a(IBTypeRoomProxy.KEY_FRAME_CLASS_QA_EXPLAIN_FRAME, "tl-qa-explain");
                hiv.a(IBTypeRoomProxy.KEY_FRAME_CLASS_VIRTUAL_ANCHOR_SIGN_FRAME, "tl-virtual-anchor");
                hiv.a(IBTypeRoomProxy.KEY_FRAME_CLASS_FAVOR_ANIM_FRAME_3, "tl-favor-anim");
                hiv.a(IBTypeRoomProxy.KEY_FRAME_CLASS_TOP_SELECT_COMMENT, "tl-top-select_comment");
                hiv.a(IBTypeRoomProxy.KEY_FRAME_CLASS_REWARD_FRAME, "tl-bottom-reward");
                hiv.a(IBTypeRoomProxy.KEY_FRAME_CLASS_RANK_FRAME, "tl-rank");
                hiv.a(IBTypeRoomProxy.KEY_FRAME_CLASS_MESSAGE_CARD_FRAME_3, "tl-message-card");
            } catch (Throwable th) {
                FlexaLiveX.w("[UniversalFrame#registerRemoteFrame#onBTypePluginInstalled]  error: " + th.getMessage());
            }
        }
    }

    static {
        t2o.a(806355775);
    }

    public static /* synthetic */ void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94050d0b", new Object[]{str, str2});
        } else {
            c(str, str2);
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[0]);
            return;
        }
        if (d9m.y().getWatermarkFrame3Class() != null) {
            zu1.b("tl-watermark", d9m.y().getWatermarkFrame3Class());
        }
        if (d9m.g().getFrameClassMap(IBottomProxy.KEY_FRAME_CLASS_DOUBLE_CLICK_FAV_FRAME_3) != null) {
            zu1.b("tl-double-click", d9m.g().getFrameClassMap(IBottomProxy.KEY_FRAME_CLASS_DOUBLE_CLICK_FAV_FRAME_3));
        }
        if (d9m.i().getChatFrame3Class() != null) {
            zu1.b("tl-chat", d9m.i().getChatFrame3Class());
        }
        if (d9m.C().getReplaySiftTextFrameClass() != null) {
            zu1.b("tl-live-replay-shift-text", d9m.C().getReplaySiftTextFrameClass());
        }
        if (d9m.o().getInputFrame3Class() != null) {
            zu1.b("tl-input", d9m.o().getInputFrame3Class());
        }
        if (d9m.o().getInputFrame3Class() != null) {
            zu1.b("tl-input", d9m.o().getInputFrame3Class());
        }
        if (d9m.i().getImportantEventFrameClass() != null) {
            zu1.b("tl-important-event", d9m.i().getImportantEventFrameClass());
        }
        if (d9m.g().getFrameClassMap(IBottomProxy.KEY_FRAME_CLASS_FAVOR_COUNT_FRAME_3) != null) {
            zu1.b("tl-bottom-favor", d9m.g().getFrameClassMap(IBottomProxy.KEY_FRAME_CLASS_FAVOR_COUNT_FRAME_3));
        }
        if (d9m.g().getFrameClassMap(IBottomProxy.KEY_FRAME_CLASS_QA_FRAME) != null) {
            zu1.b("tl-bottom-qa", d9m.g().getFrameClassMap(IBottomProxy.KEY_FRAME_CLASS_QA_FRAME));
        }
        if (d9m.d().getLiveLinkFrame3Class() != null) {
            zu1.b("tl-link", d9m.d().getLiveLinkFrame3Class());
        }
        if (d9m.d().getLiveLinkEntranceFrame() != null) {
            zu1.b("tl-link-entrance", d9m.d().getLiveLinkEntranceFrame());
        }
        if (d9m.K().getTopBarFrame3Class() != null) {
            zu1.b("tl-top-bar", d9m.K().getTopBarFrame3Class());
        }
        if (d9m.y().getBlankFrame2Class() != null) {
            zu1.b("tl-clear-screen", d9m.y().getBlankFrame2Class());
        }
        if (d9m.w().getNoticeFrame3Class() != null) {
            zu1.b("tl-notice", d9m.w().getNoticeFrame3Class());
        }
        if (d9m.v().getNoticeFrame4Class() != null) {
            zu1.b("tl-notice-4", d9m.v().getNoticeFrame4Class());
        }
        if (d9m.y().getLiveEndFrameClass() != null) {
            zu1.b("tl-live-end-recommend", d9m.y().getLiveEndFrameClass());
        }
        if (d9m.g().getFrameClassMap(IBottomProxy.KEY_FRAME_CLASS_REPLAY_RATE_FRAME) != null) {
            zu1.b("tl-replay-rate", d9m.g().getFrameClassMap(IBottomProxy.KEY_FRAME_CLASS_REPLAY_RATE_FRAME));
        }
        d();
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16e5052f", new Object[]{str, str2});
        } else if (d9m.e() != null && d9m.e().getFrameClassMap(str) != null) {
            zu1.b(str2, d9m.e().getFrameClassMap(str));
            FlexaLiveX.w("[UniversalFrame#registerRemoteFrame#onBTypePluginInstalled] success: " + str2);
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2473d4ab", new Object[0]);
            return;
        }
        try {
            if (bl9.g().b()) {
                c(IBTypeRoomProxy.KEY_FRAME_CLASS_QA_EXPLAIN_FRAME, "tl-qa-explain");
                c(IBTypeRoomProxy.KEY_FRAME_CLASS_VIRTUAL_ANCHOR_SIGN_FRAME, "tl-virtual-anchor");
                c(IBTypeRoomProxy.KEY_FRAME_CLASS_FAVOR_ANIM_FRAME_3, "tl-favor-anim");
                c(IBTypeRoomProxy.KEY_FRAME_CLASS_TOP_SELECT_COMMENT, "tl-top-select_comment");
                c(IBTypeRoomProxy.KEY_FRAME_CLASS_REWARD_FRAME, "tl-bottom-reward");
                c(IBTypeRoomProxy.KEY_FRAME_CLASS_RANK_FRAME, "tl-rank");
                c(IBTypeRoomProxy.KEY_FRAME_CLASS_MESSAGE_CARD_FRAME_3, "tl-message-card");
            } else {
                bl9.g().i(new a());
            }
        } catch (Throwable th) {
            FlexaLiveX.w("[UniversalFrame#registerRemoteFrame]  error: " + th.getMessage());
        }
    }
}
