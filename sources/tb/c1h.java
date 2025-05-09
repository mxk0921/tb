package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.message_sdk.core.LiveMessageStatus;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class c1h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public LiveMessageStatus f16771a = LiveMessageStatus.unSubscribe;
    public final a1h b;
    public final String c;
    public int d;
    public String e;
    public String f;
    public String g;
    public final c0a h;

    public c1h(String str) {
        k6s.f22436a = nbl.p();
        this.c = str;
        a1h a1hVar = new a1h();
        this.b = a1hVar;
        this.h = new c0a(a1hVar.b);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b6a3f40", new Object[]{this})).booleanValue();
        }
        if (this.f16771a != LiveMessageStatus.unSubscribe) {
            return true;
        }
        return false;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("886dbb1c", new Object[]{this});
        } else {
            this.f16771a = LiveMessageStatus.stop;
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("111bbcb1", new Object[]{this});
        } else {
            this.f16771a = LiveMessageStatus.running;
        }
    }

    public void d(zqi zqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("417a7ade", new Object[]{this, zqiVar});
            return;
        }
        this.f16771a = LiveMessageStatus.running;
        this.d = zqiVar.f32948a;
        this.e = zqiVar.b;
        this.f = zqiVar.c;
        this.g = zqiVar.d;
    }

    public void e(zqi zqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94e2fc97", new Object[]{this, zqiVar});
        } else {
            this.f16771a = LiveMessageStatus.unSubscribe;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "LiveMessageContext{status=" + this.f16771a + ", config=" + this.b + ", deviceId='" + this.c + "', bizCode=" + this.d + ", topic='" + this.e + "', channel='" + this.f + "', from='" + this.g + "', powerMsgType=3}";
    }
}
