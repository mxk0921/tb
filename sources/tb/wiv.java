package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class wiv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String b = wiv.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public int f30725a = 0;

    static {
        t2o.a(779093463);
    }

    public final String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("619ce96c", new Object[]{this, new Integer(i)});
        }
        if (i == 0) {
            return "STATE_INIT";
        }
        if (i == 1) {
            return "STATE_ON_WILL_APPEAR";
        }
        if (i == 2) {
            return "STATE_ON_DID_APPEAR";
        }
        if (i != 3) {
            return "";
        }
        return "STATE_ON_WILL_DISAPPEAR";
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f731456c", new Object[]{this, str});
            return;
        }
        String str2 = b;
        o3s.b(str2, "onDestroy viewHolder liveId = " + str);
        this.f30725a = 4;
    }

    public final void g(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("785b128", new Object[]{this, str, new Integer(i), str2});
            return;
        }
        String str3 = b;
        x5t.h(str3, "ViewHolder lifeCycle reportError curState = " + a(i) + " opportunity = " + str2);
        HashMap hashMap = new HashMap();
        hashMap.put("liveId", str);
        hashMap.put("curState", a(i));
        hashMap.put("opportunity", str2);
        if (v2s.o().s() != null) {
            v2s.o().s().a("UpDownLifecycleMistake", "Page_TaobaoLiveWatch", hashMap);
        }
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("848374fb", new Object[]{this, str});
            return;
        }
        String str2 = b;
        o3s.b(str2, "onViewHolderDestroy viewHolder liveId = " + str);
        this.f30725a = 4;
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61277768", new Object[]{this, str});
            return;
        }
        String str2 = b;
        o3s.b(str2, "onViewHolderWillAppear viewHolder liveId = " + str);
        int i = this.f30725a;
        if (i != 0) {
            g(str, i, "onWillAppear");
        }
        this.f30725a = 1;
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad2d89b2", new Object[]{this, str});
            return;
        }
        String str2 = b;
        o3s.b(str2, "onViewHolderWillDisAppear viewHolder liveId = " + str);
        int i = this.f30725a;
        if (i != 2) {
            g(str, i, "onWillDisappear");
        }
        this.f30725a = 3;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1adce475", new Object[]{this, str});
            return;
        }
        String str2 = b;
        o3s.b(str2, "onViewHolderDidAppear viewHolder liveId = " + str);
        int i = this.f30725a;
        if (!(i == 1 || i == 3)) {
            g(str, i, "onDidAppear");
        }
        this.f30725a = 2;
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cceae585", new Object[]{this, str});
            return;
        }
        String str2 = b;
        o3s.b(str2, "onViewHolderDidDisAppear viewHolder liveId = " + str);
        int i = this.f30725a;
        if (!(i == 1 || i == 3 || i == 4)) {
            g(str, i, "onDidDisappear");
        }
        this.f30725a = 0;
    }
}
