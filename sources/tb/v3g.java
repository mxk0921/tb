package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class v3g implements jpf<k3g> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String[] f29767a;
    public int b = 0;

    public v3g(String[] strArr) {
        this.f29767a = strArr;
    }

    /* renamed from: a */
    public k3g next() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k3g) ipChange.ipc$dispatch("54e78c48", new Object[]{this});
        }
        String[] strArr = this.f29767a;
        if (strArr == null || (i = this.b) >= strArr.length) {
            return null;
        }
        this.b = 1 + i;
        return new k3g(strArr[i]);
    }
}
