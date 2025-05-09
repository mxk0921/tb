package com.taobao.tao.flexbox.layoutmanager.ac;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.c;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;
import tb.tfs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, c.a> f11966a = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
    }

    static {
        t2o.a(503316543);
    }

    public void a(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("688aa9ae", new Object[]{this, str, aVar});
            return;
        }
        c.a b = b(str);
        if (b == null) {
            ((d.g) aVar).a("jsCode not found " + str);
            tfs.e("TNode", "jsCode not found " + str);
            return;
        }
        b.f11968a.getClass();
        ((d.g) aVar).b(b);
    }

    public c.a b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c.a) ipChange.ipc$dispatch("24a86fd9", new Object[]{this, str});
        }
        c.a b = c.b(str);
        if (b == null) {
            return (c.a) ((HashMap) this.f11966a).get(str);
        }
        return b;
    }

    public c.a c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c.a) ipChange.ipc$dispatch("b5f10150", new Object[]{this, str});
        }
        c.a b = b(str);
        if (b == null || b.b == null) {
            return null;
        }
        return b;
    }

    public boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b03ef594", new Object[]{this, str})).booleanValue();
        }
        c.a b = b(str);
        if (b == null || b.f11968a == null) {
            return false;
        }
        return true;
    }

    public void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5adefbe0", new Object[]{this, str, str2});
        } else if (!((HashMap) this.f11966a).containsKey(str)) {
            c.a aVar = new c.a();
            aVar.f11968a = str2;
            ((HashMap) this.f11966a).put(str, aVar);
        }
    }
}
