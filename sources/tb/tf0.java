package tb;

import android.text.TextUtils;
import com.alibaba.android.ultron.trade.event.model.AdjustWithPopupWindowEventModel;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import tb.mcu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class tf0 extends l12 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ADJUSt_BEFORE_POPUP = "needCallAdjustBeforePopup";
    public static final String KEY_IGNORE_CURRENT_POPUP = "ignoreCurrentPopup";
    public static final String KEY_STATUS = "status";
    public static final String KEY_STATUS_ADJUST = "AutoJumpRequest";
    public static final String KEY_STATUS_H5_BACK = "H5Back";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements mcu.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(tf0 tf0Var) {
        }
    }

    static {
        t2o.a(155189303);
    }

    public tf0() {
        this.g = 100;
        b();
    }

    public static /* synthetic */ Object ipc$super(tf0 tf0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/trade/event/AdjustAndOpenPopupWindowSubscriber");
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        AdjustWithPopupWindowEventModel adjustWithPopupWindowEventModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        gsb g = g();
        if (g != null && g.getFields() != null) {
            try {
                adjustWithPopupWindowEventModel = (AdjustWithPopupWindowEventModel) JSON.parseObject(g.getFields().toJSONString(), AdjustWithPopupWindowEventModel.class);
            } catch (Exception unused) {
                UnifyLog.e("AutoJumpOpenUrlSubscriber", "onHandleEvent JSON.parseObject failed");
                adjustWithPopupWindowEventModel = null;
            }
            if (adjustWithPopupWindowEventModel != null) {
                if (!q()) {
                    p(lcuVar, g);
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("status", (Object) "AutoJumpRequest");
                n(g(), jSONObject);
                mcu g2 = this.c.g();
                if (g2 != null) {
                    if (g2.i() == null) {
                        this.c.g().p(g2.d());
                    }
                    g2.i().q(this.e.getKey());
                    g2.q(this.e.getKey(), new a(this));
                    this.c.d().g(this.e);
                }
            }
        }
    }

    public void p(lcu lcuVar, gsb gsbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f35c613", new Object[]{this, lcuVar, gsbVar});
            return;
        }
        if (gsbVar.getFields() != null) {
            gsbVar.getFields().put("from", "AdjustAndOpenPopupWindowSubscriber");
        }
        mcu g = this.c.g();
        g.h(g.d().l("openPopupWindow").k(gsbVar).i(lcuVar.a()));
    }

    public final boolean q() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b15735", new Object[]{this})).booleanValue();
        }
        JSONObject c = c();
        if (c == null || (jSONObject = c.getJSONObject("options")) == null) {
            return true;
        }
        String string = jSONObject.getString(KEY_ADJUSt_BEFORE_POPUP);
        if (TextUtils.isEmpty(string)) {
            return true;
        }
        return Boolean.parseBoolean(string);
    }
}
