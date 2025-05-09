package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.basement.Bridge.MtbBasementWeexApiPlugin;
import com.taobao.mytaobao.basement.MTBBasementContainerView;
import com.taobao.mytaobao.basement.weex.BasementWeexView;
import com.taobao.tao.log.TLog;
import java.util.UUID;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class r32 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f27080a = "notifyMyTaoBaoFloorChange";
    public static final String b = "notifyMyTaoBaoRefresh";
    public static final String c = "main";
    public static final String d = "basement";
    public static final String e = pg1.ATOM_EXT_floor;
    public static final String f = "notifyQuickBackFirstPage";

    public static JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a2f7f99b", new Object[0]);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uuid", (Object) UUID.randomUUID());
        return jSONObject;
    }

    public static void b(MTBBasementContainerView mTBBasementContainerView, boolean z, boolean z2) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1aee67", new Object[]{mTBBasementContainerView, new Boolean(z), new Boolean(z2)});
            return;
        }
        JSONObject a2 = a();
        String str3 = e;
        if (z) {
            str = d;
        } else {
            str = c;
        }
        a2.put(str3, (Object) str);
        if (z) {
            a2.put("isDirty", (Object) Boolean.valueOf(z2));
        }
        if (z) {
            str2 = "Page_MyTaobao_slide-transition";
        } else {
            str2 = "Page_MyTaobao_BackToMyTaobaoFromBasement";
        }
        suv.d(u3j.b, str2, "a2141.7631743.67.1", null, a2);
        TLog.loge(s32.MODULE_NAME, "native invoke notifyMyTaoBaoFloorChange");
        c(mTBBasementContainerView, f27080a, a2);
    }

    public static void c(MTBBasementContainerView mTBBasementContainerView, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97311195", new Object[]{mTBBasementContainerView, str, jSONObject});
        } else if (mTBBasementContainerView != null) {
            if (jSONObject == null) {
                jSONObject = a();
            }
            BasementWeexView weexView = mTBBasementContainerView.getWeexView();
            if (weexView != null) {
                d(weexView, str, jSONObject);
            }
        }
    }

    public static void d(BasementWeexView basementWeexView, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50fe86a7", new Object[]{basementWeexView, str, jSONObject});
            return;
        }
        if (jSONObject == null) {
            jSONObject = a();
        }
        basementWeexView.dispatchEvent(0, str, jSONObject);
        MtbBasementWeexApiPlugin.commitWeexEventTrace(str, jSONObject);
    }

    static {
        t2o.a(745537595);
    }
}
