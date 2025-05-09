package tb;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ykt {
    public float c;
    public hkt f;

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f32157a = new TextPaint(1);
    public final ikt b = new a();
    public boolean d = true;
    public WeakReference<b> e = new WeakReference<>(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a extends ikt {
        public a() {
        }

        @Override // tb.ikt
        public void a(int i) {
            ykt yktVar = ykt.this;
            yktVar.d = true;
            b bVar = (b) yktVar.e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // tb.ikt
        public void b(Typeface typeface, boolean z) {
            if (!z) {
                ykt yktVar = ykt.this;
                yktVar.d = true;
                b bVar = (b) yktVar.e.get();
                if (bVar != null) {
                    bVar.a();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public ykt(b bVar) {
        g(bVar);
    }

    public final float c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f32157a.measureText(charSequence, 0, charSequence.length());
    }

    public hkt d() {
        return this.f;
    }

    public TextPaint e() {
        return this.f32157a;
    }

    public float f(String str) {
        if (!this.d) {
            return this.c;
        }
        float c = c(str);
        this.c = c;
        this.d = false;
        return c;
    }

    public void g(b bVar) {
        this.e = new WeakReference<>(bVar);
    }

    public void h(hkt hktVar, Context context) {
        if (this.f != hktVar) {
            this.f = hktVar;
            if (hktVar != null) {
                TextPaint textPaint = this.f32157a;
                ikt iktVar = this.b;
                hktVar.i(context, textPaint, iktVar);
                b bVar = this.e.get();
                if (bVar != null) {
                    textPaint.drawableState = bVar.getState();
                }
                hktVar.h(context, textPaint, iktVar);
                this.d = true;
            }
            b bVar2 = this.e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void i(boolean z) {
        this.d = z;
    }

    public void j(Context context) {
        this.f.h(context, this.f32157a, this.b);
    }
}
