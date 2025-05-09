package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.megadesign.dx.view.DXMarqueeTextViewWidgetNode;
import com.taobao.android.megadesign.dx.view.DXTBScrollerLayoutPlus;
import java.util.Map;
import tb.e46;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class mii implements qqc<qub> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String NAME_SPACE_MEGA_DESIGN = "NAME_SPACE_MEGA_DESIGN";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(786432072);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(786432071);
        t2o.a(144703571);
    }

    @Override // tb.qqc
    public Map<String, qub> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("90769f0a", new Object[]{this});
        }
        try {
            return kotlin.collections.a.j(jpu.a(String.valueOf(e46.Companion.a()), new e46.a()), jpu.a(String.valueOf((long) DXMarqueeTextViewWidgetNode.DXORDERMARQUEETEXTVIEW_ORDERMARQUEETEXTVIEW), new DXMarqueeTextViewWidgetNode.a()), jpu.a(String.valueOf((long) DXTBScrollerLayoutPlus.DXTBORDERSCROLLERLAYOUT_TBORDERSCROLLERLAYOUT), new DXTBScrollerLayoutPlus.b()));
        } catch (NoClassDefFoundError unused) {
            return kotlin.collections.a.h();
        }
    }
}
