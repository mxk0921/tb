package com.alibaba.android.aura.taobao.adapter.extension.userMotion.model;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import tb.hxj;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UserMotionConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "UserMotionConfig";
    @JSONField(name = "page")
    public String page;
    @JSONField(name = hxj.UNIQID)
    public String uid;

    static {
        t2o.a(81789225);
    }

    public static boolean isValid(UserMotionConfig userMotionConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1629ecbb", new Object[]{userMotionConfig})).booleanValue();
        }
        if (userMotionConfig == null || TextUtils.isEmpty(userMotionConfig.uid) || TextUtils.isEmpty(userMotionConfig.page)) {
            return false;
        }
        return true;
    }
}
