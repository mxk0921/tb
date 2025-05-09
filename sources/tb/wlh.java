package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class wlh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f30764a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final float f;

    static {
        t2o.a(815792747);
    }

    public wlh(JSONObject jSONObject) {
        String str = (jSONObject == null || (str = jSONObject.getString("mode")) == null) ? "playOnce" : str;
        int hashCode = str.hashCode();
        int i = 1;
        if (hashCode == 3327652) {
            if (str.equals("loop")) {
                this.f30764a = -1;
            }
            this.f30764a = 0;
        } else if (hashCode != 1099846370) {
            if (hashCode == 1878614997 && str.equals("playOnce")) {
                this.f30764a = 0;
            }
            this.f30764a = 0;
        } else {
            if (str.equals(pg1.ATOM_EXT_reverse)) {
                this.f30764a = -1;
                i = 2;
            }
            this.f30764a = 0;
        }
        this.b = i;
        this.c = g("fromFrame", jSONObject, 0);
        this.d = g("toFrame", jSONObject, -1);
        this.e = g("fromProgress", jSONObject, 0) / 100.0f;
        this.f = g("toProgress", jSONObject, 100) / 100.0f;
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cfc7327", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public final float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d1f0c64", new Object[]{this})).floatValue();
        }
        return this.e;
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56d77213", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public final int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4ae19878", new Object[]{this})).intValue();
        }
        return this.f30764a;
    }

    public final int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d52d21f6", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public final float f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e665b735", new Object[]{this})).floatValue();
        }
        return this.f;
    }

    public final int g(String str, JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("73c6b712", new Object[]{this, str, jSONObject, new Integer(i)})).intValue();
        }
        if (jSONObject == null) {
            return i;
        }
        Object obj = jSONObject.get(str);
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        return i;
    }
}
