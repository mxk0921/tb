package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import tb.al9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class z30 implements al9.c, al9.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f32507a;
    public String b;
    public final omd c = eto.a();
    public final HashMap<String, Boolean> d = new HashMap<>();
    public final HashMap<String, Integer> e = new HashMap<>();

    static {
        t2o.a(377487361);
        t2o.a(676331532);
        t2o.a(676331533);
    }

    public abstract void a();

    public abstract void b();

    public abstract void c(List<String> list);

    @Override // tb.al9.c
    public void onActivityCreate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18625fbb", new Object[]{this, str});
            return;
        }
        if (str.startsWith("com.taobao.tao.welcome") || TextUtils.equals(str, obq.BIZ_NAME)) {
            this.f32507a = obq.BIZ_NAME;
            this.b = "homePage";
        } else {
            this.f32507a = str;
        }
        if (!this.d.containsKey(this.f32507a)) {
            this.d.put(this.f32507a, Boolean.TRUE);
            omd omdVar = this.c;
            if (omdVar != null && omdVar.isInit()) {
                List<String> d = this.c.d(this.f32507a, this.b);
                if (d == null || d.size() == 0) {
                    b();
                } else {
                    c(d);
                }
            }
        }
    }

    @Override // tb.al9.c
    public void onBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d13a74", new Object[]{this});
        } else {
            a();
        }
    }

    @Override // tb.al9.d
    public void onTabChanged(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91f35fc8", new Object[]{this, new Integer(i), str});
            return;
        }
        this.b = str;
        if (!this.e.containsKey(str)) {
            this.e.put(str, Integer.valueOf(i));
            omd omdVar = this.c;
            if (omdVar != null && omdVar.isInit()) {
                if (TextUtils.isEmpty(this.f32507a) || this.f32507a.startsWith("com.taobao.tao.welcome")) {
                    this.f32507a = obq.BIZ_NAME;
                }
                List<String> d = this.c.d(this.f32507a, this.b);
                if (d == null || d.size() == 0) {
                    b();
                } else {
                    c(d);
                }
            }
        }
    }
}
