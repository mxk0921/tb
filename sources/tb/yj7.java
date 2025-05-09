package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class yj7 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InputStream f32125a;

    public yj7(InputStream inputStream) {
        this.f32125a = inputStream;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (this.f32125a != null) {
            do {
                try {
                } catch (IOException unused) {
                } catch (Throwable th) {
                    try {
                        this.f32125a.close();
                    } catch (Exception unused2) {
                    }
                    throw th;
                }
            } while (this.f32125a.read(new byte[256]) > 0);
            try {
                this.f32125a.close();
            } catch (Exception unused3) {
            }
        }
    }
}
