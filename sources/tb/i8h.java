package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class i8h extends av {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "LocalImageParser";

    public static /* synthetic */ Object ipc$super(i8h i8hVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/parser/LocalImageParser");
    }

    @Override // tb.av
    public Object c(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("acbcdf66", new Object[]{this, str, obj});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Context a2 = tl7.a();
        int e = e(tl7.a(), str);
        if (e == 0) {
            return null;
        }
        return a2.getDrawable(e);
    }

    public int e(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("409026f", new Object[]{this, context, str})).intValue();
        }
        if (context == null || TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return context.getResources().getIdentifier(str, zk4.CONTACTS_INFO_NOT_EMPTY_STATUS, context.getPackageName());
        } catch (Exception e) {
            Log.e(TAG, "Get layout parser exception", e);
            return 0;
        }
    }
}
