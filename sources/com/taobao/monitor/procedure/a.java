package com.taobao.monitor.procedure;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.IPage;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class a implements IPage {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final c f11130a = new c();
    public static final C0629a b = new C0629a();
    public static final b c = new b();

    /* compiled from: Taobao */
    /* renamed from: com.taobao.monitor.procedure.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class C0629a implements IPage.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.monitor.procedure.IPage.b
        public void K(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb5b476", new Object[]{this, new Long(j)});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b implements IPage.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.monitor.procedure.IPage.c
        public void a(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("539dc3c3", new Object[]{this, str, obj});
            }
        }

        @Override // com.taobao.monitor.procedure.IPage.c
        public void b(String str, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("385ab762", new Object[]{this, str, map});
            }
        }

        @Override // com.taobao.monitor.procedure.IPage.c
        public void onStage(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6ba4fb14", new Object[]{this, str, new Long(j)});
            }
        }

        @Override // com.taobao.monitor.procedure.IPage.c
        public void u(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("318f547c", new Object[]{this, str, obj});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class c implements IPage.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.monitor.procedure.IPage.d
        public void a(String str, String str2, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9b560120", new Object[]{this, str, str2, map});
            }
        }

        @Override // com.taobao.monitor.procedure.IPage.d
        public void onPageAppear() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1800bf4a", new Object[]{this});
            }
        }

        @Override // com.taobao.monitor.procedure.IPage.d
        public void onPageDestroy() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7ceb4d93", new Object[]{this});
            }
        }

        @Override // com.taobao.monitor.procedure.IPage.d
        public void onPageDisappear() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6518a43c", new Object[]{this});
            }
        }
    }

    @Override // com.taobao.monitor.procedure.IPage
    public void a(View view, IPage.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54089bad", new Object[]{this, view, aVar});
        }
    }

    @Override // com.taobao.monitor.procedure.IPage
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("85bf1bc8", new Object[]{this});
        }
        return "non-PageSession";
    }

    @Override // com.taobao.monitor.procedure.IPage
    public IPage.b c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPage.b) ipChange.ipc$dispatch("1bb912f6", new Object[]{this});
        }
        return b;
    }

    @Override // com.taobao.monitor.procedure.IPage
    public IPage.c d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPage.c) ipChange.ipc$dispatch("2ded361e", new Object[]{this});
        }
        return c;
    }

    @Override // com.taobao.monitor.procedure.IPage
    public IPage.d e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPage.d) ipChange.ipc$dispatch("fec5cf24", new Object[]{this});
        }
        return f11130a;
    }

    @Override // com.taobao.monitor.procedure.IPage
    public String getPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
        }
        return "DefaultPage";
    }
}
