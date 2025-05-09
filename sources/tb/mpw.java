package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class mpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static mpw b;

    /* renamed from: a  reason: collision with root package name */
    public boolean f24225a;

    static {
        t2o.a(989855785);
    }

    public static mpw a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mpw) ipChange.ipc$dispatch("e94db0b5", new Object[0]);
        }
        if (b == null) {
            synchronized (mpw.class) {
                try {
                    if (b == null) {
                        b = new mpw();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("474e927d", new Object[]{this})).booleanValue();
        }
        return this.f24225a;
    }

    public void c(lpw lpwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bd95fff", new Object[]{this, lpwVar});
        } else if (lpwVar != null && !TextUtils.isEmpty(lpwVar.c) && !TextUtils.isEmpty(lpwVar.e)) {
            this.f24225a = true;
        }
    }
}
