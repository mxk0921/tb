package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.themis.graphics.audio.AudioContextProxy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class rhb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f27383a;

    public final void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46755fdc", new Object[]{this, new Long(j)});
        } else {
            this.f27383a = j;
        }
    }

    public abstract void b();

    public final void c(String str, JSONObject jSONObject) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63f0e3fb", new Object[]{this, str, jSONObject});
            return;
        }
        long j = this.f27383a;
        if (j >= 0) {
            if (jSONObject == null) {
                str2 = "";
            } else {
                str2 = jSONObject.toString();
            }
            AudioContextProxy.nativeFireEvent(j, str, str2);
        }
    }

    public abstract int d();

    public abstract float e();

    public abstract float f();

    public abstract boolean g();

    public abstract void h();

    public abstract void i();

    public abstract void j(int i);

    public abstract boolean k(boolean z);

    public abstract boolean l(boolean z);

    public abstract boolean m(boolean z);

    public abstract boolean n(boolean z);

    public abstract boolean o(String str);

    public abstract boolean p(int i);

    public abstract boolean q(float f);

    public abstract void r();
}
