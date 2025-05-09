package com.taobao.android.weex.config;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.rrd;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WeexUnicornConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public rrd d;
    public Integer f;

    /* renamed from: a  reason: collision with root package name */
    public boolean f9924a = false;
    public RenderMode b = RenderMode.surface;
    public final HashMap<String, String> c = new HashMap<>();
    public boolean e = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum RenderMode {
        surface,
        texture,
        image,
        offscreen;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(RenderMode renderMode, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/config/WeexUnicornConfig$RenderMode");
        }

        public static RenderMode valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RenderMode) ipChange.ipc$dispatch("800f1714", new Object[]{str});
            }
            return (RenderMode) Enum.valueOf(RenderMode.class, str);
        }
    }

    static {
        t2o.a(982515865);
    }

    public Integer a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("776a9a68", new Object[]{this});
        }
        return this.f;
    }

    public HashMap<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("64c6488", new Object[]{this});
        }
        return this.c;
    }

    public RenderMode c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RenderMode) ipChange.ipc$dispatch("8700c731", new Object[]{this});
        }
        return this.b;
    }

    public rrd d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rrd) ipChange.ipc$dispatch("c4868f26", new Object[]{this});
        }
        return this.d;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("910510ae", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd045a53", new Object[]{this})).booleanValue();
        }
        return this.f9924a;
    }

    public void g(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d19dca", new Object[]{this, num});
        } else {
            this.f = num;
        }
    }

    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f8064a2", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public void i(RenderMode renderMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25776749", new Object[]{this, renderMode});
        } else {
            this.b = renderMode;
        }
    }

    public void j(rrd rrdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b051908e", new Object[]{this, rrdVar});
        } else {
            this.d = rrdVar;
        }
    }

    public void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4573e19d", new Object[]{this, new Boolean(z)});
        } else {
            this.f9924a = z;
        }
    }
}
