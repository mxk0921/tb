package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class uhr extends m8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long TBLCOUNTDOWN = 1313197267424491183L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(806355370);
            t2o.a(336592930);
        }

        /* renamed from: a */
        public uhr build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (uhr) ipChange.ipc$dispatch("b0082142", new Object[]{this, obj});
            }
            return new uhr();
        }
    }

    static {
        t2o.a(806355369);
    }

    public static /* synthetic */ Object ipc$super(uhr uhrVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/home/dinamic/ability/TBLCountdownAbility");
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
        String string = h.getString("type");
        String string2 = h.getString("identifier");
        String string3 = h.getString("time");
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || !TextUtils.isDigitsOnly(string3)) {
            return new d8();
        }
        try {
            if ("start".equals(string) && !TextUtils.isEmpty(string3) && TextUtils.isDigitsOnly(string3)) {
                long parseInt = Integer.parseInt(string3) * 1000;
                kir.c().d(string2, parseInt, parseInt, u8Var);
            } else if ("end".equals(string)) {
                kir.c().a(string2, u8Var);
            }
        } catch (Exception unused) {
        }
        return new d8();
    }
}
