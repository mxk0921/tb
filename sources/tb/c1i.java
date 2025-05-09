package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class c1i implements ob4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d1i f16772a;

    public c1i(d1i d1iVar) {
        this.f16772a = d1iVar;
    }

    public nb4 a(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nb4) ipChange.ipc$dispatch("6c52adc9", new Object[]{this, strArr});
        }
        if (d1i.s(this.f16772a).isEmpty() || strArr == null || strArr.length <= 0) {
            return null;
        }
        return (nb4) d1i.s(this.f16772a).get(strArr[0]);
    }
}
