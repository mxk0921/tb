package tb;

import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class afg {
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
    public int f15710a = 0;
    public final JSONObject b = new JSONObject();
    public static final afg RET_SUCCESS = new afg("HY_SUCCESS");
    public static final afg RET_FAIL = new afg("HY_FAILED");
    public static final afg RET_PARAM_ERR = new afg("HY_PARAM_ERR");
    public static final afg RET_NO_METHOD = new afg("HY_NO_HANDLER");
    public static final afg RET_NO_PERMISSION = new afg("HY_NO_PERMISSION");
    public static final afg RET_CLOSED = new afg("HY_CLOSED");

    static {
        t2o.a(507510809);
    }

    public afg() {
    }

    public void a(String str, String str2) {
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

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2490c548", new Object[]{this});
        } else {
            this.f15710a = 1;
        }
    }

    public void b(String str) {
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
            this.f15710a = i;
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2d4e3785", new Object[]{this});
        }
        try {
            int i = this.f15710a;
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

    public afg(String str) {
        b(str);
    }
}
