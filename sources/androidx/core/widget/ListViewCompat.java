package androidx.core.widget;

import android.widget.ListView;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ListViewCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private ListViewCompat() {
    }

    @Deprecated
    public static boolean canScrollList(ListView listView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7228a536", new Object[]{listView, new Integer(i)})).booleanValue();
        }
        return listView.canScrollList(i);
    }

    @Deprecated
    public static void scrollListBy(ListView listView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd5a8b9", new Object[]{listView, new Integer(i)});
        } else {
            listView.scrollListBy(i);
        }
    }
}
