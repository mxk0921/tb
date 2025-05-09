package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class sdf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a[] f27968a;
    public int b;
    public int c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f27969a;
        public final int b;
        public Object c;
        public a d;

        static {
            t2o.a(775946265);
        }

        public a(int i, int i2, Object obj, a aVar) {
            this.f27969a = i;
            this.b = i2;
            this.c = obj;
            this.d = aVar;
        }
    }

    static {
        t2o.a(775946264);
    }

    public sdf() {
        this(16, 0.75f);
    }

    public Object a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("bb5c862c", new Object[]{this, new Integer(i)});
        }
        a[] aVarArr = this.f27968a;
        for (a aVar = aVarArr[(Integer.MAX_VALUE & i) % aVarArr.length]; aVar != null; aVar = aVar.d) {
            if (aVar.f27969a == i) {
                return aVar.c;
            }
        }
        return null;
    }

    public int[] b() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("bc1b77c9", new Object[]{this});
        }
        int i2 = this.b;
        if (i2 == 0) {
            return new int[0];
        }
        int[] iArr = new int[i2];
        int i3 = 0;
        while (true) {
            a[] aVarArr = this.f27968a;
            if (i >= aVarArr.length) {
                return iArr;
            }
            a aVar = aVarArr[i];
            while (aVar != null) {
                iArr[i3] = aVar.b;
                aVar = aVar.d;
                i3++;
            }
            i++;
        }
    }

    public Object c(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("78b6f609", new Object[]{this, new Integer(i), obj});
        }
        a[] aVarArr = this.f27968a;
        int i2 = Integer.MAX_VALUE & i;
        int length = i2 % aVarArr.length;
        for (a aVar = aVarArr[length]; aVar != null; aVar = aVar.d) {
            if (aVar.f27969a == i) {
                Object obj2 = aVar.c;
                aVar.c = obj;
                return obj2;
            }
        }
        if (this.b >= this.c) {
            d();
            aVarArr = this.f27968a;
            length = i2 % aVarArr.length;
        }
        aVarArr[length] = new a(i, i, obj, aVarArr[length]);
        this.b++;
        return null;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("507739c8", new Object[]{this});
            return;
        }
        a[] aVarArr = this.f27968a;
        int length = aVarArr.length;
        int i = length * 2;
        a[] aVarArr2 = new a[i];
        this.c = (int) (i * 0.75f);
        this.f27968a = aVarArr2;
        while (true) {
            int i2 = length - 1;
            if (length > 0) {
                a aVar = aVarArr[i2];
                while (aVar != null) {
                    a aVar2 = aVar.d;
                    int i3 = (aVar.f27969a & Integer.MAX_VALUE) % i;
                    aVar.d = aVarArr2[i3];
                    aVarArr2[i3] = aVar;
                    aVar = aVar2;
                }
                length = i2;
            } else {
                return;
            }
        }
    }

    public sdf(int i, float f) {
        if (i >= 0) {
            i = i > 1073741824 ? 1073741824 : i;
            if (f > 0.0f) {
                int i2 = 1;
                while (i2 < i) {
                    i2 <<= 1;
                }
                this.f27968a = new a[i2];
                this.c = (int) (i2 * f);
                return;
            }
            throw new IllegalArgumentException("Illegal Load: " + f);
        }
        throw new IllegalArgumentException("Illegal Capacity: " + i);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuffer stringBuffer = new StringBuffer("{");
        int[] b = b();
        for (int i = 0; i < b.length; i++) {
            int i2 = b[i];
            Object a2 = a(i2);
            if (i > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(i2);
            stringBuffer.append('=');
            if (a2 == this) {
                a2 = "(this Map)";
            }
            stringBuffer.append(a2);
        }
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
