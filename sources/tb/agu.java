package tb;

import android.os.Messenger;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class agu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARAM_KEY_NEED_LOCAL_REQUEST_CACHE = "needLocalRequestCache";
    public static final String PARAM_KEY_NEED_TOAST = "needToast";
    public static final String PARAM_KEY_TOAST_LOADING = "loadingToast";
    public static final String PARAM_KEY_TOAST_LOAD_FAIL = "loadFailToast";
    public static final String PARAM_KEY_TOAST_LOAD_TIME_OUT = "loadTimeOutToast";
    public static final int TRIGGER_TYPE_FLOAT_WINDOW_LOCAL_TASK = 2;
    public static final int TRIGGER_TYPE_FLOAT_WINDOW_ONCE_EVENT_TASK = 1;
    public static final int TRIGGER_TYPE_FLOAT_WINDOW_USER_EVENT = 3;

    /* renamed from: a  reason: collision with root package name */
    public final int f15730a;
    public String b;
    public String c;
    public JSONObject d;
    public Messenger e;
    public y2e f;

    static {
        t2o.a(435159098);
    }

    public agu(int i) {
        this.f15730a = i;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d6d8bc8", new Object[]{this})).booleanValue();
        }
        if (this.f15730a == 3) {
            return true;
        }
        return false;
    }
}
