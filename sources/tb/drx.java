package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class drx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f18034a;
    public static final AtomicBoolean b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class a implements u5h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.u5h
        public void onLoadFinished(l6h l6hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3924ed3", new Object[]{this, l6hVar});
            } else {
                drx.b.set(l6hVar.i());
            }
        }
    }

    static {
        try {
            IpChange ipChange = bzn.$ipChange;
            f18034a = true;
            b = new AtomicBoolean(false);
        } catch (ClassNotFoundException unused) {
            f18034a = false;
        }
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2c6ddc1c", new Object[0]);
        }
        if (!f18034a) {
            return null;
        }
        b79 d = bzn.b().d("zstd");
        if (d.i()) {
            return d.d();
        }
        return null;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52d16a4", new Object[0])).booleanValue();
        }
        if (!f18034a) {
            return true;
        }
        AtomicBoolean atomicBoolean = b;
        if (!atomicBoolean.get()) {
            bzn.d().a("zstd", new a());
        }
        return atomicBoolean.get();
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6def6671", new Object[0])).booleanValue();
        }
        try {
            if (f18034a) {
                AtomicBoolean atomicBoolean = b;
                if (!atomicBoolean.get()) {
                    atomicBoolean.set(bzn.d().load("zstd").i());
                }
                return atomicBoolean.get();
            }
            System.loadLibrary("zstd");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
