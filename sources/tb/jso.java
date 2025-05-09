package tb;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.scancode.common.object.ScancodeType;
import com.taobao.android.scancode.common.util.Scancode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class jso extends ufl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Intent b;
    public String c;
    public String e;
    public String f;
    public String g;
    public String h;
    public boolean i;

    /* renamed from: a  reason: collision with root package name */
    public boolean f22188a = true;
    public pso d = new pso();
    public ryu j = new ryu();

    static {
        t2o.a(481296703);
    }

    public static /* synthetic */ Object ipc$super(jso jsoVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/scan/ScanParams");
    }

    @Override // tb.ufl
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f5fd279", new Object[]{this});
        }
        return this.g;
    }

    @Override // tb.ufl
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("70feca8f", new Object[]{this});
        }
        return this.h;
    }

    @Override // tb.ufl
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50719bc8", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.ufl
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b21b3f1", new Object[]{this})).booleanValue();
        }
        return this.f22188a;
    }

    @Override // tb.ufl
    public pso e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pso) ipChange.ipc$dispatch("72d370ad", new Object[]{this});
        }
        return this.d;
    }

    @Override // tb.ufl
    public Intent f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("519870c9", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.ufl
    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c1a1816", new Object[]{this});
        }
        return this.e;
    }

    @Override // tb.ufl
    public ryu h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ryu) ipChange.ipc$dispatch("90aaae8f", new Object[]{this});
        }
        return this.j;
    }

    @Override // tb.ufl
    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a6e5c81", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public boolean j(Activity activity) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dff6bdae", new Object[]{this, activity})).booleanValue();
        }
        if (activity == null || (intent = activity.getIntent()) == null) {
            return false;
        }
        try {
            this.b = (Intent) intent.getParcelableExtra("TARGET_INTENT");
            this.f22188a = intent.getBooleanExtra("NeedFinish", true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            this.c = intent.getStringExtra(Scancode.GATEWAY_CALLBACK_ACTION_PARAM);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        Uri data = intent.getData();
        if (data == null) {
            this.d = pso.b;
            return true;
        }
        try {
            this.e = "";
            this.d = pso.b;
            if (!lg4.k1()) {
                String f2 = lg4.f2("android_scancode_client", "dm_target_url", "");
                this.f = f2;
                if (!TextUtils.isEmpty(f2) && !"false".equals(this.f)) {
                    this.d.b(ScancodeType.DM);
                }
                String f22 = lg4.f2("android_scancode_client", "ma_4g_switch", "");
                if (!TextUtils.isEmpty(f22) && TextUtils.equals("false", f22)) {
                    this.d.c(ScancodeType.TB_4G);
                }
                String f23 = lg4.f2("android_scancode_client", "enable_gen3", "");
                if (!TextUtils.isEmpty(f23) && TextUtils.equals("false", f23)) {
                    this.d.c(ScancodeType.GEN3);
                }
                String f24 = lg4.f2("android_scancode_client", "enable_dm_goodsbarcode", "true");
                if (!TextUtils.isEmpty(f24) && "true".equals(f24)) {
                    this.d.b(ScancodeType.DM);
                }
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        data.getQueryParameter("description");
        ryu ryuVar = new ryu();
        this.j = ryuVar;
        ryuVar.d(data);
        if ("1".equals(this.j.b().get("isActivity"))) {
            this.i = true;
        }
        this.g = this.j.b().get("activityId");
        this.h = this.j.b().get(yj4.PARAM_ACTIVITY_URL);
        return true;
    }
}
