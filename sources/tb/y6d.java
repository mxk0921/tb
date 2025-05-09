package tb;

import android.content.Context;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.datamodel.a;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface y6d {
    public static final String QUICK_OPEN_TAG = "quickOpenTag";

    void a(FluidContext fluidContext, List<a> list, boolean z);

    RotateAnimation b();

    void c(FluidContext fluidContext, Context context, anl anlVar, ViewGroup viewGroup, boolean z);

    void d(FluidContext fluidContext);

    a e(FluidContext fluidContext);
}
