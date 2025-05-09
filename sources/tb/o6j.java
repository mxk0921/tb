package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.util.ErrorConstant;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class o6j extends ow {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final List k = Arrays.asList(ErrorConstant.ERRCODE_NO_NETWORK, "ANDROID_SYS_NETWORK_ERROR");
    public final IMTOPDataObject h;
    public final Class<?> i;
    public final Map<String, String> j;

    static {
        t2o.a(1018167346);
    }

    public o6j(String str, jsj jsjVar, IMTOPDataObject iMTOPDataObject, Class<?> cls) {
        this(str, jsjVar, iMTOPDataObject, null, cls);
    }

    public static /* synthetic */ Object ipc$super(o6j o6jVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/alimama/net/core/task/MtopRequestTask");
    }

    @Override // tb.ow
    public boolean i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("583a1653", new Object[]{this, str})).booleanValue();
        }
        return "SUCCESS".equals(str);
    }

    @Override // tb.ow
    public boolean j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a244169", new Object[]{this, str})).booleanValue();
        }
        return k.contains(str);
    }

    public Map<String, String> m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8093f2fc", new Object[]{this});
        }
        return this.j;
    }

    public IMTOPDataObject n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMTOPDataObject) ipChange.ipc$dispatch("58146297", new Object[]{this});
        }
        return this.h;
    }

    public Class<?> o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("57a5feb5", new Object[]{this});
        }
        return this.i;
    }

    public o6j(String str, jsj jsjVar, IMTOPDataObject iMTOPDataObject, Class<?> cls, Map<String, String> map, String str2) {
        this(str, jsjVar, iMTOPDataObject, null, cls, map, str2);
    }

    public o6j(String str, jsj jsjVar, IMTOPDataObject iMTOPDataObject, Map<String, String> map, Class<?> cls) {
        this(str, jsjVar, iMTOPDataObject, map, cls, new HashMap(), "NONE");
    }

    public o6j(String str, jsj jsjVar, IMTOPDataObject iMTOPDataObject, Map<String, String> map, Class<?> cls, Map<String, String> map2, String str2) {
        super(str, jsjVar, map2, str2);
        this.h = iMTOPDataObject;
        this.i = cls;
        this.j = map;
    }
}
