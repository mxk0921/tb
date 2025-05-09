package com.taobao.tao.flexbox.layoutmanager.core;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent;
import com.taobao.tao.flexbox.layoutmanager.component.ScrollViewComponent;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import java.util.List;
import java.util.Map;
import tb.igs;
import tb.jfw;
import tb.mx7;
import tb.ol4;
import tb.piw;
import tb.sxo;
import tb.t2o;
import tb.ut2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class c<V extends View, P extends jfw, D extends Drawable> extends Component<V, P> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean canbeDrawableChecked;
    public Drawable[] drawable;
    private boolean isDrawable;
    private boolean needInvalidate = true;
    private Drawable prepareDrawable;

    static {
        t2o.a(503317025);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1926757943:
                super.onLayoutComplete();
                return null;
            case -1791440821:
                return new Boolean(super.setComponentAlpha(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).floatValue(), (List) objArr[2]));
            case -1227079444:
                super.onRender((Context) objArr[0]);
                return null;
            case -327639634:
                return new Boolean(super.onUpdateAttribute((b) objArr[0], (String) objArr[1], objArr[2], (n.f) objArr[3]));
            case 471741631:
                super.attachComponent();
                return null;
            case 1052797818:
                super.detach(((Boolean) objArr[0]).booleanValue());
                return null;
            case 1123088784:
                return new Boolean(super.onPrepareComponent((Context) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/core/Component2");
        }
    }

    private boolean isScrollViewDescendant() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df5f8a04", new Object[]{this})).booleanValue();
        }
        n Y = this.node.Y();
        if (Y == null || Y.Y() == null || !(Y.Y().K() instanceof ScrollViewComponent)) {
            return false;
        }
        return true;
    }

    public void applyAttrForDrawable(D d, P p, Map map, boolean z) {
        boolean z2;
        boolean z3 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a695233f", new Object[]{this, d, p, map, new Boolean(z)});
            return;
        }
        igs.a("applyAttrForDrawable");
        if (z || this.node.C0()) {
            Drawable[] drawableArr = this.drawable;
            drawableArr[0] = mx7.d(drawableArr[0], p);
            Drawable[] drawableArr2 = this.drawable;
            drawableArr2[2] = mx7.f(drawableArr2[2], p);
            b.f12204a.d(this, this.drawable, p, this.node.r);
            b.h.d(this, this.drawable, p, this.node.r);
            b.j.d(this, this.drawable, p, this.node.r);
        } else {
            Drawable[] drawableArr3 = this.drawable;
            Drawable drawable = drawableArr3[0];
            Drawable drawable2 = drawableArr3[2];
            drawableArr3[0] = mx7.d(drawable, p);
            Drawable[] drawableArr4 = this.drawable;
            drawableArr4[2] = mx7.f(drawableArr4[2], p);
            b.f12204a.d(this, this.drawable, p, this.node.r);
            handleUpdateAttributes(map);
            boolean z4 = this.needInvalidate;
            Drawable[] drawableArr5 = this.drawable;
            if (drawable != drawableArr5[0]) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z5 = z4 | z2;
            this.needInvalidate = z5;
            if (drawable2 == drawableArr5[2]) {
                z3 = false;
            }
            this.needInvalidate = z5 | z3;
        }
        igs.c();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void attachComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c1e34bf", new Object[]{this});
        } else if (this.isDrawable) {
            updateDrawable(this.needInvalidate);
            this.attached = true;
        } else {
            super.attachComponent();
        }
    }

    public boolean canbeDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e62ddc", new Object[]{this})).booleanValue();
        }
        n Y = this.node.Y();
        if (Y == null || checkViewAttrs()) {
            return false;
        }
        P p = this.viewParams;
        if (p.I == null && p.T == 1.0f && p.Y == null && p.a0 && !p.Z && !p.e0 && p.f0 == 0 && p.j0 == null && p.k0 == 0.0f && p.l0 == 0.0f && p.m0 == 0.0f && p.n0 == 0.0f && p.o0 == 0.0f && p.p0 == 1.0f && p.q0 == 1.0f && p.r0 == null && p.s0 == null && TextUtils.isEmpty(p.c0) && TextUtils.isEmpty(this.viewParams.d0) && Y.K() != null && !(Y.K() instanceof ol4) && !(Y.K() instanceof sxo) && !(Y.K() instanceof piw) && !isScrollViewDescendant() && !(Y.K() instanceof PopLayerComponent)) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void detach(boolean z) {
        Component component;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec06b7a", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.isDrawable && this.drawable != null) {
            Component.j hostViewComponent = getHostViewComponent();
            if (!(hostViewComponent == null || (component = hostViewComponent.f12191a) == null)) {
                component.removeDrawable(this.drawable);
            }
            for (Drawable drawable : this.drawable) {
                ut2.v(drawable);
            }
            this.drawable = null;
        }
        super.detach(z);
    }

    public Drawable[] getDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable[]) ipChange.ipc$dispatch("9e9a6244", new Object[]{this});
        }
        return this.drawable;
    }

    public boolean isDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7e37873", new Object[]{this})).booleanValue();
        }
        return this.isDrawable;
    }

    public abstract D onCreateDrawable(Context context);

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onLayoutComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d2801c9", new Object[]{this});
            return;
        }
        super.onLayoutComplete();
        if (!this.canbeDrawableChecked) {
            Boolean bool = getNode().u0().i.o;
            if (bool != null) {
                this.isDrawable = bool.booleanValue();
            } else {
                this.isDrawable = canbeDrawable();
                getNode().u0().i.o = Boolean.valueOf(this.isDrawable);
            }
            this.canbeDrawableChecked = true;
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public boolean onPrepareComponent(Context context) {
        Drawable drawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42f0f990", new Object[]{this, context})).booleanValue();
        }
        if (!this.isDrawable) {
            return super.onPrepareComponent(context);
        }
        if (this.drawable != null || (drawable = this.prepareDrawable) != null) {
            return false;
        }
        if (drawable == null) {
            this.prepareDrawable = onCreateDrawable(context);
        }
        if (this.prepareDrawable != null) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onRender(Context context) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6dc40ec", new Object[]{this, context});
        } else if (this.isDrawable) {
            if (this.drawable == null) {
                this.drawable = new Drawable[3];
                igs.a("onCreateDrawable");
                Drawable drawable = this.prepareDrawable;
                if (drawable != null) {
                    this.drawable[1] = drawable;
                    this.prepareDrawable = null;
                } else {
                    this.drawable[1] = onCreateDrawable(context);
                }
                igs.c();
            }
            Component.j jVar = this.currentHostViewComponentInfo;
            Component.j hostViewComponent = getHostViewComponent();
            if (hostViewComponent == null || jVar == null || !hostViewComponent.b.equals(jVar.b)) {
                z = true;
            } else {
                z = false;
            }
            this.currentHostViewComponentInfo = hostViewComponent;
            if (z || needApplyAttrForComponent()) {
                applyAttrForDrawable(this.drawable[1], this.viewParams, this.node.s0(), this.initRender);
            }
            this.initRender = false;
            if (!this.attached) {
                onAttach();
                onAttachComplete();
            } else if (z) {
                onUpdateLayout();
            }
            this.needInvalidate = false;
        } else {
            super.onRender(context);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public boolean onUpdateAttribute(b bVar, String str, Object obj, n.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec789dae", new Object[]{this, bVar, str, obj, fVar})).booleanValue();
        }
        Drawable[] drawableArr = this.drawable;
        if (drawableArr == null) {
            return super.onUpdateAttribute(bVar, str, obj, fVar);
        }
        if (bVar == null) {
            return false;
        }
        bVar.d(this, drawableArr, this.viewParams, this.node.r);
        return true;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public boolean setComponentAlpha(boolean z, float f, List<n> list) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9538c84b", new Object[]{this, new Boolean(z), new Float(f), list})).booleanValue();
        }
        boolean componentAlpha = super.setComponentAlpha(z, f, list);
        Drawable[] drawableArr = this.drawable;
        if (drawableArr != null && componentAlpha) {
            for (Drawable drawable : drawableArr) {
                if (drawable != null) {
                    if (z) {
                        i = (int) (255.0f * f);
                    } else {
                        i = (int) (this.viewParams.T * f * 255.0f);
                    }
                    drawable.setAlpha(i);
                }
            }
        }
        return componentAlpha;
    }

    public void updateDrawable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("802a3706", new Object[]{this, new Boolean(z)});
            return;
        }
        Component.j jVar = this.currentHostViewComponentInfo;
        if (jVar == null) {
            jVar = getHostViewComponent();
        }
        if (jVar != null && jVar.f12191a != null) {
            igs.a("addOrUpdateDrawable");
            jVar.f12191a.addOrUpdateDrawable(!this.attached, this.drawable, jVar.b, this.node, z);
            igs.c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean checkViewAttrs() {
        /*
            r5 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.tao.flexbox.layoutmanager.core.c.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001a
            java.lang.String r3 = "fc738ee0"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r5
            java.lang.Object r0 = r2.ipc$dispatch(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x001a:
            com.taobao.tao.flexbox.layoutmanager.core.n r2 = r5.node
            java.util.HashMap r2 = r2.I()
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0028:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0061
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "on"
            boolean r4 = r3.startsWith(r4)
            if (r4 != 0) goto L_0x0060
            java.lang.String r4 = "id"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x0060
            java.lang.String r4 = "trackinfo"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x0060
            java.lang.String r4 = "accessibility-text"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x0060
            java.lang.String r4 = "tab-scrollable"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0028
        L_0x0060:
            return r1
        L_0x0061:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.core.c.checkViewAttrs():boolean");
    }
}
