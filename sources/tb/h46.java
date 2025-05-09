package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class h46 implements dwb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10fca958", new Object[]{this, str, obj});
        } else {
            rf2.c().a(str, obj);
        }
    }
}
