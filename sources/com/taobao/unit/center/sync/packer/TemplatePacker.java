package com.taobao.unit.center.sync.packer;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import org.json.JSONObject;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"Lcom/taobao/unit/center/sync/packer/TemplatePacker;", "", "()V", "getLayoutStyle", "", "layout", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TemplatePacker {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TemplatePacker INSTANCE = new TemplatePacker();

    static {
        t2o.a(552599812);
    }

    private TemplatePacker() {
    }

    public final String getLayoutStyle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77f51d9e", new Object[]{this, str});
        }
        ckf.h(str, "layout");
        if (TextUtils.isEmpty(str)) {
            return "bubble";
        }
        try {
            String optString = new JSONObject(str).optString("layoutStyle");
            if (!TextUtils.equals("bubble", optString)) {
                if (TextUtils.equals("card", optString)) {
                    return "card";
                }
            }
            return "bubble";
        } catch (Exception e) {
            e.printStackTrace();
            return "bubble";
        }
    }
}
