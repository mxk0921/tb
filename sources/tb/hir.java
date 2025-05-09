package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hir extends m8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long TBLSTABLETRACKER = 4885510248163492633L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(310378564);
            t2o.a(336592930);
        }

        /* renamed from: a */
        public hir build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (hir) ipChange.ipc$dispatch("47baa082", new Object[]{this, obj});
            }
            return new hir();
        }
    }

    static {
        t2o.a(310378563);
    }

    public static /* synthetic */ Object ipc$super(hir hirVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/dinamicx/TBLStableTrackerAbility");
    }

    @Override // tb.m8
    public c8 f(n8 n8Var, k8 k8Var, u8 u8Var) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("40f5a125", new Object[]{this, n8Var, k8Var, u8Var});
        }
        if (n8Var == null) {
            jSONObject = null;
        } else {
            jSONObject = n8Var.h();
        }
        if (jSONObject == null) {
            return new d8();
        }
        String string = jSONObject.getString("func");
        String string2 = jSONObject.getString("data");
        if (iu2.CALENDAR_EVENT_ADD.equals(string) && string2 != null) {
            qyg.c().e("com.taobao.taolive.livehome.add.event", string2);
        } else if ("commit".equals(string) && string2 != null) {
            qyg.c().e("com.taobao.taolive.livehome.commit", string2);
        }
        return new d8();
    }
}
