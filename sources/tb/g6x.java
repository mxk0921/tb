package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexInstanceInternalMode;
import com.taobao.android.weex.WeexRenderType;
import com.taobao.android.weex.config.WeexInstanceConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class g6x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f19763a;
    public final long b;
    public final Context c;
    public final String d;
    public final String e;
    public WeexInstanceInternalMode f;
    public WeexRenderType g;
    public JSONObject h;
    public WeexInstanceConfig i;
    public WeexInstanceImpl j;
    public WeexInstanceImpl k;
    public int l;
    public boolean m = false;
    public tvh n = null;

    static {
        t2o.a(982515789);
    }

    public g6x(int i, long j, Context context, String str, String str2, WeexInstanceInternalMode weexInstanceInternalMode, WeexRenderType weexRenderType) {
        this.f19763a = i;
        this.b = j;
        this.c = context;
        this.d = str;
        this.e = str2;
        this.f = weexInstanceInternalMode;
        this.g = weexRenderType;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13781df6", new Object[0]);
        }
    }
}
