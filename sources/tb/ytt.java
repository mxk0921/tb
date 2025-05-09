package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.s;
import com.taobao.taolive.room.player.standard.state.BaseStatePlayer;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ytt extends BaseStatePlayer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093203);
    }

    public ytt(Context context, cdr cdrVar) {
        super(context, cdrVar);
    }

    public static /* synthetic */ Object ipc$super(ytt yttVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/player/standard/state/TimeMoveStatePlayer");
    }

    public void V1(String str, String str2, IMediaPlayer.AspectRatio aspectRatio) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdaf01f2", new Object[]{this, str, str2, aspectRatio});
            return;
        }
        N(0L);
        if (pvs.d0()) {
            u1(aspectRatio);
        }
        if (!TextUtils.isEmpty(str2)) {
            Y1(null, str2);
        } else {
            Y1(str, null);
        }
        K();
        I1();
    }

    public boolean W1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4651e6b5", new Object[]{this})).booleanValue();
        }
        return yrr.c().h(this.f.f(), 0L);
    }

    public void Y1(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cabf182", new Object[]{this, str, str2});
            return;
        }
        Z0();
        if (!TextUtils.isEmpty(str)) {
            s.d dVar = this.f;
            dVar.l = str;
            dVar.k = 2;
            dVar.n = "TBLive";
        } else if (!TextUtils.isEmpty(str2)) {
            s.d dVar2 = this.f;
            dVar2.k = 1;
            dVar2.n = "TBVideoVideoIDPlayer";
            dVar2.getClass();
            s.d dVar3 = this.f;
            dVar3.r = 2;
            dVar3.m = str2;
        }
        A1("TimeMovingPlay");
    }

    @Override // com.taobao.taolive.room.player.standard.state.BaseStatePlayer
    public void t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("539f89f7", new Object[]{this});
            return;
        }
        s.d dVar = this.f;
        dVar.A = false;
        dVar.B = 0;
        if (pvs.A1()) {
            this.f.p = true;
        }
    }

    public int X1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("150e68f3", new Object[]{this})).intValue();
        }
        Map d = sr4.d(this.e.n(4500), null);
        if (d != null) {
            return yqq.l(String.valueOf(d.get("p2ff_state")), 0);
        }
        return 0;
    }
}
