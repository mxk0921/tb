package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class oxa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static oxa f25722a = null;

    static {
        t2o.a(404750479);
    }

    public oxa() {
        vxa.j(f82.d(), f82.g());
    }

    public static oxa a() {
        oxa oxaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oxa) ipChange.ipc$dispatch("20926108", new Object[0]);
        }
        oxa oxaVar2 = f25722a;
        if (oxaVar2 != null) {
            return oxaVar2;
        }
        synchronized (oxa.class) {
            try {
                if (f25722a == null) {
                    f25722a = new oxa();
                }
                oxaVar = f25722a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oxaVar;
    }

    public void b(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea8e009b", new Object[]{this, str, jSONObject});
            return;
        }
        pxa c = vxa.c();
        if (c != null && !TextUtils.isEmpty(str) && jSONObject != null) {
            c.c(str, jSONObject);
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("481436ee", new Object[]{this, str});
            return;
        }
        pxa c = vxa.c();
        if (c != null && !TextUtils.isEmpty(str)) {
            c.a(str);
        }
    }

    public void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92dec138", new Object[]{this, str, str2});
            return;
        }
        pxa c = vxa.c();
        if (c != null && !TextUtils.isEmpty(str)) {
            c.d(str, str2);
        }
    }
}
