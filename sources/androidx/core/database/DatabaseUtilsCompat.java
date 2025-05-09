package androidx.core.database;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.f7l;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class DatabaseUtilsCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private DatabaseUtilsCompat() {
    }

    @Deprecated
    public static String concatenateWhere(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("646e10f3", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return f7l.BRACKET_START_STR + str + ") AND (" + str2 + f7l.BRACKET_END_STR;
    }

    @Deprecated
    public static String[] appendSelectionArgs(String[] strArr, String[] strArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("f91c3805", new Object[]{strArr, strArr2});
        }
        if (strArr == null || strArr.length == 0) {
            return strArr2;
        }
        String[] strArr3 = new String[strArr.length + strArr2.length];
        System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
        System.arraycopy(strArr2, 0, strArr3, strArr.length, strArr2.length);
        return strArr3;
    }
}
