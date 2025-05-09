package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.s;
import com.taobao.taolive.room.player.preload.instance.PreloadParams;
import com.taobao.taolive.room.player.standard.StandardMediaData;
import com.taobao.taolive.room.player.standard.manager.LiveMediaManager;
import com.taobao.taolive.room.player.standard.state.BaseStatePlayer;
import com.taobao.taolive.room.player.standard.state.LiveStatePlayer;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.ui.media.MediaData;
import com.taobao.taolive.sdk.ui.media.a;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class y3h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f31828a;
    public final cdr b;
    public final dba c;
    public final ViewGroup d;

    static {
        t2o.a(779093085);
    }

    public y3h(PreloadParams preloadParams) {
        this.f31828a = preloadParams.b();
        this.b = preloadParams.d();
        this.c = preloadParams.e();
        this.d = preloadParams.o();
    }

    public final boolean a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b67106f", new Object[]{this, view})).booleanValue();
        }
        if (!(view instanceof ViewGroup)) {
            c(" mediaView is null");
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        ViewGroup b = b(this.f31828a);
        if (b == null) {
            return false;
        }
        b.addView(viewGroup, 0, new ViewGroup.LayoutParams(1, 1));
        return true;
    }

    public final ViewGroup b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("ec8f34c8", new Object[]{this, context});
        }
        ViewGroup viewGroup = this.d;
        if (viewGroup != null) {
            return viewGroup;
        }
        Window window = ((Activity) context).getWindow();
        if (window == null) {
            c("window is null");
            return null;
        }
        View decorView = window.getDecorView();
        if (decorView instanceof ViewGroup) {
            return (ViewGroup) decorView;
        }
        c("decorView not instanceof ViewGroup");
        return null;
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
        } else if (this.b != null) {
            o3s.b("LiveRoomWarmInstance", this.b.p() + " " + str);
        }
    }

    public void d(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("736ed88a", new Object[]{this, viewGroup});
            return;
        }
        ViewGroup b = b(this.f31828a);
        if (b != null && viewGroup != null) {
            c("预热从Window上移除removePreView");
            b.removeViewInLayout(viewGroup);
        }
    }

    public final void e(BaseStatePlayer baseStatePlayer) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc3f7e9", new Object[]{this, baseStatePlayer});
            return;
        }
        c("setRenderType");
        cdr cdrVar = this.b;
        if (cdrVar != null && cdrVar.j() != null && ejr.m(this.b.j())) {
            if (Build.VERSION.SDK_INT >= ejr.u(30)) {
                z = true;
            }
            c("setRenderType sdkEnable = " + z);
            if (z) {
                baseStatePlayer.C1(true);
            }
        }
    }

    public BaseStatePlayer f(MediaData mediaData, IMediaPlayer.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseStatePlayer) ipChange.ipc$dispatch("186bafa6", new Object[]{this, mediaData, eVar});
        }
        if (mediaData == null) {
            return null;
        }
        String b = a.b(mediaData, null);
        ufi ufiVar = new ufi();
        ufiVar.f29342a = tfi.h(b);
        ufiVar.b = b;
        c("warmUpWithMediaData，创建预热播放器实例，topicID = " + b);
        LiveStatePlayer liveStatePlayer = new LiveStatePlayer(this.f31828a, this.b);
        e(liveStatePlayer);
        liveStatePlayer.F();
        liveStatePlayer.Y1(LiveMediaManager.e2(StandardMediaData.generate(mediaData)), null);
        s.d e0 = liveStatePlayer.e0();
        if (e0 == null) {
            e0 = new s.d();
        }
        e0.o = "LiveRoom";
        e0.m(false);
        e0.l(true);
        liveStatePlayer.K();
        if (!a(liveStatePlayer.l0())) {
            o3s.b("LiveRoomWarmInstance", "绑定View的失败，返回");
            return null;
        }
        if (eVar != null) {
            liveStatePlayer.u(eVar);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("liveActionType", sj4.VIDEO_ACTION_TYPE_UPDOWNSWITCH);
        liveStatePlayer.D(hashMap);
        liveStatePlayer.U1();
        c("warmUpWithMediaData success playToken = " + liveStatePlayer.Y());
        dba dbaVar = this.c;
        if (dbaVar != null) {
            dbaVar.j0.g = System.currentTimeMillis();
        }
        return liveStatePlayer;
    }
}
