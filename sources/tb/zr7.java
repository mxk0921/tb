package tb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.c;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.view.FlatViewGroup;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class zr7 extends c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(503316704);
    }

    public static /* synthetic */ Object ipc$super(zr7 zr7Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -703216504) {
            super.applyAttrForView((View) objArr[0], (jfw) objArr[1], (Map) objArr[2], ((Boolean) objArr[3]).booleanValue());
            return null;
        } else if (hashCode == 98971100) {
            return new Boolean(super.canbeDrawable());
        } else {
            if (hashCode == 1052797818) {
                super.detach(((Boolean) objArr[0]).booleanValue());
                return null;
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/flexbox/layoutmanager/component/DivComponent");
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void addOrUpdateDrawable(boolean z, Drawable[] drawableArr, rbi rbiVar, n nVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8161a058", new Object[]{this, new Boolean(z), drawableArr, rbiVar, nVar, new Boolean(z2)});
            return;
        }
        FlatViewGroup flatViewGroup = (FlatViewGroup) this.view;
        if (z) {
            flatViewGroup.addDrawable(drawableArr, rbiVar.c, rbiVar.d, rbiVar.f27261a, rbiVar.b, nVar);
        } else {
            flatViewGroup.updateNewPositionForDrawable(drawableArr, rbiVar.c, rbiVar.d, rbiVar.f27261a, rbiVar.b, z2);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void addOrUpdateView(boolean z, View view, rbi rbiVar, n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f569c", new Object[]{this, new Boolean(z), view, rbiVar, nVar});
            return;
        }
        FlatViewGroup flatViewGroup = (FlatViewGroup) this.view;
        if (z) {
            flatViewGroup.addView(view, rbiVar.c, rbiVar.d, rbiVar.f27261a, rbiVar.b, nVar);
        } else {
            flatViewGroup.updateNewPositionForView(view, rbiVar.c, rbiVar.d, rbiVar.f27261a, rbiVar.b);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void applyAttrForView(View view, jfw jfwVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d615c488", new Object[]{this, view, jfwVar, map, new Boolean(z)});
            return;
        }
        super.applyAttrForView(view, jfwVar, map, z);
        if (view instanceof FlatViewGroup) {
            ((FlatViewGroup) view).setHighLightArea(this.viewParams.j0);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.c
    public boolean canbeDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e62ddc", new Object[]{this})).booleanValue();
        }
        if (!super.canbeDrawable() || this.node.Y() == null || !(this.node.Y().K() instanceof zr7) || this.viewParams.J != 0) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.c, com.taobao.tao.flexbox.layoutmanager.core.Component
    public void detach(boolean z) {
        V v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec06b7a", new Object[]{this, new Boolean(z)});
            return;
        }
        if (needRecycled() && (v = this.view) != 0 && (v instanceof FlatViewGroup)) {
            ut2.w((FlatViewGroup) v);
        }
        super.detach(z);
    }

    public boolean needRecycled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98f38ff2", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.c
    public Drawable onCreateDrawable(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("2ede1a72", new Object[]{this, context});
        }
        return null;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        FlatViewGroup c = ut2.c(context);
        c.bindComponent(this);
        return c;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void removeDrawable(Drawable[] drawableArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("398d4010", new Object[]{this, drawableArr});
            return;
        }
        V v = this.view;
        if (v != 0) {
            ((FlatViewGroup) v).removeDrawable(drawableArr);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void sortChildren() {
        Component.j hostViewComponent;
        Component component;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72a97c4", new Object[]{this});
            return;
        }
        KeyEvent.Callback callback = this.view;
        if (!(callback != null || (hostViewComponent = getHostViewComponent()) == null || (component = hostViewComponent.f12191a) == null)) {
            callback = component.getView();
        }
        if (callback != null && (callback instanceof FlatViewGroup)) {
            ((FlatViewGroup) callback).sortChildren(this.node);
        }
    }
}
