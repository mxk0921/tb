package tb;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class vhr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093663);
    }

    public static View a(String str, ViewGroup viewGroup) {
        View a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8f660902", new Object[]{str, viewGroup});
        }
        if (!TextUtils.isEmpty(str) && viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (str.equals(childAt.getTag())) {
                    return childAt;
                }
                if ((childAt instanceof ViewGroup) && (a2 = a(str, (ViewGroup) childAt)) != null) {
                    return a2;
                }
            }
        }
        return null;
    }

    public static View b(String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6dad2ca8", new Object[]{str, view});
        }
        if (TextUtils.isEmpty(str) || view == null) {
            return null;
        }
        if (str.equals(view.getTag())) {
            return view;
        }
        if (view instanceof ViewGroup) {
            return a(str, (ViewGroup) view);
        }
        return null;
    }
}
