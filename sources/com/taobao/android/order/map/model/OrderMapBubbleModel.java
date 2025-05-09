package com.taobao.android.order.map.model;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.constants.OrderBizCode;
import tb.i9v;
import tb.idl;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class OrderMapBubbleModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f9162a;
    public JSONObject b;
    public JSONObject c;
    public final JSONObject d;
    public BubbleCoordinate e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class BubbleCoordinate extends OrderMapCoordinateModel {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private float offsetX;
        private float offsetY;

        static {
            t2o.a(297795649);
        }

        public BubbleCoordinate(JSONObject jSONObject) {
            this.offsetX = 0.5f;
            this.offsetY = 1.0f;
            if (jSONObject != null) {
                try {
                    setLongitude(i9v.b(jSONObject, "longitude", vu3.b.GEO_NOT_SUPPORT));
                    setLatitude(i9v.b(jSONObject, "latitude", vu3.b.GEO_NOT_SUPPORT));
                    this.offsetX = i9v.c(jSONObject, "offsetX", this.offsetX);
                    this.offsetY = i9v.c(jSONObject, "offsetY", this.offsetY);
                } catch (Exception e) {
                    idl.d(OrderBizCode.logisticsDetail, "createBubbleCoordinateError", e.getMessage());
                }
            }
        }

        public static /* synthetic */ Object ipc$super(BubbleCoordinate bubbleCoordinate, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/map/model/OrderMapBubbleModel$BubbleCoordinate");
        }

        public float getOffsetX() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("25635ee6", new Object[]{this})).floatValue();
            }
            return this.offsetX;
        }

        public float getOffsetY() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("25717667", new Object[]{this})).floatValue();
            }
            return this.offsetY;
        }
    }

    static {
        t2o.a(297795648);
    }

    public OrderMapBubbleModel(String str, JSONObject jSONObject) {
        this.f9162a = str;
        this.d = jSONObject;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a2e0cb5", new Object[]{this});
        }
        return this.f9162a;
    }

    public BubbleCoordinate b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BubbleCoordinate) ipChange.ipc$dispatch("80c2a0ac", new Object[]{this});
        }
        BubbleCoordinate bubbleCoordinate = this.e;
        if (bubbleCoordinate == null) {
            return new BubbleCoordinate(null);
        }
        return bubbleCoordinate;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4b5e7ec", new Object[]{this});
        }
        JSONObject jSONObject = this.b;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getString("bubbleName");
    }

    public JSONObject d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("245b3440", new Object[]{this});
        }
        return this.d;
    }

    public JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("78cabc36", new Object[]{this});
        }
        return this.c;
    }

    public JSONObject f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b4e209d6", new Object[]{this});
        }
        return this.b;
    }

    public void g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b13ef00e", new Object[]{this, jSONObject});
        } else {
            this.c = jSONObject;
        }
    }

    public void h(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f811566e", new Object[]{this, jSONObject});
            return;
        }
        this.b = jSONObject;
        this.e = new BubbleCoordinate(jSONObject);
    }
}
