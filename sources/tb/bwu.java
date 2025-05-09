package tb;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class bwu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static long f16690a = 0;
    public static final long b = 300;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f16691a;

        public a(float f) {
            this.f16691a = f;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/util/UIUtils$1");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
            } else {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f16691a);
            }
        }
    }

    static {
        t2o.a(745538215);
    }

    public static View a(DXRootView dXRootView, String str) {
        DXWidgetNode queryWidgetNodeByUserId;
        DXRuntimeContext dXRuntimeContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b453f526", new Object[]{dXRootView, str});
        }
        DXWidgetNode expandWidgetNode = dXRootView.getExpandWidgetNode();
        if (expandWidgetNode == null || (queryWidgetNodeByUserId = expandWidgetNode.queryWidgetNodeByUserId(str)) == null) {
            return null;
        }
        View nativeView = queryWidgetNodeByUserId.getNativeView();
        if (nativeView != null || (dXRuntimeContext = queryWidgetNodeByUserId.getDXRuntimeContext()) == null) {
            return nativeView;
        }
        return dXRuntimeContext.D();
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57bf07bc", new Object[0])).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (Math.abs(currentTimeMillis - f16690a) < b) {
            return true;
        }
        f16690a = currentTimeMillis;
        return false;
    }

    public static void c(View view, float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc574c5", new Object[]{view, new Float(f), new Integer(i)});
            return;
        }
        if (view.getBackground() == null) {
            view.setBackgroundColor(i);
        }
        view.setOutlineProvider(new a(f));
        view.setClipToOutline(true);
    }
}
