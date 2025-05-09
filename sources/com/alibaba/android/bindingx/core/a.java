package com.alibaba.android.bindingx.core;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public c f2168a;
    public e b;
    public f c;
    public d d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public c f2169a;
        public e b;
        public f c;
        public d d;

        static {
            t2o.a(87031831);
        }

        public a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4b8d1d01", new Object[]{this});
            }
            a aVar = new a();
            a.a(aVar, this.b);
            a.b(aVar, this.f2169a);
            a.c(aVar, this.c);
            a.d(aVar, this.d);
            return aVar;
        }

        public b b(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("83597247", new Object[]{this, cVar});
            }
            this.f2169a = cVar;
            return this;
        }

        public b c(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("7d200b8f", new Object[]{this, dVar});
            }
            this.d = dVar;
            return this;
        }

        public b d(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("3d4db769", new Object[]{this, eVar});
            }
            this.b = eVar;
            return this;
        }

        public b e(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("f76b18ef", new Object[]{this, fVar});
            }
            this.c = fVar;
            return this;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface c {
        double a(double d, Object... objArr);

        double b(double d, Object... objArr);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface d {
        void a(String str, g gVar);

        void b(String str, g gVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface e {
        View a(String str, Object... objArr);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface f {
        void a(View view, String str, Object obj, c cVar, Map<String, Object> map, Object... objArr);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface g {
        void a();

        void i(float f, float f2);

        void l(float f, float f2);
    }

    static {
        t2o.a(87031829);
    }

    public static /* synthetic */ e a(a aVar, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("889f4ba6", new Object[]{aVar, eVar});
        }
        aVar.b = eVar;
        return eVar;
    }

    public static /* synthetic */ c b(a aVar, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("cd4b74c5", new Object[]{aVar, cVar});
        }
        aVar.f2168a = cVar;
        return cVar;
    }

    public static /* synthetic */ f c(a aVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("6b632116", new Object[]{aVar, fVar});
        }
        aVar.c = fVar;
        return fVar;
    }

    public static /* synthetic */ d d(a aVar, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("b7107cb7", new Object[]{aVar, dVar});
        }
        aVar.d = dVar;
        return dVar;
    }

    public c e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("fb60c2ae", new Object[]{this});
        }
        return this.f2168a;
    }

    public d f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("97285924", new Object[]{this});
        }
        return this.d;
    }

    public e g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("e1813c44", new Object[]{this});
        }
        return this.b;
    }

    public f h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("1f98ddd6", new Object[]{this});
        }
        return this.c;
    }

    public a() {
    }
}
