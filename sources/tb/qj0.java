package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class qj0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static qj0 c;

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f26778a;
    public final SharedPreferences.Editor b;

    static {
        t2o.a(665845814);
    }

    public qj0(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("clip_share_album_sp", 0);
        this.f26778a = sharedPreferences;
        this.b = sharedPreferences.edit();
    }

    public static qj0 a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qj0) ipChange.ipc$dispatch("5b49bb69", new Object[]{context});
        }
        if (c == null) {
            c = new qj0(context);
        }
        return c;
    }

    public String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2625cc8c", new Object[]{this, str, str2});
        }
        return this.f26778a.getString(str, str2);
    }

    public void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb567a1b", new Object[]{this, str, str2});
            return;
        }
        this.b.putString(str, str2);
        this.b.apply();
    }
}
