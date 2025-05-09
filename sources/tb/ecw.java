package tb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.HImageView;
import com.taobao.taobao.R;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ecw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f18483a;
    public final ViewGroup b;
    public final TaoLiveVideoView c;
    public HImageView d;
    public ImageView e;
    public ImageView f;
    public TextView g;
    public TUrlImageView h;
    public final ov4 i = new ov4();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ehw.b(ecw.a(ecw.this), 0);
            ehw.b(ecw.b(ecw.this), 0);
            ehw.b(ecw.c(ecw.this), 0);
            ehw.b(ecw.d(ecw.this), 0);
        }
    }

    static {
        t2o.a(491782193);
    }

    public ecw(Context context, ViewGroup viewGroup, TaoLiveVideoView taoLiveVideoView) {
        this.f18483a = context;
        this.b = viewGroup;
        this.c = taoLiveVideoView;
        f();
    }

    public static /* synthetic */ TUrlImageView a(ecw ecwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("9e0446e9", new Object[]{ecwVar});
        }
        return ecwVar.h;
    }

    public static /* synthetic */ ImageView b(ecw ecwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("366b1dfe", new Object[]{ecwVar});
        }
        return ecwVar.f;
    }

    public static /* synthetic */ ImageView c(ecw ecwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("1034eb3f", new Object[]{ecwVar});
        }
        return ecwVar.e;
    }

    public static /* synthetic */ HImageView d(ecw ecwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HImageView) ipChange.ipc$dispatch("5fd34231", new Object[]{ecwVar});
        }
        return ecwVar.d;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a62ad192", new Object[]{this});
            return;
        }
        this.i.g();
        ehw.b(this.h, 8);
        ehw.b(this.f, 8);
        ehw.b(this.e, 8);
        ehw.b(this.d, 8);
    }

    public final void f() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        this.d = new HImageView(this.f18483a);
        this.f = new ImageView(this.f18483a);
        this.e = new ImageView(this.f18483a);
        this.d.setWhenNullClearImg(true);
        if (this.c != null) {
            view = LayoutInflater.from(this.f18483a).inflate(R.layout.h_video_view_extend, (ViewGroup) this.c, false);
        } else {
            view = null;
        }
        this.d.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f.setImageResource(R.color.video_view_white_overlay);
        this.e.setImageResource(17170443);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.b.addView(this.c, 0, layoutParams);
        this.b.addView(this.e, 1, layoutParams);
        this.b.addView(this.f, 2, layoutParams);
        this.b.addView(this.d, 3, layoutParams);
        this.b.addView(view, 4, layoutParams);
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72565e6f", new Object[]{this})).booleanValue();
        }
        HImageView hImageView = this.d;
        if (hImageView != null && hImageView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b01401bc", new Object[]{this, new Integer(i)});
        } else {
            this.d.setBackgroundColor(i);
        }
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e694ff7", new Object[]{this, str});
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            s();
        }
        p2b.q(this.d, str, null, dje.GUESS_IMAGE_STRATEGY_CONFIG);
        this.d.setImageUrl(str);
    }

    public void j(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cd080cf", new Object[]{this, drawable});
        } else {
            this.d.setImageDrawable(drawable);
        }
    }

    public void k(ImageView.ScaleType scaleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d533a210", new Object[]{this, scaleType});
        } else {
            this.d.setScaleType(scaleType);
        }
    }

    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24f4be54", new Object[]{this, str});
            return;
        }
        if (this.g == null) {
            this.g = (TextView) this.b.findViewById(R.id.tv_duration);
        }
        TextView textView = this.g;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void m(String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be56d1fc", new Object[]{this, str});
            return;
        }
        if (this.h == null) {
            this.h = (TUrlImageView) this.b.findViewById(R.id.iv_play_btn);
        }
        if (!TextUtils.isEmpty(str)) {
            i = owo.e(this.f18483a, str, 0);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        layoutParams.topMargin = i;
        this.h.setLayoutParams(layoutParams);
    }

    public void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f977682d", new Object[]{this, str});
            return;
        }
        if (this.h == null) {
            this.h = (TUrlImageView) this.b.findViewById(R.id.iv_play_btn);
        }
        if (this.h != null && !TextUtils.isEmpty(str)) {
            int e = owo.e(this.f18483a, str, 0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
            layoutParams.width = e;
            layoutParams.height = e;
            this.h.setLayoutParams(layoutParams);
        }
    }

    public void o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7c5c30b", new Object[]{this, new Integer(i)});
        } else {
            this.e.setImageResource(i);
        }
    }

    public void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("285fe304", new Object[]{this, str});
            return;
        }
        TUrlImageView tUrlImageView = (TUrlImageView) this.b.findViewById(R.id.iv_play_btn);
        this.h = tUrlImageView;
        if (tUrlImageView != null) {
            p2b.q(tUrlImageView, str, null, dje.GUESS_IMAGE_STRATEGY_CONFIG);
            this.h.setImageUrl(str);
        }
    }

    public void q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1931833a", new Object[]{this, new Integer(i)});
        } else {
            this.c.setAspectRatio(i);
        }
    }

    public void r(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3966fea8", new Object[]{this, new Integer(i)});
        } else {
            this.f.setImageResource(i);
        }
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb3ff68d", new Object[]{this});
        } else {
            this.i.f(new a(), this.f18483a);
        }
    }
}
