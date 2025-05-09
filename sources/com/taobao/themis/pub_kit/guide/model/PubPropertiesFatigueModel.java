package com.taobao.themis.pub_kit.guide.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import tb.t2o;
import tb.x96;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/taobao/themis/pub_kit/guide/model/PubPropertiesFatigueModel;", "Ljava/io/Serializable;", "()V", "fatigueCountValue", "", "getFatigueCountValue", "()Ljava/lang/String;", "setFatigueCountValue", "(Ljava/lang/String;)V", "fatigueDayValue", "getFatigueDayValue", "setFatigueDayValue", x96.REFRESH_TYPE_RANGE, "", "getRange", "()Ljava/util/List;", "setRange", "(Ljava/util/List;)V", "themis_pub_kit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class PubPropertiesFatigueModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String fatigueCountValue;
    private String fatigueDayValue;
    private List<String> range;

    static {
        t2o.a(845152327);
    }

    public final String getFatigueCountValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9960cdc6", new Object[]{this});
        }
        return this.fatigueCountValue;
    }

    public final String getFatigueDayValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e4acb9d3", new Object[]{this});
        }
        return this.fatigueDayValue;
    }

    public final List<String> getRange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("65879bf9", new Object[]{this});
        }
        return this.range;
    }

    public final void setFatigueCountValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9037f2d8", new Object[]{this, str});
        } else {
            this.fatigueCountValue = str;
        }
    }

    public final void setFatigueDayValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b12556b", new Object[]{this, str});
        } else {
            this.fatigueDayValue = str;
        }
    }

    public final void setRange(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ff251f3", new Object[]{this, list});
        } else {
            this.range = list;
        }
    }
}
