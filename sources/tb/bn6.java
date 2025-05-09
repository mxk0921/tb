package tb;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class bn6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG_DXROOT_VIEW = "DXRootView";

    static {
        t2o.a(157286728);
    }

    public static View a(View view, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("4a127073", new Object[]{view, dXTemplateItem});
        }
        return view;
    }

    public static DXRootView b(View view) {
        DXRootView dXRootView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("f073f160", new Object[]{view});
        }
        if (view instanceof DXRootView) {
            dXRootView = (DXRootView) view;
        } else {
            dXRootView = (DXRootView) view.findViewWithTag(TAG_DXROOT_VIEW);
        }
        if (dXRootView != null || !(view instanceof ViewGroup)) {
            return dXRootView;
        }
        return d((ViewGroup) view);
    }

    public static boolean c(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28eaf495", new Object[]{dXTemplateItem})).booleanValue();
        }
        if (dXTemplateItem == null) {
            return false;
        }
        if (dXTemplateItem.c() == 30000) {
            return true;
        }
        if (dXTemplateItem.c() == 20000) {
            return false;
        }
        if (!TextUtils.isEmpty(dXTemplateItem.c) && dXTemplateItem.c.endsWith(".zip")) {
            return true;
        }
        if (!TextUtils.isEmpty(dXTemplateItem.c) || dXTemplateItem.b < 0) {
            return false;
        }
        return true;
    }

    public static DXRootView d(ViewGroup viewGroup) {
        DXRootView dXRootView;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("eb2f59ab", new Object[]{viewGroup});
        }
        int childCount = viewGroup.getChildCount();
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (i >= childCount) {
                dXRootView = null;
                break;
            }
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof DXRootView) {
                dXRootView = (DXRootView) childAt;
                break;
            }
            if (childAt instanceof ViewGroup) {
                arrayList.add((ViewGroup) childAt);
            }
            i++;
        }
        if (dXRootView == null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext() && (dXRootView = d((ViewGroup) it.next())) == null) {
            }
        }
        return dXRootView;
    }
}
