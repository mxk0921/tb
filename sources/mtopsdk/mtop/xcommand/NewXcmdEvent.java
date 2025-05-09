package mtopsdk.mtop.xcommand;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class NewXcmdEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String value;

    static {
        t2o.a(589300013);
    }

    public NewXcmdEvent(String str) {
        this.value = str;
    }

    public String getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
        }
        return this.value;
    }

    public void setValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae52f80", new Object[]{this, str});
        } else {
            this.value = str;
        }
    }
}
