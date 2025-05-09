package com.taobao.taolive.sdk.ui.component;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.VideoStatus;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import tb.cba;
import tb.ccc;
import tb.cdr;
import tb.ejr;
import tb.giv;
import tb.hw0;
import tb.jyw;
import tb.nqo;
import tb.o3s;
import tb.pvs;
import tb.sjr;
import tb.t2o;
import tb.up6;
import tb.uwt;
import tb.ux9;
import tb.uyg;
import tb.vx9;
import tb.yj4;
import tb.z14;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class VideoFrameErrorController implements com.taobao.taolive.sdk.ui.component.a, ccc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_AUTO_DOWN = "com.taobao.taolive.room.auto_down";
    public static final int MESSAGE_WHAT_AUTO_SCROLL_NEXT_FINISH = 1000;
    public static final int UP_DOWN_SWITCH_BOTTOM = 0;
    public static final int UP_DOWN_SWITCH_INIT = 2;
    public static final int UP_DOWN_SWITCH_UP = 1;
    public TBLiveDataModel b;
    public boolean d;
    public Context e;
    public View f;
    public TextView g;
    public AliUrlImageView h;
    public TextView i;
    public TextView j;
    public RelativeLayout k;
    public jyw l;
    public ux9 m;
    public TextView n;
    public int p;

    /* renamed from: a  reason: collision with root package name */
    public PlayerErrorState f13298a = PlayerErrorState.PLAYER_ERROR_STATE_NONE;
    public int c = 0;
    public boolean o = false;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public @interface ErrorViewType {
        public static final String ANCHOR_LEAVE = "AnchorLeave";
        public static final String ERROR_STATE_OTHER = "ErrorStateOther";
        public static final String LIVE_PUNISH = "LivePunish";
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public @interface PMPunishStatus {
        public static final int INIT = -1;
        public static final int PM_CANCEL_PUNISH = 2;
        public static final int PM_PUNISH = 1;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum PlayerErrorState {
        PLAYER_ERROR_STATE_NONE,
        PLAYER_ERROR_STATE_ANCHOR_LEAVE,
        PLAYER_ERROR_STATE_USER_NETWORK_NOT_AVAILABLE,
        PLAYER_ERROR_STATE_OTHER,
        PLAYER_ERROR_STATE_LIVE_END,
        PLAYER_ERROR_STATE_LIVE_PUNISH;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(PlayerErrorState playerErrorState, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/ui/component/VideoFrameErrorController$PlayerErrorState");
        }

        public static PlayerErrorState valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PlayerErrorState) ipChange.ipc$dispatch("f322e08c", new Object[]{str});
            }
            return (PlayerErrorState) Enum.valueOf(PlayerErrorState.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$taolive$sdk$ui$component$VideoFrameErrorController$PlayerErrorState;

        static {
            int[] iArr = new int[PlayerErrorState.values().length];
            $SwitchMap$com$taobao$taolive$sdk$ui$component$VideoFrameErrorController$PlayerErrorState = iArr;
            try {
                iArr[PlayerErrorState.PLAYER_ERROR_STATE_ANCHOR_LEAVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$taolive$sdk$ui$component$VideoFrameErrorController$PlayerErrorState[PlayerErrorState.PLAYER_ERROR_STATE_LIVE_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$taolive$sdk$ui$component$VideoFrameErrorController$PlayerErrorState[PlayerErrorState.PLAYER_ERROR_STATE_USER_NETWORK_NOT_AVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$taolive$sdk$ui$component$VideoFrameErrorController$PlayerErrorState[PlayerErrorState.PLAYER_ERROR_STATE_OTHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$taolive$sdk$ui$component$VideoFrameErrorController$PlayerErrorState[PlayerErrorState.PLAYER_ERROR_STATE_LIVE_PUNISH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        t2o.a(779093479);
        t2o.a(779093478);
        t2o.a(806356161);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184a2ece", new Object[]{this, new Boolean(z)});
        } else {
            this.d = true;
        }
    }

    public void b(PlayerErrorState playerErrorState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d944776", new Object[]{this, playerErrorState});
            return;
        }
        this.f13298a = playerErrorState;
        o3s.b("VideoFrameErrorController", "changePlayerState state:" + playerErrorState);
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5dfe681", new Object[]{this, new Boolean(z)});
        } else {
            this.o = z;
        }
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c484b2f8", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea8950a1", new Object[]{this});
        }
        int i = a.$SwitchMap$com$taobao$taolive$sdk$ui$component$VideoFrameErrorController$PlayerErrorState[this.f13298a.ordinal()];
        if (i == 1) {
            return "1";
        }
        if (i == 2) {
            return "3";
        }
        if (i != 3) {
            return "2";
        }
        return "5";
    }

    public PlayerErrorState f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PlayerErrorState) ipChange.ipc$dispatch("99894ac4", new Object[]{this});
        }
        return this.f13298a;
    }

    public View g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f636c5dd", new Object[]{this});
        }
        return this.n;
    }

    @Override // tb.ccc
    public void handleMessage(Message message) {
        String str;
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        int i = message.what;
        if (i == 997) {
            t();
        } else if (i == 1000) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("slide_type", "automatic");
            if (giv.f() != null) {
                giv.f().p(this.m, "upDown_switch-exp", hashMap);
            }
            TBLiveDataModel tBLiveDataModel = this.b;
            if (tBLiveDataModel == null || (videoInfo = tBLiveDataModel.mVideoInfo) == null) {
                str = "";
            } else {
                str = videoInfo.liveId;
            }
            i();
            String str2 = null;
            if (!nqo.i() || !(this.m.j() instanceof cba) || !((cba) this.m.j()).K) {
                sjr g = sjr.g();
                ux9 ux9Var = this.m;
                if (ux9Var != null) {
                    str2 = ux9Var.C();
                }
                g.c("com.taobao.taolive.room.auto_down", str, str2);
                return;
            }
            sjr g2 = sjr.g();
            ux9 ux9Var2 = this.m;
            if (ux9Var2 != null) {
                str2 = ux9Var2.C();
            }
            g2.c(uyg.EVENT_NEGATIVE_FEEDBACK, str, str2);
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("697952b7", new Object[]{this});
            return;
        }
        TextView textView = this.i;
        if (textView != null) {
            textView.setVisibility(8);
        }
        RelativeLayout relativeLayout = this.k;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
    }

    public void j(ux9 ux9Var, Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec7ecd6", new Object[]{this, ux9Var, context, view});
            return;
        }
        this.m = ux9Var;
        this.e = context;
        this.f = view;
        if (view != null) {
            AliUrlImageView aliUrlImageView = (AliUrlImageView) view.findViewById(R.id.taolive_video_black_screen_img);
            this.h = aliUrlImageView;
            if (aliUrlImageView != null) {
                aliUrlImageView.setPlaceHolder(R.drawable.taolive_error_tips_img);
            }
            this.g = (TextView) this.f.findViewById(R.id.taolive_video_black_screen_tv);
            this.i = (TextView) this.f.findViewById(R.id.taolive_video_black_screen_to_next_tv);
            this.j = (TextView) this.f.findViewById(R.id.taolive_video_punish_screen_to_next_tv);
            this.k = (RelativeLayout) this.f.findViewById(R.id.taolive_video_punish_screen_to_next_rv);
            this.n = (TextView) this.f.findViewById(R.id.taolive_video_black_screen_resume_live);
            o3s.d("VideoFrameErrorController", "initErrorView");
        }
        if (this.l == null) {
            this.l = new jyw(this);
        }
        this.h.setVisibility(8);
    }

    public final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cd118be", new Object[]{this})).booleanValue();
        }
        ux9 ux9Var = this.m;
        if (ux9Var instanceof cdr) {
            return ((cdr) ux9Var).Z0();
        }
        return false;
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c773582", new Object[]{this});
            return;
        }
        i();
        TextView textView = this.n;
        if (textView != null) {
            textView.setVisibility(0);
        }
        q();
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f497077", new Object[]{this});
            return;
        }
        TextView textView = this.n;
        if (textView != null) {
            textView.setVisibility(8);
        }
        s();
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("slide_type", "other");
        if (giv.f() != null) {
            giv.f().p(this.m, "upDown_switch-exp", hashMap);
        }
        q();
    }

    public void n() {
        TBLiveDataModel tBLiveDataModel;
        VideoInfo videoInfo;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c86d41d", new Object[]{this});
        } else if (this.d && (tBLiveDataModel = this.b) != null && (videoInfo = tBLiveDataModel.mVideoInfo) != null && (str = videoInfo.roomStatus) != null && TextUtils.equals(str, "2")) {
            HashMap hashMap = new HashMap();
            hashMap.put("feed_type", "live");
            hashMap.put("live_status", "4");
            uwt.b(hashMap, "live_status_expo");
        }
    }

    public final void o(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21aef28f", new Object[]{this, str});
            return;
        }
        HashMap hashMap = new HashMap();
        if (up6.d0(this.m) == VideoStatus.VIDEO_TIMESHIFT_STATUS) {
            str2 = "timeshift";
        } else {
            str2 = "live";
        }
        hashMap.put("feed_type", str2);
        if (TextUtils.equals(str2, "live")) {
            String e = e();
            hashMap.put("live_status", e);
            if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "0")) {
                hashMap.put("player_error_code", str);
            }
            o3s.b("VideoFrameErrorController", "feed_type:" + str2 + " live_status:" + e + " player_error_code:" + str);
        }
        ux9 ux9Var = this.m;
        if (ux9Var != null) {
            hashMap.put("liveId", ux9Var.i);
            hashMap.put("livesource", up6.L(vx9.d()));
            hashMap.put("entrylivesource", up6.r(vx9.d()));
            hashMap.put("liveToken", this.m.p());
            if (this.m.x() != null) {
                hashMap.put("playToken", this.m.x().w());
                hashMap.put(yj4.PARAM_PLAY_URL, this.m.x().b());
            }
        }
        uwt.b(hashMap, "live_status_expo");
    }

    public void r(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acfb151", new Object[]{this, tBLiveDataModel});
        } else {
            this.b = tBLiveDataModel;
        }
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f9bdf87", new Object[]{this});
            return;
        }
        TextView textView = this.i;
        if (textView != null) {
            if (this.f13298a != PlayerErrorState.PLAYER_ERROR_STATE_LIVE_PUNISH) {
                textView.setVisibility(0);
                this.k.setVisibility(8);
                this.p = 3;
            } else {
                this.k.setVisibility(0);
                this.i.setVisibility(8);
                this.p = pvs.f2();
            }
        }
        t();
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dd02409", new Object[]{this});
            return;
        }
        TextView textView = this.g;
        if (textView != null) {
            textView.setTextColor(this.e.getResources().getColor(R.color.taolive_white));
        }
        this.f13298a = PlayerErrorState.PLAYER_ERROR_STATE_NONE;
        this.d = false;
        this.c = 0;
        this.o = false;
        o3s.d("VideoFrameErrorController", "resetState");
        jyw jywVar = this.l;
        if (jywVar != null) {
            jywVar.removeCallbacksAndMessages(null);
        }
        TextView textView2 = this.n;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("268b03b", new Object[]{this});
        } else if (this.l != null) {
            TextView textView = this.i;
            if (textView != null || this.j != null) {
                if (this.f13298a == PlayerErrorState.PLAYER_ERROR_STATE_LIVE_PUNISH || textView == null) {
                    TextView textView2 = this.j;
                    if (textView2 != null) {
                        textView2.setText(this.p + "秒后自动下滑");
                    }
                } else {
                    textView.setText(this.p + "s后进入下一个直播间");
                }
                int i = this.p - 1;
                this.p = i;
                if (i <= 0) {
                    o3s.a("VideoFrameErrorController", "倒计时结束");
                    this.l.sendEmptyMessageDelayed(1000, 1000L);
                    return;
                }
                o3s.a("VideoFrameErrorController", "倒计时减一秒，倒计时即将显示：" + this.p);
                this.l.sendEmptyMessageDelayed(997, 1000L);
            }
        }
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df223c1a", new Object[]{this});
            return;
        }
        o3s.d("VideoFrameErrorController", "setErrorText mPlayerState:" + this.f13298a);
        if (this.g != null && this.h != null) {
            if (this.i != null || this.j != null) {
                int i = a.$SwitchMap$com$taobao$taolive$sdk$ui$component$VideoFrameErrorController$PlayerErrorState[this.f13298a.ordinal()];
                if (i == 1) {
                    this.g.setText("主播暂时离开，看看其他主播吧");
                    this.h.setImageUrl(ejr.r());
                    this.h.setVisibility(0);
                    TextView textView = this.n;
                    if (textView != null) {
                        textView.setVisibility(8);
                    }
                    View view = this.f;
                    if (view != null) {
                        view.setBackgroundResource(R.drawable.taolive_slice_scroll_common);
                    }
                } else if (i == 2) {
                    if (this.c == 0) {
                        this.g.setText("直播已结束，看看其他主播吧");
                        this.h.setImageUrl(ejr.t());
                    } else {
                        this.g.setText("直播已结束");
                        this.h.setImageUrl(ejr.t());
                    }
                    TextView textView2 = this.n;
                    if (textView2 != null) {
                        textView2.setVisibility(8);
                    }
                    this.h.setVisibility(0);
                    View view2 = this.f;
                    if (view2 != null) {
                        view2.setBackgroundResource(R.drawable.taolive_slice_scroll_common);
                    }
                } else if (i == 3) {
                    this.g.setText("哎呀，好像断网了");
                    this.h.setImageUrl(ejr.s());
                    this.h.setVisibility(8);
                    View view3 = this.f;
                    if (view3 != null) {
                        view3.setBackgroundResource(R.color.taolive_anchor_transparent_bg);
                    }
                } else if (i == 4) {
                    this.g.setText("主播网络异常，看看其他主播吧");
                    this.h.setVisibility(8);
                    View view4 = this.f;
                    if (view4 != null) {
                        view4.setBackgroundResource(R.color.taolive_anchor_transparent_bg);
                    }
                } else if (i == 5) {
                    o3s.b("VideoFrameErrorController", "拉停,setErrorText PLAYER_ERROR_STATE_LIVE_PUNISH");
                    this.g.setText("主播暂时离开");
                    this.g.setTextColor(this.e.getResources().getColor(R.color.taolive_room_punish));
                    this.h.setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN01d7ALP41fQVh6lbhvo_!!6000000004001-2-tps-450-450.png");
                    this.h.setVisibility(0);
                    TextView textView3 = this.n;
                    if (textView3 != null) {
                        textView3.setVisibility(8);
                    }
                    View view5 = this.f;
                    if (view5 != null) {
                        view5.setBackgroundColor(z14.a("#11192d"));
                    }
                }
            }
        }
    }

    public void h(String str) {
        PlayerErrorState playerErrorState;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f02ae5", new Object[]{this, str});
            return;
        }
        TextView textView = this.n;
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (!hw0.q(this.e)) {
            this.f13298a = PlayerErrorState.PLAYER_ERROR_STATE_USER_NETWORK_NOT_AVAILABLE;
        }
        boolean k = k();
        boolean M0 = com.taobao.taolive.room.player.standard.manager.a.M0(this.m);
        boolean z2 = this.o;
        if (!z2 || (!k && !M0)) {
            int i = this.c;
            if (i != 0 && i != 2) {
                if (k || !z2) {
                    z = false;
                }
                o3s.b("VideoFrameErrorController", "拉停来自PM消息，允许下滑, isLandscapeLiveRoomFullScreen:" + k + " mIsPunishFromPM:" + this.o);
                if (z) {
                    o3s.b("VideoFrameErrorController", "拉停来自PM消息，允许下滑");
                    m();
                } else {
                    l();
                }
            } else if (M0 || (playerErrorState = this.f13298a) == PlayerErrorState.PLAYER_ERROR_STATE_USER_NETWORK_NOT_AVAILABLE || playerErrorState == PlayerErrorState.PLAYER_ERROR_STATE_OTHER) {
                l();
            } else {
                m();
            }
        } else {
            o3s.b("VideoFrameErrorController", "拉停来自PM消息，半屏直播间全屏态，不允许下滑");
            l();
        }
        View view = this.f;
        if (view != null) {
            view.setVisibility(0);
        }
        o(str);
    }
}
