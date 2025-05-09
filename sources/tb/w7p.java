package tb;

import android.graphics.Color;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class w7p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f30503a;
    public final int b;
    public boolean c;
    public final int d;
    public int e;
    public final boolean f;
    public final boolean g;

    static {
        t2o.a(993002103);
    }

    public w7p(JSONObject jSONObject) {
        this.f30503a = -1;
        boolean z = false;
        this.b = 0;
        this.c = false;
        try {
            this.f30503a = Color.parseColor(jSONObject.getString("backgroundColor"));
        } catch (Exception unused) {
            this.f30503a = 0;
        }
        this.b = e("stickyTop", jSONObject);
        this.c = jSONObject.getBooleanValue("sectionClip");
        this.g = jSONObject.getBooleanValue("forceShowClipOverlay");
        if (this.c) {
            this.d = e("sectionClipThreshold", jSONObject);
        }
        this.e = e("halfStickyOffset", jSONObject);
        Boolean bool = jSONObject.getBoolean("sticky");
        this.f = (bool == null || bool.booleanValue()) ? true : z;
    }

    public w7p a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w7p) ipChange.ipc$dispatch("11806ab", new Object[]{this});
        }
        return new w7p(this.f30503a, this.b, this.c, this.d, this.e, this.f);
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7cbe599", new Object[]{this})).intValue();
        }
        return this.f30503a;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e85e313f", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("67eae11f", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public final int e(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7b0a941b", new Object[]{this, str, jSONObject})).intValue();
        }
        String string = jSONObject.getString(str);
        if (TextUtils.isEmpty(string)) {
            return 0;
        }
        try {
            return (int) fxh.e(string);
        } catch (Exception unused) {
            return 0;
        }
    }

    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1a2c6d70", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d5710d", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f8a9f56", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b2496be", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public void j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c047129", new Object[]{this, new Integer(i)});
        } else {
            this.f30503a = i;
        }
    }

    public void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("658469cb", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43b63cfa", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public w7p(int i, int i2, boolean z, int i3, int i4, boolean z2) {
        this.f30503a = i;
        this.f = z2;
        this.b = i2;
        this.c = z;
        this.d = i3;
        this.e = i4;
    }
}
