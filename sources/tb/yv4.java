package tb;

import android.text.TextUtils;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class yv4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f32372a = new HashMap();
    public final String b;
    public final String c;

    static {
        t2o.a(1019215887);
    }

    public yv4(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public String a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e4bab5f9", new Object[]{this, map});
        }
        return new tc0(this.b, this.c, this.f32372a).b(map);
    }

    public yv4 b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yv4) ipChange.ipc$dispatch("b3fa9511", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            ((HashMap) this.f32372a).put("namespace", str);
        }
        return this;
    }

    public yv4 c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yv4) ipChange.ipc$dispatch("84cf6e1", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            ((HashMap) this.f32372a).put(MspDBHelper.BizEntry.COLUMN_NAME_PID, str);
        }
        return this;
    }
}
