package com.taobao.linkmanager.flowout.data;

import com.alibaba.fastjson.annotation.JSONField;
import com.taobao.accs.common.Constants;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FloutIdListBean implements Serializable {
    @JSONField(name = "floutId")
    public String floutId;
    @JSONField(name = Constants.KEY_PACKAGE_NAMES)
    public String[] packageNames;
    @JSONField(name = "scene")
    public String scene;
    @JSONField(name = "validDate")
    public int validDate = -1;

    static {
        t2o.a(744489094);
    }
}
