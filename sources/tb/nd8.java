package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.scancode.encode.aidlservice.BusinessBinder;
import com.taobao.taobao.scancode.encode.aidlservice.EncodeCallback;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class nd8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ERROR = 4;
    public static final int INITIALIZED = 2;
    public static final int INITIALIZING = 1;
    public static final int UNINITIALIZED = 0;

    /* renamed from: a  reason: collision with root package name */
    public static nd8 f24657a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f24658a;
        public byte[] b;
        public int c;
        public int d;
        public String e;
        public int f;
        public int g;
        public int h;
        public char i;
        public int j;
        public EncodeCallback k;
        public int l;

        static {
            t2o.a(656408588);
        }
    }

    static {
        t2o.a(656408587);
    }

    public nd8(Context context) {
    }

    public static nd8 c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nd8) ipChange.ipc$dispatch("cc0206cd", new Object[]{context});
        }
        if (f24657a == null) {
            f24657a = new nd8(context);
        }
        return f24657a;
    }

    public void a(int i, byte[] bArr, int i2, int i3, String str, int i4, int i5, int i6, char c, int i7, EncodeCallback encodeCallback, int i8) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("921c089", new Object[]{this, new Integer(i), bArr, new Integer(i2), new Integer(i3), str, new Integer(i4), new Integer(i5), new Integer(i6), new Character(c), new Integer(i7), encodeCallback, new Integer(i8)});
            return;
        }
        a aVar = new a();
        aVar.f24658a = i;
        aVar.b = bArr;
        aVar.c = i2;
        aVar.d = i3;
        aVar.e = str;
        aVar.f = i4;
        aVar.g = i5;
        aVar.h = i6;
        aVar.i = c;
        aVar.j = i7;
        aVar.k = encodeCallback;
        aVar.l = i8;
        b(aVar);
    }

    public boolean b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eba00b45", new Object[]{this, aVar})).booleanValue();
        }
        if (aVar == null) {
            return false;
        }
        try {
            new BusinessBinder().encodeMa3(aVar.f24658a, aVar.b, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g, aVar.h, aVar.i, aVar.j, aVar.k, aVar.l);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
