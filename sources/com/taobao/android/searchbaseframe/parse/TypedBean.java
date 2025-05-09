package com.taobao.android.searchbaseframe.parse;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.c;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TypedBean implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public c xsearchDowngradeInfo;
    public boolean xsearchIsDowngrade;
    @JSONField(name = "tItemType")
    public String type = "";
    public long id = -1;

    static {
        t2o.a(993001927);
    }

    public <T extends TypedBean> void copy(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("846ac49b", new Object[]{this, t});
        } else {
            t.type = this.type;
        }
    }

    public static boolean isMuise(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be4f849e", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("ms_");
    }

    public static boolean isWeex(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57c89ca0", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("nx_") || str.startsWith("wx_") || str.startsWith("lt_");
    }
}
