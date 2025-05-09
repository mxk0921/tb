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
import com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl.dwplayer.view.NewPlayControlVideoView;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class g1k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f19678a;
    public final ViewGroup b;
    public final ViewGroup c;
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
            ehw.b(g1k.a(g1k.this), 0);
            ehw.b(g1k.b(g1k.this), 0);
            ehw.b(g1k.c(g1k.this), 0);
            ehw.b(g1k.d(g1k.this), 0);
        }
    }

    static {
        t2o.a(491782207);
    }

    public g1k(Context context, ViewGroup viewGroup, ViewGroup viewGroup2, String str) {
        this.f19678a = context;
        this.b = viewGroup;
        this.c = viewGroup2;
        g(str);
    }

    public static /* synthetic */ TUrlImageView a(g1k g1kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("d47cbf82", new Object[]{g1kVar});
        }
        return g1kVar.h;
    }

    public static /* synthetic */ ImageView b(g1k g1kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("564757b5", new Object[]{g1kVar});
        }
        return g1kVar.f;
    }

    public static /* synthetic */ ImageView c(g1k g1kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("969fd8d4", new Object[]{g1kVar});
        }
        return g1kVar.e;
    }

    public static /* synthetic */ HImageView d(g1k g1kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HImageView) ipChange.ipc$dispatch("61b9659e", new Object[]{g1kVar});
        }
        return g1kVar.d;
    }

    public final void e(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd308748", new Object[]{this, str});
            return;
        }
        TextView textView = new TextView(this.f19678a);
        if (TextUtils.equals(str, NewPlayControlVideoView.VIDEO_TYPE_PLAY_INFO)) {
            str2 = "统一播放器-播控信息播放";
        } else if (TextUtils.equals(str, "videoId")) {
            str2 = "统一播放器-videoId播放";
        } else {
            str2 = "统一播放器—videoUrl播放";
        }
        textView.setText(str2);
        textView.setTextColor(-65536);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.leftMargin = pb6.c(this.b.getContext(), 25.0f);
        this.b.addView(textView, marginLayoutParams);
    }

    public void f() {
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

    public final void g(String str) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf688a6", new Object[]{this, str});
            return;
        }
        this.d = new HImageView(this.f19678a);
        this.f = new ImageView(this.f19678a);
        this.e = new ImageView(this.f19678a);
        this.d.setWhenNullClearImg(true);
        if (this.c != null) {
            view = LayoutInflater.from(this.f19678a).inflate(R.layout.h_video_view_extend, this.c, false);
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
        if (cw6.b()) {
            e(str);
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca3e8649", new Object[]{this});
        } else {
            this.b.removeAllViews();
        }
    }

    public void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b01401bc", new Object[]{this, new Integer(i)});
        } else {
            this.d.setBackgroundColor(i);
        }
    }

    public void j(String str) {
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

    public void k(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cd080cf", new Object[]{this, drawable});
        } else {
            this.d.setImageDrawable(drawable);
        }
    }

    public void l(ImageView.ScaleType scaleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d533a210", new Object[]{this, scaleType});
        } else {
            this.d.setScaleType(scaleType);
        }
    }

    public void m(String str) {
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

    public void n(String str) {
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
            i = owo.e(this.f19678a, str, 0);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        layoutParams.topMargin = i;
        this.h.setLayoutParams(layoutParams);
    }

    public void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f977682d", new Object[]{this, str});
            return;
        }
        if (this.h == null) {
            this.h = (TUrlImageView) this.b.findViewById(R.id.iv_play_btn);
        }
        if (this.h != null && !TextUtils.isEmpty(str)) {
            int e = owo.e(this.f19678a, str, 0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
            layoutParams.width = e;
            layoutParams.height = e;
            this.h.setLayoutParams(layoutParams);
        }
    }

    public void p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7c5c30b", new Object[]{this, new Integer(i)});
        } else {
            this.e.setImageResource(i);
        }
    }

    public void q(String str) {
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
            this.i.f(new a(), this.f19678a);
        }
    }
}
