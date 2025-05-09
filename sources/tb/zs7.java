package tb;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.core.view.InputDeviceCompat;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class zs7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ValueAnimator d;
    public final View f;

    /* renamed from: a  reason: collision with root package name */
    public final int f32985a = zb7.a(8.0f);
    public final int b = zb7.a(5.0f);
    public final List<b> c = new LinkedList();
    public float e = 0.0f;
    public final Paint g = new Paint(1);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f32986a;

        public a(View view) {
            this.f32986a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            } else if (!zs7.a(zs7.this).isEmpty()) {
                zs7.b(zs7.this, valueAnimator.getAnimatedFraction());
                this.f32986a.invalidate();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public float f32987a;
        public float b;

        static {
            t2o.a(481297540);
        }

        public b() {
        }

        public static /* synthetic */ float a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a4c3cc6", new Object[]{bVar})).floatValue();
            }
            return bVar.f32987a;
        }

        public static /* synthetic */ float b(b bVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("41a86b58", new Object[]{bVar, new Float(f)})).floatValue();
            }
            bVar.f32987a = f;
            return f;
        }

        public static /* synthetic */ float c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2fe045c7", new Object[]{bVar})).floatValue();
            }
            return bVar.b;
        }

        public static /* synthetic */ float d(b bVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ce958277", new Object[]{bVar, new Float(f)})).floatValue();
            }
            bVar.b = f;
            return f;
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    static {
        t2o.a(481297538);
    }

    public zs7(View view, int i) {
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 300);
        this.d = ofInt;
        this.f = view;
        ofInt.addUpdateListener(new a(view));
        ofInt.setStartDelay(i);
    }

    public static /* synthetic */ List a(zs7 zs7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2b9da011", new Object[]{zs7Var});
        }
        return zs7Var.c;
    }

    public static /* synthetic */ float b(zs7 zs7Var, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a3897c17", new Object[]{zs7Var, new Float(f)})).floatValue();
        }
        zs7Var.e = f;
        return f;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        ((LinkedList) this.c).clear();
        if (this.d.isRunning()) {
            this.d.cancel();
        }
    }

    public void d(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        for (b bVar : this.c) {
            this.g.setAlpha((int) (this.e * 255.0f));
            this.g.setColor(-1);
            canvas.drawCircle(b.a(bVar), b.c(bVar), this.e * this.f32985a, this.g);
            this.g.setColor(InputDeviceCompat.SOURCE_ANY);
            canvas.drawCircle(b.a(bVar), b.c(bVar), this.e * this.b, this.g);
        }
    }

    public final void e(List<RectF> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56a4704f", new Object[]{this, list});
        } else if (list != null && !list.isEmpty()) {
            for (RectF rectF : list) {
                b bVar = new b(null);
                b.b(bVar, ((int) (rectF.left * this.f.getWidth())) + (((int) (rectF.width() * this.f.getWidth())) / 2.0f));
                b.d(bVar, ((int) (rectF.top * this.f.getHeight())) + (((int) (rectF.height() * this.f.getHeight())) / 2.0f));
                ((LinkedList) this.c).add(bVar);
            }
        }
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
        }
        return this.c.isEmpty();
    }

    public void g(List<RectF> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2103b49c", new Object[]{this, list});
        } else {
            e(list);
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else {
            this.d.start();
        }
    }
}
