package tb;

import android.app.Activity;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class khq<BEEN, ROOT_VIEW extends View, MODEL> extends abx implements fsd<BEEN, ROOT_VIEW> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public MODEL mModel;
    public ROOT_VIEW mView;

    static {
        t2o.a(993002011);
        t2o.a(993002003);
    }

    public khq(Activity activity, ude udeVar, MODEL model) {
        super(activity, udeVar);
        this.mModel = model;
    }

    public static /* synthetic */ Object ipc$super(khq khqVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/widget/StandardWidget");
    }

    public /* bridge */ /* synthetic */ acx B() {
        return (acx) getModel();
    }

    public void bindWithData(BEEN been) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2491dd0", new Object[]{this, been});
        }
    }

    @Override // tb.fsd
    public final void ensureView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ace3c70a", new Object[]{this});
        } else if (this.mView == null) {
            this.mView = obtainRootView();
            findAllViews();
        }
    }

    public abstract void findAllViews();

    @Override // tb.abx
    public View findView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("86c73ae0", new Object[]{this, new Integer(i)});
        }
        ROOT_VIEW root_view = this.mView;
        if (root_view == null) {
            return null;
        }
        return root_view.findViewById(i);
    }

    public MODEL getModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MODEL) ipChange.ipc$dispatch("b4c825f8", new Object[]{this});
        }
        return this.mModel;
    }

    public final boolean isViewCreated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("31498504", new Object[]{this})).booleanValue();
        }
        if (this.mView != null) {
            return true;
        }
        return false;
    }

    public abstract ROOT_VIEW obtainRootView();

    @Override // tb.fsd
    public final ROOT_VIEW getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ROOT_VIEW) ((View) ipChange.ipc$dispatch("576a35e4", new Object[]{this})) : this.mView;
    }
}
