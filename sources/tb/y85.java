package tb;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.media.DWViewUtil;
import com.taobao.mediaplay.playercontrol.ProgressImageView;
import com.taobao.taobao.R;
import com.taobao.taobaoavsdk.CodeUsageCounter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class y85 implements ytb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ViewGroup f31905a;
    public final DWContext b;
    public ProgressImageView c;
    public TextView d;
    public TextView e;
    public Animation f;
    public View g;
    public boolean h;
    public boolean i = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if ((y85.a(y85.this) == null || y85.a(y85.this).getVideo() == null || y85.a(y85.this).getVideo().i() == 3) && y85.a(y85.this) != null) {
                y85 y85Var = y85.this;
                y85.b(y85Var, y85.a(y85Var).getActivity().getString(R.string.dw_tbavsdk_video_error_for_server));
            }
        }
    }

    static {
        t2o.a(452985149);
        t2o.a(452985011);
    }

    public y85(DWContext dWContext) {
        this.b = dWContext;
        j();
        CodeUsageCounter.c().a(CodeUsageCounter.componentName.dw_sdk_DWNoticeViewController);
    }

    public static /* synthetic */ DWContext a(y85 y85Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWContext) ipChange.ipc$dispatch("d7bc37c", new Object[]{y85Var});
        }
        return y85Var.b;
    }

    public static /* synthetic */ void b(y85 y85Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d24e1ac", new Object[]{y85Var, str});
        } else {
            y85Var.o(str);
        }
    }

    public static /* synthetic */ boolean c(y85 y85Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ba8293", new Object[]{y85Var, new Boolean(z)})).booleanValue();
        }
        y85Var.h = z;
        return z;
    }

    public static /* synthetic */ View d(y85 y85Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c1d603a6", new Object[]{y85Var});
        }
        return y85Var.g;
    }

    public static /* synthetic */ ViewGroup e(y85 y85Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("ab084410", new Object[]{y85Var});
        }
        return y85Var.f31905a;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        TextView textView = this.d;
        if (textView != null) {
            textView.setOnClickListener(null);
        }
        ProgressImageView progressImageView = this.c;
        if (progressImageView != null) {
            progressImageView.setVisibility(8);
        }
    }

    public View g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.f31905a;
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa48b2ee", new Object[]{this});
            return;
        }
        this.c.setVisibility(8);
        this.f31905a.setBackgroundColor(this.b.getActivity().getResources().getColor(17170445));
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70283098", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.f31905a;
        if (viewGroup != null && viewGroup.getVisibility() != 8) {
            this.f31905a.setVisibility(8);
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.b.getActivity()).inflate(R.layout.dw_tbavsdk_video_notice, (ViewGroup) null, false);
        this.f31905a = viewGroup;
        this.g = viewGroup.findViewById(R.id.tbavsdk_video_error_notice_layout);
        this.c = (ProgressImageView) this.f31905a.findViewById(R.id.tbavsdk_video_loading);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        this.f = rotateAnimation;
        rotateAnimation.setDuration(600L);
        this.f.setInterpolator(new LinearInterpolator());
        this.f.setRepeatCount(-1);
        TextView textView = (TextView) this.f31905a.findViewById(R.id.tbavsdk_video_retry_tv);
        this.d = textView;
        textView.setOnClickListener(new w85(this));
        this.e = (TextView) this.f31905a.findViewById(R.id.tbavsdk_video_notice_tv);
        p(this.b.screenType());
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be9ca394", new Object[]{this})).booleanValue();
        }
        ProgressImageView progressImageView = this.c;
        if (progressImageView != null && progressImageView.getVisibility() == 8) {
            return true;
        }
        return false;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("238f9fff", new Object[]{this})).booleanValue();
        }
        if (this.f31905a.getVisibility() == 0 && this.d.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public void m(String str, boolean z) {
        DWContext dWContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03e5802", new Object[]{this, str, new Boolean(z)});
            return;
        }
        ProgressImageView progressImageView = this.c;
        int i = 8;
        if (progressImageView != null) {
            progressImageView.setVisibility(8);
        }
        if (this.f31905a != null && (dWContext = this.b) != null && !dWContext.isHiddenPlayErrorView()) {
            this.i = z;
            this.h = true;
            this.g.setVisibility(0);
            if (this.g.getLayoutParams() != null && (this.g.getLayoutParams() instanceof FrameLayout.LayoutParams) && !z) {
                ((FrameLayout.LayoutParams) this.g.getLayoutParams()).topMargin = 0;
            }
            this.f31905a.setBackgroundColor(this.b.getActivity().getResources().getColor(R.color.dw_tbavsdk_black_a));
            TextView textView = this.d;
            if (z) {
                i = 0;
            }
            textView.setVisibility(i);
            this.e.setText(str);
            this.f31905a.setVisibility(0);
            this.e.setVisibility(0);
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27d82d53", new Object[]{this});
        } else if (this.f31905a != null && this.b != null) {
            this.d.setVisibility(8);
            this.e.setVisibility(8);
            if (!this.h && !this.b.isHiddenLoading()) {
                this.g.setVisibility(8);
                this.c.setVisibility(0);
                this.f31905a.setVisibility(0);
            }
        }
    }

    public final void o(String str) {
        DWContext dWContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81dff581", new Object[]{this, str});
            return;
        }
        ProgressImageView progressImageView = this.c;
        if (progressImageView != null) {
            progressImageView.setVisibility(8);
        }
        if (this.f31905a != null && (dWContext = this.b) != null && !dWContext.isHiddenPlayErrorView() && this.i) {
            this.f31905a.setBackgroundColor(this.b.getActivity().getResources().getColor(R.color.dw_tbavsdk_black_a));
            this.g.setVisibility(0);
            this.d.setVisibility(0);
            this.e.setText(str);
            this.f31905a.setVisibility(0);
            this.e.setVisibility(0);
        }
    }

    @Override // tb.ytb
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
        }
    }

    @Override // tb.ytb
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
        }
    }

    @Override // tb.ytb
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            return;
        }
        DWContext dWContext = this.b;
        if (dWContext == null || !ewj.a(dWContext.getActivity())) {
            DWContext dWContext2 = this.b;
            if (dWContext2 != null) {
                o(dWContext2.getActivity().getString(R.string.tbavsdk_nonetwork_error_state));
                return;
            }
            return;
        }
        new Handler().postDelayed(new a(), 2000L);
    }

    @Override // tb.ytb
    public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
        }
    }

    @Override // tb.ytb
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.ytb
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
        } else {
            h();
        }
    }

    @Override // tb.ytb
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
        }
    }

    @Override // tb.ytb
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    @Override // tb.ytb
    public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
        } else {
            p(dWVideoScreenType);
        }
    }

    @Override // tb.ytb
    public void onVideoSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.ytb
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
        } else {
            h();
        }
    }

    public final void p(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d2b10c", new Object[]{this, dWVideoScreenType});
        } else if (DWVideoScreenType.LANDSCAPE_FULL_SCREEN == dWVideoScreenType) {
            this.e.setTextSize(2, 18.0f);
            this.d.setTextSize(2, 18.0f);
            this.d.getLayoutParams().width = DWViewUtil.dip2px(this.b.getActivity(), 100.0f);
            this.d.getLayoutParams().height = DWViewUtil.dip2px(this.b.getActivity(), 40.0f);
            ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = DWViewUtil.dip2px(this.b.getActivity(), 24.0f);
        } else {
            this.e.setTextSize(2, 13.0f);
            this.d.setTextSize(2, 13.0f);
            this.d.getLayoutParams().width = DWViewUtil.dip2px(this.b.getActivity(), 80.0f);
            this.d.getLayoutParams().height = DWViewUtil.dip2px(this.b.getActivity(), 30.0f);
            ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = DWViewUtil.dip2px(this.b.getActivity(), 24.0f);
        }
    }
}
