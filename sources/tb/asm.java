package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.s;
import com.taobao.taolive.room.player.standard.state.LiveStatePlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class asm extends LiveStatePlayer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093092);
    }

    public asm(Context context, int i) {
        super(context, i);
    }

    public static /* synthetic */ Object ipc$super(asm asmVar, String str, Object... objArr) {
        if (str.hashCode() == 283392344) {
            super.e2();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/player/preload/PreloadLiveStatePlayer");
    }

    @Override // com.taobao.taolive.room.player.standard.state.BaseStatePlayer
    public void N0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8320cda9", new Object[]{this});
        } else {
            C0("PreloadLiveStatePlayeronStateInit");
        }
    }

    @Override // com.taobao.taolive.room.player.standard.state.BaseStatePlayer
    public boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a204efe", new Object[]{this})).booleanValue();
        }
        return pvs.a1();
    }

    @Override // com.taobao.taolive.room.player.standard.state.LiveStatePlayer
    public void e2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10e43958", new Object[]{this});
            return;
        }
        super.e2();
        if (this.P == 1) {
            j2(true);
        }
    }

    public String i2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28c8b474", new Object[]{this});
        }
        s.d dVar = this.f;
        if (dVar != null) {
            return dVar.h();
        }
        return null;
    }

    public final void j2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("256fd9a9", new Object[]{this, new Boolean(z)});
            return;
        }
        s.d dVar = this.f;
        if (dVar != null) {
            dVar.m(z);
        }
    }

    @Override // com.taobao.taolive.room.player.standard.state.LiveStatePlayer, com.taobao.taolive.room.player.standard.state.BaseStatePlayer
    public void t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("539f89f7", new Object[]{this});
            return;
        }
        s.d dVar = this.f;
        dVar.n = "TBLive";
        dVar.i = true;
        A1("LiveRoom");
    }
}
