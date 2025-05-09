package tb;

import android.text.InputFilter;
import android.text.TextUtils;
import android.widget.EditText;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class yn7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_TEXT_HINT_COLOR = -16777216;
    public static final int INPUT_TYPE_NORMAL = 0;
    public static final int INPUT_TYPE_NUMBER = 1;
    public static final int INPUT_TYPE_PASSWORD = 3;
    public static final int INPUT_TYPE_PHONE = 2;

    static {
        t2o.a(155189297);
    }

    public static void a(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7c96b39", new Object[]{editText, str});
        } else if (editText != null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            editText.setHint(str);
        }
    }

    public static void b(EditText editText, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cce46c5", new Object[]{editText, new Integer(i)});
        } else if (editText != null) {
            editText.setHintTextColor(i);
        }
    }

    public static void c(EditText editText, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d862b4e", new Object[]{editText, new Integer(i)});
        } else if (editText != null) {
            if (i == 0) {
                editText.setInputType(1);
            } else if (i == 1) {
                editText.setInputType(2);
            } else if (i == 2) {
                editText.setInputType(3);
            } else if (i != 3) {
                editText.setInputType(1);
            } else {
                editText.setInputType(128);
            }
        }
    }

    public static void d(EditText editText, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8381e93", new Object[]{editText, new Integer(i)});
        } else if (editText != null) {
            if (i <= 0) {
                editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Integer.MAX_VALUE)});
            } else {
                editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
            }
        }
    }

    public static void e(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27083bd3", new Object[]{editText, str});
        } else if (editText != null) {
            editText.setText(str);
        }
    }
}
