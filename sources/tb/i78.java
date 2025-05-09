package tb;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class i78 extends zmt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements InputFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(i78 i78Var) {
        }

        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CharSequence) ipChange.ipc$dispatch("cf65d449", new Object[]{this, charSequence, new Integer(i), new Integer(i2), spanned, new Integer(i3), new Integer(i4)});
            }
            if (charSequence.length() < 1) {
                return spanned.subSequence(i3, i4);
            }
            return "";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements InputFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(i78 i78Var) {
        }

        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CharSequence) ipChange.ipc$dispatch("cf65d449", new Object[]{this, charSequence, new Integer(i), new Integer(i2), spanned, new Integer(i3), new Integer(i4)});
            }
            return null;
        }
    }

    static {
        t2o.a(1039138846);
    }

    public static /* synthetic */ Object ipc$super(i78 i78Var, String str, Object... objArr) {
        if (str.hashCode() == 1625382340) {
            i78Var.j((TextView) objArr[0], (HashMap) objArr[1], (cjd) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/tmall/stylekit/render/EditTextRender");
    }

    @Override // tb.zmt, tb.qfw, tb.cik
    public void a(Object obj, String str, String str2, cjd cjdVar, String str3) {
        EditText editText;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d46ca812", new Object[]{this, obj, str, str2, cjdVar, str3});
        } else if ((obj instanceof EditText) && (editText = (EditText) obj) != null) {
            String str4 = ntq.i().k(str3).get(str2);
            if (!TextUtils.isEmpty(str4)) {
                str2 = str4;
            }
            HashMap<String, Object> hashMap = ntq.i().g(str, str3).get(str2);
            if (hashMap != null && hashMap.size() != 0) {
                p(editText, hashMap, cjdVar);
            }
        }
    }

    public void p(EditText editText, HashMap<String, Object> hashMap, cjd cjdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d0d3a7f", new Object[]{this, editText, hashMap, cjdVar});
        } else if (editText != null && hashMap != null && hashMap.size() != 0) {
            if (cjdVar != null) {
                cjdVar.c(editText);
            }
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                String valueOf = String.valueOf(entry.getKey());
                if (!TextUtils.isEmpty(valueOf)) {
                    Object value = entry.getValue();
                    try {
                        int a2 = cdw.a(valueOf);
                        if (a2 == 10352) {
                            editText.setInputType(129);
                        } else if (a2 == 10354) {
                            q(editText, Boolean.parseBoolean(value.toString()));
                        }
                    } catch (Throwable th) {
                        mgh.b(th);
                    }
                } else {
                    return;
                }
            }
            j(editText, hashMap, null);
            if (cjdVar != null) {
                cjdVar.a(editText);
            }
        }
    }

    public final void q(EditText editText, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e8f67a2", new Object[]{this, editText, new Boolean(z)});
        } else if (z) {
            editText.setFilters(new InputFilter[]{new a(this)});
        } else {
            editText.setFilters(new InputFilter[]{new b(this)});
        }
    }
}
