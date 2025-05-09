package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class vej extends px1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String f;
    public final String g;
    public final int h;

    static {
        t2o.a(782237834);
    }

    public vej(String str, String str2, int i) {
        this.f = str;
        this.g = str2;
        this.h = i;
    }

    public static /* synthetic */ Object ipc$super(vej vejVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taopai/material/request/musicunlove/MusicUnLoveParams");
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e29227e", new Object[]{this});
        }
        return this.g;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        return this.f;
    }

    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("69f8f512", new Object[]{this})).intValue();
        }
        return this.h;
    }
}
