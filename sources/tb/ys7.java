package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.revisionswitch.utils.LocationHelper;
import com.taobao.tao.log.TLog;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ys7 implements bud {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final wnq f32315a;
    public final aak b;
    public xs7 c;
    public xs7 d;
    public xs7 e;
    public Context f;

    public ys7(wnq wnqVar, aak aakVar) {
        this.f32315a = wnqVar;
        this.b = aakVar;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd5fb548", new Object[]{this});
            return;
        }
        if (LocationHelper.a(this.f) == 1) {
            this.c = this.e;
        } else {
            this.c = this.d;
        }
        if (this.c == null) {
            this.c = new xs7();
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4b88e19", new Object[]{this});
        }
        xs7 xs7Var = this.c;
        if (xs7Var == null) {
            return null;
        }
        return xs7Var.f();
    }

    public xs7 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xs7) ipChange.ipc$dispatch("a75d384b", new Object[]{this});
        }
        a();
        return this.c;
    }

    public xs7 d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xs7) ipChange.ipc$dispatch("800d1daf", new Object[]{this});
        }
        return this.d;
    }

    public boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d957b4bc", new Object[]{this, str})).booleanValue();
        }
        a();
        xs7 xs7Var = this.c;
        if (xs7Var == null) {
            return false;
        }
        return xs7Var.b(str);
    }

    public void f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        this.f = context;
        this.d = this.f32315a.c();
        this.e = this.f32315a.k();
        a();
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("676bca1e", new Object[]{this, str});
        } else if (LocationHelper.a(this.f) == 1) {
            TLog.loge("DosaSwitchExtractor", "insert overseasDosaSwitch: " + str);
            this.f32315a.b(str);
        } else {
            TLog.loge("DosaSwitchExtractor", "insert mDosaSwitch: " + str);
            this.f32315a.f(str);
        }
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf1a8b42", new Object[]{this, str});
            return;
        }
        TLog.loge("DosaSwitchExtractor", "insert mDosaSwitch " + str);
        a();
        try {
            xs7 b = dsl.b(new JSONObject(str), this.c);
            this.c = b;
            if (b == null) {
                return;
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.b.f();
        this.f32315a.f(this.c.h());
    }
}
