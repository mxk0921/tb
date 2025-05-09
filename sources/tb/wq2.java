package tb;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class wq2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public float f30851a;
    public float b;
    public float c;
    public float d;
    public Paint e;
    public Paint f;
    public boolean g = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f30852a;

        public a(wq2 wq2Var, int i) {
            this.f30852a = i;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/view/CLipRadiusHandler$1");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
            } else {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f30852a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f30853a;

        public b(wq2 wq2Var, int i) {
            this.f30853a = i;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/view/CLipRadiusHandler$2");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                return;
            }
            outline.setRoundRect(0, -this.f30853a, view.getWidth(), view.getHeight(), this.f30853a);
            outline.offset(0, this.f30853a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f30854a;

        public c(wq2 wq2Var, int i) {
            this.f30854a = i;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/view/CLipRadiusHandler$3");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                return;
            }
            int width = view.getWidth();
            int height = view.getHeight();
            int i = this.f30854a;
            outline.setRoundRect(0, 0, width, height + i, i);
            outline.offset(0, -this.f30854a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f30855a;

        public d(wq2 wq2Var, int i) {
            this.f30855a = i;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/view/CLipRadiusHandler$4");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                return;
            }
            outline.setRoundRect(-this.f30855a, 0, view.getWidth(), view.getHeight(), this.f30855a);
            outline.offset(this.f30855a, 0);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f30856a;

        public e(wq2 wq2Var, int i) {
            this.f30856a = i;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/view/CLipRadiusHandler$5");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                return;
            }
            outline.setRoundRect(0, 0, view.getWidth() + this.f30856a, view.getHeight(), this.f30856a);
            outline.offset(-this.f30856a, 0);
        }
    }

    static {
        t2o.a(444597147);
    }

    public void a(View view, Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e549f3b4", new Object[]{this, view, canvas});
            return;
        }
        e(view, canvas);
        f(view, canvas);
        c(view, canvas);
        d(view, canvas);
        canvas.restore();
    }

    public void b(View view, Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdeded7", new Object[]{this, view, canvas});
        } else {
            canvas.saveLayer(new RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight()), this.f, 31);
        }
    }

    public final void c(View view, Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a18a810", new Object[]{this, view, canvas});
        } else if (this.c > 0.0f) {
            int height = view.getHeight();
            Path path = new Path();
            float f = height;
            path.moveTo(0.0f, f - this.c);
            path.lineTo(0.0f, f);
            path.lineTo(this.c, f);
            float f2 = this.c;
            path.arcTo(new RectF(0.0f, f - (f2 * 2.0f), f2 * 2.0f, f), 90.0f, 90.0f);
            path.close();
            canvas.drawPath(path, this.e);
        }
    }

    public final void d(View view, Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8be9bba7", new Object[]{this, view, canvas});
        } else if (this.d > 0.0f) {
            int height = view.getHeight();
            int width = view.getWidth();
            Path path = new Path();
            float f = width;
            float f2 = height;
            path.moveTo(f - this.d, f2);
            path.lineTo(f, f2);
            path.lineTo(f, f2 - this.d);
            float f3 = this.d;
            path.arcTo(new RectF(f - (f3 * 2.0f), f2 - (f3 * 2.0f), f, f2), 0.0f, 90.0f);
            path.close();
            canvas.drawPath(path, this.e);
        }
    }

    public final void e(View view, Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3898ff2", new Object[]{this, view, canvas});
        } else if (this.f30851a > 0.0f) {
            Path path = new Path();
            path.moveTo(0.0f, this.f30851a);
            path.lineTo(0.0f, 0.0f);
            path.lineTo(this.f30851a, 0.0f);
            float f = this.f30851a;
            path.arcTo(new RectF(0.0f, 0.0f, f * 2.0f, f * 2.0f), -90.0f, -90.0f);
            path.close();
            canvas.drawPath(path, this.e);
        }
    }

    public final void f(View view, Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5095d005", new Object[]{this, view, canvas});
        } else if (this.b > 0.0f) {
            int width = view.getWidth();
            Path path = new Path();
            float f = width;
            path.moveTo(f - this.b, 0.0f);
            path.lineTo(f, 0.0f);
            path.lineTo(f, this.b);
            float f2 = this.b;
            path.arcTo(new RectF(f - (f2 * 2.0f), 0.0f, f, f2 * 2.0f), 0.0f, -90.0f);
            path.close();
            canvas.drawPath(path, this.e);
        }
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cbe74c58", new Object[]{this})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 22) {
            return true;
        }
        return false;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f571b8c0", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public final void i(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcf0fc04", new Object[]{this, view});
            return;
        }
        if (g()) {
            float f = this.f30851a;
            float f2 = this.b;
            int i = (f > f2 ? 1 : (f == f2 ? 0 : -1));
            if (i == 0) {
                float f3 = this.c;
                if (f == f3 && f3 == this.d) {
                    view.setOutlineProvider(new a(this, (int) f));
                    view.setClipToOutline(true);
                    this.g = true;
                    return;
                }
            }
            if (i == 0 && this.c == 0.0f && this.d == 0.0f) {
                view.setOutlineProvider(new b(this, (int) f));
                view.setClipToOutline(true);
                this.g = true;
                return;
            }
            float f4 = this.c;
            float f5 = this.d;
            if (f4 == f5 && f == 0.0f && f2 == 0.0f) {
                view.setOutlineProvider(new c(this, (int) f4));
                view.setClipToOutline(true);
                this.g = true;
                return;
            } else if (f == f4 && f2 == 0.0f && f5 == 0.0f) {
                view.setOutlineProvider(new d(this, (int) f));
                view.setClipToOutline(true);
                this.g = true;
                return;
            } else if (f2 == f5 && f == 0.0f && f4 == 0.0f) {
                view.setOutlineProvider(new e(this, (int) f2));
                view.setClipToOutline(true);
                this.g = true;
                return;
            }
        }
        Paint paint = new Paint();
        this.e = paint;
        paint.setColor(-1);
        this.e.setAntiAlias(true);
        this.e.setStyle(Paint.Style.FILL);
        this.e.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        Paint paint2 = new Paint();
        this.f = paint2;
        paint2.setXfermode(null);
    }

    public void j(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ddc0bc9", new Object[]{this, view, new Float(f)});
        } else {
            k(view, f, f, f, f);
        }
    }

    public void k(View view, float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b91e357", new Object[]{this, view, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
            return;
        }
        this.f30851a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        i(view);
    }
}
