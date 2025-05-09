package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class pwg implements ykc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_AVATAR_CARD_SHOW = "com.taobao.taolive.room.avatar_card_show";
    public static final String EVENT_DISABLE_UPDOWN_SWITCH = "com.taobao.taolive.room.disable_updown_switch";
    public static final String EVENT_ENABLE_UPDOWN_SWITCH = "com.taobao.taolive.room.enable_updown_switch";

    /* renamed from: a  reason: collision with root package name */
    public long f26357a = 0;

    static {
        t2o.a(779092502);
        t2o.a(779092501);
    }

    @Override // tb.ykc
    public void a(ux9 ux9Var, Object obj) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("663c653c", new Object[]{this, ux9Var, obj});
            return;
        }
        sjr g = sjr.g();
        if (ux9Var == null) {
            str = null;
        } else {
            str = ux9Var.C();
        }
        g.c("com.taobao.taolive.room.goods_list_showing", obj, str);
    }

    @Override // tb.ykc
    public void b(ux9 ux9Var, Object obj) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b46cf8b5", new Object[]{this, ux9Var, obj});
            return;
        }
        sjr g = sjr.g();
        if (ux9Var == null) {
            str = null;
        } else {
            str = ux9Var.C();
        }
        g.c("com.taobao.taolive.room.mediaplatform_switch_room", obj, str);
    }

    @Override // tb.ykc
    public void c(ux9 ux9Var, Object obj) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b938db", new Object[]{this, ux9Var, obj});
            return;
        }
        sjr g = sjr.g();
        if (ux9Var == null) {
            str = null;
        } else {
            str = ux9Var.C();
        }
        g.c("com.taobao.taolive.room.replay_backToLive", obj, str);
    }

    @Override // tb.ykc
    public void d(ux9 ux9Var, Object obj) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec0f3fb3", new Object[]{this, ux9Var, obj});
            return;
        }
        if (ux9Var == null) {
            str = null;
        } else {
            str = ux9Var.C();
        }
        sjr.g().c("com.taobao.taolive.room.killself", null, str);
    }

    @Override // tb.ykc
    public void e(ux9 ux9Var, Object obj) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("511179b8", new Object[]{this, ux9Var, obj});
        } else if (System.currentTimeMillis() - this.f26357a >= 500) {
            this.f26357a = System.currentTimeMillis();
            sjr g = sjr.g();
            if (ux9Var == null) {
                str = null;
            } else {
                str = ux9Var.C();
            }
            g.c(uyg.EVENT_SHOW_GOODSPACKAGE, obj, str);
        }
    }

    @Override // tb.ykc
    public void f(ux9 ux9Var, Object obj) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb2dc0c3", new Object[]{this, ux9Var, obj});
            return;
        }
        sjr g = sjr.g();
        if (ux9Var == null) {
            str = null;
        } else {
            str = ux9Var.C();
        }
        g.c("com.taobao.taolive.room.addcart_for_showcase", obj, str);
    }

    @Override // tb.ykc
    public void g(ux9 ux9Var, Object obj) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fcf81c9", new Object[]{this, ux9Var, obj});
            return;
        }
        sjr g = sjr.g();
        if (ux9Var == null) {
            str = null;
        } else {
            str = ux9Var.C();
        }
        g.c("com.taobao.taolive.room.disable_updown_switch", obj, str);
    }

    @Override // tb.ykc
    public void h(ux9 ux9Var, Object obj) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1eff775", new Object[]{this, ux9Var, obj});
            return;
        }
        sjr g = sjr.g();
        if (ux9Var == null) {
            str = null;
        } else {
            str = ux9Var.C();
        }
        g.c("com.taobao.taolive.room.update_params", obj, str);
    }

    @Override // tb.ykc
    public void i(ux9 ux9Var, Object obj) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2569cf2c", new Object[]{this, ux9Var, obj});
            return;
        }
        sjr g = sjr.g();
        if (ux9Var == null) {
            str = null;
        } else {
            str = ux9Var.C();
        }
        g.c("com.taobao.taolive.room.live_type", obj, str);
    }

    @Override // tb.ykc
    public void j(ux9 ux9Var, Object obj) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d7a3214", new Object[]{this, ux9Var, obj});
            return;
        }
        sjr g = sjr.g();
        if (ux9Var == null) {
            str = null;
        } else {
            str = ux9Var.C();
        }
        g.c(FullScreenFrame.EVENT_BACK_TO_LIVE, obj, str);
    }

    @Override // tb.ykc
    public void k(ux9 ux9Var) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b72769e", new Object[]{this, ux9Var});
            return;
        }
        sjr g = sjr.g();
        if (ux9Var == null) {
            str = null;
        } else {
            str = ux9Var.C();
        }
        g.c("com.taobao.taolive.room.enter_ut_track", null, str);
    }

    @Override // tb.ykc
    public void l(ux9 ux9Var) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80cbf3ec", new Object[]{this, ux9Var});
            return;
        }
        sjr g = sjr.g();
        if (ux9Var == null) {
            str = null;
        } else {
            str = ux9Var.C();
        }
        g.c("com.taobao.taolive.room.enter", null, str);
    }

    @Override // tb.ykc
    public void m(ux9 ux9Var, Object obj) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdad71c0", new Object[]{this, ux9Var, obj});
            return;
        }
        sjr g = sjr.g();
        if (ux9Var == null) {
            str = null;
        } else {
            str = ux9Var.C();
        }
        g.c("com.taobao.taolive.room.mediaplatform_start_video", obj, str);
    }

    @Override // tb.ykc
    public void n(ux9 ux9Var) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11237ede", new Object[]{this, ux9Var});
            return;
        }
        sjr g = sjr.g();
        if (ux9Var == null) {
            str = null;
        } else {
            str = ux9Var.C();
        }
        g.c("com.taobao.taolive.room.enable_updown_switch", null, str);
    }
}
