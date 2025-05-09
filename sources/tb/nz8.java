package tb;

import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.mz8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class nz8 implements mz8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements end {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ mz8.a f25044a;

        public a(nz8 nz8Var, mz8.a aVar) {
            this.f25044a = aVar;
        }

        @Override // tb.end
        public Map<String, String> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("703083e1", new Object[]{this});
            }
            return this.f25044a.a();
        }
    }

    @Override // tb.mz8
    public boolean a(String str, mz8.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14a321a2", new Object[]{this, str, aVar})).booleanValue();
        }
        try {
            return kxo.q().w(str, new a(this, aVar));
        } catch (Throwable th) {
            ALog.e("falco.ScreenshotMonitor", "registerListener error", null, th, new Object[0]);
            return false;
        }
    }

    @Override // tb.mz8
    public boolean unregisterListener(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1dfcfa5", new Object[]{this, str})).booleanValue();
        }
        try {
            return kxo.q().A(str);
        } catch (Throwable th) {
            ALog.e("falco.ScreenshotMonitor", "unregisterListener error", null, th, new Object[0]);
            return false;
        }
    }
}
