package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class d02<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CODE_EMPTY = -2;
    public static final int CODE_INVAILD = -5;
    public static final int CODE_MD5 = -3;
    public static final int CODE_PRASE = -4;
    public static final int CODE_UNKNOW = -1;
    public static final int CODE_UTDIDISNULL = -6;
    public String b;

    /* renamed from: a  reason: collision with root package name */
    public int f17483a = -1;
    public int c = 200;

    static {
        t2o.a(613417099);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa4e0476", new Object[]{this});
        }
        return String.valueOf(this.f17483a);
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("58026b05", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8c32fc8", new Object[]{this});
        }
        return this.b;
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15beaf4d", new Object[]{this, new Integer(i)});
        } else {
            this.f17483a = i;
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56a65216", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }
}
