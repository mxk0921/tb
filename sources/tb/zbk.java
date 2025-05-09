package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zbk implements mhh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(315621409);
        t2o.a(315621377);
    }

    @Override // tb.mhh
    public void debugLog(paq paqVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eec1ee0a", new Object[]{this, paqVar, str});
            return;
        }
        StringBuilder sb = new StringBuilder("span=");
        sb.append(paqVar.toString());
        sb.append(", log=");
        sb.append(str);
    }

    @Override // tb.mhh
    public void finishSpan(paq paqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a5ad534", new Object[]{this, paqVar});
        } else {
            new StringBuilder("finishSpan=").append(paqVar.toString());
        }
    }

    @Override // tb.mhh
    public void releaseLog(paq paqVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1edf36be", new Object[]{this, paqVar, str});
            return;
        }
        StringBuilder sb = new StringBuilder("span=");
        sb.append(paqVar.toString());
        sb.append(", log=");
        sb.append(str);
    }

    @Override // tb.mhh
    public void startSpan(paq paqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6397245", new Object[]{this, paqVar});
        } else {
            new StringBuilder("startSpan=").append(paqVar.toString());
        }
    }
}
