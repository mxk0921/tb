package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class c40 implements cce {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989855917);
        t2o.a(989855920);
    }

    @Override // tb.cce
    public void onProperty(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1991a501", new Object[]{this, str, obj});
        }
    }

    @Override // tb.cce
    public final void onPropertyIfAbsent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("564eb9d7", new Object[]{this, str, obj});
        } else {
            onProperty(str, obj);
        }
    }

    @Override // tb.cce
    public void onStage(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ba4fb14", new Object[]{this, str, new Long(j)});
        }
    }

    @Override // tb.cce
    public final void onStageIfAbsent(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da2a227e", new Object[]{this, str, new Long(j)});
        } else {
            onStage(str, j);
        }
    }
}
