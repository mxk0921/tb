package androidx.constraintlayout.core.dsl;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Ref {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String mId;
    private float mPostMargin;
    private float mPreMargin;
    private float mWeight;

    public Ref(String str) {
        this.mWeight = Float.NaN;
        this.mPreMargin = Float.NaN;
        this.mPostMargin = Float.NaN;
        this.mId = str;
    }

    public static float parseFloat(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c8c56b3c", new Object[]{obj})).floatValue();
        }
        try {
            return Float.parseFloat(obj.toString());
        } catch (Exception unused) {
            return Float.NaN;
        }
    }

    public static Ref parseStringToRef(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Ref) ipChange.ipc$dispatch("223c5c0d", new Object[]{str});
        }
        String[] split = str.replaceAll("[\\[\\]\\']", "").split(",");
        if (split.length == 0) {
            return null;
        }
        Object[] objArr = new Object[4];
        for (int i = 0; i < split.length && i < 4; i++) {
            objArr[i] = split[i];
        }
        return new Ref(objArr[0].toString().replace("'", ""), parseFloat(objArr[1]), parseFloat(objArr[2]), parseFloat(objArr[3]));
    }

    public String getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        return this.mId;
    }

    public float getPostMargin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("31b7cdb", new Object[]{this})).floatValue();
        }
        return this.mPostMargin;
    }

    public float getPreMargin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2e461e72", new Object[]{this})).floatValue();
        }
        return this.mPreMargin;
    }

    public float getWeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("975182e5", new Object[]{this})).floatValue();
        }
        return this.mWeight;
    }

    public void setId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb80bee", new Object[]{this, str});
        } else {
            this.mId = str;
        }
    }

    public void setPostMargin(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("972b21a9", new Object[]{this, new Float(f)});
        } else {
            this.mPostMargin = f;
        }
    }

    public void setPreMargin(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6274818a", new Object[]{this, new Float(f)});
        } else {
            this.mPreMargin = f;
        }
    }

    public void setWeight(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e944b6df", new Object[]{this, new Float(f)});
        } else {
            this.mWeight = f;
        }
    }

    public String toString() {
        float f;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        String str = this.mId;
        if (str == null || str.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (!Float.isNaN(this.mWeight) || !Float.isNaN(this.mPreMargin) || !Float.isNaN(this.mPostMargin)) {
            z = true;
        }
        if (z) {
            sb.append("[");
        }
        sb.append("'");
        sb.append(this.mId);
        sb.append("'");
        float f2 = 0.0f;
        if (!Float.isNaN(this.mPostMargin)) {
            sb.append(",");
            if (!Float.isNaN(this.mWeight)) {
                f = this.mWeight;
            } else {
                f = 0.0f;
            }
            sb.append(f);
            sb.append(",");
            if (!Float.isNaN(this.mPreMargin)) {
                f2 = this.mPreMargin;
            }
            sb.append(f2);
            sb.append(",");
            sb.append(this.mPostMargin);
        } else if (!Float.isNaN(this.mPreMargin)) {
            sb.append(",");
            if (!Float.isNaN(this.mWeight)) {
                f2 = this.mWeight;
            }
            sb.append(f2);
            sb.append(",");
            sb.append(this.mPreMargin);
        } else if (!Float.isNaN(this.mWeight)) {
            sb.append(",");
            sb.append(this.mWeight);
        }
        if (z) {
            sb.append("]");
        }
        sb.append(",");
        return sb.toString();
    }

    public static void addStringToReferences(String str, ArrayList<Ref> arrayList) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d81ae004", new Object[]{str, arrayList});
        } else if (str != null && str.length() != 0) {
            Object[] objArr = new Object[4];
            StringBuilder sb = new StringBuilder();
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < str.length(); i3++) {
                char charAt = str.charAt(i3);
                if (!(charAt == ' ' || charAt == '\'')) {
                    if (charAt == ',') {
                        if (i < 3) {
                            i++;
                            objArr[i] = sb.toString();
                            sb.setLength(0);
                        }
                        if (i2 == 1 && (obj = objArr[0]) != null) {
                            arrayList.add(new Ref(obj.toString()));
                            objArr[0] = null;
                            i = 0;
                        }
                    } else if (charAt == '[') {
                        i2++;
                    } else if (charAt != ']') {
                        sb.append(charAt);
                    } else if (i2 > 0) {
                        i2--;
                        objArr[i] = sb.toString();
                        sb.setLength(0);
                        Object obj2 = objArr[0];
                        if (obj2 != null) {
                            arrayList.add(new Ref(obj2.toString(), parseFloat(objArr[1]), parseFloat(objArr[2]), parseFloat(objArr[3])));
                            Arrays.fill(objArr, (Object) null);
                            i = 0;
                        }
                    }
                }
            }
        }
    }

    public Ref(String str, float f) {
        this.mPreMargin = Float.NaN;
        this.mPostMargin = Float.NaN;
        this.mId = str;
        this.mWeight = f;
    }

    public Ref(String str, float f, float f2) {
        this.mPostMargin = Float.NaN;
        this.mId = str;
        this.mWeight = f;
        this.mPreMargin = f2;
    }

    public Ref(String str, float f, float f2, float f3) {
        this.mId = str;
        this.mWeight = f;
        this.mPreMargin = f2;
        this.mPostMargin = f3;
    }
}
