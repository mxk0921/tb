package com.taobao.android.tbtheme.kit;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ThemeData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String actionBarBackgroundColor;
    public String actionBarBackgroundImage;
    public String actionbarTextColor;
    public boolean ignoreImageColor;
    public String isComplexTexture;
    public String naviStyle;
    public String skinColor;
    public String skinPendant;
    public String skinPic;
    public String statusBarStyle;
    public String themeLevel = "3";

    static {
        t2o.a(464519257);
    }

    private boolean isUseCustomTheme(ThemeData themeData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c28e922", new Object[]{this, themeData})).booleanValue();
        }
        if (themeData == null) {
            return false;
        }
        if (TextUtils.isEmpty(themeData.themeLevel)) {
            return true;
        }
        try {
            if (Integer.parseInt(themeData.themeLevel) >= Integer.parseInt(this.themeLevel)) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ThemeData themeData = (ThemeData) obj;
        if (!TextUtils.equals(this.actionbarTextColor, themeData.actionbarTextColor) || !TextUtils.equals(this.actionBarBackgroundColor, themeData.actionBarBackgroundColor) || !TextUtils.equals(this.actionBarBackgroundImage, themeData.actionBarBackgroundImage) || !TextUtils.equals(this.skinPic, themeData.skinPic) || !TextUtils.equals(this.skinColor, themeData.skinColor) || !TextUtils.equals(this.statusBarStyle, themeData.statusBarStyle) || !TextUtils.equals(this.naviStyle, themeData.naviStyle) || !TextUtils.equals(this.isComplexTexture, themeData.isComplexTexture) || this.ignoreImageColor != themeData.ignoreImageColor || !TextUtils.equals(this.themeLevel, themeData.themeLevel)) {
            return false;
        }
        return true;
    }

    public String getActionbarTextColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6a8737ca", new Object[]{this});
        }
        return this.actionbarTextColor;
    }

    public String getThemeColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("709e81e9", new Object[]{this});
        }
        return this.skinColor;
    }

    public String getThemePic() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3609aee2", new Object[]{this});
        }
        return this.skinPic;
    }

    public void mergeData(ThemeData themeData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e38f4045", new Object[]{this, themeData});
        } else if (themeData != null && isUseCustomTheme(themeData)) {
            String str = themeData.actionbarTextColor;
            if (str == null) {
                str = this.actionbarTextColor;
            }
            this.actionbarTextColor = str;
            String str2 = themeData.actionBarBackgroundImage;
            if (str2 == null) {
                str2 = this.actionBarBackgroundImage;
            }
            this.actionBarBackgroundImage = str2;
            String str3 = themeData.actionBarBackgroundColor;
            if (str3 == null) {
                str3 = this.actionBarBackgroundColor;
            }
            this.actionBarBackgroundColor = str3;
            String str4 = themeData.skinColor;
            if (str4 == null) {
                str4 = this.skinColor;
            }
            this.skinColor = str4;
            String str5 = themeData.skinPic;
            if (str5 == null) {
                str5 = this.skinPic;
            }
            this.skinPic = str5;
            this.skinPendant = themeData.skinPendant;
            String str6 = themeData.statusBarStyle;
            if (str6 == null) {
                str6 = this.statusBarStyle;
            }
            this.statusBarStyle = str6;
            String str7 = themeData.naviStyle;
            if (str7 == null) {
                str7 = this.naviStyle;
            }
            this.naviStyle = str7;
            String str8 = themeData.isComplexTexture;
            if (str8 == null) {
                str8 = this.isComplexTexture;
            }
            this.isComplexTexture = str8;
            this.ignoreImageColor = themeData.ignoreImageColor;
            this.themeLevel = themeData.themeLevel;
        }
    }

    public ThemeData clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThemeData) ipChange.ipc$dispatch("3f34876e", new Object[]{this});
        }
        ThemeData themeData = new ThemeData();
        themeData.skinColor = this.skinColor;
        themeData.skinPic = this.skinPic;
        themeData.skinPendant = this.skinPendant;
        themeData.actionBarBackgroundColor = this.actionBarBackgroundColor;
        themeData.actionBarBackgroundImage = this.actionBarBackgroundImage;
        themeData.actionbarTextColor = this.actionbarTextColor;
        themeData.naviStyle = this.naviStyle;
        themeData.statusBarStyle = this.statusBarStyle;
        themeData.isComplexTexture = this.isComplexTexture;
        themeData.ignoreImageColor = this.ignoreImageColor;
        themeData.themeLevel = this.themeLevel;
        return themeData;
    }
}
