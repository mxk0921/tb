package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Random;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class mq1 implements x80 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f24228a = uk7.i().f();
    public final int b;
    public final String c;
    public final int d;

    static {
        t2o.a(615514184);
        t2o.a(615514189);
    }

    public mq1(int i, String str, int i2) {
        this.b = i;
        this.c = str;
        this.d = i2;
    }

    @Override // tb.x80
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da2cfb3c", new Object[]{this})).booleanValue();
        }
        if (new Random().nextInt(10000) < this.d) {
            return true;
        }
        return false;
    }

    @Override // tb.x80
    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc49b803", new Object[]{this})).intValue();
        }
        return this.b;
    }
}
