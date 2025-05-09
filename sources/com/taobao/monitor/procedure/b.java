package com.taobao.monitor.procedure;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.IPage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class b implements IPage {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<IPage> f11131a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IPage.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.monitor.procedure.IPage.d
        public void a(String str, String str2, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9b560120", new Object[]{this, str, str2, map});
                return;
            }
            for (IPage iPage : b.f(b.this)) {
                iPage.e().a(str, str2, map);
            }
        }

        @Override // com.taobao.monitor.procedure.IPage.d
        public void onPageAppear() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1800bf4a", new Object[]{this});
                return;
            }
            for (IPage iPage : b.f(b.this)) {
                iPage.e().onPageAppear();
            }
        }

        @Override // com.taobao.monitor.procedure.IPage.d
        public void onPageDestroy() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7ceb4d93", new Object[]{this});
                return;
            }
            for (IPage iPage : b.f(b.this)) {
                iPage.e().onPageDestroy();
            }
        }

        @Override // com.taobao.monitor.procedure.IPage.d
        public void onPageDisappear() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6518a43c", new Object[]{this});
                return;
            }
            for (IPage iPage : b.f(b.this)) {
                iPage.e().onPageDisappear();
            }
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.monitor.procedure.b$b  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class C0630b implements IPage.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public C0630b() {
        }

        @Override // com.taobao.monitor.procedure.IPage.b
        public void K(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb5b476", new Object[]{this, new Long(j)});
                return;
            }
            for (IPage iPage : b.f(b.this)) {
                iPage.c().K(j);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements IPage.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.monitor.procedure.IPage.c
        public void a(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("539dc3c3", new Object[]{this, str, obj});
                return;
            }
            for (IPage iPage : b.f(b.this)) {
                iPage.d().a(str, obj);
            }
        }

        @Override // com.taobao.monitor.procedure.IPage.c
        public void b(String str, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("385ab762", new Object[]{this, str, map});
                return;
            }
            for (IPage iPage : b.f(b.this)) {
                iPage.d().b(str, map);
            }
        }

        @Override // com.taobao.monitor.procedure.IPage.c
        public void onStage(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6ba4fb14", new Object[]{this, str, new Long(j)});
                return;
            }
            for (IPage iPage : b.f(b.this)) {
                iPage.d().onStage(str, j);
            }
        }

        @Override // com.taobao.monitor.procedure.IPage.c
        public void u(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("318f547c", new Object[]{this, str, obj});
                return;
            }
            for (IPage iPage : b.f(b.this)) {
                iPage.d().a(str, obj);
            }
        }
    }

    public b(List<IPage> list) {
        ArrayList arrayList = new ArrayList();
        this.f11131a = arrayList;
        arrayList.addAll(list);
    }

    public static /* synthetic */ List f(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f3b26ced", new Object[]{bVar});
        }
        return bVar.f11131a;
    }

    @Override // com.taobao.monitor.procedure.IPage
    public void a(View view, IPage.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54089bad", new Object[]{this, view, aVar});
            return;
        }
        Iterator it = ((ArrayList) this.f11131a).iterator();
        while (it.hasNext()) {
            ((IPage) it.next()).a(view, aVar);
        }
    }

    @Override // com.taobao.monitor.procedure.IPage
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("85bf1bc8", new Object[]{this});
        }
        return "PageGroupSession";
    }

    @Override // com.taobao.monitor.procedure.IPage
    public IPage.b c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPage.b) ipChange.ipc$dispatch("1bb912f6", new Object[]{this});
        }
        return new C0630b();
    }

    @Override // com.taobao.monitor.procedure.IPage
    public IPage.c d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPage.c) ipChange.ipc$dispatch("2ded361e", new Object[]{this});
        }
        return new c();
    }

    @Override // com.taobao.monitor.procedure.IPage
    public IPage.d e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPage.d) ipChange.ipc$dispatch("fec5cf24", new Object[]{this});
        }
        return new a();
    }

    @Override // com.taobao.monitor.procedure.IPage
    public String getPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
        }
        return "PageGroup";
    }
}
