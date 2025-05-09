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
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class um {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Paint f29480a;
    public Paint b;
    public float c;
    public float d;
    public float e;
    public float f;
    public boolean g = false;
    public final ViewGroup h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f29481a;

        public a(um umVar, int i) {
            this.f29481a = i;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/service/render/widget/roundcornerlayout/AURARoundCornerLayoutHelper$1");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
            } else {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f29481a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f29482a;

        public b(um umVar, int i) {
            this.f29482a = i;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/service/render/widget/roundcornerlayout/AURARoundCornerLayoutHelper$2");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                return;
            }
            outline.setRoundRect(0, -this.f29482a, view.getWidth(), view.getHeight(), this.f29482a);
            outline.offset(0, this.f29482a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f29483a;

        public c(um umVar, int i) {
            this.f29483a = i;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/service/render/widget/roundcornerlayout/AURARoundCornerLayoutHelper$3");
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
            int i = this.f29483a;
            outline.setRoundRect(0, 0, width, height + i, i);
            outline.offset(0, -this.f29483a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class d extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f29484a;

        public d(um umVar, int i) {
            this.f29484a = i;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/service/render/widget/roundcornerlayout/AURARoundCornerLayoutHelper$4");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                return;
            }
            outline.setRoundRect(-this.f29484a, 0, view.getWidth(), view.getHeight(), this.f29484a);
            outline.offset(this.f29484a, 0);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class e extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f29485a;

        public e(um umVar, int i) {
            this.f29485a = i;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/service/render/widget/roundcornerlayout/AURARoundCornerLayoutHelper$5");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                return;
            }
            outline.setRoundRect(0, 0, view.getWidth() + this.f29485a, view.getHeight(), this.f29485a);
            outline.offset(-this.f29485a, 0);
        }
    }

    static {
        t2o.a(80740623);
    }

    public um(ViewGroup viewGroup) {
        this.h = viewGroup;
    }

    public void a(Canvas canvas, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dad4a11e", new Object[]{this, canvas, runnable});
        } else if (this.g || this.b == null || this.f29480a == null) {
            runnable.run();
        } else {
            canvas.saveLayer(new RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight()), this.b, 31);
            runnable.run();
            d(canvas);
            e(canvas);
            b(canvas);
            c(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2519f948", new Object[]{this, canvas});
        } else if (this.e > 0.0f && this.f29480a != null) {
            int height = this.h.getHeight();
            Path path = new Path();
            float f = height;
            path.moveTo(0.0f, f - this.e);
            path.lineTo(0.0f, f);
            path.lineTo(this.e, f);
            float f2 = this.e;
            path.arcTo(new RectF(0.0f, f - (f2 * 2.0f), f2 * 2.0f, f), 90.0f, 90.0f);
            path.close();
            canvas.drawPath(path, this.f29480a);
        }
    }

    public final void c(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94031711", new Object[]{this, canvas});
        } else if (this.f > 0.0f && this.f29480a != null) {
            int height = this.h.getHeight();
            int width = this.h.getWidth();
            Path path = new Path();
            float f = width;
            float f2 = height;
            path.moveTo(f - this.f, f2);
            path.lineTo(f, f2);
            path.lineTo(f, f2 - this.f);
            float f3 = this.f;
            path.arcTo(new RectF(f - (f3 * 2.0f), f2 - (f3 * 2.0f), f, f2), 0.0f, 90.0f);
            path.close();
            canvas.drawPath(path, this.f29480a);
        }
    }

    public final void d(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54a968a6", new Object[]{this, canvas});
        } else if (this.c > 0.0f && this.f29480a != null) {
            Path path = new Path();
            path.moveTo(0.0f, this.c);
            path.lineTo(0.0f, 0.0f);
            path.lineTo(this.c, 0.0f);
            float f = this.c;
            path.arcTo(new RectF(0.0f, 0.0f, f * 2.0f, f * 2.0f), -90.0f, -90.0f);
            path.close();
            canvas.drawPath(path, this.f29480a);
        }
    }

    public final void e(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56619373", new Object[]{this, canvas});
        } else if (this.d > 0.0f && this.f29480a != null) {
            int width = this.h.getWidth();
            Path path = new Path();
            float f = width;
            path.moveTo(f - this.d, 0.0f);
            path.lineTo(f, 0.0f);
            path.lineTo(f, this.d);
            float f2 = this.d;
            path.arcTo(new RectF(f - (f2 * 2.0f), 0.0f, f, f2 * 2.0f), 0.0f, -90.0f);
            path.close();
            canvas.drawPath(path, this.f29480a);
        }
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cbe74c58", new Object[]{this})).booleanValue();
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 22 || i >= 29) {
            return false;
        }
        return true;
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1afb60e", new Object[]{this});
            return;
        }
        if (f()) {
            float f = this.c;
            float f2 = this.d;
            int i = (f > f2 ? 1 : (f == f2 ? 0 : -1));
            if (i == 0) {
                float f3 = this.e;
                if (f == f3 && f3 == this.f) {
                    this.h.setOutlineProvider(new a(this, (int) f));
                    this.h.setClipToOutline(true);
                    this.g = true;
                    return;
                }
            }
            if (i == 0 && this.e == 0.0f && this.f == 0.0f) {
                this.h.setOutlineProvider(new b(this, (int) f));
                this.h.setClipToOutline(true);
                this.g = true;
                return;
            }
            float f4 = this.e;
            float f5 = this.f;
            if (f4 == f5 && f == 0.0f && f2 == 0.0f) {
                this.h.setOutlineProvider(new c(this, (int) f4));
                this.h.setClipToOutline(true);
                this.g = true;
                return;
            } else if (f == f4 && f2 == 0.0f && f5 == 0.0f) {
                this.h.setOutlineProvider(new d(this, (int) f));
                this.h.setClipToOutline(true);
                this.g = true;
                return;
            } else if (f2 == f5 && f == 0.0f && f4 == 0.0f) {
                this.h.setOutlineProvider(new e(this, (int) f2));
                this.h.setClipToOutline(true);
                this.g = true;
                return;
            }
        }
        if (this.f29480a == null) {
            Paint paint = new Paint();
            this.f29480a = paint;
            paint.setColor(-1);
            this.f29480a.setAntiAlias(true);
            this.f29480a.setStyle(Paint.Style.FILL);
            this.f29480a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        if (this.b == null) {
            Paint paint2 = new Paint();
            this.b = paint2;
            paint2.setXfermode(null);
        }
    }

    public void h(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6855c89b", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
            return;
        }
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        g();
    }
}
