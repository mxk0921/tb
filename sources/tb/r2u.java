package tb;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.message.TopAtmosphereMessage;
import tb.g12;
import tb.v2u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class r2u extends v2u {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public long n = 2000;
    public long o = 0;
    public String p = "";
    public boolean q = false;
    public boolean r = false;
    public final Runnable s = new a();

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
            try {
                Animation loadAnimation = AnimationUtils.loadAnimation(r2u.this.f29752a, R.anim.taolive_certification_out_flexalocal);
                loadAnimation.setDuration(500L);
                loadAnimation.setAnimationListener(new v2u.a(5));
                r2u.this.b.startAnimation(loadAnimation);
            } catch (Throwable th) {
                o3s.b("TopAtmosphereBrandHotView", "mCommentComboRunnable e: " + th.getMessage());
            }
        }
    }

    static {
        t2o.a(295698600);
    }

    public r2u(Context context, View view, v2u.b bVar, v2u.c cVar, ux9 ux9Var) {
        super(context, view, bVar, cVar, ux9Var);
    }

    public static /* synthetic */ Object ipc$super(r2u r2uVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/chat/view/TopAtmosphereBrandHotView");
    }

    @Override // tb.v2u
    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue();
        }
        if (this.r || this.q) {
            return true;
        }
        return false;
    }

    @Override // tb.v2u
    public void h(TopAtmosphereMessage topAtmosphereMessage) {
        TopAtmosphereMessage.ContentData contentData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("432d9b16", new Object[]{this, topAtmosphereMessage});
        } else if (topAtmosphereMessage != null && (contentData = topAtmosphereMessage.data) != null && contentData.pushTime >= this.o) {
            String str = this.p;
            if (str == null || !str.equals(contentData.contentHash) || !this.q) {
                j(topAtmosphereMessage);
                i(3);
                this.r = true;
            } else {
                b(topAtmosphereMessage.data.getCountShow());
                this.b.removeCallbacks(this.s);
                this.b.postDelayed(this.s, this.n);
            }
            a(topAtmosphereMessage);
            TopAtmosphereMessage.ContentData contentData2 = topAtmosphereMessage.data;
            this.o = contentData2.pushTime;
            this.p = contentData2.contentHash;
        }
    }

    public final void j(TopAtmosphereMessage topAtmosphereMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1e47098", new Object[]{this, topAtmosphereMessage});
            return;
        }
        this.n = k0r.C();
        this.h.setText(topAtmosphereMessage.data.backgroundTitle);
        this.h.setTextSize(1, 14.0f);
        TextView textView = this.h;
        Typeface typeface = Typeface.DEFAULT;
        textView.setTypeface(typeface, 1);
        this.g.setText(topAtmosphereMessage.data.content);
        this.g.setTextSize(1, 11.0f);
        this.g.setTypeface(typeface, 0);
        this.d.setVisibility(8);
        this.e.setVisibility(0);
        this.e.setImageUrl(topAtmosphereMessage.data.iconImg);
        this.e.setCircleView();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.j.getLayoutParams();
        layoutParams.setMargins(hw0.b(this.f29752a, 7.0f), layoutParams.topMargin, layoutParams.rightMargin, layoutParams.bottomMargin);
        this.j.setLayoutParams(layoutParams);
        this.c.setImageUrl(topAtmosphereMessage.data.backgroundImg);
        this.i.setVisibility(0);
        this.i.setText(c(topAtmosphereMessage.data.getCountShow()));
        this.f.setVisibility(8);
    }

    @Override // tb.v2u
    public void g(int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9923fcc", new Object[]{this, new Integer(i)});
            return;
        }
        this.b.removeCallbacks(this.s);
        if (i == 3) {
            try {
                Animation loadAnimation = AnimationUtils.loadAnimation(this.f29752a, R.anim.taolive_certification_in2_flexalocal);
                loadAnimation.setDuration(500L);
                loadAnimation.setAnimationListener(new v2u.a(4));
                this.b.startAnimation(loadAnimation);
            } catch (Throwable th) {
                o3s.b("TopAtmosphereBrandHotView", "onEnterAnimationEnd exception: " + th.getMessage());
            }
        } else if (i == 4) {
            this.r = false;
            this.q = true;
            v2u.b bVar = this.k;
            if (bVar != null) {
                TopAtmosphereMessage.TopAtmosphereMessageType topAtmosphereMessageType = TopAtmosphereMessage.TopAtmosphereMessageType.BRAND_HOT;
                TopAtmosphereMessage a2 = ((g12.a) bVar).a(topAtmosphereMessageType);
                if (a2 == null || (str = this.p) == null || !str.equals(a2.data.contentHash)) {
                    this.b.postDelayed(this.s, this.n);
                    return;
                }
                b(a2.data.getCountShow());
                this.b.postDelayed(this.s, this.n);
                ((g12.a) this.k).b(topAtmosphereMessageType);
            }
        } else if (i == 5) {
            this.b.setVisibility(4);
            this.r = false;
            this.q = false;
            v2u.c cVar = this.l;
            if (cVar != null) {
                ((g12.b) cVar).a(TopAtmosphereMessage.TopAtmosphereMessageType.BRAND_HOT);
            }
        }
    }
}
