package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class gk9 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private View f20053a;
    private Object b;
    private String c;
    private String d;

    static {
        t2o.a(486539725);
    }

    public gk9(View view, Object obj, String str, String str2) {
        this.f20053a = view;
        this.b = obj;
        this.c = str2;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        Object obj = this.b;
        if (obj instanceof String) {
            str = (String) obj;
        } else if (obj instanceof Integer) {
            str = obj.toString();
        } else {
            str = null;
        }
        gue.b(this.d, this.c, str, this.f20053a, null);
    }
}
