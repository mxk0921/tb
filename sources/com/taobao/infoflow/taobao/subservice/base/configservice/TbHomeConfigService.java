package com.taobao.infoflow.taobao.subservice.base.configservice;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.exception.InfoFlowRuntimeException;
import com.taobao.infoflow.protocol.subservice.base.IConfigService;
import tb.cfc;
import tb.fve;
import tb.mve;
import tb.rve;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TbHomeConfigService implements IConfigService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ORANGE_GROUP_NAME = "homepage_switch";
    private static final String TAG = "TbHomeConfigService";

    static {
        t2o.a(491782233);
        t2o.a(488636523);
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IConfigService
    public boolean getBooleanValue(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("221a66e8", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        String config = getConfig("homepage_switch", str, z + "");
        return TextUtils.isEmpty(config) ? z : Boolean.parseBoolean(config);
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IConfigService
    public String getConfig(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("611c4ee3", new Object[]{this, str, str2, str3});
        }
        if (TextUtils.equals(str, "homepage_switch")) {
            return mve.d(str2, str3);
        }
        try {
            String a2 = rve.a(str, str2, str3);
            fve.b(TAG, "groupName : " + str + " key: " + str2 + "=" + a2);
            return a2;
        } catch (InfoFlowRuntimeException e) {
            e.printStackTrace();
            return str3;
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IConfigService
    public float getFloatValue(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("341be674", new Object[]{this, str, new Float(f)})).floatValue();
        }
        try {
            return Float.parseFloat(getConfig("homepage_switch", str, f + ""));
        } catch (InfoFlowRuntimeException unused) {
            return f;
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IConfigService
    public int getIntValue(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d64674d", new Object[]{this, str, new Integer(i)})).intValue();
        }
        try {
            return Integer.parseInt(getConfig("homepage_switch", str, i + ""));
        } catch (InfoFlowRuntimeException unused) {
            return i;
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IConfigService
    public String getString(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e264abe", new Object[]{this, str, str2});
        }
        return getConfig("homepage_switch", str, str2);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }
}
