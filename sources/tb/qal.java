package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.sal;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class qal implements bud {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public sal f26632a;
    public zzq b = new zzq();
    public Map<String, String> c = new HashMap();
    public final wnq d;
    public final aak e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements sal.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.sal.b
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d1b13de4", new Object[]{this, str, str2});
            } else {
                qal.this.e(str, str2);
            }
        }
    }

    public qal(wnq wnqVar, aak aakVar) {
        this.d = wnqVar;
        this.e = aakVar;
    }

    public Map<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3d66a125", new Object[]{this});
        }
        return this.c;
    }

    public zzq b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zzq) ipChange.ipc$dispatch("298af2b9", new Object[]{this});
        }
        zzq zzqVar = this.b;
        if (zzqVar != null) {
            return zzqVar;
        }
        return zzq.DefaultOrangeAllOpenSwitch;
    }

    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d957b4bc", new Object[]{this, str})).booleanValue();
        }
        zzq zzqVar = this.b;
        if (zzqVar == null) {
            return false;
        }
        if (!zzqVar.equals(zzq.DefaultOrangeAllOpenSwitch) && this.b.a(str)) {
            return this.b.b(str);
        }
        return true;
    }

    public void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        sal salVar = new sal(this.d);
        this.f26632a = salVar;
        salVar.f(new a());
        this.f26632a.e(context);
        this.b = this.f26632a.d("orange");
        String c = this.f26632a.c(bmp.KEY_SIMPLE_SWITCH_ORANGE);
        if (c != null) {
            this.c = dsl.e(c);
        }
        String c2 = this.f26632a.c(bmp.KEY_NEW_DISCOVERY_ORANGE);
        if (c2 != null) {
            c2.equals("true");
        }
    }

    public void e(String str, String str2) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("860288c", new Object[]{this, str, str2});
        } else if ("orange".equals(str)) {
            u0r<String> c = dsl.d(str2).c();
            for (String str3 : c.e()) {
                boolean b = c.b(str3);
                if (!b) {
                    this.b.d(str3, b);
                    z = true;
                }
            }
            if (z) {
                this.e.f();
            }
        } else if (bmp.KEY_SIMPLE_SWITCH_ORANGE.equals(str)) {
            this.c = dsl.e(str2);
            this.e.f();
        }
    }
}
