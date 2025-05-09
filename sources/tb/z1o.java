package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.s;
import com.taobao.taolive.room.player.standard.state.BaseStatePlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class z1o extends BaseStatePlayer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093202);
    }

    public z1o(Context context, cdr cdrVar) {
        super(context, cdrVar);
    }

    public static /* synthetic */ Object ipc$super(z1o z1oVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/player/standard/state/ReplayStatePlayer");
    }

    @Override // com.taobao.taolive.room.player.standard.state.BaseStatePlayer
    public void t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("539f89f7", new Object[]{this});
            return;
        }
        s.d dVar = this.f;
        dVar.n = "TBLive";
        dVar.A = false;
        dVar.B = 0;
        dVar.r = 2;
    }

    public z1o(Context context) {
        super(context);
    }

    public void V1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99f7c5b8", new Object[]{this, str});
            return;
        }
        C0("setDataSource mCurMediaState = " + d0(this.f13225a) + " replayUrl = " + str);
        Z0();
        s.d dVar = this.f;
        dVar.l = str;
        dVar.k = 2;
    }
}
