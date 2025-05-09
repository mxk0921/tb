package tb;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class neo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Layout f24682a;
    public TextPaint b;
    public CharSequence c;
    public int f;
    public final int g;
    public float j;
    public final CharSequence e = "";
    public final int h = tkt.DEFAULT_SHADOW_COLOR;
    public final Layout.Alignment i = Layout.Alignment.ALIGN_NORMAL;
    public final List<leo> d = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f24683a;
        public final int b;

        static {
            t2o.a(478151127);
        }

        public a(int i, int i2) {
            this.f24683a = i;
            this.b = i2;
        }

        public int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
            }
            return this.b;
        }

        public int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
            }
            return this.f24683a;
        }
    }

    static {
        t2o.a(478151126);
    }

    public neo(Context context) {
        this.g = pb6.c(context, 13.0f);
    }

    public void a(leo leoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cdcb5af", new Object[]{this, leoVar});
        } else {
            ((ArrayList) this.d).add(leoVar);
        }
    }

    public void b(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        canvas.save();
        int i = this.f;
        canvas.translate(i, i);
        Layout layout = this.f24682a;
        if (layout != null) {
            layout.draw(canvas);
        }
        canvas.restore();
    }

    public Layout c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Layout) ipChange.ipc$dispatch("2a32510c", new Object[]{this});
        }
        return this.f24682a;
    }

    public float d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea7b9870", new Object[]{this})).floatValue();
        }
        return this.j;
    }

    public CharSequence e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("1739ce46", new Object[]{this, new Boolean(z)});
        }
        if (((ArrayList) this.d).size() == 0) {
            return this.e;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Iterator it = ((ArrayList) this.d).iterator();
        while (it.hasNext()) {
            leo leoVar = (leo) it.next();
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) leoVar.getText());
            for (Object obj : leoVar.a(z)) {
                spannableStringBuilder.setSpan(obj, length, leoVar.getText().length() + length, 33);
            }
        }
        return spannableStringBuilder;
    }

    public <T> T[] f(int i, int i2, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T[]) ((Object[]) ipChange.ipc$dispatch("48ecbc84", new Object[]{this, new Integer(i), new Integer(i2), cls}));
        }
        if (this.d == null) {
            return null;
        }
        CharSequence e = e(false);
        if (!(e instanceof Spannable)) {
            return null;
        }
        return (T[]) ((Spannable) e).getSpans(i, i2, cls);
    }

    public int g(float f, float f2) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("724f6069", new Object[]{this, new Float(f), new Float(f2)})).intValue();
        }
        Layout layout = this.f24682a;
        if (layout == null) {
            return -1;
        }
        int lineForVertical = layout.getLineForVertical((int) f2);
        int offsetForHorizontal = this.f24682a.getOffsetForHorizontal(lineForVertical, f);
        if (this.f24682a.getPrimaryHorizontal(offsetForHorizontal) < f) {
            i = offsetForHorizontal + 1;
        } else {
            i = offsetForHorizontal - 1;
        }
        int lineStart = this.f24682a.getLineStart(lineForVertical);
        if (i < lineStart) {
            return lineStart;
        }
        return i;
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b392464", new Object[]{this});
            return;
        }
        if (this.d != null) {
            CharSequence e = e(true);
            if (!e.equals(this.c)) {
                this.c = e;
            }
        }
        if (this.c != null) {
            if (this.b == null) {
                this.b = new TextPaint();
            }
            this.b.setAntiAlias(true);
            int i = this.g;
            if (i >= 0) {
                this.b.setTextSize(i);
            }
            this.b.setColor(this.h);
        }
    }

    public Layout i(int i, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Layout) ipChange.ipc$dispatch("afd2e4c9", new Object[]{this, new Integer(i), charSequence});
        }
        return new StaticLayout(charSequence, this.b, Math.max(i, 0), this.i, 1.0f, this.j, true);
    }

    public a j(int i, int i2) {
        int i3;
        int i4 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("9ebf1acc", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        h();
        CharSequence charSequence = this.c;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            i3 = View.MeasureSpec.getSize(i);
        } else {
            i3 = View.MeasureSpec.getSize(i);
            if (charSequence != null) {
                i3 = Math.min(((int) Math.ceil(Layout.getDesiredWidth(charSequence, 0, charSequence.length(), this.b))) + (this.f * 2), i3);
            }
        }
        if (i3 != 0 && !TextUtils.isEmpty(charSequence)) {
            int max = i3 - (Math.max(this.f, 0) * 2);
            Layout layout = this.f24682a;
            if (layout == null) {
                this.f24682a = i(max, charSequence);
            } else if (layout.getWidth() < max) {
                this.f24682a.increaseWidthTo(i3);
            }
        }
        if (this.f24682a == null || charSequence == null) {
            return new a(i3, 0);
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            i4 = size;
        } else if (!TextUtils.isEmpty(charSequence)) {
            i4 = Math.min(this.f24682a.getHeight() + (this.f * 2), size);
        }
        return new a(i3, i4);
    }

    public void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8120324", new Object[]{this, new Integer(i)});
            return;
        }
        this.f = i;
        if (i < 0) {
            this.f = 0;
        }
    }

    public void l(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f4744c", new Object[]{this, new Float(f)});
        } else {
            this.j = f;
        }
    }
}
