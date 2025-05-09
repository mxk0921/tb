package com.taobao.android.festival;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class UniversalSkinConfig implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 1;
    public String skinCode;
    public String skinUrl;
    public int version;

    static {
        t2o.a(464519180);
    }

    public UniversalSkinConfig() {
        this.version = 1;
    }

    public boolean isValidConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7baa95f", new Object[]{this})).booleanValue();
        }
        if (this.skinCode == null || this.skinUrl == null) {
            return false;
        }
        return true;
    }

    public UniversalSkinConfig(String str, String str2, int i) {
        this.skinCode = str;
        this.skinUrl = str2;
        this.version = i;
    }
}
