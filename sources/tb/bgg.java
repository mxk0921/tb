package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class bgg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final File f16370a;

    public bgg(File file) {
        File file2;
        if (file != null) {
            try {
                file2 = new File(file, "anr.idle");
            } catch (Exception e) {
                ehh.d(e);
                return;
            }
        } else {
            file2 = null;
        }
        this.f16370a = file2;
    }

    public static bgg b(x0s x0sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bgg) ipChange.ipc$dispatch("3b8027ea", new Object[]{x0sVar});
        }
        if (o1r.a(x0sVar.g()).b("closeIdleCheck", false)) {
            return new bgg(null);
        }
        String h = x0sVar.h();
        try {
            Application g = x0sVar.g();
            File dir = g.getDir("anr_" + h, 0);
            if (!dir.exists()) {
                dir.mkdir();
            }
            return new bgg(dir);
        } catch (Exception e) {
            ehh.d(e);
            return new bgg(null);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d73a37c8", new Object[]{this});
            return;
        }
        try {
            File file = this.f16370a;
            if (file != null && file.exists()) {
                this.f16370a.delete();
            }
        } catch (Exception e) {
            ehh.d(e);
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3f261a9", new Object[]{this})).booleanValue();
        }
        try {
            File file = this.f16370a;
            if (file != null) {
                return file.exists();
            }
        } catch (Exception e) {
            ehh.d(e);
        }
        return false;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52125669", new Object[]{this});
            return;
        }
        try {
            File file = this.f16370a;
            if (file != null && !file.exists()) {
                this.f16370a.createNewFile();
            }
        } catch (Exception e) {
            ehh.d(e);
        }
    }
}
