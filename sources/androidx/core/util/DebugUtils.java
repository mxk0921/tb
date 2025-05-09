package androidx.core.util;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DebugUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private DebugUtils() {
    }

    public static void buildShortClassTag(Object obj, StringBuilder sb) {
        int lastIndexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7912718", new Object[]{obj, sb});
        } else if (obj == null) {
            sb.append("null");
        } else {
            String simpleName = obj.getClass().getSimpleName();
            if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
                simpleName = simpleName.substring(lastIndexOf + 1);
            }
            sb.append(simpleName);
            sb.append('{');
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }
}
