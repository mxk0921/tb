package tb;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class wkt extends vuu implements ixh, Drawable.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Layout c;
    public boolean d;
    public CharSequence e;
    public ColorStateList f;
    public int g;
    public int h;
    public ClickableSpan[] i;
    public ImageSpan[] j;
    public Path k;
    public float l;
    public boolean m;
    public a n;
    public hu3 o;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private sjh f30754a;
        private View b;

        static {
            t2o.a(986710261);
        }

        public a(sjh sjhVar, View view) {
            this.f30754a = sjhVar;
            this.b = view;
        }

        public static /* synthetic */ sjh a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (sjh) ipChange.ipc$dispatch("57016f37", new Object[]{aVar});
            }
            return aVar.f30754a;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            wkt wktVar = wkt.this;
            if ((wkt.p(wktVar) != null && wkt.p(wkt.this).b(this.f30754a, this.b)) || this.f30754a.a(this.b)) {
                z = true;
            }
            wkt.o(wktVar, z);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
    }

    static {
        t2o.a(986710260);
        t2o.a(986710053);
    }

    public static /* synthetic */ Object ipc$super(wkt wktVar, String str, Object... objArr) {
        if (str.hashCode() == 1073557659) {
            return new Boolean(super.onStateChange((int[]) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/text/TextDrawable");
    }

    public static /* synthetic */ boolean o(wkt wktVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa6f5f29", new Object[]{wktVar, new Boolean(z)})).booleanValue();
        }
        wktVar.m = z;
        return z;
    }

    public static /* synthetic */ hu3 p(wkt wktVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hu3) ipChange.ipc$dispatch("deddb0ce", new Object[]{wktVar});
        }
        return wktVar.o;
    }

    public static boolean y(Rect rect, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fdc342c1", new Object[]{rect, motionEvent})).booleanValue();
        }
        return rect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    public final void A(sjh sjhVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6faa07f", new Object[]{this, sjhVar, view});
            return;
        }
        this.n = new a(sjhVar, view);
        ViewConfiguration.getLongPressTimeout();
        throw null;
    }

    public final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e78f95e4", new Object[]{this});
        } else {
            this.m = false;
        }
    }

    public void C(Layout layout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e1e1422", new Object[]{this, layout});
            return;
        }
        this.c = layout;
        invalidateSelf();
    }

    public final void D(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69d562f1", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            Color.alpha(this.h);
        }
    }

    public final void E(ClickableSpan clickableSpan) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cfaf6f4", new Object[]{this, clickableSpan});
            return;
        }
        Spanned spanned = (Spanned) this.e;
        D(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan));
    }

    public final boolean G(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9480307", new Object[]{this, motionEvent})).booleanValue();
        }
        int actionMasked = motionEvent.getActionMasked();
        if ((!this.d || !y(getBounds(), motionEvent)) && actionMasked != 3) {
            return false;
        }
        return true;
    }

    public final void I(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92d96377", new Object[]{this, motionEvent});
            return;
        }
        Rect bounds = getBounds();
        if (!y(bounds, motionEvent)) {
            B();
        } else if (a.a(this.n) != r(((int) motionEvent.getX()) - bounds.left, ((int) motionEvent.getY()) - bounds.top)) {
            B();
        }
    }

    public void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f4059a7", new Object[]{this});
            return;
        }
        this.c = null;
        this.e = null;
        this.i = null;
        this.d = false;
        this.h = 0;
        this.o = null;
        this.f = null;
        this.g = 0;
        ImageSpan[] imageSpanArr = this.j;
        if (imageSpanArr != null) {
            int length = imageSpanArr.length;
            for (int i = 0; i < length; i++) {
                Drawable drawable = this.j[i].getDrawable();
                drawable.setCallback(null);
                drawable.setVisible(false, false);
            }
            this.j = null;
        }
    }

    public final Path c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Path) ipChange.ipc$dispatch("420a88ca", new Object[]{this});
        }
        return null;
    }

    @Override // tb.ixh
    public boolean d(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("92055016", new Object[]{this, motionEvent})).booleanValue();
        }
        if (G(motionEvent) || g(motionEvent) || e(motionEvent)) {
            return true;
        }
        return false;
    }

    public final boolean e(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88f44d05", new Object[]{this, motionEvent})).booleanValue();
        }
        return false;
    }

    @Override // tb.ixh
    public boolean f(MotionEvent motionEvent, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c03524e0", new Object[]{this, motionEvent, view})).booleanValue();
        }
        if ((G(motionEvent) || g(motionEvent)) && w(motionEvent, view)) {
            return true;
        }
        if (e(motionEvent)) {
            v(motionEvent);
        }
        return false;
    }

    public final boolean g(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("122bc96b", new Object[]{this, motionEvent})).booleanValue();
        }
        return false;
    }

    @Override // tb.vuu, android.graphics.drawable.Drawable
    public int getOpacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2242c5cf", new Object[]{this})).intValue();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c16ae24", new Object[]{this, drawable});
        } else {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b242421", new Object[]{this})).booleanValue();
        }
        if (this.f != null) {
            return true;
        }
        return false;
    }

    @Override // tb.vuu
    public void l(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
        } else if (this.c != null) {
            if (!(i() == 0 && k() == 0)) {
                canvas.translate(i(), k());
            }
            try {
                this.c.draw(canvas, c(), null, 0);
            } catch (ArrayIndexOutOfBoundsException e) {
                dwh.i(e);
            }
            if (i() != 0 || k() != 0) {
                canvas.translate(-i(), -k());
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Layout layout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ffd309b", new Object[]{this, iArr})).booleanValue();
        }
        if (!(this.f == null || (layout = this.c) == null)) {
            int color = layout.getPaint().getColor();
            int colorForState = this.f.getColorForState(iArr, this.g);
            if (colorForState != color) {
                this.c.getPaint().setColor(colorForState);
                invalidateSelf();
            }
        }
        return super.onStateChange(iArr);
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19092ec6", new Object[]{this});
        } else {
            D(0, 0);
        }
    }

    public final ClickableSpan r(int i, int i2) {
        ClickableSpan[] clickableSpanArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClickableSpan) ipChange.ipc$dispatch("56ddd5b9", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        int u = u(i, i2);
        if (u >= 0 && (clickableSpanArr = (ClickableSpan[]) ((Spanned) this.e).getSpans(u, u, ClickableSpan.class)) != null && clickableSpanArr.length > 0) {
            return clickableSpanArr[0];
        }
        return null;
    }

    public final ClickableSpan s(float f, float f2, float f3) {
        ClickableSpan[] clickableSpanArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClickableSpan) ipChange.ipc$dispatch("5ad99589", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
        }
        Region region = new Region();
        Region region2 = new Region();
        if (this.k == null) {
            this.k = new Path();
        }
        region2.set(0, 0, gjg.c(this.c), gjg.a(this.c));
        this.k.reset();
        this.k.addCircle(f, f2, f3, Path.Direction.CW);
        region.setPath(this.k, region2);
        ClickableSpan clickableSpan = null;
        for (ClickableSpan clickableSpan2 : this.i) {
            if (x(clickableSpan2, (Spanned) this.e, this.c, region, region2)) {
                if (clickableSpan != null) {
                    return null;
                }
                clickableSpan = clickableSpan2;
            }
        }
        return clickableSpan;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4282486", new Object[]{this, drawable, runnable, new Long(j)});
        } else {
            scheduleSelf(runnable, j);
        }
    }

    @Override // tb.vuu, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
            return;
        }
        Layout layout = this.c;
        if (layout != null && layout.getPaint() != null) {
            this.c.getPaint().setAlpha(i);
        }
    }

    @Override // tb.vuu, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65fee558", new Object[]{this, colorFilter});
        }
    }

    public final int u(int i, int i2) {
        float f;
        float f2;
        float f3;
        float f4;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("54c19f43", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        int lineForVertical = this.c.getLineForVertical(i2);
        if (this.c.getAlignment() == Layout.Alignment.ALIGN_CENTER) {
            f2 = this.c.getLineLeft(lineForVertical);
            f = this.c.getLineRight(lineForVertical);
        } else {
            if (this.c.getParagraphDirection(lineForVertical) != -1) {
                z = false;
            }
            Layout layout = this.c;
            if (z) {
                f3 = layout.getWidth() - this.c.getLineMax(lineForVertical);
            } else {
                f3 = layout.getParagraphLeft(lineForVertical);
            }
            if (z) {
                f4 = this.c.getParagraphRight(lineForVertical);
            } else {
                f4 = this.c.getLineMax(lineForVertical);
            }
            f = f4;
            f2 = f3;
        }
        float f5 = i;
        if (f5 >= f2 && f5 <= f) {
            try {
                return this.c.getOffsetForHorizontal(lineForVertical, f5);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e77f3b17", new Object[]{this, drawable, runnable});
        } else {
            unscheduleSelf(runnable);
        }
    }

    public final void v(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45ce2c14", new Object[]{this, motionEvent});
            return;
        }
        Rect bounds = getBounds();
        int u = u(((int) motionEvent.getX()) - bounds.left, ((int) motionEvent.getY()) - bounds.top);
        if (u >= 0 && u <= this.e.length()) {
            throw null;
        }
    }

    public final boolean w(MotionEvent motionEvent, View view) {
        hu3 hu3Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22788e23", new Object[]{this, motionEvent, view})).booleanValue();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3) {
            q();
            B();
            return false;
        }
        if (actionMasked == 2 && !this.m && this.n != null) {
            I(motionEvent);
        }
        boolean z = this.m;
        if (actionMasked == 1) {
            B();
        }
        Rect bounds = getBounds();
        if (!y(bounds, motionEvent)) {
            return false;
        }
        int x = ((int) motionEvent.getX()) - bounds.left;
        int y = ((int) motionEvent.getY()) - bounds.top;
        ClickableSpan r = r(x, y);
        if (r == null) {
            float f = this.l;
            if (f > 0.0f) {
                r = s(x, y, f);
            }
        }
        if (r == null) {
            q();
            return false;
        }
        if (actionMasked == 1) {
            q();
            if (!z && ((hu3Var = this.o) == null || !hu3Var.a(r, view))) {
                r.onClick(view);
            }
        } else if (actionMasked == 0) {
            if (r instanceof sjh) {
                A((sjh) r, view);
            }
            E(r);
        }
        return true;
    }

    public final boolean x(ClickableSpan clickableSpan, Spanned spanned, Layout layout, Region region, Region region2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b7482", new Object[]{this, clickableSpan, spanned, layout, region, region2})).booleanValue();
        }
        Region region3 = new Region();
        Path path = new Path();
        layout.getSelectionPath(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan), path);
        region3.setPath(path, region2);
        return region3.op(region, Region.Op.INTERSECT);
    }

    public void z(CharSequence charSequence, Layout layout, ColorStateList colorStateList, int i, int i2, ClickableSpan[] clickableSpanArr, ImageSpan[] imageSpanArr, hu3 hu3Var, b bVar, int i3, int i4, float f, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fddd544b", new Object[]{this, charSequence, layout, colorStateList, new Integer(i), new Integer(i2), clickableSpanArr, imageSpanArr, hu3Var, bVar, new Integer(i3), new Integer(i4), new Float(f), str});
            return;
        }
        this.c = layout;
        this.e = charSequence;
        this.i = clickableSpanArr;
        this.o = hu3Var;
        this.d = clickableSpanArr != null && clickableSpanArr.length > 0;
        this.h = i2;
        this.l = f;
        if (i != 0) {
            this.f = null;
            this.g = i;
            if (layout != null) {
                layout.getPaint().setColor(i);
            }
        } else {
            ColorStateList colorStateList2 = colorStateList != null ? colorStateList : tkt.TEXT_COLOR_STATE_LIST;
            this.f = colorStateList2;
            this.g = colorStateList2.getDefaultColor();
            Layout layout2 = this.c;
            if (layout2 != null) {
                layout2.getPaint().setColor(this.f.getColorForState(getState(), this.g));
            }
        }
        if (imageSpanArr != null) {
            for (ImageSpan imageSpan : imageSpanArr) {
                Drawable drawable = imageSpan.getDrawable();
                drawable.setCallback(this);
                drawable.setVisible(true, false);
            }
        }
        this.j = imageSpanArr;
        invalidateSelf();
    }
}
