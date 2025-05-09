package com.taobao.phenix.animate;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pexode.animate.AnimatedDrawableFrameInfo;
import tb.ay0;
import tb.by0;
import tb.cd2;
import tb.ey0;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AnimatedFrameCompositor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final by0 f11458a;
    public final int b;
    public final int c;
    public final ay0 d;
    public final Paint e;
    public final AnimatedDrawableFrameInfo[] f;
    public Bitmap g;
    public final String h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum CompositedFrameRenderingType {
        REQUIRED,
        NOT_REQUIRED,
        SKIP,
        ABORT;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(CompositedFrameRenderingType compositedFrameRenderingType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/phenix/animate/AnimatedFrameCompositor$CompositedFrameRenderingType");
        }

        public static CompositedFrameRenderingType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CompositedFrameRenderingType) ipChange.ipc$dispatch("5a7e7823", new Object[]{str});
            }
            return (CompositedFrameRenderingType) Enum.valueOf(CompositedFrameRenderingType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$phenix$animate$AnimatedFrameCompositor$CompositedFrameRenderingType;

        static {
            int[] iArr = new int[CompositedFrameRenderingType.values().length];
            $SwitchMap$com$taobao$phenix$animate$AnimatedFrameCompositor$CompositedFrameRenderingType = iArr;
            try {
                iArr[CompositedFrameRenderingType.REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$phenix$animate$AnimatedFrameCompositor$CompositedFrameRenderingType[CompositedFrameRenderingType.NOT_REQUIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$phenix$animate$AnimatedFrameCompositor$CompositedFrameRenderingType[CompositedFrameRenderingType.ABORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$phenix$animate$AnimatedFrameCompositor$CompositedFrameRenderingType[CompositedFrameRenderingType.SKIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        t2o.a(620756995);
    }

    /* JADX WARN: Finally extract failed */
    public AnimatedFrameCompositor(by0 by0Var, ay0 ay0Var, String str) {
        this.f11458a = by0Var;
        this.h = str;
        this.b = by0Var.getWidth();
        this.c = by0Var.getHeight();
        this.d = ay0Var;
        Paint paint = new Paint();
        this.e = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.f = new AnimatedDrawableFrameInfo[by0Var.getFrameCount()];
        for (int i = 0; i < this.f11458a.getFrameCount(); i++) {
            ey0 frame = this.f11458a.getFrame(i);
            try {
                this.f[i] = frame.getFrameInfo();
                frame.dispose();
            } catch (Throwable th) {
                frame.dispose();
                throw th;
            }
        }
    }

    public final void a(Canvas canvas, AnimatedDrawableFrameInfo animatedDrawableFrameInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18d5a98e", new Object[]{this, canvas, animatedDrawableFrameInfo});
            return;
        }
        int i = animatedDrawableFrameInfo.f11451a;
        int i2 = animatedDrawableFrameInfo.b;
        canvas.drawRect(i, i2, i + animatedDrawableFrameInfo.c, i2 + animatedDrawableFrameInfo.d, this.e);
    }

    public synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64973187", new Object[]{this});
        } else {
            this.g = null;
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f90d85be", new Object[]{this});
            return;
        }
        Bitmap bitmap = this.g;
        if (bitmap == null) {
            this.g = cd2.b().a(this.b, this.c, Bitmap.Config.ARGB_8888);
        } else {
            bitmap.eraseColor(0);
        }
    }

    public final CompositedFrameRenderingType d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CompositedFrameRenderingType) ipChange.ipc$dispatch("e14137ac", new Object[]{this, new Integer(i)});
        }
        AnimatedDrawableFrameInfo animatedDrawableFrameInfo = this.f[i];
        AnimatedDrawableFrameInfo.DisposalMode disposalMode = animatedDrawableFrameInfo.e;
        if (disposalMode == AnimatedDrawableFrameInfo.DisposalMode.DISPOSE_DO_NOT) {
            return CompositedFrameRenderingType.REQUIRED;
        }
        if (disposalMode == AnimatedDrawableFrameInfo.DisposalMode.DISPOSE_TO_BACKGROUND) {
            if (f(animatedDrawableFrameInfo)) {
                return CompositedFrameRenderingType.NOT_REQUIRED;
            }
            return CompositedFrameRenderingType.REQUIRED;
        } else if (disposalMode == AnimatedDrawableFrameInfo.DisposalMode.DISPOSE_TO_PREVIOUS) {
            return CompositedFrameRenderingType.SKIP;
        } else {
            return CompositedFrameRenderingType.ABORT;
        }
    }

    public AnimatedDrawableFrameInfo e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnimatedDrawableFrameInfo) ipChange.ipc$dispatch("462a2eb8", new Object[]{this, new Integer(i)});
        }
        return this.f[i];
    }

    public final boolean f(AnimatedDrawableFrameInfo animatedDrawableFrameInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70fbec0d", new Object[]{this, animatedDrawableFrameInfo})).booleanValue();
        }
        if (animatedDrawableFrameInfo.f11451a == 0 && animatedDrawableFrameInfo.b == 0 && animatedDrawableFrameInfo.c == this.b && animatedDrawableFrameInfo.d == this.c) {
            return true;
        }
        return false;
    }

    public final boolean g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff0e58c8", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i == 0) {
            return true;
        }
        AnimatedDrawableFrameInfo[] animatedDrawableFrameInfoArr = this.f;
        AnimatedDrawableFrameInfo animatedDrawableFrameInfo = animatedDrawableFrameInfoArr[i];
        AnimatedDrawableFrameInfo animatedDrawableFrameInfo2 = animatedDrawableFrameInfoArr[i - 1];
        if (animatedDrawableFrameInfo.f == AnimatedDrawableFrameInfo.BlendMode.NO_BLEND && f(animatedDrawableFrameInfo)) {
            return true;
        }
        if (animatedDrawableFrameInfo2.e != AnimatedDrawableFrameInfo.DisposalMode.DISPOSE_TO_BACKGROUND || !f(animatedDrawableFrameInfo2)) {
            return false;
        }
        return true;
    }

    public final int h(int i, Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9c242a60", new Object[]{this, new Integer(i), canvas})).intValue();
        }
        while (i >= 0) {
            int i2 = a.$SwitchMap$com$taobao$phenix$animate$AnimatedFrameCompositor$CompositedFrameRenderingType[d(i).ordinal()];
            if (i2 == 1) {
                AnimatedDrawableFrameInfo animatedDrawableFrameInfo = this.f[i];
                Bitmap d = this.d.d(i);
                if (d != null) {
                    canvas.drawBitmap(d, 0.0f, 0.0f, (Paint) null);
                    this.d.c(d);
                    if (animatedDrawableFrameInfo.e == AnimatedDrawableFrameInfo.DisposalMode.DISPOSE_TO_BACKGROUND) {
                        a(canvas, animatedDrawableFrameInfo);
                    }
                    return i + 1;
                } else if (g(i)) {
                    return i;
                }
            } else if (i2 == 2) {
                return i + 1;
            } else {
                if (i2 == 3) {
                    return i;
                }
            }
            i--;
        }
        return 0;
    }

    public void i(int i, Bitmap bitmap) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c627b589", new Object[]{this, new Integer(i), bitmap});
            return;
        }
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(0, PorterDuff.Mode.SRC);
        if (g(i)) {
            i2 = i;
        } else {
            i2 = h(i - 1, canvas);
        }
        while (i2 < i) {
            AnimatedDrawableFrameInfo animatedDrawableFrameInfo = this.f[i2];
            AnimatedDrawableFrameInfo.DisposalMode disposalMode = animatedDrawableFrameInfo.e;
            if (disposalMode != AnimatedDrawableFrameInfo.DisposalMode.DISPOSE_TO_PREVIOUS) {
                if (animatedDrawableFrameInfo.f == AnimatedDrawableFrameInfo.BlendMode.NO_BLEND) {
                    a(canvas, animatedDrawableFrameInfo);
                }
                j(i2, canvas);
                if (disposalMode == AnimatedDrawableFrameInfo.DisposalMode.DISPOSE_TO_BACKGROUND) {
                    a(canvas, animatedDrawableFrameInfo);
                }
            }
            i2++;
        }
        AnimatedDrawableFrameInfo animatedDrawableFrameInfo2 = this.f[i];
        if (animatedDrawableFrameInfo2.f == AnimatedDrawableFrameInfo.BlendMode.NO_BLEND) {
            a(canvas, animatedDrawableFrameInfo2);
        }
        j(i, canvas);
    }

    public final void j(int i, Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5eb5813", new Object[]{this, new Integer(i), canvas});
            return;
        }
        ey0 frame = this.f11458a.getFrame(i);
        try {
            synchronized (this) {
                c();
                frame.renderFrame(frame.getWidth(), frame.getHeight(), this.g);
                canvas.save();
                canvas.translate(frame.getXOffset(), frame.getYOffset());
                canvas.drawBitmap(this.g, 0.0f, 0.0f, (Paint) null);
                canvas.restore();
            }
        } finally {
            try {
            } finally {
            }
        }
    }
}
