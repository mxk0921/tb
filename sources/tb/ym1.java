package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.bsdiff.Bsdiff;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ym1 implements urd<wli> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final b4d f32187a = (b4d) d62.a(b4d.class, new Object[0]);

    static {
        t2o.a(681574415);
        t2o.a(676331596);
    }

    @Override // tb.urd
    public void a(File file, File file2, wli wliVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d0f083", new Object[]{this, file, file2, wliVar});
        } else if (file == null || !file.exists() || !this.f32187a.a(file.getAbsolutePath()).equals(wliVar.e)) {
            wliVar.f30765a = false;
            wliVar.b = -100;
            wliVar.c = "baseFile is misMatch";
        } else if (file2 == null || !file2.exists()) {
            wliVar.f30765a = false;
            wliVar.b = -101;
            wliVar.c = "patchFile is not exit";
        } else {
            File file3 = wliVar.d;
            if (file3 == null || !file3.exists() || !this.f32187a.a(wliVar.d.getAbsolutePath()).equals(wliVar.f)) {
                try {
                    i = Bsdiff.patch(file.getAbsolutePath(), file2.getAbsolutePath(), wliVar.d.getAbsolutePath());
                } catch (Throwable unused) {
                    i = -1;
                }
                if (i != 0 || !wliVar.d.exists() || !this.f32187a.a(wliVar.d.getAbsolutePath()).equals(wliVar.f)) {
                    wliVar.f30765a = false;
                    wliVar.b = i;
                    wliVar.c = "native patch failed";
                    return;
                }
                wliVar.f30765a = true;
                file2.delete();
                return;
            }
            wliVar.f30765a = true;
        }
    }
}
