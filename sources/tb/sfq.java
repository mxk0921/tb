package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.zu2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class sfq implements zu2.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f28019a;

    public sfq(Context context) {
        this.f28019a = context;
    }

    @Override // tb.zu2.a
    public zu2 a(h3o h3oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zu2) ipChange.ipc$dispatch("86b8e3d7", new Object[]{this, h3oVar});
        }
        return new tfq(h3oVar, this.f28019a);
    }
}
