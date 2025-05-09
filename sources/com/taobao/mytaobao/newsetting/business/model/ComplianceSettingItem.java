package com.taobao.mytaobao.newsetting.business.model;

import android.graphics.Color;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ComplianceSettingItem implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_TEXT_COLOR = "#597CAA";
    public static final String DEFAULT_TEXT_SIZE = "3";
    public static final String KEY_TEXT_COLOR = "textColor";
    public static final String KEY_TEXT_SIZE = "textSize";
    private static final long serialVersionUID = 2316668778968363883L;
    public String navUrl;
    public String text;
    public String textColor;
    public String textSize;
    public JSONObject userTrack;

    static {
        t2o.a(745537822);
    }

    public ComplianceSettingItem() {
    }

    public int parseTextColor() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3337f7bd", new Object[]{this})).intValue();
        }
        try {
            i = Color.parseColor(this.textColor);
        } catch (Exception unused) {
            i = -1;
        }
        if (i == -1) {
            return Color.parseColor(DEFAULT_TEXT_COLOR);
        }
        return i;
    }

    public int parseTextSize() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("82d6a29b", new Object[]{this})).intValue();
        }
        try {
            i = Integer.parseInt(this.textSize);
        } catch (Exception unused) {
        }
        if (i == 0) {
            return Integer.parseInt("3");
        }
        return i;
    }

    public void processDefaultValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("213b5cc6", new Object[]{this});
            return;
        }
        String str = this.text;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        this.text = str;
        String str3 = this.navUrl;
        if (str3 != null) {
            str2 = str3;
        }
        this.navUrl = str2;
        String str4 = this.textColor;
        if (str4 == null) {
            str4 = DEFAULT_TEXT_COLOR;
        }
        this.textColor = str4;
        String str5 = this.textSize;
        if (str5 == null) {
            str5 = "3";
        }
        this.textSize = str5;
    }

    public ComplianceSettingItem(String str, String str2) {
        this.text = str;
        this.navUrl = str2;
    }
}
