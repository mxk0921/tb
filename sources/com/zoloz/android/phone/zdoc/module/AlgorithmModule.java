package com.zoloz.android.phone.zdoc.module;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class AlgorithmModule implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int blur = 80;
    private int exposure = 20;
    private int card_detect_score = 80;
    private int algoType = -1;

    static {
        t2o.a(245366955);
    }

    public int getAlgoType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8a6e949d", new Object[]{this})).intValue();
        }
        return this.algoType;
    }

    public int getBlur() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f3166d7", new Object[]{this})).intValue();
        }
        return this.blur;
    }

    public int getCard_detect_score() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("972ed709", new Object[]{this})).intValue();
        }
        return this.card_detect_score;
    }

    public int getExposure() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe97b877", new Object[]{this})).intValue();
        }
        return this.exposure;
    }

    public void setAlgoType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("563ada0d", new Object[]{this, new Integer(i)});
        } else {
            this.algoType = i;
        }
    }

    public void setBlur(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e34fa913", new Object[]{this, new Integer(i)});
        } else {
            this.blur = i;
        }
    }

    public void setCard_detect_score(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80f01ab9", new Object[]{this, new Integer(i)});
        } else {
            this.card_detect_score = i;
        }
    }

    public void setExposure(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67363173", new Object[]{this, new Integer(i)});
        } else {
            this.exposure = i;
        }
    }
}
