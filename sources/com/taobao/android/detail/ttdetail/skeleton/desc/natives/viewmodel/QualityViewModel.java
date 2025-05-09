package com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.ComponentModel;
import java.io.Serializable;
import java.util.List;
import tb.es7;
import tb.md7;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class QualityViewModel extends md7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<String> k;
    public List<QualityContentModel> l;
    public String m;
    public String n;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class QualityContentModel implements Serializable {
        public String desc;
        public List<String> images;

        static {
            t2o.a(912262529);
        }
    }

    static {
        t2o.a(912262528);
    }

    public QualityViewModel(ComponentModel componentModel) {
        super(componentModel);
    }

    public static /* synthetic */ Object ipc$super(QualityViewModel qualityViewModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/viewmodel/QualityViewModel");
    }

    @Override // tb.md7
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea845f58", new Object[]{this})).booleanValue();
        }
        List<QualityContentModel> list = this.l;
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // tb.md7
    public es7 i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (es7) ipChange.ipc$dispatch("9f63107b", new Object[]{this});
        }
        return null;
    }

    @Override // tb.md7
    public void j(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a37e7e28", new Object[]{this, jSONObject});
            return;
        }
        if (jSONObject.containsKey("componentTitle")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("componentTitle");
            if (jSONObject2.containsKey("text")) {
                this.m = jSONObject2.getString("text");
            }
        }
        if (TextUtils.isEmpty(this.m)) {
            this.m = "品质组件";
        }
        this.n = jSONObject.getString("titleColor");
        jSONObject.getString("iconType");
        String string = jSONObject.getString("imageTags");
        if (!TextUtils.isEmpty(string)) {
            this.k = JSON.parseArray(string, String.class);
        }
        String string2 = jSONObject.getString("content");
        if (!TextUtils.isEmpty(string2)) {
            this.l = JSON.parseArray(string2, QualityContentModel.class);
        }
    }
}
