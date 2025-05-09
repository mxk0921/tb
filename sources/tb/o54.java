package tb;

import com.alibaba.android.ultron.vfw.commonpopupwindow.CommonPopupWindow;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class o54 extends l6v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements CommonPopupWindow.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.alibaba.android.ultron.vfw.commonpopupwindow.CommonPopupWindow.f
        public void a(boolean z) {
            JSONObject fields;
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bc0c1594", new Object[]{this, new Boolean(z)});
            } else if (z && (fields = o54.this.j().getFields()) != null && (jSONObject = fields.getJSONObject("next")) != null) {
                o54.this.l(jSONObject.getJSONArray("complete"));
            }
        }
    }

    static {
        t2o.a(157286510);
    }

    public static /* synthetic */ Object ipc$super(o54 o54Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/event/CommonDismissPopSubscriber");
    }

    @Override // tb.l6v
    public void t(b8v b8vVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827a7510", new Object[]{this, b8vVar});
            return;
        }
        try {
            CommonPopupWindow commonPopupWindow = (CommonPopupWindow) b8vVar.n().d().get("CommonPopupWindow");
            commonPopupWindow.v(new a());
            commonPopupWindow.l(true);
        } catch (Throwable th) {
            UnifyLog.e("CommonDismissPopSubscriber", th.toString());
            fsb fsbVar = this.d;
            if (fsbVar == null) {
                str = "Ultron";
            } else {
                str = fsbVar.getBizName();
            }
            lbq.c(str, "CommonDismissPopSubscriber", th);
        }
    }
}
