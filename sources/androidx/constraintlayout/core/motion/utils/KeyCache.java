package androidx.constraintlayout.core.motion.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class KeyCache {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public HashMap<Object, HashMap<String, float[]>> mMap = new HashMap<>();

    public float getFloatValue(Object obj, String str, int i) {
        HashMap<String, float[]> hashMap;
        float[] fArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b1bbe4db", new Object[]{this, obj, str, new Integer(i)})).floatValue();
        }
        if (this.mMap.containsKey(obj) && (hashMap = this.mMap.get(obj)) != null && hashMap.containsKey(str) && (fArr = hashMap.get(str)) != null && fArr.length > i) {
            return fArr[i];
        }
        return Float.NaN;
    }

    public void setFloatValue(Object obj, String str, int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75b51f41", new Object[]{this, obj, str, new Integer(i), new Float(f)});
        } else if (!this.mMap.containsKey(obj)) {
            HashMap<String, float[]> hashMap = new HashMap<>();
            float[] fArr = new float[1 + i];
            fArr[i] = f;
            hashMap.put(str, fArr);
            this.mMap.put(obj, hashMap);
        } else {
            HashMap<String, float[]> hashMap2 = this.mMap.get(obj);
            if (hashMap2 == null) {
                hashMap2 = new HashMap<>();
            }
            if (!hashMap2.containsKey(str)) {
                float[] fArr2 = new float[1 + i];
                fArr2[i] = f;
                hashMap2.put(str, fArr2);
                this.mMap.put(obj, hashMap2);
                return;
            }
            float[] fArr3 = hashMap2.get(str);
            if (fArr3 == null) {
                fArr3 = new float[0];
            }
            if (fArr3.length <= i) {
                fArr3 = Arrays.copyOf(fArr3, 1 + i);
            }
            fArr3[i] = f;
            hashMap2.put(str, fArr3);
        }
    }
}
