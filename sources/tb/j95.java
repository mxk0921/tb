package tb;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWLifecycleType;
import com.taobao.avplayer.DWPlayerControlViewController;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.core.model.DWResponse;
import com.taobao.avplayer.core.protocol.DWInteractiveVideoObject;
import com.taobao.media.DWViewUtil;
import com.taobao.media.MediaTimeUtils;
import com.taobao.taobao.R;
import com.taobao.taobaoavsdk.CodeUsageCounter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class j95 implements ytb, ctb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FrameLayout f21845a;
    public final DWContext b;
    public ProgressBar c;
    public boolean e;
    public TextView f;
    public t85 g;
    public boolean i;
    public b j;
    public boolean d = false;
    public DWLifecycleType h = DWLifecycleType.BEFORE;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements ltb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.ltb
        public void onError(DWResponse dWResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f1dda8d", new Object[]{this, dWResponse});
            }
        }

        @Override // tb.ltb
        public void onSuccess(DWResponse dWResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6105f72", new Object[]{this, dWResponse});
                return;
            }
            try {
                DWInteractiveVideoObject dWInteractiveVideoObject = new DWInteractiveVideoObject(dWResponse.data);
                if (j95.a(j95.this) != null) {
                    j95.a(j95.this).e(dWInteractiveVideoObject);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
    }

    static {
        t2o.a(452985159);
        t2o.a(452985011);
        t2o.a(452985037);
    }

    public j95(DWContext dWContext, FrameLayout frameLayout) {
        this.b = dWContext;
        this.f21845a = frameLayout;
        e();
        CodeUsageCounter.c().a(CodeUsageCounter.componentName.dw_sdk_DWSmallBarViewController);
    }

    public static /* synthetic */ t85 a(j95 j95Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t85) ipChange.ipc$dispatch("f145ac0e", new Object[]{j95Var});
        }
        return j95Var.g;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0419cfd", new Object[]{this});
        } else if (this.g != null) {
            this.e = true;
            this.b.queryInteractiveData(new a(), false);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
        } else if (f()) {
            if (this.c != null) {
                d(false);
                b bVar = this.j;
                if (bVar != null) {
                    ((DWPlayerControlViewController.a) bVar).a();
                }
            }
            TextView textView = this.f;
            if (textView != null) {
                textView.setVisibility(8);
            }
            this.i = false;
        }
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("934edda9", new Object[]{this, new Boolean(z)});
        } else if (!this.d) {
            ProgressBar progressBar = this.c;
            if (!(progressBar == null || progressBar.getVisibility() == 4)) {
                this.c.setVisibility(8);
            }
            this.d = z;
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        this.c = (ProgressBar) LayoutInflater.from(this.b.getActivity()).inflate(R.layout.dw_tbavsdk_video_silence, (ViewGroup) null, false);
        if (this.b.isMiniProgressAnchorShown()) {
            this.g = new t85(this.b, this.c);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, DWViewUtil.dip2px(this.b.getActivity(), 2.0f));
        layoutParams.gravity = 80;
        this.f21845a.addView(this.c, 0, layoutParams);
        if (this.b.isHiddenMiniProgressBar()) {
            d(true);
        }
        if (!this.b.isHiddenPlayingIcon()) {
            TextView textView = new TextView(this.b.getActivity());
            this.f = textView;
            textView.setTextColor(this.b.getActivity().getResources().getColor(R.color.dw_interactive_sdk_white));
            this.f.setSingleLine();
            this.f.setTextSize(2, 14.0f);
            this.f.setShadowLayer(4.0f, 0.0f, 1.0f, this.b.getActivity().getResources().getColor(R.color.dw_interactive_sdk_black_12));
            this.f.setText(this.b.getActivity().getResources().getString(R.string.tbavsdk_defaulttime));
            this.f.setGravity(85);
            this.f.setPadding(0, 0, DWViewUtil.dip2px(this.b.getActivity(), 3.0f), DWViewUtil.dip2px(this.b.getActivity(), 2.0f));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(DWViewUtil.dip2px(this.b.getActivity(), 80.0f), DWViewUtil.dip2px(this.b.getActivity(), 40.0f));
            layoutParams2.rightMargin = DWViewUtil.dip2px(this.b.getActivity(), 10.0f);
            layoutParams2.bottomMargin = DWViewUtil.dip2px(this.b.getActivity(), 8.0f);
            layoutParams2.gravity = 85;
            this.f21845a.addView(this.f, 1, layoutParams2);
        }
        c();
    }

    public boolean f() {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd96e7a3", new Object[]{this})).booleanValue();
        }
        ProgressBar progressBar = this.c;
        if (progressBar == null) {
            return false;
        }
        if (progressBar.getVisibility() == 0 || ((textView = this.f) != null && textView.getVisibility() == 0)) {
            return true;
        }
        return false;
    }

    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        TextView textView = this.f;
        if (textView != null) {
            if (!z || !this.i) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
    }

    public void h(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa96084c", new Object[]{this, bVar});
        } else {
            this.j = bVar;
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else if (!f()) {
            DWLifecycleType dWLifecycleType = this.h;
            DWLifecycleType dWLifecycleType2 = DWLifecycleType.MID;
            if (dWLifecycleType == dWLifecycleType2 && this.c != null) {
                k(false);
                b bVar = this.j;
                if (bVar != null) {
                    ((DWPlayerControlViewController.a) bVar).b();
                }
            }
            if (this.h == dWLifecycleType2 && this.f != null && this.b.isMute()) {
                this.f.setVisibility(0);
            }
            this.i = true;
        }
    }

    public void j(boolean z) {
        t85 t85Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127138cd", new Object[]{this, new Boolean(z)});
        } else if ((this.h != DWLifecycleType.MID && z) || (t85Var = this.g) == null) {
        } else {
            if (z) {
                if (!this.e) {
                    b();
                }
                this.g.f();
                return;
            }
            t85Var.a();
        }
    }

    public void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7cf0564", new Object[]{this, new Boolean(z)});
            return;
        }
        ProgressBar progressBar = this.c;
        if (progressBar == null) {
            return;
        }
        if (!this.d || z) {
            this.d = false;
            progressBar.setVisibility(0);
        }
    }

    public final void l(int i, int i2, int i3) {
        int i4 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("602c0de6", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        if (i3 > 0) {
            i4 = (int) Math.ceil(((i * 1.0f) / i3) * 1000.0f);
        }
        this.c.setProgress(i4);
        this.c.setSecondaryProgress(i2 * 10);
        if (i > i3) {
            i = i3;
        }
        if (this.f != null && this.b.isMute()) {
            this.f.setText(MediaTimeUtils.msStringForTime(i3 - i));
        }
    }

    @Override // tb.ctb
    public void onLifecycleChanged(DWLifecycleType dWLifecycleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e41106", new Object[]{this, dWLifecycleType});
            return;
        }
        this.h = dWLifecycleType;
        if (dWLifecycleType == DWLifecycleType.BEFORE || dWLifecycleType == DWLifecycleType.MID_BEGIN || dWLifecycleType == DWLifecycleType.MID_END || dWLifecycleType == DWLifecycleType.AFTER) {
            c();
        } else if (dWLifecycleType == DWLifecycleType.MID) {
            i();
            j(this.b.isShowInteractive());
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
            return;
        }
        ProgressBar progressBar = this.c;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
        c();
    }

    @Override // tb.ytb
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
        } else {
            c();
        }
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
        } else {
            l(i, i2, i3);
        }
    }

    @Override // tb.ytb
    public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
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
        }
    }
}
