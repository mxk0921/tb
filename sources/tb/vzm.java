package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import java.io.DataInputStream;
import java.io.FileInputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class vzm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f30369a;

    static {
        t2o.a(768606230);
    }

    public vzm(Context context) {
        this.f30369a = context;
    }

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9debcf10", new Object[]{new Integer(i)});
        }
        vhh.a("ProfileLoader", "Decide profile name for sdk int: " + i);
        if (i >= 31) {
            return "primaryS.prof";
        }
        if (i >= 28) {
            return "primary.prof";
        }
        if (i >= 27) {
            return "primary81.prof";
        }
        if (i >= 26) {
            return "primary80.prof";
        }
        if (i >= 24) {
            return "primary7.prof";
        }
        vhh.a("ProfileLoader", "Unsupported sdk int: " + i);
        return null;
    }

    public static int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22d5c833", new Object[]{new Integer(i)})).intValue();
        }
        vhh.a("ProfileLoader", "Decide profile source for sdk int: " + i);
        if (i <= 27) {
            return 1;
        }
        return 0;
    }

    public static qzm d(Context context, String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qzm) ipChange.ipc$dispatch("5bb42bf0", new Object[]{context, str, new Integer(i), new Integer(i2)});
        }
        return new vzm(context).c(str, i, i2);
    }

    public final qzm c(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qzm) ipChange.ipc$dispatch("57a15cbf", new Object[]{this, str, new Integer(i), new Integer(i2)});
        }
        String a2 = a(i2);
        if (a2 == null) {
            return null;
        }
        int b = b(i2);
        vhh.a("ProfileLoader", "Decided profile name for sdk int: " + i2 + " is " + a2 + " from " + b);
        return e(str, i, a2, b);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.Closeable, tb.qzm, byte[]] */
    public final qzm e(String str, int i, String str2, int i2) {
        DataInputStream dataInputStream;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qzm) ipChange.ipc$dispatch("bba91f30", new Object[]{this, str, new Integer(i), str2, new Integer(i2)});
        }
        DataInputStream dataInputStream2 = 0;
        try {
            if (i2 == 1) {
                b79 d = bzn.b().d(str2);
                if (!d.i()) {
                    vhh.a("ProfileLoader", "Fetch profile fail " + d.c());
                    return dataInputStream2;
                }
                dataInputStream = new FileInputStream(d.d());
            } else {
                dataInputStream = AssetsDelegate.proxy_open(this.f30369a.getAssets(), str2);
            }
            try {
                dataInputStream2 = new DataInputStream(dataInputStream);
            } catch (Throwable th2) {
                th = th2;
                dataInputStream2 = dataInputStream2;
            }
        } catch (Throwable th3) {
            th = th3;
            dataInputStream2 = dataInputStream2;
            dataInputStream = dataInputStream2;
        }
        try {
            int available = dataInputStream2.available();
            int readInt = dataInputStream2.readInt();
            byte[] bArr = new byte[readInt];
            if (dataInputStream2.read(bArr, 0, readInt) > 0) {
                String str3 = new String(bArr);
                int readInt2 = dataInputStream2.readInt();
                vhh.a("ProfileLoader", "Profile version=" + str3 + f7l.BRACKET_START_STR + readInt2 + f7l.BRACKET_END_STR);
                if (TextUtils.equals(str, str3) && i == readInt2) {
                    int i3 = (available - 8) - readInt;
                    byte[] bArr2 = new byte[i3];
                    if (dataInputStream2.read(bArr2, 0, i3) > 0) {
                        return new qzm(str3, readInt2, bArr2);
                    }
                }
                vhh.a("ProfileLoader", str + f7l.BRACKET_START_STR + i + ") != " + str3 + f7l.BRACKET_START_STR + readInt2 + f7l.BRACKET_END_STR);
                return new qzm(str3, readInt2, dataInputStream2);
            }
        } catch (Throwable th4) {
            th = th4;
            try {
                th.printStackTrace();
                return dataInputStream2;
            } finally {
                g1d.a(dataInputStream);
                g1d.a(dataInputStream2);
            }
        }
        return dataInputStream2;
    }
}
