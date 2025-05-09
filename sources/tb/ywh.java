package tb;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.ui.INode;
import com.taobao.android.weex_uikit.ui.MUSNodeHost;
import com.taobao.android.weex_uikit.ui.MUSView;
import com.taobao.android.weex_uikit.ui.UINode;
import java.util.LinkedList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ywh implements ppc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG = ywh.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public UINode f32391a;
    public MUSView b;
    public xuu e;
    public boolean f;
    public boolean h;
    public boolean i;
    public final Rect c = new Rect();
    public boolean d = true;
    public boolean g = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ MUSDKInstance d;

        public a(MUSDKInstance mUSDKInstance) {
            this.d = mUSDKInstance;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/ui/MUSRenderManager$1");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            this.d.setRootHeight(ywh.this.o());
            this.d.setRootWidth(ywh.this.r());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ List d;

        public b(List list) {
            this.d = list;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/ui/MUSRenderManager$2");
        }

        @Override // tb.yio
        public void e() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            for (Runnable runnable : this.d) {
                runnable.run();
            }
        }
    }

    static {
        t2o.a(986710050);
        t2o.a(982516221);
    }

    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84ca6032", new Object[]{this});
        } else {
            this.d = true;
        }
    }

    public void B(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b1ba52", new Object[]{this, viewGroup});
        } else if (viewGroup == null || (viewGroup instanceof MUSView)) {
            if (this.b != viewGroup) {
                this.d = true;
                this.h = false;
                this.i = false;
            }
            this.b = (MUSView) viewGroup;
        } else {
            dwh.f(TAG, "MUSUIView is not MUSView!");
        }
    }

    public void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("830a6085", new Object[]{this});
        } else if (this.f32391a != null && this.e.j()) {
            this.f32391a.updateLayoutState(this.e, 0, 0);
            this.e.o();
            this.e.n();
        }
    }

    @Override // tb.ppc
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("509f6a21", new Object[]{this, context});
            return;
        }
        UINode uINode = this.f32391a;
        if (uINode != null) {
            uINode.preallocate(context);
        }
    }

    @Override // tb.ppc
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e029f6a3", new Object[]{this});
            return;
        }
        UINode uINode = this.f32391a;
        if (uINode != null) {
            uINode.activityResume();
        }
    }

    @Override // tb.ppc
    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("909129e9", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    @Override // tb.ppc
    public void e(INode iNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faf382d0", new Object[]{this, iNode});
        } else if (!(iNode instanceof UINode)) {
            dwh.f(TAG, "node is not UINode!");
        } else {
            UINode uINode = (UINode) iNode;
            this.f32391a = uINode;
            uINode.setRootNode();
            this.f32391a.setAttachedTree(this);
            xuu xuuVar = new xuu();
            this.e = xuuVar;
            xuuVar.m(this);
        }
    }

    @Override // tb.ppc
    public void f(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2fb1721", new Object[]{this, mUSDKInstance});
        } else if (mUSDKInstance != null && (mUSDKInstance.getRenderRoot() instanceof MUSView)) {
            MUSView mUSView = (MUSView) mUSDKInstance.getRenderRoot();
            this.b = mUSView;
            mUSView.setUiNodeTree(this);
        }
    }

    @Override // tb.ppc
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d692ed2e", new Object[]{this});
            return;
        }
        UINode uINode = this.f32391a;
        if (uINode != null) {
            uINode.activityPause();
        }
    }

    @Override // tb.ppc
    public void h(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f40648bd", new Object[]{this, mUSDKInstance});
        }
    }

    @Override // tb.ppc
    public void i(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baecf14b", new Object[]{this, mUSDKInstance});
            return;
        }
        LinkedList linkedList = new LinkedList();
        k(linkedList);
        linkedList.add(new a(mUSDKInstance));
        mUSDKInstance.enqueueTask(new b(linkedList));
    }

    @Override // tb.ppc
    public void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9415c80d", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public void k(List<Runnable> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9f091b6", new Object[]{this, list});
            return;
        }
        UINode uINode = this.f32391a;
        if (uINode != null) {
            uINode.collectBatchTasks(list);
        }
    }

    public void l(ViewGroup viewGroup, Canvas canvas, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8e686f9", new Object[]{this, viewGroup, canvas, new Integer(i), new Integer(i2), new Boolean(z)});
            return;
        }
        UINode uINode = this.f32391a;
        if (uINode != null && (viewGroup instanceof MUSNodeHost)) {
            uINode.draw((MUSNodeHost) viewGroup, canvas, i, i2, z, 1.0f);
        }
    }

    /* renamed from: m */
    public UINode b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINode) ipChange.ipc$dispatch("8513f867", new Object[]{this, new Integer(i)});
        }
        return this.f32391a.findNodeById(i);
    }

    public MUSView n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSView) ipChange.ipc$dispatch("188dab12", new Object[]{this});
        }
        return this.b;
    }

    public int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        UINode uINode = this.f32391a;
        if (uINode != null) {
            return uINode.getLayoutHeight();
        }
        return 0;
    }

    public xuu p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xuu) ipChange.ipc$dispatch("9c4d181d", new Object[]{this});
        }
        return this.e;
    }

    public UINode q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINode) ipChange.ipc$dispatch("302bbb9", new Object[]{this});
        }
        return this.f32391a;
    }

    public int r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        UINode uINode = this.f32391a;
        if (uINode != null) {
            return uINode.getLayoutWidth();
        }
        return 0;
    }

    public void s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e811e8f", new Object[]{this, new Boolean(z)});
            return;
        }
        MUSView mUSView = this.b;
        if (mUSView != null) {
            if (mUSView.getLocalVisibleRect(this.c)) {
                if (!this.d || !(this.b.getParent() instanceof HorizontalScrollView)) {
                    this.i = true;
                    x(this.c, z, z);
                    return;
                }
                this.b.requestLayout();
                this.d = false;
            } else if (this.h && z) {
                this.h = false;
                this.b.release(false);
            } else if (this.i && !z) {
                this.i = false;
                this.c.setEmpty();
                x(this.c, false, false);
            }
        }
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ba451e3", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc6eaa9b", new Object[]{this})).booleanValue();
        }
        UINode uINode = this.f32391a;
        if (uINode == null || !uINode.isMeasured()) {
            return false;
        }
        return true;
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8744b17", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("144adab5", new Object[]{this})).booleanValue();
        }
        if (this.b == null) {
            return false;
        }
        return y();
    }

    public void x(Rect rect, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45c4e9ce", new Object[]{this, rect, new Boolean(z), new Boolean(z2)});
            return;
        }
        xuu xuuVar = this.e;
        if (xuuVar == null) {
            dwh.v("Main Thread Layout state is not found");
        } else if (this.b.getMountState().d() || !this.h || rect == null || !rect.equals(this.b.getPreviousMountVisibleRectBounds())) {
            if (!this.h) {
                this.h = true;
            }
            this.b.getMountState().n();
            this.b.mount(xuuVar, rect, z, z2);
        }
    }

    public final boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae19fdc1", new Object[]{this})).booleanValue();
        }
        if (!this.b.isMountStateDirty()) {
            return false;
        }
        if (this.f) {
            s(true);
        } else {
            if (this.g && !this.b.getLocalVisibleRect(this.c)) {
                this.c.setEmpty();
            }
            x(this.c, true, false);
        }
        return true;
    }

    public boolean z(MotionEvent motionEvent, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c03524e0", new Object[]{this, motionEvent, view})).booleanValue();
        }
        UINode uINode = this.f32391a;
        if (uINode == null || !uINode.dispatchTouchEvent(motionEvent, view)) {
            return false;
        }
        return true;
    }
}
