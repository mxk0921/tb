package androidx.constraintlayout.core.dsl;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Keys {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public void append(StringBuilder sb, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f847f58f", new Object[]{this, sb, str, new Integer(i)});
        } else if (i != Integer.MIN_VALUE) {
            sb.append(str);
            sb.append(":'");
            sb.append(i);
            sb.append("',\n");
        }
    }

    public String unpack(String[] strArr) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5971a09a", new Object[]{this, strArr});
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < strArr.length; i++) {
            if (i == 0) {
                str = "'";
            } else {
                str = ",'";
            }
            sb.append(str);
            sb.append(strArr[i]);
            sb.append("'");
        }
        sb.append("]");
        return sb.toString();
    }

    public void append(StringBuilder sb, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5f990be", new Object[]{this, sb, str, str2});
        } else if (str2 != null) {
            sb.append(str);
            sb.append(":'");
            sb.append(str2);
            sb.append("',\n");
        }
    }

    public void append(StringBuilder sb, String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f847ea4c", new Object[]{this, sb, str, new Float(f)});
        } else if (!Float.isNaN(f)) {
            sb.append(str);
            sb.append(":");
            sb.append(f);
            sb.append(",\n");
        }
    }

    public void append(StringBuilder sb, String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bc7bcab", new Object[]{this, sb, str, strArr});
        } else if (strArr != null) {
            sb.append(str);
            sb.append(":");
            sb.append(unpack(strArr));
            sb.append(",\n");
        }
    }

    public void append(StringBuilder sb, String str, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10bf52bf", new Object[]{this, sb, str, fArr});
        } else if (fArr != null) {
            sb.append(str);
            sb.append("percentWidth:");
            sb.append(Arrays.toString(fArr));
            sb.append(",\n");
        }
    }
}
