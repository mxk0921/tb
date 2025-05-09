package tb;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.IPage;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class snl implements x6d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final snl f28161a = new snl();
    public static x6d b;

    public void a(x6d x6dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31a676c1", new Object[]{this, x6dVar});
        } else {
            b = x6dVar;
        }
    }

    @Override // tb.x6d
    public IPage d(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPage) ipChange.ipc$dispatch("aaa26240", new Object[]{this, view});
        }
        x6d x6dVar = b;
        if (x6dVar == null) {
            return IPage.DEFAULT_PAGE;
        }
        return x6dVar.d(view);
    }

    @Override // tb.x6d
    public IPage f(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPage) ipChange.ipc$dispatch("d0731da4", new Object[]{this, activity});
        }
        x6d x6dVar = b;
        if (x6dVar == null) {
            return IPage.DEFAULT_PAGE;
        }
        return x6dVar.f(activity);
    }

    @Override // tb.x6d
    public IPage i(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPage) ipChange.ipc$dispatch("9f5ca21d", new Object[]{this, fragment});
        }
        x6d x6dVar = b;
        if (x6dVar == null) {
            return IPage.DEFAULT_PAGE;
        }
        return x6dVar.i(fragment);
    }

    @Override // tb.x6d
    public IPage k(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPage) ipChange.ipc$dispatch("aa5a030b", new Object[]{this, view});
        }
        x6d x6dVar = b;
        if (x6dVar == null) {
            return IPage.DEFAULT_PAGE;
        }
        return x6dVar.k(view);
    }
}
