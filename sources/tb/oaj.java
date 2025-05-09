package tb;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class oaj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String m = lg4.u3();

    /* renamed from: a  reason: collision with root package name */
    public final Context f25256a;
    public final ViewGroup b;
    public final View c;
    public final TUrlImageView d;
    public final TextView e;
    public final ImageView g;
    public wro h;
    public final c i;
    public ObjectAnimator j;
    public final List<TUrlImageView> f = new ArrayList();
    public boolean k = false;
    public boolean l = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                oaj.this.c();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f25258a;
        public final /* synthetic */ wro b;
        public final /* synthetic */ int c;

        public b(boolean z, wro wroVar, int i) {
            this.f25258a = z;
            this.b = wroVar;
            this.c = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            String str2 = p73.f25916a;
            if (this.f25258a) {
                str = "MultiCodeClick";
            } else {
                str = "SingleCodeClick";
            }
            jzu.g(str2, str, new String[0]);
            this.b.c().a(this.c);
            oaj.this.d();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class c extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<oaj> f25259a;

        static {
            t2o.a(481297521);
        }

        public c(oaj oajVar) {
            this.f25259a = new WeakReference<>(oajVar);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/structure/capture/scan/MultiScanCodeView$NoLeakHandler");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            oaj oajVar;
            wro a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message.what == 1000001 && this.f25259a.get() != null && (a2 = oaj.a((oajVar = this.f25259a.get()))) != null && a2.d() != null && a2.d().length == 1) {
                a2.c().a(0);
                oajVar.d();
            }
        }
    }

    static {
        t2o.a(481297518);
    }

    public oaj(Activity activity) {
        this.f25256a = activity;
        ViewStub viewStub = (ViewStub) activity.findViewById(R.id.multi_scan_code_view);
        if (viewStub != null) {
            this.b = (ViewGroup) viewStub.inflate();
        } else {
            this.b = (ViewGroup) activity.findViewById(R.id.multi_scan_code_view_inflated_id);
        }
        this.b.setVisibility(8);
        this.c = this.b.findViewById(R.id.multi_scan_background);
        TUrlImageView tUrlImageView = (TUrlImageView) this.b.findViewById(R.id.multi_scan_btn_back);
        this.d = tUrlImageView;
        tUrlImageView.setImageUrl("https://img.alicdn.com/imgextra/i3/O1CN01HlximS1rwMMgUdjpo_!!6000000005695-2-tps-144-144.png");
        this.e = (TextView) this.b.findViewById(R.id.multi_scan_tips);
        ImageView imageView = (ImageView) activity.findViewById(R.id.scan_multi_scancodes_screenshot);
        this.g = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.i = new c(this);
    }

    public static /* synthetic */ wro a(oaj oajVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wro) ipChange.ipc$dispatch("7be80886", new Object[]{oajVar});
        }
        return oajVar.h;
    }

    public final TUrlImageView b(Context context, wro wroVar, Rect rect, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("af67a9ec", new Object[]{this, context, wroVar, rect, new Integer(i), new Boolean(z)});
        }
        TUrlImageView tUrlImageView = new TUrlImageView(context);
        tUrlImageView.setMaxWidth(110);
        tUrlImageView.setMaxHeight(110);
        tUrlImageView.setSkipAutoSize(true);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(110, 110);
        layoutParams.topToTop = 0;
        layoutParams.leftToLeft = 0;
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = ((rect.left + rect.right) / 2) - 47;
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = ((rect.top + rect.bottom) / 2) - 47;
        tUrlImageView.setOnClickListener(new b(z, wroVar, i));
        this.b.addView(tUrlImageView, layoutParams);
        tUrlImageView.setImageUrl(m);
        ((ArrayList) this.f).add(tUrlImageView);
        return tUrlImageView;
    }

    public void c() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d256c3f", new Object[]{this});
            return;
        }
        String str2 = p73.f25916a;
        if (this.l) {
            str = "MultiCodeCloseClick";
        } else {
            str = "SingleCodeCloseClick";
        }
        jzu.g(str2, str, new String[0]);
        wro wroVar = this.h;
        if (wroVar != null) {
            wroVar.c().b();
        }
        d();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        this.k = false;
        this.i.removeMessages(1000001);
        this.j.end();
        this.g.setImageBitmap(null);
        this.g.setVisibility(8);
        Iterator it = ((ArrayList) this.f).iterator();
        while (it.hasNext()) {
            this.b.removeView((TUrlImageView) it.next());
        }
        ((ArrayList) this.f).clear();
        this.b.setVisibility(8);
        this.h = null;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue();
        }
        return this.k;
    }

    public void f(String str, wro wroVar) {
        boolean z;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e30e3ac8", new Object[]{this, str, wroVar});
            return;
        }
        this.k = true;
        this.h = wroVar;
        this.g.setImageBitmap(wroVar.a());
        this.g.setVisibility(0);
        if (wroVar.d().length > 1) {
            z = true;
        } else {
            z = false;
        }
        this.l = z;
        if (z) {
            str2 = "MultiCodeCloseExpose";
        } else {
            str2 = "SingleCodeCloseExpose";
        }
        jzu.q(str, str2, new String[0]);
        this.d.setOnClickListener(new a());
        Rect[] d = wroVar.d();
        for (int i = 0; i < d.length; i++) {
            b(this.f25256a, wroVar, d[i], i, this.l);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.c, "alpha", 0.0f, 1.0f);
        this.j = ofFloat;
        ofFloat.setDuration(400L).start();
        this.b.setVisibility(0);
        this.i.removeMessages(1000001);
        if (((ArrayList) this.f).size() == 1) {
            this.i.sendEmptyMessageDelayed(1000001, 400L);
            this.e.setText("");
            return;
        }
        this.e.setText(Localization.q(R.string.feis_multi_scancode_found));
    }
}
