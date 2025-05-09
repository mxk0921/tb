package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class dxu implements b4e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final b4e f18141a = new dxu();
    public static final boolean b = true;

    static {
        t2o.a(79692001);
        t2o.a(79692000);
    }

    public static b4e a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b4e) ipChange.ipc$dispatch("98fc8c1c", new Object[0]);
        }
        return f18141a;
    }

    @Override // tb.b4e
    public void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{this, str, str2});
        } else if (b) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("#");
            sb.append(str2);
        }
    }

    @Override // tb.b4e
    public void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{this, str, str2});
        } else if (b) {
            Log.e("#UMF_LOGGER#", str + "#" + str2);
        }
    }

    @Override // tb.b4e
    public void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e38e584", new Object[]{this, str, str2});
        } else if (b) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("#");
            sb.append(str2);
        }
    }
}
