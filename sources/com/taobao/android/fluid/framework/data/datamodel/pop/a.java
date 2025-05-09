package com.taobao.android.fluid.framework.data.datamodel.pop;

import android.content.Context;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.framework.data.datamodel.pop.PopPositionData;
import tb.jxv;
import tb.sz3;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final float f7802a;
    public final float b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public boolean g;
    public int h;

    static {
        t2o.a(468714216);
    }

    public a(PopPositionData popPositionData) {
        JSONArray jSONArray;
        if (popPositionData != null) {
            Context context = FluidSDK.getContext();
            PopPositionData.PositionData positionData = popPositionData.data;
            if (positionData != null) {
                this.c = jxv.b(context, positionData.x);
                this.d = jxv.b(context, positionData.y);
                this.e = jxv.b(context, positionData.h);
                this.f = jxv.b(context, positionData.w);
                JSONObject jSONObject = positionData.animations;
                if (jSONObject != null && !sz3.b(jSONObject) && (jSONArray = positionData.animations.getJSONArray("translationY")) != null) {
                    this.f7802a = jxv.b(context, jSONArray.getFloatValue(0));
                    this.b = jxv.b(context, jSONArray.getFloatValue(1));
                }
            }
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PopPosition{startY=" + this.f7802a + ", endY=" + this.b + ", x=" + this.c + ", y=" + this.d + ", height=" + this.e + ", width=" + this.f + '}';
    }

    public a(float f, float f2, int i, int i2, int i3, int i4) {
        this.f7802a = f;
        this.b = f2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }
}
