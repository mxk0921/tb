package tb;

import android.content.Context;
import android.os.PowerManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.minutes.collector.MTSEnvMonitor;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class m04 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f23684a;
    public Boolean b;
    public Integer c;

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a0bf4892", new Object[]{this})).intValue();
        }
        if (this.c == null) {
            this.c = Integer.valueOf(MTSEnvMonitor.n().l());
        }
        return this.c.intValue();
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("89e64461", new Object[]{this});
        }
        if (this.f23684a == null) {
            this.f23684a = pth.b();
        }
        return this.f23684a;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23409f29", new Object[]{this})).booleanValue();
        }
        if (this.b == null) {
            this.b = Boolean.valueOf(d(Globals.getApplication()));
        }
        return this.b.booleanValue();
    }

    public final boolean d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c677d047", new Object[]{this, context})).booleanValue();
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        return powerManager != null && powerManager.isPowerSaveMode();
    }
}
