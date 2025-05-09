package com.taobao.android.festival.skin;

import android.text.TextUtils;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class SkinConfig implements IMTOPDataObject {
    public String skinCode;
    public String skinUrl;
    public String skinZipUrl;
    public long updateTime;
    public int version = 1;

    static {
        t2o.a(464519230);
        t2o.a(589299906);
    }

    public SkinConfig() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SkinConfig)) {
            return false;
        }
        SkinConfig skinConfig = (SkinConfig) obj;
        if (!TextUtils.equals(this.skinCode, skinConfig.skinCode) || !TextUtils.equals(this.skinUrl, skinConfig.skinUrl) || !TextUtils.equals(this.skinZipUrl, skinConfig.skinZipUrl) || this.version != skinConfig.version) {
            return false;
        }
        return true;
    }

    public boolean isValidConfig() {
        if (TextUtils.isEmpty(this.skinCode) || TextUtils.isEmpty(this.skinUrl)) {
            return false;
        }
        return true;
    }

    public SkinConfig(String str, String str2) {
        this.skinCode = str;
        this.skinUrl = str2;
    }
}
