package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class x9n {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int REBUILD_ALL = 0;
    public static final int REBUILD_CONTAINER = 2;
    public static final int REBUILD_NONE = 1;
    public static final int REFRESH_TYPE_LAYOUT = 1;
    public static final int REFRESH_TYPE_PARSE = 0;

    /* renamed from: a  reason: collision with root package name */
    public int f31236a = 0;
    public int b = 0;

    static {
        t2o.a(444597575);
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("75e989b2", new Object[]{this})).intValue();
        }
        return this.f31236a;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c65a479", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public static x9n a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x9n) ipChange.ipc$dispatch("f71d387", new Object[]{jSONObject});
        }
        x9n x9nVar = new x9n();
        if (jSONObject == null) {
            return x9nVar;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("originParams");
            if (jSONObject2 == null) {
                return x9nVar;
            }
            String string = jSONObject2.getString("refreshStrategy");
            if (TextUtils.isEmpty(string)) {
                return x9nVar;
            }
            if (string.toLowerCase().equals("rebuildcontainer")) {
                x9nVar.f31236a = 2;
            } else if (string.equalsIgnoreCase("rebuildall")) {
                x9nVar.f31236a = 0;
            } else if (string.equalsIgnoreCase("rebuildnone")) {
                x9nVar.f31236a = 1;
            } else {
                x9nVar.f31236a = 0;
            }
            String string2 = jSONObject2.getString(x96.REFRESH_TYPE);
            if (TextUtils.isEmpty(string2)) {
                return x9nVar;
            }
            if (string2.equalsIgnoreCase("layout")) {
                x9nVar.b = 1;
            } else {
                x9nVar.b = 0;
            }
            return x9nVar;
        } catch (Exception e) {
            xv5.b(e);
            return x9nVar;
        }
    }
}
