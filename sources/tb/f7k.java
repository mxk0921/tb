package tb;

import android.os.Message;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.dispatch.Dispatchers;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class f7k implements xq7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Message f19075a;
    public final String b;
    public boolean c = false;

    public f7k(Message message, String str) {
        this.f19075a = message;
        this.b = str;
        Dispatchers.a("Impl", "NormalDispatcher");
    }

    @Override // tb.xq7
    public boolean a(rij rijVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcfe75cf", new Object[]{this, rijVar})).booleanValue();
        }
        return false;
    }

    @Override // tb.xq7
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b183fc05", new Object[]{this})).booleanValue();
        }
        if (this.c) {
            return false;
        }
        i7n.c(this.b, this.f19075a);
        this.c = true;
        return handleMessage(this.f19075a);
    }

    @Override // tb.xq7
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aafb874c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.xq7
    public String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.xq7
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        Dispatchers.g("NormalDispatcher", this, message);
        return true;
    }
}
