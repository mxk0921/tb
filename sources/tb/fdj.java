package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class fdj extends px1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int f = 20;
    public final int g;

    static {
        t2o.a(782237828);
    }

    public fdj(int i) {
        this.g = i;
    }

    public static /* synthetic */ Object ipc$super(fdj fdjVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taopai/material/request/musiclovelist/MusicLoveListParams");
    }

    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("320a6920", new Object[]{this})).intValue();
        }
        return this.g;
    }

    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2822d620", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f0ec8ea", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }
}
