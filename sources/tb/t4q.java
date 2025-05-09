package tb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.miniLive.model.SimpleLiveInfo;
import com.taobao.avplayer.s;
import com.taobao.taolive.room.player.preload.instance.PreloadParams;
import com.taobao.taolive.room.player.standard.StandardMediaData;
import com.taobao.taolive.room.player.standard.manager.LiveMediaManager;
import com.taobao.taolive.room.player.standard.state.BaseStatePlayer;
import com.taobao.taolive.room.player.standard.state.LiveStatePlayer;
import com.uc.webview.export.media.CommandID;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class t4q extends uy1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093136);
    }

    public t4q(PreloadParams preloadParams) {
        super(preloadParams);
    }

    public static /* synthetic */ Object ipc$super(t4q t4qVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/player/smallwindow/SmallWindowInstance");
    }

    public void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb0239", new Object[]{this});
        } else if (TextUtils.equals(c(), PreloadParams.PlayerType.LIVE_ZOOM_WINDOW_TYPE)) {
            this.b = P(this.f29668a);
        } else {
            this.b = A(this.f29668a);
        }
    }

    public void Q(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b30379e", new Object[]{this, drawable});
            return;
        }
        BaseStatePlayer baseStatePlayer = this.b;
        if (baseStatePlayer != null && drawable != null) {
            baseStatePlayer.d1(drawable);
        }
    }

    public final BaseStatePlayer P(Context context) {
        BaseStatePlayer baseStatePlayer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseStatePlayer) ipChange.ipc$dispatch("592f016d", new Object[]{this, context});
        }
        if (this.c == null || this.e == null) {
            return null;
        }
        o3s.b("SmallWindowInstance", "小窗createZoomWindowMediaPlayer 创建直播播放器实例 setUp,roomStatus = " + this.e.roomStatus);
        if (TextUtils.equals(this.e.roomStatus, "2")) {
            baseStatePlayer = new z1o(context);
        } else {
            baseStatePlayer = new LiveStatePlayer(context, 3);
        }
        baseStatePlayer.f1(true);
        s.d e0 = baseStatePlayer.e0();
        if (e0 == null) {
            e0 = new s.d();
        }
        e0.s = bte.d();
        e0.o = this.c.a();
        String str = this.e.pushFeature;
        e0.i = this.c.y();
        Map<String, String> map = this.f;
        if (map == null || !map.containsKey(yj4.PARAM_PLAY_URL)) {
            if (baseStatePlayer instanceof z1o) {
                ((z1o) baseStatePlayer).V1(this.e.replayUrl);
            } else {
                ((LiveStatePlayer) baseStatePlayer).Y1(LiveMediaManager.e2(StandardMediaData.generate(this.e)), null);
            }
        } else if (baseStatePlayer instanceof z1o) {
            ((z1o) baseStatePlayer).V1(this.f.get(yj4.PARAM_PLAY_URL));
            baseStatePlayer.l1(zqq.c(this.f.get("loop")));
            baseStatePlayer.y1(zqq.g(this.f.get(CommandID.seekTo), 0));
        } else {
            ((LiveStatePlayer) baseStatePlayer).Y1(null, this.f.get(yj4.PARAM_PLAY_URL));
        }
        baseStatePlayer.K();
        return baseStatePlayer;
    }

    public final BaseStatePlayer A(Context context) {
        SimpleLiveInfo simpleLiveInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseStatePlayer) ipChange.ipc$dispatch("795570ea", new Object[]{this, context});
        }
        if (this.c == null || (simpleLiveInfo = this.d) == null) {
            return null;
        }
        if (simpleLiveInfo.roomStatus != 1) {
            o3s.b("SmallWindowInstance", "非直播态，return");
            return null;
        }
        o3s.b("SmallWindowInstance", "小窗createMediaPlayer 创建直播播放器实例 setUp");
        ufi u = this.c.u() != null ? this.c.u() : null;
        LiveStatePlayer liveStatePlayer = new LiveStatePlayer(context, 2);
        this.b = liveStatePlayer;
        s.d e0 = liveStatePlayer.e0();
        if (e0 == null) {
            e0 = new s.d();
        }
        e0.r = 0;
        e0.A = false;
        e0.P = true;
        e0.o = this.c.a();
        String str = this.d.pushFeature;
        e0.i = this.c.y();
        if (this.c.s() > 0) {
            this.b.D1(this.c.s());
        }
        this.b.w1(this.c.n());
        String str2 = u != null ? u.f29342a : null;
        ((LiveStatePlayer) this.b).Y1(LiveMediaManager.e2(StandardMediaData.generate(lxg.a(this.d))), null);
        this.b.M(str2, null);
        return this.b;
    }
}
