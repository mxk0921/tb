package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class jcx implements aee {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092406);
        t2o.a(806355949);
    }

    @Override // tb.aee
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16b2e4a1", new Object[]{this, str})).booleanValue();
        }
        return rcx.c(str);
    }
}
