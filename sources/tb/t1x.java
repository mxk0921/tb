package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class t1x implements wbe {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final t1x INSTANCE = new t1x();

    /* renamed from: a  reason: collision with root package name */
    public wbe f28421a;

    @Override // tb.wbe
    public int a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a53c60b8", new Object[]{this, view})).intValue();
        }
        wbe wbeVar = this.f28421a;
        if (wbeVar != null) {
            return wbeVar.a(view);
        }
        return 0;
    }

    @Override // tb.wbe
    public boolean b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f25b880", new Object[]{this, view})).booleanValue();
        }
        wbe wbeVar = this.f28421a;
        if (wbeVar != null) {
            return wbeVar.b(view);
        }
        return false;
    }

    public t1x c(wbe wbeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t1x) ipChange.ipc$dispatch("fbda378a", new Object[]{this, wbeVar});
        }
        this.f28421a = wbeVar;
        return this;
    }
}
