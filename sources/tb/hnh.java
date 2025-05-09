package tb;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.adapter.MUSImageQuality;
import com.taobao.search.common.dynamic.bean.SearchDomBean;
import tb.hpc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class hnh extends Drawable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final SearchDomBean f20763a;
    public final Context b;
    public final int c;
    public Drawable d;
    public final int e;
    public final int f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a implements hpc.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Object f20764a;

        public a() {
        }

        @Override // tb.hpc.a
        public void c(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56ebcd44", new Object[]{this, drawable});
                return;
            }
            hnh.d(hnh.this, drawable);
            Drawable c = hnh.c(hnh.this);
            if (c != null) {
                c.setBounds(0, 0, hnh.b(hnh.this), hnh.this.getIntrinsicHeight());
            }
            hnh.this.invalidateSelf();
        }

        @Override // tb.hpc.a
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c5e62fda", new Object[]{this});
            }
        }

        @Override // tb.hpc.a
        public void g(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e11aa67b", new Object[]{this, obj});
            } else {
                this.f20764a = obj;
            }
        }

        @Override // tb.hpc.a
        public int getHeight() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
            }
            return hnh.a(hnh.this);
        }

        @Override // tb.hpc.a
        public Object getTag() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("61e2c7a7", new Object[]{this});
            }
            return this.f20764a;
        }

        @Override // tb.hpc.a
        public int getWidth() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
            }
            return hnh.b(hnh.this);
        }
    }

    static {
        t2o.a(815792459);
    }

    public hnh(SearchDomBean searchDomBean, Context context, int i) {
        ckf.g(searchDomBean, "domBean");
        ckf.g(context, "context");
        this.f20763a = searchDomBean;
        this.b = context;
        this.c = i;
        int i2 = (int) ((i * searchDomBean.width) / searchDomBean.height);
        this.e = i2;
        this.f = i2 + o1p.a(3.0f);
        setBounds(0, 0, getIntrinsicWidth(), getIntrinsicHeight());
    }

    public static final /* synthetic */ int a(hnh hnhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e8ebae09", new Object[]{hnhVar})).intValue();
        }
        return hnhVar.c;
    }

    public static final /* synthetic */ int b(hnh hnhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("17da25ea", new Object[]{hnhVar})).intValue();
        }
        return hnhVar.e;
    }

    public static final /* synthetic */ Drawable c(hnh hnhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("55a12097", new Object[]{hnhVar});
        }
        return hnhVar.d;
    }

    public static final /* synthetic */ void d(hnh hnhVar, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e112995b", new Object[]{hnhVar, drawable});
        } else {
            hnhVar.d = drawable;
        }
    }

    public static /* synthetic */ Object ipc$super(hnh hnhVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/m3/title/M3ImageIcon");
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6def666d", new Object[]{this});
            return;
        }
        hpc e = uvh.f().e();
        if (e != null) {
            e.b(this.b, this.f20763a.image, new a(), MUSImageQuality.AUTO);
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else {
            uvh.f().e();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2b8a1d0", new Object[]{this})).intValue();
        }
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2990b5b1", new Object[]{this})).intValue();
        }
        return this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2242c5cf", new Object[]{this})).intValue();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65fee558", new Object[]{this, colorFilter});
        }
    }
}
