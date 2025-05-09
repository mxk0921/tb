package com.taobao.orange.model;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.a;
import com.taobao.orange.util.OLog;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class CustomConfigDO extends ConfigDO {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "content")
    public String stringContent;

    static {
        t2o.a(613417086);
    }

    public static /* synthetic */ Object ipc$super(CustomConfigDO customConfigDO, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/orange/model/CustomConfigDO");
    }

    @Override // com.taobao.orange.model.ConfigDO, tb.dq3
    public boolean checkValid() {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b6d1a5f", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.appKey) || TextUtils.isEmpty(this.appVersion) || TextUtils.isEmpty(this.id) || TextUtils.isEmpty(this.name) || TextUtils.isEmpty(this.resourceId) || TextUtils.isEmpty(this.type) || TextUtils.isEmpty(this.loadLevel) || TextUtils.isEmpty(this.stringContent) || TextUtils.isEmpty(this.version)) {
            OLog.w(ConfigDO.TAG, "lack param", new Object[0]);
            return false;
        }
        if ((!this.appVersion.equals("*") && !this.appVersion.equals(a.j)) || !this.appKey.equals(a.h)) {
            z = false;
        }
        if (!z) {
            OLog.w(ConfigDO.TAG, "invaild", new Object[0]);
        }
        return z;
    }
}
