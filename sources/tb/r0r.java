package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.ditto.data.WidgetContentData;
import com.taobao.desktop.widget.monitor.MonitorType;
import java.util.List;
import tb.bcx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class r0r extends dbx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int f = 0;

    static {
        t2o.a(437256212);
    }

    public static /* synthetic */ Object ipc$super(r0r r0rVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/desktop/widget/action/SwitchItemAction");
    }

    @Override // tb.dbx
    public void b(JSONObject jSONObject) {
        WidgetContentData widgetContentData;
        List<String> dataFrames;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("999d5fc5", new Object[]{this, jSONObject});
            return;
        }
        try {
            String string = jSONObject.getString(tl.KEY_STEP);
            String z = obx.f(this.f17719a).z(this.c);
            if ((!TextUtils.isEmpty(z) || !TextUtils.isEmpty(string)) && (dataFrames = (widgetContentData = (WidgetContentData) JSON.parseObject(z, WidgetContentData.class)).getDataFrames()) != null && !dataFrames.isEmpty()) {
                widgetContentData.setDataContent(dataFrames.get(c(dataFrames.size(), string)));
                pde pdeVar = this.b;
                if (pdeVar != null) {
                    ((m32) pdeVar).c(this.e, this.d, JSON.toJSONString(widgetContentData));
                }
                bcx.e().a(MonitorType.WIDGET_STATE, new bcx.a().x(this.c).w("widget_click_switch_item"));
            }
        } catch (Throwable th) {
            hgh.d("[SwitchItemAction] actionEvent: " + th);
        }
    }

    public final int c(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d36e080d", new Object[]{this, new Integer(i), str})).intValue();
        }
        this.f = ((this.f + Integer.parseInt(str)) + i) % i;
        hgh.d("disposeSwitchItemIndex step: " + str + " currentIndex: " + this.f);
        return this.f;
    }
}
