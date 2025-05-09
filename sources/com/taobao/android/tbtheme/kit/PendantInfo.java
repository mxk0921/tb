package com.taobao.android.tbtheme.kit;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class PendantInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float heightPercent;
    private float horizontalBias;
    private String url;
    private float verticalBias;
    private float weightPercent;

    static {
        t2o.a(464519252);
    }

    public float getHeightPercent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("efb96ddf", new Object[]{this})).floatValue();
        }
        return this.heightPercent;
    }

    public float getHorizontalBias() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4dd190ea", new Object[]{this})).floatValue();
        }
        return this.horizontalBias;
    }

    public String getUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.url;
    }

    public float getVerticalBias() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc34ffbc", new Object[]{this})).floatValue();
        }
        return this.verticalBias;
    }

    public float getWeightPercent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9ad6fee", new Object[]{this})).floatValue();
        }
        return this.weightPercent;
    }

    public void setHeightPercent(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ea039bd", new Object[]{this, new Float(f)});
        } else {
            this.heightPercent = f;
        }
    }

    public void setHorizontalBias(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baa5b57a", new Object[]{this, new Float(f)});
        } else {
            this.horizontalBias = f;
        }
    }

    public void setUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
        } else {
            this.url = str;
        }
    }

    public void setVerticalBias(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6016de8", new Object[]{this, new Float(f)});
        } else {
            this.verticalBias = f;
        }
    }

    public void setWeightPercent(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("232c798e", new Object[]{this, new Float(f)});
        } else {
            this.weightPercent = f;
        }
    }
}
