package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class sj5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_DETAILAPPVERSION = -8964819166049023094L;

    static {
        t2o.a(912261746);
    }

    public static int a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9bbef41", new Object[]{str, str2})).intValue();
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        for (int i = 0; i < split.length && i < split2.length; i++) {
            if (!split[i].equals(split2[i])) {
                return Integer.valueOf(split[i]).intValue() - Integer.valueOf(split2[i]).intValue();
            }
        }
        return split.length - split2.length;
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f467d9a7", new Object[]{str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && a(o91.b(o91.a()).trim(), str.trim()) >= 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ Object ipc$super(sj5 sj5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/dinamicx/event/DXDataParserDetailAppVersion");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (!vbl.H()) {
            return Boolean.FALSE;
        }
        if (objArr == null || objArr.length == 0) {
            return Boolean.FALSE;
        }
        for (Object obj : objArr) {
            if (b((String) obj)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
