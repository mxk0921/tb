package com.taobao.message.kit.util;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class Span {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int end;
    public int start;
    public String str;

    static {
        t2o.a(552599637);
    }

    public Span(String str, int i, int i2) {
        this.start = i;
        this.end = i2;
        this.str = str;
    }

    public int getEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ddee639f", new Object[]{this})).intValue();
        }
        return this.end;
    }

    public int getStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8070b926", new Object[]{this})).intValue();
        }
        return this.start;
    }

    public String getStr() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a2117ade", new Object[]{this});
        }
        return this.str;
    }
}
