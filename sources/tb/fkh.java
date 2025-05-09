package tb;

import android.animation.Animator;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class fkh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final d.j f19356a;
    public List<vlh> b;
    public final n c;
    public final d d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d.j f19357a;

        public a(fkh fkhVar, d.j jVar) {
            this.f19357a = jVar;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be8bae45", new Object[]{this});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("succeed", (Object) Boolean.TRUE);
            d.j jVar = this.f19357a;
            jVar.c.a(jVar, jSONObject);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements ulh {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ vlh f19358a;
        public final /* synthetic */ LottieAnimationView b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    b.this.b.playAnimation();
                }
            }
        }

        public b(fkh fkhVar, vlh vlhVar, LottieAnimationView lottieAnimationView) {
            this.f19358a = vlhVar;
            this.b = lottieAnimationView;
        }

        @Override // tb.ulh
        public void onCompositionLoaded(kkh kkhVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e0909eda", new Object[]{this, kkhVar});
                return;
            }
            this.f19358a.getClass();
            this.b.playAnimation();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface c {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f19360a;
        public final c b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements plh<Throwable> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ vlh f19361a;
            public final /* synthetic */ ViewGroup b;
            public final /* synthetic */ LottieAnimationView c;

            public a(vlh vlhVar, ViewGroup viewGroup, LottieAnimationView lottieAnimationView) {
                this.f19361a = vlhVar;
                this.b = viewGroup;
                this.c = lottieAnimationView;
            }

            /* renamed from: a */
            public void onResult(Throwable th) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f750ea72", new Object[]{this, th});
                    return;
                }
                tfs.d("lottie fail with  " + th.getMessage());
                d.this.b();
                if (this.f19361a.f30086a) {
                    this.b.removeView(this.c);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class b implements Animator.AnimatorListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ vlh f19362a;
            public final /* synthetic */ ViewGroup b;
            public final /* synthetic */ LottieAnimationView c;

            public b(vlh vlhVar, ViewGroup viewGroup, LottieAnimationView lottieAnimationView) {
                this.f19362a = vlhVar;
                this.b = viewGroup;
                this.c = lottieAnimationView;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                d.this.b();
                if (this.f19362a.f30086a) {
                    this.b.removeView(this.c);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                }
            }
        }

        static {
            t2o.a(503316666);
        }

        public d(c cVar) {
            this.b = cVar;
        }

        public void a(LottieAnimationView lottieAnimationView, vlh vlhVar, ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7737b69f", new Object[]{this, lottieAnimationView, vlhVar, viewGroup});
                return;
            }
            this.f19360a++;
            lottieAnimationView.setFailureListener(new a(vlhVar, viewGroup, lottieAnimationView));
            lottieAnimationView.addAnimatorListener(new b(vlhVar, viewGroup, lottieAnimationView));
        }

        public void b() {
            c cVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be8bae45", new Object[]{this});
                return;
            }
            int i = this.f19360a - 1;
            this.f19360a = i;
            if (i == 0 && (cVar = this.b) != null) {
                ((a) cVar).a();
            }
        }
    }

    static {
        t2o.a(503316661);
    }

    public fkh(d.j jVar, int i, Object obj) {
        this.f19356a = jVar;
        this.c = jVar.f11976a.a0(i);
        b(obj);
        this.d = new d(new a(this, jVar));
    }

    public final int[] a(n nVar, ViewGroup viewGroup) {
        int i;
        int i2;
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("6048926c", new Object[]{this, nVar, viewGroup});
        }
        int[] iArr = new int[2];
        View w0 = nVar.w0();
        if (w0 != null) {
            w0.getLocationInWindow(iArr);
            i = iArr[0];
            i2 = iArr[1];
        } else {
            Component.j hostViewComponent = nVar.K().getHostViewComponent();
            if (hostViewComponent == null || (view = hostViewComponent.f12191a.getView()) == null) {
                i = 0;
                i2 = 0;
            } else {
                view.getLocationInWindow(iArr);
                int i3 = iArr[0];
                rbi rbiVar = hostViewComponent.b;
                int i4 = i3 + rbiVar.c;
                i2 = rbiVar.d + iArr[1];
                i = i4;
            }
        }
        viewGroup.getLocationInWindow(iArr);
        iArr[0] = i - iArr[0];
        iArr[1] = i2 - iArr[1];
        return iArr;
    }

    public final void b(Object obj) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80a32ce", new Object[]{this, obj});
            return;
        }
        this.b = new ArrayList();
        if (obj instanceof JSONObject) {
            this.b.add((vlh) JSON.toJavaObject((JSONObject) obj, vlh.class));
        } else if (obj instanceof JSONArray) {
            while (true) {
                JSONArray jSONArray = (JSONArray) obj;
                if (i < jSONArray.size()) {
                    this.b.add((vlh) JSON.toJavaObject((JSONObject) jSONArray.get(i), vlh.class));
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final LottieAnimationView c(vlh vlhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LottieAnimationView) ipChange.ipc$dispatch("cb25e5c9", new Object[]{this, vlhVar});
        }
        LottieAnimationView lottieAnimationView = new LottieAnimationView(this.f19356a.c());
        vlhVar.getClass();
        if (TextUtils.isEmpty(null)) {
            lottieAnimationView.setRepeatCount(0);
            lottieAnimationView.setApplyingOpacityToLayersEnabled(false);
            lottieAnimationView.addLottieOnCompositionLoadedListener(new b(this, vlhVar, lottieAnimationView));
            ViewGroup viewGroup = (ViewGroup) this.f19356a.f11976a.d0().w0().getParent();
            int i = this.c.S().f27261a;
            int i2 = this.c.S().b;
            if (TextUtils.isEmpty(null)) {
                int[] a2 = a(this.c, viewGroup);
                int i3 = a2[0];
                int i4 = a2[1];
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2);
                layoutParams.leftMargin = i3;
                layoutParams.topMargin = i4;
                viewGroup.addView(lottieAnimationView, layoutParams);
                this.d.a(lottieAnimationView, vlhVar, viewGroup);
                return lottieAnimationView;
            }
            throw null;
        }
        throw null;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        n nVar = this.c;
        if (nVar == null || nVar.K() == null || ((ArrayList) this.b).isEmpty()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("succeed", (Object) Boolean.FALSE);
            d.j jVar = this.f19356a;
            jVar.c.a(jVar, jSONObject);
            return;
        }
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            c((vlh) it.next());
        }
    }
}
