package tb;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class zo5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final long DX_PARSER_ORDERLISTGETBODYHEIGHT = -6980050407029401387L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(614465671);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(614465670);
    }

    public static /* synthetic */ Object ipc$super(zo5 zo5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/dinamicX/parser/DXDataParserOrderListGetBodyHeight");
    }

    public final boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe4c5214", new Object[]{this, context})).booleanValue();
        }
        Resources resources = context.getResources();
        ckf.f(resources, "context.resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        ckf.f(displayMetrics, "context.resources.displayMetrics");
        if (displayMetrics.widthPixels > displayMetrics.heightPixels) {
            return true;
        }
        return false;
    }

    public final int d(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64b9d356", new Object[]{this, context, new Integer(i)})).intValue();
        }
        Resources resources = context.getResources();
        ckf.f(resources, "context.resources");
        return (int) (i / resources.getDisplayMetrics().density);
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (!(objArr == null || dXRuntimeContext == null)) {
            try {
                Context h = dXRuntimeContext.h();
                ckf.f(h, "dinamicParams.context");
                int f = lbv.f(h);
                DXRootView L = dXRuntimeContext.L();
                ckf.f(L, "dinamicParams.rootView");
                DXWidgetNode expandWidgetNode = L.getExpandWidgetNode();
                ckf.f(expandWidgetNode, "dinamicParams.rootView.expandWidgetNode");
                int layoutHeight = expandWidgetNode.getLayoutHeight();
                return String.valueOf(d(h, (f - layoutHeight) - a(h))) + "np";
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public final int a(Context context) {
        Resources resources;
        int identifier;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b91d22e4", new Object[]{this, context})).intValue();
        }
        if (!(context instanceof Activity)) {
            return 0;
        }
        Activity activity = (Activity) context;
        if (!c(activity) || (identifier = (resources = activity.getResources()).getIdentifier("navigation_bar_height", "dimen", "android")) <= 0) {
            return 0;
        }
        return resources.getDimensionPixelSize(identifier);
    }

    public final boolean c(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5a631f9", new Object[]{this, activity})).booleanValue();
        }
        Window window = activity.getWindow();
        ckf.f(window, "activity.window");
        View findViewById = window.getDecorView().findViewById(16908290);
        if (findViewById != null) {
            Object systemService = activity.getSystemService(pg1.ATOM_EXT_window);
            if (systemService != null) {
                Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                if (!b(activity)) {
                    if (findViewById.getBottom() != point.y) {
                        return true;
                    }
                } else if (findViewById.getRight() != point.x) {
                    return true;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
            }
        }
        return false;
    }
}
