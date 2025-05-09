package androidx.databinding.adapters;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ViewGroupBindingAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface OnAnimationEnd {
        void onAnimationEnd(Animation animation);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface OnAnimationRepeat {
        void onAnimationRepeat(Animation animation);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface OnAnimationStart {
        void onAnimationStart(Animation animation);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface OnChildViewAdded {
        void onChildViewAdded(View view, View view2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface OnChildViewRemoved {
        void onChildViewRemoved(View view, View view2);
    }

    public static void setAnimateLayoutChanges(ViewGroup viewGroup, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cb69bb4", new Object[]{viewGroup, new Boolean(z)});
        } else if (z) {
            viewGroup.setLayoutTransition(new LayoutTransition());
        } else {
            viewGroup.setLayoutTransition(null);
        }
    }

    public static void setListener(ViewGroup viewGroup, final OnChildViewAdded onChildViewAdded, final OnChildViewRemoved onChildViewRemoved) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c26e2d9c", new Object[]{viewGroup, onChildViewAdded, onChildViewRemoved});
        } else if (onChildViewAdded == null && onChildViewRemoved == null) {
            viewGroup.setOnHierarchyChangeListener(null);
        } else {
            viewGroup.setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: androidx.databinding.adapters.ViewGroupBindingAdapter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.ViewGroup.OnHierarchyChangeListener
                public void onChildViewAdded(View view, View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c61913e5", new Object[]{this, view, view2});
                        return;
                    }
                    OnChildViewAdded onChildViewAdded2 = OnChildViewAdded.this;
                    if (onChildViewAdded2 != null) {
                        onChildViewAdded2.onChildViewAdded(view, view2);
                    }
                }

                @Override // android.view.ViewGroup.OnHierarchyChangeListener
                public void onChildViewRemoved(View view, View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b61353c5", new Object[]{this, view, view2});
                        return;
                    }
                    OnChildViewRemoved onChildViewRemoved2 = onChildViewRemoved;
                    if (onChildViewRemoved2 != null) {
                        onChildViewRemoved2.onChildViewRemoved(view, view2);
                    }
                }
            });
        }
    }

    public static void setListener(ViewGroup viewGroup, final OnAnimationStart onAnimationStart, final OnAnimationEnd onAnimationEnd, final OnAnimationRepeat onAnimationRepeat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a59458d", new Object[]{viewGroup, onAnimationStart, onAnimationEnd, onAnimationRepeat});
        } else if (onAnimationStart == null && onAnimationEnd == null && onAnimationRepeat == null) {
            viewGroup.setLayoutAnimationListener(null);
        } else {
            viewGroup.setLayoutAnimationListener(new Animation.AnimationListener() { // from class: androidx.databinding.adapters.ViewGroupBindingAdapter.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                        return;
                    }
                    OnAnimationEnd onAnimationEnd2 = onAnimationEnd;
                    if (onAnimationEnd2 != null) {
                        onAnimationEnd2.onAnimationEnd(animation);
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                        return;
                    }
                    OnAnimationRepeat onAnimationRepeat2 = onAnimationRepeat;
                    if (onAnimationRepeat2 != null) {
                        onAnimationRepeat2.onAnimationRepeat(animation);
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                        return;
                    }
                    OnAnimationStart onAnimationStart2 = OnAnimationStart.this;
                    if (onAnimationStart2 != null) {
                        onAnimationStart2.onAnimationStart(animation);
                    }
                }
            });
        }
    }
}
