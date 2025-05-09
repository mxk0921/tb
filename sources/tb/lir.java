package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class lir extends m8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long TBLTLOG = 4166530386970421247L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(806355387);
            t2o.a(336592930);
        }

        /* renamed from: a */
        public lir build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (lir) ipChange.ipc$dispatch("9f71e721", new Object[]{this, obj});
            }
            return new lir();
        }
    }

    static {
        t2o.a(806355386);
    }

    public static /* synthetic */ Object ipc$super(lir lirVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/home/dinamic/ability/TBLTlogAbility");
    }

    @Override // tb.m8
    public c8 f(n8 n8Var, k8 k8Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("40f5a125", new Object[]{this, n8Var, k8Var, u8Var});
        }
        JSONObject h = n8Var == null ? null : n8Var.h();
        if (h == null) {
            return new d8();
        }
        String string = h.getString(AliFestivalWVPlugin.PARAMS_MODULE_NAME);
        String string2 = h.getString(m09.TASK_TYPE_LEVEL);
        String string3 = h.getString("tag");
        String string4 = h.getString("content");
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
            return new d8();
        }
        if ("error".equals(string2)) {
            TLog.loge(string, string3, string4);
        } else if ("warn".equals(string2)) {
            TLog.logw(string, string3, string4);
        } else if ("info".equals(string2)) {
            TLog.logi(string, string3, string4);
        } else if ("debug".equals(string2)) {
            TLog.logd(string, string3, string4);
        }
        return new d8();
    }
}
