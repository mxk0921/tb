package tb;

import android.content.Context;
import android.view.View;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.nh;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "tbbuy.impl.render.component.creator.dx.float.autoSize")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class a9r extends qs {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int b = 0;
    public int c = 0;

    static {
        t2o.a(708837492);
    }

    public static /* synthetic */ Object ipc$super(a9r a9rVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/purchase/aura/extension/autosize/TBBuyPopupWindowDxComponentAutoSizeExtension");
    }

    public final boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9e9ebfe", new Object[]{this})).booleanValue();
        }
        return ((Boolean) fk.b(r().i(), "autoSize", Boolean.class, Boolean.FALSE)).booleanValue();
    }

    @Override // tb.qs
    public nh.c x(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nh.c) ipChange.ipc$dispatch("1da9f9d", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        if (!B()) {
            return null;
        }
        nh.c cVar = new nh.c();
        cVar.b = i2;
        cVar.f24727a = i;
        Context f = r().f();
        if (xh.c(r().f())) {
            if (this.b == 0) {
                this.b = View.MeasureSpec.makeMeasureSpec(xh.a(f), 1073741824);
                rbb g = ck.g();
                g.d("float updateRenderParam cacheWidthSpec = " + this.b);
            }
            cVar.f24727a = this.b;
        } else {
            if (this.c == 0) {
                this.c = View.MeasureSpec.makeMeasureSpec(xh.a(f) / 2, 1073741824);
                rbb g2 = ck.g();
                g2.d("float updateRenderParam cacheHeightSpec = " + this.c);
            }
            cVar.f24727a = this.c;
        }
        return cVar;
    }
}
