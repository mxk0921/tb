package androidx.databinding;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DataBindingUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static DataBinderMapper sMapper = new DataBinderMapperImpl();
    private static DataBindingComponent sDefaultComponent = null;

    private DataBindingUtil() {
    }

    public static <T extends ViewDataBinding> T bind(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ((ViewDataBinding) ipChange.ipc$dispatch("243cca5b", new Object[]{view})) : (T) bind(view, sDefaultComponent);
    }

    private static <T extends ViewDataBinding> T bindToAddedViews(DataBindingComponent dataBindingComponent, ViewGroup viewGroup, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((ViewDataBinding) ipChange.ipc$dispatch("b16ed812", new Object[]{dataBindingComponent, viewGroup, new Integer(i), new Integer(i2)}));
        }
        int childCount = viewGroup.getChildCount();
        int i3 = childCount - i;
        if (i3 == 1) {
            return (T) bind(dataBindingComponent, viewGroup.getChildAt(childCount - 1), i2);
        }
        View[] viewArr = new View[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            viewArr[i4] = viewGroup.getChildAt(i4 + i);
        }
        return (T) bind(dataBindingComponent, viewArr, i2);
    }

    public static String convertBrIdToString(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1e8f47ae", new Object[]{new Integer(i)});
        }
        return sMapper.convertBrIdToString(i);
    }

    public static <T extends ViewDataBinding> T getBinding(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((ViewDataBinding) ipChange.ipc$dispatch("e750d96d", new Object[]{view}));
        }
        return (T) ViewDataBinding.getBinding(view);
    }

    public static DataBindingComponent getDefaultComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DataBindingComponent) ipChange.ipc$dispatch("c57e046e", new Object[0]);
        }
        return sDefaultComponent;
    }

    public static <T extends ViewDataBinding> T inflate(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ((ViewDataBinding) ipChange.ipc$dispatch("a51c43c3", new Object[]{layoutInflater, new Integer(i), viewGroup, new Boolean(z)})) : (T) inflate(layoutInflater, i, viewGroup, z, sDefaultComponent);
    }

    public static <T extends ViewDataBinding> T setContentView(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ((ViewDataBinding) ipChange.ipc$dispatch("3e580f5b", new Object[]{activity, new Integer(i)})) : (T) setContentView(activity, i, sDefaultComponent);
    }

    public static void setDefaultComponent(DataBindingComponent dataBindingComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baef64e0", new Object[]{dataBindingComponent});
        } else {
            sDefaultComponent = dataBindingComponent;
        }
    }

    public static <T extends ViewDataBinding> T bind(View view, DataBindingComponent dataBindingComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((ViewDataBinding) ipChange.ipc$dispatch("99212512", new Object[]{view, dataBindingComponent}));
        }
        T t = (T) getBinding(view);
        if (t != null) {
            return t;
        }
        Object tag = view.getTag();
        if (tag instanceof String) {
            int layoutId = sMapper.getLayoutId((String) tag);
            if (layoutId != 0) {
                return (T) sMapper.getDataBinder(dataBindingComponent, view, layoutId);
            }
            throw new IllegalArgumentException("View is not a binding layout. Tag: " + tag);
        }
        throw new IllegalArgumentException("View is not a binding layout");
    }

    public static <T extends ViewDataBinding> T findBinding(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((ViewDataBinding) ipChange.ipc$dispatch("91794c2a", new Object[]{view}));
        }
        while (view != null) {
            T t = (T) ViewDataBinding.getBinding(view);
            if (t != null) {
                return t;
            }
            Object tag = view.getTag();
            if (tag instanceof String) {
                String str = (String) tag;
                if (str.startsWith("layout") && str.endsWith("_0")) {
                    char charAt = str.charAt(6);
                    int indexOf = str.indexOf(47, 7);
                    if (charAt == '/') {
                        if (indexOf == -1) {
                            return null;
                        }
                    } else if (charAt == '-' && indexOf != -1 && str.indexOf(47, indexOf + 1) == -1) {
                        return null;
                    }
                }
            }
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public static <T extends ViewDataBinding> T inflate(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z, DataBindingComponent dataBindingComponent) {
        boolean z2 = true;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((ViewDataBinding) ipChange.ipc$dispatch("d0badaaa", new Object[]{layoutInflater, new Integer(i), viewGroup, new Boolean(z), dataBindingComponent}));
        }
        if (viewGroup == null || !z) {
            z2 = false;
        }
        if (z2) {
            i2 = viewGroup.getChildCount();
        }
        View inflate = layoutInflater.inflate(i, viewGroup, z);
        if (z2) {
            return (T) bindToAddedViews(dataBindingComponent, viewGroup, i2, i);
        }
        return (T) bind(dataBindingComponent, inflate, i);
    }

    public static <T extends ViewDataBinding> T setContentView(Activity activity, int i, DataBindingComponent dataBindingComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((ViewDataBinding) ipChange.ipc$dispatch("148cc012", new Object[]{activity, new Integer(i), dataBindingComponent}));
        }
        activity.setContentView(i);
        return (T) bindToAddedViews(dataBindingComponent, (ViewGroup) activity.getWindow().getDecorView().findViewById(16908290), 0, i);
    }

    public static <T extends ViewDataBinding> T bind(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ((ViewDataBinding) ipChange.ipc$dispatch("a7a036a4", new Object[]{dataBindingComponent, viewArr, new Integer(i)})) : (T) sMapper.getDataBinder(dataBindingComponent, viewArr, i);
    }

    public static <T extends ViewDataBinding> T bind(DataBindingComponent dataBindingComponent, View view, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ((ViewDataBinding) ipChange.ipc$dispatch("2bf82bf7", new Object[]{dataBindingComponent, view, new Integer(i)})) : (T) sMapper.getDataBinder(dataBindingComponent, view, i);
    }
}
