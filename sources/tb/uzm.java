package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class uzm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f29700a;

    static {
        t2o.a(768606229);
    }

    public uzm(Context context) {
        this.f29700a = context;
    }

    public static boolean b(Context context, qzm qzmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2099509", new Object[]{context, qzmVar})).booleanValue();
        }
        return new uzm(context).a(qzmVar);
    }

    public final boolean a(qzm qzmVar) {
        IOException e;
        BufferedOutputStream bufferedOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9475c9a", new Object[]{this, qzmVar})).booleanValue();
        }
        FileOutputStream fileOutputStream = null;
        try {
            vhh.a("ProfileInstaller", "Install profile, length=" + qzmVar.f27022a.length);
            String str = "/data/misc/profiles/cur/0/" + this.f29700a.getPackageName() + "/primary.prof";
            vhh.a("ProfileInstaller", "Install to destination=".concat(str));
            FileOutputStream fileOutputStream2 = new FileOutputStream(str);
            try {
                bufferedOutputStream = new BufferedOutputStream(fileOutputStream2);
                try {
                    bufferedOutputStream.write(qzmVar.f27022a);
                    bufferedOutputStream.flush();
                    vhh.a("ProfileInstaller", "Profile installed success!");
                    g1d.a(fileOutputStream2);
                    g1d.a(bufferedOutputStream);
                    return true;
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    try {
                        vhh.a("ProfileInstaller", "Install profile failed:" + e.getMessage());
                        g1d.a(fileOutputStream);
                        g1d.a(bufferedOutputStream);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        g1d.a(fileOutputStream);
                        g1d.a(bufferedOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    g1d.a(fileOutputStream);
                    g1d.a(bufferedOutputStream);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                bufferedOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream = null;
            }
        } catch (IOException e4) {
            e = e4;
            bufferedOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            bufferedOutputStream = null;
        }
    }
}
