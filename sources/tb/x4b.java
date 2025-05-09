package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.ngb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class x4b implements ngb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final bbs f31138a;
    public final List<String> b = new ArrayList();
    public final AtomicBoolean c = new AtomicBoolean(false);

    static {
        t2o.a(839909547);
        t2o.a(839909551);
    }

    public x4b(bbs bbsVar) {
        ckf.g(bbsVar, "instance");
        this.f31138a = bbsVar;
    }

    @Override // tb.t4c
    public void N(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dc73485", new Object[]{this, bbsVar});
            return;
        }
        ckf.g(bbsVar, "instance");
        ngb.a.a(this, bbsVar);
        if (TMSInstanceExtKt.e(bbsVar) && b() != null) {
            this.c.set(true);
        }
    }

    public final ITMSPage b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("306d3b31", new Object[]{this});
        }
        if (!q9s.e0()) {
            return this.f31138a.W().getTopPage();
        }
        if (this.f31138a.W().getAlivePageCount() == 1) {
            return this.f31138a.W().getPageByIndex(0);
        }
        return null;
    }

    @Override // tb.t4c
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
        } else {
            ngb.a.b(this);
        }
    }

    @Override // tb.ngb
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else if (!this.c.get()) {
            ((ArrayList) this.b).add("onPause");
        } else {
            ITMSPage b = b();
            if (b != null) {
                b.onPause();
            }
        }
    }

    @Override // tb.ngb
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else if (!this.c.get()) {
            ((ArrayList) this.b).add("onResume");
        } else {
            ITMSPage b = b();
            if (b != null) {
                b.onResume();
            }
        }
    }

    @Override // tb.ngb
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else if (!this.c.get()) {
            ((ArrayList) this.b).add("onStart");
        } else {
            ITMSPage b = b();
            if (b != null) {
                b.onStart();
            }
        }
    }

    @Override // tb.ngb
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else if (!this.c.get()) {
            ((ArrayList) this.b).add("onStop");
        } else {
            ITMSPage b = b();
            if (b != null) {
                b.onStop();
            }
        }
    }

    public final void t(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18cc98dd", new Object[]{this, iTMSPage});
            return;
        }
        ckf.g(iTMSPage, "page");
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            switch (str.hashCode()) {
                case -1340212393:
                    if (str.equals("onPause")) {
                        iTMSPage.onPause();
                        break;
                    } else {
                        break;
                    }
                case -1336895037:
                    if (str.equals("onStart")) {
                        iTMSPage.onStart();
                        break;
                    } else {
                        break;
                    }
                case -1012956543:
                    if (str.equals("onStop")) {
                        iTMSPage.onStop();
                        break;
                    } else {
                        break;
                    }
                case 1463983852:
                    if (str.equals("onResume")) {
                        iTMSPage.onResume();
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.c.set(true);
    }
}
