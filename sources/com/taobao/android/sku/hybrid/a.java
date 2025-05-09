package com.taobao.android.sku.hybrid;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.g3q;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final List<C0485a> f9446a = new ArrayList();

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.sku.hybrid.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class C0485a {

        /* renamed from: a  reason: collision with root package name */
        public final g3q f9447a;

        static {
            t2o.a(442499199);
        }

        public C0485a(g3q g3qVar) {
            this.f9447a = g3qVar;
        }
    }

    static {
        t2o.a(442499198);
    }

    public static C0485a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C0485a) ipChange.ipc$dispatch("25e07fa7", new Object[0]);
        }
        List<C0485a> list = f9446a;
        if (((ArrayList) list).isEmpty()) {
            return null;
        }
        return (C0485a) ((ArrayList) list).get(((ArrayList) list).size() - 1);
    }

    public static void b(C0485a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cb9ce44", new Object[]{aVar});
        } else if (aVar != null) {
            List<C0485a> list = f9446a;
            if (((ArrayList) list).contains(aVar)) {
                ((ArrayList) list).remove(aVar);
                ((ArrayList) list).add(aVar);
                return;
            }
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                if (((C0485a) it.next()).f9447a == aVar.f9447a) {
                    it.remove();
                }
            }
            ((ArrayList) f9446a).add(aVar);
        }
    }

    public static void c(C0485a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72a782b", new Object[]{aVar});
            return;
        }
        List<C0485a> list = f9446a;
        if (((ArrayList) list).isEmpty() || aVar == null) {
            return;
        }
        if (((ArrayList) list).contains(aVar)) {
            ((ArrayList) list).remove(aVar);
            return;
        }
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            if (((C0485a) it.next()).f9447a == aVar.f9447a) {
                it.remove();
            }
        }
    }
}
