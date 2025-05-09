package tb;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.widget.border.BorderProp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class cgl implements nrb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f17048a;
    public fjd b;
    public boolean c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/ui/cache/OutlineCornerProvider$1");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                return;
            }
            int a2 = cgl.a(cgl.this);
            if (view.getWidth() > 0 && view.getHeight() > 0) {
                a2 = Math.min(Math.min(view.getWidth(), view.getHeight()) / 2, cgl.a(cgl.this));
            }
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), a2);
        }
    }

    static {
        t2o.a(986710100);
        t2o.a(986710098);
    }

    public static /* synthetic */ int a(cgl cglVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("abb84641", new Object[]{cglVar})).intValue();
        }
        return cglVar.f17048a;
    }

    public void b(fjd fjdVar, int i, int i2, BorderProp borderProp) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf5f21a0", new Object[]{this, fjdVar, new Integer(i), new Integer(i2), borderProp});
            return;
        }
        if (borderProp == null || borderProp.k() == null) {
            this.f17048a = 0;
        } else {
            this.f17048a = borderProp.e(0);
        }
        if (this.c) {
            this.b.getView().invalidateOutline();
            return;
        }
        this.b = fjdVar;
        this.c = true;
        fjdVar.getView().setOutlineProvider(new a());
        this.b.getView().setClipToOutline(true);
        this.b.getView().invalidateOutline();
    }
}
