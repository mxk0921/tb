package com.taobao.mytaobao.newsetting.business.model;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PaySettingItem implements Serializable, Comparable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean divider;
    public List<SettingsEvent> event;
    public String itemDesc;
    public String itemSubtitle;
    public String itemTitle;
    public boolean redIcon;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class SettingsEvent implements Serializable {
        public JSONObject data;
        public String track;
        public String type;
        public JSONObject userTrack;

        static {
            t2o.a(745537825);
        }

        public SettingsEvent() {
        }

        public SettingsEvent(String str, String str2, JSONObject jSONObject) {
            this(str, str2, jSONObject, null);
        }

        public SettingsEvent(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
            this.type = str;
            this.track = str2;
            this.data = jSONObject;
            this.userTrack = jSONObject2;
        }
    }

    static {
        t2o.a(745537824);
    }

    public PaySettingItem() {
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a4672d6", new Object[]{this, obj})).intValue();
        }
        return 0;
    }

    public PaySettingItem(String str, String str2, String str3, boolean z, boolean z2, List<SettingsEvent> list) {
        this.itemTitle = str;
        this.itemDesc = str3;
        this.divider = z;
        this.redIcon = z2;
        this.itemSubtitle = str2;
        this.event = list;
    }
}
