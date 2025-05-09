package tb;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.model.layer.a;
import com.airbnb.lottie.model.layer.b;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class nhp extends a {
    public final xo4 D;
    public final b E;

    public nhp(LottieDrawable lottieDrawable, Layer layer, b bVar) {
        super(lottieDrawable, layer);
        this.E = bVar;
        xo4 xo4Var = new xo4(lottieDrawable, this, new khp("__container", layer.n(), false));
        this.D = xo4Var;
        xo4Var.c(Collections.emptyList(), Collections.emptyList());
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void H(e4g e4gVar, int i, List<e4g> list, e4g e4gVar2) {
        this.D.d(e4gVar, i, list, e4gVar2);
    }

    @Override // com.airbnb.lottie.model.layer.a, tb.ty7
    public void e(RectF rectF, Matrix matrix, boolean z) {
        super.e(rectF, matrix, z);
        this.D.e(rectF, this.o, z);
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void t(Canvas canvas, Matrix matrix, int i) {
        this.D.b(canvas, matrix, i);
    }

    @Override // com.airbnb.lottie.model.layer.a
    public ag2 v() {
        ag2 v = super.v();
        if (v != null) {
            return v;
        }
        return this.E.v();
    }

    @Override // com.airbnb.lottie.model.layer.a
    public e08 x() {
        e08 x = super.x();
        if (x != null) {
            return x;
        }
        return this.E.x();
    }
}
