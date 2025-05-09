package tb;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class klt extends yxa<jlt> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793083);
    }

    public klt(jlt jltVar, boolean z) {
        super(jltVar, z);
    }

    public static /* synthetic */ Object ipc$super(klt kltVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/searchbar/drawable/TextHintDrawable");
    }

    @Override // tb.yxa
    public float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22ffaa3a", new Object[]{this})).floatValue();
        }
        return this.c.measureText(((jlt) this.f32406a).d());
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
        this.c.setTextSize(o1p.b(((jlt) this.f32406a).f()));
        TextPaint textPaint2 = this.c;
        if (!this.b || TextUtils.isEmpty(((jlt) this.f32406a).b())) {
            str = ((jlt) this.f32406a).e();
        } else {
            str = ((jlt) this.f32406a).b();
        }
        textPaint2.setColor(qrl.b(str, -1));
        this.c.setAlpha((int) (this.f * 255.0f));
        this.c.setFakeBoldText(((jlt) this.f32406a).g());
        if (!TextUtils.isEmpty(((jlt) this.f32406a).a()) || !TextUtils.isEmpty(((jlt) this.f32406a).c())) {
            Paint paint = new Paint();
            this.d = paint;
            paint.setAntiAlias(true);
            Paint paint2 = this.d;
            if (!this.b || TextUtils.isEmpty(((jlt) this.f32406a).a())) {
                str2 = ((jlt) this.f32406a).c();
            } else {
                str2 = ((jlt) this.f32406a).a();
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
            canvas.drawRoundRect(0.0f, 0.0f, b + (2.0f * f), getIntrinsicHeight(), f, f, this.d);
        }
        canvas.drawText(((jlt) this.f32406a).d(), yxa.g, a(), this.c);
    }
}
