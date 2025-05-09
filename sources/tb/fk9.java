package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class fk9 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private View f19353a;
    private Object b;
    private String c;
    private String d;

    static {
        t2o.a(729809226);
    }

    public fk9(View view, Object obj, String str, String str2) {
        this.f19353a = view;
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
            str = ((Integer) obj).toString();
        } else {
            str = null;
        }
        cqv.C(this.d, this.c, str, this.f19353a, new String[0]);
    }
}
