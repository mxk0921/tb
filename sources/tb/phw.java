package tb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class phw<BEEN, ROOT_VIEW extends View, MODEL> extends khq<BEEN, ROOT_VIEW, MODEL> implements kae<BEEN, ROOT_VIEW> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mAttached;
    public final ViewGroup mContainer;
    private vfw mSetter;

    static {
        t2o.a(993002014);
        t2o.a(993002005);
    }

    public phw(Activity activity, ude udeVar, MODEL model, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, model);
        this.mContainer = viewGroup;
        this.mSetter = vfwVar;
    }

    public static /* synthetic */ Object ipc$super(phw phwVar, String str, Object... objArr) {
        if (str.hashCode() == 302831676) {
            super.destroyAndRemoveFromParent();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/widget/ViewWidget");
    }

    @Override // tb.kae
    public final void attachToContainer(vfw vfwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7cc0b76", new Object[]{this, vfwVar});
        } else if (isAttached()) {
            logError("error trying to attach a component which is already attached");
        } else {
            this.mSetter = vfwVar;
            attachToContainer();
        }
    }

    @Override // tb.abx, tb.nde
    public void destroyAndRemoveFromParent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("120cd83c", new Object[]{this});
            return;
        }
        removeFromContainer();
        super.destroyAndRemoveFromParent();
    }

    @Override // tb.khq
    public void findAllViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d31fad", new Object[]{this});
        }
    }

    public final ViewGroup getContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("c9c16903", new Object[]{this});
        }
        return this.mContainer;
    }

    public vfw getSetter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vfw) ipChange.ipc$dispatch("cea76f08", new Object[]{this});
        }
        return this.mSetter;
    }

    public final boolean isAttached() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f518279", new Object[]{this})).booleanValue();
        }
        return this.mAttached;
    }

    @Override // tb.khq
    public ROOT_VIEW obtainRootView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ROOT_VIEW) ((View) ipChange.ipc$dispatch("40b8ce75", new Object[]{this}));
        }
        return onCreateView();
    }

    public abstract ROOT_VIEW onCreateView();

    public void resetViewAndProperty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e4c241f", new Object[]{this});
        }
    }

    public final void setSetter(vfw vfwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b27e7e36", new Object[]{this, vfwVar});
        } else if (isAttached()) {
            logError("error change setter while attached");
        } else {
            this.mSetter = vfwVar;
        }
    }

    public final void removeFromContainer() {
        ROOT_VIEW root_view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8affe4da", new Object[]{this});
        } else if (isAttached() && (root_view = this.mView) != null) {
            vfw vfwVar = this.mSetter;
            if (vfwVar == null) {
                logError("remove from container while setter == null");
                return;
            }
            vfwVar.b(root_view);
            this.mAttached = false;
        }
    }

    public final void reuseView(vfw vfwVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579534a6", new Object[]{this, vfwVar, new Boolean(z)});
            return;
        }
        ROOT_VIEW view = getView();
        if (view == null) {
            this.mSetter = vfwVar;
            return;
        }
        if (this.mAttached) {
            vfw vfwVar2 = this.mSetter;
            if (vfwVar2 == null) {
                logError("reuse view while setter no exits,trying remove from parent");
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(view);
                }
            } else {
                vfwVar2.b(view);
            }
            this.mAttached = false;
        }
        if (z) {
            resetViewAndProperty();
        }
        this.mSetter = vfwVar;
    }

    @Override // tb.kae
    public final void attachToContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cab40c8", new Object[]{this});
            return;
        }
        ensureView();
        if (this.mSetter == null) {
            logWarn("trying attach with out setter");
        } else if (!isAttached()) {
            ROOT_VIEW root_view = this.mView;
            if (root_view == null) {
                logError("view not created after ensureView()");
                return;
            }
            this.mSetter.a(root_view);
            this.mAttached = true;
        }
    }
}
