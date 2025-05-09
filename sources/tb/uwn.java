package tb;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class uwn extends dtl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public vwn h;
    public WeakReference<Drawable.Callback> i;
    public boolean j;

    static {
        t2o.a(620757062);
    }

    public uwn(Resources resources, Bitmap bitmap, Rect rect, String str, String str2, int i, int i2) {
        super(resources, bitmap, rect, str, str2, i, i2);
    }

    public static /* synthetic */ Object ipc$super(uwn uwnVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1665133574) {
            super.draw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == -1218524698) {
            return super.a();
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/phenix/cache/memory/ReleasableBitmapDrawable");
        }
    }

    @Override // tb.dtl
    public NinePatchDrawable a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NinePatchDrawable) ipChange.ipc$dispatch("b75ec9e6", new Object[]{this});
        }
        NinePatchDrawable a2 = super.a();
        synchronized (this) {
            if (a2 != null) {
                try {
                    vwn vwnVar = this.h;
                    if (vwnVar != null) {
                        ((bu2) vwnVar).h(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return a2;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable.Callback callback;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
        } else if (this.j) {
            fiv.c("Phenix", "ReleaseBitmapDrawable has been released before drawing!", new Object[0]);
        } else {
            super.draw(canvas);
            Drawable.Callback callback2 = getCallback();
            WeakReference<Drawable.Callback> weakReference = this.i;
            if (weakReference != null) {
                callback = weakReference.get();
                if (callback == callback2) {
                    return;
                }
            } else {
                callback = null;
            }
            synchronized (this) {
                if (callback != null) {
                    try {
                        vwn vwnVar = this.h;
                        if (vwnVar != null) {
                            ((bu2) vwnVar).h(this);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.i = new WeakReference<>(callback2);
        }
    }

    public synchronized void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8b52eef", new Object[]{this});
            return;
        }
        vwn vwnVar = this.h;
        if (vwnVar != null) {
            ((bu2) vwnVar).h(this);
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        setCallback(null);
        this.j = true;
        synchronized (this) {
            vwn vwnVar = this.h;
            if (vwnVar != null) {
                ((bu2) vwnVar).i(this);
            }
        }
    }

    public synchronized void n(vwn vwnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85d04ea9", new Object[]{this, vwnVar});
        } else {
            this.h = vwnVar;
        }
    }
}
