package tb;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class xwa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f31641a;
    public k0e b;
    public final DXWidgetNode c;
    public final ux9 d;
    public z6m e;
    public qr4 f;
    public DXRootView g;
    public PlayerController2 h;
    public View i;
    public FrameLayout j;
    public LinearLayout k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements k9d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(xwa xwaVar) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements PlayerController2.m {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.m
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6155fcb5", new Object[]{this});
            } else {
                xwa.a(xwa.this).K(false);
            }
        }

        @Override // com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.m
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("db987aa7", new Object[]{this});
            } else {
                xwa.a(xwa.this).K(true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements m9d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.m9d
        public boolean a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5c1881ff", new Object[]{this, new Integer(i)})).booleanValue();
            }
            xwa.this.c(i);
            xwa.b(xwa.this, i);
            return false;
        }
    }

    static {
        t2o.a(779092643);
    }

    public xwa(DXWidgetNode dXWidgetNode, Context context, ux9 ux9Var) {
        this.c = dXWidgetNode;
        this.d = ux9Var;
        this.f31641a = context;
        f();
    }

    public static /* synthetic */ k0e a(xwa xwaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k0e) ipChange.ipc$dispatch("460f2691", new Object[]{xwaVar});
        }
        return xwaVar.b;
    }

    public static /* synthetic */ void b(xwa xwaVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78d6d61b", new Object[]{xwaVar, new Integer(i)});
        } else {
            xwaVar.i(i);
        }
    }

    public void c(int i) {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("393c3ecb", new Object[]{this, new Integer(i)});
            return;
        }
        qr4 qr4Var = this.f;
        if (qr4Var != null && (textView = qr4Var.h) != null) {
            if (i != 0) {
                sbu.g(this.d, "HighlightPlayRate", new String[0]);
                if (i == 1) {
                    this.f.h.setText("1.5X");
                } else if (i == 2) {
                    this.f.h.setText("2.0X");
                }
                this.f.h.setBackground(ContextCompat.getDrawable(this.f31641a, R.drawable.taolive_highlight_dx_oval_bg_select));
                this.f.h.setTextColor(Color.parseColor("#333333"));
                return;
            }
            textView.setText("1.0X");
            this.f.h.setBackground(ContextCompat.getDrawable(this.f31641a, R.drawable.taolive_highlight_dx_oval_bg));
            this.f.h.setTextColor(Color.parseColor("#FFFFFF"));
        }
    }

    public final qr4 d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qr4) ipChange.ipc$dispatch("8b1b4f46", new Object[]{this});
        }
        qr4 qr4Var = new qr4();
        qr4Var.f26892a = this.i.findViewById(R.id.taolive_highlight_dx_play_layout);
        qr4Var.c = (ImageView) this.i.findViewById(R.id.taolive_highlight_dx_video_enter_btn);
        qr4Var.f = (SeekBar) this.i.findViewById(R.id.taolive_highlight_dx_video_seekbar);
        qr4Var.h = (TextView) this.i.findViewById(R.id.taolive_highlight_dx_controller_playrate_icon);
        qr4Var.i = R.drawable.taolive_highlight_video_play_new;
        qr4Var.j = R.drawable.taolive_highlight_video_pause_new;
        return qr4Var;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b6a7494", new Object[]{this});
            return;
        }
        PlayerController2 g = this.b.g();
        this.h = g;
        g.setControllerHolder(this.f);
        this.h.defaultPlayRateViewText = "1.0X";
        this.j.removeAllViews();
        DXRootView a2 = axa.f().a(this.f31641a, "higlight_room_living_state");
        this.g = a2;
        this.j.addView(a2);
        h();
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("446c68de", new Object[]{this});
            return;
        }
        z6m h = dxa.b(this.d).h();
        this.e = h;
        if (h != null && h.b != null) {
            View inflate = LayoutInflater.from(this.f31641a).inflate(R.layout.taolive_highlight_dx_play_controller_layout_new, (ViewGroup) null);
            this.i = inflate;
            this.j = (FrameLayout) inflate.findViewById(R.id.highlight_isSpeakingLayout);
            this.k = (LinearLayout) this.i.findViewById(R.id.highlight_playerLayout);
            this.f = d();
            this.b = this.e.b;
            e();
        }
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65a637e", new Object[]{this, str});
            return;
        }
        ux9 ux9Var = this.d;
        if (ux9Var == null || !(ux9Var.l() instanceof wwa)) {
            c(0);
        } else {
            c(((wwa) this.d.l()).c);
        }
        boolean parseBoolean = Boolean.parseBoolean(str);
        if (!(this.g == null || this.c == null || !parseBoolean)) {
            axa.f().h(this.g, this.c.getDXRuntimeContext().i(), this.d);
        }
        j(parseBoolean);
        h();
    }

    public void h() {
        qr4 qr4Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5dc58be", new Object[]{this});
            return;
        }
        PlayerController2 playerController2 = this.h;
        if (playerController2 != null && (qr4Var = this.f) != null && qr4Var.h != null) {
            playerController2.setIPlayForwardListener(new a(this));
            this.h.setmPlayOrPauseButtonListener(new b());
            this.h.setPlayRateListener(new c());
        }
    }

    public final void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfd8dbd9", new Object[]{this, new Integer(i)});
            return;
        }
        ux9 ux9Var = this.d;
        if (ux9Var != null && (ux9Var.l() instanceof wwa)) {
            ((wwa) this.d.l()).c = i;
        }
    }

    public void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8643d37d", new Object[]{this, new Boolean(z)});
            return;
        }
        FrameLayout frameLayout = this.j;
        if (frameLayout != null && this.k != null) {
            if (z) {
                frameLayout.setVisibility(0);
                this.k.setVisibility(4);
                return;
            }
            frameLayout.setVisibility(4);
            this.k.setVisibility(0);
        }
    }
}
