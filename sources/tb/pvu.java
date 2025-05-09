package tb;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.MUSNodeHost;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.cache.AccessibilityView;
import com.taobao.android.weex_uikit.ui.cache.UIRenderView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class pvu implements bjd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean h = false;

    /* renamed from: a  reason: collision with root package name */
    public AccessibilityView f26346a;
    public final UINode b;
    public final fjd c;
    public MUSNodeHost e;
    public CharSequence f;
    public final Rect d = new Rect();
    public boolean g = false;

    static {
        t2o.a(986710102);
        t2o.a(986710041);
    }

    public pvu(UINode uINode) {
        this.b = uINode;
        if (isEnabled()) {
            this.c = new UIRenderView(vvh.c(), uINode);
        }
    }

    @Override // tb.bjd
    public void a(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74fb3a8a", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (!(!isEnabled() || this.c == null || (this.d.width() == i5 && this.d.height() == i6))) {
            ((View) this.c).layout(0, 0, i5, i6);
        }
        AccessibilityView accessibilityView = this.f26346a;
        if (accessibilityView != null) {
            accessibilityView.layout(i, i2, i3, i4);
        }
        f(i, i2, i3, i4);
    }

    @Override // tb.bjd
    public void attach() {
        fjd fjdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ad9c84c", new Object[]{this});
            return;
        }
        MUSNodeHost mUSNodeHost = this.e;
        if (mUSNodeHost != null && mUSNodeHost.isAccessibilityEnabled()) {
            this.g = this.b.isAccessibilityBlocked();
            AccessibilityView.addToParent(this.e, this.f26346a);
            AccessibilityView accessibilityView = this.f26346a;
            if (accessibilityView != null) {
                accessibilityView.setNode(this.b);
                this.f26346a.attach();
            }
        }
        if (isEnabled() && (fjdVar = this.c) != null && fjdVar.getView() != null) {
            MUSNodeHost mUSNodeHost2 = this.e;
            if (mUSNodeHost2 != null) {
                UIRenderView.attachToParent(mUSNodeHost2, this.c.getView());
            }
            fjd fjdVar2 = this.c;
            if (fjdVar2 != null) {
                fjdVar2.attach();
            }
        }
    }

    @Override // tb.bjd
    public void b(Canvas canvas, MUSNodeHost mUSNodeHost, int i, int i2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a19038e9", new Object[]{this, canvas, mUSNodeHost, new Integer(i), new Integer(i2), new Float(f)});
            return;
        }
        if (mUSNodeHost.isAccessibilityEnabled() && this.f26346a == null) {
            e();
            this.g = this.b.isAccessibilityBlocked();
            AccessibilityView accessibilityView = new AccessibilityView(mUSNodeHost.getContext());
            this.f26346a = accessibilityView;
            accessibilityView.setNode(this.b);
            AccessibilityView accessibilityView2 = this.f26346a;
            Rect rect = this.d;
            accessibilityView2.layout(rect.left, rect.top, rect.right, rect.bottom);
            AccessibilityView.addToParent(mUSNodeHost, this.f26346a);
            this.f26346a.attach();
            setContentDescription(this.f);
        }
        fjd fjdVar = this.c;
        if (fjdVar != null) {
            fjdVar.getView().setAlpha(this.b.getOpacity() * f);
            mUSNodeHost.drawChild(this.c.getView(), canvas);
        }
    }

    @Override // tb.bjd
    public void c(boolean z) {
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("861893fe", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            z2 = this.b.isAccessibilityBlocked();
        }
        if (this.g != z2) {
            this.g = z2;
            setContentDescription(this.b.getAriaLabel());
        }
    }

    @Override // tb.bjd
    public void d(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3791a61f", new Object[]{this, view});
        } else if (view != null) {
            MUSNodeHost mUSNodeHost = (MUSNodeHost) view;
            this.e = mUSNodeHost;
            if (mUSNodeHost.isAccessibilityEnabled()) {
                this.f26346a = new AccessibilityView(view.getContext());
            }
            fjd fjdVar = this.c;
            if (fjdVar != null) {
                fjdVar.setTarget(mUSNodeHost);
                this.c.attach();
            }
        }
    }

    @Override // tb.bjd
    public void detach() {
        fjd fjdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7b39a9a", new Object[]{this});
            return;
        }
        MUSNodeHost mUSNodeHost = this.e;
        this.d.setEmpty();
        MUSNodeHost mUSNodeHost2 = this.e;
        if (mUSNodeHost2 != null) {
            AccessibilityView.removeFromParent(mUSNodeHost2, this.f26346a);
            this.f26346a = null;
        }
        this.e = null;
        if (isEnabled() && (fjdVar = this.c) != null && fjdVar.getView() != null) {
            UIRenderView.removeFromParent(mUSNodeHost, this.c.getView());
        }
    }

    @Override // tb.bjd
    public void e() {
        fjd fjdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60a4a042", new Object[]{this});
            return;
        }
        AccessibilityView accessibilityView = this.f26346a;
        if (accessibilityView != null) {
            accessibilityView.invalidate();
        }
        if (isEnabled() && (fjdVar = this.c) != null) {
            ((View) fjdVar).invalidate();
        }
    }

    public final void f(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("907ef765", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            this.d.set(i, i2, i3, i4);
        }
    }

    @Override // tb.bjd
    public boolean isEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56f023c2", new Object[]{this})).booleanValue();
        }
        if (uvh.l() || !h) {
            return uvh.l();
        }
        return UIRenderView.isAttachInfoEnabled();
    }

    @Override // tb.bjd
    public void setContentDescription(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e19e070", new Object[]{this, charSequence});
            return;
        }
        if (this.g) {
            charSequence = null;
        }
        this.f = charSequence;
        AccessibilityView accessibilityView = this.f26346a;
        if (accessibilityView != null) {
            accessibilityView.setContentDescription(charSequence);
            if (charSequence == null) {
                this.f26346a.setImportantForAccessibility(2);
            } else {
                this.f26346a.setImportantForAccessibility(1);
            }
        }
    }

    @Override // tb.bjd
    public void updateBorderRadius() {
        fjd fjdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2772c4e", new Object[]{this});
        } else if (isEnabled() && (fjdVar = this.c) != null) {
            fjdVar.updateBorderRadius();
        }
    }
}
