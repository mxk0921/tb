package com.taobao.tao.flexbox.layoutmanager.player;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.r;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent;
import java.util.ArrayList;
import java.util.HashMap;
import tb.c7w;
import tb.caw;
import tb.dbw;
import tb.eaw;
import tb.eub;
import tb.g7m;
import tb.g7w;
import tb.h6w;
import tb.h7w;
import tb.j2h;
import tb.n7w;
import tb.o9w;
import tb.od0;
import tb.ogi;
import tb.t2o;
import tb.tfs;
import tb.vbw;
import tb.vu3;
import tb.wgb;
import tb.ztb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class IPlayBack implements ztb, eub {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean i;

    /* renamed from: a  reason: collision with root package name */
    public final TBVideoComponent f12345a;
    public long b;
    public TBVideoComponent.VideoView c;
    public int d;
    public int e;
    public boolean f;
    public String g;
    public eaw h;

    static {
        t2o.a(502268282);
        t2o.a(452985010);
        t2o.a(452985016);
    }

    public IPlayBack(TBVideoComponent tBVideoComponent) {
        this.f12345a = tBVideoComponent;
        r();
    }

    public static void r() {
        wgb e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40b3809e", new Object[0]);
        } else if (!i && (e = od0.D().e()) != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("time");
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(TypedValues.CycleType.S_WAVE_PHASE);
            e.b("tnode", "player", arrayList, arrayList2, true);
            i = true;
        }
    }

    public abstract void a(boolean z, View view);

    public boolean b(h7w h7wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e5d401d", new Object[]{this, h7wVar})).booleanValue();
        }
        eaw eawVar = this.h;
        if (eawVar != null) {
            return ((g7m) eawVar).p(h7wVar);
        }
        return false;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad59947a", new Object[]{this});
        }
        if (this instanceof j2h) {
            return "playerlive";
        }
        return "player";
    }

    public boolean d(TBVideoComponent.u uVar) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d704ea0d", new Object[]{this, uVar})).booleanValue();
        }
        Object obj2 = uVar.X0;
        if ((obj2 == null || ((obj2 instanceof String) && TextUtils.isEmpty((String) obj2))) && ((obj = uVar.W0) == null || ((obj instanceof String) && TextUtils.isEmpty((String) obj)))) {
            return true;
        }
        return false;
    }

    public boolean e(TBVideoComponent.u uVar) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7142e58e", new Object[]{this, uVar})).booleanValue();
        }
        Object obj = uVar.X0;
        if (obj == null || uVar.W0 == null) {
            z = false;
            z2 = false;
        } else {
            if (obj instanceof String) {
                z2 = !TextUtils.isEmpty((String) obj);
            } else {
                z2 = true;
            }
            Object obj2 = uVar.W0;
            if (obj2 instanceof String) {
                z = !TextUtils.isEmpty((String) obj2);
            } else {
                z = true;
            }
        }
        if (!z2 || !z) {
            return false;
        }
        return true;
    }

    public abstract boolean f();

    public abstract boolean g();

    public IPlayBack h(eaw eawVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPlayBack) ipChange.ipc$dispatch("74951c53", new Object[]{this, eawVar});
        }
        this.h = eawVar;
        return this;
    }

    public final void i(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db0023e6", new Object[]{this, new Long(j)});
            return;
        }
        wgb e = od0.D().e();
        if (e != null) {
            HashMap hashMap = new HashMap();
            double currentTimeMillis = System.currentTimeMillis() - j;
            if (currentTimeMillis < vu3.b.GEO_NOT_SUPPORT) {
                currentTimeMillis = 0.0d;
            }
            hashMap.put("time", Double.valueOf(currentTimeMillis));
            HashMap hashMap2 = new HashMap();
            hashMap2.put(TypedValues.CycleType.S_WAVE_PHASE, ImageLoader.Scene.FIRST_FRAME);
            e.a("tnode", "player", hashMap, hashMap2);
            u(String.valueOf(currentTimeMillis));
        }
    }

    public abstract void j(boolean z);

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dc6d405", new Object[]{this});
        } else {
            b(new h6w(this));
        }
    }

    public void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93f0118d", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public abstract boolean m();

    public abstract void n(View view);

    public abstract boolean o();

    @Override // tb.ztb
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
        }
    }

    @Override // tb.ztb
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            return;
        }
        this.d = 0;
        b(new c7w(this, false));
    }

    @Override // tb.ztb
    public void onVideoError(Object obj, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i2), new Integer(i3)});
        } else {
            b(new g7w(this));
        }
    }

    @Override // tb.ztb
    public void onVideoFullScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dcccbde", new Object[]{this});
        }
    }

    @Override // tb.ztb
    public void onVideoNormalScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff4b0936", new Object[]{this});
        }
    }

    @Override // tb.ztb
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
        } else {
            b(new o9w(this));
        }
    }

    @Override // tb.ztb
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
        } else if (ogi.e().i(this.f12345a.o0()) == null) {
            b(new caw(this));
        }
    }

    @Override // tb.ztb
    public void onVideoProgressChanged(int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.d = i2;
        int i5 = this.e;
        if (i5 == 0 || i2 - i5 >= 1000) {
            b(new vbw(this));
            this.e = i2;
        }
    }

    @Override // tb.ztb
    public void onVideoSeekTo(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i2)});
        }
    }

    @Override // tb.ztb
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
        } else {
            b(new dbw(this));
        }
    }

    public abstract int p();

    public abstract r q(Context context, int i2, int i3, boolean z, boolean z2, TBVideoComponent tBVideoComponent, boolean z3, boolean z4);

    public abstract void s();

    public void t(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e9bfbe4", new Object[]{this, new Integer(i2)});
        }
    }

    public final void u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8448e327", new Object[]{this, str});
            return;
        }
        od0.D().d().a("TNode", 19999, c(), "", "", "time=" + str, "phase=firstframe", "pageName=" + this.g);
    }

    public View w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a703e6c9", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.ztb
    public void onVideoInfo(Object obj, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i2), new Integer(i3)});
        } else if (3 == i2) {
            i(this.b);
            b(new n7w(this));
            tfs.c("AVSDK_IPlayBackSharePlayer", "onVideoInfo 首帧加载成功");
            this.c.hideCoverView();
        }
    }
}
