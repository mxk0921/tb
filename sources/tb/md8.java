package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.scancode.encode.aidlservice.BusinessBinder;
import com.taobao.taobao.scancode.encode.aidlservice.EncodeCallback;
import com.taobao.taobao.scancode.encode.aidlservice.MaSizeType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class md8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static md8 f23969a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public String f23970a;
        public String b;
        public int c;
        public MaSizeType d;
        public boolean e;
        public EncodeCallback f;

        static {
            t2o.a(656408586);
        }
    }

    static {
        t2o.a(656408585);
    }

    public md8(Context context) {
    }

    public static md8 c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (md8) ipChange.ipc$dispatch("9b39df37", new Object[]{context});
        }
        if (f23969a == null) {
            f23969a = new md8(context);
        }
        return f23969a;
    }

    public void a(String str, String str2, int i, MaSizeType maSizeType, boolean z, EncodeCallback encodeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d7b85b6", new Object[]{this, str, str2, new Integer(i), maSizeType, new Boolean(z), encodeCallback});
            return;
        }
        a aVar = new a();
        aVar.f23970a = str;
        aVar.b = str2;
        aVar.f = encodeCallback;
        aVar.d = maSizeType;
        aVar.c = i;
        aVar.e = z;
        b(aVar);
    }

    public boolean b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6b3a5cb", new Object[]{this, aVar})).booleanValue();
        }
        if (aVar == null) {
            return false;
        }
        try {
            new BusinessBinder().encode(aVar.f23970a, aVar.b, aVar.c, aVar.d, aVar.e, aVar.f);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
