package tb;

import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class fir extends m8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long TBLPOSTMESSAGETOH5 = 99713629762691231L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(806355376);
            t2o.a(336592930);
        }

        /* renamed from: a */
        public fir build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fir) ipChange.ipc$dispatch("14603da0", new Object[]{this, obj});
            }
            return new fir();
        }
    }

    static {
        t2o.a(806355375);
    }

    public static /* synthetic */ Object ipc$super(fir firVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/home/dinamic/ability/TBLPostMessageToH5Ability");
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
        String string = h.getString("name");
        String string2 = h.getString("param");
        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
            WVStandardEventCenter.postNotificationToJS(string, string2);
        }
        return new d8();
    }
}
