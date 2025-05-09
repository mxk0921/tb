package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ddj extends px1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final int f;
    public int g;
    public final int h;
    public final String i;

    static {
        t2o.a(782237824);
    }

    public ddj(String str, int i, int i2) {
        this.g = 20;
        this.b = str;
        this.f = i;
        this.h = i2;
    }

    public static /* synthetic */ Object ipc$super(ddj ddjVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taopai/material/request/musiclist/MusicListParams");
    }

    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7a4824ee", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("320a6920", new Object[]{this})).intValue();
        }
        return this.h;
    }

    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2822d620", new Object[]{this})).intValue();
        }
        return this.g;
    }

    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4e7f71b5", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.i)) {
            return "";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("KEYWORD", this.i);
        return JSON.toJSONString(hashMap);
    }

    public void m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f0ec8ea", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "{category=" + this.f + ", pageSize=" + this.g + ", pageNo=" + this.h + ", searchKey='" + this.i + "', mergeCategories='null', bizLine='" + this.f26370a + "', bizScene='" + this.b + "', clientVer=" + this.c + '}';
    }

    public ddj(int i, int i2) {
        this.g = 20;
        this.f = i;
        this.h = i2;
    }

    public ddj(int i, int i2, int i3, String str) {
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = str;
    }
}
