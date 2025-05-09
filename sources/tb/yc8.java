package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class yc8 implements dgd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.dgd
    public dbn a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dbn) ipChange.ipc$dispatch("7be8c776", new Object[]{this});
        }
        return kc8.sFallbackFetcher;
    }

    @Override // tb.dgd
    public lid b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lid) ipChange.ipc$dispatch("2077322", new Object[]{this});
        }
        return ad8.INSTANCE;
    }

    @Override // tb.dgd
    public hbn c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hbn) ipChange.ipc$dispatch("88ace186", new Object[]{this});
        }
        return qc8.sFallbackLoader;
    }
}
