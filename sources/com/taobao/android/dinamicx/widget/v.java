package com.taobao.android.dinamicx.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.z;
import java.util.ArrayList;
import tb.ch3;
import tb.pb6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends Drawable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(v vVar) {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/ImageSpanGenerator$1");
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            }
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2242c5cf", new Object[]{this})).intValue();
            }
            return 0;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
            }
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65fee558", new Object[]{this, colorFilter});
            }
        }
    }

    public z.e a(z zVar, JSONObject jSONObject, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z.e) ipChange.ipc$dispatch("7fb8abf1", new Object[]{this, zVar, jSONObject, str, str2, new Boolean(z)});
        }
        z.e eVar = new z.e();
        int length = str.length() - str2.length();
        eVar.f7540a = length;
        eVar.b = length + str2.length();
        a aVar = new a(this);
        float d = d(zVar, jSONObject, z);
        float b = b(jSONObject, str2);
        aVar.setBounds(0, 0, (int) (d * b), (int) d);
        ((ArrayList) eVar.d).add(new ch3(aVar, d));
        zVar.B(str2, eVar, b, d);
        return eVar;
    }

    public final float b(JSONObject jSONObject, String str) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d8ecbace", new Object[]{this, jSONObject, str})).floatValue();
        }
        if (jSONObject == null) {
            return 0.0f;
        }
        try {
            f = Float.parseFloat(jSONObject.getString("ratio"));
        } catch (Throwable unused) {
            f = 0.0f;
        }
        return f == 0.0f ? c(str) : f;
    }

    public final float c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a3ee43d1", new Object[]{this, str})).floatValue();
        }
        if (str == null) {
            return 0.0f;
        }
        if (str.contains(".png")) {
            str = str.substring(0, str.indexOf(".png"));
        } else if (str.contains(".jpg")) {
            str = str.substring(0, str.indexOf(".jpg"));
        }
        String[] split = str.split("-");
        if (split.length > 2) {
            String str2 = split[split.length - 2];
            String str3 = split[split.length - 1];
            if (!(str2 == null || str3 == null)) {
                try {
                    return Float.parseFloat(str2) / Float.parseFloat(str3);
                } catch (Throwable unused) {
                }
            }
        }
        return 0.0f;
    }

    public final float d(z zVar, JSONObject jSONObject, boolean z) {
        int f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f525aba5", new Object[]{this, zVar, jSONObject, new Boolean(z)})).floatValue();
        }
        float textSize = zVar != null ? zVar.getTextSize() : 0.0f;
        if (jSONObject == null) {
            return textSize;
        }
        String string = jSONObject.getString("size");
        try {
            if (z) {
                f = pb6.d(zVar.getEngine(), zVar.getDXRuntimeContext().h(), Float.parseFloat(string));
            } else {
                f = pb6.f(zVar.getDXRuntimeContext().h(), Float.parseFloat(string));
            }
            textSize = f;
            return textSize;
        } catch (Throwable unused) {
            return textSize;
        }
    }
}
