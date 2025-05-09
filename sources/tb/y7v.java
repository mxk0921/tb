package tb;

import com.alibaba.android.ultron.vfw.commonpopupwindow.CommonPopupWindow;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class y7v extends n6v {
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
            } else if (z && (fields = y7v.J(y7v.this).getFields()) != null && (jSONObject = fields.getJSONObject("next")) != null) {
                y7v.K(y7v.this, jSONObject.getJSONArray("complete"), fields);
            }
        }
    }

    static {
        t2o.a(614465563);
    }

    public static /* synthetic */ gsb J(y7v y7vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gsb) ipChange.ipc$dispatch("5e9a6195", new Object[]{y7vVar});
        }
        return y7vVar.j();
    }

    public static /* synthetic */ void K(y7v y7vVar, JSONArray jSONArray, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ea45b71", new Object[]{y7vVar, jSONArray, obj});
        } else {
            y7vVar.m(jSONArray, obj);
        }
    }

    public static /* synthetic */ Object ipc$super(y7v y7vVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/event/ext/UltronDismissPopV2Subscriber");
    }

    @Override // tb.n6v
    public String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4e47c3c", new Object[]{this});
        }
        return "2804205717073054163";
    }

    @Override // tb.n6v
    public void I(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146e2815", new Object[]{this, b8vVar});
            return;
        }
        try {
            CommonPopupWindow commonPopupWindow = (CommonPopupWindow) b8vVar.n().d().get("CommonPopupWindow");
            commonPopupWindow.v(new a());
            commonPopupWindow.l(true);
        } catch (Throwable unused) {
        }
    }
}
