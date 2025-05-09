package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.dsl.Helper;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class HGuideline extends Guideline {
    public HGuideline(String str) {
        super(str);
        this.type = new Helper.HelperType(Helper.typeMap.get(Helper.Type.HORIZONTAL_GUIDELINE));
    }

    public HGuideline(String str, String str2) {
        super(str);
        this.config = str2;
        this.type = new Helper.HelperType(Helper.typeMap.get(Helper.Type.HORIZONTAL_GUIDELINE));
        this.configMap = convertConfigToMap();
    }
}
