package com.taobao.android.litecreator.base.data;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class UGCLabel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DIR_LEFT = 0;
    public static final int DIR_RIGHT = 1;
    public static final int TYPE_TEXT = 0;
    public float posX;
    public float posY;
    public String tagName;
    public int type = 0;
    public int direction = 0;

    static {
        t2o.a(511705125);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "UGCLabel{type=" + this.type + ", direction=" + this.direction + ", tagName='" + this.tagName + "', posX=" + this.posX + ", posY=" + this.posY + '}';
    }
}
