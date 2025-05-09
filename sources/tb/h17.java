package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class h17 implements dy9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806355040);
        t2o.a(806355041);
    }

    @Override // tb.dy9
    public void a(BaseFrame baseFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddd18a28", new Object[]{this, baseFrame});
        }
    }

    @Override // tb.dy9
    public void b(BaseFrame baseFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44c6963a", new Object[]{this, baseFrame});
        }
    }
}
