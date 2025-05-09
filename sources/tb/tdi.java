package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class tdi implements jsc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public tdi(sdi sdiVar) {
    }

    @Override // tb.jsc
    public void onPick(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcc46917", new Object[]{this, new Boolean(z), str});
        }
    }
}
