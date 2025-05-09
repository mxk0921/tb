package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class zh6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int REASON_DOWNGRADE = 1000;
    public static final int REASON_DOWNLOAD_FAIL = 1003;
    public static final int REASON_DOWNLOAD_REMOTE_CHILD_SUCCESS = 1004;
    public static final int REASON_DOWNLOAD_SUCCESS = 1002;
    public static final int REASON_TEMPLATE_NOT_MATCH = 1001;

    /* renamed from: a  reason: collision with root package name */
    public DXTemplateItem f32770a;
    public JSONObject b;
    public int c;
    public Object d;

    static {
        t2o.a(444596938);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DXTemplateUpdateRequest{item=" + this.f32770a + ", data=" + this.b + ", reason='" + this.c + "', dxUserContext=" + this.d + '}';
    }
}
