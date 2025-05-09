package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.tinct.ITinctOperater;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class bpw implements yzd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792257);
        t2o.a(993001918);
    }

    @Override // tb.yzd
    public void a(Map<String, TemplateBean> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2575a8ff", new Object[]{this, map});
        } else if (map != null && o4p.l1()) {
            for (Map.Entry<String, TemplateBean> entry : map.entrySet()) {
                TemplateBean value = entry.getValue();
                if (value != null && !TextUtils.isEmpty(value.isGray)) {
                    boolean equals = TextUtils.equals(value.isGray, "true");
                    ITinctOperater.getInstance().markUsed("magellan", value.templateName, value.version, "Page_Search", equals);
                    c4p.D(gxh.LOG_TAG, "无线运维灰度模板染色，isGray=" + equals + ", templateName=" + value.templateName, new Object[0]);
                }
            }
        }
    }
}
