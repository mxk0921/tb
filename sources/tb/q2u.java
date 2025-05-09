package tb;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.message.TopAtmosphereMessage;
import tb.g12;
import tb.v2u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class q2u extends v2u {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean n;
    public final Runnable o = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
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
            v2u.c cVar = q2u.this.l;
            if (cVar != null) {
                ((g12.b) cVar).a(TopAtmosphereMessage.TopAtmosphereMessageType.ANCHOR_CERTIFICATE);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                Animation loadAnimation = AnimationUtils.loadAnimation(q2u.this.f29752a, R.anim.taolive_certification_out_flexalocal);
                loadAnimation.setDuration(500L);
                loadAnimation.setAnimationListener(new v2u.a(2));
                q2u.this.b.startAnimation(loadAnimation);
            } catch (Throwable th) {
                o3s.b("TopAtmosphereAnchorCertView", "mAnchorCertificateRunnable e: " + th.getMessage());
            }
        }
    }

    static {
        t2o.a(295698597);
    }

    public q2u(Context context, View view, v2u.b bVar, v2u.c cVar, ux9 ux9Var) {
        super(context, view, bVar, cVar, ux9Var);
    }

    public static /* synthetic */ Object ipc$super(q2u q2uVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/chat/view/TopAtmosphereAnchorCertView");
    }

    @Override // tb.v2u
    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue();
        }
        return this.n;
    }

    @Override // tb.v2u
    public void h(TopAtmosphereMessage topAtmosphereMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("432d9b16", new Object[]{this, topAtmosphereMessage});
        } else if (topAtmosphereMessage != null && topAtmosphereMessage.data != null) {
            this.n = true;
            a(topAtmosphereMessage);
            j(topAtmosphereMessage);
            i(0);
        }
    }

    public final void j(TopAtmosphereMessage topAtmosphereMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b20a9a94", new Object[]{this, topAtmosphereMessage});
            return;
        }
        this.h.setText(topAtmosphereMessage.data.backgroundTitle);
        this.h.setTextSize(1, 10.0f);
        TextView textView = this.h;
        Typeface typeface = Typeface.DEFAULT;
        textView.setTypeface(typeface, 0);
        this.g.setText(topAtmosphereMessage.data.content);
        this.g.setTextSize(1, 14.0f);
        try {
            this.g.setTypeface(typeface, 1);
        } catch (Exception e) {
            o3s.b("TopAtmosphereAnchorCertView", e.getMessage());
        }
        this.d.setVisibility(0);
        this.d.setImageUrl(topAtmosphereMessage.data.iconImg);
        this.c.setImageUrl(topAtmosphereMessage.data.backgroundImg);
        this.i.setText("");
        this.i.setVisibility(8);
        this.f.setVisibility(8);
        e();
    }

    @Override // tb.v2u
    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9923fcc", new Object[]{this, new Integer(i)});
            return;
        }
        this.b.removeCallbacks(this.o);
        if (i == 0) {
            try {
                Animation loadAnimation = AnimationUtils.loadAnimation(this.f29752a, R.anim.taolive_certification_in2_flexalocal);
                loadAnimation.setAnimationListener(new v2u.a(1));
                loadAnimation.setDuration(500L);
                this.b.startAnimation(loadAnimation);
            } catch (Throwable th) {
                o3s.b("TopAtmosphereAnchorCertView", "onEnterAnimationEnd exception: " + th.getMessage());
            }
        } else if (i == 1) {
            this.b.postDelayed(this.o, 3000L);
        } else if (i == 2) {
            this.b.setVisibility(4);
            this.n = false;
            if (this.l != null) {
                this.b.postDelayed(new a(), 2000L);
            }
        }
    }
}
