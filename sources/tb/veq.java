package tb;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.uikit.NxTabLayout;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.h3p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class veq extends NxTabLayout.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DP_IMG_HEIGHT = 16;

    /* renamed from: a  reason: collision with root package name */
    public final RelativeLayout f29966a;
    public final TextView b;
    public final ImageView c;
    public p1m d;
    public final boolean e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f29967a;

        public a(boolean z) {
            this.f29967a = z;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                return;
            }
            veq.this.f29966a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            veq.a(veq.this, this.f29967a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f29968a;

        public b(int i) {
            this.f29968a = i;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            BitmapDrawable drawable = succPhenixEvent.getDrawable();
            if (drawable != null && !succPhenixEvent.isIntermediate()) {
                veq.b(veq.this, drawable, this.f29968a);
            }
            p1m ticket = succPhenixEvent.getTicket();
            if (ticket != null && !ticket.b()) {
                ticket.d(true);
            }
            return true;
        }
    }

    static {
        t2o.a(815793797);
    }

    public veq(LayoutInflater layoutInflater, Context context, boolean z) {
        RelativeLayout relativeLayout = (RelativeLayout) layoutInflater.inflate(R.layout.tbsearch_custom_tab, (ViewGroup) new FrameLayout(context), false);
        this.f29966a = relativeLayout;
        TextView textView = (TextView) relativeLayout.findViewById(R.id.tab_text);
        this.b = textView;
        this.c = (ImageView) relativeLayout.findViewById(R.id.tab_icon);
        FrameLayout frameLayout = (FrameLayout) relativeLayout.findViewById(R.id.tab_item);
        TUrlImageView tUrlImageView = (TUrlImageView) relativeLayout.findViewById(R.id.tab_guide);
        this.e = z;
        if (z) {
            IpChange ipChange = h3p.$ipChange;
            textView.setTextSize(1, h3p.b(h3p.a.INSTANCE.b(), true));
        }
    }

    public static /* synthetic */ void a(veq veqVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cdb79c", new Object[]{veqVar, new Boolean(z)});
        } else {
            veqVar.d(z);
        }
    }

    public static /* synthetic */ void b(veq veqVar, Drawable drawable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5987de8", new Object[]{veqVar, drawable, new Integer(i)});
        } else {
            veqVar.f(drawable, i);
        }
    }

    public static /* synthetic */ Object ipc$super(veq veqVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/tab/SrpTabHolder");
    }

    public void c(String str, int i, int i2, String str2) {
        ImageView imageView;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5197dfa", new Object[]{this, str, new Integer(i), new Integer(i2), str2});
            return;
        }
        p1m p1mVar = this.d;
        if (p1mVar != null && !p1mVar.b()) {
            this.d.a();
        }
        if (!TextUtils.isEmpty(str2) && (imageView = this.c) != null) {
            imageView.setContentDescription(str2);
        }
        if (i2 > 0) {
            i3 = o1p.a((i / i2) * 16.0f);
        }
        this.d = s0m.B().T(str).addLoaderExtra(nd2.BUNDLE_BIZ_CODE, "8920").succListener(new b(i3)).fetch();
    }

    public final void d(boolean z) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8013a9fb", new Object[]{this, new Boolean(z)});
            return;
        }
        RelativeLayout relativeLayout = this.f29966a;
        relativeLayout.setPivotX(relativeLayout.getMeasuredWidth() / 2.0f);
        RelativeLayout relativeLayout2 = this.f29966a;
        relativeLayout2.setPivotY(relativeLayout2.getMeasuredHeight() / 2.0f);
        RelativeLayout relativeLayout3 = this.f29966a;
        float f2 = 1.0f;
        if (z) {
            f = 1.125f;
        } else {
            f = 1.0f;
        }
        relativeLayout3.setScaleX(f);
        RelativeLayout relativeLayout4 = this.f29966a;
        if (z) {
            f2 = 1.125f;
        }
        relativeLayout4.setScaleY(f2);
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4325830", new Object[]{this, new Boolean(z)});
        } else if (!this.e) {
            if (this.f29966a.getMeasuredWidth() > 0) {
                d(z);
            } else {
                this.f29966a.getViewTreeObserver().addOnGlobalLayoutListener(new a(z));
            }
        }
    }

    public final void f(Drawable drawable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fdeb3e2", new Object[]{this, drawable, new Integer(i)});
            return;
        }
        ImageView imageView = this.c;
        if (imageView != null) {
            if (i > 0 && imageView.getLayoutParams().width != i) {
                this.c.getLayoutParams().width = i;
                this.c.requestLayout();
            }
            this.c.setImageDrawable(drawable);
            this.c.setVisibility(0);
        }
        TextView textView = this.b;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public void g(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ac2d988", new Object[]{this, str, new Integer(i)});
            return;
        }
        TextView textView = this.b;
        if (textView != null) {
            textView.setText(str);
            this.b.setTextColor(i);
            this.b.setVisibility(0);
        }
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }
}
