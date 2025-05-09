package tb;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.regionedit.MaskView;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class s5i implements fid {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<fid> f27808a;
    public final Paint b;
    public float d = 1.0f;
    public final float c = zb7.a(4.0f);

    static {
        t2o.a(481297377);
        t2o.a(481297376);
    }

    public s5i() {
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
        paint.setStyle(Paint.Style.FILL);
    }

    @Override // tb.fid
    public RectF b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("3528cf94", new Object[]{this});
        }
        return null;
    }

    @Override // tb.fid
    public void d(MaskView maskView, Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0dfae5e", new Object[]{this, maskView, canvas});
            return;
        }
        ckf.g(maskView, f8v.KEY_TARGET_VIEW);
        ckf.g(canvas, "canvas");
        f(maskView, canvas, maskView.isMainMaskFullOfParent());
        e(maskView, canvas);
    }

    public final void e(MaskView maskView, Canvas canvas) {
        View targetImageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68e653ca", new Object[]{this, maskView, canvas});
        } else if (this.f27808a != null && (targetImageView = maskView.getTargetImageView()) != null) {
            this.b.setColor(0);
            canvas.translate(targetImageView.getLeft() + targetImageView.getTranslationX(), targetImageView.getTop() + targetImageView.getTranslationY());
            List<fid> list = this.f27808a;
            ckf.d(list);
            for (fid fidVar : list) {
                RectF b = fidVar.b();
                if (b != null) {
                    float f = this.c;
                    canvas.drawRoundRect(b, f, f, this.b);
                }
            }
            canvas.translate((-targetImageView.getLeft()) - targetImageView.getTranslationX(), (-targetImageView.getTop()) - targetImageView.getTranslationY());
        }
    }

    public final void f(MaskView maskView, Canvas canvas, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a83ac8b1", new Object[]{this, maskView, canvas, new Boolean(z)});
            return;
        }
        this.b.setColor(t5i.a());
        View targetImageView = maskView.getTargetImageView();
        if (z || targetImageView == null) {
            canvas.drawRect(0.0f, 0.0f, maskView.getWidth(), maskView.getHeight(), this.b);
            return;
        }
        canvas.translate(targetImageView.getLeft() + targetImageView.getTranslationX(), targetImageView.getTop() + targetImageView.getTranslationY());
        canvas.drawRect(0.0f, 0.0f, maskView.getRealWidth() * this.d, maskView.getRealHeight() * this.d, this.b);
        canvas.translate((-targetImageView.getLeft()) - targetImageView.getTranslationX(), (-targetImageView.getTop()) - targetImageView.getTranslationY());
    }

    public final void g(List<fid> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71888c7a", new Object[]{this, list});
        } else {
            this.f27808a = list;
        }
    }

    @Override // tb.fid
    public void setScale(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c41af11", new Object[]{this, new Float(f)});
        } else {
            this.d = f;
        }
    }

    @Override // tb.fid
    public void a(MaskView maskView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ac2014", new Object[]{this, maskView});
            return;
        }
        ckf.g(maskView, "view");
        maskView.setLayerType(0, null);
    }

    @Override // tb.fid
    public void c(MaskView maskView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfa2646", new Object[]{this, maskView});
            return;
        }
        ckf.g(maskView, "view");
        maskView.setLayerType(2, null);
    }
}
