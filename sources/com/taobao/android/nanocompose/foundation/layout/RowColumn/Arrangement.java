package com.taobao.android.nanocompose.foundation.layout.RowColumn;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.WXConfig;
import tb.a07;
import tb.can;
import tb.ckf;
import tb.iai;
import tb.ic1;
import tb.n5z;
import tb.t2o;
import tb.u1a;
import tb.v4z;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class Arrangement {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Arrangement INSTANCE = new Arrangement();

    /* renamed from: a  reason: collision with root package name */
    public static final d f9012a = new j();
    public static final d b = new c();
    public static final l c = new k();
    public static final l d = new a();
    public static final e e = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a implements l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.nanocompose.foundation.layout.RowColumn.Arrangement.l
        public float a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("bf7d3978", new Object[]{this})).floatValue();
            }
            return l.a.a(this);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "Arrangement#Bottom";
        }

        @Override // com.taobao.android.nanocompose.foundation.layout.RowColumn.Arrangement.l
        public void b(v4z v4zVar, int i, int[] iArr, int[] iArr2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af91e32", new Object[]{this, v4zVar, new Integer(i), iArr, iArr2});
                return;
            }
            ckf.g(v4zVar, "<this>");
            ckf.g(iArr, "sizes");
            ckf.g(iArr2, "outPositions");
            Arrangement.INSTANCE.h(i, iArr, iArr2, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b implements e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final float f9013a = n5z.g(0);

        @Override // com.taobao.android.nanocompose.foundation.layout.RowColumn.Arrangement.d, com.taobao.android.nanocompose.foundation.layout.RowColumn.Arrangement.l
        public float a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("bf7d3978", new Object[]{this})).floatValue();
            }
            return this.f9013a;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "Arrangement#Center";
        }

        @Override // com.taobao.android.nanocompose.foundation.layout.RowColumn.Arrangement.l
        public void b(v4z v4zVar, int i, int[] iArr, int[] iArr2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af91e32", new Object[]{this, v4zVar, new Integer(i), iArr, iArr2});
                return;
            }
            ckf.g(v4zVar, "<this>");
            ckf.g(iArr, "sizes");
            ckf.g(iArr2, "outPositions");
            Arrangement.INSTANCE.f(i, iArr, iArr2, false);
        }

        @Override // com.taobao.android.nanocompose.foundation.layout.RowColumn.Arrangement.d
        public void c(v4z v4zVar, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ddbae78", new Object[]{this, v4zVar, new Integer(i), iArr, layoutDirection, iArr2});
                return;
            }
            ckf.g(v4zVar, "<this>");
            ckf.g(iArr, "sizes");
            ckf.g(layoutDirection, WXConfig.layoutDirection);
            ckf.g(iArr2, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.f(i, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.f(i, iArr, iArr2, true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface d {

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            static {
                t2o.a(598737059);
            }

            public static float a(d dVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("bcd52d5f", new Object[]{dVar})).floatValue();
                }
                ckf.g(dVar, "this");
                return n5z.g(0);
            }
        }

        float a();

        void c(v4z v4zVar, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface e extends d, l {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class f implements e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final float f9014a = n5z.g(0);

        @Override // com.taobao.android.nanocompose.foundation.layout.RowColumn.Arrangement.d, com.taobao.android.nanocompose.foundation.layout.RowColumn.Arrangement.l
        public float a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("bf7d3978", new Object[]{this})).floatValue();
            }
            return this.f9014a;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "Arrangement#SpaceAround";
        }

        @Override // com.taobao.android.nanocompose.foundation.layout.RowColumn.Arrangement.l
        public void b(v4z v4zVar, int i, int[] iArr, int[] iArr2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af91e32", new Object[]{this, v4zVar, new Integer(i), iArr, iArr2});
                return;
            }
            ckf.g(v4zVar, "<this>");
            ckf.g(iArr, "sizes");
            ckf.g(iArr2, "outPositions");
            Arrangement.INSTANCE.i(i, iArr, iArr2, false);
        }

        @Override // com.taobao.android.nanocompose.foundation.layout.RowColumn.Arrangement.d
        public void c(v4z v4zVar, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ddbae78", new Object[]{this, v4zVar, new Integer(i), iArr, layoutDirection, iArr2});
                return;
            }
            ckf.g(v4zVar, "<this>");
            ckf.g(iArr, "sizes");
            ckf.g(layoutDirection, WXConfig.layoutDirection);
            ckf.g(iArr2, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.i(i, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.i(i, iArr, iArr2, true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class g implements e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final float f9015a = n5z.g(0);

        @Override // com.taobao.android.nanocompose.foundation.layout.RowColumn.Arrangement.d, com.taobao.android.nanocompose.foundation.layout.RowColumn.Arrangement.l
        public float a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("bf7d3978", new Object[]{this})).floatValue();
            }
            return this.f9015a;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "Arrangement#SpaceBetween";
        }

        @Override // com.taobao.android.nanocompose.foundation.layout.RowColumn.Arrangement.l
        public void b(v4z v4zVar, int i, int[] iArr, int[] iArr2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af91e32", new Object[]{this, v4zVar, new Integer(i), iArr, iArr2});
                return;
            }
            ckf.g(v4zVar, "<this>");
            ckf.g(iArr, "sizes");
            ckf.g(iArr2, "outPositions");
            Arrangement.INSTANCE.j(i, iArr, iArr2, false);
        }

        @Override // com.taobao.android.nanocompose.foundation.layout.RowColumn.Arrangement.d
        public void c(v4z v4zVar, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ddbae78", new Object[]{this, v4zVar, new Integer(i), iArr, layoutDirection, iArr2});
                return;
            }
            ckf.g(v4zVar, "<this>");
            ckf.g(iArr, "sizes");
            ckf.g(layoutDirection, WXConfig.layoutDirection);
            ckf.g(iArr2, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.j(i, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.j(i, iArr, iArr2, true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class h implements e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final float f9016a = n5z.g(0);

        @Override // com.taobao.android.nanocompose.foundation.layout.RowColumn.Arrangement.d, com.taobao.android.nanocompose.foundation.layout.RowColumn.Arrangement.l
        public float a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("bf7d3978", new Object[]{this})).floatValue();
            }
            return this.f9016a;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "Arrangement#SpaceEvenly";
        }

        @Override // com.taobao.android.nanocompose.foundation.layout.RowColumn.Arrangement.l
        public void b(v4z v4zVar, int i, int[] iArr, int[] iArr2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af91e32", new Object[]{this, v4zVar, new Integer(i), iArr, iArr2});
                return;
            }
            ckf.g(v4zVar, "<this>");
            ckf.g(iArr, "sizes");
            ckf.g(iArr2, "outPositions");
            Arrangement.INSTANCE.k(i, iArr, iArr2, false);
        }

        @Override // com.taobao.android.nanocompose.foundation.layout.RowColumn.Arrangement.d
        public void c(v4z v4zVar, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ddbae78", new Object[]{this, v4zVar, new Integer(i), iArr, layoutDirection, iArr2});
                return;
            }
            ckf.g(v4zVar, "<this>");
            ckf.g(iArr, "sizes");
            ckf.g(layoutDirection, WXConfig.layoutDirection);
            ckf.g(iArr2, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.k(i, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.k(i, iArr, iArr2, true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class i implements e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final float f9017a;
        public final boolean b;
        public final u1a<Integer, LayoutDirection, Integer> c;
        public final float d;

        static {
            t2o.a(598737065);
            t2o.a(598737060);
        }

        public /* synthetic */ i(float f, boolean z, u1a u1aVar, a07 a07Var) {
            this(f, z, u1aVar);
        }

        @Override // com.taobao.android.nanocompose.foundation.layout.RowColumn.Arrangement.d, com.taobao.android.nanocompose.foundation.layout.RowColumn.Arrangement.l
        public float a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("bf7d3978", new Object[]{this})).floatValue();
            }
            return this.d;
        }

        @Override // com.taobao.android.nanocompose.foundation.layout.RowColumn.Arrangement.l
        public void b(v4z v4zVar, int i, int[] iArr, int[] iArr2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af91e32", new Object[]{this, v4zVar, new Integer(i), iArr, iArr2});
                return;
            }
            ckf.g(v4zVar, "<this>");
            ckf.g(iArr, "sizes");
            ckf.g(iArr2, "outPositions");
            c(v4zVar, i, iArr, LayoutDirection.Ltr, iArr2);
        }

        public final float d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1715e43b", new Object[]{this})).floatValue();
            }
            return this.f9017a;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (n5z.l(this.f9017a, iVar.f9017a) && this.b == iVar.b && ckf.b(this.c, iVar.c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i = 0;
            int i2 = 1;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            int n = n5z.n(this.f9017a) * 31;
            boolean z = this.b;
            if (!z) {
                i2 = z ? 1 : 0;
            }
            int i3 = (n + i2) * 31;
            u1a<Integer, LayoutDirection, Integer> u1aVar = this.c;
            if (u1aVar != null) {
                i = u1aVar.hashCode();
            }
            return i3 + i;
        }

        public String toString() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder();
            if (this.b) {
                str = "";
            } else {
                str = "Absolute";
            }
            sb.append(str);
            sb.append("Arrangement#spacedAligned(");
            sb.append((Object) n5z.s(d()));
            sb.append(", ");
            sb.append(this.c);
            sb.append(')');
            return sb.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public i(float f, boolean z, u1a<? super Integer, ? super LayoutDirection, Integer> u1aVar) {
            this.f9017a = f;
            this.b = z;
            this.c = u1aVar;
            this.d = d();
        }

        @Override // com.taobao.android.nanocompose.foundation.layout.RowColumn.Arrangement.d
        public void c(v4z v4zVar, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            int i2;
            int i3;
            int min;
            int i4;
            int i5 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ddbae78", new Object[]{this, v4zVar, new Integer(i), iArr, layoutDirection, iArr2});
                return;
            }
            ckf.g(v4zVar, "<this>");
            ckf.g(iArr, "sizes");
            ckf.g(layoutDirection, WXConfig.layoutDirection);
            ckf.g(iArr2, "outPositions");
            if (iArr.length != 0) {
                int f = v4zVar.f(d());
                boolean z = this.b && layoutDirection == LayoutDirection.Rtl;
                IpChange ipChange2 = Arrangement.$ipChange;
                if (!z) {
                    int length = iArr.length;
                    int i6 = 0;
                    i3 = 0;
                    i2 = 0;
                    int i7 = 0;
                    while (i6 < length) {
                        int i8 = iArr[i6];
                        i7++;
                        int min2 = Math.min(i3, i - i8);
                        iArr2[i7] = min2;
                        int min3 = Math.min(f, (i - min2) - i8);
                        i3 = iArr2[i7] + i8 + min3;
                        i6++;
                        i2 = min3;
                    }
                } else {
                    int length2 = iArr.length - 1;
                    if (length2 >= 0) {
                        int i9 = 0;
                        while (true) {
                            int i10 = length2 - 1;
                            int i11 = iArr[length2];
                            int min4 = Math.min(i9, i - i11);
                            iArr2[length2] = min4;
                            min = Math.min(f, (i - min4) - i11);
                            i4 = iArr2[length2] + i11 + min;
                            if (i10 < 0) {
                                break;
                            }
                            i9 = i4;
                            length2 = i10;
                        }
                        i3 = i4;
                        i2 = min;
                    } else {
                        i3 = 0;
                        i2 = 0;
                    }
                }
                int i12 = i3 - i2;
                u1a<Integer, LayoutDirection, Integer> u1aVar = this.c;
                if (u1aVar != null && i12 < i) {
                    int intValue = u1aVar.invoke(Integer.valueOf(i - i12), layoutDirection).intValue();
                    int length3 = iArr2.length - 1;
                    if (length3 >= 0) {
                        while (true) {
                            int i13 = i5 + 1;
                            iArr2[i5] = iArr2[i5] + intValue;
                            if (i13 <= length3) {
                                i5 = i13;
                            } else {
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class k implements l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.nanocompose.foundation.layout.RowColumn.Arrangement.l
        public float a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("bf7d3978", new Object[]{this})).floatValue();
            }
            return l.a.a(this);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "Arrangement#Top";
        }

        @Override // com.taobao.android.nanocompose.foundation.layout.RowColumn.Arrangement.l
        public void b(v4z v4zVar, int i, int[] iArr, int[] iArr2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af91e32", new Object[]{this, v4zVar, new Integer(i), iArr, iArr2});
                return;
            }
            ckf.g(v4zVar, "<this>");
            ckf.g(iArr, "sizes");
            ckf.g(iArr2, "outPositions");
            Arrangement.INSTANCE.g(iArr, iArr2, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface l {

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            static {
                t2o.a(598737069);
            }

            public static float a(l lVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("5ab58f8d", new Object[]{lVar})).floatValue();
                }
                ckf.g(lVar, "this");
                return n5z.g(0);
            }
        }

        float a();

        void b(v4z v4zVar, int i, int[] iArr, int[] iArr2);
    }

    static {
        t2o.a(598737044);
        new h();
        new g();
        new f();
    }

    public final l a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("f2246cbd", new Object[]{this});
        }
        return d;
    }

    public final e b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("58c9f180", new Object[]{this});
        }
        return e;
    }

    public final d c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("5b8ed153", new Object[]{this});
        }
        return b;
    }

    public final d d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("832dbb1a", new Object[]{this});
        }
        return f9012a;
    }

    public final l e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("671ac6bb", new Object[]{this});
        }
        return c;
    }

    public final d l(float f2, can.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("fbe6e42e", new Object[]{this, new Float(f2), bVar});
        }
        ckf.g(bVar, "alignment");
        return new i(f2, true, new Arrangement$spacedBy$2(bVar), null);
    }

    public final l m(float f2, can.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("3bafd90a", new Object[]{this, new Float(f2), cVar});
        }
        ckf.g(cVar, "alignment");
        return new i(f2, false, new Arrangement$spacedBy$3(cVar), null);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class c implements d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.nanocompose.foundation.layout.RowColumn.Arrangement.d, com.taobao.android.nanocompose.foundation.layout.RowColumn.Arrangement.l
        public float a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("bf7d3978", new Object[]{this})).floatValue();
            }
            return d.a.a(this);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "Arrangement#End";
        }

        @Override // com.taobao.android.nanocompose.foundation.layout.RowColumn.Arrangement.d
        public void c(v4z v4zVar, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ddbae78", new Object[]{this, v4zVar, new Integer(i), iArr, layoutDirection, iArr2});
                return;
            }
            ckf.g(v4zVar, "<this>");
            ckf.g(iArr, "sizes");
            ckf.g(layoutDirection, WXConfig.layoutDirection);
            ckf.g(iArr2, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.h(i, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.g(iArr, iArr2, true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class j implements d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.nanocompose.foundation.layout.RowColumn.Arrangement.d, com.taobao.android.nanocompose.foundation.layout.RowColumn.Arrangement.l
        public float a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("bf7d3978", new Object[]{this})).floatValue();
            }
            return d.a.a(this);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "Arrangement#Start";
        }

        @Override // com.taobao.android.nanocompose.foundation.layout.RowColumn.Arrangement.d
        public void c(v4z v4zVar, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ddbae78", new Object[]{this, v4zVar, new Integer(i), iArr, layoutDirection, iArr2});
                return;
            }
            ckf.g(v4zVar, "<this>");
            ckf.g(iArr, "sizes");
            ckf.g(layoutDirection, WXConfig.layoutDirection);
            ckf.g(iArr2, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.g(iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.h(i, iArr, iArr2, true);
            }
        }
    }

    public final void g(int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52115148", new Object[]{this, iArr, iArr2, new Boolean(z)});
            return;
        }
        ckf.g(iArr, "size");
        ckf.g(iArr2, "outPosition");
        if (!z) {
            int length = iArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i2 < length) {
                int i5 = iArr[i2];
                i3++;
                iArr2[i3] = i4;
                i4 += i5;
                i2++;
            }
            return;
        }
        int length2 = iArr.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i6 = length2 - 1;
                int i7 = iArr[length2];
                iArr2[length2] = i2;
                i2 += i7;
                if (i6 >= 0) {
                    length2 = i6;
                } else {
                    return;
                }
            }
        }
    }

    public final void h(int i2, int[] iArr, int[] iArr2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28f1ba44", new Object[]{this, new Integer(i2), iArr, iArr2, new Boolean(z)});
            return;
        }
        ckf.g(iArr, "size");
        ckf.g(iArr2, "outPosition");
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        int i5 = i2 - i3;
        if (!z) {
            int i6 = 0;
            for (int i7 : iArr) {
                i6++;
                iArr2[i6] = i5;
                i5 += i7;
            }
            return;
        }
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                int i9 = iArr[length];
                iArr2[length] = i5;
                i5 += i9;
                if (i8 >= 0) {
                    length = i8;
                } else {
                    return;
                }
            }
        }
    }

    public final void j(int i2, int[] iArr, int[] iArr2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5e8d92a", new Object[]{this, new Integer(i2), iArr, iArr2, new Boolean(z)});
            return;
        }
        ckf.g(iArr, "size");
        ckf.g(iArr2, "outPosition");
        if (iArr.length != 0) {
            int i3 = 0;
            for (int i4 : iArr) {
                i3 += i4;
            }
            float max = (i2 - i3) / Math.max(ic1.I(iArr), 1);
            float f2 = (!z || iArr.length != 1) ? 0.0f : max;
            if (!z) {
                float f3 = f2;
                int i5 = 0;
                for (int i6 : iArr) {
                    i5++;
                    iArr2[i5] = iai.d(f3);
                    f3 += i6 + max;
                }
                return;
            }
            int length = iArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i7 = length - 1;
                    int i8 = iArr[length];
                    iArr2[length] = iai.d(f2);
                    f2 += i8 + max;
                    if (i7 >= 0) {
                        length = i7;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void k(int i2, int[] iArr, int[] iArr2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff1d3467", new Object[]{this, new Integer(i2), iArr, iArr2, new Boolean(z)});
            return;
        }
        ckf.g(iArr, "size");
        ckf.g(iArr2, "outPosition");
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float length = (i2 - i3) / (iArr.length + 1);
        if (!z) {
            float f2 = length;
            int i5 = 0;
            for (int i6 : iArr) {
                i5++;
                iArr2[i5] = iai.d(f2);
                f2 += i6 + length;
            }
            return;
        }
        int length2 = iArr.length - 1;
        if (length2 >= 0) {
            float f3 = length;
            while (true) {
                int i7 = length2 - 1;
                int i8 = iArr[length2];
                iArr2[length2] = iai.d(f3);
                f3 += i8 + length;
                if (i7 >= 0) {
                    length2 = i7;
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i2, int[] iArr, int[] iArr2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c0f51dd", new Object[]{this, new Integer(i2), iArr, iArr2, new Boolean(z)});
            return;
        }
        ckf.g(iArr, "size");
        ckf.g(iArr2, "outPosition");
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float f2 = (i2 - i3) / 2;
        if (!z) {
            int i5 = 0;
            for (int i6 : iArr) {
                i5++;
                iArr2[i5] = iai.d(f2);
                f2 += i6;
            }
            return;
        }
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i7 = length - 1;
                int i8 = iArr[length];
                iArr2[length] = iai.d(f2);
                f2 += i8;
                if (i7 >= 0) {
                    length = i7;
                } else {
                    return;
                }
            }
        }
    }

    public final void i(int i2, int[] iArr, int[] iArr2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e29308d", new Object[]{this, new Integer(i2), iArr, iArr2, new Boolean(z)});
            return;
        }
        ckf.g(iArr, "size");
        ckf.g(iArr2, "outPosition");
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float length = !(iArr.length == 0) ? (i2 - i3) / iArr.length : 0.0f;
        float f2 = length / 2;
        if (!z) {
            int i5 = 0;
            for (int i6 : iArr) {
                i5++;
                iArr2[i5] = iai.d(f2);
                f2 += i6 + length;
            }
            return;
        }
        int length2 = iArr.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i7 = length2 - 1;
                int i8 = iArr[length2];
                iArr2[length2] = iai.d(f2);
                f2 += i8 + length;
                if (i7 >= 0) {
                    length2 = i7;
                } else {
                    return;
                }
            }
        }
    }
}
