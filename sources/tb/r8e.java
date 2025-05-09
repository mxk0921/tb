package tb;

import android.content.Context;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class r8e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f27190a;
    public final int b;
    public int c;
    public int d;
    public int e;
    public ImageView.ScaleType f = ImageView.ScaleType.CENTER_CROP;
    public int g;
    public int h;
    public final int i;
    public int j;
    public int k;

    static {
        t2o.a(468714096);
    }

    public r8e(FluidContext fluidContext, int i, int i2) {
        Context context;
        this.f27190a = i2;
        this.b = i;
        if (fluidContext == null) {
            context = p91.a();
        } else {
            context = fluidContext.getContext();
        }
        this.i = s6o.v(context);
        this.j = p91.b(context, true, fluidContext) - pr9.c(context, 4);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "IVideoCommentSizeObject{height=" + this.f27190a + ", width=" + this.b + ", showHeight=" + this.c + ", showWidth=" + this.d + ", showMarginTop=" + this.e + ", showPaddingBottom=0, type=" + this.f + ", videoWidth=" + this.g + ", videoHeight=" + this.h + ", screenWidth=" + this.i + ", screenHeight=" + this.j + '}';
    }
}
