package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.widgets.list.listcell.weex.SearchSceneEnhancedWeexModWidget;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class j5p implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SearchSceneEnhancedWeexModWidget f21780a;

    public j5p(SearchSceneEnhancedWeexModWidget searchSceneEnhancedWeexModWidget) {
        this.f21780a = searchSceneEnhancedWeexModWidget;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            this.f21780a.i3();
        }
    }
}
