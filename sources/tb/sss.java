package tb;

import android.text.TextUtils;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.tanx.TanxArgNames;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class sss {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f28254a = new HashMap();
    public final Map<String, String> b = new HashMap();
    public Map<String, String> c;
    public final String d;

    static {
        t2o.a(1017118819);
    }

    public sss(String str) {
        new HashMap();
        this.d = str;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c9f3a3e", new Object[]{this});
        } else {
            new tss(this.d, this.f28254a, this.b).f();
        }
    }

    public sss b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sss) ipChange.ipc$dispatch("67f6e7bd", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            ((HashMap) this.f28254a).put("namespace", str);
        }
        return this;
    }

    public sss c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sss) ipChange.ipc$dispatch("30faabed", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            ((HashMap) this.f28254a).put(MspDBHelper.BizEntry.COLUMN_NAME_PID, str);
        }
        return this;
    }

    public sss d(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sss) ipChange.ipc$dispatch("eeb0083d", new Object[]{this, map});
        }
        if (map != null && !map.isEmpty()) {
            ((HashMap) this.f28254a).put(TanxArgNames.UT_ARGS.getKey(), vzo.n(map));
            this.c = map;
        }
        return this;
    }
}
