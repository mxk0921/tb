package com.alibaba.android.ultron.trade.event.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ChangeQuantityEventModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String max;
    private String min;
    private String quantity;
    private String step;

    static {
        t2o.a(155189339);
    }

    public String getMax() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5f7c218b", new Object[]{this});
        }
        return this.max;
    }

    public String getMin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6fcfa15d", new Object[]{this});
        }
        return this.min;
    }

    public String getQuantity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2be78798", new Object[]{this});
        }
        return this.quantity;
    }

    public String getStep() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3b4b3cf7", new Object[]{this});
        }
        return this.step;
    }

    public void setMax(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e94f2b3", new Object[]{this, str});
        } else {
            this.max = str;
        }
    }

    public void setMin(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78b16d21", new Object[]{this, str});
        } else {
            this.min = str;
        }
    }

    public void setQuantity(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbe6c5de", new Object[]{this, str});
        } else {
            this.quantity = str;
        }
    }

    public void setStep(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c29ba25f", new Object[]{this, str});
        } else {
            this.step = str;
        }
    }
}
