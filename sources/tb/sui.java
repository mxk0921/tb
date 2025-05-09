package tb;

import android.os.SystemClock;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class sui {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f28282a;
    public final boolean b;
    public final String c;

    static {
        t2o.a(491782673);
    }

    public sui(JSONObject jSONObject, boolean z, String str) {
        SystemClock.uptimeMillis();
        this.f28282a = jSONObject;
        this.b = z;
        this.c = str;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1cc388a", new Object[]{this});
        }
        return this.c;
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ce0b2928", new Object[]{this});
        }
        return this.f28282a;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e373a88", new Object[]{this})).booleanValue();
        }
        return this.b;
    }
}
