package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class aaq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Boolean f15631a;

    static {
        t2o.a(654311461);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e81159f3", new Object[]{this})).booleanValue();
        }
        if (this.f15631a == null) {
            try {
                Class.forName(OrangeConfig.class.getName());
                this.f15631a = Boolean.TRUE;
            } catch (Throwable unused) {
                this.f15631a = Boolean.FALSE;
            }
        }
        return this.f15631a.booleanValue();
    }
}
