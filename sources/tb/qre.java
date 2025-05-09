package tb;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.mmd.uikit.iconlist.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class qre extends yxa<pre> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final float j = o1p.b(12);
    public Drawable i;

    static {
        t2o.a(815793082);
    }

    public qre(pre preVar, boolean z, Context context) {
        super(preVar, z);
        String str;
        int i = (int) j;
        a aVar = new a(context, this, i, i, 0);
        if (!z || TextUtils.isEmpty(preVar.b())) {
            str = preVar.e();
        } else {
            str = preVar.b();
        }
        aVar.h(str);
    }

    public static /* synthetic */ Object ipc$super(qre qreVar, String str, Object... objArr) {
        if (str.hashCode() == -1688871921) {
            super.onDrawableLoaded((BitmapDrawable) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/searchbar/drawable/ImgTextHintDrawable");
    }

    @Override // tb.yxa
    public float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22ffaa3a", new Object[]{this})).floatValue();
        }
        return this.c.measureText(((pre) this.f32406a).f()) + j;
    }

    @Override // tb.yxa
    public void d() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6748d30c", new Object[]{this});
            return;
        }
        TextPaint textPaint = new TextPaint();
        this.c = textPaint;
        textPaint.setAntiAlias(true);
        this.c.setTextSize(o1p.b(((pre) this.f32406a).h()));
        TextPaint textPaint2 = this.c;
        if (!this.b || TextUtils.isEmpty(((pre) this.f32406a).c())) {
            str = ((pre) this.f32406a).g();
        } else {
            str = ((pre) this.f32406a).c();
        }
        textPaint2.setColor(qrl.b(str, -1));
        this.c.setAlpha((int) (this.f * 255.0f));
        this.c.setFakeBoldText(true);
        if (!TextUtils.isEmpty(((pre) this.f32406a).a()) || !TextUtils.isEmpty(((pre) this.f32406a).d())) {
            Paint paint = new Paint();
            this.d = paint;
            paint.setAntiAlias(true);
            Paint paint2 = this.d;
            if (!this.b || TextUtils.isEmpty(((pre) this.f32406a).a())) {
                str2 = ((pre) this.f32406a).d();
            } else {
                str2 = ((pre) this.f32406a).a();
            }
            paint2.setColor(qrl.b(str2, 0));
            this.d.setStyle(Paint.Style.FILL);
            this.d.setAlpha((int) (this.f * 255.0f));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        if (this.d != null) {
            float b = b();
            float f = yxa.g;
            canvas.drawRoundRect(0.0f, 0.0f, b + (f * 2.0f), getIntrinsicHeight(), f, f, this.d);
        }
        if (this.i != null) {
            float f2 = j;
            int intrinsicHeight = (int) ((getIntrinsicHeight() - f2) / 2.0f);
            Drawable drawable = this.i;
            float f3 = yxa.g;
            drawable.setBounds((int) f3, intrinsicHeight, (int) (f3 + f2), (int) (intrinsicHeight + f2));
            this.i.draw(canvas);
        }
        canvas.drawText(((pre) this.f32406a).f(), yxa.g + j, a(), this.c);
    }

    @Override // tb.yxa, com.taobao.search.mmd.uikit.iconlist.a.d
    public void onDrawableLoaded(BitmapDrawable bitmapDrawable, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b55dc0f", new Object[]{this, bitmapDrawable, new Integer(i), str});
            return;
        }
        this.i = bitmapDrawable;
        if (bitmapDrawable != null) {
            bitmapDrawable.setAlpha((int) (this.f * 255.0f));
        }
        super.onDrawableLoaded(bitmapDrawable, i, str);
    }
}
