package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWInstanceType;
import com.taobao.avplayer.r;
import com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent;
import com.taobao.tao.flexbox.layoutmanager.player.IPlayBack;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class w9w extends IPlayBack {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public r j;
    public JSONObject k;
    public boolean l = false;

    static {
        t2o.a(502268293);
    }

    public w9w(TBVideoComponent tBVideoComponent) {
        super(tBVideoComponent);
    }

    public static /* synthetic */ Object ipc$super(w9w w9wVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1851217903) {
            super.onVideoProgressChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
            return null;
        } else if (hashCode == -1028467347) {
            super.onVideoStart();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/flexbox/layoutmanager/player/VideoPlayBack");
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.player.IPlayBack
    public void a(boolean z, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4791a7f", new Object[]{this, new Boolean(z), view});
            return;
        }
        r rVar = this.j;
        if (rVar != null) {
            if (z) {
                rVar.v0(true);
            }
            this.j.G0(null);
            this.j.C0(null);
            this.j.K0(null);
            this.j.y();
            k();
            h(null);
            this.c = null;
            this.j = null;
            this.d = 0;
            this.l = false;
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.player.IPlayBack
    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fda41214", new Object[]{this})).booleanValue();
        }
        return this.l;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.player.IPlayBack
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c06fe4d", new Object[]{this})).booleanValue();
        }
        if (this.j == null) {
            return false;
        }
        return this.f;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.player.IPlayBack
    public void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        r rVar = this.j;
        if (rVar != null) {
            rVar.V(z);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.player.IPlayBack
    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd55d6b9", new Object[]{this})).booleanValue();
        }
        r rVar = this.j;
        if (rVar != null && rVar.H() == 2) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.player.IPlayBack
    public void n(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("269adb37", new Object[]{this, view});
            return;
        }
        r rVar = this.j;
        if (rVar != null) {
            rVar.t0(DWInstanceType.VIDEO);
            this.j.O0();
            this.b = System.currentTimeMillis();
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.player.IPlayBack
    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee4a8db9", new Object[]{this})).booleanValue();
        }
        r rVar = this.j;
        if (rVar != null && rVar.H() == 1) {
            return true;
        }
        return false;
    }

    @Override // tb.ztb
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
        } else if (this.j != null) {
            this.c.attachVideoView(w());
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.player.IPlayBack, tb.ztb
    public void onVideoProgressChanged(int i, int i2, int i3) {
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        super.onVideoProgressChanged(i, i2, i3);
        TBVideoComponent.u videoParams = this.c.getVideoParams();
        if (akt.g2() && videoParams != null && (i4 = videoParams.n1) >= 1000 && i >= i4) {
            t(0);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.player.IPlayBack, tb.ztb
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            return;
        }
        super.onVideoStart();
        onVideoPlay();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.player.IPlayBack
    public int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1f56123", new Object[]{this})).intValue();
        }
        if (this.j == null) {
            return -1;
        }
        return this.d;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.player.IPlayBack
    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        r rVar = this.j;
        if (rVar != null) {
            rVar.Y();
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.player.IPlayBack
    public void t(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e9bfbe4", new Object[]{this, new Integer(i)});
            return;
        }
        r rVar = this.j;
        if (rVar != null) {
            rVar.d0(i);
        }
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        r rVar = this.j;
        if (rVar != null) {
            rVar.W();
        }
    }

    public final void y(TBVideoComponent.u uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d095f2", new Object[]{this, uVar});
        } else if (e(uVar)) {
            this.j.V(this.c.isMute());
        } else {
            this.j.V(uVar.L0);
        }
    }

    @Override // tb.eub
    public void onVideoRecycled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3803834", new Object[]{this});
            return;
        }
        tfs.e("videoplayback", "onVideoRecycled");
        this.l = true;
        if (this.f12345a != null && TBVideoComponent.i0()) {
            this.f12345a.U0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01eb  */
    @Override // com.taobao.tao.flexbox.layoutmanager.player.IPlayBack
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.avplayer.r q(android.content.Context r5, int r6, int r7, boolean r8, boolean r9, com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.w9w.q(android.content.Context, int, int, boolean, boolean, com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent, boolean, boolean):com.taobao.avplayer.r");
    }
}
