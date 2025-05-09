package com.taobao.mytaobao.ultron.dinamicX.eventHandler.vipModuleSliderLayoutEventHandler;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class VipModulePageUTBean implements Serializable, Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String K_HAS_EXPOSURE = "hasExposure";
    private static final long serialVersionUID = -8070803408876745014L;
    public String arg1;
    public JSONObject args;
    public int eventId;
    public boolean hasExposure;
    public String page;

    static {
        t2o.a(745538107);
    }

    public VipModulePageUTBean clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VipModulePageUTBean) ipChange.ipc$dispatch("42a66617", new Object[]{this});
        }
        try {
            return (VipModulePageUTBean) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }
}
