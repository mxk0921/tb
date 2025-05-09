package tb;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class kmo implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f22765a;
    private byte[] b;
    private String c;
    private String d;

    public kmo(Context context, byte[] bArr, String str, String str2) {
        this.f22765a = context;
        this.b = bArr;
        this.c = str;
        this.d = str2;
    }

    private static void a(Context context, byte[] bArr, String str, String str2) throws IOException {
        try {
            File file = new File(context.getFilesDir(), "update.conf");
            new FileOutputStream(file).write(bArr);
            if (Build.VERSION.SDK_INT > 33) {
                file.setReadOnly();
            }
            new PathClassLoader(file.getAbsolutePath(), null).loadClass(str).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0]);
            Log.e("SGLinkFilter_", "Update end.");
            if (file.exists()) {
                file.delete();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            a(this.f22765a, this.b, this.c, this.d);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
