package tb;

import android.text.TextUtils;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.falco.m;
import org.json.JSONArray;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class e8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f18361a;
    public volatile JSONArray b;

    public e8s(String str) {
        this.f18361a = str;
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dba3534f", new Object[]{this, str, str2});
            return;
        }
        try {
            luj.c().a(str, str2, true);
        } catch (Exception e) {
            ALog.e("TMQRealTimeReporter", "[report] error", null, e, new Object[0]);
        }
    }

    public boolean b(String str, pz8 pz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34b18cb6", new Object[]{this, str, pz8Var})).booleanValue();
        }
        if (!TextUtils.isEmpty(v5r.d) && "scan".equals(v5r.e)) {
            JSONArray jSONArray = this.b;
            if (jSONArray == null) {
                if (TextUtils.isEmpty(this.f18361a)) {
                    jSONArray = new JSONArray();
                    jSONArray.put(m.MODULE);
                } else {
                    try {
                        jSONArray = new JSONArray(this.f18361a);
                    } catch (Exception e) {
                        ALog.e("TMQRealTimeReporter", "[shouldReport] error", null, e, new Object[0]);
                        jSONArray = new JSONArray();
                    }
                }
                this.b = jSONArray;
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    Object obj = jSONArray.get(i);
                    if (obj != null && obj.equals(str)) {
                        return true;
                    }
                } catch (Exception e2) {
                    ALog.e("TMQRealTimeReporter", "[shouldReport] error", null, e2, new Object[0]);
                }
            }
        }
        return false;
    }
}
