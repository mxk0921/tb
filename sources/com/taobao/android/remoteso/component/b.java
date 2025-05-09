package com.taobao.android.remoteso.component;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.component.Remo;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import tb.b79;
import tb.bzn;
import tb.c52;
import tb.d52;
import tb.m0n;
import tb.van;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements c52 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AbstractC0477b f9249a;
        public final /* synthetic */ m0n.a b;

        public a(b bVar, AbstractC0477b bVar2, m0n.a aVar) {
            this.f9249a = bVar2;
            this.b = aVar;
        }

        @Override // tb.c52
        public void b(d52 d52Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f4b58cf", new Object[]{this, d52Var});
                return;
            }
            ((Remo.c) this.f9249a).b(d52Var);
            van.f().h().b(this.b);
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.remoteso.component.b$b  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface AbstractC0477b extends c52 {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c implements m0n.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final com.taobao.android.remoteso.component.c f9250a;
        public final String b;
        public final AbstractC0477b c;

        public c(com.taobao.android.remoteso.component.c cVar, String str, AbstractC0477b bVar) {
            this.f9250a = cVar;
            this.b = str;
            this.c = bVar;
        }

        @Override // tb.m0n.a
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f78ae4d4", new Object[]{this, new Integer(i)});
            } else {
                ((Remo.c) this.c).f(i);
            }
        }

        @Override // tb.m0n.a
        public String module() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1b4e040d", new Object[]{this});
            }
            return this.b;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "RSoUpdateCallback{reqBO=" + this.f9250a.m() + '}';
        }
    }

    public static List<String> b(List<b79> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("690a7d3c", new Object[]{list});
        }
        ArrayList arrayList = new ArrayList();
        for (b79 b79Var : list) {
            arrayList.add(b79Var.e());
        }
        return arrayList;
    }

    public List<String> a(com.taobao.android.remoteso.component.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4f0025ff", new Object[]{this, cVar});
        }
        List<String> t = cVar.t("rso");
        if (t.isEmpty()) {
            return Collections.emptyList();
        }
        d52 a2 = bzn.b().a(t);
        if (a2.d()) {
            return Collections.emptyList();
        }
        List<String> b = b(a2.b());
        RSoLog.d("remo,RSoOperator,check, rso operator exit, failure = " + b);
        return b;
    }

    public void c(com.taobao.android.remoteso.component.c cVar, AbstractC0477b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d13f1837", new Object[]{this, cVar, bVar});
            return;
        }
        List<String> t = cVar.t("rso");
        if (t.isEmpty()) {
            RSoLog.d("remo,RSoOperator, install skip, no module need install");
            return;
        }
        c cVar2 = new c(cVar, t.get(0), bVar);
        van.f().h().a(cVar2);
        bzn.b().e(t, new a(this, bVar, cVar2));
    }
}
