package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class tdj extends px1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String f;
    public final String g;
    public final int h;
    public int i;
    public final Map<String, String> j = new HashMap();

    static {
        t2o.a(782237832);
    }

    public tdj(String str, String str2, int i) {
        this.f = str;
        this.g = str2;
        this.h = i;
    }

    public static /* synthetic */ Object ipc$super(tdj tdjVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taopai/material/request/musicreport/MusicReportParams");
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
            return (String) ipChange.ipc$dispatch("5e489404", new Object[]{this});
        }
        return JSON.toJSONString(this.j);
    }

    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a805aaf4", new Object[]{this})).intValue();
        }
        return this.i;
    }

    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        return this.f;
    }

    public int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("69f8f512", new Object[]{this})).intValue();
        }
        return this.h;
    }

    public void n(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("735bbbe6", new Object[]{this, str, str2});
        } else {
            ((HashMap) this.j).put(str, str2);
        }
    }

    public void o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb868e96", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }
}
