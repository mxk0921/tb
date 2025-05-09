package tb;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ek7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f18637a = {-1};
    public static final IBinder[] b = {null};

    static {
        t2o.a(989855817);
        t2o.a(989855818);
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be42c9af", new Object[0])).intValue();
        }
        int[] iArr = f18637a;
        int i = iArr[0];
        if (i != -1) {
            return i;
        }
        try {
            iArr[0] = ((Integer) adk.i(Class.forName("android.content.pm.IPackageManager$Stub")).b("TRANSACTION_performDexOptSecondary").h()).intValue();
        } catch (Exception e) {
            wgh.a("DexOptimizerNew", "getTransactionCode failed: " + e.getMessage());
        }
        return f18637a[0];
    }

    public void c(Context context, File file, bk7 bk7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("569b9e09", new Object[]{this, context, file, bk7Var});
            return;
        }
        int b2 = b();
        if (b2 == -1) {
            bk7Var.onFailed(file, "failed to get transactionCode");
        } else {
            d(context, file, b2, bk7Var);
        }
    }

    public static IBinder a() throws IllegalStateException {
        IBinder[] iBinderArr = b;
        synchronized (iBinderArr) {
            IBinder iBinder = iBinderArr[0];
            if (iBinder != null && iBinder.isBinderAlive()) {
                return iBinder;
            }
            IBinder iBinder2 = (IBinder) cun.a(Class.forName("android.os.ServiceManager"), "getService", String.class).invoke(null, "package");
            iBinderArr[0] = iBinder2;
            return iBinder2;
        }
    }

    public static void d(Context context, File file, int i, bk7 bk7Var) {
        Throwable th;
        Parcel parcel;
        Exception e;
        Parcel obtain;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cacbf3fc", new Object[]{context, file, new Integer(i), bk7Var});
            return;
        }
        wgh.a("DexOptimizerNew", "performDexOpt, code: " + i);
        IBinder a2 = a();
        if (a2 == null) {
            bk7Var.onFailed(file, "pmsBinder is null");
            return;
        }
        Parcel parcel2 = null;
        try {
            try {
                parcel = Parcel.obtain();
                try {
                    obtain = Parcel.obtain();
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                parcel.writeInterfaceToken(a2.getInterfaceDescriptor());
                parcel.writeString(context.getPackageName());
                parcel.writeString("speed-profile");
                parcel.writeInt(1);
            } catch (Exception e3) {
                e = e3;
                parcel2 = obtain;
                String str = "Exception during dex optimization" + e.getMessage();
                wgh.a("DexOptimizerNew", str);
                bk7Var.onFailed(file, str);
                if (parcel2 != null) {
                    parcel2.recycle();
                }
                if (parcel == null) {
                    return;
                }
                parcel.recycle();
            } catch (Throwable th3) {
                th = th3;
                parcel2 = obtain;
                if (parcel2 != null) {
                    parcel2.recycle();
                }
                if (parcel != null) {
                    parcel.recycle();
                }
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            parcel = null;
        } catch (Throwable th4) {
            th = th4;
            parcel = null;
        }
        if (!a2.transact(i, parcel, obtain, 0)) {
            bk7Var.onFailed(file, "Binder transaction failure.");
            if (obtain != null) {
                obtain.recycle();
            }
            parcel.recycle();
            return;
        }
        obtain.readException();
        int readInt = obtain.readInt();
        if (readInt != 0) {
            bk7Var.onSuccess(file, null);
        } else {
            String str2 = "[!] System API returned false, returnCode: " + readInt;
            wgh.a("DexOptimizerNew", str2);
            bk7Var.onFailed(file, str2);
        }
        obtain.recycle();
        parcel.recycle();
    }
}
