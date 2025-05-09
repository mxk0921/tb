package tb;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vxm implements pdd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final vxm b = new vxm();

    /* renamed from: a  reason: collision with root package name */
    public pdd f30317a;

    @Override // tb.pdd
    public mdd a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("d755854a", new Object[]{this, activity});
        }
        pdd pddVar = this.f30317a;
        if (pddVar == null) {
            return mdd.DEFAULT;
        }
        return pddVar.a(activity);
    }

    @Override // tb.pdd
    public mdd b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("13a17e51", new Object[]{this, str});
        }
        pdd pddVar = this.f30317a;
        if (pddVar == null) {
            return mdd.DEFAULT;
        }
        return pddVar.b(str);
    }

    @Override // tb.pdd
    @Deprecated
    public mdd c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("1b99f2eb", new Object[]{this});
        }
        pdd pddVar = this.f30317a;
        if (pddVar == null) {
            return mdd.DEFAULT;
        }
        return pddVar.c();
    }

    public vxm d(pdd pddVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vxm) ipChange.ipc$dispatch("4a72d1de", new Object[]{this, pddVar});
        }
        this.f30317a = pddVar;
        return this;
    }

    @Override // tb.pdd
    public mdd e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("ea1481c7", new Object[]{this});
        }
        pdd pddVar = this.f30317a;
        if (pddVar == null) {
            return mdd.DEFAULT;
        }
        return pddVar.e();
    }

    @Override // tb.pdd
    public mdd g(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("be362f91", new Object[]{this, view});
        }
        pdd pddVar = this.f30317a;
        if (pddVar == null) {
            return mdd.DEFAULT;
        }
        return pddVar.g(view);
    }

    @Override // tb.pdd
    public mdd h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("33a90ac5", new Object[]{this});
        }
        pdd pddVar = this.f30317a;
        if (pddVar == null) {
            return mdd.DEFAULT;
        }
        return pddVar.h();
    }

    @Override // tb.pdd
    public mdd j(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("19c020f", new Object[]{this, fragment});
        }
        pdd pddVar = this.f30317a;
        if (pddVar == null) {
            return mdd.DEFAULT;
        }
        return pddVar.j(fragment);
    }

    @Override // tb.pdd
    @Deprecated
    public mdd l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("f1358a4a", new Object[]{this});
        }
        pdd pddVar = this.f30317a;
        if (pddVar == null) {
            return mdd.DEFAULT;
        }
        return pddVar.l();
    }
}
