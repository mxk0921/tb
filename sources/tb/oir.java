package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.view.DXNativeViewPagerView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class oir extends m8<tk6> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long TBLVIEWPAGERABILITY = 7889033866540594253L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(806355389);
            t2o.a(336592930);
        }

        /* renamed from: a */
        public oir build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (oir) ipChange.ipc$dispatch("a886c7fd", new Object[]{this, obj});
            }
            return new oir();
        }
    }

    static {
        t2o.a(806355388);
    }

    public static /* synthetic */ Object ipc$super(oir oirVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/home/dinamic/ability/TBLViewPagerAbilityAbility");
    }

    /* renamed from: i */
    public c8 f(n8 n8Var, tk6 tk6Var, u8 u8Var) {
        DXRootView L;
        DXWidgetNode queryWidgetNodeByUserId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("f0bde67e", new Object[]{this, n8Var, tk6Var, u8Var});
        }
        JSONObject h = n8Var == null ? null : n8Var.h();
        if (h == null) {
            return new d8();
        }
        String string = h.getString("action");
        String string2 = h.getString("targetNodeId");
        String string3 = h.getString("value");
        if (orq.a(string) || orq.a(string3) || orq.a(string2)) {
            return new d8();
        }
        if ("scrollEnabled".equals(string)) {
            if (!(tk6Var == null || (L = tk6Var.p().L()) == null || L.getExpandWidgetNode() == null || orq.a(string2) || (queryWidgetNodeByUserId = L.getExpandWidgetNode().queryWidgetNodeByUserId(string2)) == null)) {
                View D = queryWidgetNodeByUserId.getDXRuntimeContext().D();
                if (D instanceof DXNativeViewPagerView) {
                    DXNativeViewPagerView dXNativeViewPagerView = (DXNativeViewPagerView) D;
                    dXNativeViewPagerView.setEnableScroll_Android(Boolean.parseBoolean(string3));
                    dXNativeViewPagerView.setScrollable(Boolean.parseBoolean(string3));
                }
            }
            return new f8();
        }
        "header".equals(string);
        return new d8();
    }
}
