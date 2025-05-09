package com.taobao.android.mediapick;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mediapick.IMediaPickClient;
import com.taobao.android.mediapick.media.Media;
import com.taobao.schedule.ViewProxy;
import tb.btt;
import tb.sjc;
import tb.t2o;
import tb.z09;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class a<T extends Media> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public T f8896a;
    public int b;
    public View c;
    public MediaPickClient d;
    public sjc e;
    public btt f;
    public final z09 g = new z09(new b());
    public final z09 h;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.mediapick.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class View$OnClickListenerC0460a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public View$OnClickListenerC0460a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            a aVar = a.this;
            a.a(aVar, aVar.f8896a, aVar.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            a aVar = a.this;
            a.b(aVar, aVar.f8896a, aVar.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.e().setScaleX(floatValue);
            a.this.e().setScaleY(floatValue);
        }
    }

    static {
        t2o.a(519045121);
    }

    public a() {
        View$OnClickListenerC0460a aVar = new View$OnClickListenerC0460a();
        this.h = new z09(aVar);
    }

    public static /* synthetic */ void a(a aVar, Media media, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edb830bb", new Object[]{aVar, media, new Integer(i)});
        } else {
            aVar.g(media, i);
        }
    }

    public static /* synthetic */ void b(a aVar, Media media, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3638d3c", new Object[]{aVar, media, new Integer(i)});
        } else {
            aVar.h(media, i);
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60755c2b", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public Activity d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("616f3928", new Object[]{this});
        }
        return this.d.v();
    }

    public View e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d0d48fe5", new Object[]{this});
        }
        return null;
    }

    public void f(MediaPickClient mediaPickClient, sjc sjcVar, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("727a8ff6", new Object[]{this, mediaPickClient, sjcVar, viewGroup});
            return;
        }
        this.d = mediaPickClient;
        this.e = sjcVar;
        View k = k(mediaPickClient.v(), viewGroup);
        this.c = k;
        if (k == null) {
            this.c = j(this.d.v());
        }
        ViewProxy.setOnClickListener(this.c, this.h);
        this.f = new btt(this.d.v());
        View e = e();
        if (e != null) {
            ViewProxy.setOnClickListener(e, this.g);
        }
    }

    public final void g(T t, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("585d8e1c", new Object[]{this, t, new Integer(i)});
        } else {
            this.d.w().a(t, i);
        }
    }

    public final void h(T t, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbff998d", new Object[]{this, t, new Integer(i)});
            return;
        }
        if (this.d.b().indexOf(t) == -1) {
            z = false;
        }
        if (z && this.d.z() == IMediaPickClient.PickMode.SINGLE && !n()) {
            return;
        }
        if (!z || this.d.z() == IMediaPickClient.PickMode.MULTIP_REPEAT) {
            if (this.d.a(t, i) && c()) {
                l();
            }
        } else if (this.d.o(t, i) && c()) {
            m();
        }
    }

    public abstract void i(T t, boolean z);

    @Deprecated
    public View j(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("10219b", new Object[]{this, activity});
        }
        return null;
    }

    public View k(Activity activity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e28ede9b", new Object[]{this, activity, view});
        }
        return null;
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bc9ee96", new Object[]{this});
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 1.3f, 1.1f, 0.8f, 1.0f);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.setDuration(500L);
        ofFloat.addUpdateListener(new c());
        ofFloat.start();
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d723aa1d", new Object[]{this});
        }
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a1c5635", new Object[]{this})).booleanValue();
        }
        return true;
    }
}
