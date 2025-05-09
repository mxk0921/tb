package com.taobao.infoflow.core.subservice.biz.outlinkservice.impl.model;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.fve;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class OutLinkModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "OutLinkModel";
    private String area;
    private JSONObject args;
    private String biz;
    private String index;

    static {
        t2o.a(486539559);
    }

    public String getArea() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("160cc5d6", new Object[]{this});
        }
        return this.area;
    }

    public JSONObject getArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7c869f7a", new Object[]{this});
        }
        return this.args;
    }

    public String getBiz() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea033d3c", new Object[]{this});
        }
        return this.biz;
    }

    public int getOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c7531f83", new Object[]{this})).intValue();
        }
        return parseOffset(this.index);
    }

    public void setArea(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("400b3560", new Object[]{this, str});
        } else {
            this.area = str;
        }
    }

    public void setArgs(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9679c24a", new Object[]{this, jSONObject});
        } else {
            this.args = jSONObject;
        }
    }

    public void setBiz(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44f14d22", new Object[]{this, str});
        } else {
            this.biz = str;
        }
    }

    public void setIndex(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89e39821", new Object[]{this, str});
        } else {
            this.index = str;
        }
    }

    private int parseOffset(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b973932a", new Object[]{this, str})).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            fve.e(TAG, "解析偏移量出错，偏移量是 " + str);
            return 0;
        }
    }
}
