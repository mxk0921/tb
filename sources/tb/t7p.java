package tb;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class t7p {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Rect l = new Rect();

    /* renamed from: a  reason: collision with root package name */
    public dod f28546a;
    public Bitmap f;
    public a i;
    public final boolean j;
    public final ttc k;
    public final RectF b = new RectF();
    public final Paint c = new Paint(1);
    public final Paint d = new Paint(1);
    public int e = p1p.a(10.0f);
    public final Path g = new Path();
    public final float[] h = new float[8];

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        rtg Z();
    }

    static {
        t2o.a(993002099);
    }

    public t7p(boolean z, ttc ttcVar) {
        this.k = ttcVar;
        c(z);
        this.j = z;
    }

    public final void a(Canvas canvas, int i, int i2, RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b06959e6", new Object[]{this, canvas, new Integer(i), new Integer(i2), rectF});
        } else if (i == 0 && i2 == 0) {
            canvas.drawRect(rectF, this.c);
        } else if (i == i2) {
            float f = i;
            canvas.drawRoundRect(rectF, f, f, this.c);
        } else {
            this.g.reset();
            float[] fArr = this.h;
            float f2 = i;
            fArr[0] = f2;
            fArr[1] = f2;
            fArr[2] = f2;
            fArr[3] = f2;
            float f3 = i2;
            fArr[4] = f3;
            fArr[5] = f3;
            fArr[6] = f3;
            fArr[7] = f3;
            this.g.addRoundRect(rectF, fArr, Path.Direction.CW);
            this.g.close();
            canvas.drawPath(this.g, this.c);
        }
    }

    public final void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c7ac372", new Object[]{this, new Integer(i)});
        } else if (this.f == null) {
            Canvas canvas = new Canvas();
            Bitmap createBitmap = Bitmap.createBitmap(i, this.e, Bitmap.Config.ARGB_4444);
            this.f = createBitmap;
            canvas.setBitmap(createBitmap);
            Rect rect = new Rect();
            rect.set(0, 0, i, this.e);
            canvas.drawRect(rect, this.d);
        }
    }

    public final void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81d24148", new Object[]{this, new Boolean(z)});
            return;
        }
        Paint paint = this.c;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.d.setStyle(style);
        int[] a2 = this.k.a(z);
        this.d.setShader(new LinearGradient(0.0f, this.e, 0.0f, 0.0f, a2[0], a2[1], Shader.TileMode.CLAMP));
    }

    public final boolean d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f68f79e5", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return this.f28546a.A(i);
    }

    public void e(Canvas canvas, PartnerRecyclerView partnerRecyclerView) {
        rtg rtgVar;
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        rtg rtgVar2;
        int i4;
        RecyclerView.Adapter adapter;
        int i5;
        int i6;
        int i7;
        int i8 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfab7c3d", new Object[]{this, canvas, partnerRecyclerView});
            return;
        }
        int childCount = partnerRecyclerView.getChildCount();
        int headerViewsCount = partnerRecyclerView.getHeaderViewsCount();
        int footerViewsCount = partnerRecyclerView.getFooterViewsCount();
        RecyclerView.Adapter adapter2 = partnerRecyclerView.getAdapter();
        if (adapter2 != null) {
            a aVar = this.i;
            if (aVar == null) {
                rtgVar = null;
            } else {
                rtgVar = aVar.Z();
            }
            if (rtgVar != null) {
                i2 = rtgVar.d();
                i = rtgVar.b();
                this.c.setColor(rtgVar.a());
                z2 = rtgVar.e();
                z = rtgVar.f();
            } else {
                i2 = 0;
                i = 0;
                z2 = true;
                z = false;
            }
            int i9 = -1;
            int i10 = Integer.MIN_VALUE;
            boolean z3 = true;
            boolean z4 = false;
            while (true) {
                if (i8 >= childCount) {
                    i3 = i2;
                    break;
                }
                View childAt = partnerRecyclerView.getChildAt(i8);
                i3 = i2;
                int childAdapterPosition = partnerRecyclerView.getChildAdapterPosition(childAt);
                if (childAdapterPosition < headerViewsCount) {
                    i5 = headerViewsCount;
                    i4 = footerViewsCount;
                    adapter = adapter2;
                    rtgVar2 = rtgVar;
                    i2 = i3;
                } else {
                    adapter = adapter2;
                    if (childAdapterPosition >= adapter2.getItemCount() - footerViewsCount) {
                        break;
                    }
                    int i11 = childAdapterPosition - headerViewsCount;
                    if (!z2 || !d(i11)) {
                        i5 = headerViewsCount;
                        if (z3) {
                            if (i11 > 0) {
                                i7 = 0;
                            } else {
                                i7 = i3;
                            }
                            z3 = false;
                        } else {
                            i7 = i3;
                        }
                        w7p r = this.f28546a.r(i11);
                        if ((rtgVar == null || rtgVar.a() == 0) && (r == null || r.b() == 0)) {
                            i4 = footerViewsCount;
                            rtgVar2 = rtgVar;
                            i2 = i7;
                        } else {
                            if (rtgVar != null || r == null) {
                                i4 = footerViewsCount;
                                if (!(!z || r == null || r.b() == 0)) {
                                    this.c.setColor(r.b());
                                }
                            } else {
                                i4 = footerViewsCount;
                                this.c.setColor(r.b());
                            }
                            Rect rect = l;
                            partnerRecyclerView.getDecoratedBoundsWithMargins(childAt, rect);
                            if (i10 == Integer.MIN_VALUE) {
                                i10 = rect.top;
                            }
                            int i12 = rect.bottom;
                            boolean j = this.f28546a.j(i11);
                            rtgVar2 = rtgVar;
                            if (j || this.f28546a.A(i11 + 1)) {
                                int max = Math.max(i9, i12);
                                this.b.set(0.0f, i10, partnerRecyclerView.getWidth(), max);
                                if (!j && i8 < childCount - 1) {
                                    partnerRecyclerView.getDecoratedBoundsWithMargins(partnerRecyclerView.getChildAt(i8 + 1), rect);
                                    RectF rectF = this.b;
                                    float f = rectF.bottom;
                                    float f2 = rect.top;
                                    if (f < f2) {
                                        rectF.bottom = f2;
                                    }
                                }
                                a(canvas, i7, i, this.b);
                                i2 = i7;
                                i9 = max;
                                i10 = Integer.MIN_VALUE;
                                i6 = 1;
                                z4 = false;
                            } else {
                                i9 = Math.max(i9, i12);
                                i2 = i7;
                                i6 = 1;
                                z4 = true;
                            }
                            i8 += i6;
                            headerViewsCount = i5;
                            adapter2 = adapter;
                            footerViewsCount = i4;
                            rtgVar = rtgVar2;
                        }
                    } else {
                        i5 = headerViewsCount;
                        i4 = footerViewsCount;
                        rtgVar2 = rtgVar;
                        i2 = i3;
                        i10 = Integer.MIN_VALUE;
                    }
                }
                i6 = 1;
                i8 += i6;
                headerViewsCount = i5;
                adapter2 = adapter;
                footerViewsCount = i4;
                rtgVar = rtgVar2;
            }
            if (z4) {
                this.b.set(0.0f, i10, partnerRecyclerView.getWidth(), i9);
                a(canvas, i3, i, this.b);
            }
        }
    }

    public void f(Canvas canvas, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bc56827", new Object[]{this, canvas, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (j(i)) {
            b(i3 - i2);
            canvas.drawBitmap(this.f, 0.0f, i4 - this.e, (Paint) null);
        }
    }

    public void g(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daf2cbb4", new Object[]{this, aVar});
        } else {
            this.i = aVar;
        }
    }

    public void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85910427", new Object[]{this, new Integer(i)});
            return;
        }
        this.e = i;
        c(this.j);
    }

    public void i(dod dodVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a55e685", new Object[]{this, dodVar});
        } else {
            this.f28546a = dodVar;
        }
    }

    public final boolean j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fe4c837", new Object[]{this, new Integer(i)})).booleanValue();
        }
        BaseCellBean t = this.f28546a.t(i);
        if (t == null || !t.isSectionClip()) {
            return false;
        }
        if (t.isForceShowClipOverlay()) {
            return true;
        }
        BaseCellBean t2 = this.f28546a.t(i - 1);
        if (t2 != null && t2.clipHeight > 0) {
            return true;
        }
        BaseCellBean t3 = this.f28546a.t(i - 2);
        if (t3 == null || t3.clipHeight <= 0) {
            return false;
        }
        return true;
    }
}
