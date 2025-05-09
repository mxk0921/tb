package com.alibaba.ut.abtest;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f3376a;
    public UTABEnvironment b;
    public UTABMethod c = UTABMethod.Pull;

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.ut.abtest.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class C0105a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final a f3377a = new a();

        static {
            t2o.a(961544252);
        }

        public a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4b90212b", new Object[]{this});
            }
            if (a.a(this.f3377a) == null) {
                a.b(this.f3377a, UTABEnvironment.Product);
            }
            return this.f3377a;
        }

        public C0105a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0105a) ipChange.ipc$dispatch("c805e96a", new Object[]{this, new Boolean(z)});
            }
            a.c(this.f3377a, z);
            return this;
        }

        public C0105a c(UTABEnvironment uTABEnvironment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0105a) ipChange.ipc$dispatch("ca270114", new Object[]{this, uTABEnvironment});
            }
            a.b(this.f3377a, uTABEnvironment);
            return this;
        }

        public C0105a d(UTABMethod uTABMethod) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0105a) ipChange.ipc$dispatch("a009d5bc", new Object[]{this, uTABMethod});
            }
            a.d(this.f3377a, uTABMethod);
            return this;
        }
    }

    static {
        t2o.a(961544251);
    }

    public static /* synthetic */ UTABEnvironment a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UTABEnvironment) ipChange.ipc$dispatch("f00b190c", new Object[]{aVar});
        }
        return aVar.b;
    }

    public static /* synthetic */ UTABEnvironment b(a aVar, UTABEnvironment uTABEnvironment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UTABEnvironment) ipChange.ipc$dispatch("4f0277a7", new Object[]{aVar, uTABEnvironment});
        }
        aVar.b = uTABEnvironment;
        return uTABEnvironment;
    }

    public static /* synthetic */ boolean c(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f4d79a", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.f3376a = z;
        return z;
    }

    public static /* synthetic */ UTABMethod d(a aVar, UTABMethod uTABMethod) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UTABMethod) ipChange.ipc$dispatch("82d1e8b9", new Object[]{aVar, uTABMethod});
        }
        aVar.c = uTABMethod;
        return uTABMethod;
    }

    public UTABEnvironment e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UTABEnvironment) ipChange.ipc$dispatch("9f3107cf", new Object[]{this});
        }
        return this.b;
    }

    public UTABMethod f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UTABMethod) ipChange.ipc$dispatch("13ea5d19", new Object[]{this});
        }
        return this.c;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f088b7", new Object[]{this})).booleanValue();
        }
        return this.f3376a;
    }
}
