package com.alibaba.android.icart.core.promotionsubmit.event;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.alibaba.android.icart.core.promotionsubmit.event.BaseEvent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.List;
import tb.c9x;
import tb.hav;
import tb.t2o;
import tb.z0n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ToastEvent extends BaseEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String toastTexts;

    static {
        t2o.a(479199545);
    }

    public static /* synthetic */ Object ipc$super(ToastEvent toastEvent, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/promotionsubmit/event/ToastEvent");
    }

    @Override // com.alibaba.android.icart.core.promotionsubmit.event.BaseEvent
    public BaseEvent initEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseEvent) ipChange.ipc$dispatch("9a19a69d", new Object[]{this});
        }
        JSONObject jSONObject = this.eventParams;
        if (jSONObject != null) {
            this.toastTexts = jSONObject.getString("toastTexts");
        }
        return this;
    }

    @Override // com.alibaba.android.icart.core.promotionsubmit.event.BaseEvent
    public void runEvent(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d1adc7e", new Object[]{this, context, jSONObject});
            return;
        }
        setContext(context);
        if (context != null) {
            if (!this.isModalBuy || jSONObject == null || !jSONObject.containsKey("successNum") || jSONObject.containsKey("failedNum")) {
                List<String> catchPlaceHolder = catchPlaceHolder(this.toastTexts);
                if (!(catchPlaceHolder == null || catchPlaceHolder.size() <= 0 || jSONObject == null)) {
                    for (String str : catchPlaceHolder) {
                        Object obj = jSONObject.get(str);
                        if (obj != null) {
                            String str2 = this.toastTexts;
                            this.toastTexts = str2.replaceAll("\\$\\{" + str + "\\}", obj.toString());
                        }
                    }
                }
                if (z0n.d()) {
                    Toast.makeText(context, this.toastTexts, 1).show();
                } else {
                    View inflate = LayoutInflater.from(context).inflate(R.layout.icart_promotion_submit, (ViewGroup) null);
                    ((TextView) inflate.findViewById(R.id.tv_content)).setText(this.toastTexts);
                    Toast toast = new Toast(context);
                    toast.setGravity(17, 0, 0);
                    toast.setDuration(1);
                    toast.setView(inflate);
                    toast.show();
                }
                BaseEvent.a aVar = this.finishedListener;
                if (aVar != null) {
                    ((z0n.a) aVar).a(null);
                    return;
                }
                return;
            }
            hav.d(c9x.CART_BIZ_NAME, "极简浮层下单，领券成功不弹出toast");
        }
    }
}
