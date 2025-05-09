package com.taobao.umipublish.monitor;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.ckf;
import tb.lvc;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJI\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/taobao/umipublish/monitor/UmiPublishMonitorImpl;", "Ltb/lvc;", "<init>", "()V", "", "info", "location", "Lcom/alibaba/fastjson/JSONObject;", "data", "Ltb/xhv;", "commitInfo", "(Ljava/lang/String;Ljava/lang/String;Lcom/alibaba/fastjson/JSONObject;)V", "errMsg", "errCode", "subErrCode", "errInfo", "commitWarning", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/alibaba/fastjson/JSONObject;)V", "umipublish_extends_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class UmiPublishMonitorImpl implements lvc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(944767248);
        t2o.a(511705542);
    }

    @Override // tb.lvc
    public void commitInfo(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9a58750", new Object[]{this, str, str2, jSONObject});
            return;
        }
        ckf.g(str, "info");
        UmiPublishMonitor.w().h("umi_default", str2, str, jSONObject);
    }

    @Override // tb.lvc
    public void commitWarning(String str, String str2, String str3, String str4, String str5, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b80e152", new Object[]{this, str, str2, str3, str4, str5, jSONObject});
            return;
        }
        ckf.g(str, "errMsg");
        UmiPublishMonitor.w().p("umi_default", str5, str2, str, str4, str3);
    }
}
