package androidx.databinding;

import android.view.View;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ViewStubProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ViewDataBinding mContainingBinding;
    private ViewStub.OnInflateListener mOnInflateListener;
    private ViewStub.OnInflateListener mProxyListener;
    private View mRoot;
    private ViewDataBinding mViewDataBinding;
    private ViewStub mViewStub;

    public ViewStubProxy(ViewStub viewStub) {
        ViewStub.OnInflateListener onInflateListener = new ViewStub.OnInflateListener() { // from class: androidx.databinding.ViewStubProxy.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.ViewStub.OnInflateListener
            public void onInflate(ViewStub viewStub2, View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7762d6fd", new Object[]{this, viewStub2, view});
                    return;
                }
                ViewStubProxy.access$002(ViewStubProxy.this, view);
                ViewStubProxy viewStubProxy = ViewStubProxy.this;
                ViewStubProxy.access$102(viewStubProxy, DataBindingUtil.bind(ViewStubProxy.access$200(viewStubProxy).mBindingComponent, view, viewStub2.getLayoutResource()));
                ViewStubProxy.access$302(ViewStubProxy.this, null);
                if (ViewStubProxy.access$400(ViewStubProxy.this) != null) {
                    ViewStubProxy.access$400(ViewStubProxy.this).onInflate(viewStub2, view);
                    ViewStubProxy.access$402(ViewStubProxy.this, null);
                }
                ViewStubProxy.access$200(ViewStubProxy.this).invalidateAll();
                ViewStubProxy.access$200(ViewStubProxy.this).forceExecuteBindings();
            }
        };
        this.mProxyListener = onInflateListener;
        this.mViewStub = viewStub;
        viewStub.setOnInflateListener(onInflateListener);
    }

    public static /* synthetic */ View access$002(ViewStubProxy viewStubProxy, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("4653426d", new Object[]{viewStubProxy, view});
        }
        viewStubProxy.mRoot = view;
        return view;
    }

    public static /* synthetic */ ViewDataBinding access$102(ViewStubProxy viewStubProxy, ViewDataBinding viewDataBinding) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewDataBinding) ipChange.ipc$dispatch("93d3b72e", new Object[]{viewStubProxy, viewDataBinding});
        }
        viewStubProxy.mViewDataBinding = viewDataBinding;
        return viewDataBinding;
    }

    public static /* synthetic */ ViewDataBinding access$200(ViewStubProxy viewStubProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewDataBinding) ipChange.ipc$dispatch("bc64c02", new Object[]{viewStubProxy});
        }
        return viewStubProxy.mContainingBinding;
    }

    public static /* synthetic */ ViewStub access$302(ViewStubProxy viewStubProxy, ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewStub) ipChange.ipc$dispatch("7980786e", new Object[]{viewStubProxy, viewStub});
        }
        viewStubProxy.mViewStub = viewStub;
        return viewStub;
    }

    public static /* synthetic */ ViewStub.OnInflateListener access$400(ViewStubProxy viewStubProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewStub.OnInflateListener) ipChange.ipc$dispatch("d84272c5", new Object[]{viewStubProxy});
        }
        return viewStubProxy.mOnInflateListener;
    }

    public static /* synthetic */ ViewStub.OnInflateListener access$402(ViewStubProxy viewStubProxy, ViewStub.OnInflateListener onInflateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewStub.OnInflateListener) ipChange.ipc$dispatch("653de01d", new Object[]{viewStubProxy, onInflateListener});
        }
        viewStubProxy.mOnInflateListener = onInflateListener;
        return onInflateListener;
    }

    public ViewDataBinding getBinding() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewDataBinding) ipChange.ipc$dispatch("f640b013", new Object[]{this});
        }
        return this.mViewDataBinding;
    }

    public View getRoot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("62a18061", new Object[]{this});
        }
        return this.mRoot;
    }

    public ViewStub getViewStub() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewStub) ipChange.ipc$dispatch("cbf42824", new Object[]{this});
        }
        return this.mViewStub;
    }

    public void setContainingBinding(ViewDataBinding viewDataBinding) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a53f60ef", new Object[]{this, viewDataBinding});
        } else {
            this.mContainingBinding = viewDataBinding;
        }
    }

    public void setOnInflateListener(ViewStub.OnInflateListener onInflateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a467d7eb", new Object[]{this, onInflateListener});
        } else if (this.mViewStub != null) {
            this.mOnInflateListener = onInflateListener;
        }
    }

    public boolean isInflated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd777f92", new Object[]{this})).booleanValue();
        }
        return this.mRoot != null;
    }
}
