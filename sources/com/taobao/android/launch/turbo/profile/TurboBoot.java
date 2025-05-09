package com.taobao.android.launch.turbo.profile;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.j94;
import tb.k94;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TurboBoot {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int POLICY_COPY_COMPILE = 1;
    public static final int POLICY_COPY_ONLY = 0;

    /* renamed from: a  reason: collision with root package name */
    public final k94 f8135a;
    public final Context b;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface CompilePolicy {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f8136a = 0;
        public int b = 0;
        public boolean c;
        public final String d;
        public final int e;
        public final Context f;

        static {
            t2o.a(768606236);
        }

        public b(Context context, String str, int i) {
            this.f = context;
            this.d = str;
            this.e = i;
        }

        public TurboBoot a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TurboBoot) ipChange.ipc$dispatch("5e240cb6", new Object[]{this});
            }
            return new TurboBoot(this.f, new k94(this.d, this.e, this.f8136a, this.b, this.c));
        }

        public b b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("60fdbb58", new Object[]{this, new Boolean(z)});
            }
            this.c = z;
            return this;
        }

        public b c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("2bf95ae8", new Object[]{this, new Integer(i)});
            }
            this.b = Math.max(i, 0);
            return this;
        }

        public b d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("befe9ef4", new Object[]{this, new Integer(i)});
            }
            this.f8136a = i;
            return this;
        }
    }

    static {
        t2o.a(768606234);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7074a2b1", new Object[]{this});
        } else {
            new j94().c(this.b, this.f8135a);
        }
    }

    public TurboBoot(Context context, k94 k94Var) {
        this.b = context;
        this.f8135a = k94Var;
    }
}
