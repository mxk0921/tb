package tb;

import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class nsw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLOSED = "HY_CLOSED";
    public static final String ERROR_EXECUTE = "HY_ERROR_EXECUTE";
    public static final String FAIL = "HY_FAILED";
    public static final String NO_CLASS = "HY_NO_CLASS";
    public static final String NO_METHOD = "HY_NO_HANDLER";
    public static final String NO_PERMISSION = "HY_NO_PERMISSION";
    public static final String PARAM_ERR = "HY_PARAM_ERR";
    public static final String SUCCESS = "HY_SUCCESS";

    /* renamed from: a  reason: collision with root package name */
    public int f24932a = 0;
    public JSONObject b = new JSONObject();
    public boolean c = false;
    public static final nsw RET_SUCCESS = new nsw("HY_SUCCESS");
    public static final nsw RET_FAIL = new nsw("HY_FAILED");
    public static final nsw RET_PARAM_ERR = new nsw("HY_PARAM_ERR");
    public static final nsw RET_NO_METHOD = new nsw("HY_NO_HANDLER");
    public static final nsw RET_NO_PERMISSION = new nsw("HY_NO_PERMISSION");
    public static final nsw RET_CLOSED = new nsw("HY_CLOSED");

    static {
        t2o.a(989856238);
    }

    public nsw() {
    }

    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6f12518", new Object[]{this, str, obj});
        } else if (str != null && obj != null) {
            try {
                this.b.put(str, obj);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34725f06", new Object[]{this, str, str2});
        } else if (str != null && str2 != null) {
            try {
                this.b.put(str, str2);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void c(String str, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4fca6d6", new Object[]{this, str, jSONArray});
        } else if (str != null && jSONArray != null) {
            try {
                this.b.put(str, jSONArray);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void d(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6c92302", new Object[]{this, str, jSONObject});
        } else if (str != null && jSONObject != null) {
            try {
                this.b.put(str, jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public String e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2df0e14f", new Object[]{this, str, str2});
        }
        try {
            JSONObject jSONObject = this.b;
            if (jSONObject == null) {
                return "HY_FAILED_NO_RESULT";
            }
            return jSONObject.optString(str, str2);
        } catch (Throwable unused) {
            return "HY_FAILED_EXCEPTION";
        }
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f63c51d", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public JSONObject g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ba6f0e08", new Object[]{this});
        }
        return this.b;
    }

    public void h(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f6fa1eb", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            this.b = jSONObject;
        }
    }

    public void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a50bf8e7", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2490c548", new Object[]{this});
        } else {
            this.f24932a = 1;
        }
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4550b0e", new Object[]{this})).booleanValue();
        }
        if (this.f24932a == 1) {
            return true;
        }
        return false;
    }

    public void j(String str) {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2585a870", new Object[]{this, str});
            return;
        }
        try {
            this.b.put(rb.RESULT_KEY, str);
            if (!"HY_SUCCESS".equals(str)) {
                i = -1;
            }
            this.f24932a = i;
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2d4e3785", new Object[]{this});
        }
        try {
            int i = this.f24932a;
            if (i == 1) {
                this.b.put(rb.RESULT_KEY, "HY_SUCCESS");
            } else if (i == 0) {
                this.b.put(rb.RESULT_KEY, "HY_FAILED");
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this.b.toString();
    }

    public nsw(String str) {
        j(str);
    }
}
