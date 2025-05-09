package com.taobao.android.dinamicx;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import tb.t2o;
import tb.t76;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DXResult<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int NORMAL = 0;
    public static final int PRE_RENDER = 1;
    public static final int PRE_RENDER_X = 2;

    /* renamed from: a  reason: collision with root package name */
    public T f7291a;
    public f b;
    public t76 c;
    public Map<String, String> d;
    public int e = 0;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface HitStatus {
    }

    static {
        t2o.a(444596549);
    }

    public DXResult(T t) {
        this.f7291a = t;
    }

    public f a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("c56b4755", new Object[]{this});
        }
        return this.b;
    }

    public t76 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t76) ipChange.ipc$dispatch("cef66acb", new Object[]{this});
        }
        if (this.c == null) {
            this.c = new t76();
        }
        return this.c;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c7a01ba9", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public void e(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acb76a07", new Object[]{this, fVar});
        } else {
            this.b = fVar;
        }
    }

    public void f(t76 t76Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36d5bc0b", new Object[]{this, t76Var});
        } else {
            this.c = t76Var;
        }
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f45a3619", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public void h(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54da4c8e", new Object[]{this, map});
        } else {
            this.d = map;
        }
    }

    public void i(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8046e82", new Object[]{this, t});
        } else {
            this.f7291a = t;
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2d4ed19", new Object[]{this})).booleanValue();
        }
        f fVar = this.b;
        return fVar != null && fVar.c.size() > 0;
    }

    public DXResult(f fVar) {
        this.b = fVar;
    }

    public DXResult(T t, f fVar) {
        this.f7291a = t;
        this.b = fVar;
    }

    public DXResult() {
    }
}
