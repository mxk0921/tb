package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.scancode.encode.aidlservice.BusinessBinder;
import com.taobao.taobao.scancode.encode.aidlservice.DecodeCallback;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class lw6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static lw6 f23608a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f23609a;
        public byte[] b;
        public DecodeCallback c;

        static {
            t2o.a(656408581);
        }
    }

    static {
        t2o.a(656408580);
    }

    public lw6(Context context) {
    }

    public static lw6 c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lw6) ipChange.ipc$dispatch("8808c4a5", new Object[]{context});
        }
        if (f23608a == null) {
            f23608a = new lw6(context);
        }
        return f23608a;
    }

    public void a(byte[] bArr, int i, DecodeCallback decodeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c191ace1", new Object[]{this, bArr, new Integer(i), decodeCallback});
            return;
        }
        a aVar = new a();
        aVar.f23609a = i;
        aVar.b = bArr;
        aVar.c = decodeCallback;
        b(aVar);
    }

    public boolean b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b83ec547", new Object[]{this, aVar})).booleanValue();
        }
        if (aVar == null) {
            return false;
        }
        try {
            new BusinessBinder().decodeBitmap(aVar.b, aVar.f23609a, aVar.c);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
