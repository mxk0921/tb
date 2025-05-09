package tb;

import android.taobao.windvane.jsbridge.IJsApiFailedCallBack;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class ptn implements IJsApiFailedCallBack {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g1a f26296a;

    public ptn(g1a g1aVar) {
        this.f26296a = g1aVar;
    }

    @Override // android.taobao.windvane.jsbridge.IJsApiFailedCallBack
    public final void fail(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("534fc72f", new Object[]{this, str});
        } else {
            this.f26296a.invoke(null);
        }
    }
}
