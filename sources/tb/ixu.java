package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ixu implements y3e<String, g4e> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ixu(hxu hxuVar) {
    }

    /* renamed from: b */
    public void a(String str, g4e g4eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bc3af58", new Object[]{this, str, g4eVar});
        } else {
            g4eVar.B();
        }
    }
}
