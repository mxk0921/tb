package com.taobao.android.live.plugin.atype.flexalocal.good.view.itemgroup;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ItemGroupPageInfo implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String closeAction;
    public JSONObject data;
    public String goodsTips;
    public String id;
    public String source;
    public String title;
    public String topButton;
    public String type;

    static {
        t2o.a(295699295);
        t2o.a(806355930);
    }

    public boolean checkInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a75a361", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.title) || TextUtils.isEmpty(this.id) || TextUtils.isEmpty(this.type)) {
            return false;
        }
        return true;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ItemGroupPageInfo{title='" + this.title + "',closeAction=" + this.closeAction + "', id='" + this.id + "', type='" + this.type + "', topButton='" + this.topButton + "', source='" + this.source + "', data=" + this.data + '}';
    }
}
