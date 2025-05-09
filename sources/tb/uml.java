package tb;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.IPage;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class uml implements a6d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final uml b = new uml();

    /* renamed from: a  reason: collision with root package name */
    public a6d f29495a;

    public static uml c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uml) ipChange.ipc$dispatch("a464174c", new Object[0]);
        }
        return b;
    }

    @Override // tb.a6d
    public IPage a(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPage) ipChange.ipc$dispatch("49e83c9d", new Object[]{this, view, new Boolean(z)});
        }
        a6d a6dVar = this.f29495a;
        if (a6dVar == null) {
            return IPage.DEFAULT_PAGE;
        }
        return a6dVar.a(view, z);
    }

    @Override // tb.a6d
    public IPage b(Fragment fragment, String str, String str2, View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPage) ipChange.ipc$dispatch("fb65ea88", new Object[]{this, fragment, str, str2, view, new Boolean(z)});
        }
        a6d a6dVar = this.f29495a;
        if (a6dVar == null) {
            return IPage.DEFAULT_PAGE;
        }
        return a6dVar.b(fragment, str, str2, view, z);
    }

    public void d(a6d a6dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86efc44", new Object[]{this, a6dVar});
        } else {
            this.f29495a = a6dVar;
        }
    }
}
