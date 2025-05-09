package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;
import java.util.LinkedHashMap;
import java.util.Observable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class clk extends Observable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String STATUS_EXCEED_MAX_SIZE = "EXCEED_MAX_SIZE";
    public static final String STATUS_SAME_KEY = "SAME_KEY";
    public static final String STATUS_SUCCESS = "SUCCESS";

    /* renamed from: a  reason: collision with root package name */
    public final String f17139a;
    public final String b;
    public final LinkedHashMap<String, Object> c = new LinkedHashMap<>();
    public int d = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(993002157);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(993002156);
    }

    public clk(String str, String str2) {
        ckf.g(str, "mNamespace");
        ckf.g(str2, Constants.Name.SCOPE);
        this.f17139a = str;
        this.b = str2;
    }

    public static /* synthetic */ Object ipc$super(clk clkVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/xsearchplugin/muise/ObservableMapValue");
    }

    public final JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b9d9eab4", new Object[]{this, str});
        }
        ckf.g(str, "status");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "namespace", this.f17139a);
        jSONObject.put((JSONObject) "data", (String) JSON.toJSON(this.c));
        jSONObject.put((JSONObject) "status", str);
        return jSONObject;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6e9f91b", new Object[]{this});
        }
        return this.b;
    }

    public final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39af3815", new Object[]{this, str});
            return;
        }
        ckf.g(str, "key");
        if (this.c.containsKey(str)) {
            this.c.remove(str);
            setChanged();
            notifyObservers(a("SUCCESS"));
        }
    }

    public final void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d2c5079", new Object[]{this, new Integer(i)});
            return;
        }
        this.d = i;
        if (i >= 0 && i > this.c.size()) {
            while (this.c.size() > i && !this.c.isEmpty()) {
                this.c.remove(this.c.entrySet().iterator().next().getKey());
            }
            setChanged();
            notifyObservers(a("SUCCESS"));
        }
    }

    public final boolean c(String str, Object obj) {
        String str2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a97b4040", new Object[]{this, str, obj})).booleanValue();
        }
        ckf.g(str, "key");
        int size = this.c.size();
        int i = this.d;
        if (size >= i && i >= 0) {
            str2 = STATUS_EXCEED_MAX_SIZE;
            z = false;
        } else if (this.c.containsKey(str)) {
            this.c.put(str, obj);
            str2 = STATUS_SAME_KEY;
        } else {
            this.c.put(str, obj);
            str2 = "SUCCESS";
        }
        setChanged();
        notifyObservers(a(str2));
        return z;
    }
}
