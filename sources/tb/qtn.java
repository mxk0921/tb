package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class qtn implements r4c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g1a f26928a;

    public qtn(g1a g1aVar) {
        this.f26928a = g1aVar;
    }

    @Override // tb.r4c
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("310f3b65", new Object[]{this, str});
        } else {
            ckf.g(str, rb.RESULT_KEY);
        }
    }

    @Override // android.taobao.windvane.jsbridge.IJsApiSucceedCallBack
    public void succeed(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5b77b53", new Object[]{this, str});
            return;
        }
        ckf.g(str, rb.RESULT_KEY);
        try {
            this.f26928a.invoke(JSON.parseObject(str));
        } catch (Exception unused) {
            this.f26928a.invoke(null);
        }
    }
}
