package tb;

import android.content.Context;
import android.view.View;
import android.widget.Scroller;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ote {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Scroller f25639a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ View b;
        public final /* synthetic */ Ref$IntRef c;
        public final /* synthetic */ Ref$FloatRef d;

        public a(View view, Ref$IntRef ref$IntRef, Ref$FloatRef ref$FloatRef) {
            this.b = view;
            this.c = ref$IntRef;
            this.d = ref$FloatRef;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (ote.a(ote.this).computeScrollOffset()) {
                int abs = Math.abs(ote.a(ote.this).getCurrY());
                this.b.scrollBy(0, (int) ((abs - this.c.element) * this.d.element));
                Ref$IntRef ref$IntRef = this.c;
                ref$IntRef.element = abs;
                ote.b(this.b, ote.this, ref$IntRef, this.d);
            }
        }
    }

    static {
        t2o.a(766510089);
    }

    public ote(Context context) {
        ckf.g(context, "context");
        this.f25639a = new Scroller(context);
    }

    public static final /* synthetic */ Scroller a(ote oteVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Scroller) ipChange.ipc$dispatch("87e22e9f", new Object[]{oteVar});
        }
        return oteVar.f25639a;
    }

    public static final /* synthetic */ void b(View view, ote oteVar, Ref$IntRef ref$IntRef, Ref$FloatRef ref$FloatRef) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("279229ec", new Object[]{view, oteVar, ref$IntRef, ref$FloatRef});
        } else {
            d(view, oteVar, ref$IntRef, ref$FloatRef);
        }
    }

    public static final void d(View view, ote oteVar, Ref$IntRef ref$IntRef, Ref$FloatRef ref$FloatRef) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9ed2ac", new Object[]{view, oteVar, ref$IntRef, ref$FloatRef});
        } else {
            view.postOnAnimation(new a(view, ref$IntRef, ref$FloatRef));
        }
    }

    public final void c(int i, View view, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9e39ede", new Object[]{this, new Integer(i), view, new Integer(i2)});
            return;
        }
        ckf.g(view, "targetScrollView");
        this.f25639a.abortAnimation();
        this.f25639a.fling(0, 0, 0, i, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, 2000);
        int abs = Math.abs(this.f25639a.getFinalY());
        Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
        ref$FloatRef.element = 1.0f;
        if (i2 < abs) {
            if (i2 != 0) {
                ref$FloatRef.element = (abs - i2) / abs;
            }
            d(view, this, new Ref$IntRef(), ref$FloatRef);
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else {
            this.f25639a.abortAnimation();
        }
    }
}
